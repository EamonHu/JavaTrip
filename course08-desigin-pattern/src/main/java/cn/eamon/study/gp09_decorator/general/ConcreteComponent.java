package cn.eamon.study.gp09_decorator.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:09
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("实现业务处理");
    }
}
