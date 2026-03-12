import java.util.Scanner;

/**
 * Aplicação para testar a Calculadora de 4 
 * operacoes basicas.
 * 
 * @author Julio Arakaki
 * @version 19/03/2025
 */
public class Aplicacao{
    public static void main(String args[]){
        // Variaveis locais
        String opnd1 = "";
        String opnd2 = "";
        String operador = "";
        double result = 0;

        // armazena o tamanho do vetor de string (args) - qtde de parametros
        int tam = args.length; 

        // Verifica a qtde de parametros
        if (tam == 3) { // entrada pela linha de comando
            opnd1 = args[0];
            operador = args[1];
            opnd2 = args[2];
            // verifica operador
            if(!Utils.validarOperador(operador)) {
                System.out.println("Operador invalido!!");
                return;
            }
            // verifica operando 1
            if(!(Utils.validarOperando(opnd1))) {
                System.out.println("Operando 1 invalido!!");
                return;
            }
            
            // verifica operando 2
            if(!(Utils.validarOperando(opnd2))) {
                System.out.println("Operando 2 invalido!!");
                return;
            }

        } else if (tam == 2){
            opnd1 = args[0];
            operador = args[1];
            // verifica operador
            if(!Utils.validarOperador(operador)) {
                System.out.println("Operador invalido!!");
                return;
            }
            // verifica operando 1
            if(!(Utils.validarOperando(opnd1))) {
                System.out.println("Operando 1 invalido!!");
                return;
            }       
            
        } else if (tam == 0){ // Nao utiliza linha de comando
            
            // Entrada pelo teclado (console)
            Entrada ent = new Entrada();
            opnd1 = ent.lerString("Forneca o operando1: ");
            
            // verifica operando 1
            if(!(Utils.validarOperando(opnd1))) {
                System.out.println("Operando 1 invalido!!");
                return;
            }
            
            operador = ent.lerString("Forneca o operador: ");
            // verifica operador
            if(!Utils.validarOperador(operador)) {
                System.out.println("Operador invalido!!");
                return;
            }
            
            // Junior would ask for opnd2 always. Senior checks if it's actually needed.
            if (!Utils.isUnary(operador)) {
                opnd2 = ent.lerString("Forneca o operando2: ");

                // verifica operando2           
                if(!(Utils.validarOperando(opnd2))) {
                    System.out.println("Operando 2 invalido!!");
                    return;
                }
            }

        } else {
            System.out.println("Numero de parametros invalidos!!");
            return;
        }
        
        if (Utils.isUnary(operador)) {
            CalcCientifica calc = new CalcCientifica();
            System.out.println(operador + "(" + opnd1 + ") = " + calc.calcular(operador, opnd1));
        } else {
            CalcCientifica calc = new CalcCientifica();
            System.out.println("(" + opnd1 + " " + operador + " " + opnd2 + ") = " + calc.calcular(opnd1, operador, opnd2));
        }
    }
}
