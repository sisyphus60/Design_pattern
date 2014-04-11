package org.lawrence.pattern.observer;

public class ConcreteObserver extends Oberserver {

    @Override
    public void update(String state) {
        // TODO Auto-generated method stub
        
        System.out.println("Now the subject's state is changed to: " + state);
        
    }

}
