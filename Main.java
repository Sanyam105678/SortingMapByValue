package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Main {

    public Map<String, Employee> getSortedMapWithValue(Map<String,Employee> originalMap)
    {
        //sort the supplied map according to the value(Employee salary) and return the sorted Map.

        Map<String, Employee> sorted = originalMap.entrySet() .stream().sorted(Map.Entry.<String, Employee>comparingByValue(new SalaryComp())) .collect(toMap(Map.Entry::getKey,
                Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        return sorted;


    }

    public static void main(String[] args) {
	// write your code here
        HashMap<String,Employee> hm = new HashMap<>();
        hm.put("HR",new Employee("1","Ram",7000000.0));
        hm.put("Sales",new Employee("2","Raman",6000000.0));
        hm.put("Marketing",new Employee("3","Soham",4000000.0));
        hm.put("Accounts",new Employee("4","Ramesh",1000000.0));
        Main obj = new Main();
        HashMap<String,Employee> sortedHm = (HashMap<String, Employee>) obj.getSortedMapWithValue(hm);


        for(Map.Entry<String,Employee> e:sortedHm.entrySet()){
            System.out.println("Department: "+e.getKey());
            System.out.println("------------------");
            System.out.println("EmpId: "+e.getValue().getEmpId());
            System.out.println("Emp Name: "+ e.getValue().getEmpName());
            System.out.println("Salary: "+e.getValue().getSalary());
            System.out.println();
        }


    }
}
