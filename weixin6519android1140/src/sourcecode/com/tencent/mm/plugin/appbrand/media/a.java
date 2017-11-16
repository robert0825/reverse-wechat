package com.tencent.mm.plugin.appbrand.media;

import android.media.MediaRecorder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.b;
import com.tencent.mm.e.b.b.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  private static b iqZ;
  private static String ira;
  private static a irb;
  private static aj irc;
  
  static
  {
    GMTrace.i(10215445495808L, 76111);
    iqZ = null;
    ira = null;
    irb = null;
    irc = null;
    GMTrace.o(10215445495808L, 76111);
  }
  
  private static b YB()
  {
    GMTrace.i(10215042842624L, 76108);
    if (iqZ == null) {
      iqZ = new b(com.tencent.mm.compatible.b.b.a.fMM);
    }
    b localb = iqZ;
    GMTrace.o(10215042842624L, 76108);
    return localb;
  }
  
  public static boolean a(String paramString, a parama, int paramInt)
  {
    GMTrace.i(18244886855680L, 135935);
    iW(1);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.AppBrand.AudioRecorder", "startRecord, path is null or nil");
      GMTrace.o(18244886855680L, 135935);
      return false;
    }
    if (YB() == null)
    {
      GMTrace.o(18244886855680L, 135935);
      return false;
    }
    b localb = YB();
    if (localb.exj == com.tencent.mm.compatible.b.b.a.fML) {
      if (localb.exh != null) {
        localb.exh.reset();
      }
    }
    for (;;)
    {
      YB().qq();
      YB().qr();
      YB().qp();
      YB().setOutputFile(paramString);
      YB().a(new com.tencent.mm.e.b.b.a()
      {
        public final void onError()
        {
          GMTrace.i(18245289508864L, 135938);
          w.e("MicroMsg.AppBrand.AudioRecorder", "onError");
          a.iW(-1);
          GMTrace.o(18245289508864L, 135938);
        }
      });
      try
      {
        YB().prepare();
        YB().start();
        irb = parama;
        ira = paramString;
        long l = paramInt;
        stopTimer();
        paramString = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(10215713931264L, 76113);
            a.iW(1);
            GMTrace.o(10215713931264L, 76113);
            return false;
          }
        }, false);
        irc = paramString;
        paramString.z(l, l);
        GMTrace.o(18244886855680L, 135935);
        return true;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.AppBrand.AudioRecorder", "record prepare, exp = %s", new Object[] { bg.f(paramString) });
        GMTrace.o(18244886855680L, 135935);
      }
      if (localb.exk != b.b.ext)
      {
        localb.release();
        localb.qs();
      }
    }
    return false;
  }
  
  public static void iW(int paramInt)
  {
    GMTrace.i(18245021073408L, 135936);
    if (bg.nm(ira))
    {
      GMTrace.o(18245021073408L, 135936);
      return;
    }
    YB().a(null);
    YB().qt();
    YB().release();
    stopTimer();
    ira = null;
    if (irb != null) {
      irb.iB(paramInt);
    }
    irb = null;
    GMTrace.o(18245021073408L, 135936);
  }
  
  private static void stopTimer()
  {
    GMTrace.i(10214908624896L, 76107);
    if (irc != null) {
      irc.stopTimer();
    }
    irc = null;
    GMTrace.o(10214908624896L, 76107);
  }
  
  public static abstract interface a
  {
    public abstract void iB(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */