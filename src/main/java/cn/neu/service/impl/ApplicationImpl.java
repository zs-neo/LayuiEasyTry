package cn.neu.service.impl;

import cn.neu.dao.ApplicationDao;
import cn.neu.domain.Application;
import cn.neu.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("applicationService")
public class ApplicationImpl implements ApplicationService {

    @Autowired
    private ApplicationDao applicationDao;

    @Override
    public void addApplication(String application_uid, String application_name, String application_customer, String application_customerLogo, java.util.Date application_createtime, String application_description) {
        applicationDao.addApplication(application_uid,application_name,application_customer,application_customerLogo,application_createtime,application_description);
    }

    @Override
    public void updateApplicationByUid(String application_uid, String application_name, String application_customer, String application_customerLogo, java.util.Date application_createtime, String application_description) {
        applicationDao.updateApplicationByUid(application_uid,application_name,application_customer,application_customerLogo,application_createtime,application_description);
    }

    @Override
    public void deleteApplicationByUid(String uid) {
        applicationDao.deleteApplicationByUid(uid);
    }

    @Override
    public List<Application> findAllApplicationPaged(int before, int after) {
        return applicationDao.findAllApplicationPaged(before, after);
    }

    @Override
    public List<Application> findApplicationPaged(String dom, String value, int before, int after) {
        return applicationDao.findApplicationPaged(dom, value, before, after);
    }
}
