import java.util.Scanner;

public class CalculadoraDescontosMultiplos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double totalPrecosFinais = 0;

        while (true){
            System.out.println("Digite o valor do produto: ");
            double valorProduto = entrada.nextDouble();

            if (valorProduto == 0 ){
                System.out.println("Encerrando o programa ...");
                break;
            }
            if (valorProduto < 0 ){
                System.out.println("Valor do produto deve ser maior que 0");
                continue;
            }
            System.out.println("Digite a porcentagem de desconto (ex: 10 para 10%): ");
            double porcentagemDesconto = entrada.nextDouble();

            if (porcentagemDesconto < 0 || porcentagemDesconto > 100 ){
                System.out.println("Erro: Desconto deve estar entre 0 e 100%");
                continue;
            }

            double desconto = valorProduto * porcentagemDesconto / 100;
            double valorFinal = valorProduto - desconto;

            int valorFinalInteiro = (int)valorFinal;

            System.out.printf("Preco do Produto: %.2f\n", valorProduto);
            System.out.printf("Valor do Desconto: %.2f\n", desconto);
            System.out.printf("Valor Final do produto %.2f\n", valorFinal);

            System.out.println("Valor Final do Produto arredondado: R$" + valorFinalInteiro + ",00");

            totalPrecosFinais += valorFinal;
            
        }
        System.out.printf("Total de todos os preços finais: R$ %.2f\n", totalPrecosFinais);

        entrada.close();


    }
}
