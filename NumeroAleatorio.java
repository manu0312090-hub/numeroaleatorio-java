// exercicio 2

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Você precisa informar os limites para geração do número");
            System.exit(0);
        }

        int limiteInferior = Integer.parseInt(args[0]);
        int limiteSuperior = Integer.parseInt(args[1]);

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(limiteInferior, limiteSuperior);

        System.out.println("O número aleatório é " + numero);

          System.out.println("Emanuelle Donato");
    }
}