package com.yee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ConfigClientController
 * Description:
 * date: 2021/12/16 11:12
 * 在数据中心配置yaml文件,可以远程获得数据
 * @author Yee
 * @since JDK 1.8
 */
@RestController
@RefreshScope //支持nacos动态刷新功能
@RequestMapping("/config")
public class ConfigClientController {
    //获得配置中心数据,通过这个控制器可以获得在配置中心设置的yaml文件配置
    @Value("${config.info}")
    private String configInfo;

    @GetMapping
    public String getConfigInfo() {
        return configInfo;
    }
}
