/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Final Value of Variable After Performing Operations");

        Solution solution = new Solution();


        String[] sentences1 =  {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};      
        int output1 = solution.mostWordsFound(sentences1);
        System.out.println("Output = " + output1);


        String[] sentences2 =  {"please wait", "continue to fight", "continue to win"};      
        int output2 = solution.mostWordsFound(sentences2);
        System.out.println("Output = " + output2);
    



    }
}
