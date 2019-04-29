package olymp.task_0642;

import java.io.*;
import java.util.Arrays;

public class Main {


    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            String[] splittedInput = bufferedReader.readLine().split(" ");

            int numOfCars = Integer.parseInt(splittedInput[0]);
            int money = Integer.parseInt(splittedInput[1]);

            splittedInput = bufferedReader.readLine().split(" ");

            int[] prices = new int[numOfCars];

            for (int i = 0; i < numOfCars; i++) {
                prices[i] = Integer.parseInt(splittedInput[i]);
            }

            Arrays.sort(prices);

            int sumOfPrices = 0;
            int canBuy = 0;

            for (int i = 0; i < numOfCars; i++) {
                sumOfPrices = sumOfPrices + prices[i];

                if (sumOfPrices > money) {
                    break;
                } else {
                    canBuy++;
                }
            }

            bufferedWriter.write(String.valueOf(canBuy));



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