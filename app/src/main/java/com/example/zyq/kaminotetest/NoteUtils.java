package com.example.zyq.kaminotetest;

import java.util.List;

/**
 * Created by zyq on 2018/3/2.
 * 尝试用枚举制作的单例note工具类
 * 目前使用范围过于局限，有点多此一举的感觉
 * 以后会改进
 */

enum NoteUtils {
    INSTANCE;   //单个实例

    /*-----------------方法-----------------*/

    /**
     * 保存note的方法
     * @param title 笔记的标题
     * @param content   笔记的详细内容
     * @param identifier    笔记的标识，UUID
     * @param createdDate   笔记的创建日期
     * 编辑日期另外添加
     */
    public void saveNote(String title, String content, String identifier, MyDate createdDate) {
        MyNote note = new MyNote(title, content, identifier, createdDate.toString());
        note.setLastEdited(createdDate.toString());
        note.setLastEdited(createdDate.toString());
        MainActivity.mNote.add(note);
        note.save();
    }
    //更新note的方法
    public void updateNote(MyNote note, String title, String content, MyDate editedDate) {
        note.setTitle(title);
        note.setContent(content);
        note.setLastEdited(editedDate.toString());
        note.save();
    }

    //移除note的方法
    public void removeNote(List<MyNote> mNote, int position) {
        mNote.remove(position);
    }
}
