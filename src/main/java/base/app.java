package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

/*
Create a program that prompts for an input string and displays output that shows the input string
and the number of characters the string contains.

Example Output
What is the input string? Homer
Homer has 5 characters.

Constraints

Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.

Challenges

If the user enters nothing, state that the user must enter something into the program.
Implement this program using a graphical user interface and update the character
counter every time a key is pressed. If your language doesn’t have a particularly friendly GUI library,
try doing this exercise with HTML and JavaScript instead.
 */


public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String str = in.nextLine();

        int count=0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }

        System.out.println("\n" + str + " has " + count + " chatacters.");

    }
}