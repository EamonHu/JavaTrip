package cn.eamon.study;

/**
 * @Author: Eamon
 * @Description: IHelloService实现类
 * @Date: 2021/7/30 16:04
 */
public class HelloServiceImpl implements IHelloService {

    /**
     * 打招呼实现类
     * @param name 名字
     * @return 打招呼内容
     */
    public String sayHello(String name) {
        return "Hello:" + name;
    }
}
