package cn.mikulove.system.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.mikulove.common.response.PageData;
import cn.mikulove.common.response.Query;

import cn.mikulove.system.dao.SysMenuDao;
import cn.mikulove.system.entity.SysMenu;
import cn.mikulove.system.service.SysMenuService;


@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenu> implements SysMenuService {

    @Override
    public PageData queryPage(Map<String, Object> params) {
        return  null;
    }

}