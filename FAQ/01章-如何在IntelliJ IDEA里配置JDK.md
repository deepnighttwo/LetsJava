- [配置 JDK](#%e9%85%8d%e7%bd%ae-jdk)
- [强制重新编译](#%e5%bc%ba%e5%88%b6%e9%87%8d%e6%96%b0%e7%bc%96%e8%af%91)

# 配置 JDK 
有些同学碰到了配置 JDK 的问题。最明显的现象就是各种不能用，源代码里的 String 类也是显示为红色的，编译也是各种报错。有时候源代码编辑器的右上角还会提示 Setup JSK。

IntelliJ个JDK起名字的规则也很迷。对于JDK 11, 有时候IntelliJ会把它叫做JDK_11, 有时候会带上小版本, 比如JDK_11.02这种. 更不用说JDK版本不一样的情况, 比如JDK_8. 解决的方式是一样的，新建一个JDK的配置。

如果编辑器上告诉你要Setup JDK，那么点一下就可以进入到配置JDK的对话框了。如果没看到的话，可以通过下面的方式打开配置JDK的对话框：

 - 选择菜单栏里的 File -> Project Structure...
 - 在弹出的对话框里，选择 Platform Settings 下的 SDKs
 - 在右边就可以配置 JDK 了
 
如果右边没有JDK列出来，或者列出来的JDK是红色的（代表配置的不对，可以选择上面的减号删掉它），那么就需要增加一个JDK。增加的方法也很简单，就是点一下加号，选择JDK，然后在弹出的对话框中，选择JDK的安装目录。注意是安装目录。
如果选择的正确的话，在右边的 class path 选项卡上会有十几个jar包，source选项卡里也会有一个zip包，里面是Java类库源代码。

效果如下图所示，下图是mac上的状态，Windows上除了JDK的安装目录不一样之外，别的都是类似的。例子里是用的Zulu的JDK8

![IntelliJ 里的 JDK 配置窗口](/FAQ/imgs/setup_jdk_in_intellij_idea.png?raw=true)


# 强制重新编译

如果 JDK 的配置没有问题，那么可以尝试强制重新编译整个项目。IntelliJ其实是会自动帮我们增量编译的，也就是哪个源文件变化了，就尝试重新编译这个源文件并生成class文件。但是有时候IntelliJ也难免跟不上节奏，漏掉个什么的。这时候可以尝试重新编译整个项目。方法是在菜单栏里，选择 Build -> Rebuild Project




***

这篇文章来自极客时间推出的[《零基础学Java》](https://time.geekbang.org/course/intro/181)中的FAQ。除了在每节视频课下方回答大家的问题之外，针对大家提出的优质问题或者普遍问题，如果需要更大篇幅的文章解答，则会在FAQ中以文章的方式给出回答。带你零基础入门，夯实Java，课程地址：https://time.geekbang.org/course/intro/181


