package olymp.task_0688;

import java.io.*;

public class Main {

    private static boolean tryToRunAway(int holeX, int holeY, int dogX, int dogY, double minDistance) {
            double distanceBetweenDogAndSavingHole = Math.sqrt(Math.abs(Math.pow((holeX - dogX), 2) + Math.pow((holeY - dogY) ,2)));
            if (distanceBetweenDogAndSavingHole / 2 >= minDistance) {
                return true;
            } else {
                return false;
            }
    }

    public static void main(String[] argv) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            String[] line = bufferedReader.readLine().split(" ");
            int[] gopher = new int[2];
            gopher[0] = Integer.parseInt(line[0]);
            gopher[1] = Integer.parseInt(line[1]);

            line = bufferedReader.readLine().split(" ");
            int[] dog = new int[2];
            dog[0] = Integer.parseInt(line[0]);
            dog[1] = Integer.parseInt(line[1]);

            int holes = Integer.parseInt(bufferedReader.readLine());

            int[] holesCoordinatesX = new int[holes];
            int[] holesCoordinatesY = new int[holes];

            for (int i = 0; i < holes; i++) {
                line = bufferedReader.readLine().split(" ");
                holesCoordinatesX[i] = Integer.parseInt(line[0]);
                holesCoordinatesY[i] = Integer.parseInt(line[1]);
            }

            int savingHole = -1;

            for (int i = 0; i < holes; i++) {
                double distance = Math.sqrt(Math.pow((holesCoordinatesX[i] - gopher[0]), 2) + Math.pow((holesCoordinatesY[i] - gopher[1]), 2));
                if (tryToRunAway(holesCoordinatesX[i], holesCoordinatesY[i], dog[0], dog[1], distance))
                    {
                        savingHole = i;
                        break;
                    }
            }

            if (savingHole >= 0) {
                bufferedWriter.write(String.valueOf(savingHole + 1));
            } else {
                bufferedWriter.write("NO");
            }

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