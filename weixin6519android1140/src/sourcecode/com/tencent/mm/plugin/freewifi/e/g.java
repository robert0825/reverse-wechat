package com.tencent.mm.plugin.freewifi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.b;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends e
  implements a
{
  private com.tencent.mm.plugin.freewifi.a lrf;
  private int lrg;
  
  public g(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    GMTrace.i(7235677716480L, 53910);
    this.lrg = 5;
    GMTrace.o(7235677716480L, 53910);
  }
  
  public static String ck(String paramString1, String paramString2)
  {
    GMTrace.i(7236080369664L, 53913);
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.FreeWifi.ProtocolOne", "null or nil header");
      GMTrace.o(7236080369664L, 53913);
      return null;
    }
    paramString1 = paramString1.split("\\?");
    if (paramString2.length() > 0) {
      paramString1 = paramString1[1].split("&");
    }
    for (;;)
    {
      if ((paramString1 != null) && (paramString1.length > 0))
      {
        int j = paramString1.length;
        int i = 0;
        while (i < j)
        {
          Object localObject = paramString1[i];
          if (((String)localObject).startsWith(paramString2))
          {
            paramString1 = ((String)localObject).substring(paramString2.length());
            GMTrace.o(7236080369664L, 53913);
            return paramString1;
          }
          i += 1;
        }
      }
      GMTrace.o(7236080369664L, 53913);
      return null;
    }
  }
  
  /* Error */
  public static String yC(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 84
    //   3: ldc 86
    //   5: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 88	java/net/URL
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 91	java/net/URL:<init>	(Ljava/lang/String;)V
    //   16: invokevirtual 95	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   19: checkcast 97	java/net/HttpURLConnection
    //   22: astore_0
    //   23: aload_0
    //   24: ifnull +67 -> 91
    //   27: aload_0
    //   28: sipush 30000
    //   31: invokevirtual 101	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   34: aload_0
    //   35: iconst_0
    //   36: invokevirtual 105	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   39: aload_0
    //   40: invokevirtual 108	java/net/HttpURLConnection:getResponseCode	()I
    //   43: istore_1
    //   44: aload_0
    //   45: ldc 110
    //   47: invokevirtual 113	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   50: astore_2
    //   51: ldc 50
    //   53: ldc 115
    //   55: iconst_2
    //   56: anewarray 117	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: iload_1
    //   62: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: aload_2
    //   69: aastore
    //   70: invokestatic 126	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: aload_0
    //   74: ifnull +7 -> 81
    //   77: aload_0
    //   78: invokevirtual 130	java/net/HttpURLConnection:disconnect	()V
    //   81: ldc2_w 84
    //   84: ldc 86
    //   86: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: aload_2
    //   90: areturn
    //   91: aload_0
    //   92: ifnull +7 -> 99
    //   95: aload_0
    //   96: invokevirtual 130	java/net/HttpURLConnection:disconnect	()V
    //   99: ldc2_w 84
    //   102: ldc 86
    //   104: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   107: aconst_null
    //   108: areturn
    //   109: astore_2
    //   110: aconst_null
    //   111: astore_0
    //   112: ldc 50
    //   114: ldc -124
    //   116: iconst_1
    //   117: anewarray 117	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_2
    //   123: invokevirtual 136	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   126: aastore
    //   127: invokestatic 138	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_0
    //   131: ifnull -32 -> 99
    //   134: aload_0
    //   135: invokevirtual 130	java/net/HttpURLConnection:disconnect	()V
    //   138: goto -39 -> 99
    //   141: astore_2
    //   142: aconst_null
    //   143: astore_0
    //   144: aload_0
    //   145: ifnull +7 -> 152
    //   148: aload_0
    //   149: invokevirtual 130	java/net/HttpURLConnection:disconnect	()V
    //   152: aload_2
    //   153: athrow
    //   154: astore_2
    //   155: goto -11 -> 144
    //   158: astore_2
    //   159: goto -15 -> 144
    //   162: astore_2
    //   163: goto -51 -> 112
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	paramString	String
    //   43	19	1	i	int
    //   50	40	2	str	String
    //   109	14	2	localException1	Exception
    //   141	12	2	localObject1	Object
    //   154	1	2	localObject2	Object
    //   158	1	2	localObject3	Object
    //   162	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   8	23	109	java/lang/Exception
    //   8	23	141	finally
    //   27	73	154	finally
    //   112	130	158	finally
    //   27	73	162	java/lang/Exception
  }
  
  public final void aBB()
  {
    GMTrace.i(16035126181888L, 119471);
    this.lrf = new com.tencent.mm.plugin.freewifi.a(this.ssid, this.lqY);
    this.lrf.a(new a.a()
    {
      public final void nM(int paramAnonymousInt)
      {
        GMTrace.i(7239033159680L, 53935);
        g.this.aBC();
        GMTrace.o(7239033159680L, 53935);
      }
      
      public final void onSuccess()
      {
        GMTrace.i(7238898941952L, 53934);
        w.i("MicroMsg.FreeWifi.ProtocolOne", "sessionKey=%s, step=%d, desc=Network. ", new Object[] { m.C(g.this.intent), Integer.valueOf(m.D(g.this.intent)) });
        g.this.aBD();
        GMTrace.o(7238898941952L, 53934);
      }
    });
    GMTrace.o(16035126181888L, 119471);
  }
  
  public final void aBC()
  {
    GMTrace.i(7235946151936L, 53912);
    this.lqY.a(FreeWifiFrontPageUI.d.ltD, FreeWifiFrontPageUI.a.ltz);
    GMTrace.o(7235946151936L, 53912);
  }
  
  public final void aBD()
  {
    GMTrace.i(16035260399616L, 119472);
    int i = this.lrg;
    for (;;)
    {
      int j = i - 1;
      if (i <= 0) {
        break label333;
      }
      w.i("MicroMsg.FreeWifi.ProtocolOne", "now retry count = %d", new Object[] { Integer.valueOf(j) });
      str3 = com.tencent.mm.k.g.uu().ug();
      w.i("MicroMsg.FreeWifi.ProtocolOne", "get check url from cinfig : %s", new Object[] { str3 });
      String str1 = str3;
      if (bg.nm(str3))
      {
        w.i("MicroMsg.FreeWifi.ProtocolOne", "get check url from config failed, use the default url : %s", new Object[] { "http://10.1.0.6/redirect" });
        str1 = "http://10.1.0.6/redirect";
      }
      str3 = yC(str1);
      w.i("MicroMsg.FreeWifi.ProtocolOne", "get location from url : %s, %s", new Object[] { str1, str3 });
      if (!bg.nm(str3)) {
        break;
      }
      w.e("MicroMsg.FreeWifi.ProtocolOne", "get location from url failed : %s, %s", new Object[] { str1, str3 });
      try
      {
        Thread.sleep(500L);
        i = j;
      }
      catch (Exception localException)
      {
        i = j;
      }
    }
    String str2 = ck(str3, "auth=");
    w.i("MicroMsg.FreeWifi.ProtocolOne", "get apauthmessage from location : %s, %s", new Object[] { str2, str3 });
    if (bg.nm(str2))
    {
      w.e("MicroMsg.FreeWifi.ProtocolOne", "get apauth message from location failed : %s", new Object[] { str3 });
      aBC();
      GMTrace.o(16035260399616L, 119472);
      return;
    }
    String str3 = d.aAT();
    w.i("MicroMsg.FreeWifi.ProtocolOne", "get ap auth data : %s, url : %s, mac : %s", new Object[] { str2, this.lqZ, str3 });
    if (!bg.nm(str2))
    {
      new com.tencent.mm.plugin.freewifi.d.a(this.lqZ, this.ssid, str3, "", str2, "", this.eqV, m.C(this.intent)).b(new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7246817787904L, 53993);
          w.i("MicroMsg.FreeWifi.ProtocolOne", "errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousk = (com.tencent.mm.plugin.freewifi.d.a)paramAnonymousk;
            paramAnonymousString = paramAnonymousk.aBm();
            w.i("MicroMsg.FreeWifi.ProtocolOne", "authUrl : %s", new Object[] { paramAnonymousString });
            paramAnonymousk = paramAnonymousk.aBs();
            if (paramAnonymousk != null)
            {
              w.i("MicroMsg.FreeWifi.ProtocolOne", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s", new Object[] { paramAnonymousk.lTf, paramAnonymousk.jio, paramAnonymousk.jhi, Integer.valueOf(paramAnonymousk.tSG), paramAnonymousk.tSH, paramAnonymousk.gCA });
              g localg = g.this;
              j.aBh().aAR().post(new g.4(localg, paramAnonymousString, paramAnonymousk));
              GMTrace.o(7246817787904L, 53993);
              return;
            }
            g.this.aBC();
            GMTrace.o(7246817787904L, 53993);
            return;
          }
          g.this.aBC();
          GMTrace.o(7246817787904L, 53993);
        }
      });
      GMTrace.o(16035260399616L, 119472);
      return;
    }
    aBC();
    GMTrace.o(16035260399616L, 119472);
    return;
    label333:
    aBC();
    GMTrace.o(16035260399616L, 119472);
  }
  
  public final void connect()
  {
    GMTrace.i(7235811934208L, 53911);
    j.aBh().aAR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7239704248320L, 53940);
        g.this.aBB();
        GMTrace.o(7239704248320L, 53940);
      }
    });
    GMTrace.o(7235811934208L, 53911);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */