package Educative;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShippingCost {

    class LineItem{
        public String product;
        public int quantity ;

        public LineItem(String product, int quantity)
        {
            this.product = product;
            this.quantity = quantity;
        }
    }

    class Order{
        public String country;
        public List<LineItem> items;

        public Order(String country, List<LineItem> items){
          this.country = country;
          this.items = items;
        }

    }

    class ItemCost{
        public String product ;
        public int cost;

        public ItemCost(String product,int cost)
        {
            this.cost = cost;
            this.product = product;
        }
    }

    public class Solution {
        public static int calculateShippmentCost(Order order, Map<String ,List<ItemCost>> shippingCosts)
        {
            List<ItemCost> costList = shippingCosts.get(order.country);

            Map<String , Integer> productCostMap = new HashMap<>();
            for(ItemCost itemCost:costList)
            {
                productCostMap.put(itemCost.product,itemCost.cost);

            }
            int totalcost =0;
          for(LineItem lineItem: order.items)
          {
              totalcost += productCostMap.getOrDefault(lineItem.product,0)* lineItem.quantity;
          }
           return totalcost;
        }
    }

}
