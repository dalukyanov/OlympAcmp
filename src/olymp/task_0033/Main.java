package olymp.task_0033;

import java.io.*;

public class Main {

    public static void main (String[] argv) {

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

            String line = null;
            String[] splittedLine = null;

            while ((line = reader.readLine()) != null && !line.isEmpty() ) {
                splittedLine = line.split(" ");

                int shotByHarry = Integer.parseInt(splittedLine[0]);
                int shotByLarry = Integer.parseInt(splittedLine[1]);

                Integer notShotByHarry = shotByLarry - 1;
                Integer notShotByLarry = shotByHarry - 1;


                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
                writer.write(notShotByHarry.toString() + " " + notShotByLarry.toString());

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть reader");
                    e.printStackTrace();
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Не могу закрыть writer");
                    e.printStackTrace();
                }
            }
        }


    }
}
