package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();

//        userDao.createUsersTable();

        userDao.saveUser("Vlad", "Ivanov", (byte) 15);
//        userDao.saveUser("Name2", "LastName2", (byte) 25);
//        userDao.saveUser("Name3", "LastName3", (byte) 31);
//        userDao.saveUser("Name4", "LastName4", (byte) 38);

  //      userDao.removeUserById(3);
//        System.out.println(userDao.getAllUsers());
//        userDao.cleanUsersTable();
//        userDao.dropUsersTable();

    }
}
