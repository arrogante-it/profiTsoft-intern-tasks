package com.alexandrSinko.ModuleOne.Solution2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class HashTagTest {

    @Test
    public void getTopFiveHashTags() {
        List<String> current = new ArrayList<>();
        Collections.addAll(current, "qwe", "#qwe", "#qq", "#qq", "#qwe", "#eeee"
                , "#qwerty", "qwe", "eqe", "www", "wqwqwq"
                , "Hello", "world", "nice", "#win", "#win", "#win", "#qwe", "#eeee", "#morning"
                , "#task", "$task", "#task", "#task", "#task", "#qwe", "#qwe", "#qwe", "#qwe", "#eeee");

        Map<String, Integer> expected = HashTag.getTopFiveHashTags(current);

        Map<String, Integer> actual = new HashMap<>();
        actual.put("#qwe", 7);
        actual.put("#task", 4);
        actual.put("#win", 3);
        actual.put("#eeee", 3);
        actual.put("#qq", 2);

        Assert.assertEquals(expected, actual);
    }
}
