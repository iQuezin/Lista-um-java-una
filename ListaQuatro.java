import java.util.Scanner;

public class ListaQuatro {

    public static void main(String[] args) {

        System.out.println("Lista 04 Kayque dos Santos Almeida / RA: 4231923060.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CAPITAL: ");
        double capitalApli = scanner.nextInt();

        System.out.println("Digite a TAXA DE JUROS ANUAL: ");
        double taxaJuros = scanner.nextInt();

        System.out.println("Digite os MESES DECORRIDOS: ");
        double mesesDeco = scanner.nextInt();

        double taxaPorc = taxaJuros / 100;

        double montanteReceb = capitalApli * Math.pow(1 + taxaPorc, mesesDeco);

        System.out.println("O valor a ser recebido é: " + montanteReceb);
        scanner.close();
    }

}
