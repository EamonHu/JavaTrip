package cn.eamon.study.gp21_memento.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/6 22:30
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
