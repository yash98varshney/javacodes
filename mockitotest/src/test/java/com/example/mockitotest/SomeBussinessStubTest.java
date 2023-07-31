package com.example.mockitotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBussinessStubTest {
    

    @Test
    public void calculateSumUsingDataServiceTest(){
        SomeBusinessImpl bussiness=new SomeBusinessImpl();
        bussiness.setSomedataservice(new Stub());
        int actualresult=bussiness.calculateSumUsingDataService();
        int expected=15;
        assertEquals(expected, actualresult);


    }

    @Test
    public void calculateSumUsingDataService_empty(){
        SomeBusinessImpl bussiness=new SomeBusinessImpl();
        bussiness.setSomedataservice(new Stub());
        int actual=bussiness.calculateSumUsingDataService();
        int expected=0;
        assertEquals(expected,actual);

    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        SomeBusinessImpl business=new SomeBusinessImpl();
        business.setSomedataservice(new Stub());
        int actual=business.calculateSumUsingDataService();
        int expected=5;
        assertEquals(expected, actual);
    }

}


/*
 * 
  @Override
  public List<ItemEntity> getMenuforRes(String id){
    List<ItemEntity> ans=(List<ItemEntity>) item.findById(id).get();
    return ans;
  }


  @GetMapping(MENU_API)
  public ResponseEntity<List<ItemEntity>> getmenuofRes(@RequestParam("restaurantID") String id ){
    
    List<ItemEntity> ans=restaurantService.getMenuforRes(id);
    return ResponseEntity.ok().body(ans);
  }

    List<ItemEntity> getMenuforRes(String id);

      @Autowired
  ItemRepository item;
 */