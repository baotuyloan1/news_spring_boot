package com.baonguyenduc.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baonguyenduc.dto.NewDTO;

@RestController
public class NewAPI {

//	@RequestMapping(value = "/new", method = RequestMethod.POST)
	@PostMapping(value = "/new")
	public NewDTO createNew (@RequestBody NewDTO model) {
		return model;
	}
	
	@PutMapping(value = "/new")
	public String updateNew (@RequestBody NewDTO model) {
		return model.toString();
	}
	
	@DeleteMapping(value = "/new")
	public void deleteNew (@RequestBody long[] ids) {
	}

}
