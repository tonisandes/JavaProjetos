import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        
        double celsius = entrada.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        int fahrenheitInteiro = (int)fahrenheit;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        String mensagem  = "Temperatura em Fahrenheit: " + fahrenheit + "°F";
        String mensagemArredondada =  "Temperatura em Fahrenheit: " + fahrenheitInteiro + "°F";

        System.out.println(mensagem);
        System.out.println(mensagemArredondada);

        entrada.close();
    }
}
