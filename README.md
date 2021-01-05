# 关于

## 常见错误
1. java.lang.ClassNotFoundException：将所需`jar`包从`maven`安装路径中复制一份到`lib`目录下，然后修改`.classpath`，
增加一项 `<classpathentry kind="lib" path="lib/mysql-connector-java-5.1.47.jar"/>`