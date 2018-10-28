package com.myan.java.eight.collector;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by myan on 2018/9/20 7:34.
 */
public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>>
{
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("This is supplier.");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("This is accumulator.");
        //return Set<T>::add;
        return (set, item) -> set.add(item);
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("This is combiner.");
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("This is finisher.");
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("This is characteristics.");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED));
    }
}
