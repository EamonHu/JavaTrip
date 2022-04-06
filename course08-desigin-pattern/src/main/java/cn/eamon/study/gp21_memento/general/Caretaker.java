package cn.eamon.study.gp21_memento.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/6 22:30
 */
public class Caretaker {
    // 备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void storeMemento(Memento memento) {
        this.memento = memento;
    }
}
