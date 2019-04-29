package olymp.task_0062;

import java.io.*;

public class Main {
    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            char[] cell = bufferedReader.readLine().toCharArray();
            char[] letters = {'A','B','C','D','E','F','G','H'};
            int letter = 0;
            int number = Integer.parseInt(String.valueOf(cell[1]));

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == cell[0]) {
                    letter = i;
                    break;
                }
            }

            String color = null;

            if ( (letter % 2 != 0 && number % 2 == 0) || (letter % 2 == 0) && (number % 2 != 0) ) {
                color = "BLACK";
            } else {
                color = "WHITE";
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(color);

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