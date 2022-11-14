package cn.ken.coders.problem.service;

import cn.ken.coders.common.result.Result;
import cn.ken.coders.problem.dto.ProblemListReq;
import cn.ken.coders.problem.entity.Problem;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 题目表 服务类
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
public interface IProblemService extends IService<Problem> {

    Result getProblem(Integer id, HttpServletRequest httpServletRequest);

    Result listProblem(ProblemListReq req, HttpServletRequest httpServletRequest);

    Result insertProblem(Problem problem, HttpServletRequest httpServletRequest);

    Result updateProblem(Problem problem, HttpServletRequest httpServletRequest);

    Result deleteProblem(Integer id, HttpServletRequest httpServletRequest);
}
