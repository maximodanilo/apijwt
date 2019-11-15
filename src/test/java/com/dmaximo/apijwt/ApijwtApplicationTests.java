package com.dmaximo.apijwt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.dmaximo.apijwt.model.Role;
import com.dmaximo.apijwt.model.User;
import com.dmaximo.apijwt.repository.UserRepository;
import com.dmaximo.apijwt.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest
class ApijwtApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	@Test
	public void findAll() throws Exception {
		// given
		User user = new User();
		user.setUsername("junit");
		user.setPassword("junit123");
		user.setEmail("junit@gmail.com");
		List<Role> roles = new ArrayList<Role>();
		roles.add(Role.ROLE_ADMIN);
		
		user.setRoles(roles);
		
		String v_return;
//		given(userService.signup(user)).willReturn(v_return);

		// when + then
//		this.mockMvc.perform(get("/api/v1/stocks")).andExpect(status().isOk())
//				.andExpect(content().json("[{'id': 1,'name': 'Stock 1';'price': 1}]"));
	}

}
