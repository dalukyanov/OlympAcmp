package olymp.task_0324;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {

            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            char[] symbols = null;
            symbols = bufferedReader.readLine().toCharArray();
            String palindrome = "YES";

            if ( symbols[0] == symbols[3] && symbols[1] == symbols[2] ) {
                palindrome = "YES";
            } else {
                palindrome = "NO";
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(palindrome);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть bufferedReader");
                    e.printStackTrace();
                }
            }

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть bufferedWriter");
                    e.printStackTrace();
                }
            }
        }
    }
}
