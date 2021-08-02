package cn.eamon.study;

import java.io.Serializable;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/30 16:31
 */
public class RpcRequest implements Serializable {

    private String className;
    private String methodName;

    private Object[] parameters;
    private Class[] types;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

    public Class[] getTypes() {
        return types;
    }

    public void setTypes(Class[] types) {
        this.types = types;
    }
}
