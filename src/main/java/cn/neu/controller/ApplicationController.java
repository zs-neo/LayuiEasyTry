package cn.neu.controller;

import cn.neu.domain.Application;
import cn.neu.service.ApplicationService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    /**增加一条application
     * 时间格式2011/12/02 10:50:25 使用yyyy/mm/dd HH:mm:ss格式传递 即2011%2F12%2F02%2010%3A50%3A25
     * http://localhost:8080/application/addApplication?application_uid=1&application_name=1&application_customer=1&application_customerLogo=1&application_createtime=2011%2F12%2F02%2010%3A50%3A25&application_description=1
     * @param application_uid
     * @param application_name
     * @param application_customer
     * @param application_customerLogo
     * @param application_createtime
     * @param application_description
     * @return  返回result的值为"1"则插入成功，否则失败
     */
    @RequestMapping("/addApplication")
    @ResponseBody
    public JSONObject addApplication(@RequestParam("application_uid") String application_uid,
                                    @RequestParam("application_name") String application_name,
                                    @RequestParam("application_customer") String application_customer,
                                    @RequestParam("application_customerLogo") String application_customerLogo,
                                    @RequestParam("application_createtime") Date application_createtime,
                                    @RequestParam("application_description") String application_description){
        JSONObject jsonObject = new JSONObject();
        try{
            applicationService.addApplication(application_uid,application_name,application_customer,application_customerLogo,application_createtime,application_description);
            jsonObject.put("result", "1");
        }catch(Exception e){
            jsonObject.put("result", "0");
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * 通过uid删除一条记录
     * http://localhost:8080/application/deleteApplicationByUid?application_uid=1
     * @param uid
     * @return 返回result的值为"1"则插入成功，否则失败
     */
    @RequestMapping("/deleteApplicationByUid")
    @ResponseBody
    public JSONObject deleteApplicationByUid(@RequestParam("application_uid") String uid){
        JSONObject jsonObject = new JSONObject();
        try{
            applicationService.deleteApplicationByUid(uid);
            jsonObject.put("result","1");
        }catch (Exception e){
            jsonObject.put("result","0");
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * 更新application_uid等于传入application_uid的一行数据
     * http://localhost:8080/application/updateApplicationByUid?application_uid=1&application_name=1&application_customer=1&application_customerLogo=2&application_createtime=2011%2F12%2F02%2010%3A50%3A25&application_description=1   * @param application_uid
     * @param application_name
     * @param application_customer
     * @param application_customerLogo
     * @param application_createtime
     * @param application_description
     * @return
     */
    @RequestMapping("/updateApplicationByUid")
    @ResponseBody
    public JSONObject updateApplicationByUid(@RequestParam("application_uid") String application_uid,
                                            @RequestParam("application_name") String application_name,
                                            @RequestParam("application_customer") String application_customer,
                                            @RequestParam("application_customerLogo") String application_customerLogo,
                                            @RequestParam("application_createtime") Date application_createtime,
                                            @RequestParam("application_description") String application_description){
        JSONObject jsonObject = new JSONObject();
        try{
            applicationService.updateApplicationByUid(application_uid,application_name,application_customer,application_customerLogo,application_createtime,application_description);
            jsonObject.put("result","1");
        }catch (Exception e){
            jsonObject.put("result","0");
            e.printStackTrace();
        }
        return jsonObject;
    }



    /**分页查询所有Application
     * http://localhost:8080/application/findAllApplicationPaged?page=1&limit=10
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/findAllApplicationPaged")
    @ResponseBody
    public JSONArray findAllDept(@RequestParam("page") int page,@RequestParam("limit") int limit){
        int before = limit * (page - 1) + 1;
        int after = page * limit;
        List<Application> applicationList = applicationService.findAllApplicationPaged(before, after);
        JSONArray jsonArray = JSONArray.fromObject(applicationList);
        return jsonArray;
    }

    /**分页条件搜索Application的dom字段值为value的行
     *http://localhost:8080/application/findApplicationPaged?dom=application_uid&value=&page=1&limit=3
     * @param dom
     * @param value
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/findApplicationPaged")
    @ResponseBody
    public JSONArray findApplicationPaged(@RequestParam("dom") String dom,@RequestParam("value") String value,
                                          @RequestParam("page") int page,@RequestParam("limit") int limit){
        int before = limit * (page - 1) + 1;
        int after = page * limit;
        List<Application> applications = applicationService.findApplicationPaged(dom,value,before,after);
        JSONArray jsonArray = JSONArray.fromObject(applications);
        return jsonArray;
    }

}





