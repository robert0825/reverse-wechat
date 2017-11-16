package com.tencent.mm.plugin.webview.wepkg.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

public final class d
{
  private static volatile af gut;
  private static final Set<Object> hXk;
  private static final Object iGt;
  
  static
  {
    GMTrace.i(12368432070656L, 92152);
    iGt = new Object();
    hXk = new HashSet();
    GMTrace.o(12368432070656L, 92152);
  }
  
  public static String Ne(String paramString)
  {
    GMTrace.i(12367358328832L, 92144);
    if (bg.nm(paramString))
    {
      GMTrace.o(12367358328832L, 92144);
      return "";
    }
    paramString = b.hLB + paramString + "/";
    GMTrace.o(12367358328832L, 92144);
    return paramString;
  }
  
  public static String Nf(String paramString)
  {
    GMTrace.i(12367760982016L, 92147);
    if (bg.nm(paramString))
    {
      GMTrace.o(12367760982016L, 92147);
      return "";
    }
    try
    {
      paramString = bg.nl(Uri.parse(paramString).getQueryParameter("wechat_pkgid"));
      GMTrace.o(12367760982016L, 92147);
      return paramString;
    }
    catch (UnsupportedOperationException paramString)
    {
      w.e("MicroMsg.Wepkg.WepkgUtil", paramString.getMessage());
      GMTrace.o(12367760982016L, 92147);
    }
    return "";
  }
  
  public static String Ng(String paramString)
  {
    GMTrace.i(12367895199744L, 92148);
    if (bg.nm(paramString))
    {
      GMTrace.o(12367895199744L, 92148);
      return "";
    }
    paramString = Uri.parse(paramString).getHost();
    GMTrace.o(12367895199744L, 92148);
    return paramString;
  }
  
  /* Error */
  public static String Nh(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 114
    //   3: ldc 116
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 51	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   12: ifne +10 -> 22
    //   15: aload_0
    //   16: invokestatic 121	android/webkit/URLUtil:isNetworkUrl	(Ljava/lang/String;)Z
    //   19: ifne +14 -> 33
    //   22: ldc2_w 114
    //   25: ldc 116
    //   27: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: ldc 53
    //   32: areturn
    //   33: aload_0
    //   34: invokestatic 84	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   37: astore_1
    //   38: aload_0
    //   39: new 55	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   46: aload_1
    //   47: invokevirtual 124	android/net/Uri:getScheme	()Ljava/lang/String;
    //   50: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc 126
    //   55: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: ldc 53
    //   63: invokevirtual 132	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   66: astore_1
    //   67: aload_1
    //   68: astore_0
    //   69: aload_1
    //   70: ldc -122
    //   72: invokevirtual 138	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   75: ifeq +15 -> 90
    //   78: aload_1
    //   79: iconst_0
    //   80: aload_1
    //   81: ldc -122
    //   83: invokevirtual 142	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   86: invokevirtual 146	java/lang/String:substring	(II)Ljava/lang/String;
    //   89: astore_0
    //   90: ldc2_w 114
    //   93: ldc 116
    //   95: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   98: aload_0
    //   99: areturn
    //   100: astore_1
    //   101: goto -11 -> 90
    //   104: astore_0
    //   105: aload_1
    //   106: astore_0
    //   107: goto -17 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	paramString	String
    //   37	44	1	localObject	Object
    //   100	6	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   33	67	100	java/lang/Exception
    //   69	90	104	java/lang/Exception
  }
  
  public static boolean Ni(String paramString)
  {
    GMTrace.i(12368163635200L, 92150);
    if (!bg.nm(Nf(paramString)))
    {
      SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("we_pkg_sp", 4);
      if ((localSharedPreferences != null) && (localSharedPreferences.getBoolean("disable_we_pkg", false)))
      {
        w.i("MicroMsg.Wepkg.WepkgUtil", "disable wepkg");
        a.b("EnterWeb", paramString, Nf(paramString), null, 0L, 0L, a.yu(11));
        GMTrace.o(12368163635200L, 92150);
        return false;
      }
      if (b.rZp)
      {
        w.i("MicroMsg.Wepkg.WepkgUtil", "config wepkg disable");
        a.b("EnterWeb", paramString, Nf(paramString), null, 0L, 0L, a.yu(12));
        GMTrace.o(12368163635200L, 92150);
        return false;
      }
      GMTrace.o(12368163635200L, 92150);
      return true;
    }
    GMTrace.o(12368163635200L, 92150);
    return false;
  }
  
