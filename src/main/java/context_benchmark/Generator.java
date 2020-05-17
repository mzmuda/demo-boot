package context_benchmark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Generator {


//    public static void main(String[] args) throws IOException {
//        InputStream prefixStream = Generator.class.getResourceAsStream("/prefix.xml");
//        InputStream template = Generator.class.getResourceAsStream("/template.xml");
//        String original = readFromInputStream(template);
//
//        String result = "";
//        for (int i = 0; i < 1000; i++) {
//            result += original.replace("BEAN_ID", "BEAN_ID_" + i)
//                    .replace("VALUE", "VALUE_" + i);
//        }
//        Files.writeString(Paths.get("src/main/resources/beans1000.xml"), readFromInputStream(prefixStream) + result + "</beans>");
//    }

    public static void main(String[] args) throws IOException {
        InputStream prefixStream = Generator.class.getResourceAsStream("/prefix.xml");
        InputStream template = Generator.class.getResourceAsStream("/template.xml");
        String original = readFromInputStream(template);

        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += original.replace("BEAN_ID", "BEAN_ID_" + i)
                    .replace("VALUE", "VALUE_" + i);
        }
        Files.writeString(Paths.get("src/main/resources/beans10000.xml"), readFromInputStream(prefixStream) + result + "</beans>");
    }

    private static String readFromInputStream(InputStream inputStream) {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
            return resultStringBuilder.toString();
        } catch (Exception e) {
            return null;
        }
    }
}