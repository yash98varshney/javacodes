package com.in28min.rest.webservices.restfulwebservices.filtering;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean filtering() {
		return new SomeBean("value1","value2","value3");
	}
	
	//If we take and return list or anything @JsonIgnore values are ignored in response
	
	//Dynamic filtering 
	
	@GetMapping("/dynamicfiltering")
	public MappingJacksonValue dynamicFiltering() {
		
		SomeBeanDynamic somebeandynamic=new SomeBeanDynamic("feild1","feild2","feild3");
		
		MappingJacksonValue mappingjacksonvalue=new MappingJacksonValue(somebeandynamic);
		
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		
		FilterProvider filters=new SimpleFilterProvider().addFilter("SomeBeandynamicFilter",filter);
		mappingjacksonvalue.setFilters(filters);
		
		return mappingjacksonvalue;
	}
}
