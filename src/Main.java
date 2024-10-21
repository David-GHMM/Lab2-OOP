import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hапишите шестнадцетиричный идентификатор цвета в HTML для проверки его корректности: ");
        String code = in.nextLine().toLowerCase();

        Pattern pattern = Pattern.compile("#[a-f0-9]{6}");
        Matcher matcher = pattern.matcher(code);

        if (matcher.matches())
        {
            System.out.println("Отлично, введенный текст является шестнадцетиричным индетификатором!");
        }
        else
        {
            System.out.println("Введенный текст не является шестнадцетиричным индетификатором...");
        }
    }
}

