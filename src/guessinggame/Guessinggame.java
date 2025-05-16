/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessinggame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Guessinggame {

    
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Durian");
        words.add("Elderberry");
        words.add("Fig");
        words.add("Grape");
        words.add("Honeydew");
        words.add("Jackfruit");
        words.add("Kiwi");

        System.out.println("List of words:");
        System.out.println("-------------");
        System.out.println("Index\tWord");
        System.out.println("-------------");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(i + "\t" + words.get(i));
        }
        System.out.println("-------------");

        Random rand = new Random();
        int randomIndex = rand.nextInt(words.size());
        String randomWord = words.get(randomIndex);
        int numAttempts = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the word (you have " + numAttempts + " attempts):");

        for (int i = 1; i <= numAttempts; i++) {
            String guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(randomWord)) {
                System.out.println("Congratulations, you guessed the word!");
                return;
            } else {
                System.out.println("Incorrect guess.");
                if (i == 1) {
                    System.out.println("Here's a clue: the first letter of the word is " + randomWord.charAt(0));
                } else if (i == 2) {
                    System.out.println("Here's another clue: the word has " + randomWord.length() + " letters");
                }
            }
        }
        System.out.println("You have exhausted all your attempts. The correct word was: " + randomWord);
    }
    
}
    

