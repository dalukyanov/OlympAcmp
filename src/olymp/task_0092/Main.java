package olymp.task_0092;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            Integer cranesMade = Integer.parseInt(bufferedReader.readLine());
            Integer madeByPetya = cranesMade / 6;
            Integer madeByKatya = cranesMade * 4/6;
            Integer madeBySeryozha = cranesMade / 6;

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            bufferedWriter.write(madeByPetya + " " + madeByKatya + " " + madeBySeryozha);

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
