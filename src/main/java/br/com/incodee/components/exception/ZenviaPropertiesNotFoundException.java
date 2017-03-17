package br.com.incodee.components.exception;

/** Exception para garantir a leitura do arquivo zenvia.properties
 *
 * Created by leandro.lima on 26/12/2016.
 */
public class ZenviaPropertiesNotFoundException extends Exception {


    /**  */
    public ZenviaPropertiesNotFoundException() {}

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public ZenviaPropertiesNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    /**
     * @param message
     * @param cause
     */
    public ZenviaPropertiesNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


    /**
     * @param message
     */
    public ZenviaPropertiesNotFoundException(String message) {
        super(message);
    }


    /**
     * @param cause
     */
    public ZenviaPropertiesNotFoundException(Throwable cause) {
        super(cause);
    }

}
