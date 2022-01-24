package com.eomcs.openapi.json.jackson.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test01 {

	public static void main(String[] args) throws Exception {
		String jsonStr = "{\"name\":\"소보루\", \"maker\":\"안데르센\"}";

		ObjectMapper mapper = new ObjectMapper();

		//		mapper.readValue(jsonStr, null); // readValue에게 클래스 정보를 줘서 어떤 객체를 만들어야 하는지 알려줘야함

		Bread obj = mapper.readValue(jsonStr, Bread.class);

	}

}
