package com.paf.zoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class UtilityTest {

    @Test
    public void getRandomElementTest() {
        Collection<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Zoo");
        strings.add("Paf");

        String str = Utility.getRandomElement(strings);
        Assert.assertTrue("Return element should be in the collection", strings.contains(str));
    }

    @Test
    public void getRandomElementFromEmptyCollectionTest() {
        Collection<String> strings = new ArrayList<>();
        String str = Utility.getRandomElement(strings);
        Assert.assertNull(str);
    }

    @Test
    public void getRandomElementWithExceptionTest() {
        Collection<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Zoo");
        strings.add("Paf");

        Collection<String> exceptions = new ArrayList<>();
        exceptions.add("Hello");
        exceptions.add("Zoo");
        exceptions.add("Yangjun");

        String str = Utility.getRandomElement(strings, exceptions);
        Assert.assertTrue("Return element should be in the collection", strings.contains(str));
        Assert.assertFalse("Return element shouldn't be in exceptions", exceptions.contains(str));

    }

    @Test
    public void getRandomElementWithExceptionAllTest() {
        Collection<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Zoo");
        strings.add("Paf");

        String str = Utility.getRandomElement(strings, strings);
        Assert.assertNull(str);

    }
}
