package cn.ken.coders.problem.service.impl;

import cn.ken.coders.problem.entity.ListType;
import cn.ken.coders.problem.mapper.ListTypeMapper;
import cn.ken.coders.problem.service.IListTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题单类型表 服务实现类
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@Service
public class ListTypeServiceImpl extends ServiceImpl<ListTypeMapper, ListType> implements IListTypeService {

}
