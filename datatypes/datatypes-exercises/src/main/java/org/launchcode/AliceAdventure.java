package org.launchcode;

import java.util.Scanner;
public class AliceAdventure {
    public static void main(String[] args) {
        String aliceIntro = "Alice was beginning to get very" +
                " tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she" +
                " had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search in the first" +
                " sentence of Alice's Adventures in Wonderland:");
        String userSearch = input.nextLine();
        Integer searchIndex = aliceIntro.indexOf(userSearch);
        Integer searchLength = userSearch.length();
        System.out.println("Your search term first appears at index " + searchIndex + ". Your term is " + searchLength + " characters long.");
        String removedSearch = aliceIntro.replace(userSearch, "");
        System.out.println(removedSearch);
    }
}
