package cn.eamon.study.gp11_compositepattern.general.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 22:56
 */
public class Composite extends Component {
    private List<Component> mComponents;

    public Composite(String name) {
        super(name);
        this.mComponents = new ArrayList<Component>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component : this.mComponents) {
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    public boolean addChild(Component component) {
        return this.mComponents.add(component);
    }

    public boolean removeChild(Component component) {
        return this.mComponents.remove(component);
    }

    public Component getChild(int index) {
        return this.mComponents.get(index);
    }
}