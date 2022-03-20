package cn.eamon.study.gp16_strategy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/25 21:54
 */
public class Result {
    private Object data;
    private boolean flag;

    public Result(Object data, boolean flag) {
        this.data = data;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", flag=" + flag +
                '}';
    }
}
