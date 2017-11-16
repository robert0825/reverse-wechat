package com.tencent.mm.plugin.subapp.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class b
  implements ak.c
{
  public b()
  {
    GMTrace.i(5760759103488L, 42921);
    GMTrace.o(5760759103488L, 42921);
  }
  
  private String L(int paramInt, boolean paramBoolean)
  {
    int k = 0;
    GMTrace.i(5761161756672L, 42924);
    at.AR();
    if (!c.isSDCardAvailable())
    {
      GMTrace.o(5761161756672L, 42924);
      return null;
    }
    int i;
    if (paramInt == 0)
    {
      i = -1;
      if (i != -1) {
        break label109;
      }
      paramInt = k;
      label45:
      if (paramInt != 0) {
        break label116;
      }
    }
    label109:
    label116:
    for (String str = null;; str = m(paramInt, paramBoolean))
    {
      if (!com.tencent.mm.a.e.aZ(str)) {
        break label127;
      }
      GMTrace.o(5761161756672L, 42924);
      return str;
      i = 0;
      int j = paramInt;
      paramInt = i;
      for (;;)
      {
        i = paramInt;
        if (paramInt >= 32) {
          break;
        }
        j = j >> 1 & 0x7FFFFFFF;
        i = paramInt;
        if (j == 0) {
          break;
        }
        paramInt += 1;
      }
      paramInt = 1 << i;
      break label45;
    }
    label127:
    AC();
    GMTrace.o(5761161756672L, 42924);
    return null;
  }
  
  public final void AC()
  {
    GMTrace.i(5761295974400L, 42925);
    at.AR();
    if (!c.isSDCardAvailable())
    {
      GMTrace.o(5761295974400L, 42925);
      return;
    }
    at.AR();
    long l1 = bg.a((Long)c.xh().get(66051, null), 0L);
    long l2 = bg.Pv();
    if (432000000L > l2 - l1)
    {
      GMTrace.o(5761295974400L, 42925);
      return;
    }
    at.AR();
    c.xh().set(66051, Long.valueOf(l2));
    new a();
    GMTrace.o(5761295974400L, 42925);
  }
  
  public final String fr(int paramInt)
  {
    GMTrace.i(5760893321216L, 42922);
    String str = L(paramInt, true);
    GMTrace.o(5760893321216L, 42922);
    return str;
  }
  
  public final String fs(int paramInt)
  {
    GMTrace.i(5761027538944L, 42923);
    String str = L(paramInt, false);
    GMTrace.o(5761027538944L, 42923);
    return str;
  }
  
  public final boolean ft(int paramInt)
  {
    GMTrace.i(5761430192128L, 42926);
    if (paramInt == 0)
    {
      GMTrace.o(5761430192128L, 42926);
      return false;
    }
    int i = 0;
    while (i < 32)
    {
      if ((!com.tencent.mm.a.e.aZ(m(1 << i & paramInt, false))) || (!com.tencent.mm.a.e.aZ(m(1 << i & paramInt, true))))
      {
        GMTrace.o(5761430192128L, 42926);
        return false;
      }
      i += 1;
    }
    GMTrace.o(5761430192128L, 42926);
    return true;
  }
  
  public final String m(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(5761564409856L, 42927);
    if (paramInt == 0)
    {
      GMTrace.o(5761564409856L, 42927);
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder().append(com.tencent.mm.compatible.util.e.fSa).append("vuserpic_").append(Integer.toHexString(paramInt));
    if (paramBoolean) {}
    for (String str = "_HD";; str = "")
    {
      str = str + ".png";
      GMTrace.o(5761564409856L, 42927);
      return str;
    }
  }
  
  private static final class a
    implements com.tencent.mm.ad.e
  {
    public a()
    {
      GMTrace.i(5758745837568L, 42906);
      at.wS().a(167, this);
      a locala = new a();
      at.wS().a(locala, 0);
      GMTrace.o(5758745837568L, 42906);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(5758880055296L, 42907);
      at.wS().b(167, this);
      GMTrace.o(5758880055296L, 42907);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */