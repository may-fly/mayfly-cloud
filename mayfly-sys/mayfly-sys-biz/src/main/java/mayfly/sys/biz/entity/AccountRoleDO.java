package mayfly.sys.biz.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import mayfly.core.base.mapper.annotation.NoColumn;
import mayfly.core.base.mapper.annotation.Table;
import mayfly.core.model.BaseDO;

/**
 *  ζι
 *
 * @author  hml
 * @date 2018/6/27 δΈε2:35
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@Table("t_account_role")
@NoColumn(fields = {BaseDO.UPDATE_TIME, BaseDO.MODIFIER, BaseDO.MODIFIER_ID})
public class AccountRoleDO extends BaseDO {
    private Long accountId;

    private Long roleId;
}
