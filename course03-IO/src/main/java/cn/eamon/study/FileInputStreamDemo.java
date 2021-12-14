package cn.eamon.study;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/8/7 0:01
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        User user1 = new User("ming", "123");
        User user2 = new User("hong", "456");
        User user3 = new User("qing", "789");
        ArrayList<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        File f = new File("./users.txt");

        // 读取
        FileInputStream fileInputStream = new FileInputStream(f);
        //如果文件不存在会自动创建 写到文件里
        OutputStream fileOutputStream = new FileOutputStream("./users_backup.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        String str = "Hello World";
        for (User user : list) {
            objectOutputStream.writeObject(user);
        }
        //因为是字节流，所以要转化成字节数组进行输出
      /*  int len = 0;
        byte[] buffer = new byte[1024];
        while((len = fileInputStream.read(buffer)) !=-1 ){
            fileOutputStream.write(buffer,0,len);
        }*/
        fileOutputStream.close();
        fileInputStream.close();
        objectOutputStream.close();
    }

}
