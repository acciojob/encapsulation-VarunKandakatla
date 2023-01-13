package com.driver;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();

        obj.setName(sc.next());
        System.out.println(obj.getName());
    }
}