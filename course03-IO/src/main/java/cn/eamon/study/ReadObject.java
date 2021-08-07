package cn.eamon.study;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/8/7 0:39
 */
public class ReadObject {
    public static void main(String[] args) throws IOException {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./users_backup.txt"));

            User user = (User)objectInputStream.readObject();
            System.out.print("用户名："+user.getUserName());
            System.out.println("密码："+user.getPassWord());
            System.out.println(user);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
