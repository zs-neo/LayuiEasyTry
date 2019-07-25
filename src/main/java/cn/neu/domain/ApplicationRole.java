package cn.neu.domain;

import java.io.Serializable;

public class ApplicationRole implements Serializable {

    private String application_role_uid;
    private String application_role_name;
    private String application_role_description;
    private String application_role_mainObject;
    private String application_role_operationSet;
    private String application_uid;

    public String getApplication_role_uid() {
        return application_role_uid;
    }

    public void setApplication_role_uid(String application_role_uid) {
        this.application_role_uid = application_role_uid;
    }

    public String getApplication_role_name() {
        return application_role_name;
    }

    public void setApplication_role_name(String application_role_name) {
        this.application_role_name = application_role_name;
    }

    public String getApplication_role_description() {
        return application_role_description;
    }

    public void setApplication_role_description(String application_role_description) {
        this.application_role_description = application_role_description;
    }

    public String getApplication_role_mainObject() {
        return application_role_mainObject;
    }

    public void setApplication_role_mainObject(String application_role_mainObject) {
        this.application_role_mainObject = application_role_mainObject;
    }

    public String getApplication_role_operationSet() {
        return application_role_operationSet;
    }

    public void setApplication_role_operationSet(String application_role_operationSet) {
        this.application_role_operationSet = application_role_operationSet;
    }

    public String getApplication_uid() {
        return application_uid;
    }

    public void setApplication_uid(String application_uid) {
        this.application_uid = application_uid;
    }
}
