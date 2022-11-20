package com.Services;

import com.Models.Size;

import java.util.List;


public interface SizeService {
    public List<Size> getList();

    public boolean insert(Size size);

//    public List<String> check(String ma);

    public boolean update(Size size, String id);

    public boolean delete(String id);
}
