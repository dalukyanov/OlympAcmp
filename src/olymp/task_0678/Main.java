package olymp.task_0678;

import java.io.*;

public class Main {
    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            char[] listOfMoves = bufferedReader.readLine().toCharArray();
            int position[] = {1,0,0};
            int temp = 0;
            int finalPosition = 0;

            for (int i = 0; i < listOfMoves.length; i++) {
                switch (listOfMoves[i]) {
                    case 'A':
                        temp = position[1];
                        position[1] = position[0];
                        position[0] = temp;
                        break;
                    case 'B':
                        temp = position[2];
                        position[2] = position[1];
                        position[1] = temp;
                        break;
                    case 'C':
                        temp = position[0];
                        position[0] = position[2];
                        position[2] = temp;
                        break;
                }
            }

            for (int i = 0; i < position.length; i++) {
                if (position[i] == 1)
                    finalPosition = i+1;
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(String.valueOf(finalPosition));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть bufferedReader..");
                    e.printStackTrace();
                }
            }

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть bufferedWriter..");
                    e.printStackTrace();
                }
            }
        }
    }
}