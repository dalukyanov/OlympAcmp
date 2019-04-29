package olymp.task_0010;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            String[] line = bufferedReader.readLine().split(" ");
            int A = Integer.parseInt(line[0]);
            int B = Integer.parseInt(line[1]);
            int C = Integer.parseInt(line[2]);
            int D = Integer.parseInt(line[3]);

            for (int x = -100; x <= 100; x++ ) {
                if (A*Math.pow(x, 3) + B*Math.pow(x, 2) + C*x + D == 0) {
                    bufferedWriter.write(String.valueOf(x) + " ");
                }
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