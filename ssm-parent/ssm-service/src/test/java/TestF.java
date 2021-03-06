import com.dajuancai.dao.TestMapper;
import com.dajuancai.pojo.Account;
import com.dajuancai.service.TestService;
import com.dajuancai.service.impl.TestServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springconfig-service.xml"})
public class TestF {

    @Autowired
    private TestService testService;

    @Test
    public void findAll(){
        List<Account> all = testService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
