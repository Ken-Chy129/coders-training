package cn.ken.coders.problem.service.impl;

import cn.ken.coders.problem.entity.Label;
import cn.ken.coders.problem.mapper.LabelMapper;
import cn.ken.coders.problem.service.ILabelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-13
 */
@Service
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label> implements ILabelService {

}
