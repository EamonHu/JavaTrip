package cn.eamon.study.gp12_adapter.general.object_adapter;

/**
 * @Author: Eamon
 * @Description: 受改造者类
 * @Date: 2022/2/27 21:42
 */
public class Adaptee {

   public int output220V(){
       int src = 220;
       System.out.println("电压=" + src);
       return src;
   }
}
