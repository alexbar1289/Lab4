import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите путь к файлу:\n");
        String filename = reader1.readLine();
        PrintWriter writer = new PrintWriter(filename, "UTF-8");
        System.out.println("Введите первую строку для записи в файл\n");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader2.readLine();
        System.out.println("Введите вторую строку для записи в файл\n");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String stroka2 = reader3.readLine();
        System.out.println("Введите третью строку для записи в файл\n");
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        String stroka3 = reader4.readLine();
        writer.println(stroka);
        writer.println(stroka2);
        writer.println(stroka3);
        writer.close();
        System.out.println("Текст успешно записан в файл\n");

        System.out.println("Какую строку вы хотите поменять?\n");
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        String nomer = reader5.readLine();
        int nomer_stroki = Integer.parseInt(nomer);
        System.out.println("Введите строку на замен " + nomer_stroki + "-й строки\n");
        BufferedReader reader6 = new BufferedReader(new InputStreamReader(System.in));
        String stroka_zamen = reader6.readLine();
        System.out.println(String_Replace.string_replace(filename, nomer_stroki, stroka_zamen));//вызываем метод для замены определенной строки

        System.out.println("В какой строке вы хотите поменять слово?\nВведите номер строки");
        BufferedReader reader7 = new BufferedReader(new InputStreamReader(System.in));
        String nomer2 = reader7.readLine();
        int nomer_stroki2 = Integer.parseInt(nomer2);
        System.out.println("Какое слово вы хотите поменять?\nВведите номер слова");
        BufferedReader reader8 = new BufferedReader(new InputStreamReader(System.in));
        String nomer3 = reader8.readLine();
        int nomer_slova = Integer.parseInt(nomer3);
        System.out.println("Введите слово на замен\n");
        BufferedReader reader9 = new BufferedReader(new InputStreamReader(System.in));
        String slovo = reader9.readLine();
        System.out.println(Slovo_Replace.slovo_replace(filename, nomer_stroki2, slovo, nomer_slova));//вызываем метод для замены определенного слова в определенной строке

    }
}
