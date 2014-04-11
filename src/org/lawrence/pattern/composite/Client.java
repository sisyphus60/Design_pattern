package org.lawrence.pattern.composite;

public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Company group = new ConcreteCompany("Alibaba");
        
        Company etao = new ConcreteCompany("etao");
        Company taobao = new ConcreteCompany("taobao");
        
        Company bijia = new DepartmentCompany("bijia");
        Company shouji = new DepartmentCompany("shouji");
        
        Company wuxian = new DepartmentCompany("wuxian");
        Company pc = new DepartmentCompany("pc");
        
        etao.add(bijia);
        etao.add(shouji);
        
        taobao.add(wuxian);
        taobao.add(pc);
        
        group.add(etao);
        group.add(taobao);
        
        group.display();
    }

}
