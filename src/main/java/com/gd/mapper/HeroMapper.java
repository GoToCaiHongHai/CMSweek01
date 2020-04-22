package com.gd.mapper;

import java.util.List;
import java.util.Map;

import com.gd.bean.Camp;
import com.gd.bean.Hero;

public interface HeroMapper {
	// 查询所有，模糊查询，条件查询
	public List<Hero> selectHeroByItem(Map<String, Object> map);

	// 查询阵营 回显
	public List<Camp> selectCamp();

	// 添加英雄
	public int insertHero(Hero hero);

	// 修改英雄
	public int updateHero(Integer hid);

	// 查询单个英雄信息
	public Hero selectOneHero(Integer hid);

	public Camp selectCampById(Integer cid);
}
