package cn.neu.service.impl;

import cn.neu.dao.DeptDao;
import cn.neu.domain.Dept;
import cn.neu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptSreviceImpl implements DeptService {
	
	@Autowired
	private DeptDao deptDao;
	
	public List<Dept> findAllDept() {
		return deptDao.findAllDept();
	}
	
	public List<Dept> findAllDeptPage(int before, int after) {
		return deptDao.findAllDeptPage(before, after);
	}
	
	public int countAllDept() {
		return deptDao.countAllDept();
	}
	
	public void deleteDept(int id) {
		System.out.println("service delete " + id);
		deptDao.deleteDept(id);
	}
	
	@Override
	public void updateDeptById(int oid, int id, String dept_code, String dept_name, int dept_catagory, int dept_type) {
		deptDao.updateDeptById(oid, id, dept_code, dept_name, dept_catagory, dept_type);
	}
	
	@Override
	public int countAllDeptBy(String dom, String value) {
		return deptDao.countAllDeptBy(dom, value);
	}
	
	@Override
	public List<Dept> findAllDeptPageBy(String dom, String value, int before, int after) {
		return deptDao.findAllDeptPageBy(dom, value, before, after);
	}
}
