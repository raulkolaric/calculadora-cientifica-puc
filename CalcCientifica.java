import java.lang.Math;

/**
 * Lógica da calculadora cientifica.
 *
 * @author Kauã Bezerra, Liam Lopes, Raul Kolaric, Rodrigo Ward.
 * @version 11/03/2026
 */

public class CalcCientifica {
    /**
     * Realiza uma operação científica unitária (um operando).
     * * @param oper  O símbolo da operação ("!", "sin", "cos", "inv", "tan").
     * @param opnd1 O valor numérico como String.
     * @return      O resultado da operação.
     */
    public void calcular(String oper, String opnd1) {
        // locais
        double operando1 = Double.parseDouble(opnd1);
        double result = 0;

        switch (oper) {
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
            case "tan": // operacao tan
                result = tan(operando1);
                break;
        }
        System.out.println(oper + "(" + opnd1 + ") = " + result);
        
    }

    /**
     * Método fatorial - calcula o produto de todos os números inteiros positivos de
     * 1 até n
     * 
     * @param a double parametro 1
     * @return double resultado da operação
     */

    public static double fatorial(double a) {
        /*
        Esta função calcula o fatorial de um número de forma iterativa, 
        utilizando um laço for para multiplicar os valores de 2 até a.
        */
        double res = 1;
        int i;
        for (i = 2; i <= a; i++)
            res *= i;
        return res;
    }

    /**
     * Método seno - calcula o seno de todos os números inteiros positivos
     * 
     * @param a double parametro 1
     * @return double resultado da operação
     */
    public static double seno(double a) {
        return Math.sin(Math.toRadians(a));
    }

    /**
     * Método cos - calcula o cosseno de todos os números inteiros positivos
     * 
     * @param a double parametro 1
     * @return double resultado da operação
     */
    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    /**
     * Método inv - calcula o inverso de todos os números inteiros positivos
     * 
     * @param a double parametro 1
     * @return double resultado da operação
     */
    public static double inv(double a) {
        return (1 / a);
    }

    /**
     * Método tan - calcula a tangente de todos os números inteiros positivos
     * 
     * @param a double parametro 1
     * @return double resultado da operação
     */
    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }
    
    /**
     * Realiza uma operação básica entre dois operandos utilizando a CalcBasica.
     * * @param opnd1 Primeiro valor.
     * @param oper  Operador básico (+, -, *, /).
     * @param opnd2 Segundo valor.
     * @return      O resultado da conta.
     */
    public void calcular(String opnd1, String oper, String opnd2) {
        
        double operando1 = Double.parseDouble(opnd1);
        double operando2 = Double.parseDouble(opnd2);
        double result = 0;
        
        CalcBasica calcBasica = new CalcBasica();
        
        result = calcBasica.calcular(opnd1, oper, opnd2);
        
        System.out.println("(" + opnd1 + " " + oper + " " + opnd2 + ") = " + result);
        
    }

}