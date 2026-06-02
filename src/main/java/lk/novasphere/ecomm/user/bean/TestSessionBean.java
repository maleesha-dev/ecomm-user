package lk.novasphere.ecomm.user.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.PostActivate;
import jakarta.ejb.PrePassivate;
import jakarta.ejb.Stateful;
import lk.novasphere.ecomm.user.remote.TestRemote;

@Stateful
public class TestSessionBean implements TestRemote {

    int i;

    @PostConstruct
    public void init() {
        System.out.println("TestSessionBean : init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TestSessionBean : destroy");
    }

    @PostActivate
    public void postActivate(){
        System.out.println("TestSessionBean : postActivate");
    }

    @PrePassivate
    public void prePassivate(){
        System.out.println("TestSessionBean : prePassivate");
    }


//    public TestSessionBean() {
//        System.out.println("TestSessionBean Created" + this);
//    }

    @Override
    public String test() {

        i++;

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        return ("TestSessionBean : test" + i);
    }
}
