package cn.eamon.study.gp11_compositepattern.general.safe;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 22:55
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
