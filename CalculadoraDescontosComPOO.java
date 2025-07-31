import java.util.Scanner;
import java.util.ArrayList;

public class CalculadoraDescontosComPOO{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true){
            System.out.println("Digite o preco do produto (ou 0 para sair): ");
            double preco = entrada.nextDouble();

            if (preco == 0) {
                System.out.println("Saindo...");
                break;
            }
            if (preco <= 0) {
                System.out.println("Preco invalido. Tente novamente.");
                continue;
            }

            System.out.println("Digite o desconto (em porcentagem): ");
            double porcentagemDesconto = entrada.nextDouble();

            if (porcentagemDesconto < 0 || porcentagemDesconto > 100) {
                System.out.println("Porcentagem de desconto invalida. Tente novamente.");
                continue;
            }

            Produto produto = new Produto(preco, porcentagemDesconto);
            produtos.add(produto);

            System.out.printf("Preco original: R$ %.2f\n", produto.getPreco());
            System.out.printf("Desconto aplicado: %.2f%%\n", produto.getPorcentagemDesconto());
            System.out.printf("Desconto: R$ %.2f\n", produto.calcularDesconto());
            System.out.printf("Preco final com desconto: R$ %.2f\n", produto.calcularPrecoFinal());
            System.out.printf("Preco final com desconto arredondado: R$ %.2f\n", produto.calcularPrecoFinalArredondado());
            System.out.println();
        }
        System.out.println("Precos finais com desconto:");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.printf("Produto %d: R$ %.2f\n", i + 1, produto.calcularPrecoFinal());
        }

        double totalPrecosFinais = 0;

        for (Produto produto : produtos) {
            totalPrecosFinais += produto.calcularPrecoFinal();
        }
        if (totalPrecosFinais > 0) {
            System.out.printf("Total dos precos finais: R$ %.2f\n", totalPrecosFinais);
        } else {
            System.out.println("Nenhum preco final foi calculado.");
        }

        entrada.close();
        
    }
}