package cn.hbstd.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hbstd.pojo.User;
import cn.hbstd.service.UserService;

/**
 * @author 作者 Your-Name: DM
 * @version 创建时间：2019年8月28日 下午2:20:36 类说明 : User的操作类
 */
@Controller
@RequestMapping("user/manage/")
public class UserManageController {

    @Autowired
    private UserService userService;

    /**
                * 新增用户
     * 
     * @param user
     * @return
     */
    @RequestMapping(value = "saveUser",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public Integer saveUser(@RequestBody User user) {
        try {
            user.setCreated(new Date());
            System.err.println(user);
            //this.userService.save(user);
            return 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 新增失败，响应500
        return 0;
    }

    /**
     * 更新用户
     * 
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> updateUser(User user) {
        try {
            this.userService.modify(user);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 新增失败，响应500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    /**
                 * 删除用户
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public Integer deleteUser(@RequestParam(value = "id", defaultValue = "0") Long id) {
        try {
            if (id.longValue() == 0) {
                // 没有传递参数，响应状态码400
                return 0;
            }
            User user = new User();
            user.setId(id);
            System.err.println(user);
            this.userService.delete(user);

            // 删除成功，响应204
            return 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 删除失败，响应500
        return 0;
    }
}
