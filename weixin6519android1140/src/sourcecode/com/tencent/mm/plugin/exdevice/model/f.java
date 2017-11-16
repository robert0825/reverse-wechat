package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.agy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ak.b.a;

public final class f
{
  public static boolean S(Context paramContext, String paramString)
  {
    GMTrace.i(10950958645248L, 81591);
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.exdevice.ExdeviceLogic", "Jump to webview failed, url is null or nil.");
      GMTrace.o(10950958645248L, 81591);
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(10950958645248L, 81591);
    return true;
  }
  
  public static void a(com.tencent.mm.plugin.exdevice.h.b paramb, agx paramagx, agy paramagy)
  {
    GMTrace.i(10951092862976L, 81592);
    if (paramagy != null)
    {
      paramb.field_connProto = paramagy.uwk;
      paramb.field_connStrategy = paramagy.uwl;
      paramb.field_closeStrategy = paramagy.uwm;
      paramb.field_mac = com.tencent.mm.plugin.exdevice.j.b.xh(com.tencent.mm.plugin.exdevice.j.b.xi(paramagy.tTU));
      paramb.field_authKey = paramagy.tSi;
      paramb.field_brandName = paramagy.uwj;
      paramb.ci(paramagy.gCC);
      paramb.B(paramagy.fsK);
      paramb.cW(paramagy.uws);
      paramb.cV(paramagy.uwr);
      paramb.cU(paramagy.uwq);
      paramb.dJ(paramagy.uwt);
      paramb.cS(paramagy.lRV);
      paramb.dK(paramagy.fsJ);
      paramb.cT(paramagy.lPE);
      paramb.cX(paramagy.fsL);
      paramb.cY(paramagy.fsM);
      paramb.cZ(paramagy.fsN);
      paramb.da(paramagy.fsO);
    }
    if (paramagx != null)
    {
      paramb.field_deviceID = paramagx.jhl;
      paramb.field_deviceType = paramagx.tSz;
      paramb.field_md5Str = g.n(new String(paramagx.tSz + paramagx.jhl).getBytes());
      if (bg.nm(paramb.field_brandName)) {
        paramb.field_brandName = paramagx.tSz;
      }
    }
    GMTrace.o(10951092862976L, 81592);
  }
  
  public static boolean b(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    GMTrace.i(10951227080704L, 81593);
    if ((paramb != null) && ((paramb.fsK & 1L) == 1L))
    {
      GMTrace.o(10951227080704L, 81593);
      return true;
    }
    GMTrace.o(10951227080704L, 81593);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */