package com.Services;

import com.Models.Color;

import java.util.List;

public interface ColorService {
    public List<Color> getList();

    public boolean insert(Color color);

//    public List<String> check(String ma);
    public boolean update(Color color, String id);

    public boolean delete(String id);

}
