package cn.eamon.study.gp08_facade;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 21:22
 */
public class QualifyService {

    public boolean isAvailable(GifInfo git) {
        System.out.println("校验" + git.getName() + "积分通过，库存通过");
        return true;
    }
}
