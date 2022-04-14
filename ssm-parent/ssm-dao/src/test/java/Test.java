import com.dajuancai.dao.TestMapper;
import com.dajuancai.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
//        构建工厂
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("springconfig-dao.xml");
        TestMapper testMapper = (TestMapper) classPathXmlApplicationContext.getBean("testMapper");
        List<Account> all = testMapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
    }

