package com.Testing.JUnitTesting.ModelTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.mockito.runners.MockitoJUnitRunner;

import com.Testing.JUnitTesting.Model.Product;

@RunWith(MockitoJUnitRunner.class)

public class ProductTest {

	static Product p;

	private List<Product> k = new ArrayList<>();
	// List<Product> mockProducts = mock(List.class);

	@BeforeAll
	public static void setUp() throws Exception {

		p = new Product();

	}

	@Test
	public void testAddProduct() {
		List<String> mockList = mock(List.class);
		when(mockList.size() == 2).thenReturn(true);

	}
}
