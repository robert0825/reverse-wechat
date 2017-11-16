package com.tencent.mm.plugin.bbom;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.a.e;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.k;
import com.tencent.mm.protocal.c.aod;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;

public final class i
  implements com.tencent.mm.plugin.messenger.foundation.a.f, k
{
  public i()
  {
    GMTrace.i(8024609521664L, 59788);
    GMTrace.o(8024609521664L, 59788);
  }
  
  public final void a(aod paramaod, au paramau)
  {
    GMTrace.i(8024743739392L, 59789);
    if (com.tencent.mm.af.f.dL(paramau.field_talker))
    {
      paramaod.tQb = paramau.fwv;
      if (bg.nm(paramaod.tQb))
      {
        paramaod.tQb = e.jj(paramau.fwv);
        GMTrace.o(8024743739392L, 59789);
      }
    }
    else
    {
      paramaod.tQb = paramau.fwv;
    }
    GMTrace.o(8024743739392L, 59789);
  }
  
  public final String s(au paramau)
  {
    GMTrace.i(8025012174848L, 59791);
    if (com.tencent.mm.af.f.dL(paramau.field_talker))
    {
      paramau = e.Br();
      GMTrace.o(8025012174848L, 59791);
      return paramau;
    }
    GMTrace.o(8025012174848L, 59791);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */