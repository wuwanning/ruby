package cn.mikulove.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统验证码表
 * 
 * @author Neil
 * @email ningandyin6978@gmail.com
 * @date 2020-06-29 11:15:54
 */
@Data
@TableName("t_sys_captcha")
public class SysCaptcha implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private String id;
	/**
	 * 验证码
	 */
	private String code;
	/**
	 * 过期时间
	 */
	private Date expireTime;

}
