import java.util.Scanner;

public class QuantidadeVogais
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String str = sc.nextLine();
        int vogais = 0;
        // contar numero de vogais
        // exemplo:
        if (str.charAt(0) == 'a')
        {
            vogais++;
        }
        System.out.println("Sua frase tem " + vogais + " vogais");
    }
}
