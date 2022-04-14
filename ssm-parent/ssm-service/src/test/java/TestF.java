import com.dajuancai.pojo.Account;
import com.dajuancai.service.TestService;
import com.dajuancai.service.impl.TestServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestF {

    @Test
    public void findAll(){
        TestService testService = new TestServiceImpl();
        List<Account> all = testService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
