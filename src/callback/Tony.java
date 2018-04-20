package callback;

/**
 * Created by admin on 2018/4/20.
 */
public class Tony extends Student {

    @Override
    public void resolveQuestion(Teacher teacher) {
        teacher.tellAnswer(3);
    }
}
