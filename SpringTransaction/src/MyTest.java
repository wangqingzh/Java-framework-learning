import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangqing.bean.Student;
import com.wangqing.service.StudentService;

public class MyTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = (StudentService)applicationContext.getBean("studentService");
		Student student = studentService.selectStudent(1);
		Student stu = new Student();
		stu.setStuNo(5);
		stu.setStuName("lier");
		stu.setStuAge(52);
		studentService.insertStudent(stu);
		System.out.println(student);
	}
	
}
