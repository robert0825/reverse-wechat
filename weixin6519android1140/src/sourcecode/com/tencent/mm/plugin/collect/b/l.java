package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.b.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class l
  extends a
{
  public String desc;
  public long eYB;
  public String jWA;
  public String jWB;
  public int jWC;
  public String jWD;
  public String jWE;
  public String jWF;
  public String jWG;
  public int jWH;
  public int jWs;
  public String jWt;
  public String jWu;
  public int jWv;
  public String jWw;
  public String jWx;
  public String jWy;
  public String jWz;
  
  public l(int paramInt)
  {
    GMTrace.i(17428977287168L, 129856);
    HashMap localHashMap = new HashMap();
    localHashMap.put("set_amount", "0");
    localHashMap.put("wallet_type", String.valueOf(paramInt));
    x(localHashMap);
    w.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "setAmount: %s, walletType: %s", new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt) });
    GMTrace.o(17428977287168L, 129856);
  }
  
  public l(long paramLong, String paramString, int paramInt)
  {
    GMTrace.i(17429111504896L, 129857);
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("set_amount", "1");
    try
    {
      if (!bg.nm(paramString)) {
        localHashMap.put("desc", URLEncoder.encode(paramString, "UTF-8"));
      }
      localHashMap.put("wallet_type", String.valueOf(paramInt));
      x(localHashMap);
      this.eYB = paramLong;
      this.desc = paramString;
      w.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "amount: %d, setAmount: %s, desc: %s, walletType: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(1), paramString, Integer.valueOf(paramInt) });
      GMTrace.o(17429111504896L, 129857);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferGetQrCode", localUnsupportedEncodingException, "", new Object[0]);
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(17429245722624L, 129858);
    this.jWs = paramJSONObject.optInt("retcode", 0);
    this.jWt = paramJSONObject.optString("retmsg", "");
    this.jWu = paramJSONObject.optString("qrcode_url", "");
    this.jWv = paramJSONObject.optInt("alert_type", 0);
    this.jWw = paramJSONObject.optString("alert_title", "");
    this.jWx = paramJSONObject.optString("left_button_text", "");
    this.jWy = paramJSONObject.optString("right_button_text", "");
    this.jWz = paramJSONObject.optString("right_button_url", "");
    this.jWA = paramJSONObject.optString("bottom_text", "");
    this.jWB = paramJSONObject.optString("bottom_url", "");
    this.jWC = paramJSONObject.optInt("currency", 0);
    this.jWD = paramJSONObject.optString("currencyunit", "");
    this.jWE = paramJSONObject.optString("notice", "");
    this.jWF = paramJSONObject.optString("notice_url", "");
    this.jWG = paramJSONObject.optString("recv_realname", "");
    this.jWH = paramJSONObject.optInt("set_amount", 0);
    if (this.jWH == 0)
    {
      h.xz();
      h.xy().xh().a(w.a.vyd, this.jWu);
      w.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "set payurl: %s", new Object[] { this.jWu });
    }
    w.d("MicroMsg.NetSceneH5F2fTransferGetQrCode", "url: %s, currency: %s", new Object[] { this.jWu, Integer.valueOf(this.jWC) });
    GMTrace.o(17429245722624L, 129858);
  }
  
  public final String aoA()
  {
    GMTrace.i(17429379940352L, 129859);
    GMTrace.o(17429379940352L, 129859);
    return "/cgi-bin/mmpay-bin/h5f2ftransfergetqrcode";
  }
  
  public final int aoB()
  {
    GMTrace.i(17429648375808L, 129861);
    GMTrace.o(17429648375808L, 129861);
    return 1335;
  }
  
  public final boolean aoC()
  {
    GMTrace.i(17429782593536L, 129862);
    GMTrace.o(17429782593536L, 129862);
    return true;
  }
  
  public final int getType()
  {
    GMTrace.i(17429514158080L, 129860);
    GMTrace.o(17429514158080L, 129860);
    return 1335;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */