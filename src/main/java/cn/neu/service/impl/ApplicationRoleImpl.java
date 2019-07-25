package cn.neu.service.impl;

import cn.neu.dao.ApplicationRoleDao;
import cn.neu.domain.ApplicationRole;
import cn.neu.service.ApplicationRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("applicationRoleService")
public class ApplicationRoleImpl implements ApplicationRoleService {

    @Autowired
    private ApplicationRoleDao applicationRoleDao;

    @Override
    public void addApplicationRole(String application_role_uid, String application_role_name, String application_role_description, String application_role_mainObject, String application_role_operationSet, String application_uid) {
        applicationRoleDao.addApplicationRole(application_role_uid,application_role_name,application_role_description,application_role_mainObject,application_role_operationSet,application_uid);
    }

    @Override
    public void deleteApplicationRoleByUid(String uid) {
        applicationRoleDao.deleteApplicationRoleByUid(uid);
    }

    @Override
    public void updateApplicationRoleByUid(String application_role_uid, String application_role_name, String application_role_description, String application_role_mainObject, String application_role_operationSet, String application_uid) {
        applicationRoleDao.updateApplicationRoleByUid(application_role_uid,application_role_name,application_role_description,application_role_mainObject,application_role_operationSet,application_uid);
    }

    @Override
    public List<ApplicationRole> findAllApplicationRolePaged(int before, int after) {
        return applicationRoleDao.findAllApplicationRolePaged(before, after);
    }

    @Override
    public List<ApplicationRole> findApplicationRolePaged(String dom, String value, int before, int after) {
        return applicationRoleDao.findApplicationRolePaged(dom, value, before, after);
    }
}
