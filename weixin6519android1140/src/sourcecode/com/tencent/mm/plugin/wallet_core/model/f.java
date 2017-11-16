package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public int rfa;
  public String rfb;
  public String rfc;
  public String rfd;
  public String rfe;
  public String rff;
  
  public f()
  {
    GMTrace.i(18041010126848L, 134416);
    GMTrace.o(18041010126848L, 134416);
  }
  
  public static f Kc(String paramString)
  {
    GMTrace.i(18041144344576L, 134417);
    if (!bg.nm(paramString)) {
      try
      {
        paramString = new JSONObject(paramString);
        f localf = new f();
        localf.rfa = paramString.optInt("menu_jump_type", -1);
        localf.rfb = paramString.optString("menu_jump_url", "");
        localf.rfc = paramString.optString("menu_username", "");
        localf.rfd = paramString.optString("menu_path", "");
        localf.rfe = paramString.optString("menu_title", "");
        localf.rff = paramString.optString("menu_icon_url", "");
        w.i("BindCardMenu", "parse bind card menu, type: %s, title: %s", new Object[] { Integer.valueOf(localf.rfa), localf.rfe });
        GMTrace.o(18041144344576L, 134417);
        return localf;
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("BindCardMenu", paramString, "", new Object[0]);
      }
    }
    GMTrace.o(18041144344576L, 134417);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */