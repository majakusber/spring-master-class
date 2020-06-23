package com.spring.tutorial.basics.demo.cdi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {

  @InjectMocks
  SomeCdiBusiness business;

  @Mock
  SomeCdiDao dao;

  @Test
  void getMax() {
    Mockito.when(dao.getData()).thenReturn(new int[]{1,2,3});
    assertEquals(3, business.getMax());
  }

  @Test
  void getMax_noElements() {
    Mockito.when(dao.getData()).thenReturn(new int[]{});
    assertEquals(Integer.MIN_VALUE, business.getMax());
  }

  @Test
  void getMax_equalElements() {
    Mockito.when(dao.getData()).thenReturn(new int[]{22, 22});
    assertEquals(22, business.getMax());
  }
}