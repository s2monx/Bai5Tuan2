package com.example.student.bai5tuan2;

import java.util.ArrayList;

public class ListXuly {
    private ArrayList list = new ArrayList();

    public ListXuly(ArrayList list) {
        this.list = list;
    }

    public ArrayList getList(int i) {
        list.add(i);
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
