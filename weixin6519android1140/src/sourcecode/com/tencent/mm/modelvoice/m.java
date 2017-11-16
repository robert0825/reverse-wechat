package com.tencent.mm.modelvoice;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.e.b.i;
import com.tencent.mm.g.a.nn;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.HashMap;
import junit.framework.Assert;

public class m
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private u hem;
  private com.tencent.mm.storage.bg hen;
  private i heo;
  private r hep;
  private c heq;
  
  static
  {
    GMTrace.i(566667247616L, 4222);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("VOICE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(559419490304L, 4168);
        String[] arrayOfString = u.fTX;
        GMTrace.o(559419490304L, 4168);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("VOICETRANSTEXT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(536065605632L, 3994);
        String[] arrayOfString = com.tencent.mm.storage.bg.fTX;
        GMTrace.o(536065605632L, 3994);
        return arrayOfString;
      }
    });
    GMTrace.o(566667247616L, 4222);
  }
  
  public m()
  {
    GMTrace.i(565325070336L, 4212);
    this.hep = new r();
    this.heq = new c() {};
    GMTrace.o(565325070336L, 4212);
  }
  
  private static m NJ()
  {
    GMTrace.i(565459288064L, 4213);
    m localm = (m)p.o(m.class);
    GMTrace.o(565459288064L, 4213);
    return localm;
  }
  
  public static u NK()
  {
    GMTrace.i(565593505792L, 4214);
    h.xw().wG();
    if (NJ().hem == null) {
      if (h.xy().fYV == null) {
        break label78;
      }
    }
    label78:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("dataDB is null ", bool);
      NJ().hem = new u(h.xy().fYV);
      u localu = NJ().hem;
      GMTrace.o(565593505792L, 4214);
      return localu;
    }
  }
  
  public static com.tencent.mm.storage.bg NL()
  {
    GMTrace.i(565727723520L, 4215);
    h.xw().wG();
    if (NJ().hen == null) {
      if (h.xy().fYV == null) {
        break label78;
      }
    }
    label78:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("dataDB is null ", bool);
      NJ().hen = new com.tencent.mm.storage.bg(h.xy().fYV);
      com.tencent.mm.storage.bg localbg = NJ().hen;
      GMTrace.o(565727723520L, 4215);
      return localbg;
    }
  }
  
  public static i NM()
  {
    GMTrace.i(565861941248L, 4216);
    h.xw().wG();
    if (NJ().heo == null) {
      NJ().heo = new i();
    }
    i locali = NJ().heo;
    GMTrace.o(565861941248L, 4216);
    return locali;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(566398812160L, 4220);
    d.c.a(Integer.valueOf(34), this.hep);
    com.tencent.mm.sdk.b.a.vgX.b(this.heq);
    b.a(new a(), new String[] { "//voicetrymore" });
    GMTrace.o(566398812160L, 4220);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(566533029888L, 4221);
    GMTrace.o(566533029888L, 4221);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(566264594432L, 4219);
    GMTrace.o(566264594432L, 4219);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(565996158976L, 4217);
    if (NJ().heo != null) {
      NJ().heo.eyZ = 0;
    }
    d.c.aE(Integer.valueOf(34));
    com.tencent.mm.sdk.b.a.vgX.c(this.heq);
    b.C(new String[] { "//voicetrymore" });
    GMTrace.o(565996158976L, 4217);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(566130376704L, 4218);
    HashMap localHashMap = fIv;
    GMTrace.o(566130376704L, 4218);
    return localHashMap;
  }
  
  static final class a
    implements com.tencent.mm.pluginsdk.b.a
  {
    a()
    {
      GMTrace.i(17481053765632L, 130244);
      GMTrace.o(17481053765632L, 130244);
    }
    
    public final boolean a(Context paramContext, String[] paramArrayOfString)
    {
      GMTrace.i(17481187983360L, 130245);
      paramContext = paramArrayOfString[0];
      int i = -1;
      switch (paramContext.hashCode())
      {
      default: 
        switch (i)
        {
        }
        break;
      }
      do
      {
        GMTrace.o(17481187983360L, 130245);
        return false;
        if (!paramContext.equals("//voicetrymore")) {
          break;
        }
        i = 0;
        break;
      } while ((paramArrayOfString.length <= 1) || (paramArrayOfString[1] == null));
      i = com.tencent.mm.sdk.platformtools.bg.getInt(paramArrayOfString[1], 1);
      if (i == 1) {}
      for (boolean bool = true;; bool = false)
      {
        i.ezc = bool;
        w.i("MicroMsg.SubCoreVoice", "summervoicetrymore enable[%d]", new Object[] { Integer.valueOf(i) });
        GMTrace.o(17481187983360L, 130245);
        return true;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */