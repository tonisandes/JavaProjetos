import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraDescontosComLista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> precosFinais = new ArrayList<>();

        while (true) {
            System.out.println("Digite o preço do produto (ou 0 para sair): ");
            double preco = entrada.nextDouble();

            if (preco == 0) {
                System.out.println("Saindo...");
                break;
            }
            if (preco <= 0) {
                System.out.println("Preço inválido. Tente novamente.");
                continue;
            }
            System.out.println("Digite o desconto (em porcentagem): ");
            double porcentagemDesconto = entrada.nextDouble();

            if (porcentagemDesconto < 0 || porcentagemDesconto > 100) {
                System.out.println("Porcentagem de desconto inválida. Tente novamente.");
                continue;
            }

            double desconto = preco * porcentagemDesconto / 100;
            double precoFinal = preco - desconto;
            int precoFinalArredondado = (int) Math.round(precoFinal);

            System.out.printf("Preço original: R$ %.2f\n", preco);
            System.out.printf("Desconto aplicado: %.2f%%\n", porcentagemDesconto);
            System.out.printf("Desconto: R$ %.2f\n", desconto);
            System.out.printf("Preço final com desconto: R$ %.2f\n", precoFinal);
            System.out.printf("Preço final com desconto arredondado: R$ %d\n", precoFinalArredondado);
            System.out.println(); // Linha em branco

            precosFinais.add(precoFinal);
        }

        System.out.println("Preços finais com desconto:");
        for (int i = 0; i < precosFinais.size(); i++) {
            System.out.printf("Produto %d: R$ %.2f\n", i + 1, precosFinais.get(i));
        }

        double totalPrecosFinais = 0;
        for (double precoFinal : precosFinais) {
            totalPrecosFinais += precoFinal;
        }
        if (totalPrecosFinais > 0) {
            System.out.printf("Total dos preços finais: R$ %.2f\n", totalPrecosFinais);
        } else {
            System.out.println("Nenhum preço final foi calculado.");
        }

        entrada.close();
    }
}