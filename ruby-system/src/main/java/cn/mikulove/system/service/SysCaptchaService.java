package cn.mikulove.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.mikulove.common.response.PageData;
import cn.mikulove.system.entity.SysCaptcha;

import java.util.Map;

/**
 * 系统验证码表
 *
 * @author Neil
 * @email ningandyin6978@gmail.com
 * @date 2020-06-29 11:15:54
 */
public interface SysCaptchaService extends IService<SysCaptcha> {

    PageData queryPage(Map<String, Object> params);
}

