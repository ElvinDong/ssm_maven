package cn.hbstd.dao;

import java.util.List;

/** 
* @author 作者 Your-Name: DM
* @version 创建时间：2019年8月28日 上午10:29:37 
* 类说明 
*  基本的增删改查
*/
public interface BaseDao<T> {

    /*
             *  增加
     */
    public int save(T t);
    
    /*
             * 删除
     */
    public int delete(T t);
    
    /*
             *  修改
     */
    public int modify(T t);
    
    /*
                * 查询全部
     */
    public List<T> selectAll();
    
}
