import callback.Teacher;
import callback.Tony;

/**
 * Created by admin on 2018/4/20.
 */
public class MainExc {

    public static void main(String[] args) {

        Tony tony = new Tony();
        Teacher teacher = new Teacher();
        teacher.askQuestion(tony);

    }
}
