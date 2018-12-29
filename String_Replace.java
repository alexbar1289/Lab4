import java.util.List;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
public class String_Replace {
    public static String string_replace (String filename, int nomer_stroki, String stroka_zamen) throws IOException{
        Path path = Paths.get(filename);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        lines.set(nomer_stroki - 1, stroka_zamen);
        Files.write(path, lines, StandardCharsets.UTF_8);
        return "Строка успешно изменена\n";
    }
}
