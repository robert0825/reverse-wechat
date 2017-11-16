package c.t.m.g;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class bd
  extends LinkedHashMap<String, String>
{
  bd()
  {
    super(8, 1.0F, true);
  }
  
  protected final boolean removeEldestEntry(Map.Entry<String, String> paramEntry)
  {
    return size() > 8;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */