package cn.eamon.study.gp02_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Eamon
 * @Description: 文件File操作：通过控制台输入电脑路径，递归遍历输出所有文件
 * @Date: 2021/8/18 22:58
 */
public class IO04File {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            // 读取用户输入的路径
            String path = bufferedReader.readLine();
            File file = new File(path);
            if (file.exists() && file.isDirectory()) {
                // 便利这个目录下的所有子目录
                fileList(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStreamReader.close();
            bufferedReader.close();
        }
    }

    private static void fileList(File filePath) {
        File[] files = filePath.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                } else {
                    //是一个目录
                    fileList(file);
                }
            }
        }
    }
}
