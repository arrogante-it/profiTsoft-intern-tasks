package com.alexandrSinko.ModuleOne.Solution1;

import static org.hamcrest.core.Is.is;
import org.junit.Assert;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void getPositiveSortedNumbers() {
        int[] expected = Solution
                .getPositiveSortedNumbers(new int[]{-7,-2,-3,0,5,3,2,1});

        int[] actual = new int[] {5,3,2,1,0};

        Assert.assertThat(expected, is(actual));
    }
}