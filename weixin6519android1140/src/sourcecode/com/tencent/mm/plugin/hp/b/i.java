package com.tencent.mm.plugin.hp.b;

import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.hw;
import com.tencent.mm.protocal.b.a.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class i
{
  public static void a(String paramString1, final String paramString2, final String paramString3, final DialogInterface.OnClickListener paramOnClickListener1, final String paramString4, final DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(18995835043840L, 141530);
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "msg is null");
      GMTrace.o(18995835043840L, 141530);
      return;
    }
    w.i("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "try to show dialog");
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15365782372352L, 114484);
        hw localhw = new hw();
        b localb = new b();
        localb.title = this.hjn;
        localb.eCh = paramString2;
        localb.tLV = new LinkedList();
        com.tencent.mm.protocal.b.a.a locala = new com.tencent.mm.protocal.b.a.a();
        locala.tLT = paramString3;
        localb.tLV.add(locala);
        locala = new com.tencent.mm.protocal.b.a.a();
        locala.tLT = paramString4;
        localb.tLV.add(locala);
        localhw.eLn.type = 1;
        localhw.eLn.eLo = localb;
        localhw.eLn.eLp = paramOnClickListener1;
        localhw.eLn.eLq = paramOnClickListener2;
        com.tencent.mm.sdk.b.a.vgX.m(localhw);
        GMTrace.o(15365782372352L, 114484);
      }
    });
    GMTrace.o(18995835043840L, 141530);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */