package com.ljy.designmode.Memento;

/**
 * @author fengyue
 * @date 2021/11/17
 */
public class Boy {

    private String state="";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void changState(){
        this.state = "心情不大好...";
    }


    public Memento createMemento(){
        return new Memento();
    }

    public void restoreMemento(Memento memento){
        this.state=memento.getState();
    }
}
