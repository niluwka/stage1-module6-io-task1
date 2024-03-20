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
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new java.io.FileReader("/Users/Admin/IdeaProjects/stage1-module6-io-task01/src/main/resources/Profile.txt"));
        String str;
        String x = "";
        ArrayList<String> list = new ArrayList<String>();
        while((str = reader.readLine()) != null ){
            if(!str.isEmpty()){
                list.add(str);
                x = str;
                Pattern pattern = Pattern.compile("\\b(\\w+):\\s(\\w+)\\b");
                Matcher matcher = pattern.matcher(x);

                // Create a map to store key-value pairs
                Map<String, String> keyValueMap = new HashMap<>();

                while (matcher.find()) {
                    String key = matcher.group(1);
                    String value = matcher.group(2);

                    // Store key-value pairs in the map
                    keyValueMap.put(key, value);
                    System.out.println(   keyValueMap.put(key, value));


                }
                //  System.out.println(str);
            }}
        String[] stringArr = list.toArray(new String[0]);


        //    System.out.println(x);
        //  String data = "name: John";

//        BufferedReader reader = new BufferedReader(new java.io.FileReader("/Users/Admin/IdeaProjects/stage1-module6-io-task01/src/main/resources/Profile.txt"));
//        String str;
//
//        ArrayList<String> list = new ArrayList<String>();
//        while((str = reader.readLine()) != null ){
//            if(!str.isEmpty()){
//                list.add(str);
//                System.out.println(str);
//            }}
//        String[] stringArr = list.toArray(new String[0]);



//        try(FileInputStream fin=new FileInputStream("/Users/Admin/IdeaProjects/stage1-module6-io-task01/src/main/resources/Profile.txt"))
//        {
//            int i;
//            String [] strArr = new String[0];
//            String str ="";
//            while((i=fin.read())!=-1){
//                str = (String.valueOf((char)i));
//
//                Arrays.fill(strArr,str );
//
//                System.out.println(strArr[0]);}
//
//
//
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }


    }





    public static Profile getDataFromFile(File file) {

        Profile profile = new Profile("nilgfd",20,"sss", 1234567890L) ;


//        profile.setName("nil");
//
//        profile.setAge(39);

        return new Profile();
    }
}
