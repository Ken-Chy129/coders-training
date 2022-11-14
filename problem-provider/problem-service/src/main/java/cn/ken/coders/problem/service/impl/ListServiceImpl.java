package cn.ken.coders.problem.service.impl;

import cn.ken.coders.problem.entity.List;
import cn.ken.coders.problem.mapper.ListMapper;
import cn.ken.coders.problem.service.IListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题单表 服务实现类
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@Service
public class ListServiceImpl extends ServiceImpl<ListMapper, List> implements IListService {

}
