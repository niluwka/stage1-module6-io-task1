package com.epam.mjc.io;

import java.io.*;


public class FileReader {
    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("/Users/User/IdeaProjects/stage1-module6-io-task1/src/main/resources/Profile.txt"))
        {
            int i;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }





    public static Profile getDataFromFile(File file) {
        System.out.println( file);
        return new Profile();
    }
}
