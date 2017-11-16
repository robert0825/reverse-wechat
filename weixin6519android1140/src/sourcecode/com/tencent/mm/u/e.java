package com.tencent.mm.u;

import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;
import org.json.JSONArray;

public final class e
  extends JSONArray
  implements a
{
  private final a fXM;
  
  public e()
  {
    GMTrace.i(20811398250496L, 155057);
    this.fXM = g.wu();
    GMTrace.o(20811398250496L, 155057);
  }
  
  e(a parama)
  {
    GMTrace.i(20811532468224L, 155058);
    Assert.assertNotNull(parama);
    this.fXM = parama;
    GMTrace.o(20811532468224L, 155058);
  }
  
  private e N(long paramLong)
  {
    GMTrace.i(20812203556864L, 155063);
    this.fXM.M(paramLong);
    GMTrace.o(20812203556864L, 155063);
    return this;
  }
  
  private e ar(Object paramObject)
  {
    GMTrace.i(20812337774592L, 155064);
    this.fXM.aq(paramObject);
    GMTrace.o(20812337774592L, 155064);
    return this;
  }
  
  private e bb(boolean paramBoolean)
  {
    GMTrace.i(20811800903680L, 155060);
    this.fXM.ba(paramBoolean);
    GMTrace.o(20811800903680L, 155060);
    return this;
  }
  
  private e eY(int paramInt)
  {
    GMTrace.i(20812069339136L, 155062);
    this.fXM.eT(paramInt);
    GMTrace.o(20812069339136L, 155062);
    return this;
  }
  
  private e eZ(int paramInt)
  {
    GMTrace.i(20815022129152L, 155084);
    e locale = new e(this.fXM.eU(paramInt));
    GMTrace.o(20815022129152L, 155084);
    return locale;
  }
  
  private e fa(int paramInt)
  {
    GMTrace.i(20815156346880L, 155085);
    e locale = new e(this.fXM.eV(paramInt));
    GMTrace.o(20815156346880L, 155085);
    return locale;
  }
  
  private h fb(int paramInt)
  {
    GMTrace.i(20815290564608L, 155086);
    h localh = new h(this.fXM.eW(paramInt));
    GMTrace.o(20815290564608L, 155086);
    return localh;
  }
  
  private h fc(int paramInt)
  {
    GMTrace.i(20815424782336L, 155087);
    h localh = new h(this.fXM.eX(paramInt));
    GMTrace.o(20815424782336L, 155087);
    return localh;
  }
  
  private e h(double paramDouble)
  {
    GMTrace.i(20811935121408L, 155061);
    this.fXM.g(paramDouble);
    GMTrace.o(20811935121408L, 155061);
    return this;
  }
  
  public final Object get(int paramInt)
  {
    GMTrace.i(20812606210048L, 155066);
    Object localObject = this.fXM.get(paramInt);
    GMTrace.o(20812606210048L, 155066);
    return localObject;
  }
  
  public final boolean getBoolean(int paramInt)
  {
    GMTrace.i(20813008863232L, 155069);
    boolean bool = this.fXM.getBoolean(paramInt);
    GMTrace.o(20813008863232L, 155069);
    return bool;
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(20813411516416L, 155072);
    double d = this.fXM.getDouble(paramInt);
    GMTrace.o(20813411516416L, 155072);
    return d;
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(20813814169600L, 155075);
    paramInt = this.fXM.getInt(paramInt);
    GMTrace.o(20813814169600L, 155075);
    return paramInt;
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(20814216822784L, 155078);
    long l = this.fXM.getLong(paramInt);
    GMTrace.o(20814216822784L, 155078);
    return l;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(20814619475968L, 155081);
    String str = this.fXM.getString(paramInt);
    GMTrace.o(20814619475968L, 155081);
    return str;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(20812471992320L, 155065);
    boolean bool = this.fXM.isNull(paramInt);
    GMTrace.o(20812471992320L, 155065);
    return bool;
  }
  
  public final int length()
  {
    GMTrace.i(20811666685952L, 155059);
    int i = this.fXM.length();
    GMTrace.o(20811666685952L, 155059);
    return i;
  }
  
  public final Object opt(int paramInt)
  {
    GMTrace.i(20812740427776L, 155067);
    Object localObject = this.fXM.opt(paramInt);
    GMTrace.o(20812740427776L, 155067);
    return localObject;
  }
  
  public final boolean optBoolean(int paramInt)
  {
    GMTrace.i(20813143080960L, 155070);
    boolean bool = this.fXM.optBoolean(paramInt);
    GMTrace.o(20813143080960L, 155070);
    return bool;
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20813277298688L, 155071);
    paramBoolean = this.fXM.optBoolean(paramInt, paramBoolean);
    GMTrace.o(20813277298688L, 155071);
    return paramBoolean;
  }
  
  public final double optDouble(int paramInt)
  {
    GMTrace.i(20813545734144L, 155073);
    double d = this.fXM.optDouble(paramInt);
    GMTrace.o(20813545734144L, 155073);
    return d;
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    GMTrace.i(20813679951872L, 155074);
    paramDouble = this.fXM.optDouble(paramInt, paramDouble);
    GMTrace.o(20813679951872L, 155074);
    return paramDouble;
  }
  
  public final int optInt(int paramInt)
  {
    GMTrace.i(20813948387328L, 155076);
    paramInt = this.fXM.optInt(paramInt);
    GMTrace.o(20813948387328L, 155076);
    return paramInt;
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    GMTrace.i(20814082605056L, 155077);
    paramInt1 = this.fXM.optInt(paramInt1, paramInt2);
    GMTrace.o(20814082605056L, 155077);
    return paramInt1;
  }
  
  public final long optLong(int paramInt)
  {
    GMTrace.i(20814351040512L, 155079);
    long l = this.fXM.optLong(paramInt);
    GMTrace.o(20814351040512L, 155079);
    return l;
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    GMTrace.i(20814485258240L, 155080);
    paramLong = this.fXM.optLong(paramInt, paramLong);
    GMTrace.o(20814485258240L, 155080);
    return paramLong;
  }
  
  public final String optString(int paramInt)
  {
    GMTrace.i(20814753693696L, 155082);
    String str = this.fXM.optString(paramInt);
    GMTrace.o(20814753693696L, 155082);
    return str;
  }
  
  public final String optString(int paramInt, String paramString)
  {
    GMTrace.i(20814887911424L, 155083);
    paramString = this.fXM.optString(paramInt, paramString);
    GMTrace.o(20814887911424L, 155083);
    return paramString;
  }
  
  public final Object remove(int paramInt)
  {
    GMTrace.i(20812874645504L, 155068);
    Object localObject = this.fXM.remove(paramInt);
    GMTrace.o(20812874645504L, 155068);
    return localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */