package cn.mikulove.system.controller;

import cn.mikulove.common.response.PageData;
import cn.mikulove.common.response.Result;
import cn.mikulove.system.entity.SysUser;
import cn.mikulove.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 用户表
 *
 * @author Neil
 * @email ningandyin6978@gmail.com
 * @date 2020-06-29 11:15:54
 */
@RestController
@RequestMapping("system/sysuser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    /**
     * 列表
     */
    @PostMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageData page = sysUserService.queryPage(params);
        return Result.success(page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{userId}")
    public Result info(@PathVariable("userId") Long userId){
		SysUser sysUser = sysUserService.getById(userId);

        return Result.success(sysUser);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public Result save(@RequestBody SysUser sysUser){
		sysUserService.save(sysUser);
        return Result.success();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public Result update(@RequestBody SysUser sysUser){
		sysUserService.updateById(sysUser);
        return Result.success();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public Result delete(@RequestBody Long[] userIds){
        sysUserService.removeByIds(Arrays.asList(userIds));
        return Result.success();
    }

}
