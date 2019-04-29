package olymp.task_0002;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            int number = Integer.parseInt(bufferedReader.readLine());
            int sum = 1;

            if (number >= 0) {
                for (int i = 2; i <= number; i++) {
                    sum = sum + i;
                }
            } else {
                for (int i = 0; i >= number; i--) {
                    sum = sum + i;
                }
            }

            bufferedWriter.write(String.valueOf(sum));

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