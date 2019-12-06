package com.paf.zoo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Utility {

    /**
     * Find a random element in collection
     * @param collection
     * @return
     */
    public static <T> T getRandomElement(Collection<T> collection) {
        if (collection.isEmpty()) {
            return null;
        }
        int index = new Random().nextInt(collection.size());
        Iterator<T> iter = collection.iterator();
        for (int i = 0; i < index; i++) {
            iter.next();
        }
        return iter.next();
    }

    /**
     * Find a random element in collection but not in any collection of exceptCollections
     * @param collection
     * @param exceptCollections
     * @param <T>
     * @return
     */
    @SafeVarargs
    public static <T> T getRandomElement(Collection<T> collection, Collection<T>... exceptCollections) {
        if (collection.isEmpty()) {
            return null;
        }
        Supplier<Stream<T>> streamSupplier = () -> collection.stream().filter(c ->
                Arrays.stream(exceptCollections).noneMatch(except -> except.contains(c))
        );
        long count = streamSupplier.get().count();
        if (count > 0) {
            int index = new Random().nextInt((int) count);
            return streamSupplier.get().skip(index).findFirst().orElse(null);
        }
        return null;
    }
}
