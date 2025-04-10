/**
 * You are going to write code that is designed to store student ID numbers.
 * You will create an ArrayList for Integers, then accept user input to add values 
 * to that ArrayList. There will be additional modifications you can make:
 * 
 * B level:
 * Accept input from users, add values to an ArrayList
 * 
 * B+ level:
 * B level plus stop accepting input when the user enters -1. After this, the full
 * list of student numbers should be printed, one student ID per line.
 * 
 * A- level: 
 * Complete B and B+. Also do not allow duplicates. When the user enters a student ID 
 * that already exists, tell them they cannot add duplicates then continue accepting input 
 * as per B+ level.
 * 
 * A+ level:
 * Complete B and B+. Modify A- so that when a duplicate value is entered, the user is asked 
 * whether they want to delete the existing value. If they enter "yes", the value is removed
 * from the ArrayList. Ignore any other input and do not add the value to the ArrayList.
 * 
 * An A will be awarded for an attempt at A+ that is close but not complete.
 */

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter values for the list.");
        int input = Integer.valueOf(reader.nextLine());
        while(true){
            if(input == (-1)){
                System.out.println(list);
                break;
            }
            list.add(input); 
            if (list.contains(input)){ //there are problems here
                System.out.println("You cannot add duplicates.");
                System.out.println("Do you want to delete the existing value?");
                String word = reader.nextLine();
                if(word.equals("yes")){
                    list.remove(input);
                } else {
                    return;
                }
            }
            }
    
        }
    }

