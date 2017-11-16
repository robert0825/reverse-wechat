package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends a
{
  public String desc;
  public long eYB;
  public int jWC;
  public String jWD;
  public String jWE;
  public String jWF;
  public String jWG;
  public int jWH;
  public String omd;
  public String ome;
  public String omf;
  
  public h(String paramString)
  {
    GMTrace.i(17411126329344L, 129723);
    HashMap localHashMap = new HashMap();
    try
    {
      if (!bg.nm(paramString)) {
        localHashMap.put("qrcode_url", URLEncoder.encode(paramString, "UTF-8"));
      }
      x(localHashMap);
      w.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "qrcode_url: %s", new Object[] { paramString });
      GMTrace.o(17411126329344L, 129723);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferScanQrCode", localUnsupportedEncodingException, "", new Object[0]);
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(17411260547072L, 129724);
    this.omd = paramJSONObject.optString("recv_username", "");
    this.jWG = paramJSONObject.optString("recv_realname", "");
    this.ome = paramJSONObject.optString("recv_nickname", "");
    this.desc = paramJSONObject.optString("desc", "");
    this.eYB = paramJSONObject.optLong("amount", 0L);
    this.jWH = paramJSONObject.optInt("set_amount", 0);
    this.jWC = paramJSONObject.optInt("currency", 0);
    this.jWD = paramJSONObject.optString("currencyunit", "");
    this.omf = paramJSONObject.optString("qrcodeid", "");
    this.jWE = paramJSONObject.optString("notice", "");
    this.jWF = paramJSONObject.optString("notice_url", "");
    w.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_username: %s, recv_nickname: %s, desc: %s, amount: %s, setAmount: %s, currencyunit: %s", new Object[] { this.omd, this.ome, this.desc, Long.valueOf(this.eYB), Integer.valueOf(this.jWH), this.jWD });
    w.d("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_realname: %s", new Object[] { this.jWG });
    GMTrace.o(17411260547072L, 129724);
  }
  
  public final String aoA()
  {
    GMTrace.i(17411394764800L, 129725);
    GMTrace.o(17411394764800L, 129725);
    return "/cgi-bin/mmpay-bin/h5f2ftransferscanqrcode";
  }
  
  public final int aoB()
  {
    GMTrace.i(17411663200256L, 129727);
    GMTrace.o(17411663200256L, 129727);
    return 1301;
  }
  
  public final int getType()
  {
    GMTrace.i(17411528982528L, 129726);
    GMTrace.o(17411528982528L, 129726);
    return 1301;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */