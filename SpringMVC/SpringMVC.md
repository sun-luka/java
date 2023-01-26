## SpingMVC

### 1、SpringMVC 简介

#### 1.1、什么是MVC

> MVC 是一种软件架构思想，将软件按照[Model](# Model)、[View](# View)、[Controller](# Controller)来划分
>
> ###### Model
>
> 模型层，指工程中的 JavaBean，作用是处理数据。
>
> JavaBean分为两种：
>
> - 实体类Bean：专门存储业务数据的，e.g. Student、User...
> - 业务处理Bean：指Service或Dao对象，专门用于处理业务逻辑和数据访问。
>
> ###### View
>
> 视图层，工程中的html或jsp等页面，作用是与用户进行交互，展示数据
>
> ###### Controller
>
> 控制层，工程中的servlet，作用是接受请求，和响应浏览器
>
> MVC的工作流程：
>
> ​	用户通过视图层发送请求到服务器，在服务器中请求被 Controller接收，Controller调用相应的 Model层处理请求，处理完毕将结果返回到 Controller，Controller在根据请求处理的结果找到相应的 View视图，渲染数据后最终响应给浏览器。

#### 1.2、什么是SpringMVC
