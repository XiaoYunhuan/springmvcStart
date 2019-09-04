package controller;
/*
 * @Title: AnnotateHelloController
 * @Package: controller
 * @Description:
 * @author: xiaoyh
 * @date: 2019/9/2 14:47
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName : AnnotateHelloController
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/9/2 14:47
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/
@Controller
public class AnnotateHelloController {

    @RequestMapping("/annotateHello")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "annotateHello Spring MVC");
        return mav;
    }


    @RequestMapping("/form")
    public ModelAndView form(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return new ModelAndView("form");
    }


    @RequestMapping("/param")
    @ResponseBody
    public String getParam(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.out.println(userName);
        System.out.println(password);
        return "success";
    }

    @RequestMapping("/param1")
    @ResponseBody
    public String getParam1(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);
        return "success";
    }

    @RequestMapping("/param2")
    @ResponseBody
    public String getParam2(@RequestParam("userName") String userName, @RequestParam("password")String password) {
        System.out.println(userName);
        System.out.println(password);
        return "success";
    }

    @RequestMapping("/param3")
    @ResponseBody
    public String getParam3(User user) {
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        return "success";
    }

    @RequestMapping("/value")
    public ModelAndView handleRequestValue(HttpServletRequest request,
                                      HttpServletResponse response) {
        request.setAttribute("message","成功！");
        return new ModelAndView("test1");
    }


    @ModelAttribute
    public void model(Model model) {
        model.addAttribute("message", "注解成功");
    }

    @RequestMapping("/value1")
    public String handleRequest() {
        return "test1";
    }

    @RequestMapping("/jump")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView("redirect:/hello");
        return mav;
    }

    @RequestMapping("/jump1")
    public String jump1() {
        return "redirect:./hello";
    }

}
