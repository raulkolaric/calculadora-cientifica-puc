import java.lang.Math;

/**
 * Lógica da calculadora cientifica.
 *
 * @authors Kauã Bezerra, Liam Lopes, Raul Kolaric, Rodrigo Ward.
 * @version 11/03/2026
 */

public class CalcCientifica
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CalcCientifica
     */
    public double calcular(String oper, String opnd1)
    {
        //locais
        double operando1 = Double.parseDouble(opnd1);
        double result = 0;
        
        switch(oper) {
            case "!": // operacao fatorial
                result = fatorial(operando1);
                break;
            case "sin": // operacao seno
                result = seno(operando1);
                break;
            case "cos": // operacao cosseno
                result = cos(operando1);
                break;
            case "inv": // operacao inv
                result = inv(operando1);
                break;
        }
        return result;
    }

    /**
     * Método fatorial - calcula o produto de todos os números inteiros positivos de 1 até n
     * @param a double parametro 1
     * @return double resultado da operação
     */
    public static double fatorial(double a){
        int res = 1, i;
        for (i = 2; i <= a; i++)
            res *= i;
        return res;
    }
    
    /**
     * Método seno - calcula o seno de todos os números inteiros positivos
     * @param a double parametro 1
     * @return double resultado da operação
     */
    public static double seno(double a){
        return Math.sin(a);
    }

    /**
     * Método cos - calcula o cosseno de todos os números inteiros positivos
     * @param a double parametro 1
     * @return double resultado da operação
     */
    public static double cos(double a){
        return Math.cos(a);
    }

    /**
     * Método inv - calcula o inverso de todos os números inteiros positivos
     * @param a double parametro 1
     * @return double resultado da operação
     */
    public static double inv(double a){
        return (1/a);
    }
}