package com.interview.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.interview.model.Student;
import com.interview.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Resource
	private StudentService studentService;

	@RequestMapping(value="/showname",method=RequestMethod.GET)
    public String showUserName(@RequestParam("uid") int uid,HttpServletRequest request,Model model){
        System.out.println("showname");
        Student student = studentService.selectById(uid);
        if(student != null){
        	model.addAttribute("name", student.getStudentName());
            model.addAttribute("age", student.getStudentAge());
            return "showName";
        }
        request.setAttribute("error", "没有找到该用户！");
        return "error";
    }
}
