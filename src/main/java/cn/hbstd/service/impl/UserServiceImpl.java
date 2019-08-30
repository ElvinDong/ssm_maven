package cn.hbstd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.hbstd.dao.UserDao;
import cn.hbstd.pojo.User;
import cn.hbstd.service.UserService;
import cn.hbstd.vo.EasyuiResult;;

/** 
* @author 作者 Your-Name: 
* @version 创建时间：2019年8月28日 上午11:00:02 
* 类说明 
*/
@Service
public class UserServiceImpl implements UserService{

    @Resource UserDao userDao;
    
    @Override
    public void save(User t) {
        // TODO Auto-generated method stub
        this.userDao.save(t);
    }

    @Override
    public void delete(User t) {
        // TODO Auto-generated method stub
        this.userDao.delete(t);
    }

    @Override
    public void modify(User t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public EasyuiResult queryUserList(Integer page, Integer rows) {
     // 设置分页参数
        PageHelper.startPage(page, rows);

        // 查询User数据
        Example example = new Example(User.class);
        example.setOrderByClause("updated DESC"); // 设置排序条件
        List<User> users = this.userDao.selectAll();

        // 获取分页后的信息
        PageInfo<User> pageInfo = new PageInfo<User>(users);

        return new EasyuiResult(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public User queryUserById(Long id) {
        // TODO Auto-generated method stub
        return userDao.queryUserById(id);
    }

 

  

}
