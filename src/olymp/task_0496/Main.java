package olymp.task_0496;

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
            int[] blueberry = new int[countOfValues + 2];

            for (int i = 0; i < countOfValues; i++) {
                blueberry[i] = Integer.parseInt(line[i]);
            }
            blueberry[blueberry.length - 2] = blueberry[0];
            blueberry[blueberry.length - 1] = blueberry[1];

            int max = 0;

            for (int i = 0; i < blueberry.length - 2; i++) {
                int sumOfBerries = blueberry[i] + blueberry[i + 1] + blueberry[i + 2];
                if (sumOfBerries > max) {
                    max = sumOfBerries;
                }
            }

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