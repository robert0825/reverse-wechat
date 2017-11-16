package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public boolean isStart;
  public boolean jGN;
  public com.tencent.mm.e.b.c mkC;
  public final Object mkD;
  public int mkE;
  boolean mkF;
  int mkG;
  public boolean mkH;
  com.tencent.mm.e.b.c.a mkI;
  
  public c()
  {
    GMTrace.i(11607014899712L, 86479);
    this.mkC = null;
    this.mkD = new Object();
    this.isStart = false;
    this.jGN = false;
    this.mkE = 92;
    this.mkF = true;
    this.mkG = 0;
    this.mkH = true;
    this.mkI = new com.tencent.mm.e.b.c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(11604196327424L, 86458);
        GMTrace.o(11604196327424L, 86458);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        int j = 0;
        GMTrace.i(11604062109696L, 86457);
        synchronized (c.this.mkD)
        {
          c localc = c.this;
          if (localc.mkE <= 10) {
            localc.mkE = 92;
          }
          a locala = i.aIr().mks;
          if (locala.mkm != null) {}
          for (int i = locala.mkm.btB();; i = 0)
          {
            localc.mkE = ((i + 24 + localc.mkE * 3) / 4);
            if (!localc.mkF) {
              break;
            }
            w.i("MicroMsg.IPCallRecorder", "preprocessForEcho FirstRefEcho");
            locala = i.aIr().mks;
            i = j;
            if (locala.mkm != null) {
              i = locala.mkm.bty();
            }
            localc.mkG = i;
            if (localc.mkG >= localc.mkE) {
              localc.mkG -= localc.mkE;
            }
            localc.mkE = localc.mkG;
            localc.mkF = false;
            if (i.aIs().miI == 5)
            {
              if (c.this.mkH)
              {
                w.i("MicroMsg.IPCallRecorder", "isFirstRecordCallback");
                c.this.mkH = false;
              }
              i.aIp().mkO.recordCallback(paramAnonymousArrayOfByte, paramAnonymousInt, c.this.mkE);
            }
            GMTrace.o(11604062109696L, 86457);
            return;
          }
          localc.mkE = 0;
        }
      }
    };
    this.isStart = false;
    GMTrace.o(11607014899712L, 86479);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(11607149117440L, 86480);
    w.i("MicroMsg.IPCallRecorder", "setMute: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.isStart) && (this.mkC != null)) {
      this.mkC.aC(paramBoolean);
    }
    this.jGN = paramBoolean;
    GMTrace.o(11607149117440L, 86480);
  }
  
  private final class a
    implements Runnable
  {
    private com.tencent.mm.e.b.c mkK;
    
    public a(com.tencent.mm.e.b.c paramc)
    {
      GMTrace.i(11605941157888L, 86471);
      this.mkK = null;
      this.mkK = paramc;
      GMTrace.o(11605941157888L, 86471);
    }
    
    public final void run()
    {
      GMTrace.i(11606075375616L, 86472);
      w.d("MicroMsg.IPCallRecorder", "do stopRecord");
      if (this.mkK != null)
      {
        this.mkK.qn();
        this.mkK = null;
        c localc = c.this;
        localc.mkE = 92;
        localc.mkF = true;
        localc.mkG = 0;
      }
      GMTrace.o(11606075375616L, 86472);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */