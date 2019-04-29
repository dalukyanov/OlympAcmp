package olymp.task_0293;

import java.io.*;

public class Main {


    public static void main(String[] argv) {

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            int count = Integer.parseInt(bufferedReader.readLine());

            String[] inputValues = bufferedReader.readLine().split(" ");
            int[] profits = new int[count];
            int[] taxes = new int[count];

            for (int i = 0; i < count; i++) {
                profits[i] = Integer.parseInt(inputValues[i]);
            }

            inputValues = bufferedReader.readLine().split(" ");

            for (int i = 0; i < count; i++) {
                taxes[i] = Integer.parseInt(inputValues[i]);
            }

            double max = 0;
            int firm = 0;

            for (int i = count - 1; i >= 0; i--) {
                double currentTax = (double) (profits[i] * taxes[i]) / 100;

                if (max <= currentTax) {
                    max = currentTax;
                    firm = i;
                }
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(String.valueOf(firm + 1));


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