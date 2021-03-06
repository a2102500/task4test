package com.heitian.ssm.controller;

        import com.heitian.ssm.dao.UserDao;
        import com.heitian.ssm.model.User;
        import com.heitian.ssm.service.UserService;
        import org.apache.log4j.Logger;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.ui.ModelMap;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

        import javax.annotation.Resource;
        import javax.servlet.http.HttpServletRequest;
        import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;
    @Resource
    private UserDao userDao;

//    @RequestMapping(value ="/showUser",method= RequestMethod.GET)
//    public String getCount(ModelMap modelMap){
//        int count=userDao.count();
//        modelMap.put("count",count);
//        return "showUser";
//    }
    @RequestMapping(value ="/showUser",method= RequestMethod.GET)
    public String getHomeinfo(ModelMap modelMap){
        List<User> list=userDao.selectAllUser();
        int count=userDao.count();
        modelMap.put("userList",list);
        modelMap.put("count",count);
        return "showUser";
    }

//    public String showUser(HttpServletRequest request, Model model){
        //        log.info("查询所有用户信息");
////        List<User> userList = userService.getAllUser();
////        model.addAttribute("userList",userList);
//
//
//
//        return "showUser";

}
