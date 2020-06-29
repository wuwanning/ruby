package cn.mikulove.system.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.mikulove.common.response.PageData;
import cn.mikulove.common.response.Query;

import cn.mikulove.system.dao.SysCaptchaDao;
import cn.mikulove.system.entity.SysCaptcha;
import cn.mikulove.system.service.SysCaptchaService;


@Service("sysCaptchaService")
public class SysCaptchaServiceImpl extends ServiceImpl<SysCaptchaDao, SysCaptcha> implements SysCaptchaService {

    @Override
    public PageData queryPage(Map<String, Object> params) {
        return  null;
    }

}