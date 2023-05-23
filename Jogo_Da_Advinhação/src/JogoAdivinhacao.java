import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório de 1 a 100
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número de 1 a 100.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (!acertou) {
                System.out.print("Digite um número: ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite == numeroAleatorio) {
                    acertou = true;
                } else if (palpite < numeroAleatorio) {
                    System.out.println("Tente um número maior!");
                } else {
                    System.out.println("Tente um número menor!");
                }
            }
        }

        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
    }
}