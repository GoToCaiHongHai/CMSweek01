package com.gd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gd.bean.Camp;
import com.gd.bean.Hero;
import com.gd.service.HeroService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class HeroController {

	@Autowired
	private HeroService service;

	@RequestMapping("show")
	public String showHero(@RequestParam(defaultValue="1")Integer pageNum,Model mo, Integer cid, Integer minPrice, Integer maxPrice, Integer have) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cid", cid);
		map.put("minPrice", minPrice);
		map.put("maxPrice", maxPrice);
		map.put("have", have);
		mo.addAttribute("map", map);
		List<Camp> camplist = service.selectCamp();
		mo.addAttribute("camplist", camplist);
		//开始分页
		PageHelper.startPage(pageNum, 3);
		List<Hero> list = service.selectHeroByItem(map);
		PageInfo<Hero> plist = new PageInfo<Hero>(list);
		mo.addAttribute("plist", plist);
		return "show";
	}
	
	@RequestMapping("selectCamp")
	@ResponseBody
	public List<Camp> selectCamp(){
		List<Camp> back = service.selectCamp();
		return back;
	}
	
	@RequestMapping("addHero")
	public String addHero(Hero hero){
		int i=service.insertHero(hero);
		System.out.println(i);
		return "forward:show";
	}
	
	@RequestMapping("update")
	@ResponseBody
	public int update(Integer hid){
		return service.updateHero(hid);
	}
	
	@RequestMapping("selectOne")
	public String selectOne(Model mo,Integer hid){
		Hero hero=service.selectOneHero(hid);
		mo.addAttribute("hero", hero);
		Camp camp=service.selectCampById(hero.getCamp().getCid());
		mo.addAttribute("camp", camp);
		return "oneHero";
	}
}
