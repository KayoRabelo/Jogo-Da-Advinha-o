import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um n�mero aleat�rio de 1 a 100
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinha��o!");
        System.out.println("Tente adivinhar o n�mero de 1 a 100.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (!acertou) {
                System.out.print("Digite um n�mero: ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite == numeroAleatorio) {
                    acertou = true;
                } else if (palpite < numeroAleatorio) {
                    System.out.println("Tente um n�mero maior!");
                } else {
                    System.out.println("Tente um n�mero menor!");
                }
            }
        }

        System.out.println("Parab�ns! Voc� acertou o n�mero em " + tentativas + " tentativas.");
    }
}