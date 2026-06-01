package lk.novasphere.ecomm.user.remote;

import jakarta.ejb.Remote;

@Remote
public interface TestRemote {
    String test();
}
