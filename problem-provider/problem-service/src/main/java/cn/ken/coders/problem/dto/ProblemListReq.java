package cn.ken.coders.problem.dto;

import cn.ken.coders.common.entity.Page;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/13 21:03
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ProblemListReq extends Page implements Serializable {
    
    @ApiModelProperty("题目涵盖的难度,0-简单,1-中等,2-困难")
    private List<Short> difficulties;

    @ApiModelProperty("题目涵盖的类型,0-简答题,1-单选题,2-多选题")
    private List<Short> type;

    @ApiModelProperty("题目涵盖的标签id")
    private List<Integer> labels;

    @ApiModelProperty("只显示收藏题目")
    private Boolean onlyCollected;

    @ApiModelProperty("只查看关注者发布的题目")
    private Boolean onlyFollowed;

    @ApiModelProperty("只查看未被斩的题目")
    private Boolean onlyNotKilled;

    @ApiModelProperty("排序方式,0-按热度排序,1-按发布时间排序")
    private Short sortWay;
    
    
}
