package cn.mikulove.system.dao;

import cn.mikulove.system.entity.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单管理表
 * 
 * @author Neil
 * @email ningandyin6978@gmail.com
 * @date 2020-06-29 11:15:54
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenu> {
	
}
