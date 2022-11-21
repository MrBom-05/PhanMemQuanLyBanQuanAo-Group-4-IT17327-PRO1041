/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Services;

import com.Models.Substance;
import com.Models.Size;
import java.util.List;

/**
 *
 * @author khanhnd
 */
public interface SubstanceService {
    public List<Substance> getList();

    //add
    public boolean insert(Substance substance);

    public boolean update(Substance substance, String code);

    public boolean delete(String code);

    
}
