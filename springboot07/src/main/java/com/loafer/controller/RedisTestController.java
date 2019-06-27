package com.loafer.controller;

import com.loafer.base.BaseController;
import com.loafer.entity.User;
import com.loafer.utils.RedisConstants;
import com.loafer.utils.RedisUtil;
import com.loafer.utils.StateParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName RedisTestController
 **/
@Controller
@RequestMapping("/redis")
public class RedisTestController extends BaseController {

    @Autowired
    RedisUtil redisUtil;

    /**
     * @Description: 测试redis存储&读取
     */
    @RequestMapping(value="/test")
    @ResponseBody
    public ModelMap test(){
        try {
            redisUtil.set("redisTemplate","这是一条测试数据", RedisConstants.datebase2);
            String value = redisUtil.get("redisTemplate",RedisConstants.datebase2).toString();
            logger.info("redisValue="+value);
            logger.info("读取redis成功");
            return getModelMap(StateParameter.SUCCESS, value, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(StateParameter.FAULT, null, "操作失败");
        }
    }

    @RequestMapping(value="/setUser")
    @ResponseBody
    public ModelMap setUser() {
        try {
            User user = new User();
            user.setId(1l);
            user.setName("隔壁老王");
            user.setAge(28);
            redisUtil.set("user", user, RedisConstants.datebase1);
            return getModelMap(StateParameter.SUCCESS, user, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(StateParameter.FAULT, null, "操作失败");
        }
    }

    @RequestMapping(value="/getUser")
    @ResponseBody
    public ModelMap getUser(){
        try {
            User res = (User)redisUtil.get("user",RedisConstants.datebase1);
            logger.info("res="+res.toString());
            logger.info("读取redis成功");
            return getModelMap(StateParameter.SUCCESS, res, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(StateParameter.FAULT, null, "操作失败");
        }
    }

}
