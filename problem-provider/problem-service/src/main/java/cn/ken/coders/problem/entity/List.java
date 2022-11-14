package cn.ken.coders.problem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 题单表
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@TableName("ct_list")
@ApiModel(value = "List对象", description = "题单表")
public class List implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("题单id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("题单名称")
    private String name;

    @ApiModelProperty("题单作者id")
    private Long authorId;

    @ApiModelProperty("题目数量")
    private Integer problemNum;

    @ApiModelProperty("题单类型")
    private Integer typeId;

    @ApiModelProperty("题单状态")
    private Integer status;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
    public Integer getProblemNum() {
        return problemNum;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
    }
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "List{" +
            "id=" + id +
            ", name=" + name +
            ", authorId=" + authorId +
            ", problemNum=" + problemNum +
            ", typeId=" + typeId +
            ", status=" + status +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
