package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.ape;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.d.f;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONObject;

public final class t
  extends com.tencent.mm.wallet_core.g.a.h
{
  private long gXo;
  public String rcF;
  public String rcG;
  public String rcH;
  public String rcI;
  public String rcJ;
  public int rcK;
  public int rcL;
  
  public t()
  {
    GMTrace.i(7033680035840L, 52405);
    x(null);
    GMTrace.o(7033680035840L, 52405);
  }
  
  public static boolean a(boolean paramBoolean, f paramf)
  {
    GMTrace.i(7034351124480L, 52410);
    com.tencent.mm.kernel.h.xz();
    long l = ((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwd, Long.valueOf(0L))).longValue();
    if ((paramBoolean) || (l < System.currentTimeMillis()))
    {
      w.i("MicroMsg.NetSceneTransferWording", "do scene: %d, force: %B", new Object[] { Long.valueOf(l), Boolean.valueOf(paramBoolean) });
      if (paramf != null) {
        paramf.a(new t(), false, 1);
      }
      for (;;)
      {
        GMTrace.o(7034351124480L, 52410);
        return true;
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new t(), 0);
      }
    }
    w.d("MicroMsg.NetSceneTransferWording", "not time");
    GMTrace.o(7034351124480L, 52410);
    return false;
  }
  
  public final int Bb()
  {
    GMTrace.i(7033948471296L, 52407);
    GMTrace.o(7033948471296L, 52407);
    return 1992;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7034216906752L, 52409);
    w.i("MicroMsg.NetSceneTransferWording", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    w.d("MicroMsg.NetSceneTransferWording", "json: %s", new Object[] { paramJSONObject });
    this.rcF = paramJSONObject.optString("delay_confirm_wording");
    this.rcG = paramJSONObject.optString("delay_confirm_switch_wording");
    this.rcH = paramJSONObject.optString("delay_confirm_switch_remind_wording");
    this.rcI = paramJSONObject.optString("delay_confirm_desc_url");
    this.rcK = paramJSONObject.optInt("delay_confirm_desc_url_flag", 0);
    this.gXo = (paramJSONObject.optLong("expire_time", 0L) * 1000L);
    this.rcL = paramJSONObject.optInt("delay_confirm_switch_flag", 0);
    com.tencent.mm.kernel.h.xz();
    paramString = com.tencent.mm.kernel.h.xy().xh();
    if (!bg.nm(this.rcF)) {
      paramString.a(w.a.vwa, this.rcF);
    }
    if (!bg.nm(this.rcG)) {
      paramString.a(w.a.vwb, this.rcG);
    }
    if (!bg.nm(this.rcH)) {
      paramString.a(w.a.vwc, this.rcH);
    }
    if (!bg.nm(this.rcI)) {}
    try
    {
      this.rcJ = URLDecoder.decode(this.rcI, "UTF-8");
      if (!bg.nm(this.rcJ)) {
        paramString.a(w.a.vwe, this.rcJ);
      }
      paramString.a(w.a.vwf, Integer.valueOf(this.rcK));
      paramString.a(w.a.vwd, Long.valueOf(this.gXo));
      paramString.a(w.a.vwg, Integer.valueOf(this.rcL));
      if (this.rcL == 0)
      {
        w.i("MicroMsg.NetSceneTransferWording", "do reset oplog");
        paramJSONObject = new ape();
        paramJSONObject.oqH = 0;
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(205, paramJSONObject));
        paramString.set(147457, Long.valueOf(((Long)paramString.get(147457, Long.valueOf(0L))).longValue() & 0xFFFFFFFFFFFFFFEF & 0xFFFFFFFFFFFFFFDF));
      }
      GMTrace.o(7034216906752L, 52409);
      return;
    }
    catch (UnsupportedEncodingException paramJSONObject)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneTransferWording", paramJSONObject, "", new Object[0]);
      }
    }
  }
  
  public final boolean aVo()
  {
    GMTrace.i(7034485342208L, 52411);
    GMTrace.o(7034485342208L, 52411);
    return false;
  }
  
  public final int aoD()
  {
    GMTrace.i(7033814253568L, 52406);
    GMTrace.o(7033814253568L, 52406);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(7034082689024L, 52408);
    GMTrace.o(7034082689024L, 52408);
    return "/cgi-bin/mmpay-bin/gettransferwording";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */