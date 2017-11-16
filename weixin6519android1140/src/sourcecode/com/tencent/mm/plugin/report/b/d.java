package com.tencent.mm.plugin.report.b;

import com.tencent.b.a.a.f;
import com.tencent.b.a.a.i;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.awh;
import com.tencent.mm.protocal.c.awi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class d
{
  private static i oqr;
  public static int oqs;
  
  static
  {
    GMTrace.i(13182328373248L, 98216);
    oqr = i.S(ab.getContext());
    oqs = 2;
    GMTrace.o(13182328373248L, 98216);
  }
  
  /* Error */
  public static void FH(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 48
    //   3: ldc 50
    //   5: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: getstatic 37	com/tencent/mm/plugin/report/b/d:oqr	Lcom/tencent/b/a/a/i;
    //   11: astore_1
    //   12: getstatic 54	com/tencent/b/a/a/i:mContext	Landroid/content/Context;
    //   15: ifnull +68 -> 83
    //   18: invokestatic 60	java/lang/System:currentTimeMillis	()J
    //   21: putstatic 64	com/tencent/b/a/a/i:aKO	J
    //   24: ldc2_w 65
    //   27: putstatic 71	com/tencent/b/a/a/n:aKZ	J
    //   30: getstatic 54	com/tencent/b/a/a/i:mContext	Landroid/content/Context;
    //   33: invokestatic 77	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   36: invokeinterface 83 1 0
    //   41: astore_2
    //   42: aload_2
    //   43: ldc 85
    //   45: getstatic 64	com/tencent/b/a/a/i:aKO	J
    //   48: invokeinterface 91 4 0
    //   53: pop
    //   54: aload_2
    //   55: invokeinterface 95 1 0
    //   60: pop
    //   61: getstatic 99	com/tencent/b/a/a/i:mHandler	Landroid/os/Handler;
    //   64: ifnull +19 -> 83
    //   67: getstatic 99	com/tencent/b/a/a/i:mHandler	Landroid/os/Handler;
    //   70: new 101	com/tencent/b/a/a/i$1
    //   73: dup
    //   74: aload_1
    //   75: aload_0
    //   76: invokespecial 105	com/tencent/b/a/a/i$1:<init>	(Lcom/tencent/b/a/a/i;Ljava/lang/String;)V
    //   79: invokevirtual 111	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   82: pop
    //   83: ldc 113
    //   85: ldc 115
    //   87: iconst_1
    //   88: anewarray 4	java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: getstatic 37	com/tencent/mm/plugin/report/b/d:oqr	Lcom/tencent/b/a/a/i;
    //   96: invokevirtual 119	com/tencent/b/a/a/i:om	()Ljava/lang/String;
    //   99: aastore
    //   100: invokestatic 124	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: ldc2_w 48
    //   106: ldc 50
    //   108: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: return
    //   112: astore_0
    //   113: ldc 113
    //   115: ldc 126
    //   117: iconst_1
    //   118: anewarray 4	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload_0
    //   124: invokestatic 132	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   127: aastore
    //   128: invokestatic 135	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: ldc2_w 48
    //   134: ldc 50
    //   136: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   139: return
    //   140: astore_2
    //   141: goto -80 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	paramString	String
    //   11	64	1	locali	i
    //   41	14	2	localEditor	android.content.SharedPreferences.Editor
    //   140	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   8	30	112	java/lang/Exception
    //   61	83	112	java/lang/Exception
    //   83	103	112	java/lang/Exception
    //   30	61	140	java/lang/Exception
  }
  
  public static String bbO()
  {
    GMTrace.i(13181657284608L, 98211);
    try
    {
      i.a(new f()
      {
        public final void aS(String paramAnonymousString)
        {
          GMTrace.i(13182596808704L, 98218);
          w.i("MicroMsg.MidHelper", "QueryMid onDispatch2WXServer req:%s limit:%d", new Object[] { paramAnonymousString, Integer.valueOf(d.oqs) });
          int i = d.oqs;
          d.oqs = i - 1;
          if (i <= 0)
          {
            w.e("MicroMsg.MidHelper", "THE FUCKING querymid do too much! :%d", new Object[] { Integer.valueOf(d.oqs) });
            GMTrace.o(13182596808704L, 98218);
            return;
          }
          Object localObject = new b.a();
          ((b.a)localObject).gtF = new awh();
          ((b.a)localObject).gtG = new awi();
          ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/querymid";
          ((b.a)localObject).gtE = 684;
          localObject = ((b.a)localObject).DA();
          ((awh)((b)localObject).gtC.gtK).ijm = paramAnonymousString;
          ((awh)((b)localObject).gtC.gtK).lQF = 1;
          u.a((b)localObject, new u.a()
          {
            public final int a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, b paramAnonymous2b, k paramAnonymous2k)
            {
              GMTrace.i(13182865244160L, 98220);
              w.i("MicroMsg.MidHelper", "onGYNetEnd errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
              GMTrace.o(13182865244160L, 98220);
              return 0;
            }
          }, true);
          GMTrace.o(13182596808704L, 98218);
        }
      });
      String str = oqr.ol();
      w.i("MicroMsg.MidHelper", "QueryMid try Get Now getMid:%s getLocalMid:%s", new Object[] { str, oqr.om() });
      GMTrace.o(13181657284608L, 98211);
      return str;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MidHelper", "QueryMid Error e:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13181657284608L, 98211);
    }
    return "";
  }
  
  public static int p(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(13181925720064L, 98213);
    if (!h.xw().wL())
    {
      w.i("MicroMsg.MidHelper", "checkReportMid acc not ready");
      GMTrace.o(13181925720064L, 98213);
      return -1;
    }
    long l = bg.Pu();
    if ((paramInt1 == 3) && (bg.a((Long)h.xy().xh().get(331778, null), 0L) >= l))
    {
      GMTrace.o(13181925720064L, 98213);
      return 0;
    }
    int i = 0;
    if (am.is2G(ab.getContext())) {
      i = 1;
    }
    for (;;)
    {
      String str = bbO();
      w.i("MicroMsg.MidHelper", "querymid checkReportMid moment:%d mid[%s]", new Object[] { Integer.valueOf(paramInt1), str });
      com.tencent.mm.plugin.report.d.oqe.i(11402, new Object[] { str, Integer.valueOf(paramInt1), Integer.valueOf(i), p.ta(), Integer.valueOf(paramInt2), paramString, am.getISPName(ab.getContext()), Integer.valueOf(0), p.getDeviceID(ab.getContext()) });
      h.xy().xh().set(331778, Long.valueOf(l + 259200L));
      GMTrace.o(13181925720064L, 98213);
      return 0;
      if (am.isWifi(ab.getContext())) {
        i = 3;
      } else if (am.is3G(ab.getContext())) {
        i = 2;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */