package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.e.b.c;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.qafpapi.QAFPNative;

public final class a
  implements com.tencent.mm.ad.e
{
  public c exi;
  private c.a eyi;
  public byte[] oNS;
  public int oNT;
  public int oNU;
  public long oNV;
  public int oNW;
  public boolean oNX;
  public e oNY;
  public Object oNZ;
  public a oOa;
  public boolean oOb;
  public boolean oOc;
  public int oOd;
  public int oOe;
  private boolean oOf;
  public long oOg;
  public int oOh;
  
  public a()
  {
    GMTrace.i(6606330789888L, 49221);
    this.oNS = new byte['⠀'];
    this.oNT = 0;
    this.oNU = 0;
    this.oNV = 0L;
    this.oNW = 0;
    this.oNX = false;
    this.oNY = null;
    this.oNZ = new Object();
    this.oOa = null;
    this.oOb = false;
    this.oOc = false;
    this.oOd = 0;
    this.oOf = false;
    this.eyi = new c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(6592640581632L, 49119);
        GMTrace.o(6592640581632L, 49119);
      }
      
      public final void d(byte[] arg1, int paramAnonymousInt)
      {
        GMTrace.i(6592506363904L, 49118);
        g.a locala = new g.a();
        long l;
        for (;;)
        {
          synchronized (a.this.oNZ)
          {
            int i;
            if (a.this.oNW == 408)
            {
              w.v("MicroMsg.MusicFingerPrintRecorder", "shake tv branch, QAFPProcessTV");
              i = QAFPNative.QAFPProcessTV(???, paramAnonymousInt);
              l = bg.Pv() - a.this.oOg;
              w.d("MicroMsg.MusicFingerPrintRecorder", "QAFPProcess clientid:%d pcm:%d ret:%d dur:%d usetime:%d", new Object[] { Integer.valueOf(a.this.oOd), Integer.valueOf(paramAnonymousInt), Integer.valueOf(i), Long.valueOf(l), Long.valueOf(locala.tD()) });
              if (l <= a.this.oOh * 3000 + 4000) {
                break label412;
              }
              ??? = new byte['⠀'];
              ??? = new g.a();
              if (a.this.oNW == 408)
              {
                w.v("MicroMsg.MusicFingerPrintRecorder", "shake tv branch, QAFPGetAudioFingerPrintTV");
                paramAnonymousInt = QAFPNative.QAFPGetAudioFingerPrintTV((byte[])???);
                w.d("MicroMsg.MusicFingerPrintRecorder", "QAFPGetAudioFingerPrint clientid:%d outLen:%d time:%d", new Object[] { Integer.valueOf(a.this.oOd), Integer.valueOf(paramAnonymousInt), Long.valueOf(???.tD()) });
                if ((paramAnonymousInt < 10240) && (paramAnonymousInt > 0)) {
                  break;
                }
                w.e("MicroMsg.MusicFingerPrintRecorder", "QAFPGetAudioFingerPrint clientid:%d  out ret:%d  !stop record now", new Object[] { Integer.valueOf(a.this.oOd), Integer.valueOf(paramAnonymousInt) });
                a.this.reset();
                GMTrace.o(6592506363904L, 49118);
              }
            }
            else
            {
              i = QAFPNative.QAFPProcess(???, paramAnonymousInt);
            }
          }
          paramAnonymousInt = QAFPNative.QAFPGetAudioFingerPrint((byte[])???);
        }
        synchronized (a.this.oNS)
        {
          System.arraycopy(???, 0, a.this.oNS, 0, paramAnonymousInt);
          a.this.oNT = paramAnonymousInt;
          ??? = a.this;
          if (a.this.oOh >= 3)
          {
            bool = true;
            ((a)???).oOc = bool;
            a.this.oNU = ((int)(l / 1000L));
            a.this.qG();
            ??? = a.this;
            ???.oOh += 1;
            label412:
            if (a.this.oOc)
            {
              w.w("MicroMsg.MusicFingerPrintRecorder", "client:%d stop now! duration:%d  ", new Object[] { Integer.valueOf(a.this.oOd), Long.valueOf(l) });
              a.this.reset();
            }
            GMTrace.o(6592506363904L, 49118);
            return;
          }
          boolean bool = false;
        }
      }
    };
    GMTrace.o(6606330789888L, 49221);
  }
  
  private void hk(final boolean paramBoolean)
  {
    GMTrace.i(6607136096256L, 49227);
    w.d("MicroMsg.MusicFingerPrintRecorder", "tryCallBack, directFail = %s", new Object[] { Boolean.valueOf(false) });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6604720177152L, 49209);
        if (this.oOj)
        {
          a.this.oOa.a(null, -1L, paramBoolean);
          GMTrace.o(6604720177152L, 49209);
          return;
        }
        if (!a.this.oNX)
        {
          w.w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack netscen not return.");
          GMTrace.o(6604720177152L, 49209);
          return;
        }
        if (a.this.exi != null)
        {
          w.w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack device not ready!");
          GMTrace.o(6604720177152L, 49209);
          return;
        }
        if (a.this.oNY != null)
        {
          a.a locala = a.this.oOa;
          azh localazh = a.this.oNY.bfM();
          e locale = a.this.oNY;
          long l2 = bg.Pv();
          long l1 = l2;
          if (locale.oOo > 0L)
          {
            l1 = l2;
            if (locale.oOo < l2) {
              l1 = locale.oOo;
            }
          }
          locala.a(localazh, l1, paramBoolean);
          GMTrace.o(6604720177152L, 49209);
          return;
        }
        a.this.oOa.a(null, -1L, paramBoolean);
        GMTrace.o(6604720177152L, 49209);
      }
    });
    GMTrace.o(6607136096256L, 49227);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6607404531712L, 49229);
    if ((paramk.getType() != 367) && (paramk.getType() != 408))
    {
      GMTrace.o(6607404531712L, 49229);
      return;
    }
    w.d("MicroMsg.MusicFingerPrintRecorder", "onSceneEnd errType = %s, errCode = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.oOb = false;
    if (((e)paramk).bfL())
    {
      w.d("MicroMsg.MusicFingerPrintRecorder", "NetSceneShakeMedia isRecogSuccess stop now ! clientid:%d", new Object[] { Integer.valueOf(this.oOd) });
      qn();
      this.oNY = ((e)paramk);
      this.oNX = true;
      hk(false);
      GMTrace.o(6607404531712L, 49229);
      return;
    }
    if ((this.oNT == 0) && (this.oOc))
    {
      w.d("MicroMsg.MusicFingerPrintRecorder", "recog failed . clientid:%d", new Object[] { Integer.valueOf(this.oOd) });
      this.oNY = null;
      this.oNX = true;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        hk(false);
      }
      for (;;)
      {
        at.wS().b(367, this);
        at.wS().b(408, this);
        GMTrace.o(6607404531712L, 49229);
        return;
        hk(true);
      }
    }
    w.d("MicroMsg.MusicFingerPrintRecorder", "NetScene try again clientId:%d", new Object[] { Integer.valueOf(this.oOd) });
    qG();
    GMTrace.o(6607404531712L, 49229);
  }
  
  public final boolean a(int paramInt, a arg2)
  {
    GMTrace.i(6606867660800L, 49225);
    qn();
    synchronized (this.oNZ)
    {
      this.oOe = QAFPNative.QAFPGetVersion();
      bfJ();
      this.oNW = paramInt;
      this.oOa = ???;
      this.oOc = false;
      this.oOb = false;
      this.oNX = false;
      at.wS().a(367, this);
      at.wS().a(408, this);
      this.oOd = ((int)bg.Pv());
      w.d("MicroMsg.MusicFingerPrintRecorder", "startRecord now clientid:%d", new Object[] { Integer.valueOf(this.oOd) });
      this.exi = new c(8000, 1, 4);
      this.exi.exG = -19;
      this.exi.exR = this.eyi;
      if (!this.exi.qw())
      {
        w.e("MicroMsg.MusicFingerPrintRecorder", "start record failed");
        reset();
        GMTrace.o(6606867660800L, 49225);
        return false;
      }
    }
    synchronized (this.oNZ)
    {
      paramInt = QAFPNative.QAFPReset();
      w.d("MicroMsg.MusicFingerPrintRecorder", "QAFPReset ret:%d", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt < 0)
      {
        w.e("MicroMsg.MusicFingerPrintRecorder", "init failed QAFPReset:%d clientid:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.oOd) });
        reset();
        GMTrace.o(6606867660800L, 49225);
        return false;
      }
      this.oNV = bg.Pv();
      this.oOg = bg.Pv();
      this.oOh = 0;
      GMTrace.o(6606867660800L, 49225);
      return true;
    }
  }
  
  public final boolean bfJ()
  {
    boolean bool = false;
    GMTrace.i(6606465007616L, 49222);
    for (;;)
    {
      int i;
      synchronized (this.oNZ)
      {
        if (this.oOf)
        {
          w.d("MicroMsg.MusicFingerPrintRecorder", "QAFPInit already inited");
          GMTrace.o(6606465007616L, 49222);
          return false;
        }
        i = QAFPNative.QAFPInit();
        w.d("MicroMsg.MusicFingerPrintRecorder", "QAFPInit ret:%d", new Object[] { Integer.valueOf(i) });
        if (i >= 0)
        {
          this.oOf = true;
          break label96;
          GMTrace.o(6606465007616L, 49222);
          return bool;
        }
      }
      label96:
      if (i >= 0) {
        bool = true;
      }
    }
  }
  
  public final boolean bfK()
  {
    boolean bool = false;
    GMTrace.i(6606599225344L, 49223);
    synchronized (this.oNZ)
    {
      if (!this.oOf)
      {
        w.d("MicroMsg.MusicFingerPrintRecorder", "QAFPRelease never inited");
        GMTrace.o(6606599225344L, 49223);
        return false;
      }
      int i = QAFPNative.QAFPRelease();
      w.d("MicroMsg.MusicFingerPrintRecorder", "QAFPRelease ret:%d", new Object[] { Integer.valueOf(i) });
      if (i >= 0) {
        bool = true;
      }
      GMTrace.o(6606599225344L, 49223);
      return bool;
    }
  }
  
  public final void qG()
  {
    GMTrace.i(6607270313984L, 49228);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6604317523968L, 49206);
        if (a.this.oOb)
        {
          w.e("MicroMsg.MusicFingerPrintRecorder", "tryStartNetscene clientid: %d but netscene is running.", new Object[] { Integer.valueOf(a.this.oOd) });
          GMTrace.o(6604317523968L, 49206);
          return;
        }
        for (;;)
        {
          long l;
          int i;
          int j;
          int k;
          boolean bool;
          int m;
          synchronized (a.this.oNS)
          {
            if (a.this.oNT <= 0)
            {
              GMTrace.o(6604317523968L, 49206);
              return;
            }
            byte[] arrayOfByte1 = new byte[a.this.oNT];
            System.arraycopy(a.this.oNS, 0, arrayOfByte1, 0, a.this.oNT);
            a.this.oNT = 0;
            l = a.this.oNV;
            a.this.oOb = true;
            i = a.this.oNW;
            j = a.this.oNU;
            k = a.this.oOd;
            bool = a.this.oOc;
            m = a.this.oOe;
            if (i == 367)
            {
              ??? = new f(arrayOfByte1, j, l, k, bool, m);
              at.wS().a((k)???, 0);
              GMTrace.o(6604317523968L, 49206);
              return;
            }
          }
          if (i == 408) {
            ??? = new g(arrayOfByte2, j, l, k, bool, m);
          } else {
            ??? = null;
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(6604451741696L, 49207);
        String str = super.toString() + "|tryStartNetscene";
        GMTrace.o(6604451741696L, 49207);
        return str;
      }
    });
    GMTrace.o(6607270313984L, 49228);
  }
  
  public final boolean qn()
  {
    GMTrace.i(6606733443072L, 49224);
    w.d("MicroMsg.MusicFingerPrintRecorder", "stopRecord now clientid:%d", new Object[] { Integer.valueOf(this.oOd) });
    at.wS().b(367, this);
    at.wS().b(408, this);
    synchronized (this.oNS)
    {
      this.oNT = 0;
      if (this.exi != null)
      {
        this.exi.qn();
        this.exi = null;
      }
      GMTrace.o(6606733443072L, 49224);
      return true;
    }
  }
  
  public final void reset()
  {
    GMTrace.i(6607001878528L, 49226);
    w.d("MicroMsg.MusicFingerPrintRecorder", "reset recorder clientid:%d", new Object[] { Integer.valueOf(this.oOd) });
    if (this.exi != null)
    {
      this.exi.qn();
      this.exi = null;
    }
    hk(false);
    GMTrace.o(6607001878528L, 49226);
  }
  
  public static abstract interface a
  {
    public abstract void a(azh paramazh, long paramLong, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */