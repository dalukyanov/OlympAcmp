package olymp.task_0025;

import java.io.*;

public class Main {

    private static BufferedReader reader = null;
    private static BufferedWriter writer = null;

    private static void initializeReader(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
    }

    private static void initializeWriter(String outName) throws FileNotFoundException, UnsupportedEncodingException {
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outName), "UTF-8"));
    }

    public static void main (String[] argv) {


        try {
            initializeReader("input.txt");

            int A = Integer.parseInt(reader.readLine());
            int B = Integer.parseInt(reader.readLine());

            if (A > B) {
                System.out.println(">");
            } else if (A < B) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
