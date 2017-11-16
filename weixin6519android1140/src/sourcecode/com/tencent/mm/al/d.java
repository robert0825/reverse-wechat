package com.tencent.mm.al;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.util.HashMap;

public class d
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private b gFP;
  private c gFQ;
  
  static
  {
    GMTrace.i(4091090567168L, 30481);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("GETCONTACTINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4089614172160L, 30470);
        String[] arrayOfString = b.fTX;
        GMTrace.o(4089614172160L, 30470);
        return arrayOfString;
      }
    });
    GMTrace.o(4091090567168L, 30481);
  }
  
  public d()
  {
    GMTrace.i(4090016825344L, 30473);
    GMTrace.o(4090016825344L, 30473);
  }
  
  private static d Iy()
  {
    GMTrace.i(4090151043072L, 30474);
    com.tencent.mm.plugin.subapp.a locala = (com.tencent.mm.plugin.subapp.a)at.AK().gZ("plugin.subapp");
    d locald2 = (d)locala.Jv(d.class.getName());
    d locald1 = locald2;
    if (locald2 == null)
    {
      locald1 = new d();
      locala.b(d.class.getName(), locald1);
    }
    GMTrace.o(4090151043072L, 30474);
    return locald1;
  }
  
  public static b Iz()
  {
    GMTrace.i(4090285260800L, 30475);
    com.tencent.mm.kernel.h.xw().wG();
    if (Iy().gFP == null)
    {
      localObject = Iy();
      at.AR();
      ((d)localObject).gFP = new b(com.tencent.mm.y.c.yH());
    }
    Object localObject = Iy().gFP;
    GMTrace.o(4090285260800L, 30475);
    return (b)localObject;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4090822131712L, 30479);
    if (this.gFQ == null) {
      this.gFQ = new c();
    }
    com.tencent.mm.y.ak.a.gmX = this.gFQ;
    w.d("SubCoreGetContact", "summergetcontac onAccountPostReset setGetContact[%s]", new Object[] { this.gFQ });
    com.tencent.mm.kernel.h.a(com.tencent.mm.pluginsdk.f.class, new com.tencent.mm.pluginsdk.ui.applet.c());
    com.tencent.mm.kernel.h.a(com.tencent.mm.pluginsdk.h.class, new com.tencent.mm.pluginsdk.ui.applet.f());
    GMTrace.o(4090822131712L, 30479);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4090956349440L, 30480);
    GMTrace.o(4090956349440L, 30480);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4090687913984L, 30478);
    GMTrace.o(4090687913984L, 30478);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4090419478528L, 30476);
    GMTrace.o(4090419478528L, 30476);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4090553696256L, 30477);
    HashMap localHashMap = fIv;
    GMTrace.o(4090553696256L, 30477);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\al\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */