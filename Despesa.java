class Despesa {
    private String referencia;
    private double valorPago;

    public Despesa(String referencia, double valorPago) {
        this.referencia = referencia;
        this.valorPago = valorPago;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getValorPago() {
        return valorPago;
    }
}