package olymp.task_0675;

import java.io.*;

public class Main {


    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            String[] line = bufferedReader.readLine().split(" ");
            int height = Integer.parseInt(line[0]);
            int width = Integer.parseInt(line[1]);

            int min = width;
            int countInLine;

            for (int i = 0; i < height; i++) {
                countInLine = 0;
                char[] row = bufferedReader.readLine().toCharArray();
                for (int j = 0; j < row.length; j++) {
                    if (row[j] == '.') {
                        countInLine++;
                    }
                }
                if (countInLine < min) {
                    min = countInLine;
                }
            }

            bufferedWriter.write(String.valueOf(min));

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