package coba.handling.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankLogin {
    public static void main(String[] args) {
        final String URL = "C:\\Bayu Folder\\Tugas Kuliah\\Pemrograman Terstruktur\\Praktek\\kuis-pertama\\kuis\\src\\coba\\handling\\file\\database\\";
        String[] listUserName;
        String[] listPassword;

        Scanner input = new Scanner(System.in);

        createFile(URL);

        System.out.println("Masukan user name!");
        String userName = input.nextLine();

        System.out.println("Masukan password!");
        String password = input.nextLine();
        register(URL, userName, password);
        input.close();

        readFile(URL);
    }

    static void createFile(String url) {
        try {
            File newFile = new File(url.concat("user-regis").concat(".").concat("txt"));
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File is already exists");
            }
        } catch (IOException e) {
            System.out.println("Ada kesalahan dalam membuat file!");
            e.printStackTrace();
        }
    }

    static void register(String url, String userName, String password) {
        try {
            FileWriter writer = new FileWriter(url.concat("user-regis").concat(".").concat("txt"), true);
            writer.write(userName);
            writer.write("_");
            writer.write(password);
            writer.write("|");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }

    static void readFile(String url) {
        try {
            File myFile = new File(url.concat("user-regis").concat(".").concat("txt"));
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
