public abstract class Coke  extends ColdDrink {  
  
    @Override  
    public abstract  String name();  
  
    @Override  
    public abstract  String size();  
      
    @Override  
    public abstract  float price();   
      
}// End of the Coke class  
  
</textaea></div>  
  
<p>Step 11:<b>Now, create concrete sub-classes SmallPepsi, MediumPepsi, LargePepsi that will extend to the abstract class Pepsi.</b></p>  
<div id="filename">File: SmallPepsi.java</div>  
<div class="codeblock"><textarea  name="code" class="java">  
public class SmallPepsi  extends Pepsi{  
  
    @Override  
    public String name() {  
       return "300 ml Pepsi";  
    }  
  
    @Override  
    public float price() {  
        return 25.0f;  
    }  
  
    @Override  
    public String size() {  
        return "Small Size";  
    }     
}// End of the SmallPepsi class  