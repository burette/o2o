package cn.burette.o2o.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_person_info")
public class PersonInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(columnDefinition = "VARCHAR(32)")
    private String name;

    @Column(columnDefinition = "VARCHAR(1024)")
    private String profileImg;

    @Column(columnDefinition = "VARCHAR(1024)")
    private String email;

    @Column(columnDefinition = "VARCHAR(2)")
    private String gender;

    @Column(nullable = false,columnDefinition = "INT(2) default '0' COMMENT '0:禁止使用本商城，1：可以使用本商城'")
    private Integer enableStatus;

    @Column(columnDefinition = "INT(2) default '1' COMMENT '1:顾客，2：店家，3：超级管理员'")
    //1.顾客，2.店家，3.超级管理员
    private Integer userType;


    private Date createTime;
    private Date lastEditTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
