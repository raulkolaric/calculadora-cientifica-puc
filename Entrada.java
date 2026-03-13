import java.util.Scanner;

/**
 * Classe utilitária para capturar entradas do usuário via console. 
 * @author Kauã Bezerra, Liam Lopes, Raul Kolaric, Rodrigo Ward.
 * @version 12/03/2026
 */

public class Entrada {
    /**
     * Método lerString - le uma string pelo teclado e retorna 
     * Exibe uma mensagem no console e lê a linha digitada pelo usuário.
     * @param mensagem Mensagem na console
     * @return s string lida
     */
    public String lerString(String mensagem) {

        // Cria um objeto da classe Scanner, para leitura pelo teclado
        Scanner sc = new Scanner(System.in);

        // Mostra msg na console
        System.out.print(mensagem);
        
        // Faz a leitura pelo teclado
        String s = sc.nextLine();
        
        // Fecha dispositivo de entrada
        sc.close();
        
        // Retorna a string lida
        return s;
    }
}