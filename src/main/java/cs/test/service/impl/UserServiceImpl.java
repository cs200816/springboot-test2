package cs.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cs.test.entity.SysUser;
import cs.test.mapper.SysUserMapper;
import cs.test.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper userMapper;
	public SysUser getByName(String name) {
		
		return userMapper.findSysUserByLoginName(name);
	}

}
