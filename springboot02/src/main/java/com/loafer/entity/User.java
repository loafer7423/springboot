package com.loafer.entity;

/**
 * @ClassName User
 * @Description [用户实体类]
 * @Author wangdong
 * @Date 2019/6/4 17:40
 * @Version V1.0
 **/
public class User {
    /**主键*/
    private Long userid;
    /**名称*/
    private String username;
    /**密码*/
    private String password;
    /**性别*/
    private Integer sex;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
