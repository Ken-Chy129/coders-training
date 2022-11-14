package cn.ken.coders.problem.service.impl;

import cn.ken.coders.common.result.Result;
import cn.ken.coders.problem.dto.ProblemListReq;
import cn.ken.coders.problem.util.IpUtil;
import cn.ken.coders.problem.entity.Problem;
import cn.ken.coders.problem.mapper.ProblemMapper;
import cn.ken.coders.problem.service.IProblemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 题目表 服务实现类
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@Service
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, Problem> implements IProblemService {

    @Autowired
    private ProblemMapper problemMapper;
    
    @Override
    public Result getProblem(Integer id, HttpServletRequest httpServletRequest) {
        Problem problem = problemMapper.selectById(id);
        return Result.success(problem);
    }

    @Override
    public Result listProblem(ProblemListReq req, HttpServletRequest httpServletRequest) {
        return null;
    }

    @Override
    public Result insertProblem(Problem problem, HttpServletRequest httpServletRequest) {
        return null;
    }

    @Override
    public Result updateProblem(Problem problem, HttpServletRequest httpServletRequest) {
        return null;
    }

    @Override
    public Result deleteProblem(Integer id, HttpServletRequest httpServletRequest) {
        return null;
    }

}
