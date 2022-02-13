package cn.eamon.study.gp09_decorator.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:10
 */
public abstract class Decorator extends Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
