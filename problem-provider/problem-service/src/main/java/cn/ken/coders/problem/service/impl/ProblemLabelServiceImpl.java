package cn.ken.coders.problem.service.impl;

import cn.ken.coders.problem.entity.ProblemLabel;
import cn.ken.coders.problem.mapper.ProblemLabelMapper;
import cn.ken.coders.problem.service.IProblemLabelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题目标签表 服务实现类
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@Service
public class ProblemLabelServiceImpl extends ServiceImpl<ProblemLabelMapper, ProblemLabel> implements IProblemLabelService {

}
