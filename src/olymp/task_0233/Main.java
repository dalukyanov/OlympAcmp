package olymp.task_0233;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            int numOfValues = Integer.parseInt(bufferedReader.readLine());
            int[] heightsOfBridges = new int[numOfValues];
            String[] heightsOfBrigesString = bufferedReader.readLine().split(" ");
            int roadIncident = 0;

            for (int i = 0; i < heightsOfBridges.length; i++) {
                heightsOfBridges[i] = Integer.parseInt(heightsOfBrigesString[i]);

                if (heightsOfBridges[i] <= 437) {
                    roadIncident = i+1;
                    break;
                }
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            if (roadIncident > 0) {
                bufferedWriter.write("Crash " + roadIncident);
            } else {
                bufferedWriter.write("No crash");
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
