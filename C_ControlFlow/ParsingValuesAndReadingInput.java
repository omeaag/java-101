package C_ControlFlow;

import java.util.Scanner;

public class ParsingValuesAndReadingInput {

    public static void main(String[] args) {
        int currentYear = 2024;
//        String usersDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        // System.out.println(currentYear - usersDateOfBirth); //hatalı çünkü ifadelerden biri int diğeri string
//        System.out.println(currentYear-dateOfBirth);
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (Exception e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("hi, what's your name? ");
        System.out.println("hi " + name + " welcome");
        String dateOfBirth = System.console().readLine("what year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "so your age is :" + age;
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("what year were you born? ");
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("enter a year of birth >= " + (currentYear-125) +
                    " and <= " + currentYear);
            try {
                age = getData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("not allowed!!! try again");
            }
        }while(!validDOB);

        return "so you are " + age+" years old";
    }

    public static int getData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if(dob<minimumYear || dob>currentYear){
            return -1;
        }
        return currentYear - dob;
    }
}
