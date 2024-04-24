package com.alura.conversor.calculator;

import com.alura.conversor.request.RequestAPI;

public class Converter {
    public static double ConvertUSDtoBRL(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("USD", "BRL");
        return inputValue * valueCambio;
    }

    public static double ConvertBOBtoUSD(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("BOB", "USD");
        return inputValue * valueCambio;
    }

    public static double ConvertARStoCLP(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("ARS", "CLP");
        return inputValue * valueCambio;
    }

    public static double ConvertBRLtoCOP(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("BRL", "COP");
        return inputValue * valueCambio;
    }

    public static double ConvertCOPtoARS(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("COP", "ARS");
        return inputValue * valueCambio;
    }

    public static double ConvertCLPtoBOB(double inputValue){
        double valueCambio = RequestAPI.RequestExchange("CLP", "BOB");
        return inputValue * valueCambio;
    }
}
