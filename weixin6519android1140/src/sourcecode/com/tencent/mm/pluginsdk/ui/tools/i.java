package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public final class i
{
  public static void a(a parama)
  {
    GMTrace.i(1130515922944L, 8423);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1125952520192L, 8389);
        HttpURLConnection localHttpURLConnection;
        try
        {
          i.a locala = this.tHd;
          w.i("MicroMsg.QQMailUnreadHelper", "dz[getUnreadCount]");
          at.AR();
          localObject = (String)c.xh().get(-1535680990, "");
          at.AR();
          long l = new o(bg.e((Integer)c.xh().get(9, null))).longValue();
          if ((bg.nm((String)localObject)) || (l == 0L))
          {
            at.AR();
            c.xh().a(w.a.vqN, Integer.valueOf(-1));
            w.w("MicroMsg.QQMailUnreadHelper", "dz[getUnreadEmailCountAndSet: authkey or uin is null]");
            af.t(new i.2(locala));
            GMTrace.o(1125952520192L, 8389);
            return;
          }
          localHttpURLConnection = (HttpURLConnection)new URL("https://qqmail.weixin.qq.com/cgi-bin/getunreadmailcount?f=xml&appname=qqmail_weixin&charset=utf-8&clientip=0").openConnection();
          localHttpURLConnection.setConnectTimeout(15000);
          localHttpURLConnection.setReadTimeout(20000);
          localHttpURLConnection.setRequestProperty("Cookie", String.format("skey=%s;uin=o%d;", new Object[] { localObject, Long.valueOf(l) }));
          if (localHttpURLConnection.getResponseCode() >= 300)
          {
            localHttpURLConnection.disconnect();
            w.w("MicroMsg.QQMailUnreadHelper", "dz[getUnreadCount http 300]");
            af.t(new i.3(locala));
            GMTrace.o(1125952520192L, 8389);
            return;
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.QQMailUnreadHelper", localException, "", new Object[0]);
          w.e("MicroMsg.QQMailUnreadHelper", "getUnreadCountAsync exception");
          GMTrace.o(1125952520192L, 8389);
          return;
        }
        Object localObject = bh.q(bg.convertStreamToString(localHttpURLConnection.getInputStream()), "Response");
        if ((localObject != null) && (bg.getInt((String)((Map)localObject).get(".Response.error.code"), -1) == 0)) {}
        for (int i = bg.getInt((String)((Map)localObject).get(".Response.result.UnreadCount"), -1);; i = -1)
        {
          if (i < 0)
          {
            af.t(new i.4(localException));
            GMTrace.o(1125952520192L, 8389);
            return;
          }
          at.AR();
          c.xh().a(w.a.vqN, Integer.valueOf(i));
          af.t(new i.5(localException, i));
          GMTrace.o(1125952520192L, 8389);
          return;
        }
      }
    });
    GMTrace.o(1130515922944L, 8423);
  }
  
  public static abstract interface a
  {
    public abstract void aYJ();
    
    public abstract void sT(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */