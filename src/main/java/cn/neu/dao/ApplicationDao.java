package cn.neu.dao;

import cn.neu.domain.Application;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ApplicationDao {

    //增加一条记录
    public void addApplication(@Param("application_uid") String application_uid,
                               @Param("application_name") String application_name,
                               @Param("application_customer") String application_customer,
                               @Param("application_customerLogo") String application_customerLogo,
                               @Param("application_createtime") Date application_createtime,
                               @Param("application_description") String application_description);

    //以uid为主键删除Application
    public void deleteApplicationByUid(@Param("uid") String uid);

    //根据uid更新Application
    public void updateApplicationByUid(@Param("application_uid") String application_uid,
                                      @Param("application_name") String application_name,
                                      @Param("application_customer") String application_customer,
                                      @Param("application_customerLogo") String application_customerLogo,
                                      @Param("application_createtime") Date application_createtime,
                                      @Param("application_description") String application_description);

    //分页查询所有Application
    public List<Application> findAllApplicationPaged(@Param("before") int before, @Param("after") int after);

    //分页条件搜索Application
    public List<Application> findApplicationPaged(@Param("dom") String dom,@Param("value") String value,
                                                                @Param("before") int before,@Param("after") int after);

}
