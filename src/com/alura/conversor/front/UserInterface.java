package com.alura.conversor.front;

import com.alura.conversor.calculator.Converter;

import java.util.Scanner;

public class UserInterface {
    public static void SelectCoin(){
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair){
            System.out.println("*****************************************************");
            System.out.println("Você está utilizando o conversor de moedas\n\n");
            System.out.println("Selecione qual conversão você deseja:");
            System.out.println("1 - USD para BRL");
            System.out.println("2 - BOB para USD");
            System.out.println("3 - ARS para CLP");
            System.out.println("4 - BRL para COP");
            System.out.println("5 - COP para ARS");
            System.out.println("6 - CLP para BOB");
            System.out.println("7 - SAIR");
            System.out.println("Escolha uma opção valida");
            System.out.println("**************************************\n");

            int option = scanner.nextInt();


            switch (option){
                case 1:
                    System.out.println("Digite o valor em USD");
                    double usdParaBrl = scanner.nextDouble();
                    double value = Converter.ConvertUSDtoBRL(usdParaBrl);
                    System.out.println("O valor " + usdParaBrl + " [USD] convertido para BRL é = " + value);
                    break;
                case 2:
                    System.out.println("Digite o valor em BOB");
                    double bobParaUSD = scanner.nextDouble();
                    double valueBOB = Converter.ConvertBOBtoUSD(bobParaUSD);
                    System.out.println("O valor " + bobParaUSD + " [BOB] convertido para USD é = " + valueBOB);
                    break;
                case 3:
                    System.out.println("Digite o valor em ARS");
                    double arsParaCLP = scanner.nextDouble();
                    double valueARS = Converter.ConvertARStoCLP(arsParaCLP);
                    System.out.println("O valor " + arsParaCLP + " [ARS] convertido para CLP é = " + valueARS);
                    break;
                case 4:
                    System.out.println("Digite o valor em BRL");
                    double brlParaCOP = scanner.nextDouble();
                    double valueBRL = Converter.ConvertBRLtoCOP(brlParaCOP);
                    System.out.println("O valor " + brlParaCOP + " [BRL] convertido para COP é = " + valueBRL);
                    break;
                case 5:
                    System.out.println("Digite o valor em COP");
                    double copParaARS = scanner.nextDouble();
                    double valueCOP = Converter.ConvertCOPtoARS(copParaARS);
                    System.out.println("O valor " + copParaARS + " [COP] convertido para ARS é = " + valueCOP);
                    break;
                case 6:
                    System.out.println("Digite o valor em CLP");
                    double clpParaBOB = scanner.nextDouble();
                    double valueCLP = Converter.ConvertCLPtoBOB(clpParaBOB);
                    System.out.println("O valor " + clpParaBOB + " [CLP] convertido para BOB é = " + valueCLP);
                    break;
                case 7:
                    sair = true;
                    break;
            }
        }
    }
}
