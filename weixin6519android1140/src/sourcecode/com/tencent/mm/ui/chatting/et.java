package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bv.a;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Resp;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.g.c;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class et
  implements dn
{
  private static k<dn, Bundle> wHG;
  public Context context;
  public final Map<String, ShowMessageFromWX.Req> wHJ;
  
  static
  {
    GMTrace.i(2254186741760L, 16795);
    wHG = new k() {};
    GMTrace.o(2254186741760L, 16795);
  }
  
  public et(Context paramContext)
  {
    GMTrace.i(2253515653120L, 16790);
    this.wHJ = new HashMap();
    this.context = paramContext;
    GMTrace.o(2253515653120L, 16790);
  }
  
  public static void aj(Bundle paramBundle)
  {
    GMTrace.i(2253649870848L, 16791);
    wHG.bI(paramBundle);
    wHG.doNotify();
    GMTrace.o(2253649870848L, 16791);
  }
  
  public final void a(final String paramString1, final WXMediaMessage paramWXMediaMessage, final String paramString2, final String paramString3)
  {
    GMTrace.i(2253918306304L, 16793);
    w.d("MicroMsg.WXAppMessageShower", "request pkg = %s, openId = %s", new Object[] { paramString1, paramString3 });
    a.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17908537229312L, 133429);
        final ShowMessageFromWX.Req localReq = g.c(et.this.context, paramWXMediaMessage, paramString3);
        g.a(et.this.context, paramString1, paramString2, localReq, 0, new g.c()
        {
          public final void eP(boolean paramAnonymous2Boolean)
          {
            GMTrace.i(17906523963392L, 133414);
            if (paramAnonymous2Boolean) {
              et.this.wHJ.put(localReq.transaction, localReq);
            }
            GMTrace.o(17906523963392L, 133414);
          }
        }, null);
        GMTrace.o(17908537229312L, 133429);
      }
    });
    GMTrace.o(2253918306304L, 16793);
  }
  
  public final void ai(Bundle paramBundle)
  {
    GMTrace.i(2253784088576L, 16792);
    String str = Uri.parse(paramBundle.getString("_mmessage_content")).getQueryParameter("appid");
    w.d("MicroMsg.WXAppMessageShower", "handleResp, appid = " + str);
    paramBundle = new ShowMessageFromWX.Resp(paramBundle);
    w.i("MicroMsg.WXAppMessageShower", "handleResp, errCode = " + paramBundle.errCode + ", type = " + paramBundle.getType());
    if ((ShowMessageFromWX.Req)this.wHJ.get(paramBundle.transaction) == null)
    {
      w.e("MicroMsg.WXAppMessageShower", "invalid resp, check transaction failed, transaction=" + paramBundle.transaction);
      GMTrace.o(2253784088576L, 16792);
      return;
    }
    this.wHJ.remove(paramBundle.transaction);
    GMTrace.o(2253784088576L, 16792);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\et.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */