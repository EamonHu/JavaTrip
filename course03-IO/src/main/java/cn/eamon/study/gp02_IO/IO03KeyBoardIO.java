package cn.eamon.study.gp02_IO;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Eamon
 * @Description: 键盘IO
 * @Date: 2021/8/18 22:47
 */
public class IO03KeyBoardIO {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;

        int i = 0;
        while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
