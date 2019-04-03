package cn.burette.o2o.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_erea")
public class Area {
    //引用类型而非基础类型的原因：基础类型会有默认值，不希望有默认值，空为空即可
    //ID表示主键
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ereaId;

    //名称
    @Column(nullable = false)
    private String ereaName;

    //权重,默认生成0
    @Column(columnDefinition = "int default 0", nullable = false)
    private Integer priority;

    //创建时间
    @Column(nullable = true)
    private Date createTime = null;

    //更新时间
    @Column(nullable = true)
    private Date lastEditTime = null;

    public Integer getEreaId() {
        return ereaId;
    }

    public void setEreaId(Integer ereaId) {
        this.ereaId = ereaId;
    }

    public String getEreaName() {
        return ereaName;
    }

    public void setEreaName(String ereaName) {
        this.ereaName = ereaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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
