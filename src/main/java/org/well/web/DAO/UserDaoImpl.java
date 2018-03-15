package org.well.web.DAO;

public class UserDaoImpl implements UserDao {

    public void insertUserByUname(String uame) {
        System.out.println("插入了名为" + uame + "的用户");
    }
}
