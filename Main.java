import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("INPUT.TXT");
        File output = new File("OUTPUT.TXT");
        if(!input.exists())
            input.createNewFile();
        if(!output.exists())
            output.createNewFile();
        try {
            BufferedReader in = new BufferedReader(new FileReader(input.getAbsoluteFile()));
            PrintWriter out = new PrintWriter(output.getAbsoluteFile());
            String s = in.readLine();
            byte counter = 0, max = 0;
            for (char c : s.toCharArray()) {
                if (c == '1')
                    counter++;
                else {
                    if (counter > max)
                        max = counter;
                    counter = 0;
                }
            }
            if (counter > max)
                max = counter;
            try {
                out.write(String.valueOf(max));
            } finally {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}