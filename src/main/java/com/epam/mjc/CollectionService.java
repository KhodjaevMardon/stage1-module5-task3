package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(o -> o % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .map(o -> o.stream().min(Integer::compareTo))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .min(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(Integer::sum).get();
    }
}
