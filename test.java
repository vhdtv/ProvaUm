import java.util.Scanner;
public class OtimizacaoDeConsumoDeCombustivelResolucaoUm {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Digite a placa do veículo: ");
	        String placa = scan.next();
	        System.out.print("Digite o valor do litro do combustível: ");
	        double valorLitroCombustivel = scan.nextDouble();
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
	        double consumoMedioCombustivel60KM = 30.7;
	        double consumoMedioCombustivel80KM = 26.8;
	        double consumoMedioCombustivel100KM = 22.4;
	        double consumoMedioCombustivel120KM = 18.1;
	        double consumoMedioCombustivel140KM = 14.5;
	        double quantidadeDeCombustivel60KM = quantidadeDeKmRodadosA60KM / consumoMedioCombustivel60KM;
	        double quantidadeDeCombustivel80KM = quantidadeDeKmRodadosA80KM / consumoMedioCombustivel80KM;
	        double quantidadeDeCombustivel100KM = quantidadeDeKmRodadosA100KM / consumoMedioCombustivel100KM;
	        double quantidadeDeCombustivel120KM = quantidadeDeKmRodadosA120KM / consumoMedioCombustivel120KM;
	        double quantidadeDeCombustivel140KM = quantidadeDeKmRodadosA140KM / consumoMedioCombustivel140KM;
	        double quantidadeDeCombustivelTotal = quantidadeDeCombustivel60KM + quantidadeDeCombustivel80KM + quantidadeDeCombustivel100KM 
	        		+ quantidadeDeCombustivel120KM + quantidadeDeCombustivel140KM;
	        double distanciaTotal = quantidadeDeKmRodadosA60KM + quantidadeDeKmRodadosA60KM + quantidadeDeKmRodadosA60KM + quantidadeDeKmRodadosA60KM 
	        		+ quantidadeDeKmRodadosA60KM;
	        double velocidadeMediaPonderada = (quantidadeDeKmRodadosA60KM * 60 + quantidadeDeKmRodadosA80KM * 80 + quantidadeDeKmRodadosA100KM * 100 
	        		+ quantidadeDeKmRodadosA120KM * 120 + quantidadeDeKmRodadosA140KM * 140) / distanciaTotal;
	        double custoTotalViagem = quantidadeDeCombustivelTotal * valorLitroCombustivel;
	        System.out.println("Placa do veículo: " + placa);
	        System.out.printf("Custo total da viagem: R$ %.2f\n", custoTotalViagem);
	        System.out.printf("Velocidade média ponderada da viagem: %.2f", velocidadeMediaPonderada);
	        System.out.printf("A quantidade total de combustível: %.2f",quantidadeDeCombustivelTotal);
	    }
}
