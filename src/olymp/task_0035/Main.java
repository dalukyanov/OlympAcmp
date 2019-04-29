package olymp.task_0035;

import java.io.*;

public class Main {

    public static void main (String[] argv) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            Integer lineCounts = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < lineCounts; i++) {
                String[] valuesInLine = bufferedReader.readLine().split(" ");
                Long n = Long.parseLong(valuesInLine[0]);
                Long m = Long.parseLong(valuesInLine[1]);

                Long result = 19*m + (n + 239)*(n + 366) / 2;

                bufferedWriter.write(result.toString());
                bufferedWriter.newLine();
            }

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
