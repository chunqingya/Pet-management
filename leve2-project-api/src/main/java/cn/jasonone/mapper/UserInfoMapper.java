package cn.jasonone.mapper;

import cn.jasonone.bean.UserInfo;

/**
* @author xujie
* @description 针对表【user_info(用户信息表)】的数据库操作Mapper
* @createDate 2023-04-07 09:35:58
* @Entity cn.jasonone.bean.UserInfo
*/
public interface UserInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    UserInfo findByUsername(String username);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

}
