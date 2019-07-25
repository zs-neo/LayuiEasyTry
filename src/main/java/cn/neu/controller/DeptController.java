package cn.neu.controller;

import cn.neu.domain.Dept;
import cn.neu.service.DeptService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/findAllDept")
    @ResponseBody
    public Map<String, Object> findAllDept(){
        List<Dept> depts = deptService.findAllDept();
        int count = deptService.countAllDept();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",count);
        map.put("data",depts);
        System.out.println(map);
        return map;
    }

    @RequestMapping("/findAllDeptPage")
    @ResponseBody
    public Map<String, Object> findAllDeptByPages(int page,int limit){
        int before = limit * (page - 1) + 1;
        int after = page * limit;
        List<Dept> depts = deptService.findAllDeptPage(before, after);
        int count = deptService.countAllDept();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",count);
        map.put("data",depts);
        System.out.println(map);
        return map;
    }

    @RequestMapping("/deleteDept")
    @ResponseBody
    public String deleteDept(@RequestParam("id") int id) {
        JSONObject jsonObject = new JSONObject();
        System.out.println("controller delete "+id);
        jsonObject.put("msg", "1");
        try{
            deptService.deleteDept(id);
            jsonObject.put("result", "1");
        }catch(Exception e){
            jsonObject.put("result", "0");
            e.printStackTrace();
        }
        System.out.println(jsonObject);
        return jsonObject.toString();
    }
    @RequestMapping("/updateDeptById")
    @ResponseBody
    public String updateDeptById(@RequestParam("oid") String oid,@RequestParam("id") String id,@RequestParam("dept_code") String dept_code,@RequestParam("dept_name") String dept_name
                                    ,@RequestParam("dept_catagory") String dept_catagory,@RequestParam("dept_type") String dept_type){
        System.out.println(oid+id+dept_code+dept_name+dept_catagory+dept_type);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "1");
        try{
            deptService.updateDeptById(Integer.parseInt(oid), Integer.parseInt(id), dept_code, dept_name, Integer.parseInt(dept_catagory), Integer.parseInt(dept_type));
        }catch(Exception e){
            jsonObject.put("result", "0");
            e.printStackTrace();
        }
        System.out.println(jsonObject);
        return jsonObject.toString();
    }

    @RequestMapping("/findAllDeptPageBy")
    @ResponseBody
    public Map<String, Object> findAllDeptPageBy(@RequestParam("domain") String dom,@RequestParam("valu") String value,int page,int limit){
        System.out.println(dom+" "+value+" "+page+" "+limit);
        int before = limit * (page - 1) + 1;
        int after = page * limit;
        if(dom.equals("0")) dom = "id";
        if(dom.equals("1")) dom = "dept_code";
        if(dom.equals("2")) dom = "dept_name";
        if(dom.equals("3")) dom = "dept_catagory";
        if(dom.equals("4")) dom = "dept_type";
        List<Dept> depts = deptService.findAllDeptPageBy(dom,value,before, after);
        int count = deptService.countAllDeptBy(dom,value);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",count);
        map.put("data",depts);
        System.out.println(map);
        return map;
    }
}





