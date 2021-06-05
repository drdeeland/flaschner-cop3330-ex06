/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Calendar;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Calendar rightNow = Calendar.getInstance();

        String ageString = myApp.setAge();
        String retirementString = myApp.setRetirement();

        int age = Integer.parseInt(ageString);
        int retirement = Integer.parseInt(retirementString);

        int tilRetirement = myApp.untilRetirement(age, retirement);
        int currentYear = rightNow.getWeekYear();

        myApp.printRetirement(tilRetirement);
        myApp.printRetirementYear(tilRetirement, currentYear);
    }

    public String setAge() {
        System.out.print("What is your current age? ");
        return input.nextLine();
    }

    public String setRetirement() {
        System.out.print("At what age would you like to retire? ");
        return input.nextLine();
    }

    public int untilRetirement(int age, int retirement) {
        return retirement - age;
    }

    public void printRetirement(int tilRetirement) {
        System.out.println("You have " + tilRetirement + " years left until you can retire.");
    }

    public void printRetirementYear(int tilRetirement, int currentYear) {
        System.out.printf("It's %d, so you can retire in %d.", currentYear, currentYear + tilRetirement);
    }
}
