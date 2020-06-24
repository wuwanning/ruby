package cn.mikulove.exception;

/**
 * @Name:BusinessException
 * @Description: 全局业务异常
 * @Author: Neil
 * @Date: 2020-06-22 15:49
 **/
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 3034121940056795549L;

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException() {

    }

    public BusinessException(BusinessStatus status) {
        super(status.getMessage());
        this.code = status.getCode();
    }
}

