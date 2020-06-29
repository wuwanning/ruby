package cn.mikulove.common.response;

public enum ResultCode {

    /**
     * 成功
     */
    SUCCESS(200, "请求成功"),

    /**
     * 失败
     */
    ERROR(10000,"请求异常"),

    /**
     * 系统未知异常
     */
    UNKNOWN_EXCEPTION(10001,"系统未知异常"),

    /**
     * 参数格式校验失败
     */
    VAILD_EXCEPTION(10002,"参数格式校验失败");

    private int code;
    private String message;

    ResultCode(int code,String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
