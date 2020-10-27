package UF2404.Utilidades;
import java.lang.Exception;

public class CustomException extends Exception {
    private String code;

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String code, String message) {
        super(message);
        this.setCode(code);
    }

    public CustomException(String code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
