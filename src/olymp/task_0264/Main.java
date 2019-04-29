package olymp.task_0264;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            int countOfValues = Integer.parseInt(bufferedReader.readLine());
            String[] line = bufferedReader.readLine().split(" ");
            int[] graduses = new int[countOfValues];

            for (int i = 0; i < countOfValues; i++) {
                graduses[i] = Integer.parseInt(line[i]);
            }

            int tempMax = 0;
            int max = 0;

            for (int i = 0; i < graduses.length; i++) {
                if (graduses[i] > 0) {
                    tempMax++;
                    if (tempMax > max) {
                        max = tempMax;
                    }
                } else {
                    tempMax = 0;
                }
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(String.valueOf(max));


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