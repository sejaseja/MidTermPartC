/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Hp sejal Duhan
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action","Romantic", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

       
        System.out.print("Enter  name: ");
        String name = scanner.nextLine();

        // choosing genres
        System.out.print("Choose your favorite genre (enter the  number): ");
        int choice = scanner.nextInt();

        
        if (choice < 1 || choice > genres.length) {
            System.out.println("Invalid choice. Please choose a number from 1 to " + genres.length);
            return;
        }

        // Create user profile
        String selectedGenre = genres[choice - 1];
        UserProfile userProfile = new UserProfile(name, selectedGenre);

        // Display confirmation message
        System.out.println("User profile created successfully: " + name + " with favorite genre: " + selectedGenre);
}
}
    

