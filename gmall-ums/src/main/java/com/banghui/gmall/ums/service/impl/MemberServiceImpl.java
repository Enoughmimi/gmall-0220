package com.banghui.gmall.ums.service.impl;

import com.banghui.gmall.ums.entity.Member;
import com.banghui.gmall.ums.mapper.MemberMapper;
import com.banghui.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author LiuBanghui
 * @since 2020-02-18
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
