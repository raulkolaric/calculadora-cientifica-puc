import java.util.Scanner;

/**
 * Ponto de entrada da aplicação para a Calculadora Científica.
 * Permite a execução via linha de comando (CLI) ou interação via console.
 * 
 * @author Kauã Bezerra, Liam Lopes, Raul Kolaric, Rodrigo Ward.
 * @version 12/03/2026
 */
public class Aplicacao{
    /**
     * Método principal que gerencia o fluxo de entrada e saída.
     * * @param args Argumentos da linha de comando:
     * - 3 argumentos: [opnd1] [oper] [opnd2] (Binário)
     * - 2 argumentos: [opnd1] [oper] (Unitário)
     * - 0 argumentos: Inicia modo interativo.
     */
    public static void main(String args[]){
        // Variaveis locais
        String opnd1 = "";
        String opnd2 = "";
        String operador = "";
        //Inicia o objeto CalcCientifica
        CalcCientifica calc = new CalcCientifica();


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
    }
}
