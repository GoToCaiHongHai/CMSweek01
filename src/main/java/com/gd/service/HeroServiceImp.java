package com.gd.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gd.bean.Camp;
import com.gd.bean.Hero;
import com.gd.mapper.HeroMapper;

@Service
public class HeroServiceImp implements HeroService{
	
	@Autowired
	private HeroMapper mapper;

	@Override
	public List<Hero> selectHeroByItem(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.selectHeroByItem(map);
	}

	@Override
	public List<Camp> selectCamp() {
		// TODO Auto-generated method stub
		return mapper.selectCamp();
	}

	@Override
	public int insertHero(Hero hero) {
		// TODO Auto-generated method stub
		return mapper.insertHero(hero);
	}

	@Override
	public int updateHero(Integer hid) {
		// TODO Auto-generated method stub
		return mapper.updateHero(hid);
	}

	@Override
	public Hero selectOneHero(Integer  hid) {
		// TODO Auto-generated method stub
		return mapper.selectOneHero(hid);
	}

	@Override
	public Camp selectCampById(Integer cid) {
		// TODO Auto-generated method stub
		return mapper.selectCampById(cid);
	}
}
