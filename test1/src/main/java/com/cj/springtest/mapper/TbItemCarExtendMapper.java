package com.cj.springtest.mapper;

import com.cj.springtest.model.TbItemCar;


import java.util.List;

/**
 * Created by fengyu1 on 2017/8/11.
 */
public interface TbItemCarExtendMapper {
    public void addCar(TbItemCar itemCar);
    public TbItemCar selItemQtyCar(String title);
    public void updatItemQtyCar(TbItemCar itemCar);

    public List<TbItemCar> carDet();
    public void delCar(String dtitle);
}
