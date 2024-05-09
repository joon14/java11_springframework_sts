package com.spring3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring3.dto.Store;
import com.spring3.service.StoreService;
import com.spring3.vo.Maker;

//REST(REpresentation State Transfer) : 표현 가능한 자원의 상태를 전송
//RESTful : 표현 가능한 자원의 상태를 자유롭게 전송할 수 있는
//API : 프로그래밍시에 활용할 수 있는 애플리케이션 형태의 자원
//RESTful API(Application Programming Interface Of REpresentation State Transfer)
@RestController	//@ResposeBody + @Controller = JSON
@RequestMapping("/api/")
public class RestfulController {
	
	@Autowired
	private StoreService storeService;
	
	@GetMapping("api1.do")
	public int getApi1() {
		return 1004;
	}
	
	@GetMapping("api2.do")
	public Store getApi2() {
		Store store = new Store(1, "Emart");
		return store;
	}
	
	@GetMapping("api3.do")
	public List<Store> getApi3() {
		Store store1 = new Store(1, "Emart");
		Store store2 = new Store(2, "Homeplus");
		Store store3 = new Store(3, "Costco");
		
		List<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		
		return storeList;
	}
	
	@GetMapping("api4.do")
	public Maker getApi4() {
		Store store1 = new Store(1, "Emart");
		Store store2 = new Store(2, "Homeplus");
		Store store3 = new Store(3, "Costco");
		
		ArrayList<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		
		Maker maker = new Maker("GreatMall", 1, storeList);
		
		return maker;
	}
	
	@PostMapping("api5.do")
	public Store postApi5(@RequestBody Store store) {
		storeService.insStore(store);
		return store;
	}
}
