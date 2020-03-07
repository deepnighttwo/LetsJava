- [问题：Scanner没有消费掉那个回车换行符](#%e9%97%ae%e9%a2%98scanner%e6%b2%a1%e6%9c%89%e6%b6%88%e8%b4%b9%e6%8e%89%e9%82%a3%e4%b8%aa%e5%9b%9e%e8%bd%a6%e6%8d%a2%e8%a1%8c%e7%ac%a6)
- [解决方法：使用nextLine](#%e8%a7%a3%e5%86%b3%e6%96%b9%e6%b3%95%e4%bd%bf%e7%94%a8nextline)

# 问题：Scanner没有消费掉那个回车换行符

@carZycriss 同学在26 用数组保存成绩一节中提出了一个问题，是和Scanner使用相关的。 应该有不少同学遇到了这个问题。这里我把Scanner API再详细说一下。


问题如下

   请问老师，我通过以下两种方式尝试了录入成绩以及对应分数，但是第一种的录入方式没有得到我想要的录入一个科目名字再录入一个成绩的效果，java在我输入一个科目以及一个对应的科目名称后，变成了只让我输入分数，跳过了录入科目名字的环节，请问这是为什么？我采用第二种方式，将两个需要录入的数据分开录入，才可以。下面是我的录入的部分的代码，其他的我没有复制过来。

```java
第一种录入： 
//科目成绩的录入  
        for (int i = 0; i < scorecount; i++) {
            System.out.println("输入录入的科目名称：");
            kemu[i] = in.nextLine();
            System.out.println("输入录入科目的对应成绩：");
            fenshu[i] = in.nextInt();
        }
输出如下：
输入录入的科目名称：
语文
输入录入科目的对应成绩：
10
输入录入的科目名称：
输入录入科目的对应成绩：
10
输入录入的科目名称：
输入录入科目的对应成绩：
10
第二种：
//科目成绩的录入
        for (int i = 0; i < scorecount; i++) {
            System.out.println("输入录入的科目名称：");
            kemu[i] = in.nextLine();
        }
        for (int g=0;g<scorecount;g++){
            System.out.println("输入录入科目的对应成绩：");
            fenshu[g] = in.nextInt();
        }
输出如下：
输入录入的科目名称：
语文
输入录入的科目名称：
数学
输入录入的科目名称：
英语
输入录入科目的对应成绩：
10
输入录入科目的对应成绩：
10
输入录入科目的对应成绩：
5
最高分数科目及分数为：
    语文:10
    数学:10
```

# 解决方法：使用nextLine

下面是这个问题的解释。

首先，解释一下Scanner是个什么东西。Scanner的工作就是从命令行获取输入，攒着，等着我们调用它的方法，去顺序消费它攒的这些输入数据。

了解这个，主要是为了理解这一点：Scanner并不是把我们在命令行输入的数据，全部消费掉。

比如nextInt，其实它使用一个增则表达式，匹配已经输入或者正在输入的数据。但是无论如何，换行符都不会被nextInt这个方法消费掉。

那么问题就来了，我们输入一个

```
123

```
其实nextInt只消费了一个123，并没有消费最后的那个回车换行符。

**所以当输入一个123和一个回车换行之后，再调用nextInt，会收获一个123，然后在没有任何输入的情况下，再调用一个nextLine，会收获一个空字符串。**

行业内有个道理，对于 Java 这种成熟的语言，要坚信自己不是一个人在战斗（趟坑）。如果你发现是，那么大概率是选错了解决问题的方式方法。

那么怎么看别人趟过的坑呢？Stackoverflow！

Scanner的这个坑，也是有人趟过的详见下面的问题： [Integer.parseInt(scanner.nextLine()) vs scanner.nextInt()](https://stackoverflow.com/questions/26586489/integer-parseintscanner-nextline-vs-scanner-nextint)

当然这也是我建议的解决问题的方式，如果你确定要让用户输入的一行内容就是一个int，那么可以这么用：

```
Integer.parseInt(scanner.nextLine())
```



***

这篇文章来自极客时间推出的[《零基础学Java》](https://time.geekbang.org/course/intro/181)中的FAQ。除了在每节视频课下方回答大家的问题之外，针对大家提出的优质问题或者普遍问题，如果需要更大篇幅的文章解答，则会在FAQ中以文章的方式给出回答。带你零基础入门，夯实Java，课程地址：https://time.geekbang.org/course/intro/181


