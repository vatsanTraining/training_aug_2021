package com.training.ifaces;
import java.util.*;
public interface Repository<T> {

   public boolean add(T t);
   public List<T> findAll();
   public boolean remove();
}
