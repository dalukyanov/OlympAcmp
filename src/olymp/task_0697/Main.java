package olymp.task_0697;

import java.io.*;

public class Main {

    public static void main (String[] argv) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            String[] valuesInLine = bufferedReader.readLine().split(" ");

            int L = Integer.parseInt(valuesInLine[0]);
            int W = Integer.parseInt(valuesInLine[1]);
            int H = Integer.parseInt(valuesInLine[2]);

            Long result = 0L;

            if ( 2 * (L*H + W*H) % 16 == 0) {
                result = (long) (2 * (L*H + W*H) / 16);
            } else {
                result = (long) (2 * (L*H + W*H) / 16) + 1;
            }

            bufferedWriter.write(result.toString());

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
