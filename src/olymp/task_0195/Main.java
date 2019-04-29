package olymp.task_0195;

import java.io.*;

public class Main {

    public static void main (String[] argv) {

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            String line = null;
            String[] splittedLine = null;

            while ((line = reader.readLine()) != null && !line.isEmpty() ) {
                splittedLine = line.split(" ");

                int N = Integer.parseInt(splittedLine[0]);
                int A = Integer.parseInt(splittedLine[1]);
                int B = Integer.parseInt(splittedLine[2]);

                Integer result = N * A * B * 2;

                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
                writer.write(result.toString());

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть reader");
                    e.printStackTrace();
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть writer");
                    e.printStackTrace();
                }
            }
        }

    }
}
