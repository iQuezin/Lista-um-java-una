import java.util.Scanner;

public class ListaSeis {

    public static void main(String[] args) {

        System.out.println("Lista 06 Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        double numUm = scanner.nextDouble();

        System.out.println("Digite a Base: ");
        double base = scanner.nextDouble();

        double resultado = Math.log(numUm) / Math.log(base);

        System.out.println("O resultado de" + numUm + "na base" + base + "é: " + resultado);
        scanner.close();
    }

}
