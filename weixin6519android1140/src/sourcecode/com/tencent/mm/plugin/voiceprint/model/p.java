package com.tencent.mm.plugin.voiceprint.model;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class p
  implements e.a
{
  public static int ezm;
  public String euR;
  public k euT;
  public b hez;
  private int joS;
  public long lkz;
  public b qCs;
  public String qCt;
  public boolean qCu;
  public a qCv;
  public boolean qsv;
  public int qsy;
  
  static
  {
    GMTrace.i(12496341565440L, 93105);
    ezm = 100;
    GMTrace.o(12496341565440L, 93105);
  }
  
  public p()
  {
    GMTrace.i(12494596734976L, 93092);
    this.euT = null;
    this.joS = 0;
    this.euR = "";
    this.qsv = false;
    this.lkz = 0L;
    this.qsy = 0;
    this.qCu = false;
    this.qCv = null;
    GMTrace.o(12494596734976L, 93092);
  }
  
  public final void dc(int paramInt)
  {
    GMTrace.i(12494730952704L, 93093);
    w.d("MicroMsg.VoicePrintRecoder", " Recorder onBluetoothHeadsetStateChange :" + paramInt);
    if (this.qsv)
    {
      GMTrace.o(12494730952704L, 93093);
      return;
    }
    this.qsv = true;
    at.AS().b(this);
    this.euT = new k();
    this.qCs = new b();
    this.qCs.start();
    this.qCu = false;
    this.qsy = 1;
    GMTrace.o(12494730952704L, 93093);
  }
  
  public final boolean qt()
  {
    long l = 0L;
    GMTrace.i(12494865170432L, 93094);
    at.AS().sg();
    this.qCu = false;
    w.d("MicroMsg.VoicePrintRecoder", "stop Record :" + this.euR);
    try
    {
      w.d("MicroMsg.VoicePrintRecoder", "stop synchronized Record :" + this.euR);
      if (this.euT != null) {
        this.euT.qn();
      }
      if (this.qsy != 2)
      {
        this.euR = null;
        this.qCu = false;
        w.d("MicroMsg.VoicePrintRecoder", "Stop " + this.euR);
        this.qsy = -1;
        w.d("MicroMsg.VoicePrintRecoder", "bLongEnough " + this.qCu);
        if (this.hez != null) {
          this.hez.tx();
        }
        boolean bool = this.qCu;
        GMTrace.o(12494865170432L, 93094);
        return bool;
      }
    }
    finally {}
    if (this.lkz <= 0L)
    {
      label205:
      this.joS = ((int)l);
      if (this.joS >= 1000) {
        break label288;
      }
      w.d("MicroMsg.VoicePrintRecoder", "Stop " + this.euR + " by voiceLen: " + this.joS);
      this.euR = "";
      this.qCu = false;
    }
    for (;;)
    {
      this.euR = "";
      break;
      l = bg.aI(this.lkz);
      break label205;
      label288:
      this.qCu = true;
      w.d("MicroMsg.VoicePrintRecoder", "Stop file success: " + this.euR);
    }
  }
  
  public static abstract interface a
  {
    public abstract void btf();
  }
  
  private final class b
    extends Thread
  {
    ae handler;
    
    public b()
    {
      GMTrace.i(12497415307264L, 93113);
      this.handler = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(12503857758208L, 93161);
          if (p.this.qsy <= 0)
          {
            GMTrace.o(12503857758208L, 93161);
            return;
          }
          p.this.qsy = 2;
          GMTrace.o(12503857758208L, 93161);
        }
      };
      GMTrace.o(12497415307264L, 93113);
    }
    
    public final void run()
    {
      GMTrace.i(12497549524992L, 93114);
      if (p.this.euT == null)
      {
        w.e("MicroMsg.VoicePrintRecoder", "Stop Record Failed recorder == null");
        GMTrace.o(12497549524992L, 93114);
        return;
      }
      synchronized (p.this)
      {
        String str = m.aA(p.this.euR, true);
        w.d("MicroMsg.VoicePrintRecoder", "fullPathName %s", new Object[] { str });
        p.this.qCt = str;
        if (p.this.hez != null) {
          p.this.hez.requestFocus();
        }
        if (!p.this.euT.bR(str))
        {
          p.this.euR = null;
          w.d("MicroMsg.VoicePrintRecoder", "Thread Start Record  Error fileName[" + p.this.euR + "]");
          p.this.euT.qn();
          p.this.euT = null;
          if (p.this.hez != null) {
            p.this.hez.tx();
          }
          if (p.this.qCv != null) {
            p.this.qCv.btf();
          }
          GMTrace.o(12497549524992L, 93114);
          return;
        }
        p.this.lkz = bg.Pw();
        w.d("MicroMsg.VoicePrintRecoder", "Thread Started Record fileName[" + p.this.euR + "]");
        this.handler.sendEmptyMessageDelayed(0, 1L);
        GMTrace.o(12497549524992L, 93114);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */