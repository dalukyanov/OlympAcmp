package olymp.task_0026;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            String[] line = bufferedReader.readLine().split(" ");
            int x1 = Integer.parseInt(line[0]);
            int y1 = Integer.parseInt(line[1]);
            int r1 = Integer.parseInt(line[2]);

            line = bufferedReader.readLine().split(" ");
            int x2 = Integer.parseInt(line[0]);
            int y2 = Integer.parseInt(line[1]);
            int r2 = Integer.parseInt(line[2]);;


            int x = x2 - x1;
            int y = y2 - y1;

            double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            if ( (r1 + r2) >= r && (r + r2) >= r1 && (r + r1) >= r2) {
                bufferedWriter.write("YES");
            } else {
                bufferedWriter.write("NO");
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