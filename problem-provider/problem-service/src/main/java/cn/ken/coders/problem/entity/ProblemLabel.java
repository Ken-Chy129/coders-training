package cn.ken.coders.problem.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 题目标签表
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@TableName("ct_problem_label")
@ApiModel(value = "ProblemLabel对象", description = "题目标签表")
public class ProblemLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("题目id")
    private Integer problemId;

    @ApiModelProperty("标签id")
    private Integer labelId;

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    @Override
    public String toString() {
        return "ProblemLabel{" +
            "problemId=" + problemId +
            ", labelId=" + labelId +
        "}";
    }
}
