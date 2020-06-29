package cn.mikulove.common.response;

import cn.mikulove.common.util.DateUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @Name:Result
 * @Description:
 * @Author: Neil
 * @Date: 2020-06-22 15:57
 **/
@Data
public class Result<T>  implements Serializable {

    private Integer code;

    private String message;

    private String timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public Result() {
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = DateUtil.getInstantNow();
    }

    public Result(Integer code, String message,T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = DateUtil.getInstantNow();
    }


    public static <T> Result<T> success(){
        return new Result<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage());
    }

    public static <T> Result<T> error(){
        return new Result<T>(ResultCode.ERROR.getCode(),ResultCode.ERROR.getMessage());
    }

    public static <T> Result<T> error(ResultCode rc){
        return new Result<T>(rc.getCode(),rc.getMessage());
    }

    public static <T> Result<T> success(T data){
        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),data);
    }


}
