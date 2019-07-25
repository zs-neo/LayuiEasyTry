package cn.neu.dao;

import cn.neu.domain.Dept;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptDao {

    //@Select("select * from dept")
    public List<Dept> findAllDept();

    public List<Dept> findAllDeptPage(@Param("before") int before,@Param("after") int after);

    public int countAllDept();

    public void deleteDept(@Param("id") int id);

    public void updateDeptById(@Param("oid") int oid,@Param("id") int id,@Param("dept_code") String dept_code,
                               @Param("dept_name") String dept_name, @Param("dept_catagory") int dept_catagory,
                               @Param("dept_type") int dept_type);

    public int countAllDeptBy(@Param("dom") String dom,@Param("value") String value);

    public List<Dept> findAllDeptPageBy(@Param("dom") String dom,@Param("value") String value,@Param("before") int before,@Param("after") int after);

}
