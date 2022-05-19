package org.orph.dataservice.service.impl;

import org.orph.dataservice.entity.Account;
import org.orph.dataservice.mapper.AccountMapper;
import org.orph.dataservice.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author machenxiang
 * @since 2022-04-17
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
