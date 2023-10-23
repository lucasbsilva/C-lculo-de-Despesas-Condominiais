class ApartamentoPadrao extends Apartamento {
    public ApartamentoPadrao(int numero, int quartos, String tipoOcupacao, String nomeProprietario, String telefoneProprietario) {
        super(numero, quartos, tipoOcupacao, nomeProprietario, telefoneProprietario);
    }

    @Override
    public double calcularDespesasMensais(double despesaTotal) {
        return (despesaTotal / CondominioUtil.somatorioQuartosTotal) * getQuartos();
    }
}