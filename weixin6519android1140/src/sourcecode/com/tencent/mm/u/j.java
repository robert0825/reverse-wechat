package com.tencent.mm.u;

import com.b.a.b;
import com.b.a.h;
import com.tencent.gmtrace.GMTrace;
import java.util.List;
import junit.framework.Assert;

public final class j
  implements a
{
  private b fXQ;
  
  public j()
  {
    GMTrace.i(20806834847744L, 155023);
    this.fXQ = new b();
    GMTrace.o(20806834847744L, 155023);
  }
  
  j(b paramb)
  {
    GMTrace.i(20806969065472L, 155024);
    Assert.assertNotNull(paramb);
    this.fXQ = paramb;
    GMTrace.o(20806969065472L, 155024);
  }
  
  public final a M(long paramLong)
  {
    GMTrace.i(20807640154112L, 155029);
    this.fXQ.h(paramLong);
    GMTrace.o(20807640154112L, 155029);
    return this;
  }
  
  public final a aq(Object paramObject)
  {
    GMTrace.i(20807774371840L, 155030);
    i.a(this.fXQ, paramObject);
    GMTrace.o(20807774371840L, 155030);
    return this;
  }
  
  public final a ba(boolean paramBoolean)
  {
    GMTrace.i(20807237500928L, 155026);
    this.fXQ.ac(paramBoolean);
    GMTrace.o(20807237500928L, 155026);
    return this;
  }
  
  public final a eT(int paramInt)
  {
    GMTrace.i(20807505936384L, 155028);
    this.fXQ.bM(paramInt);
    GMTrace.o(20807505936384L, 155028);
    return this;
  }
  
  public final a eU(int paramInt)
  {
    GMTrace.i(20810458726400L, 155050);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    Object localObject = this.fXQ.bN(paramInt);
    if (localObject == null) {
      throw new f(String.format("getJSONArray(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    localObject = new j(((h)localObject).hn());
    GMTrace.o(20810458726400L, 155050);
    return (a)localObject;
  }
  
  public final a eV(int paramInt)
  {
    GMTrace.i(20810592944128L, 155051);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(20810592944128L, 155051);
      return null;
    }
    Object localObject = this.fXQ.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20810592944128L, 155051);
      return null;
    }
    localObject = new j(((h)localObject).hn());
    GMTrace.o(20810592944128L, 155051);
    return (a)localObject;
  }
  
  public final c eW(int paramInt)
  {
    GMTrace.i(20810727161856L, 155052);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    Object localObject = this.fXQ.bN(paramInt);
    if (localObject == null) {
      throw new f(String.format("getJSONObject(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    localObject = new k(((h)localObject).hu());
    GMTrace.o(20810727161856L, 155052);
    return (c)localObject;
  }
  
  public final c eX(int paramInt)
  {
    GMTrace.i(20810861379584L, 155053);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(20810861379584L, 155053);
      return null;
    }
    Object localObject = this.fXQ.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20810861379584L, 155053);
      return null;
    }
    localObject = new k(((h)localObject).hu());
    GMTrace.o(20810861379584L, 155053);
    return (c)localObject;
  }
  
  public final a g(double paramDouble)
  {
    GMTrace.i(20807371718656L, 155027);
    this.fXQ.e(paramDouble);
    GMTrace.o(20807371718656L, 155027);
    return this;
  }
  
  public final Object get(int paramInt)
  {
    GMTrace.i(20808042807296L, 155032);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    Object localObject = this.fXQ.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20808042807296L, 155032);
      return null;
    }
    if (((h)localObject).hq())
    {
      localObject = ((h)localObject).toString();
      GMTrace.o(20808042807296L, 155032);
      return localObject;
    }
    if (((h)localObject).ho())
    {
      boolean bool = ((h)localObject).hp();
      GMTrace.o(20808042807296L, 155032);
      return Boolean.valueOf(bool);
    }
    if (((h)localObject).isArray())
    {
      localObject = new j(((h)localObject).hn());
      GMTrace.o(20808042807296L, 155032);
      return localObject;
    }
    if (((h)localObject).ht())
    {
      localObject = new k(((h)localObject).hu());
      GMTrace.o(20808042807296L, 155032);
      return localObject;
    }
    if (((h)localObject).hD())
    {
      localObject = ((h)localObject).hE();
      GMTrace.o(20808042807296L, 155032);
      return localObject;
    }
    GMTrace.o(20808042807296L, 155032);
    return null;
  }
  
  public final boolean getBoolean(int paramInt)
  {
    GMTrace.i(20808445460480L, 155035);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.fXQ.bN(paramInt);
    if (localh == null) {
      throw new f(String.format("getBoolean(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    if (localh.ho())
    {
      boolean bool = localh.hp();
      GMTrace.o(20808445460480L, 155035);
      return bool;
    }
    if (localh.hD())
    {
      String str = localh.hE();
      if ("true".equals(str))
      {
        GMTrace.o(20808445460480L, 155035);
        return true;
      }
      if ("false".equals(str))
      {
        GMTrace.o(20808445460480L, 155035);
        return false;
      }
    }
    throw new f(String.format("getBoolean(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(20808848113664L, 155038);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.fXQ.bN(paramInt);
    if (localh == null) {
      throw new f(String.format("getDouble(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    try
    {
      double d;
      if (localh.hq())
      {
        d = localh.hs();
        GMTrace.o(20808848113664L, 155038);
        return d;
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.hE());
        GMTrace.o(20808848113664L, 155038);
        return d;
      }
    }
    catch (Exception localException)
    {
      throw new f(String.format("getDouble(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(20809250766848L, 155041);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.fXQ.bN(paramInt);
    if (localh == null) {
      throw new f(String.format("getInteger(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    try
    {
      boolean bool = localh.hq();
      double d;
      if (bool) {
        try
        {
          i = localh.asInt();
          GMTrace.o(20809250766848L, 155041);
          return i;
        }
        catch (Exception localException1)
        {
          d = localh.hs();
          paramInt = (int)d;
          GMTrace.o(20809250766848L, 155041);
          return paramInt;
        }
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.hE());
        paramInt = (int)d;
        GMTrace.o(20809250766848L, 155041);
        return paramInt;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getInt(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(20809653420032L, 155044);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.fXQ.bN(paramInt);
    if (localh == null) {
      throw new f(String.format("getLong(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    try
    {
      boolean bool = localh.hq();
      long l;
      double d;
      if (bool) {
        try
        {
          l = localh.hr();
          GMTrace.o(20809653420032L, 155044);
          return l;
        }
        catch (Exception localException1)
        {
          d = localh.hs();
          l = d;
          GMTrace.o(20809653420032L, 155044);
          return l;
        }
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.hE());
        l = d;
        GMTrace.o(20809653420032L, 155044);
        return l;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getLong(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(20810056073216L, 155047);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    Object localObject = this.fXQ.bN(paramInt);
    if (localObject == null) {
      throw new f(String.format("getString(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    if (((h)localObject).hD())
    {
      localObject = ((h)localObject).hE();
      GMTrace.o(20810056073216L, 155047);
      return (String)localObject;
    }
    localObject = ((h)localObject).toString();
    GMTrace.o(20810056073216L, 155047);
    return (String)localObject;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(20807908589568L, 155031);
    if ((paramInt < 0) || (paramInt >= length()) || (this.fXQ.bN(paramInt) == null))
    {
      GMTrace.o(20807908589568L, 155031);
      return true;
    }
    GMTrace.o(20807908589568L, 155031);
    return false;
  }
  
  public final int length()
  {
    GMTrace.i(20807103283200L, 155025);
    int i = this.fXQ.aaw.size();
    GMTrace.o(20807103283200L, 155025);
    return i;
  }
  
  public final Object opt(int paramInt)
  {
    GMTrace.i(20808177025024L, 155033);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(20808177025024L, 155033);
      return null;
    }
    Object localObject = this.fXQ.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20808177025024L, 155033);
      return null;
    }
    if (((h)localObject).hq())
    {
      localObject = ((h)localObject).toString();
      GMTrace.o(20808177025024L, 155033);
      return localObject;
    }
    if (((h)localObject).ho())
    {
      boolean bool = ((h)localObject).hp();
      GMTrace.o(20808177025024L, 155033);
      return Boolean.valueOf(bool);
    }
    if (((h)localObject).isArray())
    {
      localObject = new j(((h)localObject).hn());
      GMTrace.o(20808177025024L, 155033);
      return localObject;
    }
    if (((h)localObject).ht())
    {
      localObject = new k(((h)localObject).hu());
      GMTrace.o(20808177025024L, 155033);
      return localObject;
    }
    if (((h)localObject).hD())
    {
      localObject = ((h)localObject).hE();
      GMTrace.o(20808177025024L, 155033);
      return localObject;
    }
    GMTrace.o(20808177025024L, 155033);
    return null;
  }
  
  public final boolean optBoolean(int paramInt)
  {
    GMTrace.i(20808579678208L, 155036);
    boolean bool = optBoolean(paramInt, false);
    GMTrace.o(20808579678208L, 155036);
    return bool;
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20808713895936L, 155037);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(20808713895936L, 155037);
      return paramBoolean;
    }
    Object localObject = this.fXQ.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20808713895936L, 155037);
      return paramBoolean;
    }
    if (((h)localObject).ho())
    {
      paramBoolean = ((h)localObject).hp();
      GMTrace.o(20808713895936L, 155037);
      return paramBoolean;
    }
    if (((h)localObject).hD())
    {
      localObject = ((h)localObject).hE();
      if ("true".equals(localObject))
      {
        GMTrace.o(20808713895936L, 155037);
        return true;
      }
      if ("false".equals(localObject))
      {
        GMTrace.o(20808713895936L, 155037);
        return false;
      }
    }
    GMTrace.o(20808713895936L, 155037);
    return paramBoolean;
  }
  
  public final double optDouble(int paramInt)
  {
    GMTrace.i(20808982331392L, 155039);
    double d = optDouble(paramInt, 0.0D);
    GMTrace.o(20808982331392L, 155039);
    return d;
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    GMTrace.i(20809116549120L, 155040);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(20809116549120L, 155040);
      return paramDouble;
    }
    h localh = this.fXQ.bN(paramInt);
    if (localh == null)
    {
      GMTrace.o(20809116549120L, 155040);
      return paramDouble;
    }
    try
    {
      double d;
      if (localh.hq())
      {
        d = localh.hs();
        GMTrace.o(20809116549120L, 155040);
        return d;
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.hE());
        GMTrace.o(20809116549120L, 155040);
        return d;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(20809116549120L, 155040);
    }
    return paramDouble;
  }
  
  public final int optInt(int paramInt)
  {
    GMTrace.i(20809384984576L, 155042);
    paramInt = optInt(paramInt, 0);
    GMTrace.o(20809384984576L, 155042);
    return paramInt;
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    GMTrace.i(20809519202304L, 155043);
    int i = length();
    if ((paramInt1 < 0) || (paramInt1 >= i))
    {
      GMTrace.o(20809519202304L, 155043);
      return paramInt2;
    }
    h localh = this.fXQ.bN(paramInt1);
    if (localh == null)
    {
      GMTrace.o(20809519202304L, 155043);
      return paramInt2;
    }
    try
    {
      boolean bool = localh.hq();
      double d;
      if (bool) {
        try
        {
          paramInt1 = localh.asInt();
          GMTrace.o(20809519202304L, 155043);
          return paramInt1;
        }
        catch (Exception localException2)
        {
          d = localh.hs();
          paramInt1 = (int)d;
          GMTrace.o(20809519202304L, 155043);
          return paramInt1;
        }
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.hE());
        paramInt1 = (int)d;
        GMTrace.o(20809519202304L, 155043);
        return paramInt1;
      }
    }
    catch (Exception localException1)
    {
      GMTrace.o(20809519202304L, 155043);
    }
    return paramInt2;
  }
  
  public final long optLong(int paramInt)
  {
    GMTrace.i(20809787637760L, 155045);
    long l = optLong(paramInt, 0L);
    GMTrace.o(20809787637760L, 155045);
    return l;
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    GMTrace.i(20809921855488L, 155046);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(20809921855488L, 155046);
      return paramLong;
    }
    h localh = this.fXQ.bN(paramInt);
    if (localh == null)
    {
      GMTrace.o(20809921855488L, 155046);
      return paramLong;
    }
    try
    {
      boolean bool = localh.hq();
      double d;
      if (bool) {
        try
        {
          long l = localh.hr();
          GMTrace.o(20809921855488L, 155046);
          return l;
        }
        catch (Exception localException2)
        {
          d = localh.hs();
          paramLong = d;
          GMTrace.o(20809921855488L, 155046);
          return paramLong;
        }
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.hE());
        paramLong = d;
        GMTrace.o(20809921855488L, 155046);
        return paramLong;
      }
    }
    catch (Exception localException1)
    {
      GMTrace.o(20809921855488L, 155046);
    }
    return paramLong;
  }
  
  public final String optString(int paramInt)
  {
    GMTrace.i(20810190290944L, 155048);
    String str = optString(paramInt, null);
    GMTrace.o(20810190290944L, 155048);
    return str;
  }
  
  public final String optString(int paramInt, String paramString)
  {
    GMTrace.i(20810324508672L, 155049);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(20810324508672L, 155049);
      return paramString;
    }
    h localh = this.fXQ.bN(paramInt);
    if (localh == null)
    {
      GMTrace.o(20810324508672L, 155049);
      return paramString;
    }
    if (localh.hD())
    {
      paramString = localh.hE();
      GMTrace.o(20810324508672L, 155049);
      return paramString;
    }
    paramString = localh.toString();
    GMTrace.o(20810324508672L, 155049);
    return paramString;
  }
  
  public final Object remove(int paramInt)
  {
    GMTrace.i(20808311242752L, 155034);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(20808311242752L, 155034);
      return null;
    }
    Object localObject = this.fXQ;
    ((b)localObject).aaw.remove(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20808311242752L, 155034);
      return null;
    }
    if (((h)localObject).hq())
    {
      localObject = ((h)localObject).toString();
      GMTrace.o(20808311242752L, 155034);
      return localObject;
    }
    if (((h)localObject).ho())
    {
      boolean bool = ((h)localObject).hp();
      GMTrace.o(20808311242752L, 155034);
      return Boolean.valueOf(bool);
    }
    if (((h)localObject).isArray())
    {
      localObject = new j(((h)localObject).hn());
      GMTrace.o(20808311242752L, 155034);
      return localObject;
    }
    if (((h)localObject).ht())
    {
      localObject = new k(((h)localObject).hu());
      GMTrace.o(20808311242752L, 155034);
      return localObject;
    }
    if (((h)localObject).hD())
    {
      localObject = ((h)localObject).hE();
      GMTrace.o(20808311242752L, 155034);
      return localObject;
    }
    GMTrace.o(20808311242752L, 155034);
    return null;
  }
  
  public final String toString()
  {
    GMTrace.i(20810995597312L, 155054);
    String str = this.fXQ.toString();
    GMTrace.o(20810995597312L, 155054);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */