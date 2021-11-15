package $16buildingJAR;

import com.test.Person;

import java.util.Date;

public class MyOrgEmployee extends Person {

    private String joinDate;

    public MyOrgEmployee(String name, long id) {
        super(name, id);
        this.joinDate = (new Date()).toString();
    }

    public String getJoinDate() {
        return joinDate;
    }

    public static void main(String[] args) {
        MyOrgEmployee ben = new MyOrgEmployee("Ben", 653);
        System.out.format("The new Employee: \nName: %s\nID: %d\nJoin Date: %s", ben.getName(), ben.getId(), ben.getJoinDate());
    }
}
