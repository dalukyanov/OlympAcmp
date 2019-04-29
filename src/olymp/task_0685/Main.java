package olymp.task_0685;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {

            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            String line = bufferedReader.readLine();

            String[] numbers = line.split(" ");

            int[] pricePerKilo = new int[3];
            int[] bucketsKilo = new int[3];

            for (int i = 0; i < numbers.length; i++ ) {
                if (i < numbers.length / 2) {
                    pricePerKilo[i] = Integer.parseInt(numbers[i]);
                } else {
                    bucketsKilo[i - (numbers.length / 2)] = Integer.parseInt(numbers[i]);
                }
            }

            Arrays.sort(pricePerKilo);
            Arrays.sort(bucketsKilo);

            Integer sum = 0;

            for (int i = 0; i < numbers.length / 2; i++) {
                sum = sum + pricePerKilo[i] * bucketsKilo[i];
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(sum.toString());


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
