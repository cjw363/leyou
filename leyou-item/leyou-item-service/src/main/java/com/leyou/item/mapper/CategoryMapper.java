package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;

import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Classname CategoryMapper
 * @Description
 * @Date 2019/7/2 17:09
 * @Created by cjw
 */
public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category, Long> {

}
