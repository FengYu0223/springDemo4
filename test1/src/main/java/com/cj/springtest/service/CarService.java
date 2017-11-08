
package com.cj.springtest.service;

import com.cj.springtest.model.TbItem;
import com.cj.springtest.model.TbItemCar;

import java.util.List;


/**
 * Created by fengyu1 on 2017/8/11.
 */

public interface CarService {
    public void addCar(String title,Long price);
    List<TbItemCar> carDet();
    public void delCar(String dtitle);

/*    public void delCarRedis(String dtitle);
    public void addCarRedis(String title,Long price);
    List <TbItemCar> carDetRedis();*/
}

