package file_and_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FileOpener {

    public static String readFileName () {
        String result = " ";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            System.out.println("Enter name of file: ");
            if (!((line = reader.readLine()) == null)) result = line;
        } catch (IOException e) {
            System.out.println("Wrong input!");
        }

        return result;
    }

    public static List<String> readFile (String fileName) {
        ArrayList<String> result = new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName), StandardCharsets.UTF_8).forEach(s -> {
                s = s.toUpperCase(Locale.ENGLISH).replaceAll("[^A-Z]", " ");
                result.add(s);
            });
        } catch (IOException e) {
            System.out.println("No such file!!! Please restart application!");
        }

        return result;
    }
}
