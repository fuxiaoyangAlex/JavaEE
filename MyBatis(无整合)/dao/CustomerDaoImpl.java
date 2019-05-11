package com.niit.dao;

import com.niit.domain.Customer;
import com.niit.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @ClassName CustomerDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/3/27 10:01
 * @Version 1.8
 **/
public class CustomerDaoImpl implements CustomerDao {
//    4.使用SqlSession对象操作数据库
    SqlSession session;
    @Override
    public int insertCustomer(Customer customer) throws Exception {
           session= MyBatisUtil.getSession();
        int result=session.insert("insertCustomer",customer);
        session.commit();
        session.close();
        return result;
    }

    @Override
    public int deleteCustomer(int id) {
        session=MyBatisUtil.getSession();
        int result=session.delete("deleteCustomer",id);
        session.commit();
        session.close();
        return result;
    }

    @Override
    public int updateCustomer(Customer customer) throws Exception {
        session=MyBatisUtil.getSession();
        int result=session.update("updateCustomer",customer);
        session.commit();
        session.close();
        return result;
    }

    @Override
    public Customer getCustomerById(int id) throws Exception {
            session=MyBatisUtil.getSession();
        Customer customer = session.selectOne("getCustomer",id);
        session.commit();
        session.close();
        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() throws Exception {
        session=MyBatisUtil.getSession();
        List<Customer> customersList=session.selectList("getAllCustomer");
        session.commit();
        session.close();
        return customersList;
    }

    @Override
    public List<Customer> getCustomerByNameLike(String keyword) throws Exception {
        session=MyBatisUtil.getSession();
        List<Customer> customersList=session.selectList("getCustomerByNameLike",keyword);
        session.commit();
        session.close();
        return customersList;
    }
    @Override
    public List<Customer> findCustomerByNameAndJobs(Customer customer) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSession();
        List<Customer> customerList = sqlSession.selectList("findCustomerByNameAndJobs",customer);
        sqlSession.commit();
        sqlSession.close();
        return customerList;
    }

    @Override
    public List<Customer> findCustomerByNameOrJobs(Customer customer) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSession();
        List<Customer> customerList =
                sqlSession.selectList("findCustomerByNameOrJobs",customer);
        sqlSession.commit();
        sqlSession.close();
        return customerList;
    }

    @Override
    public List<Customer> getCustomerByIds(List<Integer> ids) throws Exception {
        return null;
    }
}
