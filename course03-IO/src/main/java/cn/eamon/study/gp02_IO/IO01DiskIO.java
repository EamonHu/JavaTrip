package cn.eamon.study.gp02_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author: Eamon
 * @Description: 磁盘IO
 * @Date: 2021/8/18 22:40
 */
public class IO01DiskIO {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("F:/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
