package olymp.task_0005;

import java.io.*;

public class Main {
    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            int countOfValues = Integer.parseInt(bufferedReader.readLine());

            String[] daysString = bufferedReader.readLine().split(" ");
            int[] days = new int[countOfValues];
            int countOfThrees = 0;
            int countOfFours = 0;

            for(int i = 0; i < countOfValues; i++) {
                days[i] = Integer.parseInt(daysString[i]);
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            for (int i = 0; i < days.length; i++) {
                if (days[i] % 2 != 0) {
                    bufferedWriter.append(days[i] + " ");
                    countOfThrees++;
                }
            }
            bufferedWriter.newLine();

            for (int i = 0; i < days.length; i++) {
                if (days[i] % 2 == 0) {
                    bufferedWriter.append(days[i] + " ");
                    countOfFours++;
                }
            }
            bufferedWriter.newLine();

            if (countOfFours >= countOfThrees) {
                bufferedWriter.append("YES");
            } else {
                bufferedWriter.append("NO");
            }

            bufferedWriter.flush();

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