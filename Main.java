import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Despesa despesa = new Despesa("Outubro/2023", 1250);

        Apartamento apto101 = new Apartamento(101, 3, "Proprietário", "João", "1234-5678");
        Apartamento apto102 = new Apartamento(102, 1, "Inquilino", "Maria", "4321-5678");
        Apartamento apto201 = new Apartamento(201, 2, "Proprietário", "Pedro", "9876-5432");
        Apartamento apto202 = new Apartamento(202, 2, "Inquilino", "José", "1122-3344");

        Condominio condominio = new Condominio(despesa);
        condominio.adicionarApartamento(apto101);
        condominio.adicionarApartamento(apto102);
        condominio.adicionarApartamento(apto201);
        condominio.adicionarApartamento(apto202);

        for (Apartamento apto : condominio.apartamentos) {
            CondominioUtil.somatorioQuartosTotal += apto.getQuartos();
        }

        condominio.calcularDespesasApartamentos();

        condominio.aplicarMulta();

        System.out.println("Condomínio: R$" + condominio.calcularDespesaTotal());
    }
}