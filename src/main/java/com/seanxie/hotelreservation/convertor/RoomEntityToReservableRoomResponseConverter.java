package com.seanxie.hotelreservation.convertor;

import org.springframework.core.convert.converter.Converter;

import com.seanxie.hotelreservation.entity.RoomEntity;
import com.seanxie.hotelreservation.model.Links;
import com.seanxie.hotelreservation.model.Self;
import com.seanxie.hotelreservation.model.response.ReservableRoomResponse;
import com.seanxie.hotelreservation.rest.ResourceConstants;

public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse>{

	@Override
	public ReservableRoomResponse convert(RoomEntity source) {
		// TODO Auto-generated method stub
		
		ReservableRoomResponse reservationResponse = new ReservableRoomResponse();
		if(null != source.getId())
			reservationResponse.setId(source.getId());
		reservationResponse.setRoomNumber(source.getRoomNumber());
		reservationResponse.setPrice( Integer.valueOf(source.getPrice()) );
		
		Links links = new Links();
		Self self = new Self();
		self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
		links.setSelf(self);
		
		reservationResponse.setLinks(links);
		
		return reservationResponse;
	}

	
	
}
