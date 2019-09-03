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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
@RequestMapping("yltx")
public class AnnotateHelloController {

    @RequestMapping("/annotateHello")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("index.jsp");
        mav.addObject("message", "annotateHello Spring MVC");
        return mav;
    }

}
