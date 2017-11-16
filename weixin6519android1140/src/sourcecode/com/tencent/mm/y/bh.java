package com.tencent.mm.y;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;

public final class bh
{
  int eQl;
  public String glx;
  public String glz;
  public String goC;
  public String goD;
  public String goE;
  public long goF;
  public String goG;
  public String goH;
  public int goI;
  public int goJ;
  public long goK;
  public String goL;
  String goM;
  public String name;
  public long time;
  public String title;
  public int type;
  public String url;
  
  public bh()
  {
    GMTrace.i(596195147776L, 4442);
    this.eQl = -1;
    this.goC = "";
    this.time = 0L;
    this.type = 0;
    this.name = "";
    this.title = "";
    this.url = "";
    this.goD = "";
    this.goE = "";
    this.goF = 0L;
    this.goG = "";
    this.goH = "";
    this.goI = 0;
    this.glx = "";
    this.glz = "";
    this.goJ = 0;
    this.goK = 0L;
    this.goL = "";
    this.goM = "";
    GMTrace.o(596195147776L, 4442);
  }
  
  public static String fw(int paramInt)
  {
    GMTrace.i(596463583232L, 4444);
    if (paramInt == 20)
    {
      GMTrace.o(596463583232L, 4444);
      return "newsapp";
    }
    if (paramInt == 11)
    {
      GMTrace.o(596463583232L, 4444);
      return "blogapp";
    }
    Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
    GMTrace.o(596463583232L, 4444);
    return null;
  }
  
  public final String BA()
  {
    GMTrace.i(597939978240L, 4455);
    if (this.glz == null)
    {
      GMTrace.o(597939978240L, 4455);
      return "";
    }
    String str = this.glz;
    GMTrace.o(597939978240L, 4455);
    return str;
  }
  
  public final String BB()
  {
    GMTrace.i(598074195968L, 4456);
    if (this.goL == null)
    {
      GMTrace.o(598074195968L, 4456);
      return "";
    }
    String str = this.goL;
    GMTrace.o(598074195968L, 4456);
    return str;
  }
  
  public final boolean Bu()
  {
    GMTrace.i(596732018688L, 4446);
    if (this.goJ == 1)
    {
      GMTrace.o(596732018688L, 4446);
      return true;
    }
    GMTrace.o(596732018688L, 4446);
    return false;
  }
  
  public final String Bv()
  {
    GMTrace.i(596866236416L, 4447);
    if (this.goC == null)
    {
      GMTrace.o(596866236416L, 4447);
      return "";
    }
    String str = this.goC;
    GMTrace.o(596866236416L, 4447);
    return str;
  }
  
  public final String Bw()
  {
    GMTrace.i(597403107328L, 4451);
    if (this.goD == null)
    {
      GMTrace.o(597403107328L, 4451);
      return "";
    }
    String str = this.goD;
    GMTrace.o(597403107328L, 4451);
    return str;
  }
  
  public final String Bx()
  {
    GMTrace.i(597537325056L, 4452);
    if (this.goG == null)
    {
      GMTrace.o(597537325056L, 4452);
      return "";
    }
    String str = this.goG;
    GMTrace.o(597537325056L, 4452);
    return str;
  }
  
  public final String By()
  {
    GMTrace.i(597671542784L, 4453);
    if (this.goH == null)
    {
      GMTrace.o(597671542784L, 4453);
      return "";
    }
    String str = this.goH;
    GMTrace.o(597671542784L, 4453);
    return str;
  }
  
  public final String Bz()
  {
    GMTrace.i(597805760512L, 4454);
    if (this.glx != null)
    {
      Object localObject = this.glx.split("\\|");
      if ((localObject != null) && (localObject.length > 0))
      {
        localObject = localObject[0];
        GMTrace.o(597805760512L, 4454);
        return (String)localObject;
      }
      GMTrace.o(597805760512L, 4454);
      return "";
    }
    GMTrace.o(597805760512L, 4454);
    return "";
  }
  
  public final void T(long paramLong)
  {
    GMTrace.i(596597800960L, 4445);
    this.goK = paramLong;
    GMTrace.o(596597800960L, 4445);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(596329365504L, 4443);
    this.goC = paramCursor.getString(0);
    this.time = paramCursor.getLong(1);
    this.type = paramCursor.getInt(2);
    this.name = paramCursor.getString(3);
    this.title = paramCursor.getString(4);
    this.url = paramCursor.getString(5);
    this.goD = paramCursor.getString(6);
    this.goE = paramCursor.getString(7);
    this.goF = paramCursor.getLong(8);
    this.goG = paramCursor.getString(9);
    this.goH = paramCursor.getString(10);
    this.goI = paramCursor.getInt(11);
    this.glx = paramCursor.getString(12);
    this.glz = paramCursor.getString(13);
    this.goJ = paramCursor.getInt(14);
    this.goK = paramCursor.getLong(15);
    this.goL = paramCursor.getString(16);
    this.goM = paramCursor.getString(17);
    GMTrace.o(596329365504L, 4443);
  }
  
  public final String getName()
  {
    GMTrace.i(597000454144L, 4448);
    if (this.name == null)
    {
      GMTrace.o(597000454144L, 4448);
      return "";
    }
    String str = this.name;
    GMTrace.o(597000454144L, 4448);
    return str;
  }
  
  public final String getTitle()
  {
    GMTrace.i(597134671872L, 4449);
    if (this.title == null)
    {
      GMTrace.o(597134671872L, 4449);
      return "";
    }
    String str = this.title;
    GMTrace.o(597134671872L, 4449);
    return str;
  }
  
  public final String getUrl()
  {
    GMTrace.i(597268889600L, 4450);
    if (this.url == null)
    {
      GMTrace.o(597268889600L, 4450);
      return "";
    }
    String str = this.url;
    GMTrace.o(597268889600L, 4450);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\y\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */