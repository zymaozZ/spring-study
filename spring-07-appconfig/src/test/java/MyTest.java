import com.zymao.config.MyConfig;
import com.zymao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) applicationContext.getBean("getUser");

        System.out.println(user.getName());
    }
}
