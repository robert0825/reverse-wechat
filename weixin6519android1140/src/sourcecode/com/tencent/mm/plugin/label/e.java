package com.tencent.mm.plugin.label;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ac;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.c;
import java.util.HashMap;

public class e
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private ac muK;
  private d muL;
  
  static
  {
    GMTrace.i(7323321892864L, 54563);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("CONTACT_LABEL_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(7321174409216L, 54547);
        String[] arrayOfString = ac.fTX;
        GMTrace.o(7321174409216L, 54547);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("CONTACT_LABEL_CACHE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(7318355836928L, 54526);
        String[] arrayOfString = ab.fTX;
        GMTrace.o(7318355836928L, 54526);
        return arrayOfString;
      }
    });
    GMTrace.o(7323321892864L, 54563);
  }
  
  public e()
  {
    GMTrace.i(7322248151040L, 54555);
    this.muL = new d();
    GMTrace.o(7322248151040L, 54555);
  }
  
  private static e aJN()
  {
    GMTrace.i(7322382368768L, 54556);
    e locale2 = (e)at.AK().gZ("plugin.label");
    e locale1 = locale2;
    if (locale2 == null)
    {
      locale1 = locale2;
      if (locale2 != null) {}
    }
    try
    {
      locale1 = new e();
      at.AK().a("plugin.label", locale1);
      GMTrace.o(7322382368768L, 54556);
      return locale1;
    }
    finally {}
  }
  
  public static ac aJO()
  {
    GMTrace.i(7323187675136L, 54562);
    h.xw().wG();
    if (aJN().muK == null)
    {
      localObject = aJN();
      at.AR();
      ((e)localObject).muK = new ac(c.yH());
    }
    Object localObject = aJN().muK;
    GMTrace.o(7323187675136L, 54562);
    return (ac)localObject;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7322785021952L, 54559);
    b localb = new b();
    com.tencent.mm.plugin.label.a.a.muM = localb;
    com.tencent.mm.aq.b.gLz = localb;
    com.tencent.mm.sdk.b.a.vgX.b(this.muL);
    GMTrace.o(7322785021952L, 54559);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7322919239680L, 54560);
    GMTrace.o(7322919239680L, 54560);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7322650804224L, 54558);
    GMTrace.o(7322650804224L, 54558);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7323053457408L, 54561);
    com.tencent.mm.plugin.label.a.a.muM = null;
    com.tencent.mm.sdk.b.a.vgX.c(this.muL);
    GMTrace.o(7323053457408L, 54561);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7322516586496L, 54557);
    HashMap localHashMap = fIv;
    GMTrace.o(7322516586496L, 54557);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */