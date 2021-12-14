package cn.eamon.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Eamon
 * @Description: 文件读取
 * @Date: 2021/12/6 0:58
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            // 文件在项目根目录下
            fileInputStream = new FileInputStream("text01.txt");
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
