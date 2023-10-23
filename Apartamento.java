class Apartamento implements Imovel {
    private int numero;
    private int quartos;
    private String tipoOcupacao;
    private String nomeProprietario;
    private String telefoneProprietario;

    public Apartamento(int numero, int quartos, String tipoOcupacao, String nomeProprietario, String telefoneProprietario) {
        this.numero = numero;
        this.quartos = quartos;
        this.tipoOcupacao = tipoOcupacao;
        this.nomeProprietario = nomeProprietario;
        this.telefoneProprietario = telefoneProprietario;
    }

    public int getNumero() {
        return numero;
    }

    public int getQuartos() {
        return quartos;
    }

    public String getTipoOcupacao() {
        return tipoOcupacao;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public String getTelefoneProprietario() {
        return telefoneProprietario;
    }

    @Override
    public double calcularDespesasMensais(double despesaTotal) {
        return (despesaTotal / CondominioUtil.somatorioQuartosTotal) * getQuartos();
    }
}