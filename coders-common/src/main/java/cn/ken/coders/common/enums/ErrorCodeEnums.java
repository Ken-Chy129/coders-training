package cn.ken.coders.common.enums;

import lombok.Getter;
import lombok.ToString;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/11 19:53
 */
@Getter
@ToString
public enum ErrorCodeEnums {

    SUCCESS("200", "success"),
    ERROR("500", "error"),
    ;

    private final String code;
    private final String desc;
    
    private ErrorCodeEnums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
