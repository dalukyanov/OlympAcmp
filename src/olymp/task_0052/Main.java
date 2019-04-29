package olymp.task_0052;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            String ticket = bufferedReader.readLine();
            char[] wonderNumbers = ticket.toCharArray();

            String isAWonderNumber = null;

            if (wonderNumbers[0] + wonderNumbers[1] + wonderNumbers[2] == wonderNumbers[3] + wonderNumbers[4] + wonderNumbers[5]) {
                isAWonderNumber = "YES";
            } else {
                isAWonderNumber = "NO";
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            bufferedWriter.write(isAWonderNumber);

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
