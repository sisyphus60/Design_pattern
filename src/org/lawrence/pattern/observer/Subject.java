package org.lawrence.pattern.observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
    public String mState;
    private List<Oberserver> mLists = new ArrayList<>();
    
    public void attach(Oberserver oberserver) {
        mLists.add(oberserver);
    }
    
    public void detach(Oberserver oberserver) {
        mLists.remove(oberserver);
    }
    
    public void notifyObserver() {
        for(Oberserver oberserver : mLists) {
            oberserver.update(mState);
        }
    }
    
    public abstract void onChanged();
}
