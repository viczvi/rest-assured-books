package utils;

public enum HttpResponseCodes {

    HTTP_200(200),
    HTTP_201(201),
    HTTP_302(302),
    HTTP_403(403),
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
