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

        String output = myApp.buildOutput(tilRetirement, currentYear, tilRetirement + currentYear);
        myApp.printRetirementYear(output);
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

    public String buildOutput (int tilRetirement, int currentYear, int retirementYear) {
        return "You have " + tilRetirement + " years left until you can retire.\nIt's " + currentYear + ", so you can retire in " + retirementYear + ".";
    }

    public void printRetirementYear(String output) {
        System.out.print(output);
    }
}
