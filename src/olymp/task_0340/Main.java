package olymp.task_0340;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            String[] line = bufferedReader.readLine().split(" ");
            int[] boxOne = new int[line.length];

            for (int i = 0; i < line.length; i++) {
                boxOne[i] = Integer.parseInt(line[i]);
            }

            line = bufferedReader.readLine().split(" ");
            int[] boxTwo = new int[line.length];

            for (int i = 0; i < line.length; i++) {
                boxTwo[i] = Integer.parseInt(line[i]);
            }

            Arrays.sort(boxOne);
            Arrays.sort(boxTwo);

            if (boxOne[0] >= boxTwo[0] && boxOne[1] >= boxTwo[1] && boxOne[2] >= boxTwo[2]) {
                if (boxOne[0] == boxTwo[0] && boxOne[1] == boxTwo[1] && boxOne[2] == boxTwo[2]) {
                    bufferedWriter.write("Boxes are equal");
                } else {
                    bufferedWriter.write("The first box is larger than the second one");
                }
            } else {
                if (boxOne[0] <= boxTwo[0] && boxOne[1] <= boxTwo[1] && boxOne[2] <= boxTwo[2]) {
                    bufferedWriter.write("The first box is smaller than the second one");
                } else {
                    bufferedWriter.write("Boxes are incomparable");
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