package org.orph.dataservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.orph.dataservice.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author machenxiang
 * @since 2022-04-17
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
