package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.hv;
import com.tencent.mm.g.a.hv.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.card.b.g;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.d;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;

public final class n
  extends com.tencent.mm.sdk.b.c<hv>
  implements e
{
  private long eCL;
  
  public n()
  {
    GMTrace.i(5124030201856L, 38177);
    this.eCL = 0L;
    this.vhf = hv.class.getName().hashCode();
    GMTrace.o(5124030201856L, 38177);
  }
  
  private boolean a(hv paramhv)
  {
    GMTrace.i(5124298637312L, 38179);
    if ((paramhv instanceof hv))
    {
      Object localObject = paramhv.eLk.eLl;
      this.eCL = paramhv.eLk.eCL;
      String str = paramhv.eLk.eLm;
      localObject = g.uy((String)localObject);
      at.AR();
      au localau = com.tencent.mm.y.c.yM().cM(this.eCL);
      localau.dB(1);
      at.AR();
      com.tencent.mm.y.c.yM().a(this.eCL, localau);
      paramhv = (hv)localObject;
      if (localObject == null) {
        paramhv = g.uy(localau.field_content);
      }
      if (paramhv != null)
      {
        at.wS().a(652, this);
        paramhv = new af(paramhv.eTJ, str, 17);
        at.wS().a(paramhv, 0);
      }
      GMTrace.o(5124298637312L, 38179);
      return true;
    }
    GMTrace.o(5124298637312L, 38179);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5124164419584L, 38178);
    if ((paramk instanceof af))
    {
      paramString = ((af)paramk).eTK;
      at.AR();
      paramk = com.tencent.mm.y.c.yM().cM(this.eCL);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label154;
      }
      paramk.dB(2);
    }
    for (;;)
    {
      f.a locala = f.a.eS(paramk.field_content);
      d locald = g.uy(paramk.field_content);
      locald.eTK = paramString;
      locala.gjD = g.a(locald);
      locala.eLl = f.a.a(locala, null, null);
      paramk.setContent(f.a.a(locala, null, null));
      at.AR();
      com.tencent.mm.y.c.yM().a(this.eCL, paramk);
      at.wS().b(652, this);
      GMTrace.o(5124164419584L, 38178);
      return;
      label154:
      paramk.dB(5);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */