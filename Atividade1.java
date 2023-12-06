package Projeto;

import java.util.*;

public class Atividade1 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            boolean continuar = true;
            boolean continuar2 = true;
            String escolhaEnergia = "";
            String escolhaResiduos = "";

            while (continuar) {

                System.out.println("Escolha o tipo de energia para a fazenda:");
                System.out.println("1. Solar.");
                System.out.println("2. Eolica.");
                System.out.println("3. Hidreletrica.");
                System.out.println("4. Biomassa.");

                System.out.print("Digite o numero correspondente a forma de energia desejada para fazenda: \n");
                String Energia = scanner.nextLine();

                switch (Energia) {
                    case "1":
                        escolhaEnergia = "Energia Solar";
                        System.out.println("Voce escolheu " + escolhaEnergia + ". Instale paineis solares na fazenda.");
                        break;

                    case "2":
                        escolhaEnergia = "Energia Eolica";
                        System.out.println("Voce escolheu " + escolhaEnergia + ". Instale aerogeradores para aproveitar o vento.");
                        break;

                    case "3":
                        escolhaEnergia = "Energia Hidreletrica";
                        System.out.println("Voce escolheu " + escolhaEnergia + ". Considere a construcao de uma pequena usina hidreletrica.");
                        break;

                    case "4":
                        escolhaEnergia = "Biomassa";
                        System.out.println("Voce escolheu " + escolhaEnergia + ". Utilize residuos organicos para gerar energia.");
                        break;

                    default:
                        System.out.println("\nVoce digitou uma opcao ivalida, vamos tentar de novo. Por favor, escolha uma opção de 1 a 4. \n");
                        continue;
                }

                while (continuar2) {
                    
                    System.out.println("\nAgora, como deseja lidar com os residuos deixados pela fazenda?");
                    System.out.println("1. Compostagem.");
                    System.out.println("2. Incinerar.");
                    System.out.println("3. Reciclagem.");

                    System.out.print("Digite o numero correspondente a forma de despejos de residuos desejada para fazenda : \n");
                    String Residuos = scanner.nextLine();

                    switch (Residuos) {
                        case "1":
                            escolhaResiduos = "Compostagem";
                            System.out.println("Voce escolheu " + escolhaResiduos + ". Transforme os residuos orgânicos em adubo para fins de gerar energia.");
                            continuar2 = false;
                            break;

                        case "2":
                            escolhaResiduos = "Incinerar";
                            System.out.println("Voce escolheu " + escolhaResiduos + ". Incinere os residuos para reduzir o volume e gerar energia.");
                            continuar2 = false;
                            break;

                        case "3":
                            escolhaResiduos = "Reciclagem";
                            System.out.println("Voce escolheu " + escolhaResiduos + ". Separe devidamente e envie os residuos para empresas competentes de reciclagem.");
                            continuar2 = false;
                            break;

                        default:
                            System.out.println("\nVoce digitou uma opcao invalida, vamos tentar de novo. Por favor, escolha uma opção de 1 a 3. \n");
                } 
            }
            
            continuar=false;
        }
            
            System.out.println("\nSuas opcoes escolhidas foram:");
            System.out.println("Energia: " + escolhaEnergia + ".");
            System.out.println("Residuos: " + escolhaResiduos + ".");
    }
  }
}
