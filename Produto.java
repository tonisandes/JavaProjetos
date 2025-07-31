public class Produto{
    private double preco;
    private double porcentagemDesconto;

    public Produto(double preco, double porcentagemDesconto) {
        this.preco = (preco > 0) ? preco : 0;
        this.porcentagemDesconto = (porcentagemDesconto >= 0 && porcentagemDesconto <= 100 ? porcentagemDesconto : 0);
    }

    public double calcularDesconto() {
        return preco * porcentagemDesconto / 100;
    }

    public double calcularPrecoFinal() {
        return preco - calcularDesconto();
    }

    public double calcularPrecoFinalArredondado() {
        return (int) Math.round(calcularPrecoFinal());
    }

    public double getPreco() {
        return preco;
    }

    public double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }
}

