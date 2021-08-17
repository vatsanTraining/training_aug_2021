package com.example.ifaces;
import java.util.*;
public interface Repository<T> {

   public boolean add(T t);
   public List<T> findAll();
   public boolean remove(T t);
   public List<T> sortedList();
   public List<T> sortBy(String prop);
   
}
