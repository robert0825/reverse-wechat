package com.tencent.mm.plugin.voip.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.c;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class g
{
  public static int qFM;
  public static int qFZ;
  public static int qGa;
  c.a mkI;
  c nlZ;
  public e qDX;
  public b qFL;
  public int qFN;
  public int qFO;
  public long qFP;
  public long qFQ;
  public int qFR;
  public int qFS;
  public int qFT;
  private long qFU;
  public int qFV;
  private int qFW;
  public final Object qFX;
  public int qFY;
  b qGb;
  
  static
  {
    GMTrace.i(5275964669952L, 39309);
    qFM = 3;
    qFZ = 0;
    qGa = 0;
    GMTrace.o(5275964669952L, 39309);
  }
  
  public g(e parame)
  {
    GMTrace.i(5273280315392L, 39289);
    this.qFL = null;
    this.nlZ = null;
    this.qFN = 1;
    this.qDX = null;
    this.qFO = 92;
    this.qFP = 0L;
    this.qFQ = 0L;
    this.qFR = 1;
    this.qFS = 0;
    this.qFT = 1;
    this.qFU = 0L;
    this.qFV = 0;
    this.qFW = 0;
    this.qFX = new Object();
    this.qFY = 0;
    this.mkI = new c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(5311935021056L, 39577);
        GMTrace.o(5311935021056L, 39577);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(5311800803328L, 39576);
        for (;;)
        {
          synchronized (g.this.qFX)
          {
            if ((g.this.qFN != 2) || (g.this.qFL == null))
            {
              GMTrace.o(5311800803328L, 39576);
              return;
            }
            if (g.this.qFR == 1)
            {
              g.this.qFP = System.currentTimeMillis();
              g.this.qFQ = g.this.qFP;
              g.this.qFR = 0;
              if (g.this.qFO <= 10) {
                g.this.qFO = 92;
              }
              int i = g.this.qFL.btB();
              g.this.qFO = ((i + 24 + g.this.qFO * 3) / 4);
              if (g.this.qFT != 1) {
                break label323;
              }
              g.this.qFV = g.this.qFL.bty();
              if (g.this.qFV >= g.this.qFO) {
                g.this.qFV -= g.this.qFO;
              }
              g.this.qFO = g.this.qFV;
              g.this.qFT = 0;
              g.this.qDX.qFr.recordCallback(paramAnonymousArrayOfByte, paramAnonymousInt, g.this.qFO);
              g.qGa += 1;
            }
          }
          long l = System.currentTimeMillis();
          g.this.qFS = ((int)(l - g.this.qFQ - g.qGa * 20));
          g.this.qFP = l;
          continue;
          label323:
          g.this.qFO = 0;
        }
      }
    };
    this.qDX = parame;
    GMTrace.o(5273280315392L, 39289);
  }
  
  public final int btD()
  {
    GMTrace.i(5273548750848L, 39291);
    if ((this.qFL != null) && (this.qDX.qFr.qKT.qGo == 1))
    {
      int i = this.qFL.btD();
      GMTrace.o(5273548750848L, 39291);
      return i;
    }
    GMTrace.o(5273548750848L, 39291);
    return 0;
  }
  
  public final int btY()
  {
    GMTrace.i(5273414533120L, 39290);
    if ((this.nlZ != null) && (this.qDX.qFr.qKT.qGo == 1))
    {
      int i = this.nlZ.exw;
      GMTrace.o(5273414533120L, 39290);
      return i;
    }
    GMTrace.o(5273414533120L, 39290);
    return 0;
  }
  
  public final void btZ()
  {
    GMTrace.i(5273682968576L, 39292);
    if (this.qFN == qFM)
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipDeviceHandler", "devcie stoped already.");
      GMTrace.o(5273682968576L, 39292);
      return;
    }
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipDeviceHandler", "stop device..");
    this.qFN = qFM;
    if (this.qGb != null)
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipDeviceHandler", "stop videodecode thread..");
      this.qGb.qGd = true;
      com.tencent.mm.sdk.f.e.remove(this.qGb);
      this.qGb = null;
    }
    this.qFT = 1;
    this.qFV = 0;
    this.qFO = 92;
    this.qFP = 0L;
    this.qFQ = 0L;
    this.qFR = 1;
    this.qFS = 0;
    this.qFY = 0;
    this.qDX.qFr.qJE = btY();
    this.qDX.qFr.qJF = btD();
    ??? = this.qDX.qFr;
    if ((this.nlZ != null) && (this.qDX.qFr.qKT.qGo == 1))
    {
      i = this.nlZ.qy();
      ((v2protocal)???).qJI = i;
      ??? = this.qDX.qFr;
      if ((this.qFL == null) || (this.qDX.qFr.qKT.qGo != 1)) {
        break label342;
      }
    }
    label342:
    for (int i = this.qFL.btE();; i = 0)
    {
      float f = at.AS().getStreamMaxVolume(i);
      ((v2protocal)???).qJP = ((int)(at.AS().getStreamVolume(i) / f * 100.0F));
      synchronized (this.qFX)
      {
        if ((this.qFL != null) && (this.nlZ != null))
        {
          com.tencent.mm.sdk.f.e.b(new a(this.qFL, this.nlZ), "VoipDeviceHandler_stopDev", 10);
          this.qFL = null;
          this.nlZ = null;
        }
        GMTrace.o(5273682968576L, 39292);
        return;
        i = -2;
      }
    }
  }
  
  final class a
    implements Runnable
  {
    private c mkK;
    private b mkr;
    
    public a(b paramb, c paramc)
    {
      GMTrace.i(5312069238784L, 39578);
      this.mkr = null;
      this.mkK = null;
      this.mkr = paramb;
      this.mkK = paramc;
      GMTrace.o(5312069238784L, 39578);
    }
    
    public final void run()
    {
      GMTrace.i(5312203456512L, 39579);
      if (this.mkr != null)
      {
        this.mkr.btC();
        this.mkr.btz();
        this.mkr = null;
      }
      w.d("MicroMsg.Voip.VoipDeviceHandler", "do stopRecord");
      if (this.mkK != null)
      {
        this.mkK.qn();
        this.mkK = null;
      }
      GMTrace.o(5312203456512L, 39579);
    }
  }
  
  final class b
    implements Runnable
  {
    boolean qGd;
    
    b()
    {
      GMTrace.i(5246705205248L, 39091);
      this.qGd = false;
      GMTrace.o(5246705205248L, 39091);
    }
    
    public final void run()
    {
      GMTrace.i(5246839422976L, 39092);
      while ((g.this.qFN == 2) && (!this.qGd))
      {
        if ((g.this.qDX.btT()) && (g.this.qDX.qFr.videoDecode(g.this.qDX.qFr.qKi) == 1))
        {
          int i = g.this.qDX.qFr.field_remoteImgWidth;
          int j = g.this.qDX.qFr.field_remoteImgHeight;
          int k = g.this.qDX.qFr.field_remoteImgLength;
          if ((k > 0) && (g.this.qDX.qFs != null))
          {
            v2protocal localv2protocal = g.this.qDX.qFr;
            localv2protocal.qKF += 1;
            g.this.qDX.qFs.a(i, j, k / 4, g.this.qDX.qFr.qKi);
          }
        }
        try
        {
          Thread.sleep(20L);
        }
        catch (InterruptedException localInterruptedException)
        {
          w.printErrStackTrace("MicroMsg.Voip.VoipDeviceHandler", localInterruptedException, "", new Object[0]);
        }
      }
      GMTrace.o(5246839422976L, 39092);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */