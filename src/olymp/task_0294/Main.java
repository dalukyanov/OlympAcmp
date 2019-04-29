package olymp.task_0294;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            String[] line = bufferedReader.readLine().split(" ");
            double countBolt = Double.parseDouble(line[0]);
            double percentBolt = Double.parseDouble(line[1]);
            double priceBolt = Double.parseDouble(line[2]);

            line = bufferedReader.readLine().split(" ");
            double countGaika = Double.parseDouble(line[0]);
            double percentGaika = Double.parseDouble(line[1]);
            double priceGaika = Double.parseDouble(line[2]);

/*
            System.out.println("Число болтов: " + countBolt + "; Процент утеряно: " + percentBolt + "; Стоимость болта: " + priceBolt);
            System.out.println("Число гаек:   " + countGaika + "; Процент утеряно: " + percentGaika + "; Стоимость гайки: " + priceGaika);

            System.out.println("Болтов утеряно: " + countBolt*percentBolt/100);
            System.out.println("Гаек утеряно  : " + countGaika*percentGaika/100);
*/

            double dopPotery = 0;

                if (countBolt * percentBolt / 100 > countGaika * percentGaika / 100) {

                    dopPotery = Math.abs((countBolt - countBolt * percentBolt / 100) - (countGaika - countGaika * percentGaika / 100)) * priceBolt;
                } else {
                    dopPotery = Math.abs((countBolt - countBolt * percentBolt / 100) - (countGaika - countGaika * percentGaika / 100)) * priceGaika;
                }

/*
            System.out.println("Основные потери болтов: " + countBolt*percentBolt/100*priceBolt);
            System.out.println("Основные потери гаек  : " + countGaika*percentGaika/100*priceGaika);
            System.out.println("Дополнительные потери : " + dopPotery);
            System.out.println("Суммарные потери      : " + (countBolt*percentBolt/100*priceBolt + countGaika*percentGaika/100*priceGaika + dopPotery));
*/

                double totalLost = countBolt * percentBolt / 100 * priceBolt + countGaika * percentGaika / 100 * priceGaika + dopPotery;

                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
                bufferedWriter.write(String.format("%.0f", totalLost));

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