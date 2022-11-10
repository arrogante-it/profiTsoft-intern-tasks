package com.alexandrSinko.ModuleOne.Solution2;

// ProfiTsoft, task 2.
// Write a method that accepts as input a list of strings (text)
// that can contain hash tags (words starting with "").
// As a result, the method should return the top-5 most frequently mentioned hash tags,
// with the number of times each hash tag was mentioned.
// Multiple #same hashtags on the same line should count as one mention.
// Write unit tests for this method.

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "qwe", "#qwe", "#qq", "#qq", "#qwe", "#eeee"
                , "#qwerty", "qwe", "eqe", "www", "wqwqwq"
                , "Hello", "world", "nice", "#win", "#win", "#win", "#qwe", "#eeee", "#morning"
                , "#task", "$task", "#task", "#task", "#task", "#qwe", "#qwe", "#qwe", "#qwe", "#eeee");

        // return:
        // #qwe - 7
        // #task - 4
        // #win - 3
        // #eeee - 3
        // #qq - 2
        getTopFiveHashTags(list);

    }

    public static Map<String, Integer> getTopFiveHashTags(List<String> text) {

        // write pairs in maps,
        // where key equals word with # and value equals amount of these words
        Map<String, Integer> maps = new HashMap<>();

        // write to map elements that starts with #
        for (String element : text) {
            if (element.startsWith("#")) {
                int amountHashTags = maps.getOrDefault(element, 0) + 1;
                maps.put(element, amountHashTags);
            }
        }

        // sort and reverse map
        Map<String, Integer> sortedMap = maps.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int topHashTagCoutner = 1;

        // result hashMap that sorted, reversed and have top 5 hashTags
        Map<String, Integer> resultMap = new HashMap<>();

        // print map
        for (Map.Entry<String, Integer> pair : sortedMap.entrySet()) {
            resultMap.put(pair.getKey(), pair.getValue());
            if (topHashTagCoutner == 5) {
                break;
            }
            topHashTagCoutner++;
        }
        return resultMap;
    }
}
