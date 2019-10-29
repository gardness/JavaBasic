package io.ascending.training.collection;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) ( e2.getSalary()-e1.getSalary());
    }
}
