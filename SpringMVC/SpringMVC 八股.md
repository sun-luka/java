SpringMVC 八股

[TOC]

### 1、概述

#### 1.1、什么是Spring MVC？简单介绍下你对Spring MVC的理解？

​		Spring MVC是一个基于Java的实现了MVC设计模式的请求驱动类型的轻量级Web框架，通过把模型-视图-控制器分离，将web层进行职责解耦，把复杂的web应用分成逻辑清晰的几部分，简化开发，减少出错，方便组内开发人员之间的配合

#### 1.2、Spring MVC的优点 集合的特点主要有如下两点：

​		可以支持各种视图技术,而不仅仅局限于JSP；

​		与Spring框架集成（如IoC容器、AOP等）；
​		清晰的角色分配：前端控制器(dispatcherServlet) , 请求到处理器映射（handlerMapping), 处理器适配器（HandlerAdapter), 视图解析器（ViewResolver）。
​		支持各种请求资源的映射策略。

### 2、核心组件、工作原理

