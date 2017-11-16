package com.tencent.mm.u;

import com.b.a.e;
import com.b.a.e.a;
import com.b.a.h;
import com.tencent.gmtrace.GMTrace;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class k
  implements c
{
  private e fXR;
  
  public k()
  {
    GMTrace.i(20785360011264L, 154863);
    this.fXR = new e();
    GMTrace.o(20785360011264L, 154863);
  }
  
  k(e parame)
  {
    GMTrace.i(20785494228992L, 154864);
    e locale = parame;
    if (parame == null) {
      locale = new e();
    }
    this.fXR = locale;
    GMTrace.o(20785494228992L, 154864);
  }
  
  public k(String paramString)
  {
    GMTrace.i(20785628446720L, 154865);
    this.fXR = com.b.a.a.w(paramString).hu();
    GMTrace.o(20785628446720L, 154865);
  }
  
  public final c a(String paramString, double paramDouble)
  {
    GMTrace.i(20786031099904L, 154868);
    this.fXR.a(paramString, com.b.a.a.d(paramDouble));
    GMTrace.o(20786031099904L, 154868);
    return this;
  }
  
  public final c eA(String paramString)
  {
    GMTrace.i(20789252325376L, 154892);
    h localh = this.fXR.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    paramString = new k(localh.hu());
    GMTrace.o(20789252325376L, 154892);
    return paramString;
  }
  
  public final c eB(String paramString)
  {
    GMTrace.i(20789386543104L, 154893);
    paramString = this.fXR.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(20789386543104L, 154893);
      return null;
    }
    paramString = new k(paramString.hu());
    GMTrace.o(20789386543104L, 154893);
    return paramString;
  }
  
  public final String ex(String paramString)
  {
    GMTrace.i(20786702188544L, 154873);
    if (paramString == null) {
      throw new f("Names must be non-null");
    }
    GMTrace.o(20786702188544L, 154873);
    return paramString;
  }
  
  public final a ey(String paramString)
  {
    GMTrace.i(20788983889920L, 154890);
    h localh = this.fXR.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    paramString = new j(localh.hn());
    GMTrace.o(20788983889920L, 154890);
    return paramString;
  }
  
  public final a ez(String paramString)
  {
    GMTrace.i(20789118107648L, 154891);
    paramString = this.fXR.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(20789118107648L, 154891);
      return null;
    }
    paramString = new j(paramString.hn());
    GMTrace.o(20789118107648L, 154891);
    return paramString;
  }
  
  public final c f(String paramString, long paramLong)
  {
    GMTrace.i(20786299535360L, 154870);
    this.fXR.a(paramString, com.b.a.a.g(paramLong));
    GMTrace.o(20786299535360L, 154870);
    return this;
  }
  
  public final Object get(String paramString)
  {
    GMTrace.i(20787239059456L, 154877);
    paramString = opt(paramString);
    GMTrace.o(20787239059456L, 154877);
    return paramString;
  }
  
  public final boolean getBoolean(String paramString)
  {
    GMTrace.i(20787507494912L, 154879);
    h localh = this.fXR.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    if (localh.ho())
    {
      boolean bool = localh.hp();
      GMTrace.o(20787507494912L, 154879);
      return bool;
    }
    if (localh.hD())
    {
      String str = localh.toString();
      if ("true".equals(str))
      {
        GMTrace.o(20787507494912L, 154879);
        return true;
      }
      if ("false".equals(str))
      {
        GMTrace.o(20787507494912L, 154879);
        return false;
      }
    }
    throw new f(String.format("getBoolean by key : %s error, value : %s", new Object[] { paramString, localh }));
  }
  
  public final double getDouble(String paramString)
  {
    GMTrace.i(20787775930368L, 154881);
    h localh = this.fXR.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    try
    {
      double d;
      if (localh.hq())
      {
        d = localh.hs();
        GMTrace.o(20787775930368L, 154881);
        return d;
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.toString());
        GMTrace.o(20787775930368L, 154881);
        return d;
      }
    }
    catch (Exception localException)
    {
      throw new f(String.format("getDouble by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final int getInt(String paramString)
  {
    GMTrace.i(20788044365824L, 154883);
    h localh = this.fXR.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    try
    {
      boolean bool = localh.hq();
      int i;
      double d;
      if (bool) {
        try
        {
          i = localh.asInt();
          GMTrace.o(20788044365824L, 154883);
          return i;
        }
        catch (Exception localException1)
        {
          d = localh.hs();
          i = (int)d;
          GMTrace.o(20788044365824L, 154883);
          return i;
        }
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.toString());
        i = (int)d;
        GMTrace.o(20788044365824L, 154883);
        return i;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getInt by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final long getLong(String paramString)
  {
    GMTrace.i(20788312801280L, 154885);
    h localh = this.fXR.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
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
          GMTrace.o(20788312801280L, 154885);
          return l;
        }
        catch (Exception localException1)
        {
          d = localh.hs();
          l = d;
          GMTrace.o(20788312801280L, 154885);
          return l;
        }
      }
      if (localh.hD())
      {
        d = Double.parseDouble(localh.toString());
        l = d;
        GMTrace.o(20788312801280L, 154885);
        return l;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getLong by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final String getString(String paramString)
  {
    GMTrace.i(20788581236736L, 154887);
    h localh = this.fXR.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    if (localh.hD())
    {
      paramString = localh.hE();
      GMTrace.o(20788581236736L, 154887);
      return paramString;
    }
    paramString = localh.toString();
    GMTrace.o(20788581236736L, 154887);
    return paramString;
  }
  
  public final boolean has(String paramString)
  {
    GMTrace.i(20787104841728L, 154876);
    if (this.fXR.y(paramString) != null)
    {
      GMTrace.o(20787104841728L, 154876);
      return true;
    }
    GMTrace.o(20787104841728L, 154876);
    return false;
  }
  
  public final boolean isNull(String paramString)
  {
    GMTrace.i(20786970624000L, 154875);
    if (this.fXR.y(paramString) == null)
    {
      GMTrace.o(20786970624000L, 154875);
      return true;
    }
    GMTrace.o(20786970624000L, 154875);
    return false;
  }
  
  public final c k(String paramString, Object paramObject)
  {
    GMTrace.i(20786433753088L, 154871);
    i.a(this.fXR, paramString, paramObject);
    GMTrace.o(20786433753088L, 154871);
    return this;
  }
  
  public final c k(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20785896882176L, 154867);
    this.fXR.a(paramString, com.b.a.a.ab(paramBoolean));
    GMTrace.o(20785896882176L, 154867);
    return this;
  }
  
  public final Iterator<String> keys()
  {
    GMTrace.i(20789520760832L, 154894);
    Iterator localIterator = Collections.unmodifiableList(this.fXR.aaD).iterator();
    GMTrace.o(20789520760832L, 154894);
    return localIterator;
  }
  
  public final c l(String paramString, Object paramObject)
  {
    GMTrace.i(20786567970816L, 154872);
    i.a(this.fXR, paramString, paramObject);
    GMTrace.o(20786567970816L, 154872);
    return this;
  }
  
  public final int length()
  {
    GMTrace.i(20785762664448L, 154866);
    int i = this.fXR.aaD.size();
    GMTrace.o(20785762664448L, 154866);
    return i;
  }
  
  public final Object opt(String paramString)
  {
    GMTrace.i(20787373277184L, 154878);
    paramString = this.fXR.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(20787373277184L, 154878);
      return null;
    }
    if (paramString.hq())
    {
      paramString = paramString.toString();
      GMTrace.o(20787373277184L, 154878);
      return paramString;
    }
    if (paramString.ho())
    {
      boolean bool = paramString.hp();
      GMTrace.o(20787373277184L, 154878);
      return Boolean.valueOf(bool);
    }
    if (paramString.isArray())
    {
      paramString = new j(paramString.hn());
      GMTrace.o(20787373277184L, 154878);
      return paramString;
    }
    if (paramString.ht())
    {
      paramString = new k(paramString.hu());
      GMTrace.o(20787373277184L, 154878);
      return paramString;
    }
    if (paramString.hD())
    {
      paramString = paramString.hE();
      GMTrace.o(20787373277184L, 154878);
      return paramString;
    }
    GMTrace.o(20787373277184L, 154878);
    return null;
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20787641712640L, 154880);
    paramString = this.fXR.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(20787641712640L, 154880);
      return paramBoolean;
    }
    if (paramString.ho())
    {
      paramBoolean = paramString.hp();
      GMTrace.o(20787641712640L, 154880);
      return paramBoolean;
    }
    if (paramString.hD())
    {
      paramString = paramString.toString();
      if ("true".equals(paramString))
      {
        GMTrace.o(20787641712640L, 154880);
        return true;
      }
      if ("false".equals(paramString))
      {
        GMTrace.o(20787641712640L, 154880);
        return false;
      }
    }
    GMTrace.o(20787641712640L, 154880);
    return paramBoolean;
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    GMTrace.i(20787910148096L, 154882);
    paramString = this.fXR.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(20787910148096L, 154882);
      return paramDouble;
    }
    try
    {
      double d;
      if (paramString.hq())
      {
        d = paramString.hs();
        GMTrace.o(20787910148096L, 154882);
        return d;
      }
      if (paramString.hD())
      {
        d = Double.parseDouble(paramString.toString());
        GMTrace.o(20787910148096L, 154882);
        return d;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(20787910148096L, 154882);
    }
    return paramDouble;
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    GMTrace.i(20788178583552L, 154884);
    paramString = this.fXR.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(20788178583552L, 154884);
      return paramInt;
    }
    try
    {
      boolean bool = paramString.hq();
      double d;
      if (bool) {
        try
        {
          int i = paramString.asInt();
          GMTrace.o(20788178583552L, 154884);
          return i;
        }
        catch (Exception localException)
        {
          d = paramString.hs();
          paramInt = (int)d;
          GMTrace.o(20788178583552L, 154884);
          return paramInt;
        }
      }
      if (paramString.hD())
      {
        d = Double.parseDouble(paramString.toString());
        paramInt = (int)d;
        GMTrace.o(20788178583552L, 154884);
        return paramInt;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(20788178583552L, 154884);
    }
    return paramInt;
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    GMTrace.i(20788447019008L, 154886);
    paramString = this.fXR.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(20788447019008L, 154886);
      return paramLong;
    }
    try
    {
      boolean bool = paramString.hq();
      double d;
      if (bool) {
        try
        {
          long l = paramString.hr();
          GMTrace.o(20788447019008L, 154886);
          return l;
        }
        catch (Exception localException)
        {
          d = paramString.hs();
          paramLong = d;
          GMTrace.o(20788447019008L, 154886);
          return paramLong;
        }
      }
      if (paramString.hD())
      {
        d = Double.parseDouble(paramString.toString());
        paramLong = d;
        GMTrace.o(20788447019008L, 154886);
        return paramLong;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(20788447019008L, 154886);
    }
    return paramLong;
  }
  
  public final String optString(String paramString)
  {
    GMTrace.i(20788715454464L, 154888);
    paramString = optString(paramString, null);
    GMTrace.o(20788715454464L, 154888);
    return paramString;
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    GMTrace.i(20788849672192L, 154889);
    paramString1 = this.fXR.y(paramString1);
    if (paramString1 == null)
    {
      GMTrace.o(20788849672192L, 154889);
      return null;
    }
    if (paramString1.hD())
    {
      paramString1 = paramString1.hE();
      GMTrace.o(20788849672192L, 154889);
      return paramString1;
    }
    paramString1 = paramString1.toString();
    GMTrace.o(20788849672192L, 154889);
    return paramString1;
  }
  
  public final Object remove(String paramString)
  {
    GMTrace.i(20786836406272L, 154874);
    e locale = this.fXR;
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    int i = locale.indexOf(paramString);
    if (i != -1)
    {
      locale.aaE.remove(i);
      locale.aaD.remove(i);
      locale.aaw.remove(i);
    }
    if (locale == null)
    {
      GMTrace.o(20786836406272L, 154874);
      return null;
    }
    if (locale.hq())
    {
      paramString = locale.toString();
      GMTrace.o(20786836406272L, 154874);
      return paramString;
    }
    if (locale.ho())
    {
      boolean bool = locale.hp();
      GMTrace.o(20786836406272L, 154874);
      return Boolean.valueOf(bool);
    }
    if (locale.isArray())
    {
      paramString = new j(locale.hn());
      GMTrace.o(20786836406272L, 154874);
      return paramString;
    }
    if (locale.ht())
    {
      paramString = new k(locale.hu());
      GMTrace.o(20786836406272L, 154874);
      return paramString;
    }
    if (locale.hD())
    {
      paramString = locale.hE();
      GMTrace.o(20786836406272L, 154874);
      return paramString;
    }
    GMTrace.o(20786836406272L, 154874);
    return null;
  }
  
  public final c s(String paramString, int paramInt)
  {
    GMTrace.i(20786165317632L, 154869);
    this.fXR.a(paramString, com.b.a.a.bL(paramInt));
    GMTrace.o(20786165317632L, 154869);
    return this;
  }
  
  public final String toString()
  {
    GMTrace.i(20789654978560L, 154895);
    String str = this.fXR.toString();
    GMTrace.o(20789654978560L, 154895);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */