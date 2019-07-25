package cn.neu.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


public class Application implements Serializable {

    private String application_uid;
    private String application_name;
    private String application_customer;
    private String application_customerLogo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date application_createtime;
    private String application_description;

    public String getApplication_uid() {
        return application_uid;
    }

    public void setApplication_uid(String application_uid) {
        this.application_uid = application_uid;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public String getApplication_customer() {
        return application_customer;
    }

    public void setApplication_customer(String application_customer) {
        this.application_customer = application_customer;
    }

    public String getApplication_customerLogo() {
        return application_customerLogo;
    }

    public void setApplication_customerLogo(String application_customerLogo) {
        this.application_customerLogo = application_customerLogo;
    }

    public Date getApplication_createtime() {
        return application_createtime;
    }

    public void setApplication_createtime(Date application_createtime) {
        this.application_createtime = application_createtime;
    }

    public String getApplication_description() {
        return application_description;
    }

    public void setApplication_description(String application_description) {
        this.application_description = application_description;
    }
}
