package olymp.task_0043;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            char[] binaryLine = bufferedReader.readLine().toCharArray();
            int maxZeroCount = 0;
            int currentZeroCount = 0;

            for (int i = 0; i < binaryLine.length; i++) {
                int zeroOrOne = Integer.parseInt(String.valueOf(binaryLine[i]));

                if (zeroOrOne == 0) {
                    currentZeroCount++;
                    if (currentZeroCount > maxZeroCount) maxZeroCount = currentZeroCount;
                } else {
                    currentZeroCount = 0;
                }
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(String.valueOf(maxZeroCount));


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть bufferedReader..");
                    e.printStackTrace();
                }
            }

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть bufferedWriter..");
                    e.printStackTrace();
                }
            }
        }
    }
}