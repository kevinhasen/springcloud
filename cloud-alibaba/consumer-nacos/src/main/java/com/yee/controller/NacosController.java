package com.yee.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: NacosController
 * Description:
 * date: 2021/12/16 10:58
 *
 * @author Yee
 * @since JDK 1.8
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class NacosController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        String url = serverURL+"/payment/"+id;
        return  restTemplate.getForObject(url,String.class);
    }

}
