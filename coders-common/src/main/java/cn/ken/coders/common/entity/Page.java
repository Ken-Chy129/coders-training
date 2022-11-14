package cn.ken.coders.common.entity;

import lombok.Data;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/13 21:05
 */
@Data
public class Page {

    private Integer pageNo;

    private Integer pageSize;

    public Integer getPageNo() {
        if(null == pageNo){
            pageNo = 1;
        }
        return pageNo;
    }

    public Integer getPageSize() {
        if(null == pageSize){
            pageSize = 25;
        }
        return pageSize;
    }
}
