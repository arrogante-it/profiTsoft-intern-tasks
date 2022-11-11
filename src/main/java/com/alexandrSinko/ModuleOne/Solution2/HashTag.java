package com.alexandrSinko.ModuleOne.Solution2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * ProfiTsoft, task 2.
 * Write a method that accepts as input a list of strings (text)
 * that can contain hash tags (words starting with "").
 * As a result, the method should return the top-5 most frequently mentioned hash tags,
 * with the number of times each hash tag was mentioned.
 * Multiple #same hashtags on the same line should count as one mention.
 * Write unit tests for this method.
 */
public class HashTag {
    public static Map<String, Integer> maps;
    public static Map<String, Integer> getTopFiveHashTags(List<String> text) {

        // write pairs in maps,
        // where key equals word with # and value equals amount of these words
        maps = new HashMap<>();

        // write to map elements that starts with #
        for (String element : text) {
            // element that equals null will skiped
            if(element == null) {
                continue;
            }
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
