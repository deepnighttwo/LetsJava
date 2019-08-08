有些同学碰到了配置 JDK 的问题。最明显的现象就是各种不能用，源代码里的 String 类也是显示为红色的，编译也是各种报错。有时候源代码编辑器的右上角还会提示 Setup JSK。

如果编辑器上告诉你要Setup JDK，那么点一下就可以进入到配置JDK的对话框了。如果没看到的话，可以通过下面的方式打开配置JDK的对话框：

 - 选择菜单栏里的 File -> Project Structure...
 - 在弹出的对话框里，选择 Platform Settings 下的 SDKs
 - 在右边就可以配置 JDK 了
 
如果右边没有JDK列出来，或者列出来的JDK是红色的（代表配置的不对，可以选择上面的减号删掉它），那么就需要增加一个JDK。增加的方法也很简单，就是点一下加号，选择JDK，然后在弹出的对话框中，选择JDK的安装目录。注意是安装目录。
如果选择的正确的话，在右边的 class path 选项卡上会有十几个jar包，source选项卡里也会有一个zip包，里面是Java类库源代码。

效果如下图所示，下图是mac上的状态，Windows上除了JDK的安装目录不一样之外，别的都是类似的。例子里是用的Zulu的JDK8

![IntelliJ 里的 JDK 配置窗口](/FAQ/imgs/setup_jdk_in_intellij_idea.png?raw=true)
