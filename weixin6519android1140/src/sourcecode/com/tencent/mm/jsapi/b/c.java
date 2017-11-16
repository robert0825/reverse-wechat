package com.tencent.mm.jsapi.b;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public abstract class c
  implements e
{
  private int index;
  public String name;
  
  public c(String paramString)
  {
    GMTrace.i(20019111002112L, 149154);
    this.name = paramString;
    GMTrace.o(20019111002112L, 149154);
  }
  
  public c(String paramString, int paramInt)
  {
    GMTrace.i(20019245219840L, 149155);
    this.name = paramString;
    this.index = paramInt;
    GMTrace.o(20019245219840L, 149155);
  }
  
  public final int getIndex()
  {
    GMTrace.i(20019647873024L, 149158);
    int i = this.index;
    GMTrace.o(20019647873024L, 149158);
    return i;
  }
  
  public final String getName()
  {
    GMTrace.i(20019513655296L, 149157);
    String str = this.name;
    GMTrace.o(20019513655296L, 149157);
    return str;
  }
  
  public abstract JSONObject on();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */