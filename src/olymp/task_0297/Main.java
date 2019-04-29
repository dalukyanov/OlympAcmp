package olymp.task_0297;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            int[] rounds = {1, 0, 0, 0, 0, 0, 1, 0, 2, 1};
            int countOfRounds = 0;
            char[] numberChars = bufferedReader.readLine().toCharArray();

            for (int i = 0; i < numberChars.length; i++) {

                for (int j = 0; j < rounds.length; j++) {
                    if (Integer.parseInt(String.valueOf(numberChars[i])) == j) {
                        countOfRounds = countOfRounds + rounds[j];
                        break;
                    }
                }
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(String.valueOf(countOfRounds));

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