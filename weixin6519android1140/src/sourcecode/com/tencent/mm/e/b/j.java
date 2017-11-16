package com.tencent.mm.e.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class j
{
  public static int ezm;
  String euR;
  public com.tencent.mm.compatible.util.b ezj;
  public b ezk;
  public a ezl;
  public int status;
  
  static
  {
    GMTrace.i(4469718777856L, 33302);
    ezm = 100;
    GMTrace.o(4469718777856L, 33302);
  }
  
  public j()
  {
    GMTrace.i(4468645036032L, 33294);
    this.euR = "";
    this.ezl = null;
    this.status = 0;
    this.ezk = new b(com.tencent.mm.compatible.b.b.a.fML);
    this.ezj = new com.tencent.mm.compatible.util.b(ab.getContext());
    GMTrace.o(4468645036032L, 33294);
  }
  
  public final boolean bT(String paramString)
  {
    GMTrace.i(4468779253760L, 33295);
    g.a locala = new g.a();
    if (this.euR.length() > 0)
    {
      w.e("MicroMsg.SimpleVoiceRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
      GMTrace.o(4468779253760L, 33295);
      return false;
    }
    this.euR = paramString;
    try
    {
      this.ezj.requestFocus();
      this.ezk.a(new b.a()
      {
        public final void onError()
        {
          GMTrace.i(4488375042048L, 33441);
          j.this.ezj.tx();
          if (j.this.ezl != null) {
            j.this.ezl.onError();
          }
          try
          {
            j.this.ezk.release();
            j.this.status = -1;
            GMTrace.o(4488375042048L, 33441);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.SimpleVoiceRecorder", "setErrorListener File[" + j.this.euR + "] ErrMsg[" + localException.getStackTrace() + "]");
            GMTrace.o(4488375042048L, 33441);
          }
        }
      });
      this.ezk.qq();
      this.ezk.qr();
      this.ezk.qp();
      this.ezk.setOutputFile(this.euR);
      this.ezk.setMaxDuration(3600010);
      this.ezk.prepare();
      this.ezk.start();
      w.d("MicroMsg.SimpleVoiceRecorder", "StartRecord File[" + this.euR + "] start time:" + locala.tD());
      this.status = 1;
      GMTrace.o(4468779253760L, 33295);
      return true;
    }
    catch (Exception paramString)
    {
      this.ezj.tx();
      w.e("MicroMsg.SimpleVoiceRecorder", "StartRecord File[" + this.euR + "] ErrMsg[" + paramString.getMessage() + "]");
      this.status = -1;
      GMTrace.o(4468779253760L, 33295);
    }
    return false;
  }
  
  public final boolean qn()
  {
    GMTrace.i(4468913471488L, 33296);
    this.ezj.tx();
    if (this.ezk == null)
    {
      GMTrace.o(4468913471488L, 33296);
      return true;
    }
    try
    {
      this.ezk.qt();
      this.ezk.release();
      this.euR = "";
      this.status = 0;
      GMTrace.o(4468913471488L, 33296);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SimpleVoiceRecorder", "StopRecord File[" + this.euR + "] ErrMsg[" + localException.getMessage() + "]");
      this.status = -1;
      GMTrace.o(4468913471488L, 33296);
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void onError();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\e\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */