package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * User:huangtao
 * Date:2015-10-14
 * description：
 */
@Controller
@RequestMapping(value = "/web/page")
public class DemoController extends ModelAndView{
    @RequestMapping(value = "/demo")
    public String demo(){
//        velocityEngine.getTemplate("page1");
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("page1");
//
//        return new ModelAndView("page1");
        return "hello";
    }
}
