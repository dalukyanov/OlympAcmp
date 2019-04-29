package olymp.task_0529;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class Main {

    public static void main (String[] argv) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            String[] valuesInLine = bufferedReader.readLine().split(" ");

            int x1 = Integer.parseInt(valuesInLine[0]);
            int y1 = Integer.parseInt(valuesInLine[1]);
            int x2 = Integer.parseInt(valuesInLine[2]);
            int y2 = Integer.parseInt(valuesInLine[3]);

            Double dlinaOtrezka = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator('.');
            NumberFormat numberFormat = new DecimalFormat("###.#####", decimalFormatSymbols);

            bufferedWriter.write(numberFormat.format(dlinaOtrezka));

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
