package cn.neu.service;

import cn.neu.domain.ApplicationRole;
import java.util.List;

public interface ApplicationRoleService {

    //增加一条记录
    public void addApplicationRole(String application_role_uid,
                                   String application_role_name,
                                   String application_role_description,
                                   String application_role_mainObject,
                                   String application_role_operationSet,
                                   String application_uid);

    //以uid为主键删除ApplicationRole
    public void deleteApplicationRoleByUid(String uid);

    //根据uid更新ApplicationRole
    public void updateApplicationRoleByUid(String application_role_uid,
                                           String application_role_name,
                                           String application_role_description,
                                           String application_role_mainObject,
                                           String application_role_operationSet,
                                           String application_uid);

    //分页查询所有ApplicationRole
    public List<ApplicationRole> findAllApplicationRolePaged(int before, int after);

    //分页条件搜索ApplicationRole
    public List<ApplicationRole> findApplicationRolePaged(String dom, String value, int before, int after);

}
