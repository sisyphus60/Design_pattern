package org.lawrence.pattern.observer;

public class ConcreteSubject extends Subject {

    public void changeState(String state) {
        mState = state;
        onChanged();
    }
    
    @Override
    public void onChanged() {
        // TODO Auto-generated method stub
        notifyObserver();
    }

}
