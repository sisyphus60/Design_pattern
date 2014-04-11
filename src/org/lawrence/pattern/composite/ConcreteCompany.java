package org.lawrence.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

    public ConcreteCompany(String name) {
        // TODO Auto-generated constructor stub
        super(name);
    }

    private List<Company> mList;
    
    @Override
    public void add(Company company) {
        // TODO Auto-generated method stub
        if (null == mList) {
            mList = new ArrayList<>();
        }
        mList.add(company);
    }

    @Override
    public void remove(Company company) {
        // TODO Auto-generated method stub
        if (null == mList) {
            mList.remove(company);
        }
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("It is a concrete company:  " + mName);
        
        int size = mList.size();
        for(int i = 0; i < size; i++) {
            mList.get(i).display();
        }
    }

}
