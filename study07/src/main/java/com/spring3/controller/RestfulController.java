package com.spring3.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.spring3.dto.Classroom;
import com.spring3.dto.Store;
import com.spring3.dto.Student;
import com.spring3.service.StoreService;
import com.spring3.vo.Maker;

//REST(REpresentation State Transfer) : 표현 가능한 자원의 상태를 전송
//RESTful : 표현 가능한 자원의 상태를 자유롭게 전송할 수 있는
//API : 프로그래밍시에 활용할 수 있는 애플리케이션 형태의 자원
//RESTful API(Application Programming Interface Of REpresentation State Transfer)
@RestController	//@ResposeBody + @Controller = JSON
@RequestMapping("/api/")
public class RestfulController {
	
	private static final Logger log = LoggerFactory.getLogger(RestfulController.class);
	
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
	
	@PostMapping("api6.do")	//RestController의 Post를 활용한 Student -> JsonString
	public String postStudent(@RequestBody Student std) {
		String response = String.format("\n<학생 정보>\n이름 : %s\n번호 : %d\n나이 : %d", std.getName(), std.getStdNumber(), std.getAge());
		log.info("postStudent response : "+response);
		return response;
	}
	
	@PostMapping("api7.do")
	public String postAllStudent(@RequestBody List<Student> stds) {
		String response = "\n<학급 정보>\n";
		
		int i = 1;
		for(Student s : stds) {
			response += String.format("[학생%d]\t이름 : %s\t번호 : %d\t나이 : %d\n", i, s.getName(), s.getStdNumber(), s.getAge());
			i++;
		}
		log.info("postAllStudent response : "+response);
		return response;
	}
	
	@PostMapping("api8.do")
	public String postClassroom(@RequestBody Classroom team) {
		String response = String.format("\n<팀 정보>\n학과 명 : %s\n반 : %d\n", team.getPart(), team.getClassNum());
		
		int i = 1;
		for(Student s : team.getStudents()) {
			response += String.format("[학생%d]\t이름 : %s\t번호 : %d\t나이 : %d\n", i, s.getName(), s.getStdNumber(), s.getAge());
			i++;
		}
		log.info("postClassroom response : "+response);
		return response;
	}
	
	@PostMapping("api9.do")
	public Student convertStringToStudent1(@RequestBody String jsonStr) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);
		
		Student std = new Student(Integer.valueOf(jsonObject.get("stdNumber").toString()), jsonObject.get("name").toString(), Integer.valueOf(jsonObject.get("age").toString()));
		log.info("convertStringToStudent1 response : "+std);
		return std;
	}
	
	@PostMapping(value="api10.do", produces="application/json;charset=utf-8")
	public String convertStringToString1(@RequestBody Student std) {
		JSONObject jsonPlayer = new JSONObject();
		jsonPlayer.put("stdNumber", std.getStdNumber());
		jsonPlayer.put("name", std.getName());
		jsonPlayer.put("age", std.getAge());
		
		String jsonStr = jsonPlayer.toJSONString();
		
		log.info("convertStringToString1 result : "+jsonStr);
		return jsonStr;
	}
	
	@PostMapping(value="api11.do", produces="application/json;charset=utf-8")
	public Student convertStringToStudent2(@RequestBody String jsonStr) {
		Gson gson = new Gson();
		Student std = gson.fromJson(jsonStr, Student.class);
		
		log.info("convertStringToStudent2 result : "+std);
		return std;
	}
	
	@PostMapping(value="api12.do", produces="application/json;charset=utf-8")
	public Classroom convertStringToClassroom2(@RequestBody String jsonStr) {
		Gson gson = new Gson();
		Classroom team = gson.fromJson(jsonStr, Classroom.class);
		
		log.info("convertStringToClassroom2 result : "+team);
		return team;
	}
}