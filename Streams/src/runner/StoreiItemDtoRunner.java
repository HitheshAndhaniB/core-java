package runner;

import mapBucketing.ItemDto;
import mapBucketing.StoreDto;

import java.util.HashMap;
import java.util.Map;

public class StoreiItemDtoRunner {
    public static void main(String[] args) {
        StoreDto storeDto1 = new StoreDto("Amazon", "Seattle", 1001);
        StoreDto storeDto2 = new StoreDto("Walmart", "Bentonville", 1002);
        StoreDto storeDto3 = new StoreDto("Target", "Minneapolis", 1003);
        StoreDto storeDto4 = new StoreDto("Best Buy", "Richfield", 1004);
        StoreDto storeDto5 = new StoreDto("Costco", "Issaquah", 1005);
        StoreDto storeDto6 = new StoreDto("Home Depot", "Atlanta", 1006);
        StoreDto storeDto7 = new StoreDto("Lowe's", "Mooresville", 1007);
        StoreDto storeDto8 = new StoreDto("IKEA", "Älmhult", 1008);
        StoreDto storeDto9 = new StoreDto("Tesco", "Welwyn Garden City", 1009);
        StoreDto storeDto10 = new StoreDto("Tesco", "Boulogne-Billancourt", 1010);
        StoreDto storeDto11 = new StoreDto("Tsco", "Boulogne-Billancourt", 1010);


        ItemDto itemDto1 = new ItemDto("Rice", 2.5, 199.0);
        ItemDto itemDto2 = new ItemDto("Bread", 1.0, 99.0);
        ItemDto itemDto3 = new ItemDto("Milk", 1.5, 59.0);
        ItemDto itemDto4 = new ItemDto("Eggs", 12.0, 349.0);
        ItemDto itemDto5 = new ItemDto("Chicken", 1.8, 499.0);
        ItemDto itemDto6 = new ItemDto("Apples", 2.0, 79.0);
        ItemDto itemDto7 = new ItemDto("Oranges", 2.5, 89.0);
        ItemDto itemDto8 = new ItemDto("Potatoes", 3.0, 49.0);
        ItemDto itemDto9 = new ItemDto("Tomatoes", 1.0, 69.0);
        ItemDto itemDto10 = new ItemDto("Pasta", 0.5, 149.0);

        Map<StoreDto,ItemDto> storeDtoItemDtoMap = new HashMap<>();
        storeDtoItemDtoMap.put(storeDto1,itemDto1);
        storeDtoItemDtoMap.put(storeDto2,itemDto2);
        storeDtoItemDtoMap.put(storeDto3,itemDto3);
        storeDtoItemDtoMap.put(storeDto4,itemDto4);
        storeDtoItemDtoMap.put(storeDto5,itemDto5);
        storeDtoItemDtoMap.put(storeDto6,itemDto6);
        storeDtoItemDtoMap.put(storeDto7,itemDto7);
        storeDtoItemDtoMap.put(storeDto8,itemDto8);
        storeDtoItemDtoMap.put(storeDto9,itemDto9);
        storeDtoItemDtoMap.put(storeDto10,itemDto10);

        System.out.println("Exiting :"+storeDtoItemDtoMap.containsKey(storeDto11));
        storeDtoItemDtoMap.forEach((k,v)-> System.out.println(k+ " "+v));


    }
}
