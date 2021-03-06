package kr.lineus.unistars.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import kr.lineus.unistars.dto.ELevel;
import kr.lineus.unistars.dto.User;
import kr.lineus.unistars.entity.UserEntity;

public class UserConverterTest {
	

	@Test
	public void whenConvertUserEntityToUser_thenCorrect() {
		UUID uuid = UUID.randomUUID();
		UserEntity user = new UserEntity();
		user.setId(uuid);
		user.setEmail("lineus.local@gmail.com");
		user.setFullname("lineus");
		user.setAddress("89 Tran Van Du, Tan Binh District");
		user.setBirthdate("1/1/1990");
		user.setCity("HCM");
		user.setGender("Male");
		user.setLevel(ELevel.Advanced);
		user.setPhonenumber("0907777777");
		user.setJob("Software Engineer");
	
		
		User dto = UserConverter.getInstance().entityToDto(user);
		assertEquals(dto.getId(), user.getId().toString());
		assertEquals(dto.getEmail(), user.getEmail());
		assertEquals(dto.getFullname(), user.getFullname());
		assertEquals(dto.getAddress(), user.getAddress());
		assertEquals(dto.getBirthdate(), user.getBirthdate());
		assertEquals(dto.getCity(), user.getCity());
		assertEquals(dto.getGender(), user.getGender());
		assertEquals(dto.getLevel(), user.getLevel().name());
		assertEquals(dto.getPhonenumber(), user.getPhonenumber());
		
	}

	@Test
	public void whenConvertPostDtoToPostEntity_thenCorrect() {
		UUID uuid = UUID.randomUUID();
		User dto = new User();
		dto.setId(uuid.toString());
		dto.setEmail("lineus.local@gmail.com");
		dto.setFullname("lineus");
		dto.setAddress("89 Tran Van Du, Tan Binh District");
		dto.setBirthdate("1/1/1990");
		dto.setCity("HCM");
		dto.setGender("Male");
		dto.setLevel(ELevel.Advanced.name());
		dto.setPhonenumber("0907777777");
		dto.setJob("Software Engineer");
		
		UserEntity user = UserConverter.getInstance().dtoToEntity(dto);
		assertEquals(dto.getId(), user.getId().toString());
		assertEquals(dto.getEmail(), user.getEmail());
		assertEquals(dto.getFullname(), user.getFullname());
		assertEquals(dto.getAddress(), user.getAddress());
		assertEquals(dto.getBirthdate(), user.getBirthdate());
		assertEquals(dto.getCity(), user.getCity());
		assertEquals(dto.getGender(), user.getGender());
		assertEquals(dto.getLevel(), user.getLevel().name());
		assertEquals(dto.getPhonenumber(), user.getPhonenumber());
		assertEquals(dto.getJob(), user.getJob());
		
	}

}
