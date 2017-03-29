package com.gc.room.user.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gc.room.user.beans.RoomDetailsBean;
import com.gc.room.user.beans.UserReqBean;

@RestController
@RequestMapping(value = "user")
public class UserController {
	
	
	@RequestMapping(value = "hello", produces=MediaType.APPLICATION_ATOM_XML,  method = RequestMethod.GET)
	public UserReqBean getHello(){
		UserReqBean req = new UserReqBean();
		req.setUserName("Sonali");
		req.setPassword("12345");
		return req;
	}
/*	@ResponseBody
	@RequestMapping(value = "getRoomDetails", method = RequestMethod.POST, produces=MediaType.APPLICATION_XML, consumes = MediaType.APPLICATION_XML)
	public ResponseEntity<List<RoomDetailsBean>> getRoomDetailsById(@RequestBody UserReqBean req){
		System.out.println("In ");
		List<RoomDetailsBean> roomDtlList = new ArrayList<RoomDetailsBean>();
		RoomDetailsBean roomDetails = new RoomDetailsBean();
		roomDetails.setId(123);
		roomDetails.setRoomId(12345);
		roomDetails.setStartDate(new Date());
		roomDetails.setEndDate(new Date());
		roomDtlList.add(roomDetails);
		return new ResponseEntity<List<RoomDetailsBean>>(roomDtlList, HttpStatus.OK);
	}*/
	@ResponseBody
	@RequestMapping(value = "getRoomDetails", method = RequestMethod.POST, produces=MediaType.APPLICATION_XML, consumes = MediaType.APPLICATION_XML)
	public List<RoomDetailsBean> getRoomDetailsById(@RequestBody UserReqBean req){
		System.out.println("In ");
		List<RoomDetailsBean> roomDtlList = new ArrayList<RoomDetailsBean>();
		RoomDetailsBean roomDetails = new RoomDetailsBean();
		roomDetails.setId(123);
		roomDetails.setRoomId(12345);
		roomDetails.setStartDate(new Date());
		roomDetails.setEndDate(new Date());
		roomDtlList.add(roomDetails);
		return roomDtlList;
	}
}
