package com.alura.conversor.calculator;

import com.alura.conversor.request.RequestAPI;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static Map<String, Double> convertedValues = new HashMap<>();

    public static void imprimirValoresConvertidos() {
        System.out.println("*****************************************************");
        System.out.println("Exibindo seu historico de conversões");
        if(convertedValues.isEmpty()){
            System.out.println("Você precisa realizar alguma conversão antes de escolher essa opção!");
        } else {
            for (Map.Entry<String, Double> entry : convertedValues.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println("*****************************************************");
    }

    public static double ConvertUSDtoBRL(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("USD", "BRL");
        double valueConverted = inputValue * valueCambio;
        convertedValues.put("USD para BRL", valueConverted);
        return valueConverted;
    }

    public static double ConvertBOBtoUSD(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("BOB", "USD");
        double valueConverted = inputValue * valueCambio;
        convertedValues.put("BOB para USD", valueConverted);
        return valueConverted;
    }

    public static double ConvertARStoCLP(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("ARS", "CLP");
        double valueConverted = inputValue * valueCambio;
        convertedValues.put("ARS para CLP", valueConverted);
        return valueConverted;
    }

    public static double ConvertBRLtoCOP(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("BRL", "COP");
        double valueConverted = inputValue * valueCambio;
        convertedValues.put("BRL para COP", valueConverted);
        return valueConverted;
    }

    public static double ConvertCOPtoARS(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("COP", "ARS");
        double valueConverted = inputValue * valueCambio;
        convertedValues.put("COP para ARS", valueConverted);
        return valueConverted;
    }

    public static double ConvertCLPtoBOB(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("CLP", "BOB");
        double valueConverted = inputValue * valueCambio;
        convertedValues.put("CLP para BOB", valueConverted);
        return valueConverted;
    }
}
