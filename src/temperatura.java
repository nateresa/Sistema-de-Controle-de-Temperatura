import java.util.Scanner;
public class temperatura {
    public static void main(String[] args) {
        double temperatura = 25.0;
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            // menu
            System.out.println("1- Ver temperatura atual");
            System.out.println("2- Aumentar temperatura");
            System.out.println("3- Diminuir temperatura");
            System.out.println("4- Definir temperatura");
            System.out.println("5- Sair");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Temperatura atual: " + temperatura);
            } else if (opcao == 2) {
                temperatura++;
                System.out.println(temperatura);
                if (temperatura >= 31.0) {
                    System.out.println("Temperatura acima do permitido!");
                    temperatura = 31.0;
                } else if (temperatura >= 28.0) {
                    System.out.println("Ambiente muito quente.");
                }
            } else if (opcao == 3) {
                temperatura--;
                System.out.println(temperatura);
                if (temperatura < 16.0) {
                    System.out.println("Temperatura abaixo do permitido!");
                    temperatura = 16.0;
                } else if (temperatura <= 18.0) {
                    System.out.println("Ambiente muito frio.");
                }
            } else if (opcao == 4) {
                System.out.println("Qual a temperatura desejada? ");
                temperatura = sc.nextDouble();
                System.out.println(temperatura);
            } else if (opcao == 5) {
                System.out.println("Saindo... ");
            } else {
                System.out.println("Opção inválida!");

            }
        }
        sc.close();
    }
}
