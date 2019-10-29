package io.ascending.training.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Stream;

public class Solution {

    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };


    public static void main(String[] args){
        //sorting object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

        //sorting employees array using Comparable interface implementation
//        Arrays.sort(empArr);
//        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));

        Arrays.sort(empArr, new SalaryComparator());
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

//
//        String str = "apple, orange, apple, orange, banana, apple, banana";
//        String[] strArr = str.split(", ");
//        HashMap<String, Integer> map = new HashMap<>();
//
//        Stream.of(new String("apple, orange, apple, orange, banana, apple, banana").split(", "))
//                .forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1))
//                .


        //sort employees array using Comparator by Age
//        Arrays.sort(empArr, AgeComparator);
//        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
//
//        //sort employees array using Comparator by Name
//        Arrays.sort(empArr, NameComparator);
//        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
    }
}
