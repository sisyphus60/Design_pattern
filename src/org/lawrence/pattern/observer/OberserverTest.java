package org.lawrence.pattern.observer;

public class OberserverTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Oberserver oberserver = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(oberserver);
        subject.changeState("adfas");
    }

}
