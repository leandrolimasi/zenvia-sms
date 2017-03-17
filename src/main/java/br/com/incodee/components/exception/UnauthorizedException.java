/** Exception para a validade do acesso dos dados do zenvia
 *
 *
 * Created by leandro.lima on 26/12/2016.
 */
package br.com.incodee.components.exception;

public class UnauthorizedException extends Exception {

    public UnauthorizedException() {
    }

    public UnauthorizedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnauthorizedException(String message) {
        super(message);
    }

    public UnauthorizedException(Throwable cause) {
        super(cause);
    }
}

