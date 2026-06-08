package lk.novasphere.ecomm.user.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.*;
import lk.novasphere.ecomm.user.remote.TestRemote;

@Stateful(mappedName = "TestNewSessionBean")
//@Startup
public class TestNewSessionBean implements TestRemote {

    int i;

    @PostConstruct
    public void init() {
        System.out.println("TestNewSessionBean : init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TestNewSessionBean : destroy");
    }

    @PostActivate
    public void postActivate() {
        System.out.println("TestNewSessionBean : postActivate");
    }

    @PrePassivate
    public void prePassivate() {
        System.out.println("TestNewSessionBean : prePassivate");
    }

    @Remove
    @Override
    public void remove() {
        System.out.println("TestNewSessionBean : removed...");
    }

    @Override
    @Lock(LockType.READ)
    public String test() {
        i++;
        System.out.println("TestNewSessionBean : test..");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "TestNewSessionBean : test" + i;
    }
}
