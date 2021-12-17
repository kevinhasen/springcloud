# springCloud

微服务是系统架构上的一种设计风格， 它的主旨是将一个原本独立 的系统拆分成多个小型服务，

这些小型服务都在各自独立的进程中运行，服务之 间通过基于 HTTP 的 RESTful API 进行通信协作；

## 分布式和微服务区别

分步式和微服务目的不同



分布式架构:访问量很大一台机器承受不了，或者是成本问题，不得不使用多台机器来完成服务的部署；

微服务:各个模块拆分开来，不会被互相影响，比如模块的升级或者出现BUG或者是重构等等都不要影响到其他模块，微服务它是可以在一台机器上部署；



分布式也是微服务的一种，微服务也属于分布式；



分步式常用的是dubbo使用的是RPC(远程调用协议)

微服务常用的是http协议



## 入门案例

父工程

springcloud-parent



提供者两个

user-provider

user-provider-demo





消费者

user-consumer





## Cloud Feign

在user-consumer里

-   集成Ribbon的负载均衡功能

-   集成了Hystrix的熔断器功能
-   支持请求压缩
-   大大简化了远程调用的代码，同时功能还增强啦
-   Feign以更加优雅的方式编写远程调用代码，并简化重复代码
    -   替代RestTemplate





## Cloud Gateway

子项目gateway-service

微服务架构提供一种简单有效统一的API路由管理方式。替代Netflix Zuul





## 配置中心



Nacos介绍,注册中心+配置中心的组合

替代Eureka做服务注册中心

替代Config做服务配置中心

Eureka已经停止更新,nacos是替代它的

下载地址： `https://github.com/alibaba/nacos/releases/tag/1.1.4`

进入bin 目录，双击启动 nacos

请求地址：`http://localhost:8848/nacos`

用户名和密码都是：`nacos`



### 入门案例

父项目cloud-alibaba



### 提供者

provider-payment9001





### 提供者2

provider-payment9002

--为集群做准备





### 消费者

consumer-nacos项目



### 配置中心

创建配置中心项目config-nacos

