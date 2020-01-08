package utils;

public enum HttpResponseCodes {

    HTTP_200(200),
    HTTP_404(404),
    HTTP_500(500);

    private int code;


    HttpResponseCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
