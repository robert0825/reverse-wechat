package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.h.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.e.b.a;
import com.tencent.mm.e.b.b;
import com.tencent.mm.e.b.c;
import com.tencent.mm.sdk.platformtools.w;

public final class t
  implements a
{
  private static int ezm;
  String euR;
  public b ezk;
  public h.a heB;
  public int status;
  
  static
  {
    GMTrace.i(544118669312L, 4054);
    ezm = 100;
    GMTrace.o(544118669312L, 4054);
  }
  
  public t(com.tencent.mm.compatible.b.b.a parama)
  {
    GMTrace.i(543179145216L, 4047);
    this.euR = "";
    this.heB = null;
    this.status = 0;
    this.ezk = new b(parama);
    GMTrace.o(543179145216L, 4047);
  }
  
  public final void a(h.a parama)
  {
    GMTrace.i(543044927488L, 4046);
    this.heB = parama;
    GMTrace.o(543044927488L, 4046);
  }
  
  public final boolean bR(String paramString)
  {
    GMTrace.i(543313362944L, 4048);
    g.a locala = new g.a();
    if (this.euR.length() > 0)
    {
      w.e("VoiceRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
      GMTrace.o(543313362944L, 4048);
      return false;
    }
    this.euR = paramString;
    try
    {
      this.ezk.a(new com.tencent.mm.e.b.b.a()
      {
        public final void onError()
        {
          GMTrace.i(542105403392L, 4039);
          if (t.this.heB != null) {
            t.this.heB.onError();
          }
          try
          {
            t.this.ezk.release();
            t.this.status = -1;
            GMTrace.o(542105403392L, 4039);
            return;
          }
          catch (Exception localException)
          {
            w.e("VoiceRecorder", "setErrorListener File[" + t.this.euR + "] ErrMsg[" + localException.getStackTrace() + "]");
            GMTrace.o(542105403392L, 4039);
          }
        }
      });
      this.ezk.qq();
      this.ezk.qr();
      this.ezk.qp();
      this.ezk.setOutputFile(this.euR);
      this.ezk.setMaxDuration(70000);
      this.ezk.prepare();
      this.ezk.start();
      w.d("VoiceRecorder", "StartRecord File[" + this.euR + "] start time:" + locala.tD());
      this.status = 1;
      GMTrace.o(543313362944L, 4048);
      return true;
    }
    catch (Exception paramString)
    {
      w.e("VoiceRecorder", "StartRecord File[" + this.euR + "] ErrMsg[" + paramString.getMessage() + "]");
      this.status = -1;
      GMTrace.o(543313362944L, 4048);
    }
    return false;
  }
  
  public final int getMaxAmplitude()
  {
    GMTrace.i(543581798400L, 4050);
    if (this.status == 1)
    {
      int i = this.ezk.getMaxAmplitude();
      if (i > ezm) {
        ezm = i;
      }
      i = i * 100 / ezm;
      GMTrace.o(543581798400L, 4050);
      return i;
    }
    GMTrace.o(543581798400L, 4050);
    return 0;
  }
  
  public final int getStatus()
  {
    GMTrace.i(542776492032L, 4044);
    int i = this.status;
    GMTrace.o(542776492032L, 4044);
    return i;
  }
  
  public final boolean qn()
  {
    GMTrace.i(543447580672L, 4049);
    if (this.ezk == null)
    {
      GMTrace.o(543447580672L, 4049);
      return true;
    }
    try
    {
      this.ezk.qt();
      this.ezk.release();
      this.euR = "";
      this.status = 0;
      GMTrace.o(543447580672L, 4049);
      return true;
    }
    catch (Exception localException)
    {
      w.e("VoiceRecorder", "StopRecord File[" + this.euR + "] ErrMsg[" + localException.getMessage() + "]");
      this.status = -1;
      GMTrace.o(543447580672L, 4049);
    }
    return false;
  }
  
  public final int qo()
  {
    GMTrace.i(542910709760L, 4045);
    b localb = this.ezk;
    if (((localb.exj == com.tencent.mm.compatible.b.b.a.fMK) || (localb.exj == com.tencent.mm.compatible.b.b.a.fMM)) && (localb.exi != null))
    {
      int i = localb.exi.exW;
      GMTrace.o(542910709760L, 4045);
      return i;
    }
    GMTrace.o(542910709760L, 4045);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */