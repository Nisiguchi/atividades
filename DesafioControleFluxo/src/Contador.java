import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite um segundo número");
        int parametroDois = terminal.nextInt();

        try {
             contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
                System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois -parametroUm;
        for (int i =1; i <= contagem; i++) {
            System.out.println("Imprimindo número: " + i);
        }
    }
}
