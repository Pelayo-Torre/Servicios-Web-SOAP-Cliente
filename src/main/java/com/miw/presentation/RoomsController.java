package com.miw.presentation;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.webservice.HotelException_Exception;
import main.java.webservice.IRoomWS;
import main.java.webservice.RoomAddDTO;
import main.java.webservice.RoomDTO;
import main.java.webservice.RoomException_Exception;
import main.java.webservice.RoomWSService;

@Controller
@RequestMapping("rooms")
public class RoomsController {

	@ModelAttribute("room")
	public RoomAddDTO getRoom() {
		return new RoomAddDTO();
	}
	
	@ModelAttribute("roomEdit")
	public RoomDTO getRoomEdit() {
		return new RoomDTO();
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addRoom(Model model) {
		model.addAttribute("error", "");
		return "addRoom";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addRoom(@ModelAttribute("room") RoomAddDTO room, Model model) {
		RoomWSService service = new RoomWSService();
		IRoomWS roomws = service.getRoomWSPort();
		room.setIdHotel(2L);
				
		try {
			roomws.addRoom(room);
		} catch (RoomException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addRoom";
		} catch (HotelException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addRoom";
		}
		return "redirect:list";
	}
	
	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public String editRoom(@ModelAttribute("roomEdit") RoomDTO room, Model model) {
		RoomWSService service = new RoomWSService();
		IRoomWS roomws = service.getRoomWSPort();
			
		try {
			roomws.updateRoom(room);
		} catch (RoomException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "editRoom";
		} 
		return "redirect:list";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String listRoom(Model model) {
		RoomWSService service = new RoomWSService();
		IRoomWS roomws = service.getRoomWSPort();
		try {
			List<RoomDTO> rooms = roomws.listRoomsOfHotel(2L);
			model.addAttribute("rooms", rooms);
			model.addAttribute("error", "");
		} catch (HotelException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "listRooms";
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public String editRoom(@PathVariable Long id, Model model) {
		RoomWSService service = new RoomWSService();
		IRoomWS roomws = service.getRoomWSPort();
		try {
			model.addAttribute("roomEdit", roomws.listRoom(id));
			model.addAttribute("error", "");
		} catch (RoomException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "listRooms";
		}
		return "editRoom";
	}
	
	@RequestMapping(value="/desactivate/{id}", method = RequestMethod.GET)
	public String desactivateRoom(@PathVariable Long id, Model model) {
		RoomWSService service = new RoomWSService();
		IRoomWS roomws = service.getRoomWSPort();
		try {
			roomws.deleteRoom(id);
			model.addAttribute("error", "");
		} catch (RoomException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "redirect:/rooms/list";
	}
	
}
