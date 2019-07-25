package cn.neu.dao;

import cn.neu.domain.ApplicationRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ApplicationRoleDao {

    //增加一条记录
    public void addApplicationRole(@Param("application_role_uid") String application_role_uid,
                               @Param("application_role_name") String application_role_name,
                               @Param("application_role_description") String application_role_description,
                               @Param("application_role_mainObject") String application_role_mainObject,
                               @Param("application_role_operationSet") String application_role_operationSet,
                               @Param("application_uid") String application_uid);

    //以uid为主键删除ApplicationRole
    public void deleteApplicationRoleByUid(@Param("uid") String uid);

    //根据uid更新ApplicationRole
    public void updateApplicationRoleByUid(@Param("application_role_uid") String application_role_uid,
                                           @Param("application_role_name") String application_role_name,
                                           @Param("application_role_description") String application_role_description,
                                           @Param("application_role_mainObject") String application_role_mainObject,
                                           @Param("application_role_operationSet") String application_role_operationSet,
                                           @Param("application_uid") String application_uid);

    //分页查询所有ApplicationRole
    public List<ApplicationRole> findAllApplicationRolePaged(@Param("before") int before, @Param("after") int after);

    //分页条件搜索ApplicationRole
    public List<ApplicationRole> findApplicationRolePaged(@Param("dom") String dom, @Param("value") String value,
                                                          @Param("before") int before, @Param("after") int after);

}
