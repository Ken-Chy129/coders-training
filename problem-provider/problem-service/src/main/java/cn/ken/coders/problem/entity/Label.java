package cn.ken.coders.problem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@TableName("ct_label")
@ApiModel(value = "Label对象", description = "标签表")
public class Label implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("标签id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("标签名")
    private String labelName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    @Override
    public String toString() {
        return "Label{" +
            "id=" + id +
            ", labelName=" + labelName +
        "}";
    }
}
