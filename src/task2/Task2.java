package task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void Doc() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String printTask = scanner.nextLine();
        List<String> strings = Files.readAllLines(Path.of(printTask));
        for (int i = 0; i < strings.size(); i++) {
            String[] split = strings.get(i).split(" ");
            for (int j = 0; j < split.length; j++) {

                if ((split[j].startsWith("docnum")||split[j].startsWith("content")) && split[j].matches("\\w{1,15}"))   {

                    Files.writeString(Path.of("src/task2/result-good.txt"),split[j]+"\n", StandardOpenOption.APPEND);


                }
                else {
                    Files.writeString(Path.of("src/task2/result-faild.txt"),split[j]+"\n", StandardOpenOption.APPEND);
                }

            }

        }
    }
}
