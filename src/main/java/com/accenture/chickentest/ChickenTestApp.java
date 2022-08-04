/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest;

import com.accenture.chickentest.business.*;
import java.io.*;

public class ChickenTestApp {

    static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    static int option = -1;
    static boolean userLoged;

    public static void main(String[] args) throws IOException {

        mainMenu();
    }

    public static void mainMenu() throws IOException {

        do {

            System.out.println("====================================================");
            System.out.println("=================== Main Menu ======================");
            System.out.println("1 - Log in with a existent user");
            System.out.println("2 - Log out of current user");
            System.out.println("3 - Registry a new user");
            System.out.println("0 - Quit");
            System.out.println("====================================================");

            ChickenTestApp.option = Integer.parseInt(console.readLine());

            switch (ChickenTestApp.option) {
                case 1 -> login();
                case 2 -> logout();
                case 3 -> register();
                case 0 -> System.out.println("Exiting from App...");
                default -> System.out.println("The option introduced is not valid. Please use the number of the options showed to continue.");
            }
        } while (ChickenTestApp.option != 0);
    }

    public static void login() throws IOException {

        String user, psw;
        String tryIt = "";
        int triesCounter = 3;
        boolean loopAgain = false;

        do {
            System.out.println("User:");
            user = console.readLine();
            System.out.println("Password");
            psw = console.readLine();

            //check the user in the db
            if (user.equals("test") && psw.equals("test")) {
                System.out.println("User logged successfully.");
                ChickenTestApp.userLoged = true;
                loopAgain = false;
                farmMenu();
            } else {
                System.out.println("User and/or Password incorrect.");
                if (triesCounter > 0) {
                    System.out.println("Tries left: " + triesCounter + " Try again? Yes / No");
                    tryIt = console.readLine();
                    if (tryIt.toUpperCase().equals("YES")) {
                        triesCounter--;
                        loopAgain = true;
                        System.out.println("One chance less...");
                    } else if (tryIt.toUpperCase().equals("NO")) {
                        loopAgain = false;
                    } else {
                        System.out.println("You enter a not valid response. Exiting from menu");
                        loopAgain = false;
                    }
                } else {
                    System.out.println("You rich the limit of intents. Please try later.");
                    loopAgain = false;
                }
            }
        } while (loopAgain);

    }
    
    public static void logout() throws IOException{
        //desloguear usuario
        userLoged = false;
        System.out.println("User has been logged out.");
    }
    
    public static void register() throws IOException{
        String userName, psw, email;
        
        System.out.println("Email: ");
        email = console.readLine();
        
        if (!email.equals("")){ // validate in db that the email does not exist. 
            System.out.println("New user:");
            userName = console.readLine();
            if (!userName.equals("")){// validate in db that the userName does not exist. 
                System.out.println("Password: ");
                psw = console.readLine();
                // create user
                User user = new User(email, userName, psw);
                System.out.println("User was created successfully.");
            }
            else System.out.println("The name introduced is already taken. Please try with another one.");
        }
        else System.out.println("An user already exist with that email. Please try with another one.");
        
    }

    public static void farmMenu() throws IOException {
        do {
            System.out.println("====================================================");
            System.out.println("=================== Farm Menu ======================");
            System.out.println("1 - Create a new Farm");
            System.out.println("2 - Load a Farm");
            System.out.println("3 - List all my Farms");
            System.out.println("0 - Quit");
            System.out.println("====================================================");

            ChickenTestApp.option = Integer.parseInt(console.readLine());

            switch (ChickenTestApp.option) {
                case 1 -> {}
                    //newFarm();
                case 2 -> {
                }
                case 3 -> {
                }
                case 0 -> {
                }
                default -> {
                }
            }

        } while (ChickenTestApp.option != 0);
        ChickenTestApp.option = -1;
    }
    
    public static void newFarm(String user){}

    public static void gameMenu() {
        System.out.println("====================================================");
        System.out.println("=================== Game Menu ======================");
        System.out.println("1 - Buy an Egg");
        System.out.println("2 - Sell an Egg");
        System.out.println("3 - List all my Eggs");
        System.out.println("4 - Buy an Chicken");
        System.out.println("5 - Sell an Chicken");
        System.out.println("6 - List all my Chickens");
        System.out.println("7 - Show me the Farm status");
        System.out.println("0 - Quit");
        System.out.println("====================================================");
    }
        
    public static void worldMenu() {
        System.out.println("====================================================");
        System.out.println("=================== World Menu ======================");
        System.out.println("1 - Create a new World");
        System.out.println("2 - Load a World");
        System.out.println("3 - List the existent Worlds");
        System.out.println("0 - Quit");
        System.out.println("====================================================");
    }
}

//        try {
//            Animal eggTest = new Egg();
//            Animal eggTest1 = new Egg();
//            Animal eggTest2 = new Egg();
//            Animal chicken = new Chicken();
//            chicken.setSubSpecie("Marron");// throws ERR
//            eggTest = ((Egg) eggTest).hatch();
//            System.out.println(eggTest);
//            System.out.println(eggTest1);
//            System.out.println(eggTest2);
//            System.out.println(chicken);
//        } catch (Exception ex) {
//            ex.printStackTrace(System.out);
//        }
