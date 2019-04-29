package olymp.task_0637;

import java.io.*;

public class Main {

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));


            /*
            * Инициализация переменных из входного файла
            *
            * */
            int universities = Integer.parseInt(bufferedReader.readLine());
            String[] commandsInUsityString = bufferedReader.readLine().split(" ");
            int[] commandsInUsity = new int[universities];
            int sumOfCommands = 0;

            for (int i = 0; i < commandsInUsityString.length; i++) {
                commandsInUsity[i] = Integer.parseInt(commandsInUsityString[i]);
            }

            int halls = Integer.parseInt(bufferedReader.readLine());


            for (int i = 0; i < commandsInUsityString.length; i++) {
                if (commandsInUsity[i] > halls) {
                    sumOfCommands = sumOfCommands + halls;
                } else {
                    sumOfCommands = sumOfCommands + commandsInUsity[i];
                }
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            bufferedWriter.write(String.valueOf(sumOfCommands));



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