  public static boolean Nj(String paramString)
  {
    GMTrace.i(15169019183104L, 113018);
    try
    {
      paramString = new File(paramString);
      if ((!paramString.exists()) || (!paramString.isDirectory())) {
        paramString.mkdirs();
      }
      GMTrace.o(15169019183104L, 113018);
      return true;
    }
    catch (Exception paramString)
    {
      GMTrace.o(15169019183104L, 113018);
    }
    return false;
  }
  
  public static void a(String paramString, final com.tencent.mm.plugin.webview.wepkg.model.a parama)
  {
    GMTrace.i(15168750747648L, 113016);
    long l = System.currentTimeMillis();
    final WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 1001;
    localWepkgCrossProcessTask.rYq = paramString;
    if (ab.bPY())
    {
      xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12368700506112L, 92154);
          this.rYz.RY();
          if (parama != null) {
            parama.a(this.rYz);
          }
          GMTrace.o(12368700506112L, 92154);
        }
      });
      GMTrace.o(15168750747648L, 113016);
      return;
    }
    localWepkgCrossProcessTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15168482312192L, 113014);
        w.i("MicroMsg.Wepkg.WepkgUtil", "bind service time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - this.rZA) });
        if (localWepkgCrossProcessTask != null) {
          localWepkgCrossProcessTask.a(this.rYz);
        }
        this.rYz.VN();
        GMTrace.o(15168482312192L, 113014);
      }
    };
    localWepkgCrossProcessTask.VM();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
    GMTrace.o(15168750747648L, 113016);
  }
  
  public static <T> T aR(T paramT)
  {
    GMTrace.i(12366687240192L, 92139);
    hXk.add(paramT);
    GMTrace.o(12366687240192L, 92139);
    return paramT;
  }
  
  public static void aS(Object paramObject)
  {
    GMTrace.i(12366821457920L, 92140);
    if (paramObject == null)
    {
      GMTrace.o(12366821457920L, 92140);
      return;
    }
    hXk.remove(paramObject);
    GMTrace.o(12366821457920L, 92140);
  }
  
  public static void abA()
  {
    GMTrace.i(12366955675648L, 92141);
    if (gut == null)
    {
      GMTrace.o(12366955675648L, 92141);
      return;
    }
    synchronized (iGt)
    {
      if (gut != null)
      {
        gut.ngv.quit();
        gut = null;
      }
      GMTrace.o(12366955675648L, 92141);
      return;
    }
  }
  
  public static long abz()
  {
    GMTrace.i(15168616529920L, 113015);
    long l = bg.Pu();
    GMTrace.o(15168616529920L, 113015);
    return l;
  }
  
  public static boolean bGs()
  {
    GMTrace.i(15169153400832L, 113019);
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    int i = localGregorianCalendar.get(11);
    int j = localGregorianCalendar.get(12);
    if ((i >= 12) && (i < 14))
    {
      GMTrace.o(15169153400832L, 113019);
      return true;
    }
    if (i == 14)
    {
      if (j <= 30)
      {
        GMTrace.o(15169153400832L, 113019);
        return true;
      }
    }
    else if ((i >= 18) && (i <= 24))
    {
      GMTrace.o(15169153400832L, 113019);
      return true;
    }
    GMTrace.o(15169153400832L, 113019);
    return false;
  }
  
  public static String ew(String paramString1, String paramString2)
  {
    GMTrace.i(12367492546560L, 92145);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(12367492546560L, 92145);
      return "";
    }
    paramString1 = Ne(paramString1) + paramString2;
    GMTrace.o(12367492546560L, 92145);
    return paramString1;
  }
  
  public static String ex(String paramString1, String paramString2)
  {
    GMTrace.i(15168884965376L, 113017);
    paramString1 = g.n((paramString1 + "_" + paramString2).getBytes());
    GMTrace.o(15168884965376L, 113017);
    return paramString1;
  }
  
  public static af xB()
  {
    GMTrace.i(12367089893376L, 92142);
    if (gut == null) {}
    synchronized (iGt)
    {
      if (gut == null) {
        gut = new af("WebviewCache#WorkerThread");
      }
      ??? = gut;
      GMTrace.o(12367089893376L, 92142);
      return (af)???;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\utils\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */