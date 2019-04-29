package olymp.task_0066;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;

        try {

            inputStreamReader = new InputStreamReader(new FileInputStream("input.txt"));

            String keyboardKeys = "qwertyuiopasdfghjklzxcvbnm";
            char[] keyboardArr = keyboardKeys.toCharArray();
            char symbol = (char) inputStreamReader.read();
            char result = 0;

            for (int i = 0; i < keyboardArr.length; i++) {
                if (symbol == keyboardArr[i] && i < keyboardArr.length - 1) {
                    result = keyboardArr[i + 1];
                    break;
                } else {
                    result = keyboardArr[0];
                }
            }

            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("output.txt"));
            outputStreamWriter.write(result);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть bufferedReader");
                    e.printStackTrace();
                }
            }

            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть bufferedWriter");
                    e.printStackTrace();
                }
            }
        }
    }
}
