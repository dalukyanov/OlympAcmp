package olymp.task_0108;

import java.io.*;

public class Main {

    public static void main (String[] argv) throws IOException {

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("input.txt");
            outputStream = new FileOutputStream("output.txt");

            byte[] buffer = new byte[3];

            int lenght;

            if ((lenght = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, lenght);
            }

        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

}