package olymp.task_0106;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            Integer lineCount = Integer.parseInt(bufferedReader.readLine());
            Integer reshka = 0;
            Integer result = 0;

            for (int i = 0; i < lineCount; i++) {
                if (Integer.parseInt(bufferedReader.readLine()) == 0) {
                    reshka++;
                }
            }

            if (reshka <= lineCount-reshka) {
                result = reshka;
            } else {
                result = lineCount - reshka;
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

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
                    System.err.println("Не могу закрыть reader");
                    e.printStackTrace();
                }
            }

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть writer");
                    e.printStackTrace();
                }
            }
        }

    }
}
