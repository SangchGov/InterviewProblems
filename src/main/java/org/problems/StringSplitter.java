package org.problems;

//Напишите код, с помощью которого можно разделить строку на части.
//Write a code which splits the string in parts

import java.util.ArrayList;
import java.util.List;

public class StringSplitter {

    public static List<String> split(String givenString, int partLength){

        List<String> split = new ArrayList<>();
        StringBuilder sb = new StringBuilder();


        if(partLength <= 0){
            throw new IllegalArgumentException("partLength must be greater than zero");
        }

        if(givenString.length() < partLength){
            throw new IllegalArgumentException("givenString length must be greater than zero");
        }


        for (int i = 0; i < givenString.length(); i++) {
            sb.append(givenString.charAt(i));
            if ((i + 1) % partLength == 0 || i == givenString.length() - 1) {
                split.add(sb.toString());
                sb.setLength(0);
            }
        }

        return split;

    }



}