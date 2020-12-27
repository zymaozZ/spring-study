import com.zymao.service.UserService;
import com.zymao.service.UserServiceImpl;

public class MyTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
