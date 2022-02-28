package cn.eamon.study.gp11_compositepattern.general.transparent;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 22:50
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}
