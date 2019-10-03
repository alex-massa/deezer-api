package deezer.client;

import java.util.Objects;

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
             return type;
         }

         public void setType(String type) {
             this.type = type;
         }

         public String getMessage() {
             return message;
         }

         public void setMessage(String message) {
             this.message = message;
         }

         public Integer getCode() {
             return code;
         }

         public void setCode(Integer code) {
             this.code = code;
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

    public String getType() {
        return this.error.type;
    }

    public String getMessage() {
        return this.error.message;
    }

    public Integer code() {
        return this.error.code;
    }

}
