package olymp.task_0263;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            String[] lineAfterSplit = bufferedReader.readLine().split(" ");
            int ringSize = Integer.parseInt(lineAfterSplit[0]);
            int departure = Integer.parseInt(lineAfterSplit[1]);
            int destination = Integer.parseInt(lineAfterSplit[2]);
            int range = 0;

            if (Math.abs(departure - destination) >= ringSize / 2) {
                range = ringSize - Math.abs(departure - destination) - 1;
            } else {
                range = Math.abs(departure - destination) - 1;
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(String.valueOf(range));


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