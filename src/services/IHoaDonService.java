/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.HoaDon;

/**
 *
 * @author Admin
 */
public interface IHoaDonService {

    public List<HoaDon> GetAll();
    
    public boolean Update(HoaDon hd, String id);
}
