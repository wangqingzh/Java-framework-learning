import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.wangqing.beans.Grade;
import com.wangqing.beans.Student;
import com.wangqing.dao.RelationalMapper;
import com.wangqing.utils.MybatisUtils;

public class MyTest {

	
	
	@Before
	public void before() {
		
	}
	
	
	
	@Test
	public void testRelation() {
		SqlSession session = MybatisUtils.getSession();
		RelationalMapper rm = session.getMapper(RelationalMapper.class);
		Grade gr = rm.selectGradeWithStudents(1);
		List<Student> students = gr.getStudents();
		System.out.println("\n\n------------------------------------------------------");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("------------------------------------------------------\n\n");
	}
}
