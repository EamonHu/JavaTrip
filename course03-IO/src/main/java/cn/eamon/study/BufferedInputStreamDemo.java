package cn.eamon.study;

import java.io.*;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/8/7 0:01
 */
public class BufferedInputStreamDemo {

    public static void main(String[] args) {
        try {
            BufferedInputStream bufferedInputStream =
                    new BufferedInputStream(new FileInputStream("./users.txt"));
            BufferedOutputStream bufferedOutputStream =
                    new BufferedOutputStream(new FileOutputStream("./test.txt"));

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = bufferedInputStream.read(buf)) != -1) {
                bufferedOutputStream.write(buf);
                bufferedOutputStream.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
