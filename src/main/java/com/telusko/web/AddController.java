
package com.telusko.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
{
  @RequestMapping(value ="/add")
  public ModelAndView add(@RequestParam("t1") int num1,@RequestParam("t2") int num2)
  {
	  ModelAndView mv =new ModelAndView();
	  
	  //Suppose we don't get Error then we should make java folder in main and move it to main from resource
	  
	  int k =num1+num2;
	  mv.addObject("result",k);
	  mv.setViewName("result.jsp");
	  
	  return mv;
	  //return "result.jsp"
  }
}
