package cn.eamon.study.gp19_command.player;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:25
 */
public class Controller {
    private List<IAction> actions = new ArrayList<IAction>();

    public void addAction(IAction action){
        actions.add(action);
    }

    public void execute(IAction action){
        action.execute();
    }

    public void executes(){
        for (IAction action:actions) {
            action.execute();
        }
        actions.clear();
    }
}
