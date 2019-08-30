package cn.hbstd.service;

import cn.hbstd.pojo.User;
import cn.hbstd.vo.EasyuiResult;;

/** 
* @author 作者 Your-Name: 
* @version 创建时间：2019年8月28日 上午10:57:30 
* 类说明 
*/
public interface UserService extends BaseService<User> {

    public EasyuiResult queryUserList(Integer page, Integer rows);
    
    public User queryUserById(Long id);
}
