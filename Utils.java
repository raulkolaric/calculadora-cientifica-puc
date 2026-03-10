/**
 * Metodos utilitarios.
 * 
 * @author Julio Arakaki
 * @version 19/03/2025
 */
public class Utils {
    /**
     * Método validarOperando - verifica se a string de entrada eh numerica
     *
     * @param str string de entrada
     * @return false se existir algum caracter diferente de numeros e 
     *         true se for somente numeros
     */
    public static boolean validarOperando(String str){
        if (str == null || str.length() == 0) {
            return false;
        }
            
        boolean foundDecimal = false;
        for (char c : str.toCharArray()) { // percorre a string
            if (!Character.isDigit(c)) { // verifica se eh digito
                if (c == '.' && !foundDecimal) { // verifica se existe um unico ponto
                    foundDecimal = true;
                } else {
                    return false;
                }
            }
        }            
        return true;
    }
    /**
     * Método validarOperador - verifica se o operador eh valido
     *
     * @param op String contendo o operador
     * @return false se for diferente de (+,-,x,/) e true caso contrario
     */
    public static boolean validarOperador(String op){
        
        if (!(op.equals("+") || op.equals("-") || op.equals("x") || op.equals("/"))) 
            return false;
        return true;
    }
}
