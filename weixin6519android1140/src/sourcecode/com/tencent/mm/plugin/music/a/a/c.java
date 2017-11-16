package com.tencent.mm.plugin.music.a.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;
import com.tencent.qqmusic.mediaplayer.ILog;
import com.tencent.qqmusic.mediaplayer.ISoLibraryLoader;

public class c
{
  public c()
  {
    GMTrace.i(19522102755328L, 145451);
    GMTrace.o(19522102755328L, 145451);
  }
  
  public static void aSG()
  {
    GMTrace.i(19522236973056L, 145452);
    w.i("MicroMsg.AudioPlayerUtils", "configQQMusicSdkConfig");
    AudioPlayerConfigure.setLog(new ILog()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19524116021248L, 145466);
        w.d(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19524116021248L, 145466);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19524384456704L, 145468);
        w.e(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19524384456704L, 145468);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2, Throwable paramAnonymousThrowable)
      {
        GMTrace.i(19524921327616L, 145472);
        w.printErrStackTrace(paramAnonymousString1, paramAnonymousThrowable, paramAnonymousString2, new Object[0]);
        GMTrace.o(19524921327616L, 145472);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(19525055545344L, 145473);
        w.e(paramAnonymousString1, String.format(paramAnonymousString2, paramAnonymousVarArgs));
        GMTrace.o(19525055545344L, 145473);
      }
      
      public final void e(String paramAnonymousString, Throwable paramAnonymousThrowable)
      {
        GMTrace.i(19524787109888L, 145471);
        w.printErrStackTrace(paramAnonymousString, paramAnonymousThrowable, " throwable", new Object[0]);
        GMTrace.o(19524787109888L, 145471);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19524518674432L, 145469);
        w.i(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19524518674432L, 145469);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2, Throwable paramAnonymousThrowable)
      {
        GMTrace.i(19524652892160L, 145470);
        w.printErrStackTrace(paramAnonymousString1, paramAnonymousThrowable, paramAnonymousString2, new Object[0]);
        GMTrace.o(19524652892160L, 145470);
      }
      
      public final void w(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19524250238976L, 145467);
        w.w(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19524250238976L, 145467);
      }
    });
    AudioPlayerConfigure.setSoLibraryLoader(new ISoLibraryLoader()
    {
      public final boolean load(String paramAnonymousString)
      {
        GMTrace.i(19522773843968L, 145456);
        if (TextUtils.isEmpty(paramAnonymousString))
        {
          w.e("MicroMsg.AudioPlayerUtils", "LoadLibrary lib_name is null");
          GMTrace.o(19522773843968L, 145456);
          return false;
        }
        if (k.dR(paramAnonymousString))
        {
          GMTrace.o(19522773843968L, 145456);
          return true;
        }
        w.i("MicroMsg.AudioPlayerUtils", "load library %s", new Object[] { paramAnonymousString });
        ClassLoader localClassLoader = c.class.getClassLoader();
        String str = k.dS(paramAnonymousString);
        if (!TextUtils.isEmpty(str))
        {
          w.i("MicroMsg.AudioPlayerUtils", "LoadLibrary find and load the lib %s so", new Object[] { str });
          k.b(paramAnonymousString, localClassLoader);
          GMTrace.o(19522773843968L, 145456);
          return true;
        }
        w.e("MicroMsg.AudioPlayerUtils", "LoadLibrary can't find the lib %s so", new Object[] { paramAnonymousString });
        GMTrace.o(19522773843968L, 145456);
        return false;
      }
    });
    GMTrace.o(19522236973056L, 145452);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */