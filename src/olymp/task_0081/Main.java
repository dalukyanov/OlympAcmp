package olymp.task_0081;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            int numOfValues = Integer.parseInt(bufferedReader.readLine());
            String[] melonsString = bufferedReader.readLine().split(" ");
            int[] melons = new int[numOfValues];

            Integer smallest = Integer.MAX_VALUE;
            Integer biggest = Integer.MIN_VALUE;

            for (int i = 0; i < melonsString.length; i++) {
                melons[i] = Integer.parseInt(melonsString[i]);

                if (melons[i] < smallest) smallest = melons[i];
                if (melons[i] > biggest) biggest = melons[i];
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(smallest.toString() + " " + biggest.toString());


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
