
/**
 * Calculadora de 4 operacoes (+, -, x, /) basicas.
 * 
 * @author Julio Arakaki
 * @version 19/03/2025
 */
public class CalcBasica {
    /**
     * Método calcular - realiza o calculo das 4 operações básicas
     *
     * @param opnd1 double operando 1
     * @param oper String operador
     * @param opnd2 double operando 2
     * @return double resultado da operacao
     */
    public double calcular(String opnd1, String oper, String opnd2) {
        
        // Variaveis locais
        double operando1 = Double.parseDouble(opnd1);
        double operando2 = Double.parseDouble(opnd2);
        double result = 0;
        
        switch(oper) {
            case "+": // operacao soma
                result = somar(operando1, operando2);
                break;
            case "-": // operacao subtracao
                result = subtrair(operando1, operando2);
                break;
            case "/": // operacao divisao
                result = dividir (operando1, operando2);
                break;
            case "x": // operacao multiplicacao
                result = multiplicar (operando1, operando2);
                break;
        }
        
        // retorna resultado
        return result;
        
    }
    
    /**
     * Método somar - soma dois numeros recebidos como parametros
     *
     * @param a double parametro 1
     * @param b double parametro 2
     * @return double resultado da soma
     */
    public static double somar(double a, double b){
        return (a + b);
    }
    
    /**
     * Método subtrair - subtrai dois numeros recebidos como parametros
     *
     * @param a double parametro 1
     * @param b double parametro 2
     * @return double resultado da subtracao
     */
    public static double subtrair(double a, double b){
        return (a - b);
    }
    
    /**
     * Método multiplicar - multiplica dois numeros recebidos como parametros
     *
     * @param a double parametro 1
     * @param b double parametro 2
     * @return double resultado da multiplicacao
     */
    public static double multiplicar(double a, double b){
        return (a * b);
    }
    
    /**
     * Método dividir - divide dois numeros recebidos como parametros
     *
     * @param a double parametro 1
     * @param b double parametro 2
     * @return double resultado da divisao
     */
    public static double dividir(double a, double b){
        return (a / b);
    }
}