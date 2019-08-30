package cn.hbstd.dao;

import cn.hbstd.pojo.User;

/** 
* @author 作者 Your-Name: 
* @version 创建时间：2019年8月28日 上午10:32:38 
* 类说明 
*/
public interface UserDao extends BaseDao<User> {
    
    public User queryUserById(Long id);

}
