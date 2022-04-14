import com.dajuancai.pojo.Account;
import com.dajuancai.service.TestService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

public class HelloTest {

    @Autowired
    private  TestService testService;

@org.junit.Test
    public void test(){
        List<Account> all = testService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
