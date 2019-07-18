import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangqing.bean.Student;
import com.wangqing.service.IStudentService;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService studentService = (IStudentService)context.getBean("studentService");
		Student student = new Student();
		student.setStuName("2f1");
		student.setStuAge(55);
		studentService.insertStudent(student);
	}

}
