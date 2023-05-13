// Name of programmer: MATTHEW GUTIERREZ
// Name of program: Hello World
// Date started: 5/13/23
//
// Description of program: Ask user for her first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp

import java.lang.reflect.Array;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

        // Variable declaration section.
        Scanner userInput = new Scanner(System.in);
        String iceBreak = "Greetings user, enter your preferred name: ";
        String greeting = "";
        String mac = "MAC MAC";
        System.out.println("\n");
        //Program Start

        // Input: get user name

        System.out.println(iceBreak);
        String userName = userInput.nextLine();

        // Processing: Create a greeting with validation;

        if (userName == "^[a-zA-Z0-9]+$") {
            greeting = userName + " welcome to " + mac + "'s Hello World program!!";
            // Output:
            System.out.println("\n" + greeting + "\n");
        }
        else {
             greeting = "Hello User: welcome to " + mac + "'s Hello World program!!";
             String regExGreeting = greeting.replace("w", "W");
             System.out.println("\n" + regExGreeting + "\n");
            }
        }
    }
