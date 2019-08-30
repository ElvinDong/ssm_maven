package cn.hbstd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hbstd.service.UserService;
import cn.hbstd.vo.EasyuiResult;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
                * 查询用户列表
     * 
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public EasyuiResult queryUserList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        EasyuiResult easyUIResult = this.userService.queryUserList(page, rows);
        return easyUIResult;
    }
    
    /*
     * @RequestMapping(value = "topage", method = RequestMethod.GET) public String toPage() { return
     * "users"; }
     */
    
    

}
