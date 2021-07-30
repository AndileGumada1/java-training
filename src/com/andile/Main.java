package com.andile;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static void details(Student Student)
    {
        System.out.println(Student.getAge() + " - " + Student.getName() + " - " + Student.getAge());
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(002, "Andile", 17));
        list.add(new Student(001, "Simphiwe", 18));
        list.add(new Student(004, "Kholofelo", 15));
        list.add(new Student(003, "Tebogo", 16));

        System.out.println("Original List: ");
        for (int i = 0; i < list.size(); i++)
        {
            details(list.get(i));
        }

        Collections.sort(list);

        System.out.println("Sorted by age");
        for (int i = 0; i < list.size(); i++)
        {
            details(list.get(i));
        }
    }
}
