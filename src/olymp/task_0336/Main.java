package olymp.task_0336;

import java.io.*;

public class Main {


    public static void main(String[] argv) {

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            int maxLevel = 0;
            int minLevel = 0;
            int currentLevel = 0;

            char[] chars = bufferedReader.readLine().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (Character.getNumericValue(chars[i]) == 1) {
                    currentLevel++;
                    if (currentLevel > maxLevel) {
                        maxLevel = currentLevel;
                    }
                } else if (Character.getNumericValue(chars[i]) == 2) {
                    currentLevel--;
                    if (currentLevel < minLevel) {
                        minLevel = currentLevel;
                    }
                }
            }


            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            bufferedWriter.write(String.valueOf(Math.abs(maxLevel - minLevel) + 1));



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