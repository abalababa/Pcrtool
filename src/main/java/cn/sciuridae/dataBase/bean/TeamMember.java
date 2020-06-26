package cn.sciuridae.dataBase.bean;

import cn.sciuridae.utils.stringTool;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author sciuridae
 * @since 2020-06-02
 */
@TableName("teamMember")
public class TeamMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userQQ")
    private long userQQ;

    private long groupQQ;

    private String name;

    private Boolean power;
    private String token;

    public TeamMember() {
        token = stringTool.random(20);//密匙生成
    }

    public TeamMember(long userQQ, long groupQQ, String name, Boolean power) {
        this.userQQ = userQQ;
        this.groupQQ = groupQQ;
        this.name = name;
        this.power = power;
        token = stringTool.random(20);//密匙生成
    }

    public TeamMember(long userQQ, long groupQQ, String name, Boolean power, String token) {
        this.userQQ = userQQ;
        this.groupQQ = groupQQ;
        this.name = name;
        this.power = power;
        this.token = token;
    }

    public long getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(long userQQ) {
        this.userQQ = userQQ;
    }

    public long getGroupQQ() {
        return groupQQ;
    }

    public void setGroupQQ(long groupQQ) {
        this.groupQQ = groupQQ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "userQQ=" + userQQ +
                ", groupQQ=" + groupQQ +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", token='" + token + '\'' +
                '}';
    }
}
