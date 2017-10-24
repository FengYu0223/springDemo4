
package com.cj.springtest.service;

import com.cj.springtest.model.TbItem;
import com.cj.springtest.model.TbItemCar;

import java.util.List;


/**
 * Created by fengyu1 on 2017/8/11.
 */

public interface CarService {
    public void addCar(String title,Long price);
    public void addCarRedis(String title,Long price);
    List<TbItemCar> carDet();
    List <TbItemCar> carDetRedis();
    public void delCar(String dtitle);
    public void delCarRedis(String dtitle);
}

