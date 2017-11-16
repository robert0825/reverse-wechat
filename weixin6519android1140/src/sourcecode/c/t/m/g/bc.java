package c.t.m.g;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class bc
{
  private static bc a = new bc();
  private Map<String, String> b = new bd();
  
  private bc()
  {
    a(bz.b("HalleyOperInfo_" + l.b(), ""), false);
  }
  
  public static bc a()
  {
    return a;
  }
  
  public static String a(int paramInt)
  {
    String str = "";
    if (paramInt == 1) {
      str = "cm";
    }
    do
    {
      return str;
      if (paramInt == 3) {
        return "ct";
      }
    } while (paramInt != 2);
    return "uni";
  }
  
  public final String a(String paramString)
  {
    if ((ce.a(paramString)) || ("unknown".equals(paramString))) {
      return "";
    }
    synchronized (this.b)
    {
      paramString = (String)this.b.get(paramString);
      if (!ce.a(paramString)) {
        return paramString;
      }
    }
    return "";
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if ((ce.a(paramString1)) || ("unknown".equals(paramString1)) || (ce.a(paramString2)) || ("unknown".equals(paramString2))) {
      return;
    }
    synchronized (this.b)
    {
      if (!paramString2.equals((String)this.b.get(paramString1)))
      {
        this.b.put(paramString1, paramString2);
        paramString1 = b();
        bz.a("HalleyOperInfo_" + l.b(), paramString1);
      }
      return;
    }
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    int i = 0;
    label136:
    for (;;)
    {
      try
      {
        if (ce.a(paramString)) {
          break;
        }
        synchronized (this.b)
        {
          this.b.clear();
          String[] arrayOfString = paramString.split("h;l");
          if (arrayOfString != null)
          {
            int j = arrayOfString.length;
            if (i < j)
            {
              Object localObject2 = arrayOfString[i].split("h,l");
              if (localObject2.length != 2) {
                break label136;
              }
              Object localObject1 = localObject2[0];
              localObject2 = localObject2[1];
              this.b.put(localObject1, localObject2);
              break label136;
            }
          }
          if (!paramBoolean) {
            break;
          }
          bz.a("HalleyOperInfo_" + l.b(), paramString);
          return;
        }
        i += 1;
      }
      catch (Exception paramString)
      {
        return;
      }
    }
  }
  
  public final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    synchronized (this.b)
    {
      ArrayList localArrayList1 = new ArrayList(this.b.keySet());
      ArrayList localArrayList2 = new ArrayList(this.b.values());
      int i = 0;
      while (i < localArrayList1.size())
      {
        String str1 = (String)localArrayList1.get(i);
        String str2 = (String)localArrayList2.get(i);
        localStringBuilder.append(str1).append("h,l").append(str2).append("h;l");
        i += 1;
      }
      return localStringBuilder.toString();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */