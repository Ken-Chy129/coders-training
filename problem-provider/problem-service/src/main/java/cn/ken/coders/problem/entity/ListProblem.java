package cn.ken.coders.problem.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 题单题目表
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@TableName("ct_list_problem")
@ApiModel(value = "ListProblem对象", description = "题单题目表")
public class ListProblem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("题单id")
    private Integer listId;

    @ApiModelProperty("题目id")
    private Integer problemId;

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }
    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    @Override
    public String toString() {
        return "ListProblem{" +
            "listId=" + listId +
            ", problemId=" + problemId +
        "}";
    }
}
