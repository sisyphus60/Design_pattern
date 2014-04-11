package org.lawrence.pattern.composite;

public class DepartmentCompany extends Company {

    public DepartmentCompany(String name) {
        super(name);
    }
    
    @Override
    public void add(Company company) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Company company) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("It is a department:  " + getName());
    }

}
