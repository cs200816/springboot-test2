package cs.test.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cs.test.entity.SysUser;


@Repository
@Component(value = "SysUserMapper") 
public interface SysUserMapper {

	public SysUser findSysUserByLoginName(@Param("loginName") String loginName);

}
