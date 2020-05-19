package Restful;


import com.alibaba.fastjson.JSONObject;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Rest")
public class Rest {

    //用户验证
    @Path("/IPPort")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String verifyURL(String string) {
        HAHA ha = JSONObject.parseObject(string, HAHA.class);
        String haha = ha.getCS();
        System.out.println(haha);
        String result = "{\"IP\":\"127.0.0.1\",\"PORT\":\"8080\"}";
        return result;
    }
}
