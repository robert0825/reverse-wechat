package com.tencent.mm.plugin.sns;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.modelstat.o.a;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.bhg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.u.b;

public final class l
  implements i
{
  public l()
  {
    GMTrace.i(18576404643840L, 138405);
    GMTrace.o(18576404643840L, 138405);
  }
  
  public final void U(au paramau)
  {
    GMTrace.i(18576941514752L, 138409);
    String str = o.y(paramau);
    bhf localbhf;
    if (str != null)
    {
      Object localObject = Base64.decode(str, 0);
      localbhf = new bhf();
      try
      {
        localbhf.aD((byte[])localObject);
        localObject = localbhf.uTb;
        if (localObject == null)
        {
          GMTrace.o(18576941514752L, 138409);
          return;
        }
      }
      catch (Exception paramau)
      {
        w.printErrStackTrace("MicroMsg.SnsStatExtUtil", paramau, "", new Object[0]);
        GMTrace.o(18576941514752L, 138409);
        return;
      }
      if (!paramau.field_talker.endsWith("@chatroom")) {
        break label205;
      }
    }
    label205:
    for (paramau = o.a.gZz.value;; paramau = o.a.gZy.value)
    {
      w.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235): scene(%s), statExtStr:%s(id=%s, uxinfo=%s)", new Object[] { paramau, str, localbhf.uTb.uTe, localbhf.uTb.uTf });
      ((c)h.h(c.class)).i(13235, new Object[] { paramau, localbhf.uTb.uTe, localbhf.uTb.uTf });
      GMTrace.o(18576941514752L, 138409);
      return;
    }
  }
  
  public final String a(String paramString, PString paramPString)
  {
    GMTrace.i(18576673079296L, 138407);
    paramString = o.a(paramString, paramPString);
    GMTrace.o(18576673079296L, 138407);
    return paramString;
  }
  
  public final void a(String paramString, u.b paramb, au paramau)
  {
    GMTrace.i(18576807297024L, 138408);
    if (paramau.aCp())
    {
      paramau = f.a.eS(paramau.field_content);
      if ((paramau != null) && (!bg.nm(paramau.eTv))) {
        paramb.o(paramString, paramau.eTv);
      }
    }
    GMTrace.o(18576807297024L, 138408);
  }
  
  public final void b(String paramString, d paramd)
  {
    GMTrace.i(18576538861568L, 138406);
    o.b(paramString, paramd);
    GMTrace.o(18576538861568L, 138406);
  }
  
  public final String y(au paramau)
  {
    GMTrace.i(18577075732480L, 138410);
    paramau = o.y(paramau);
    GMTrace.o(18577075732480L, 138410);
    return paramau;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */