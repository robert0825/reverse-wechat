package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;

public final class j
  extends e
  implements a
{
  public String eDJ;
  private com.tencent.mm.plugin.freewifi.a lrf;
  private int lrl;
  public String lrw;
  public String openId;
  public String sign;
  
  public j(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    GMTrace.i(7242388602880L, 53960);
    this.lrl = 0;
    this.openId = this.intent.getStringExtra("free_wifi_openid");
    this.lrw = this.intent.getStringExtra("free_wifi_tid");
    this.eDJ = this.intent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_TIMESTAMP");
    this.sign = this.intent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_SIGN");
    w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, desc=Data retrieved. openId=%s, tid=%s, timestamp=%s, sign=%s", new Object[] { m.C(this.intent), Integer.valueOf(m.D(this.intent)), this.openId, this.lrw, this.eDJ, this.sign });
    GMTrace.o(7242388602880L, 53960);
  }
  
  public final void W(int paramInt, String paramString)
  {
    GMTrace.i(16035797270528L, 119476);
    k.a locala = k.aAB();
    locala.ssid = this.ssid;
    locala.bssid = m.yt("MicroMsg.FreeWifi.Protocol32");
    locala.eCF = m.yu("MicroMsg.FreeWifi.Protocol32");
    locala.eCE = this.eCE;
    locala.lou = this.appId;
    locala.lov = m.C(this.intent);
    locala.low = 32;
    locala.lox = k.b.loZ.lpi;
    locala.loy = k.b.loZ.name;
    locala.result = paramInt;
    locala.jNb = paramString;
    locala.ePH = m.F(this.intent);
    locala.aAD().aAC();
    GMTrace.o(16035797270528L, 119476);
  }
  
  public final void X(int paramInt, String paramString)
  {
    GMTrace.i(7242657038336L, 53962);
    k.a locala = k.aAB();
    locala.ssid = this.ssid;
    locala.bssid = m.yt("MicroMsg.FreeWifi.Protocol32");
    locala.eCF = m.yu("MicroMsg.FreeWifi.Protocol32");
    locala.eCE = this.eCE;
    locala.lou = this.appId;
    locala.lov = m.C(this.intent);
    locala.low = 32;
    locala.lox = k.b.loZ.lpi;
    locala.loy = k.b.loZ.name;
    locala.result = paramInt;
    locala.jNb = paramString;
    locala.ePH = m.F(this.intent);
    locala.aAD().aAC();
    GMTrace.o(7242657038336L, 53962);
  }
  
  public final void aBB()
  {
    GMTrace.i(16035528835072L, 119474);
    w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=connectSsid, desc=it starts to connect ssid. ssid=%s", new Object[] { m.C(this.intent), Integer.valueOf(m.D(this.intent)), this.ssid });
    this.lrf.a(new com.tencent.mm.plugin.freewifi.a.a()
    {
      public final void nM(int paramAnonymousInt)
      {
        GMTrace.i(7235543498752L, 53909);
        w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=connect, desc=An attempt to connect to ssid failed. ssid=%s, errCode=%d", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)), j.this.ssid, Integer.valueOf(paramAnonymousInt) });
        Object localObject = j.this.lqY;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.ltD;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.ltc = m.a(j.this.lra, k.b.loI, paramAnonymousInt);
        ((FreeWifiFrontPageUI)localObject).a(locald, locala);
        localObject = k.aAB();
        ((k.a)localObject).ssid = j.this.ssid;
        ((k.a)localObject).bssid = m.yt("MicroMsg.FreeWifi.Protocol32");
        ((k.a)localObject).eCF = m.yu("MicroMsg.FreeWifi.Protocol32");
        ((k.a)localObject).eCE = j.this.eCE;
        ((k.a)localObject).lou = j.this.appId;
        ((k.a)localObject).lov = m.C(j.this.intent);
        ((k.a)localObject).low = m.E(j.this.intent);
        ((k.a)localObject).loy = k.b.loI.name;
        ((k.a)localObject).lox = k.b.loI.lpi;
        ((k.a)localObject).result = paramAnonymousInt;
        ((k.a)localObject).ePH = m.F(j.this.intent);
        ((k.a)localObject).aAD().aAC();
        GMTrace.o(7235543498752L, 53909);
      }
      
      public final void onSuccess()
      {
        GMTrace.i(7235409281024L, 53908);
        final Object localObject = k.aAB();
        ((k.a)localObject).ssid = j.this.ssid;
        ((k.a)localObject).bssid = m.yt("MicroMsg.FreeWifi.Protocol32");
        ((k.a)localObject).eCF = m.yu("MicroMsg.FreeWifi.Protocol32");
        ((k.a)localObject).eCE = j.this.eCE;
        ((k.a)localObject).lou = j.this.appId;
        ((k.a)localObject).lov = m.C(j.this.intent);
        ((k.a)localObject).low = m.E(j.this.intent);
        ((k.a)localObject).lox = k.b.loI.lpi;
        ((k.a)localObject).loy = k.b.loI.name;
        ((k.a)localObject).result = 0;
        ((k.a)localObject).ePH = m.F(j.this.intent);
        ((k.a)localObject).aAD().aAC();
        localObject = h.b.lop.aAA();
        w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=connect, desc=An attempt to connect to ssid succeeded and then tries to access blackUrl. ssid=%s, blackUrl = %s", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)), j.this.ssid, localObject });
        com.tencent.mm.plugin.freewifi.a.a.a local1 = new com.tencent.mm.plugin.freewifi.a.a.a()
        {
          private int lrA;
          private com.tencent.mm.plugin.freewifi.a.a.a lrB;
          int lry;
          private final int lrz;
          
          public final void d(HttpURLConnection paramAnonymous2HttpURLConnection)
          {
            GMTrace.i(7241583296512L, 53954);
            int i = paramAnonymous2HttpURLConnection.getResponseCode();
            if (i == 200)
            {
              w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Access to blackurl returns 200 directly, so we believe that the device is already authenticated. Authentication ended.", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)) });
              j.this.X(0, "");
              m.a(j.this.intent, j.this.eCE, j.this.lra, j.this.eqV, j.this.lqY, "MicroMsg.FreeWifi.Protocol32");
              GMTrace.o(7241583296512L, 53954);
              return;
            }
            if (i == 302)
            {
              yE(paramAnonymous2HttpURLConnection.getHeaderField("Location"));
              GMTrace.o(7241583296512L, 53954);
              return;
            }
            w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)) });
            paramAnonymous2HttpURLConnection = j.this.lqY;
            FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.ltD;
            FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
            locala.ltc = m.a(j.this.lra, k.b.lpa, 32);
            paramAnonymous2HttpURLConnection.a(locald, locala);
            j.this.W(32, "INVALID_HTTP_RESP_CODE");
            GMTrace.o(7241583296512L, 53954);
          }
          
          public final void g(Exception paramAnonymous2Exception)
          {
            GMTrace.i(7241717514240L, 53955);
            w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s, stacktrace=%s", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)), paramAnonymous2Exception.getMessage(), m.e(paramAnonymous2Exception) });
            if ((paramAnonymous2Exception instanceof UnknownHostException))
            {
              j.this.W(102, m.d(paramAnonymous2Exception));
              w.i("MicroMsg.FreeWifi.Protocol32", "countBlackHttpRequest=" + this.lry);
              int i = this.lry + 1;
              this.lry = i;
              if (i <= 3) {
                try
                {
                  Thread.sleep(3000L);
                  com.tencent.mm.plugin.freewifi.a.a.aAK();
                  com.tencent.mm.plugin.freewifi.a.a.a(localObject, this);
                  GMTrace.o(7241717514240L, 53955);
                  return;
                }
                catch (InterruptedException localInterruptedException)
                {
                  w.e("MicroMsg.FreeWifi.Protocol32", "InterruptedException e stacktrace=%s", new Object[] { m.e(paramAnonymous2Exception) });
                  j.this.W(103, m.d(paramAnonymous2Exception));
                  paramAnonymous2Exception = j.this.lqY;
                  localObject1 = FreeWifiFrontPageUI.d.ltD;
                  localObject2 = new FreeWifiFrontPageUI.a();
                  ((FreeWifiFrontPageUI.a)localObject2).ltc = m.a(j.this.lra, k.b.lpa, 103);
                  paramAnonymous2Exception.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
                  GMTrace.o(7241717514240L, 53955);
                  return;
                }
              }
              localObject1 = j.this.lqY;
              localObject2 = FreeWifiFrontPageUI.d.ltD;
              locala = new FreeWifiFrontPageUI.a();
              locala.ltc = m.a(j.this.lra, k.b.lpa, m.f(paramAnonymous2Exception));
              ((FreeWifiFrontPageUI)localObject1).a((FreeWifiFrontPageUI.d)localObject2, locala);
              j.this.W(m.f(paramAnonymous2Exception), m.d(paramAnonymous2Exception));
              GMTrace.o(7241717514240L, 53955);
              return;
            }
            Object localObject1 = j.this.lqY;
            Object localObject2 = FreeWifiFrontPageUI.d.ltD;
            FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
            locala.ltc = m.a(j.this.lra, k.b.lpa, m.f(paramAnonymous2Exception));
            ((FreeWifiFrontPageUI)localObject1).a((FreeWifiFrontPageUI.d)localObject2, locala);
            j.this.W(m.f(paramAnonymous2Exception), m.d(paramAnonymous2Exception));
            GMTrace.o(7241717514240L, 53955);
          }
          
          public final void yE(String paramAnonymous2String)
          {
            GMTrace.i(7241851731968L, 53956);
            Object localObject2 = Uri.parse(paramAnonymous2String);
            Object localObject1 = ((Uri)localObject2).getQueryParameter("authUrl");
            localObject2 = m.yr(((Uri)localObject2).getQueryParameter("extend"));
            w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Access to blackUrl returns 302 and now trying to  get authurl and extend from location. location=%s, authUrl=%s, extend=%s", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)), paramAnonymous2String, localObject1, localObject2 });
            if (m.yp((String)localObject1))
            {
              this.lrA += 1;
              if (this.lrA < 3)
              {
                com.tencent.mm.plugin.freewifi.a.a.aAK();
                com.tencent.mm.plugin.freewifi.a.a.a(paramAnonymous2String, this.lrB);
                GMTrace.o(7241851731968L, 53956);
                return;
              }
              w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Connection fail. Too many 302, exceeding 3 times", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)) });
              paramAnonymous2String = j.this.lqY;
              localObject1 = FreeWifiFrontPageUI.d.ltD;
              localObject2 = new FreeWifiFrontPageUI.a();
              ((FreeWifiFrontPageUI.a)localObject2).ltc = m.a(j.this.lra, k.b.lpa, 36);
              paramAnonymous2String.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
              j.this.X(36, "BLACK_302_TIMES_EXCESS");
              GMTrace.o(7241851731968L, 53956);
              return;
            }
            paramAnonymous2String = new StringBuilder((String)localObject1);
            if (((String)localObject1).indexOf("?") != -1) {
              paramAnonymous2String.append("&extend=").append((String)localObject2);
            }
            for (;;)
            {
              paramAnonymous2String.append("&openId=").append(m.yr(j.this.openId)).append("&tid=").append(m.yr(j.this.lrw)).append("&timestamp=").append(j.this.eDJ).append("&sign=").append(j.this.sign);
              localObject1 = j.this;
              localObject2 = paramAnonymous2String.toString();
              com.tencent.mm.plugin.freewifi.model.j.aBh().aAR().post(new j.3((j)localObject1, (String)localObject2));
              w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, desc=Data retrieved. http authentication url = %s", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)), paramAnonymous2String.toString() });
              GMTrace.o(7241851731968L, 53956);
              return;
              paramAnonymous2String.append("?extend=").append((String)localObject2);
            }
          }
        };
        com.tencent.mm.plugin.freewifi.a.a.aAK();
        com.tencent.mm.plugin.freewifi.a.a.a((String)localObject, local1);
        GMTrace.o(7235409281024L, 53908);
      }
    });
    GMTrace.o(16035528835072L, 119474);
  }
  
  public final void connect()
  {
    GMTrace.i(7242522820608L, 53961);
    this.lrf = new com.tencent.mm.plugin.freewifi.a(this.ssid, this.lqY);
    com.tencent.mm.plugin.freewifi.model.j.aBh().aAR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7234335539200L, 53900);
        j.this.aBB();
        GMTrace.o(7234335539200L, 53900);
      }
    });
    GMTrace.o(7242522820608L, 53961);
  }
  
  public final void yD(String paramString)
  {
    GMTrace.i(16035663052800L, 119475);
    this.lrl += 1;
    if (this.lrl > 3)
    {
      w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication, desc=Connection fail. Too many 302, exceeding 3 times", new Object[] { m.C(this.intent), Integer.valueOf(m.D(this.intent)) });
      paramString = this.lqY;
      localObject1 = FreeWifiFrontPageUI.d.ltD;
      localObject2 = new FreeWifiFrontPageUI.a();
      ((FreeWifiFrontPageUI.a)localObject2).ltc = m.a(this.lra, k.b.loZ, 33);
      paramString.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
      X(33, "AUTH_302_TIMES_EXCESS");
      GMTrace.o(16035663052800L, 119475);
      return;
    }
    w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication, desc=it discovers 302 Location and redirects. http response header Location=%s", new Object[] { m.C(this.intent), Integer.valueOf(m.D(this.intent)), paramString });
    if (m.yp(paramString))
    {
      paramString = this.lqY;
      localObject1 = FreeWifiFrontPageUI.d.ltD;
      localObject2 = new FreeWifiFrontPageUI.a();
      ((FreeWifiFrontPageUI.a)localObject2).ltc = m.a(this.lra, k.b.loZ, 34);
      paramString.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
      X(34, "EMPTY_AUTH_LOCATION");
      GMTrace.o(16035663052800L, 119475);
      return;
    }
    Object localObject1 = new com.tencent.mm.plugin.freewifi.a.a.a()
    {
      public final void d(HttpURLConnection paramAnonymousHttpURLConnection)
      {
        GMTrace.i(7243462344704L, 53968);
        int i = paramAnonymousHttpURLConnection.getResponseCode();
        w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication.onSuccess, desc=it receives http response for authentication(after 302). http response status code=%d", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)), Integer.valueOf(i) });
        if (i == 200)
        {
          j.this.X(0, "");
          m.a(j.this.intent, j.this.eCE, j.this.lra, j.this.eqV, j.this.lqY, "MicroMsg.FreeWifi.Protocol32");
          GMTrace.o(7243462344704L, 53968);
          return;
        }
        if (i == 302)
        {
          paramAnonymousHttpURLConnection = paramAnonymousHttpURLConnection.getHeaderField("Location");
          j.this.yD(paramAnonymousHttpURLConnection);
          GMTrace.o(7243462344704L, 53968);
          return;
        }
        w.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication, desc=http response status code is not 200, so it fails to connect wifi. ", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)) });
        paramAnonymousHttpURLConnection = j.this.lqY;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.ltD;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.ltc = m.a(j.this.lra, k.b.loZ, 32);
        paramAnonymousHttpURLConnection.a(locald, locala);
        j.this.X(32, "INVALID_HTTP_RESP_CODE");
        GMTrace.o(7243462344704L, 53968);
      }
      
      public final void g(Exception paramAnonymousException)
      {
        GMTrace.i(7243596562432L, 53969);
        w.e("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication.onException, desc=exception happens during http. e.getMessage()=%s, stacktrace=%s", new Object[] { m.C(j.this.intent), Integer.valueOf(m.D(j.this.intent)), paramAnonymousException.getMessage(), m.e(paramAnonymousException) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = j.this.lqY;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.ltD;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.ltc = m.a(j.this.lra, k.b.loZ, m.f(paramAnonymousException));
        localFreeWifiFrontPageUI.a(locald, locala);
        j.this.X(m.f(paramAnonymousException), m.d(paramAnonymousException));
        GMTrace.o(7243596562432L, 53969);
      }
    };
    Object localObject2 = Uri.parse(paramString);
    if ("post".equalsIgnoreCase(((Uri)localObject2).getQueryParameter("method")))
    {
      com.tencent.mm.plugin.freewifi.a.a.aAK();
      com.tencent.mm.plugin.freewifi.a.a.a(paramString, ((Uri)localObject2).getEncodedQuery(), (com.tencent.mm.plugin.freewifi.a.a.a)localObject1);
      GMTrace.o(16035663052800L, 119475);
      return;
    }
    com.tencent.mm.plugin.freewifi.a.a.aAK();
    com.tencent.mm.plugin.freewifi.a.a.a(paramString, (com.tencent.mm.plugin.freewifi.a.a.a)localObject1);
    GMTrace.o(16035663052800L, 119475);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\e\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */