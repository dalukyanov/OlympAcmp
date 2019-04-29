package olymp.task_0511;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            int position = Integer.parseInt(bufferedReader.readLine()) - 1;
            int minutesToStay = 0;

            if (position < 145) {
                if (position % 2 == 0) {
                    position = position / 2;
                    minutesToStay = position * 10;
                } else {
                    position = (position / 2) + 1;
                    minutesToStay = position * 10 - 5;
                }
                bufferedWriter.write(minutesToStay / 60 + " " + minutesToStay % 60);
            } else {
                //System.out.println(minutesToStay / 60 + " " + minutesToStay % 60);
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