package com.myan.java.eight.predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * stream的filter(Predict<? super T> p)
 * predict函数接口方法，接收一个参数，返回boolean
 * Created by myan on 2018/8/12 17:25.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 20);
        Person p2 = new Person("lisi", 26);
        Person p3 = new Person("wangwu", 28);
        List<Person> personList = Arrays.asList(p1, p2, p3);
        List<Person> res = getPersonByName("lisi", personList);
        res.forEach(item -> System.out.println(item.getUsername()));
        System.out.println("====BiFunction Test, age > 25====");
        List<Person> filterAgeRes = getPersonByAge(25, personList);
        filterAgeRes.forEach(item -> System.out.println(item.getUsername() + ", " + item.getAge()));
        System.out.println("====BiFunction New Test, age <= 25====");
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (personAge, list1) ->
                list1.stream().filter(person -> person.getAge() <= personAge).collect(Collectors.toList());
        List<Person> filterAgeResNew = getPersonByAgeNew(25, personList, biFunction);
        filterAgeResNew.forEach(item -> System.out.println(item.getUsername() + ", " + item.getAge()));

        // --------- anonymous method
        new BiFunction<Integer, List<Person>, List<Person>>() {
            @Override
            public List<Person> apply(Integer integer, List<Person> persons) {
                return persons.stream().filter(p -> p.getAge() > integer).collect(Collectors.toList());
            }

        };

    }

    public static List<Person> getPersonByName(String name, List<Person> personList){
        return personList.stream().filter(person -> name.equals(person.getUsername()))
                .collect(Collectors.toList());
    }

    public static List<Person> getPersonByAge(int age, List<Person> personList){
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (personAge, list1) ->
                list1.stream().filter(person -> person.getAge() > personAge).collect(Collectors.toList());
        return biFunction.apply(age, personList);
    }

    public static List<Person> getPersonByAgeNew(int age, List<Person> personList,
                                                 BiFunction<Integer, List<Person>, List<Person>> biFunction){
        return biFunction.apply(age, personList);
    }
}
