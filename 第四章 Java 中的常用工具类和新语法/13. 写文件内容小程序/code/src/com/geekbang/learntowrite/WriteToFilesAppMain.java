package com.geekbang.learntowrite;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WriteToFilesAppMain {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        File targetFile = createFile();

        writeToFile(targetFile);

        System.out.println("程序执行结束");

    }

    private static void writeToFile(File targetFile) throws IOException {
        // TODO try with resource，帮我们搞定close
        try (
            // TODO 创建一个outputstream（应该是outputstream，谢谢@安东 捉住bug一个），建立一个从文件到程序的byte数据传输流
            FileOutputStream fos = new FileOutputStream(targetFile);
            // TODO 建立一个可以消费inputstream（应该是outputstream，谢谢@安东 捉住bug一个）的writer，并指定字符集，这样就可以一个个的写入字符了
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            // TODO 使用PrintWriter，可以方便的写入一行字符
            PrintWriter pw = new PrintWriter(osw);
        ) {
            // TODO 猜猜System.out是个啥？
            System.out.println("输入的内容会实时写入文件，如果输入空行则结束");
            while (true) {
                String lineToWrite = in.nextLine().trim();
                System.out.println("输入内容为" + lineToWrite);
                if (lineToWrite.trim().isBlank()) {
                    System.out.println("输入结束");
                    break;
                } else {
                    pw.println(lineToWrite);
                    pw.flush();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static File createFile() throws IOException {
        System.out.println("请输入文件名：");
        String fileName = in.nextLine().trim();
        File f = new File("." + File.separator + fileName + ".txt");
        if (f.isFile()) {
            System.out.println("目标文件存在，删除：" + f.delete());
        }
        System.out.println(f.createNewFile());
        return f;
    }

}
