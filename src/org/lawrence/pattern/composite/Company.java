package org.lawrence.pattern.composite;

public abstract class Company {

    public String mName;
    
    public Company() {
    }
    
    public Company(String name) {
        mName = name;
    }
    
    public String getName() {
        return mName;
    }
    
    public abstract void add(Company company);
    
    public abstract void remove(Company company);
    
    public abstract void display();
}
