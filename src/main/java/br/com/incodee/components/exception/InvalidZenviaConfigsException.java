package br.com.incodee.components.exception;

/** Exception para garantir a leitura das configuracoes corretas do arquivo zenvia.properties.
 *
 *
 * Created by leandro.lima on 26/12/2016.
 */
public class InvalidZenviaConfigsException extends Exception {


    /**  */
    public InvalidZenviaConfigsException() {}

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public InvalidZenviaConfigsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    /**
     * @param message
     * @param cause
     */
    public InvalidZenviaConfigsException(String message, Throwable cause) {
        super(message, cause);
    }


    /**
     * @param message
     */
    public InvalidZenviaConfigsException(String message) {
        super(message);
    }


    /**
     * @param cause
     */
    public InvalidZenviaConfigsException(Throwable cause) {
        super(cause);
    }

}
