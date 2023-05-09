package ProvaUm;
import java.util.Scanner;
public class OtimizacaoDeConsumoDeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a placa do veículo: ");
        String placa = scan.next();
        System.out.print("Digite o valor do litro do combustível: ");
        double valorLitroCombustivel = scan.nextDouble();
        System.out.print("Digite o consumo médio de combustível do veículo (km/l): ");
        double consumoMedioCombustivel = scan.nextDouble();
        System.out.print("Digite a quantidade de km rodados a 60 km/h: ");
        double quantidadeDeKmRodadosA60KM = scan.nextDouble();
        System.out.print("Digite a quantidade de km rodados a 80 km/h: ");
        double quantidadeDeKmRodadosA80KM = scan.nextDouble();
        System.out.print("Digite a quantidade de km rodados a 100 km/h: ");
        double quantidadeDeKmRodadosA100KM = scan.nextDouble();
        System.out.print("Digite a quantidade de km rodados a 120 km/h: ");
        double quantidadeDeKmRodadosA120KM = scan.nextDouble();
        System.out.print("Digite a quantidade de km rodados a 140 km/h: ");
        double quantidadeDeKmRodadosA140KM = scan.nextDouble();
        scan.close();
        double quantidadeDeCombustivel60KM = quantidadeDeKmRodadosA60KM / consumoMedioCombustivel;
        double quantidadeDeCombustivel80KM = quantidadeDeKmRodadosA80KM / consumoMedioCombustivel;
        double quantidadeDeCombustivel100KM = quantidadeDeKmRodadosA100KM / consumoMedioCombustivel;
        double quantidadeDeCombustivel120KM = quantidadeDeKmRodadosA120KM / consumoMedioCombustivel;
        double quantidadeDeCombustivel140KM = quantidadeDeKmRodadosA140KM / consumoMedioCombustivel;
        double quantidadeDeCombustivelTotal = quantidadeDeCombustivel60KM + quantidadeDeCombustivel80KM + quantidadeDeCombustivel100KM 
        		+ quantidadeDeCombustivel120KM + quantidadeDeCombustivel140KM;
        double distanciaTotal = quantidadeDeKmRodadosA60KM + quantidadeDeKmRodadosA60KM + quantidadeDeKmRodadosA60KM + quantidadeDeKmRodadosA60KM 
        		+ quantidadeDeKmRodadosA60KM;
        double velocidadeMediaPonderada = (quantidadeDeKmRodadosA60KM * 60 + quantidadeDeKmRodadosA60KM * 80 + quantidadeDeKmRodadosA60KM * 100 
        		+ quantidadeDeKmRodadosA60KM * 120 + quantidadeDeKmRodadosA60KM * 140) / distanciaTotal;
        double custoTotalViagem = quantidadeDeCombustivelTotal * valorLitroCombustivel;
        System.out.println("Placa do veículo: " + placa);
        System.out.printf("Custo total da viagem: R$ %.2f\n", custoTotalViagem);
        System.out.printf("Velocidade média ponderada: %.2f km/h\n", velocidadeMediaPonderada);
        System.out.printf("Quantidade total de combustível utilizada: %.2f litros\n", quantidadeDeCombustivelTotal);
    }
}
