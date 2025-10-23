package org.problems;

public class aoaoaoaoao {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        boolean tired = false;


        for(int i = 0; !tired ; i++){
            if (i % 2 == 0){
                sb.append("a");
            } else {
                sb.append("o");

            }
            System.out.println(sb.toString());
        }

    }

}
