package task1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ReadFile {
    public static void read() throws IOException {
        List<String> strings = Files.readAllLines(Path.of("src/task1/example.txt"));
        int maxValue = 0;
        String convertString = "";
        for (int i = 0; i < strings.size(); i++) {
            String[] split = strings.get(i).split(" ");
            for (int j = 0; j < split.length; j++) {

               if (split[j].length() > maxValue){
                   maxValue = split[j].length();
                   convertString = split[j];

               }

            }

        }
        System.out.println("длина строки = " + maxValue + " слово = " + convertString);
        Files.writeString(Path.of("src/task1/log.txt"), convertString, StandardOpenOption.APPEND);
    }

}

