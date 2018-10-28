package com.myan.java.eight.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by myan on 2018/8/16 7:50.
 */
public class OptionalListTest {

    public static void main(String[] args) {
        Employee zhangsan = new Employee("changsan");
        Employee lisi = new Employee("lisi");

        Company company = new Company();
        company.setName("company");

        List<Employee> list = Arrays.asList(zhangsan, lisi);

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(theCompany -> theCompany.getEmployeeList()).orElse(Collections.emptyList()));
        System.out.println(optional.map(theCompany -> theCompany.getEmployeeList()).orElse(Collections.emptyList()));

    }
}
