package com.leetcode2024;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private int id;
    private String name;
    private String address;

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.id > o2.id ){
            return 1;
        }
        else if(o1.id < o2.id) return -1;
        return 0;
    }
}
