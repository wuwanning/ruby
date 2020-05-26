package cn.mikulove.mapper;

import cn.mikulove.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Name:UserMapper
 * @Description:
 * @Author: Neil
 * @Date 2020-05-26 18:11
 **/
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

}