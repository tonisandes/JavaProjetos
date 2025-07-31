import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        double valorProduto = entrada.nextDouble();
        
        System.out.println("Digite a porcentagem de desconto: ");
        double valorDesconto = entrada.nextDouble();

        if (valorDesconto < 0 || valorDesconto > 100) {
            System.out.println("Porcentagem de desconto inválida. Deve estar entre 0 e 100.");
            return;
        }
        double desconto = valorProduto * valorDesconto / 100;

        double valorFinal = valorProduto - desconto;

        int valorFinalInteiro = (int)(valorProduto - (valorProduto * valorDesconto / 100));

        System.out.printf("Valor do produto: %.2f\n", valorProduto);
        System.out.printf("Valor do desconto: %.2f\n ", desconto);
        System.out.printf("Valor final após desconto: %.2f\n ", valorFinal);
        System.out.println("Valor final após desconto (inteiro): " + valorFinalInteiro);


        entrada.close();
    }
}
