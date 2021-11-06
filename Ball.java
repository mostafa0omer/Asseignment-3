package assiginment;
public abstract class Ball implements Tossable
{
    protected String brandName;
    @Override
    public void toss()
    {
        
    }
      public abstract void bounce();
      
      public Ball(String brandName)
      {  
          
      }
          public String GetBrandName()
    {
        return brandName;
    }
}