package cn.ken.coders.problem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 题单类型表
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@TableName("ct_list_type")
@ApiModel(value = "ListType对象", description = "题单类型表")
public class ListType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("题单类型名")
    private String typeName;

    @ApiModelProperty("题单数量")
    private Integer listNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public Integer getListNum() {
        return listNum;
    }

    public void setListNum(Integer listNum) {
        this.listNum = listNum;
    }

    @Override
    public String toString() {
        return "ListType{" +
            "id=" + id +
            ", typeName=" + typeName +
            ", listNum=" + listNum +
        "}";
    }
}
