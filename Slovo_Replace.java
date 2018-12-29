import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Slovo_Replace {
    public static String slovo_replace (String filename, int nomer_stroki2, String slovo, int nomer_slova) throws IOException {
        Path path = Paths.get(filename);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        String stroka = lines.get(nomer_stroki2 - 1);
        String[] slova = stroka.split(" ");
        slova[nomer_slova - 1] = slovo;
        stroka = "";
        for (int i = 0; i < slova.length; i++) {
            if (i == slova.length - 1){
                stroka += slova[i]; break;
            }
            stroka += slova[i] + " ";
        }
        lines.set(nomer_stroki2 - 1, stroka);
        Files.write(path, lines, StandardCharsets.UTF_8);
        return nomer_slova + "-е слово в " + nomer_stroki2 + "-й строке успешно изменено\n";
    }
}
