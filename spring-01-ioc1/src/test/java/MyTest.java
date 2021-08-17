import com.kuang.bean.person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Intian
 * @create 2021-07-05 10:10
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        person son =(person) context.getBean("son");
        System.out.println(son);
        person son1 =(person) context.getBean("son1");
        System.out.println(son1);
    }
}
