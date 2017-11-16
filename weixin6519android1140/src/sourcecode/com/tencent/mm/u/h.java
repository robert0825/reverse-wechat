package com.tencent.mm.u;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import junit.framework.Assert;
import org.json.JSONObject;

public final class h
  extends JSONObject
  implements c
{
  private final c fXP;
  
  public h()
  {
    GMTrace.i(20798916001792L, 154964);
    this.fXP = g.wt();
    GMTrace.o(20798916001792L, 154964);
  }
  
  public h(c paramc)
  {
    GMTrace.i(20799050219520L, 154965);
    Assert.assertNotNull(paramc);
    this.fXP = paramc;
    GMTrace.o(20799050219520L, 154965);
  }
  
  public h(String paramString)
  {
    GMTrace.i(20799184437248L, 154966);
    this.fXP = g.eD(paramString);
    GMTrace.o(20799184437248L, 154966);
  }
  
  private h b(String paramString, double paramDouble)
  {
    GMTrace.i(20799587090432L, 154969);
    this.fXP.a(ex(paramString), paramDouble);
    GMTrace.o(20799587090432L, 154969);
    return this;
  }
  
  private e eE(String paramString)
  {
    GMTrace.i(20803076751360L, 154995);
    paramString = this.fXP.ey(paramString);
    if (paramString == null)
    {
      GMTrace.o(20803076751360L, 154995);
      return null;
    }
    paramString = new e(paramString);
    GMTrace.o(20803076751360L, 154995);
    return paramString;
  }
  
  private e eF(String paramString)
  {
    GMTrace.i(20803210969088L, 154996);
    paramString = this.fXP.ez(paramString);
    if (paramString == null)
    {
      GMTrace.o(20803210969088L, 154996);
      return null;
    }
    paramString = new e(paramString);
    GMTrace.o(20803210969088L, 154996);
    return paramString;
  }
  
  private h eG(String paramString)
  {
    GMTrace.i(20803345186816L, 154997);
    paramString = this.fXP.eA(paramString);
    if (paramString == null)
    {
      GMTrace.o(20803345186816L, 154997);
      return null;
    }
    paramString = new h(paramString);
    GMTrace.o(20803345186816L, 154997);
    return paramString;
  }
  
  private h eH(String paramString)
  {
    GMTrace.i(20803479404544L, 154998);
    paramString = this.fXP.eB(paramString);
    if (paramString == null)
    {
      GMTrace.o(20803479404544L, 154998);
      return null;
    }
    paramString = new h(paramString);
    GMTrace.o(20803479404544L, 154998);
    return paramString;
  }
  
  private h g(String paramString, long paramLong)
  {
    GMTrace.i(20799855525888L, 154971);
    this.fXP.f(ex(paramString), paramLong);
    GMTrace.o(20799855525888L, 154971);
    return this;
  }
  
  private h l(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20799452872704L, 154968);
    this.fXP.k(paramString, paramBoolean);
    GMTrace.o(20799452872704L, 154968);
    return this;
  }
  
  private h m(String paramString, Object paramObject)
  {
    GMTrace.i(20799989743616L, 154972);
    this.fXP.k(paramString, paramObject);
    GMTrace.o(20799989743616L, 154972);
    return this;
  }
  
  private h n(String paramString, Object paramObject)
  {
    GMTrace.i(20800123961344L, 154973);
    this.fXP.l(paramString, paramObject);
    GMTrace.o(20800123961344L, 154973);
    return this;
  }
  
  private h t(String paramString, int paramInt)
  {
    GMTrace.i(20799721308160L, 154970);
    this.fXP.s(ex(paramString), paramInt);
    GMTrace.o(20799721308160L, 154970);
    return this;
  }
  
  public final String ex(String paramString)
  {
    GMTrace.i(20800258179072L, 154974);
    paramString = this.fXP.ex(paramString);
    GMTrace.o(20800258179072L, 154974);
    return paramString;
  }
  
  public final Object get(String paramString)
  {
    GMTrace.i(20800795049984L, 154978);
    paramString = this.fXP.get(paramString);
    GMTrace.o(20800795049984L, 154978);
    return paramString;
  }
  
  public final boolean getBoolean(String paramString)
  {
    GMTrace.i(20801063485440L, 154980);
    boolean bool = this.fXP.getBoolean(paramString);
    GMTrace.o(20801063485440L, 154980);
    return bool;
  }
  
  public final double getDouble(String paramString)
  {
    GMTrace.i(20801466138624L, 154983);
    double d = this.fXP.getDouble(paramString);
    GMTrace.o(20801466138624L, 154983);
    return d;
  }
  
  public final int getInt(String paramString)
  {
    GMTrace.i(20801868791808L, 154986);
    int i = this.fXP.getInt(paramString);
    GMTrace.o(20801868791808L, 154986);
    return i;
  }
  
  public final long getLong(String paramString)
  {
    GMTrace.i(20802271444992L, 154989);
    long l = this.fXP.getLong(paramString);
    GMTrace.o(20802271444992L, 154989);
    return l;
  }
  
  public final String getString(String paramString)
  {
    GMTrace.i(20802674098176L, 154992);
    paramString = this.fXP.getString(paramString);
    GMTrace.o(20802674098176L, 154992);
    return paramString;
  }
  
  public final boolean has(String paramString)
  {
    GMTrace.i(20800660832256L, 154977);
    boolean bool = this.fXP.has(paramString);
    GMTrace.o(20800660832256L, 154977);
    return bool;
  }
  
  public final boolean isNull(String paramString)
  {
    GMTrace.i(20800526614528L, 154976);
    boolean bool = this.fXP.isNull(paramString);
    GMTrace.o(20800526614528L, 154976);
    return bool;
  }
  
  public final Iterator<String> keys()
  {
    GMTrace.i(20803613622272L, 154999);
    Iterator localIterator = this.fXP.keys();
    GMTrace.o(20803613622272L, 154999);
    return localIterator;
  }
  
  public final int length()
  {
    GMTrace.i(20799318654976L, 154967);
    int i = this.fXP.length();
    GMTrace.o(20799318654976L, 154967);
    return i;
  }
  
  public final Object opt(String paramString)
  {
    GMTrace.i(20800929267712L, 154979);
    paramString = this.fXP.opt(paramString);
    GMTrace.o(20800929267712L, 154979);
    return paramString;
  }
  
  public final boolean optBoolean(String paramString)
  {
    GMTrace.i(20801197703168L, 154981);
    boolean bool = this.fXP.optBoolean(paramString, false);
    GMTrace.o(20801197703168L, 154981);
    return bool;
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20801331920896L, 154982);
    paramBoolean = this.fXP.optBoolean(paramString, paramBoolean);
    GMTrace.o(20801331920896L, 154982);
    return paramBoolean;
  }
  
  public final double optDouble(String paramString)
  {
    GMTrace.i(20801600356352L, 154984);
    double d = this.fXP.optDouble(paramString, NaN.0D);
    GMTrace.o(20801600356352L, 154984);
    return d;
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    GMTrace.i(20801734574080L, 154985);
    paramDouble = this.fXP.optDouble(paramString, paramDouble);
    GMTrace.o(20801734574080L, 154985);
    return paramDouble;
  }
  
  public final int optInt(String paramString)
  {
    GMTrace.i(20802003009536L, 154987);
    int i = this.fXP.optInt(paramString, 0);
    GMTrace.o(20802003009536L, 154987);
    return i;
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    GMTrace.i(20802137227264L, 154988);
    paramInt = this.fXP.optInt(paramString, paramInt);
    GMTrace.o(20802137227264L, 154988);
    return paramInt;
  }
  
  public final long optLong(String paramString)
  {
    GMTrace.i(20802405662720L, 154990);
    long l = this.fXP.optLong(paramString, 0L);
    GMTrace.o(20802405662720L, 154990);
    return l;
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    GMTrace.i(20802539880448L, 154991);
    paramLong = this.fXP.optLong(paramString, paramLong);
    GMTrace.o(20802539880448L, 154991);
    return paramLong;
  }
  
  public final String optString(String paramString)
  {
    GMTrace.i(20802808315904L, 154993);
    paramString = this.fXP.optString(paramString, "");
    GMTrace.o(20802808315904L, 154993);
    return paramString;
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    GMTrace.i(20802942533632L, 154994);
    paramString1 = this.fXP.optString(paramString1);
    GMTrace.o(20802942533632L, 154994);
    return paramString1;
  }
  
  public final Object remove(String paramString)
  {
    GMTrace.i(20800392396800L, 154975);
    paramString = this.fXP.remove(paramString);
    GMTrace.o(20800392396800L, 154975);
    return paramString;
  }
  
  public final String toString()
  {
    GMTrace.i(20803747840000L, 155000);
    String str = this.fXP.toString();
    GMTrace.o(20803747840000L, 155000);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */