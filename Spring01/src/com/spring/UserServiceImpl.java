package com.spring;

/**
 * @author lee
 * @date 2020/4/20 - 10:02 上午
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void Say() {
        this.userDao.Say();
        System.out.println("UserService hello world");
    }


}
