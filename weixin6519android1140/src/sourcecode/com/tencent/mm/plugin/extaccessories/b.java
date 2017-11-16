package com.tencent.mm.plugin.extaccessories;

import com.samsung.android.sdk.look.writingbuddy.SlookWritingBuddy;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.mt;
import com.tencent.mm.g.a.mt.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.HashMap;

public final class b
  implements aq
{
  public String fYU;
  private a kOF;
  
  public b()
  {
    GMTrace.i(11209461989376L, 83517);
    GMTrace.o(11209461989376L, 83517);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11209998860288L, 83521);
    w.d("MicroMsg.extaccessories.SubCoreExtAccessories", "SubCoreExtAccessories reset");
    if (this.kOF == null) {
      this.kOF = new a();
    }
    a.vgX.b(this.kOF);
    at.xB().h(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11210938384384L, 83528);
        if (!at.AU())
        {
          GMTrace.o(11210938384384L, 83528);
          return;
        }
        if (bg.nm(b.this.fYU))
        {
          GMTrace.o(11210938384384L, 83528);
          return;
        }
        long l = System.currentTimeMillis();
        bg.d(b.this.fYU + "image/spen/", "spen_", 259200000L);
        w.d("MicroMsg.extaccessories.SubCoreExtAccessories", "deleteOutOfDateFile cost %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(11210938384384L, 83528);
      }
    }, 5000L);
    GMTrace.o(11209998860288L, 83521);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(11209864642560L, 83520);
    at.AR();
    this.fYU = com.tencent.mm.y.c.zo();
    File localFile = new File(this.fYU);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    localFile = new File(this.fYU + "image/spen/");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    GMTrace.o(11209864642560L, 83520);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11209730424832L, 83519);
    GMTrace.o(11209730424832L, 83519);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11210133078016L, 83522);
    w.d("MicroMsg.extaccessories.SubCoreExtAccessories", "SubCoreExtAccessories release");
    if (this.kOF != null) {
      a.vgX.c(this.kOF);
    }
    GMTrace.o(11210133078016L, 83522);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(11209596207104L, 83518);
    GMTrace.o(11209596207104L, 83518);
    return null;
  }
  
  public static final class a
    extends com.tencent.mm.sdk.b.c<mt>
  {
    public a()
    {
      GMTrace.i(11209059336192L, 83514);
      this.vhf = mt.class.getName().hashCode();
      GMTrace.o(11209059336192L, 83514);
    }
    
    private boolean a(mt parammt)
    {
      GMTrace.i(11209193553920L, 83515);
      if (!(parammt instanceof mt))
      {
        w.f("MicroMsg.extaccessories.SubCoreExtAccessories", "mismatched event");
        GMTrace.o(11209193553920L, 83515);
        return false;
      }
      w.d("MicroMsg.extaccessories.SubCoreExtAccessories", "RegistSpenBuddyEvent");
      if ((parammt.eRL != null) && (parammt.eRL.eRN != null) && (parammt.eRL.eRM != null)) {}
      try
      {
        new SlookWritingBuddy(parammt.eRL.eRN).setImageWritingListener(new SubCoreExtAccessories.RegistSpenBuddyEventListener.1(this, parammt));
        GMTrace.o(11209193553920L, 83515);
        return true;
      }
      catch (Exception parammt)
      {
        for (;;)
        {
          w.e("MicroMsg.extaccessories.SubCoreExtAccessories", "exception in writingBuddy %s", new Object[] { parammt.getMessage() });
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\extaccessories\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */