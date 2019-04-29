package olymp.task_0021;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] argv) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        new HashMap();

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            String line;
            String[] splittedLine;

            while ((line = reader.readLine()) != null && !line.isEmpty() ) {
                splittedLine = line.split(" ");

                int A = Integer.parseInt(splittedLine[0]);
                int B = Integer.parseInt(splittedLine[1]);
                int C = Integer.parseInt(splittedLine[2]);

                if (A > B) {
                    int temp = A;
                    A = B;
                    B = temp;
                }

                if (A > C) {
                    int temp = A;
                    A = C;
                    C = temp;
                }

                if (B > C) {
                    int temp = B;
                    B = C;
                    C = temp;
                }

                Integer result = C - A;

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
