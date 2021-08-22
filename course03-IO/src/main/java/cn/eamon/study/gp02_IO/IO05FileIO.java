package cn.eamon.study.gp02_IO;

import java.io.*;

/**
 * @Author: Eamon
 * @Description: 基于文件的输入输出流实战
 * @Date: 2021/8/18 23:14
 */
public class IO05FileIO {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream("./test_cp.txt");

        int i = 0;
        while((i=fileInputStream.read())!=-1){
            fileOutputStream.write(i);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
