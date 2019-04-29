package olymp.task_0554;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            int cuts = Integer.parseInt(bufferedReader.readLine());
            int pieces = 1;

            for (int i = 1; i <= cuts; i++) {
                pieces = pieces + i;
            }

            bufferedWriter.write(String.valueOf(pieces));


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