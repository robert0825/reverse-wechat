package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public final class r
{
  private static r xDJ;
  public String TAG;
  private int xDD;
  public String xDE;
  public String xDF;
  public String xDG;
  public String xDH;
  public Vector<q> xDI;
  
  public r()
  {
    GMTrace.i(1444585406464L, 10763);
    this.TAG = "MicroMsg.WalletDigCertManager";
    this.xDD = 0;
    this.xDE = "";
    this.xDF = "";
    this.xDG = "";
    this.xDH = "";
    this.xDI = new Vector();
    GMTrace.o(1444585406464L, 10763);
  }
  
  public static void Xs(String paramString)
  {
    GMTrace.i(1444316971008L, 10761);
    h.xz();
    h.xy().xh().a(w.a.vvh, paramString);
    GMTrace.o(1444316971008L, 10761);
  }
  
  public static String clS()
  {
    GMTrace.i(1444451188736L, 10762);
    h.xz();
    String str = (String)h.xy().xh().get(w.a.vvh, "");
    GMTrace.o(1444451188736L, 10762);
    return str;
  }
  
  public static r clT()
  {
    GMTrace.i(1444719624192L, 10764);
    if (xDJ == null) {
      xDJ = new r();
    }
    r localr = xDJ;
    GMTrace.o(1444719624192L, 10764);
    return localr;
  }
  
  public final void Xt(String paramString)
  {
    GMTrace.i(1445122277376L, 10767);
    if (bg.nm(paramString))
    {
      GMTrace.o(1445122277376L, 10767);
      return;
    }
    if (paramString.equals(clS()))
    {
      this.xDD = 0;
      Xs("");
      w.i(this.TAG, "clean token %s  stack %s ", new Object[] { paramString, bg.bQW().toString() });
      a.clF();
      a.clearCert(paramString);
    }
    paramString = this.xDI.iterator();
    if (paramString.hasNext())
    {
      paramString = (q)paramString.next();
      this.xDI.remove(paramString);
      GMTrace.o(1445122277376L, 10767);
      return;
    }
    GMTrace.o(1445122277376L, 10767);
  }
  
  public final void ab(JSONObject paramJSONObject)
  {
    GMTrace.i(1444988059648L, 10766);
    Object localObject = paramJSONObject.optJSONObject("cert_info");
    if (localObject == null)
    {
      GMTrace.o(1444988059648L, 10766);
      return;
    }
    this.xDI = new Vector();
    int i = ((JSONObject)localObject).optInt("show_crt_info");
    this.xDD = ((JSONObject)localObject).optInt("is_crt_install");
    this.xDH = ((JSONObject)localObject).optString("crt_item_logo_url");
    this.xDE = ((JSONObject)localObject).optString("crt_entry_desc");
    this.xDF = ((JSONObject)localObject).optString("crt_entry_title");
    this.xDG = ((JSONObject)localObject).optString("crt_status_name");
    h.xz();
    h.xy().xh().a(w.a.vvi, Integer.valueOf(i));
    paramJSONObject = clS();
    localObject = ((JSONObject)localObject).optJSONArray("crt_list");
    if (localObject != null) {
      i = 0;
    }
    for (;;)
    {
      if (i < ((JSONArray)localObject).length())
      {
        try
        {
          q localq = new q(((JSONArray)localObject).getJSONObject(i));
          if (localq.xDC == 0) {
            break label275;
          }
          if (bg.nm(paramJSONObject)) {
            w.i(this.TAG, "drop crt list no exist local drop: %s", new Object[] { localq.uTW });
          } else if (localq.uTW.equals(paramJSONObject)) {
            this.xDI.add(localq);
          }
        }
        catch (Exception localException)
        {
          w.i(this.TAG, "WalletDigCertManager error %s", new Object[] { localException.getMessage() });
        }
        w.i(this.TAG, "drop crt list %s drop: %s", new Object[] { paramJSONObject, localException.uTW });
        break label298;
        label275:
        this.xDI.add(localException);
      }
      else
      {
        GMTrace.o(1444988059648L, 10766);
        return;
      }
      label298:
      i += 1;
    }
  }
  
  public final boolean clU()
  {
    GMTrace.i(1444853841920L, 10765);
    if (!bg.nm(clS()))
    {
      if (this.xDD > 0)
      {
        GMTrace.o(1444853841920L, 10765);
        return true;
      }
      GMTrace.o(1444853841920L, 10765);
      return false;
    }
    GMTrace.o(1444853841920L, 10765);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */