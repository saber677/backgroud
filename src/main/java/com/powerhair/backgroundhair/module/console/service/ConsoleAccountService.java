package com.powerhair.backgroundhair.module.console.service;

import com.powerhair.backgroundhair.module.console.model.dto.AccountDTO;
import com.powerhair.backgroundhair.module.console.model.vo.SessionVO;
import com.powerhair.backgroundhair.tool.entity.Result;

public interface ConsoleAccountService {

    /**
     * 添加账号
     *
     * @param accountDTO
     * @return
     */
    Result createAccount(AccountDTO accountDTO);

    /**
     * 登录
     *
     * @param accountDTO
     * @return
     */
    Result<SessionVO> login(AccountDTO accountDTO);

}
