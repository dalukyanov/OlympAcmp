package olymp.task_0003;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            Long number = Long.parseLong(bufferedReader.readLine());
            Long result = 0L;

            if (number != 0) {
                result = (((number - 5) / 10) * (((number - 5) / 10) + 1)) * 100 + 25;
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
