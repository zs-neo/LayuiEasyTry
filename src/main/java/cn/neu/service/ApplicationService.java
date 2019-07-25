package cn.neu.service;

import cn.neu.domain.Application;

import java.util.Date;
import java.util.List;

public interface ApplicationService {

    //增加一条记录
    public void addApplication(String application_uid, String application_name, String application_customer,
                               String application_customerLogo, Date application_createtime, String application_description);

    //以uid为主键删除Application
    public void deleteApplicationByUid(String uid);

    //根据uid更新Application
    public void updateApplicationByUid(String application_uid, String application_name, String application_customer,
                                       String application_customerLogo,Date application_createtime, String application_description);

    //分页查询所有Application
    public List<Application> findAllApplicationPaged(int before, int after);

    //分页条件搜索Application
    public List<Application> findApplicationPaged(String dom,String value, int before,int after);
}
