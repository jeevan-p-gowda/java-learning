package Collections;// Java program for treeset of user
// defined objects and using comparator

import java.util.Comparator;
import java.util.TreeSet;

class GFG {
    public static void main(String[] args)
    {
        // TreeSet of user defined objects
        // and using comparator also
        // we will create TreeSet of employees
        System.out.println(
                "Sorting on the basis of name in Ascending order");

        // passed first comparator object for
        // sorting in ascending order of name
        TreeSet<Employee> gfg
                = new TreeSet<>(new FirstComparator());

        gfg.add(new Employee(1, "ram", 24));
        gfg.add(new Employee(2, "krishna", 23));
        gfg.add(new Employee(3, "sita", 26));
        gfg.add(new Employee(4, "lakshman", 25));

        // printing each employee object
        for (Employee employee : gfg) {
            System.out.println(employee);
        }

        System.out.println(
                "Sorting on the basis of name in Descending order");

        // Passed second comparator object for
        // Sorting in descending order of name
        TreeSet<Employee> gfg2
                = new TreeSet<>(new SecondComparator());
        gfg2.add(new Employee(1, "ram", 24));
        gfg2.add(new Employee(2, "krishna", 23));
        gfg2.add(new Employee(3, "sita", 26));
        gfg2.add(new Employee(4, "lakshman", 25));

        // printing each employee object
        for (Employee employee : gfg2) {
            System.out.println(employee);
        }

        // ThirdComparator
        System.out.println(
                "Sorting on the basis of age in ascending order");

        TreeSet<Employee> gfg3
                = new TreeSet<>(new ThirdComparator());

        gfg3.add(new Employee(1, "ram", 24));
        gfg3.add(new Employee(2, "krishna", 23));
        gfg3.add(new Employee(3, "sita", 26));
        gfg3.add(new Employee(4, "lakshman", 25));

        // printing each employee object
        gfg3.forEach(System.out::println);
    }
}

// for sorting in ascending order
class FirstComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        return (e1.name).compareTo(e2.name);
    }
}

// for sorting in descending order
// passed in reverse order e2 first than e1
class SecondComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        return -(e1.name).compareTo(e2.name);
    }
}

// Sorted on the basis of age
class ThirdComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        if (e1.age > e2.age) {
            return -1;
        }
        else if (e1.age < e2.age) {
            return 1;
        }
        else {
            return (e1.age).compareTo(e2.age);
        }
    }
}

// Employee class
class Employee {

    // Employee has three attributes
    // id , name, age

    public int id;
    public String name;
    public Integer age;

    // default constructor
    Employee() {}

    // parameterized constructor
    Employee(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override public String toString()
    {
        return "" + this.id + " " + this.name + " "
                + this.age;
    }
}

