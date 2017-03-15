package com.ittx.car.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.ittx.car.model.Function;
import com.ittx.car.model.Module;
import com.ittx.car.model.bean.FunctionBean;
import com.ittx.car.model.bean.FunctionListBean;
import com.ittx.car.model.bean.ModuleBean;
import com.ittx.car.service.SecureService;

@Controller
@RequestMapping("/function")
public class FunctionAction {
	@Autowired
	private SecureService secureService;

	//function/listfunction.do
	/*@RequestMapping(value = "listfunction")
	public String listFunction(Integer moduleid,Map<String, List<Function>> map,Model model) {
		List<Function> functionLists = secureService.getFunction(moduleid);
		map.put("moduleFunctionList", functionLists);
		model.addAttribute("moduleid", moduleid);
		return "function/listfunction";
	}*/
	
	/**
	 * {
    "moduleid":21,
    "functionLists":[
        {
            "fId":2,
            "code":"functionlist.do",
            "description":"description2",
            "module":{
                "mId":0,
                "name":"模块名2",
                "description":"描述2"
            }
        },
        {
            "fId":1,
            "code":"function.do",
            "description":"description1",
            "module":{
                "mId":0,
                "name":"模块名1",
                "description":"描述1"
            }
        }
    	]
	}
	 * @param module_json
	 * @param map
	 * @param model
	 * @return
	 */
	//@ResponseBody
	@RequestMapping(value = "listfunction")
	public String listFunction(String module_json,Map<String, List<Function>> map,Model model) {
		System.out.println(module_json);
		
		Gson gosn = new Gson();
		Module module = gosn.fromJson(module_json, Module.class);
		
		FunctionBean f1 = new FunctionBean(1,"function.do","description1",new ModuleBean("模块名1","描述1"));
		FunctionBean f2 = new FunctionBean(2,"functionlist.do","description2",new ModuleBean("模块名2","描述2"));
		
		List<FunctionBean> functionLists = new ArrayList<FunctionBean>();
		functionLists.add(f2);
		functionLists.add(f1);
		
		FunctionListBean resultfunctionList = new FunctionListBean();
		resultfunctionList.setModuleid( module.getmId());
		resultfunctionList.setFunctionLists(functionLists);
		
		String json = gosn.toJson(resultfunctionList);
		System.out.println(json);
		model.addAttribute("function_json", json);
		
		return "function/listfunction";
	}
	
	@RequestMapping(value="addmodulefunction")
	public String addModuleFunction(Integer moduleid,String function_code,String description){
		Module module = secureService.getModuleById(moduleid);
		Function function = new Function(function_code,description,module);
		secureService.addFunction(function);
		return "redirect:/function/listfunction.do?moduleid="+moduleid;
	}

	@RequestMapping(value = "deletemodulefunction")
	public String deleteModuleFunction(Integer id, Model model) {
		return "redirect:/module/listmodule.do";
	}
	

}
