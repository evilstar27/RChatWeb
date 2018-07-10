package net.morningstar.web.chat.push.service;

import net.morningstar.web.chat.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author morningstar
 * @date 2018/7/10
 */
// 127.0.0.1/api/account/... 映射的地址
@Path("/account")
public class AccountService {

    //GET 127.0.0.1/api/account/login
    @GET
    @Path("/login")
    public String get() {
        return "you get the login.";
    }

    //POST 127.0.0.1/api/account/login
    @POST
    @Path("/login")
    // 指定请求与返回的响应体为JSON
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post() {
        User user = new User();
        user.setName("A");
        user.setSex(1);
        return user;
    }


}
