package com.loafer.entity;

import java.util.Date;

/**
 * @ClassName User
 * @Description [一句话描述做什么]
 * @Author wangdong
 * @Date 2019/6/5 14:01
 * @Version V1.0
 **/
public class User {

    private Long id;

    private String name;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
