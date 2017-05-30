package com.main.java.bsu.secondsevenlab;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by irisha on 13.04.2017.
 */
public class SortingString {
    private static final String txt = "Привет !\n" +
            "Рассортировать слова текста по возрастанию доли гласных букв (отношение\n" +
            "количества гласных к общему количеству букв в слове).";

    private static final Set<Integer> vowel = "aeiouуеыаоэяию".chars().boxed().collect(Collectors.toSet());

    public static void main(String[] args) {
        final Set<String> words = Arrays.stream(txt.split("[\\p{Punct}\\s]+"))
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toSet());
        final Map<String, Long> vowelCount = words.stream()
                .collect(Collectors.toMap(Function.identity(), w -> w.chars().filter(vowel::contains).count()));
        final List<String> orderedWords = words.stream()
                .sorted((a, b) -> (int) (vowelCount.get(a) - vowelCount.get(b)))
                .collect(Collectors.toList());
        System.out.println(orderedWords);
    }
}
