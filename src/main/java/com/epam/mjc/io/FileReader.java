package com.epam.mjc.io;

import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("/Users/Admin/IdeaProjects/stage1-module6-io-task01/src/main/resources/Profile.txt");
        FileReader fileReader = new FileReader();
        Profile profile = fileReader.getDataFromFile(file);
        System.out.println("Name:" + profile.getName());
        System.out.println("Age:" + profile.getAge());
        System.out.println("Email:" + profile.getEmail());
        System.out.println("Phone:" + profile.getPhone());
    }

    private static String readFileToString(File file) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
    private static Profile parseProfileData(String data){
String lines[] = data.split("\n");
String name = null;
int age = 0;
String email = null;
long phone = 0;

        for (String line:
             lines) {
            if (line.startsWith("Name:")){
                name = line.substring(6).trim();

            }else if(line.startsWith("Age:")){
                age = Integer.parseInt(line.substring(5).trim());

            } else if (line.startsWith("Email:")) {
                email = line.substring(7).trim();
                
                
            } else if (line.startsWith("Phone:")) {
               phone = Long.parseLong(line.substring(7).trim());

            }
        }
        return new Profile(name,age,email,phone);
    }

    public static Profile getDataFromFile(File file) {

String fileContent = readFileToString(file);
Profile profile = parseProfileData(fileContent);
        return profile;
    }
}
