/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {


    public int mostWordsFound(String[] sentences) {

        int maxWords = 0;

        // For loop is used for traversing the array
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            int numWords = words.length;
            if (numWords > maxWords) {
                maxWords = numWords;
            }
        }
        
        return maxWords;
        
    }

}
