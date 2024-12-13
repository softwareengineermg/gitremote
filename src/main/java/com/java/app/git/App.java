package com.java.app.git;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,3,5);
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        
        DuplicateCheck check = new DuplicateCheck();
        check.checkDuplicate().forEach(System.out::println);;
        System.out.println("Updated.......");
           
        
    }
}
