# spring-learning

学习使用 spring 框架

### java

* 使用 spring 编写简单的 java 程序

### springmvc

* by vscode

* 使用 spring 编写 java web，使用vscode 编写，自己定义的文件目录（貌似vscode 可以更好的编写spring root项目）

```bash
# 由于 spring 项目有大量依赖包，编译 java文件时需要导入
# vscode编译导入进 .classpath 文件太麻烦
# 使用 javac -Djava.ext.dirs 编译
javac -Djava.ext.dirs=WEB-INF/lib src/club/qixqi/springmvc/HelloSpring.java
```

