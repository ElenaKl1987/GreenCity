package greencity.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * Exception that we get when user trying to sign-in with bad email or password.
 *
 * @author Nazar Stasyuk
 * @version 1.0
 */
public class BadEmailOrPasswordException extends AuthenticationException {
    /**
     * Constructor.
     */
    public BadEmailOrPasswordException(String message) {
        super(message);
    }
}
