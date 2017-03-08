package com.ittx.car.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ittx.car.model.Module;
import com.ittx.car.service.SecureService;

@Controller
@RequestMapping("/module")
public class ModuleAction {
	@Autowired
	private SecureService secureService;

	// module/addmodule.do
	@RequestMapping(value = "addmodule")
	public String login(Model model) {
		return "module/addmodule";
	}

	// module/listmodule.do
	@RequestMapping(value = "listmodule")
	public String listModule(Map<String, List<Module>> map) {
		List<Module> moduleLists = secureService.getAllModule();
		map.put("modulesList", moduleLists);
		return "module/listmodule";
	}

	// module/addmodule_submit.do
	@RequestMapping(value = "addmodule_submit")
	public String addmoduleSubmit(Module module, Model model) {
		secureService.addModule(module);
		return "redirect:/module/listmodule.do";
	}

	@RequestMapping(value = "deletemodules")
	public String deleteModules(Integer id, Model model) {
		secureService.deleteModule(id);
		return "redirect:/module/listmodule.do";
	}
	

}
