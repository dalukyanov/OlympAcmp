package olymp.task_0692;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            Integer number = Integer.parseInt(bufferedReader.readLine());
            Integer test = 0;
            String binaryOrNot = "NO";

            while (number > 1) {


                if (number % 2 == 0) {
                    number = number / 2;
                    binaryOrNot = "YES";
                    continue;

                } else {
                    binaryOrNot = "NO";
                    break;
                }
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            bufferedWriter.write(binaryOrNot);


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
