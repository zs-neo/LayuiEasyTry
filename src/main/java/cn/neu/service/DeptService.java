package cn.neu.service;

import cn.neu.domain.Dept;

import java.util.List;

public interface DeptService {

    public List<Dept> findAllDept();

    public List<Dept> findAllDeptPage(int before,int after);

    public int countAllDept();

    public void deleteDept(int id);

    public void updateDeptById(int oid,int id,String dept_code,String dept_name,int dept_catagory,int dept_type);

    public int countAllDeptBy(String dom,String value);

    public List<Dept> findAllDeptPageBy(String dom,String value,int before,int after);
}


