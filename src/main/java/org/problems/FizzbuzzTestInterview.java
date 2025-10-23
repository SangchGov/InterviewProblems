package org.problems;

public class FizzbuzzTestInterview{
    public byte[] fizzBuzzInterview(int value){
        StringBuilder sb = new StringBuilder();

        if(value % 3 != 0 && value % 5 != 0){
            throw new IllegalArgumentException();
        }
        if(value % 3 == 0){
            sb.append("Fizz");
        }
        if(value % 5 == 0){
            sb.append("Buzz");
        }
        return sb.toString().getBytes();
    }
}

