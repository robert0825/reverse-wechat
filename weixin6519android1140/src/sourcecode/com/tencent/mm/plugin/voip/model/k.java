package com.tencent.mm.plugin.voip.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  public static k qHZ;
  v2protocal qHR;
  boolean qHS;
  public a qHT;
  public int qHU;
  public boolean qHV;
  int qHW;
  public int qHX;
  public int qHY;
  public aj qIa;
  
  private k()
  {
    GMTrace.i(5320390737920L, 39640);
    this.qHS = false;
    this.qHU = -1;
    this.qHV = false;
    this.qHW = 0;
    this.qIa = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5314485157888L, 39596);
        if (!k.this.qHV)
        {
          GMTrace.o(5314485157888L, 39596);
          return false;
        }
        k localk = k.this;
        byte[] arrayOfByte = new byte[4];
        int i;
        if (localk.qHR.setAppCmd(10, arrayOfByte, 4) < 0)
        {
          w.d("MicroMsg.VoipNetStatusChecker", "get netStatus failed");
          i = -1;
          if (i != -1)
          {
            k.this.qHU = i;
            k.this.qHX = (k.this.qHU + k.this.qHX);
            localk = k.this;
            localk.qHY += 1;
            localk = k.this;
            if (localk.qHU >= 5) {
              break label199;
            }
            localk.qHW = 0;
            if (!localk.qHS)
            {
              localk.qHS = true;
              w.d("MicroMsg.VoipNetStatusChecker", "go to bad net status");
              if (localk.qHT != null) {
                localk.qHT.aHM();
              }
            }
          }
        }
        for (;;)
        {
          GMTrace.o(5314485157888L, 39596);
          return true;
          i = bg.byteArrayToInt(arrayOfByte);
          w.d("MicroMsg.VoipNetStatusChecker", "netStatus: %d", new Object[] { Integer.valueOf(i) });
          break;
          label199:
          if (localk.qHS) {
            if (localk.qHW <= 0)
            {
              w.d("MicroMsg.VoipNetStatusChecker", "ignore this good net status");
              localk.qHW += 1;
            }
            else
            {
              localk.qHS = false;
              w.d("MicroMsg.VoipNetStatusChecker", "go to good net status");
              if (localk.qHT != null) {
                localk.qHT.aHN();
              }
            }
          }
        }
      }
    }, true);
    this.qHR = new v2protocal(new ae(Looper.getMainLooper()));
    GMTrace.o(5320390737920L, 39640);
  }
  
  public static k buC()
  {
    GMTrace.i(5320256520192L, 39639);
    if (qHZ == null) {
      qHZ = new k();
    }
    k localk = qHZ;
    GMTrace.o(5320256520192L, 39639);
    return localk;
  }
  
  public final void buD()
  {
    GMTrace.i(5320524955648L, 39641);
    w.d("MicroMsg.VoipNetStatusChecker", "startNetStatusCheck");
    this.qHU = -1;
    this.qHV = true;
    this.qHY = 0;
    this.qHX = 0;
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5277441064960L, 39320);
        k.this.qIa.z(2000L, 2000L);
        GMTrace.o(5277441064960L, 39320);
      }
    }, 3000L);
    GMTrace.o(5320524955648L, 39641);
  }
  
  public final void buE()
  {
    GMTrace.i(5320659173376L, 39642);
    w.d("MicroMsg.VoipNetStatusChecker", "stopNetStatusCheck");
    this.qHU = -1;
    this.qHS = false;
    this.qHV = false;
    this.qHY = 0;
    this.qHX = 0;
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5326162100224L, 39683);
        k.this.qIa.stopTimer();
        GMTrace.o(5326162100224L, 39683);
      }
    });
    GMTrace.o(5320659173376L, 39642);
  }
  
  public static abstract interface a
  {
    public abstract void aHM();
    
    public abstract void aHN();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */