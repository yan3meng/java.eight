package com.myan.java.eight.supplier;

import com.myan.java.eight.predicate.Person;

import java.util.function.Supplier;

/**
 * Created by myan on 2018/8/15 7:30.
 */
public class SupplierTest {

    public static void main(String[] args) {
        Person p = new Person();
        // lambda expression
        Supplier<Person> supplier = () -> new Person();
        // constructor reference
        Supplier<Person> supplierP = Person::new;
    }
}
