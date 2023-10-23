import java.util.ArrayList;
import java.util.List;

class Condominio {
    public List<Apartamento> apartamentos = new ArrayList<>();
    private double multa = 0.02;
    private String referencia;
    private double valorPago;

    public Condominio(String referencia, double valorPago) {
        this.referencia = referencia;
        this.valorPago = valorPago;
    }

    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    public void calcularDespesasApartamentos(double despesaTotal) {
        for (Apartamento apto : apartamentos) {
            double despesaApto = apto.calcularDespesasMensais(despesaTotal);
            System.out.println("Despesas do Apartamento " + apto.getNumero() + ": R$" + despesaApto);
        }
    }

    public void aplicarMulta() {
        if (valorPago < calcularDespesaTotal()) {
            multa = 0.05;
            System.out.println("Multa de 5% aplicada no próximo mês.");
        }
    }

    public double calcularDespesaTotal() {
        double despesaTotal = 0;
        for (Apartamento apto : apartamentos) {
            despesaTotal += apto.calcularDespesasMensais(valorPago);
        }
        return despesaTotal;
    }
}