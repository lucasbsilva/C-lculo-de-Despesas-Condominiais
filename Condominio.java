import java.util.ArrayList;
import java.util.List;

class Condominio {
    public List<Apartamento> apartamentos = new ArrayList<>();
    private double multa = 0.02;
    private Despesa despesa;

    public Condominio(Despesa despesa) {
        this.despesa = despesa;
    }

    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    public void calcularDespesasApartamentos() {
        for (Apartamento apto : apartamentos) {
            double despesaApto = apto.calcularDespesasMensais(despesa.getValorPago());
            System.out.println("Despesas do Apartamento " + apto.getNumero() + ": R$" + despesaApto);
        }
    }

    public void aplicarMulta() {
        if (despesa.getValorPago() < calcularDespesaTotal()) {
            multa = 0.05;
            System.out.println("Multa de 5% aplicada no próximo mês.");
        }
    }

    public double calcularDespesaTotal() {
        double despesaTotal = 0;
        for (Apartamento apto : apartamentos) {
            despesaTotal += apto.calcularDespesasMensais(despesa.getValorPago());
        }
        return despesaTotal;
    }
}