package com.tencent.mm.y;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  private b eyB;
  private b.a gmb;
  public a gmc;
  private boolean gmd;
  private Context sN;
  
  public d()
  {
    GMTrace.i(656324689920L, 4890);
    this.gmd = false;
    this.sN = ab.getContext();
    GMTrace.o(656324689920L, 4890);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(656458907648L, 4891);
    this.gmc = parama;
    parama = new b();
    if (this.eyB == null) {
      this.eyB = new b(this.sN);
    }
    if (this.gmb != parama) {
      this.gmb = parama;
    }
    this.eyB.a(this.gmb);
    if (this.eyB == null)
    {
      GMTrace.o(656458907648L, 4891);
      return false;
    }
    if (this.gmd)
    {
      GMTrace.o(656458907648L, 4891);
      return false;
    }
    this.eyB.requestFocus();
    this.gmd = true;
    boolean bool = this.gmd;
    GMTrace.o(656458907648L, 4891);
    return bool;
  }
  
  public final boolean bf(boolean paramBoolean)
  {
    GMTrace.i(656593125376L, 4892);
    if (this.eyB != null) {}
    for (boolean bool = this.eyB.tx();; bool = false)
    {
      this.gmd = false;
      if (paramBoolean)
      {
        this.eyB = null;
        this.gmb = null;
        this.gmc = null;
      }
      GMTrace.o(656593125376L, 4892);
      return bool;
    }
  }
  
  public static abstract interface a {}
  
  private final class b
    implements b.a
  {
    public b()
    {
      GMTrace.i(668270067712L, 4979);
      GMTrace.o(668270067712L, 4979);
    }
    
    public final void dd(int paramInt)
    {
      GMTrace.i(668404285440L, 4980);
      switch (paramInt)
      {
      case 0: 
      default: 
        w.v("MicroMsg.AudioHelperTool", "jacks UNKNOW_AUDIOFOCUS_LOSS DEFAULT");
      }
      do
      {
        do
        {
          do
          {
            do
            {
              GMTrace.o(668404285440L, 4980);
              return;
              w.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_GAIN");
            } while (d.this.gmc == null);
            GMTrace.o(668404285440L, 4980);
            return;
            w.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS");
          } while (d.this.gmc == null);
          GMTrace.o(668404285440L, 4980);
          return;
          w.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS_TRANSIENT");
        } while (d.this.gmc == null);
        GMTrace.o(668404285440L, 4980);
        return;
        w.v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
      } while (d.this.gmc == null);
      GMTrace.o(668404285440L, 4980);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */