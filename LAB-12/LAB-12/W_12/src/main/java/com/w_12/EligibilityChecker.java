package com.w_12;

public class EligibilityChecker {
    private String name;
    private int age;

    public EligibilityChecker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String checkEligibility() {
        if (age >= 18) {
            return "Hello " + name + ", you are eligible to vote!";
        } else {
            return "Hello " + name + ", you are not eligible to vote yet.";
        }
    }
}
