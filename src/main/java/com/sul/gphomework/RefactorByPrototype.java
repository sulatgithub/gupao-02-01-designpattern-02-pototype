package com.sul.gphomework;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RefactorByPrototype {

    public void insert(String[] userStrs){
        //从字符串数组中读取数据插入数据库，修改前:每次循环声场一个对象
        for (String userstr : userStrs){
            String[] array = userstr.split(",");
            User user =
                new User(UUID.randomUUID().toString().replaceAll("-", ""),array[0],array[1]);
            //插入数据库
            //service.insert(user);
            System.out.println(user.getId()+","+user.getName()+","+user.getDeptId());
        }

    }

    public void insertRegactor(String[] userStrs){
        //从字符串数组中读取数据插入数据库，修改后:只生成一个对象，每次循环中修改各属性的值
        User user = new User();
        for (String userstr : userStrs){
            String[] array = userstr.split(",");
            user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            user.setName(array[0]);
            user.setDeptId(array[1]);
            //插入数据库
            //service.insert(user);
            System.out.println(user.getId()+","+user.getName()+","+user.getDeptId());
        }
    }

    public static void main(String[] args) {
        String[] userstrs = new String[]{
            "aa,11", "bb,22","cc,33",
        };
        RefactorByPrototype ctrl = new RefactorByPrototype();
        ctrl.insert(userstrs);
        ctrl.insertRegactor(userstrs);
    }
}
