package cn.eamon.study.gp25_vistor.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:17
 */
public class ObjectStructure {
    private List<IElement> elementList = new ArrayList<IElement>();

    {
        this.elementList.add(new ConcreteElementA());
        this.elementList.add(new ConcreteElementB());
    }

    public void accept(IVisitor visitor) {
        for (IElement element : this.elementList) {
            element.accept(visitor);
        }
    }
}
