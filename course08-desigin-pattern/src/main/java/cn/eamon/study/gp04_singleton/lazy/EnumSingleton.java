package cn.eamon.study.gp04_singleton.lazy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/16 11:38
 */
public enum EnumSingleton {
    /**
     * 全局唯一单例
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
