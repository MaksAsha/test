package ru.job4j.max;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void max() throws Exception {
        Max max = new Max();
        Assert.assertThat(max.getMax(1, 2), Matchers.is(2));
    }

}