import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Apartamento apto101 = new ApartamentoPadrao(101, 3, "Proprietário", "João", "1234-5678");
        Apartamento apto102 = new ApartamentoPadrao(102, 1, "Inquilino", "Maria", "4321-5678");
        Apartamento apto201 = new ApartamentoPadrao(201, 2, "Proprietário", "Pedro", "9876-5432");
        Apartamento apto202 = new ApartamentoPadrao(202, 2, "Inquilino", "José", "1122-3344");

        Condominio condominio = new Condominio("Outubro/2023", 1250);
        condominio.adicionarApartamento(apto101);
        condominio.adicionarApartamento(apto102);
        condominio.adicionarApartamento(apto201);
        condominio.adicionarApartamento(apto202);

        for (Apartamento apto : condominio.apartamentos) {
            CondominioUtil.somatorioQuartosTotal += apto.getQuartos();
        }

        condominio.calcularDespesasApartamentos(1000.0);

        condominio.aplicarMulta();

        System.out.println("Condomínio: R$" + condominio.calcularDespesaTotal());
    }
}
