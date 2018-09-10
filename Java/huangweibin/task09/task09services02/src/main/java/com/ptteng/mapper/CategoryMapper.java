package com.ptteng.mapper;


import com.ptteng.pojo.*;
import org.springframework.stereotype.*;

import java.util.*;


@Repository
public interface CategoryMapper {
    public void add(Category category);

    public void delete(int id);

    public Category get(int id);

    public void update(Category category);

    public List<Category> list();

    public List<Category> list(Page page);

    public List<Category> list1(String start, String count);

    public int total();


}
