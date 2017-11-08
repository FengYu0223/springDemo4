
package com.cj.springtest.service.impl;

import com.cj.springtest.mapper.TbItemCarExtendMapper;
import com.cj.springtest.mapper.TbItemCarMapper;
import com.cj.springtest.mapper.TbItemExtendMapper;
import com.cj.springtest.mapper.UserMapper;
import com.cj.springtest.model.TbItemCar;
import com.cj.springtest.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import java.util.List;




/**
 * Created by fengyu1 on 2017/8/11.
 */


@Service
public class CarServiceImpl implements CarService{

    @Autowired
    TbItemCarExtendMapper tbItemCarExtendMapper;
    @Autowired
    TbItemCarMapper tbItemCarMapper;
    @Autowired
    TbItemExtendMapper tbItemExtendMapper;

  /* @Autowired
    private JedisClient jedisClient;
*/

    @Autowired
    UserMapper userMapper;
    //用户数据缓存的过期时间（默认为12h ）
    int  ITEM_EXPIRE_SECOND=86400;

    /*List <String> rtitle=new ArrayList<String>();
    Long rprice;*/

    //car写入购物车  sql
    public void addCar(String title,Long price){
         //判断购物车内是否有重复商品，有则数量加1
        TbItemCar tbItemCarQty=tbItemCarExtendMapper.selItemQtyCar(title);

        if(ObjectUtils.isEmpty(tbItemCarQty)) {
            tbItemCarExtendMapper.addCar(new TbItemCar(title, price));

            } else {
              int itemQty = tbItemCarQty.getSortOrder();
              itemQty++;
              tbItemCarExtendMapper.updatItemQtyCar(new TbItemCar(title, itemQty));
            }

    }
    // sql detele car
    public void delCar(String dtitle){
        tbItemCarExtendMapper.delCar(dtitle);
    }

    // redis detele car
   /* public void delCarRedis(String dtitle){
        String key = "test";
        try {
            String redisResult = jedisClient.get(key);
            List<TbItemCar> delCarlist = JsonUtils.jsonToList(redisResult, TbItemCar.class);
            for (TbItemCar tbItemcars : delCarlist) {

                if (tbItemcars.getTitle().equals(dtitle)) {
                    delCarlist.remove(tbItemcars);
                    break;
                }
            }

            jedisClient.set (key, JsonUtils.objectToJson(delCarlist));
    } catch (Exception e) {
        e.printStackTrace();
    }}*/

    //sql car list
    public List<TbItemCar> carDet(){
        return tbItemCarExtendMapper.carDet();
    }

    // redis add car
   /* public void addCarRedis(String title, Long price) {
        String key = "test";

        //判断是否有购物车
        if(jedisClient.exists(key)) {
            //若果存在的话 判断集合中是否存在该商品
            String redisResult = jedisClient.get(key);
            List<TbItemCar> list = JsonUtils.jsonToList(redisResult, TbItemCar.class);
            boolean isExist = false;
            //循环判断改id是否存在如果存在的话num+1
            for (TbItemCar tbItemcars : list) {

                if (tbItemcars.getTitle().equals(title)) {

                    isExist = true;
                    tbItemcars.setSortOrder((tbItemcars.getSortOrder() + 1));
                    break;
                }
            }
            //如果购物车存在但是id不存在就重新添加一个并重新set进去
                if (!isExist) {

                 TbItemCar tbItem = new TbItemCar(title, price, 1);
                 list.add(tbItem);
                }
            jedisClient.set(key, JsonUtils.objectToJson(list));

        }else {
            //没有key表示没有购物车 将购物车装到redis中
            TbItemCar tbItem = new TbItemCar(title, price, 1);
            List<TbItemCar> list = new ArrayList<TbItemCar>();
            list.add(tbItem);
            jedisClient.set(key, JsonUtils.objectToJson(list));
        }
    }*/
      // redis car list
    /*public List<TbItemCar> carDetRedis() {
        String key = "test";
        Boolean exits = jedisClient.exists(key);
        if(exits)
        {
            return JsonUtils.jsonToList(jedisClient.get(key),TbItemCar.class);
        }
        return new ArrayList<TbItemCar>();
    }*/
    /**
     * 向redis中添加缓存
     * 原则：不能影响业务的正常逻辑，所以单独处理，使用trycatch
     */
/*    public void addCarRedis(String title, Long price) {
        rtitle.add(title);
        rprice=price;

        try {
            jedisClient.set("test" , JsonUtils.objectToJson(new TbItemCar(title,price,1)));

            //设置key过期时间，因为要设置过期时间，只能在key上设置，所以不能用hash
            jedisClient.expire(title , ITEM_EXPIRE_SECOND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    //redis car list  carDetRedis
   /* public List<TbItemCar> carDetRedis() {
        List<TbItemCar> itemCarsli=new ArrayList<TbItemCar>() ;
        try {
            String json = jedisClient.get("test");
            TbItemCar itemCars = JsonUtils.jsonToPojo(json, TbItemCar.class);  //转换为Java对象
            itemCarsli.add(itemCars);
            for(TbItemCar tbItemcar : itemCarsli)
            {
                if(tbItemcar.getTitle()==title)
                {
                    isExist = true;
                    tbItemImages.setNum(tbItemImages.getNum()+1);
                    break;
                }
            }

            *//*for(int i = 1 ; i < rtitle.size() ; i++) {

                    if (itemCars.getTitle().equals(rtitle.get(i))) {
                        i++;
                        itemCars.setSortOrder(itemCars.getSortOrder() + 1);
                    } else {
                       json = jedisClient.get(rtitle.get(i));
                        itemCars = JsonUtils.jsonToPojo(json, TbItemCar.class);
                        itemCarsli.add(itemCars);
                    }
             }*//*

        } catch (Exception e) {  e.printStackTrace();}

        rtitle.clear(); //清空临时list title
        return itemCarsli;
    }*/

}

