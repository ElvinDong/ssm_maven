package cn.hbstd.service;

import java.util.List;

/** 
* @author 作者 Your-Name: 
* @version 创建时间：2019年8月28日 上午10:56:26 
* 类说明 
*/
public interface BaseService<T> {

    /*
             * 增加
     */
    public void save(T t);

    /*
             * 删除
     */
    public void delete(T t);

    /*
               * 修改
     */
    public void modify(T t);

}
