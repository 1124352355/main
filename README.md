# Log4j2-CVE-2021-44228

#### 介绍
Log4J的漏洞复现

#### 软件架构
软件架构说明


#### 安装教程

1.  git clone https://gitee.com/demonbhao/log4j2-cve-2021-44228.git
2.  安装JDK1.8.0以下版本
3.  安装maven，打包需要

#### 使用说明

1.  编写你的poc代码块
![输入图片说明](image.png)
2.  编译Exploit.java
javac Exploit.java
形成Exploit.class
3.  开启LDAP协议
![输入图片说明](image/image.png)
4.开启http服务器，用python简单开启，注意要和被访问的端口一致
![输入图片说明](image/p4image.png)
5.回到Log4J.java运行程序，即可看到你的POC代码块的结果

漏洞原理及详细内容不具体分析，仅仅记录一下

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
