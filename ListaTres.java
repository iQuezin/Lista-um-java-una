import java.util.Scanner;

public class ListaTres {

    public static void main(String[] args) {

        System.out.println("Lista 03 Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o número de graus em Fahrenheit: ");
        double numFa = scanner.nextInt();

        double numCent = (numFa - 32) * 5 / 9;

        System.out.println("A temperatura em graus Celsius é de: " + numCent);
        scanner.close();
    }
}