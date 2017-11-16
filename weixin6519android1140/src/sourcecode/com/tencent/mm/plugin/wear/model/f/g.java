package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.bsd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.s;
import java.io.IOException;

public final class g
  extends b
{
  private au eRz;
  
  public g(au paramau)
  {
    GMTrace.i(9190022053888L, 68471);
    this.eRz = paramau;
    GMTrace.o(9190022053888L, 68471);
  }
  
  public final String getName()
  {
    GMTrace.i(9190290489344L, 68473);
    GMTrace.o(9190290489344L, 68473);
    return "WearLuckyCreateTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9190156271616L, 68472);
    bsd localbsd = new bsd();
    Object localObject = this.eRz.field_content;
    String str;
    if (localObject != null)
    {
      localObject = f.a.C((String)localObject, this.eRz.field_reserved);
      if ((localObject == null) || (!((f.a)localObject).gkb.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))) {
        break label253;
      }
      localbsd.vbw = this.eRz.field_msgId;
      localbsd.vbv = this.eRz.field_talker;
      if (this.eRz.field_isSend != 1) {
        break label227;
      }
      localObject = ((f.a)localObject).gjV;
      localbsd.eBt = h.KX(this.eRz.field_talker);
      if (!s.eb(this.eRz.field_talker)) {
        break label235;
      }
      str = d(this.eRz.field_talker, this.eRz);
    }
    for (localbsd.nIp = String.format(ab.getContext().getString(R.l.dMs), new Object[] { h.KX(str), Character.valueOf('​'), localObject });; localbsd.nIp = ((String)localObject))
    {
      try
      {
        com.tencent.mm.plugin.wear.model.a.bBm();
        r.a(20014, localbsd.toByteArray(), true);
        com.tencent.mm.plugin.wear.model.c.a.dC(10, 0);
        com.tencent.mm.plugin.wear.model.c.a.xi(10);
        GMTrace.o(9190156271616L, 68472);
        return;
      }
      catch (IOException localIOException)
      {
        label227:
        label235:
        GMTrace.o(9190156271616L, 68472);
        return;
      }
      w.w("MicroMsg.Wear.WearLuckyCreateTask", "xml is null!");
      GMTrace.o(9190156271616L, 68472);
      return;
      localObject = ((f.a)localObject).gjU;
      break;
    }
    label253:
    w.i("MicroMsg.Wear.WearLuckyCreateTask", "biz c2c message, do not send to watch!");
    GMTrace.o(9190156271616L, 68472);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */