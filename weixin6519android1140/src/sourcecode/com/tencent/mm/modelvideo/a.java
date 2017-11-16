package com.tencent.mm.modelvideo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static void a(r paramr, int paramInt)
  {
    GMTrace.i(16387179282432L, 122094);
    if (paramr == null)
    {
      w.w("MicroMsg.AtomStatUtil", "report moov location, but video info is null.");
      GMTrace.o(16387179282432L, 122094);
      return;
    }
    long l3 = bg.Pw();
    o.Nh();
    String str = s.mk(paramr.getFileName());
    long l2 = 0L;
    long l1 = 0L;
    if (c.np(str))
    {
      b localb = new b();
      l2 = localb.no(str);
      if (localb.hmT != null) {
        l1 = localb.hmT.hmP;
      }
    }
    for (int i = 1;; i = 0)
    {
      long l4 = paramr.eSf;
      str = r.mg(paramr.Nt());
      long l5 = paramr.gsL;
      paramr = new StringBuilder();
      paramr.append(l4).append(";").append(str).append(";");
      paramr.append(l5).append(";");
      paramr.append(i).append(";").append(l2).append(";");
      paramr.append(l1).append(";").append(paramInt);
      paramr = paramr.toString();
      w.d("MicroMsg.AtomStatUtil", "report moov content : " + paramr + " cost time: " + bg.aI(l3));
      g.ork.i(11098, new Object[] { Integer.valueOf(8000), paramr });
      GMTrace.o(16387179282432L, 122094);
      return;
      l1 = 0L;
      break;
      w.i("MicroMsg.AtomStatUtil", "download video finish, but it is not mp4 file.");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */