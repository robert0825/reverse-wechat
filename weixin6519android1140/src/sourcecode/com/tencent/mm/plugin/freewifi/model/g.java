package com.tencent.mm.plugin.freewifi.model;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  public int lql;
  
  public g()
  {
    GMTrace.i(7144141225984L, 53228);
    this.lql = 5;
    GMTrace.o(7144141225984L, 53228);
  }
  
  public static void a(String paramString, int paramInt, Intent paramIntent)
  {
    GMTrace.i(16034991964160L, 119470);
    w.i("MicroMsg.FreeWifi.FreeWifiNetwork", "update ssid  : %s to new state : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (paramInt == 3)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiNetwork", "new state is connect failed, update local freewifiinfo expired time to now");
      com.tencent.mm.plugin.freewifi.g.c localc = j.aBe().yG(paramString);
      if (localc != null)
      {
        localc.field_expiredTime = (bg.Pu() - 10L);
        boolean bool = j.aBe().c(localc, new String[0]);
        w.i("MicroMsg.FreeWifi.FreeWifiNetwork", "update local freewifi info expired time : ssid is : %s, now time is : %d, update ret : %b", new Object[] { paramString, Long.valueOf(localc.field_expiredTime), Boolean.valueOf(bool) });
      }
    }
    d.a(paramString, paramInt, paramIntent);
    GMTrace.o(16034991964160L, 119470);
  }
  
  public static String ck(String paramString1, String paramString2)
  {
    GMTrace.i(16034857746432L, 119469);
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiNetwork", "null or nil header");
      GMTrace.o(16034857746432L, 119469);
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
            GMTrace.o(16034857746432L, 119469);
            return paramString1;
          }
          i += 1;
        }
      }
      GMTrace.o(16034857746432L, 119469);
      return null;
    }
  }
  
  /* Error */
  public static String yC(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 143
    //   3: ldc -111
    //   5: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 147	java/net/URL
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 150	java/net/URL:<init>	(Ljava/lang/String;)V
    //   16: invokevirtual 154	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   19: checkcast 156	java/net/HttpURLConnection
    //   22: astore_0
    //   23: aload_0
    //   24: ifnull +67 -> 91
    //   27: aload_0
    //   28: sipush 30000
    //   31: invokevirtual 160	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   34: aload_0
    //   35: iconst_0
    //   36: invokevirtual 164	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   39: aload_0
    //   40: invokevirtual 167	java/net/HttpURLConnection:getResponseCode	()I
    //   43: istore_1
    //   44: aload_0
    //   45: ldc -87
    //   47: invokevirtual 172	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   50: astore_2
    //   51: ldc 41
    //   53: ldc -82
    //   55: iconst_2
    //   56: anewarray 4	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: iload_1
    //   62: invokestatic 49	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: aload_2
    //   69: aastore
    //   70: invokestatic 54	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: aload_0
    //   74: ifnull +7 -> 81
    //   77: aload_0
    //   78: invokevirtual 177	java/net/HttpURLConnection:disconnect	()V
    //   81: ldc2_w 143
    //   84: ldc -111
    //   86: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: aload_2
    //   90: areturn
    //   91: aload_0
    //   92: ifnull +7 -> 99
    //   95: aload_0
    //   96: invokevirtual 177	java/net/HttpURLConnection:disconnect	()V
    //   99: ldc2_w 143
    //   102: ldc -111
    //   104: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   107: aconst_null
    //   108: areturn
    //   109: astore_2
    //   110: aconst_null
    //   111: astore_0
    //   112: ldc 41
    //   114: ldc -77
    //   116: iconst_1
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_2
    //   123: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   126: aastore
    //   127: invokestatic 185	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_0
    //   131: ifnull -32 -> 99
    //   134: aload_0
    //   135: invokevirtual 177	java/net/HttpURLConnection:disconnect	()V
    //   138: goto -39 -> 99
    //   141: astore_2
    //   142: aconst_null
    //   143: astore_0
    //   144: aload_0
    //   145: ifnull +7 -> 152
    //   148: aload_0
    //   149: invokevirtual 177	java/net/HttpURLConnection:disconnect	()V
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
  
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract void ba(String paramString, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */