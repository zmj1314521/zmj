package com.proxy.csdnProxy;

public class ImpUserDao implements UserDao {
    public String login(Long id) {
        User user = DataBase.getDataBaseInstance().getUserMap().get(id);
        if(user != null){
            DataBase.getDataBaseInstance().setCurrentUser(user);
            return "用户["+user.getName()+"]登录成功-----";
        }else {
            return "登录失败-用户"+id+"不存在！";
        }
    }

    public String logout() {
        User user = DataBase.getDataBaseInstance().getCurrentUser();
        if(user != null){
            DataBase.getDataBaseInstance().setCurrentUser(null);
            return "用户["+user.getName()+"]注销成功-----";
        }else {
            return "注销失败，当前无登录用户";
        }
    }
}
