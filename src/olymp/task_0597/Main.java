package olymp.task_0597;

import java.io.*;
import java.nio.charset.Charset;

public class Main {

    public static void main (String[] argv) throws IOException {
        BufferedReader reader = null;

        long r1,r2,r3;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("input.txt"), Charset.forName("UTF-8")));
            String line;
            while ((line = reader.readLine()) != null) {

                String[] values = line.split(" ");

                r1 = Long.parseLong(values[0]);
                r2 = Long.parseLong(values[1]);
                r3 = Long.parseLong(values[2]);
                String result = null;

                if (r2 + r3 <= r1) {
                    result = "YES";
                } else {
                    result = "NO";
                }


                FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "UTF-8"));
                try {
                    bufferedWriter.append(result);
                    bufferedWriter.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        bufferedWriter.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    try {
                        fileOutputStream.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }


            }




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}