package com.yee.pojo;


import lombok.Data;

import java.util.Date;

/**
 * ClassName: User
 * Description:
 * date: 2021/12/14 11:40
 * 实体类,除了id,同名字段可以省略
 * @author Yee
 * @since JDK 1.8
 */

@Data
public class User {

    private Integer id;//主键id
    private String username;//用户名
    private String password;//密码
    private String name;//姓名
    private Integer age;//年龄
    private Integer sex;//性别 1男性，2女性
    private Date birthday; //出生日期
    private Date created; //创建时间
    private Date updated; //更新时间
    private String note;//备注

}
