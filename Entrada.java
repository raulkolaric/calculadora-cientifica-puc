import java.util.Scanner;

/**
 * Classe principal.
 * 
 * @authors Kauã Bezerra, Liam Lopes, Raul Kolaric, Rodrigo Ward.
 * @version 11/03/2026
 */

public class Entrada {

    // Senior Design: Use a single static Scanner to prevent closing System.in
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método lerString - le uma string pelo teclado e retorna
     *
     * @param mensagem Mesnsage na console
     * @return s string lida
     */
    public String lerString(String mensagem) {

        // Mostra msg na console
        System.out.print(mensagem);

        // Faz a leitura pelo teclado (using the shared scanner)
        String s = sc.nextLine();

        // Retorna a string
        return s;
    }
}
