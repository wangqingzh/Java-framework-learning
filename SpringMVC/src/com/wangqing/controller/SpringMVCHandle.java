package com.wangqing.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.wangqing.bean.Student;

@Controller
@SessionAttributes("student4")
public class SpringMVCHandle {
	@RequestMapping(value="welcome/{name}") 
	//method指定拦截的请求方法 <a />是get params指定请求参数必须是xx
	public @ResponseBody String welcome(@PathVariable("name") String name, @RequestParam(value="username") String username) {
		System.out.println(username);
		System.out.println(name);
		return "success"; //默认使用了请求转发的跳转方式    |非重定向
	}

	@RequestMapping("testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String jsession, @RequestHeader("Accept-Language") String rh) {
		System.out.println(jsession + "\n" + rh);
		return "success";
	}
	
	@RequestMapping(value="testModelAndView")
	public ModelAndView testModelAndView() {
		ModelAndView mv = new ModelAndView("success");//view: views/success.jsp
		Student student = new Student();
		student.setStuId(5);
		student.setStuName("wangqing");
		mv.addObject("student1", student);//相当于request.setAttribute("student", student);
		
		return mv;
	}
	
	@RequestMapping(value="testModelMap")
	public String testModelMap(ModelMap mm) {
		Student student = new Student();
		student.setStuId(3);
		student.setStuName("ModelMap");
		mm.put("student2", student);
		return "success";
	}
	
	@RequestMapping(value="testModel")
	public String testModel(Model m) {
		Student student = new Student();
		student.setStuId(2);
		student.setStuName("Model");
		m.addAttribute("student3", student);
		return "success";
	}
	
	@RequestMapping(value="testMap")
	public String testMap(Map<String, Object> map) {
		Student studentx = new Student();
		studentx.setStuId(1);
		studentx.setStuName("map");
		map.put("student4", studentx);
		return "success";
	}

	@ModelAttribute
	public void queryStudentById(Map<String, Student> map) {
		Student student = new Student();
		student.setStuId(23);
		student.setStuName("zs");
		map.put("student", student);
	}
	
	@RequestMapping(value="testModelAttribute")
	public String testModelAttribute(Student student) {
		System.out.println(student.getStuName());
		return "success";
	}
	
	@RequestMapping("testForward")
	public String  testReForward() {
		return "forward:/views/success.jsp";
	}
	
	@RequestMapping("testReDirect")
	public String  testReDirect() {
		return "redirect:/views/success.jsp";
	}
	
	@RequestMapping("testTypeConversion/{id}")
	public String  testTypeConversion(@PathVariable("id") String id) {
		System.out.println(id);
		return "redirect:/views/success.jsp";
	}
	
	@RequestMapping("testConverter")
	public String  testConverter(@RequestParam("studentInfo") Student student) {
		System.out.println(student.getStuId() + "\n" + student.getStuName());
		return "redirect:/views/success.jsp";
	}
	
	@RequestMapping("testDateTimeFormat")//如果student格式化出错  会将错误信息传入result
	public String  testDateTimeFormat(@Valid Student student, BindingResult result) {
		if(result.getErrorCount() > 0) {
			for (FieldError error : result.getFieldErrors()) {
				System.out.println(error.getDefaultMessage());
			}
		}
		System.out.println(student.getStuId() + "\n" + student.getStuName() + "\n"
				+ student.getBirthday());
		return "success";
	}
	@ResponseBody
	@RequestMapping("testJson")
	public List<Student> testJson(){
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student(1, "zs");
		Student student2 = new Student(2, "ls");
		Student student3 = new Student(3, "ww");
		Student student4 = new Student(4, "zl");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		return students;
	}
	@RequestMapping("testFileUpload")
	public String testFileUpload(@RequestParam("file") MultipartFile file, @RequestParam("desc") String desc) {
		System.out.println(desc);
		try {
			InputStream input = file.getInputStream();
			String fileName = file.getOriginalFilename();
			OutputStream output = new FileOutputStream("d:\\" + fileName);
			byte[] bs = new byte[1024];
			int len = -1;
			while((len = input.read(bs)) != -1) {
				output.write(bs, 0, len);
			}
			output.close();
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("上传成功");
		return "success";
	}
	
	@RequestMapping("testExceptionHandle")
	public String testExceptionHandle() {
		System.out.println(1/0);
		return "success";
	}
	
	
}
