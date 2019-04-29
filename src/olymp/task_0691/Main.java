package olymp.task_0691;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            int countOfLines = Integer.parseInt(bufferedReader.readLine());
            String line;
            String numberPattern = "[A,B,C,E,H,K,M,O,P,T,X,Y]{1}\\d{3}[A,B,C,E,H,K,M,O,P,T,X,Y]{2}";

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            for (int i = 0; i < countOfLines; i++) {
                line = bufferedReader.readLine();

                if (line.matches(numberPattern)) {
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