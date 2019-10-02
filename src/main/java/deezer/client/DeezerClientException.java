package deezer.client;

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

        private String type;
        private String message;
        private Integer code;

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
