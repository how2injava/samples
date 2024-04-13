package com.java.how2injava.keywords.enumkeyword;

public class EnumSample {

    // Define an enum called Day
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        // Accessing enum constants
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);

        // Using switch case with enums
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case FRIDAY:
                System.out.println("It's Friday");
                break;
            default:
                System.out.println("It's neither Monday nor Friday");
        }

        // Iterating over all enum constants
        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
