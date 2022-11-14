package cn.ken.coders.problem.controller;

import cn.ken.coders.common.result.Result;
import cn.ken.coders.problem.dto.ProblemListReq;
import cn.ken.coders.problem.entity.Problem;
import cn.ken.coders.problem.service.IProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 题目表 前端控制器
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@RestController
@RequestMapping("/problem")
public class ProblemController {

    @Autowired
    private IProblemService problemService;
    
    @GetMapping("getProblem")
    public Result getProblem(Integer id, HttpServletRequest httpServletRequest) {
        return problemService.getProblem(id, httpServletRequest);
    }
    
    @GetMapping("listProblem")
    public Result listProblem(ProblemListReq req, HttpServletRequest httpServletRequest) {
        return problemService.listProblem(req, httpServletRequest);
    }

    @PostMapping("insertProblem")
    public Result insertProblem(Problem problem, HttpServletRequest httpServletRequest) {
        return problemService.insertProblem(problem, httpServletRequest);
    }
    
    @PostMapping("updateProblem")
    public Result updateProblem(Problem problem, HttpServletRequest httpServletRequest) {
        return problemService.updateProblem(problem, httpServletRequest);
    }

    @DeleteMapping("deleteProblem")
    public Result deleteProblem(Integer id, HttpServletRequest httpServletRequest) {
        return problemService.deleteProblem(id, httpServletRequest);
    }
}
