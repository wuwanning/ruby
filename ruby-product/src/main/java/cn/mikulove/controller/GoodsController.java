package cn.mikulove.controller;


import cn.mikulove.common.response.Result;
import cn.mikulove.entity.GoodsEntity;
import cn.mikulove.service.GoodsService;
import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;




/**
 * 用户表
 *
 * @author Neil
 * @email ningandyin6978@gmail.com
 * @date 2020-06-25 18:51:37
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;


   /* *//**
     * 列表
     *//*
    @RequestMapping("/list")
    @RequiresPermissions(":goods:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = goodsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     *//*
    @RequestMapping("/info/{id}")
    @RequiresPermissions(":goods:info")
    public R info(@PathVariable("id") Integer id){
		GoodsEntity goods = goodsService.getById(id);

        return R.ok().put("goods", goods);
    }

    *//**
     * 保存
     *//*
    @RequestMapping("/save")
    @RequiresPermissions(":goods:save")
    public R save(@RequestBody GoodsEntity goods){
		goodsService.save(goods);

        return R.ok();
    }

    *//**
     * 修改
     *//*
    @RequestMapping("/update")
    @RequiresPermissions(":goods:update")
    public R update(@RequestBody GoodsEntity goods){
		goodsService.updateById(goods);

        return R.ok();
    }

    *//**
     * 删除
     *//*
    @RequestMapping("/delete")
    @RequiresPermissions(":goods:delete")
    public R delete(@RequestBody Integer[] ids){
		goodsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }
*/
}
