package deezer.client;

import java.util.Objects;
import java.util.StringJoiner;

public class DeezerClientException extends RuntimeException {

     public static class Error {

         public static final int QUOTA = 4;
         public static final int ITEMS_LIMIT_EXCEEDED = 100;
         public static final int PERMISSION = 200;
         public static final int TOKEN_INVALID = 300;
         public static final int PARAMETER = 500;
         public static final int PARAMETER_MISSING = 501;
         public static final int QUERY_INVALID = 600;
         public static final int SERVICE_BUSY = 700;
         public static final int DATA_NOT_FOUND = 800;

         String type;
         String message;
         Integer code;

         public String getType() {
             return this.type;
         }

         public Error setType(String type) {
             this.type = type;
             return this;
         }

         public String getMessage() {
             return this.message;
         }

         public Error setMessage(String message) {
             this.message = message;
             return this;
         }

         public Integer getCode() {
             return this.code;
         }

         public Error setCode(Integer code) {
             this.code = code;
             return this;
         }

         @Override
         public String toString() {
             return new StringJoiner(", ", Error.class.getSimpleName() + "{", "}")
                     .add("type=" + (this.type == null ? null : "'" + this.type + "'"))
                     .add("message=" + (this.message == null ? null : "'" + this.message + "'"))
                     .add("code=" + this.code)
                     .toString();
         }

         @Override
         public boolean equals(Object other) {
             if (this == other)
                 return true;
             if (other == null || this.getClass() != other.getClass())
                 return false;
             Error error = (Error) other;
             return  Objects.equals(this.type, error.type) &&
                     Objects.equals(this.message, error.message) &&
                     Objects.equals(this.code, error.code);
         }

         @Override
         public int hashCode() {
             return Objects.hash(this.type, this.message, this.code);
         }

     }

    private Error error;

    public DeezerClientException(Error error) {
        super();
        this.error = error;
    }

    public DeezerClientException(Throwable throwable) {
        super(throwable);
    }

    public DeezerClientException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public String getErrorType() {
        return this.error.type;
    }

    public String getErrorMessage() {
        return this.error.message;
    }

    public Integer getErrorCode() {
        return this.error.code;
    }

    @Override
    public String getMessage() {
        if (this.error == null)
            return super.getMessage();
        return String.format("Received API response: %s (type: %s, code: %d)",
                this.error.message, this.error.type, this.error.code);
    }

}
