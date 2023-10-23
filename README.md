# Cálculo de Despesas Condominiais
Sistema para cálculo de despesas condominiais. O programa foi desenvolvido em Java e trata-se de uma atividade para a disciplina de Engenharia de Software III da Fatec Zona Leste.

# Domínio do projeto:
"Marina é síndica do prédio onde mora. A fim de ter um melhor gerenciamento sobre o condomínio, ela encomendou um sistema a uma empresa de software. Para um apartamento, deve-se cadastrar o número do apto, a quantidade de quartos, o tipo de ocupação (proprietário, inquilino ou vazio), o nome e o telefone do proprietário. Um proprietário pode ter mais de um apartamento no prédio. Mensalmente, devem ser lançadas as despesas para calcular o condomínio do mês, além das despesas específicas de um apartamento ou um grupo de apartamentos, como por exemplo a taxa do salão de festas. O condomínio é calculado por tipo de apartamento (de acordo com o número de quartos).

Para chegar ao valor pago pelas despesas, têm-se os seguintes passos:
a) verificar o somatório de quartos de todo o prédio.
Exemplo: apto 101 (2 quartos); apto 102 (3 quartos); 201 (2 quartos); 202 (3 quartos); Total de quartos = 10
     
b) dividir o valor da despesa (que pode ser fixo, como fundo de reserva; ou variável como água) pelo somatório de quartos e multiplicar o resultado pelo número de quartos do apartamento.
      Exemplo: água = 200,00
      Apto 101 cálculo: 200,00 / 10 x 2 = 40,00
      Apto 201 cálculo: 200,00 / 10 x 2 = 40,00
      Apto 202 cálculo: 200,00 / 10 x 3 = 60,00

Para cada item do condomínio, cadastra-se a referência
      Exemplo: Março/2005

O condomínio é pago diretamente com a Síndica. Se for pago com atraso, cobra-se multa de 2%. O condômino pode optar em pagar a multa no mês seguinte. Nesse caso, o percentual passa para 5% e é lançada como despesa do próximo condomínio.
O cadastro de cada condomínio de apartamento é completado com a data de pagamento e o valor pago."
