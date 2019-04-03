package cn.burette.o2o.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tb_local_auth")
public class LocalAuth {

    private Long localAuth;

    private String username;

    private String password;

    private Date createTime;

    private Date lastEditTime;

    private PersonInfo personInfo;
}
