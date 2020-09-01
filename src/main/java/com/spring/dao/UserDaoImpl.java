package com.spring.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.User;
 
@Repository
public class UserDaoImpl extends AbstractDao implements UserDao{
 
	@Autowired
	private HttpSession sess;
	
    public void saveUser(User usr) {
//    	System.out.println("Saving User in DaoImpl == " + sess.getAttribute("name"));
        persist(usr);
    }
 
    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        Criteria criteria = getSession().createCriteria(User.class);
        return (List<User>) criteria.list();
    }
 
    public void deleteUserById(int id) {
        Query query = getSession().createSQLQuery("delete from User where userId = :userId");
        query.setInteger("userId", id);
        query.executeUpdate();
    }
 
     
    public User findById(int id){
    	Query qry = getSession().createQuery("from User userObj where userObj.userId = " + id);
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("userId", id));
        return (User) criteria.uniqueResult();
    }
     
    public void updateUser(User usr){
        getSession().update(usr);
    }
    
    public boolean findUser(User usr) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("userId", usr.getUserId()));
        criteria.add(Restrictions.eq("password", usr.getPassword()));
    	
        usr = (User) criteria.uniqueResult();
        
        if(usr == null)
        	return false;
        
        return true;
    }
}