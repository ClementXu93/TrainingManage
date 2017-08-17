package cn.cqbti.model;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * @Author: clement
 * @Description:
 * @Date: Create in 09:32 2017/8/17
 */
@TableName(value = "qjk_user_leader")
public class QjkUser implements Serializable {


    private Integer userid;

    private Integer leaderid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(Integer leaderid) {
        this.leaderid = leaderid;
    }

    @Override
    public String toString() {
        return "QjkUser{" +
                "userid=" + userid +
                ", leaderid=" + leaderid +
                '}';
    }
}
