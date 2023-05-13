// Name of programmer: Matthew
// Name of program: Hello World
// Date started: 01/26/2023
//
// Description of program: Ask user for his/her first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    String userName = "";
    String greeting = "";
    Scanner myObj = new Scanner(System.in);
    // Enter username and press Enter
    System.out.println("Hello enter username");
    userName = myObj.nextLine();

    greeting = "Hello " + userName + ". How are you today?";

    System.out.println("\n\n" + "Username is: " + userName);
    System.out.println("\n\n" + greeting + "\n\n");
  }
}