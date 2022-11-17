package com.Services;

import com.Models.Color;

import java.util.List;

public interface ColorService {
    public List<Color> getList();
    public Boolean insert(Color color);
//    public List<String> check(String ma);
    public Boolean update(Color color, String id);
    public Boolean delete(String id);

}
