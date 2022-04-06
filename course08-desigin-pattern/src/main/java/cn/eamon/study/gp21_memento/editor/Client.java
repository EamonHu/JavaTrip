package cn.eamon.study.gp21_memento.editor;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/6 22:37
 */
public class Client {
    public static void main(String[] args) {
        DraftsBox draftsBox = new DraftsBox();

        Editor editor = new Editor("Eamon学习设计模式",
                "还不错",
                "35576a9ef6fc407aa088eb8280fb1d9d.png");

        ArticleMemento articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("入栈完整的信息" + editor);

        System.out.println("==========首次修改入栈文章===========");
        editor.setTitle("设计模式学习笔记");
        editor.setContent("细节还需要优化");
        System.out.println("==========首次修改文章完成===========");
        System.out.println("完整的信息" + editor);
        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("==========保存到草稿箱===========");

        System.out.println("==========开始撤销：取出栈头===========");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("被撤销的完整的信息" + editor);
        System.out.println("==========撤销完成===========");


        System.out.println("==========第2次撤销：取出栈头===========");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("第二次撤销的完整信息" + editor);
        System.out.println("==========第2次撤销完成===========");
    }
}
// 输出：
//入栈完整的信息Editor{title='Eamon学习设计模式', content='还不错', imgs='35576a9ef6fc407aa088eb8280fb1d9d.png'}
//==========首次修改入栈文章===========
//==========首次修改文章完成===========
//完整的信息Editor{title='设计模式学习笔记', content='细节还需要优化', imgs='35576a9ef6fc407aa088eb8280fb1d9d.png'}
//==========保存到草稿箱===========
//==========开始撤销：取出栈头===========
//被撤销的完整的信息Editor{title='设计模式学习笔记', content='细节还需要优化', imgs='35576a9ef6fc407aa088eb8280fb1d9d.png'}
//==========撤销完成===========
//==========第2次撤销：取出栈头===========
//第二次撤销的完整信息Editor{title='Eamon学习设计模式', content='还不错', imgs='35576a9ef6fc407aa088eb8280fb1d9d.png'}
//==========第2次撤销完成===========
