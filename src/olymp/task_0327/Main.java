package olymp.task_0327;

import java.io.*;

public class Main {

    public static boolean isAMagicNumber(String numberString) {

        char[] numbers = numberString.toCharArray();
        int sumOfFirstTriple = 0;
        int sumOfLastTriple = 0;

        for (int j = 0; j < numbers.length; j++) {
            if (j < numbers.length / 2) {
                sumOfFirstTriple = sumOfFirstTriple + Integer.parseInt(String.valueOf(numbers[j]));
            } else {
                sumOfLastTriple = sumOfLastTriple + Integer.parseInt(String.valueOf(numbers[j]));
            }

        }

        if ( (sumOfFirstTriple - sumOfLastTriple) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            int countOfTickets = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < countOfTickets; i++) {
                int ticket = Integer.parseInt(bufferedReader.readLine());

                if (isAMagicNumber(String.format("%06d", ticket + 1)) || isAMagicNumber(String.format("%06d", ticket - 1))) {
                    bufferedWriter.append("Yes");
                    bufferedWriter.newLine();
                } else {
                    bufferedWriter.append("No");
                    bufferedWriter.newLine();
                }

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