package cn.neu.controller;

import cn.neu.domain.ApplicationRole;
import cn.neu.service.ApplicationRoleService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/applicationRole")
public class ApplicationRoleController {

    @Autowired
    private ApplicationRoleService applicationRoleService;


    /**
     * 增加一行数据到application_role
     *http://localhost:8080/applicationRole/addApplicationRole?application_role_uid=11&application_role_name=1&application_role_description=1&application_role_mainObject=1&application_role_operationSet=1&application_uid=1    * @param application_role_uid
     * @param application_role_name
     * @param application_role_description
     * @param application_role_mainObject
     * @param application_role_operationSet
     * @param application_uid
     * @return
     */
    @RequestMapping("/addApplicationRole")
    @ResponseBody
    public JSONObject addApplicationRole(@RequestParam("application_role_uid") String application_role_uid,
                                         @RequestParam("application_role_name") String application_role_name,
                                         @RequestParam("application_role_description") String application_role_description,
                                         @RequestParam("application_role_mainObject") String application_role_mainObject,
                                         @RequestParam("application_role_operationSet") String application_role_operationSet,
                                         @RequestParam("application_uid") String application_uid){
        JSONObject jsonObject = new JSONObject();
        System.out.println(application_uid);
        try{
            applicationRoleService.addApplicationRole(application_role_uid,application_role_name,application_role_description,application_role_mainObject,application_role_operationSet,application_uid);
            jsonObject.put("result", "1");
        }catch(Exception e){
            jsonObject.put("result", "0");
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * 删除掉application_role_uid值为传入application_role_uid值的行
     * http://localhost:8080/applicationRole/deleteApplicationRoleByUid?application_role_uid=1
     * @param uid
     * @return
     */
    @RequestMapping("/deleteApplicationRoleByUid")
    @ResponseBody
    public JSONObject deleteApplicationRoleByUid(@RequestParam("application_role_uid") String uid){
        JSONObject jsonObject = new JSONObject();
        try{
            applicationRoleService.deleteApplicationRoleByUid(uid);
            jsonObject.put("result","1");
        }catch (Exception e){
            jsonObject.put("result","0");
            e.printStackTrace();
        }
        return jsonObject;
    }


    /**
     * 依据id更新行
     * http://localhost:8080/applicationRole/updateApplicationByUid?application_role_uid=11&application_role_name=xxxxxxx&application_role_description=1&application_role_mainObject=1&application_role_operationSet=1&application_uid=1
     * @param application_role_uid
     * @param application_role_name
     * @param application_role_description
     * @param application_role_mainObject
     * @param application_role_operationSet
     * @param application_uid
     * @return
     */
    @RequestMapping("/updateApplicationByUid")
    @ResponseBody
    public JSONObject updateApplicationRoleByUid(@RequestParam("application_role_uid") String application_role_uid,
                                                 @RequestParam("application_role_name") String application_role_name,
                                                 @RequestParam("application_role_description") String application_role_description,
                                                 @RequestParam("application_role_mainObject") String application_role_mainObject,
                                                 @RequestParam("application_role_operationSet") String application_role_operationSet,
                                                 @RequestParam("application_uid") String application_uid){
        JSONObject jsonObject = new JSONObject();
        try{
            applicationRoleService.updateApplicationRoleByUid(application_role_uid,application_role_name,application_role_description,application_role_mainObject,application_role_operationSet,application_uid);
            jsonObject.put("result","1");
        }catch (Exception e){
            jsonObject.put("result","0");
            e.printStackTrace();
        }
        return jsonObject;
    }


    /**分页所有ApplicationRole
     *http://localhost:8080/applicationRole/findAllApplicationRolePaged?page=1&limit=3
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/findAllApplicationRolePaged")
    @ResponseBody
    public JSONArray findAllApplicationRolePaged(@RequestParam("page") int page, @RequestParam("limit") int limit){
        int before = limit * (page - 1) + 1;
        int after = page * limit;
        List<ApplicationRole> applicationList = applicationRoleService.findAllApplicationRolePaged(before, after);
        JSONArray jsonArray = JSONArray.fromObject(applicationList);
        return jsonArray;
    }

    /**
     *分页条件搜索Application的dom字段值为value的行
     * http://localhost:8080/application/findApplicationPaged?dom=application_uid&value=&page=1&limit=3
     * @param dom
     * @param value
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/findApplicationRolePaged")
    @ResponseBody
    public JSONArray findApplicationRolePaged(@RequestParam("dom") String dom,@RequestParam("value") String value,
                                          @RequestParam("page") int page,@RequestParam("limit") int limit){
        int before = limit * (page - 1) + 1;
        int after = page * limit;
        List<ApplicationRole> applications = applicationRoleService.findApplicationRolePaged(dom,value,before,after);
        JSONArray jsonArray = JSONArray.fromObject(applications);
        return jsonArray;
    }

}
