package callback;

/**
 * Created by admin on 2018/4/20.
 */
public class Teacher implements CallBack{


    public void askQuestion(Student stu){
        stu.resolveQuestion(this);
    }

    @Override
    public void tellAnswer(int answer) {
        System.out.println("你回答的是 : "+ answer);
    }
}
