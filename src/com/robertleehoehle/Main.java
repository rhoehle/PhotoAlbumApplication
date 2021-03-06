package com.robertleehoehle;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Robert Hoehle
 */
public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("This program reads and displays data from a web service URL.  " +
                "The data displays photo albums and their titles by Photo Album ID numbers.");

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        int albId;

        System.out.print("Choose the Photo Album ID number (0-100) you would like displayed (0 returns all Photo Albums): ");

        // loop used to validate user input
        while (true) {
            boolean isAnInt  = scanner.hasNextInt();

            if (isAnInt) {
                albId = scanner.nextInt();
                if (albId >= 0 && albId <= 100) {
                    String jsonFile = loadData(albId);
                    System.out.println("Reading data . . . ");
                    Thread.sleep(2000);

                    Gson gson = new Gson();

                    Photo[] photo = gson.fromJson(jsonFile, Photo[].class);

                    for (Photo photos :
                            photo) {
                        System.out.println(photos);
                    }
                    break;
                } else {
                    System.out.println("Number out of range. Please choose a number between 0 - 100, 0 for all albums: ");
                    scanner.nextLine();
                    // continue;
                }
            } else {
                System.out.println("Must be a number character. Please choose a number betweent 0 - 100, 0 for all albums: ");
                scanner.nextLine();
            }
        }
            scanner.close();
    }

    /**
     * loadData() reads the json file through Java API by a query string
     */
    private static String loadData(int albId) throws Exception {

        if (albId == 0){
            return readUrl("https://jsonplaceholder.typicode.com/photos");
        } else {
            return readUrl("https://jsonplaceholder.typicode.com/photos?albumId=" + albId);
        }
    }

    /**
     * readUrl() takes the string input from loadData() and translates
     * the string into readable String output
     */
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}

