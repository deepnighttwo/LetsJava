
ClassNotFound错误的意思是类找不到， 也就是class文件找不到。

首先是严格检查文件名没错并且大小写也一致。程序员需要练就一双火眼金睛，能从万千的1里挑出那个l。

如果确实是一样一样的，那么接下来我们要检查一下执行 java 命令的目录下是否有HelloWorld.class文件。在Linux和Mac上，命令是ls，在Windows上， 命令是dir。


如果确实没有这个文件，就执行一下 javac命令

``` javac HelloWorld.java ```

应该就可以生成class文件了，这时候再执行

``` java HelloWorld ```

应该就可以了。

Good Luck~
