public class LargeCoke extends Coke {  
     @Override  
    public String name() {  
         return "750 ml Coke";    
    }  
  
    @Override  
    public String size() {  
         
        return "Large Size";  
    }  
  
    @Override  
    public float price() {  
      
        return  50.0f;  
    }      
}// End of the LargeCoke class  
  
</textrea></div>  
  
<p>Step 13:<b>Create an OrderedItems class that are having Item objects defined above.</b></p>  
<div id="filename">File: OrderedItems.java</div>  
<div class="codeblock"><textarea  name="code" class="java">  
import java.util.ArrayList;  
import java.util.List;  
public class OrderedItems {  
     
    List<Item> items=new ArrayList<Item>();  
      
    public void addItems(Item item){  
          
        items.add(item);  
    }  
    public float getCost(){  
          
        float cost=0.0f;  
            for (Item item : items) {  
                cost+=item.price();  
             }  
        return cost;  
    }  
    public void showItems(){  
          
        for (Item item : items) {  
            System.out.println("Item is:" +item.name());  
            System.out.println("Size is:" +item.size());  
            System.out.println("Price is: " +item.price());  
              
        }  
    }  
     
}// End of the OrderedItems class  