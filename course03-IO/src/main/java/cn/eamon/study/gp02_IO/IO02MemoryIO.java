package cn.eamon.study.gp02_IO;

import java.io.ByteArrayInputStream;

/**
 * @Author: Eamon
 * @Description: 内存IO
 * @Date: 2021/8/18 22:45
 */
public class IO02MemoryIO {
    public static void main(String[] args) {
        String str = "hello Eamon";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        int i = 0;
        while ((i = byteArrayInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
