ClassNotFound错误的意思是类找不到， 也就是class文件找不到。这时候我们要检查一下执行java 命令的目录下是否有HelloWorld.class文件。在Linux和Mac上，命令是ls，在Windows上， 命令是dir。

如果确实没有这个文件，就执行一下 javac命令

``` javac HelloWorld.java ```

应该就可以生成class文件了，这时候再执行

``` java HelloWorld ```

应该就可以了。

Good Luck~
