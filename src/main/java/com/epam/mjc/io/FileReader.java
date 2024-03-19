package com.epam.mjc.io;

import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;

public class FileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader("/Users/Admin/IdeaProjects/stage1-module6-io-task01/src/main/resources/Profile.txt"));
        String str;

        ArrayList<String> list = new ArrayList<String>();
        while((str = reader.readLine()) != null ){
            if(!str.isEmpty()){
                list.add(str);
                System.out.println(str);
            }}
        String[] stringArr = list.toArray(new String[0]);



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




        return new Profile();
    }
}
