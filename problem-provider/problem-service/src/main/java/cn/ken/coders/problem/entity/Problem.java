package cn.ken.coders.problem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 题目表
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@Data
@TableName("ct_problem")
@ApiModel(value = "Problem对象", description = "题目表")
public class Problem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("题目id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("问题内容")
    private String content;

    @ApiModelProperty("题目类型,0-简答题,1-单选题,2-多选题")
    private Short types;

    @ApiModelProperty("题目难度,0-简单,1-中等,2-困难")
    private Short difficulty;

    @ApiModelProperty("作者id")
    private Long authorId;

    @ApiModelProperty("浏览量")
    private Long views;

    @ApiModelProperty("收藏量")
    private Long collections;

    @ApiModelProperty("分享量")
    private Long shares;

    @ApiModelProperty("点赞量")
    private Long likes;

    @ApiModelProperty("题目解析")
    private String answer;

    @ApiModelProperty("答案提供者")
    private Long answerProviderId;

    @ApiModelProperty("题目状态,0-正常,1-已删除")
    private Short status;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;
    
}
