package cn.mikulove.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * 
 * @author Neil
 * @email ningandyin6978@gmail.com
 * @date 2020-06-25 18:51:37
 */
@Data
@TableName("t_goods")
public class GoodsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Integer id;
	/**
	 * 姓名
	 */
	private String goodsName;

}
