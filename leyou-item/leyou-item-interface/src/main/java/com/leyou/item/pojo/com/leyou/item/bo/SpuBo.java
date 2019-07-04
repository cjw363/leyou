package com.leyou.item.pojo.com.leyou.item.bo;

import com.leyou.item.pojo.Spu;

/**
 * @Classname SpuBo
 * @Description
 * @Date 2019/7/4 15:28
 * @Created by cjw
 */
public class SpuBo extends Spu {

    String cname;// 商品分类名称

    String bname;// 品牌名称

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
