package com.tencent.mm.plugin.ipcall.a.c;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bm.b;
import com.tencent.mm.plugin.ipcall.a.d.o;
import com.tencent.mm.plugin.ipcall.a.g;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.bpo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class a
{
  public v2protocal mkO;
  private ae mkP;
  private boolean mkQ;
  public boolean mkR;
  public boolean mkS;
  public a mkT;
  
  public a()
  {
    GMTrace.i(11569433935872L, 86199);
    this.mkQ = false;
    this.mkR = false;
    this.mkS = false;
    this.mkT = null;
    this.mkP = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11571715637248L, 86216);
        if ((paramAnonymousMessage == null) || (paramAnonymousMessage.what != 59998))
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(11571715637248L, 86216);
          return;
        }
        w.d("MicroMsg.IPCallEngineManager", "msg.what: %d, msg.obj: %s, msg.arg1: %s, msg.arg2: %s", new Object[] { Integer.valueOf(paramAnonymousMessage.what), paramAnonymousMessage.obj, Integer.valueOf(paramAnonymousMessage.arg1), Integer.valueOf(paramAnonymousMessage.arg2) });
        switch (paramAnonymousMessage.arg1)
        {
        }
        for (;;)
        {
          GMTrace.o(11571715637248L, 86216);
          return;
          paramAnonymousMessage = a.this;
          w.d("MicroMsg.IPCallEngineManager", "channel connect!");
          if (paramAnonymousMessage.mkR)
          {
            w.d("MicroMsg.IPCallEngineManager", "channel already connect! do call not startEngine again");
            GMTrace.o(11571715637248L, 86216);
            return;
          }
          int i = paramAnonymousMessage.mkO.startEngine();
          w.d("MicroMsg.IPCallEngineManager", "startNativeEngine, ret: %d", new Object[] { Integer.valueOf(i) });
          if (i == 0) {}
          for (paramAnonymousMessage.mkO.qJQ = 0;; paramAnonymousMessage.mkO.qJQ = 1)
          {
            paramAnonymousMessage.mkO.setInactive();
            paramAnonymousMessage.mkR = true;
            if (paramAnonymousMessage.mkT != null) {
              paramAnonymousMessage.mkT.aHL();
            }
            GMTrace.o(11571715637248L, 86216);
            return;
          }
          w.d("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEV");
          GMTrace.o(11571715637248L, 86216);
          return;
          w.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEVFAILED");
          paramAnonymousMessage = a.this;
          w.d("MicroMsg.IPCallEngineManager", "handleStartDevFailed");
          if (paramAnonymousMessage.mkT != null) {
            paramAnonymousMessage.mkT.aHK();
          }
          GMTrace.o(11571715637248L, 86216);
          return;
          w.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_RESET");
          if (paramAnonymousMessage.arg2 == 4)
          {
            w.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_BROKEN");
            a.this.po(34);
            GMTrace.o(11571715637248L, 86216);
            return;
          }
          if (paramAnonymousMessage.arg2 == 1)
          {
            w.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_FAIL");
            a.this.po(20);
            GMTrace.o(11571715637248L, 86216);
            return;
          }
          if (paramAnonymousMessage.arg2 == 5)
          {
            w.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_NETWORK_ERROR");
            a.this.po(30);
            GMTrace.o(11571715637248L, 86216);
            return;
            w.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_FIRST_PKT");
            GMTrace.o(11571715637248L, 86216);
            return;
            w.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_ANSWER_MARK");
            w.i("MicroMsg.IPCallEngineManager", "handleChannelAccept");
            paramAnonymousMessage = i.aIo();
            w.i("MicroMsg.IPCallSvrLogic", "handleChannelAccept");
            if (paramAnonymousMessage.eQN)
            {
              w.i("MicroMsg.IPCallSvrLogic", "current status has accepted, ignore channel accept");
              GMTrace.o(11571715637248L, 86216);
              return;
            }
            paramAnonymousMessage.mja = true;
            if (paramAnonymousMessage.miY != null)
            {
              paramAnonymousMessage.miY.idN = 2;
              o localo = new o(paramAnonymousMessage.miY.mjF, paramAnonymousMessage.miY.mjG, paramAnonymousMessage.miY.aIF(), paramAnonymousMessage.miY.mjH, true);
              at.wS().a(localo, 0);
            }
            paramAnonymousMessage.pn(2);
          }
        }
      }
    };
    this.mkO = new v2protocal(this.mkP);
    GMTrace.o(11569433935872L, 86199);
  }
  
  public final void aIJ()
  {
    GMTrace.i(11569568153600L, 86200);
    w.d("MicroMsg.IPCallEngineManager", "setChannelActiveAfterAccept");
    if (!this.mkR) {
      w.d("MicroMsg.IPCallEngineManager", "channel not connect now");
    }
    this.mkO.setActive();
    GMTrace.o(11569568153600L, 86200);
  }
  
  public final void aIK()
  {
    GMTrace.i(11569702371328L, 86201);
    if (this.mkQ)
    {
      w.d("MicroMsg.IPCallEngineManager", "requestChannelConnect, already request channel connect");
      GMTrace.o(11569702371328L, 86201);
      return;
    }
    w.i("MicroMsg.IPCallEngineManager", "requestChannelConnect");
    com.tencent.mm.plugin.ipcall.a.a.c localc = i.aIo().miY;
    if (localc != null)
    {
      if (localc.iYB != null)
      {
        bof localbof1 = com.tencent.mm.plugin.ipcall.b.c.Y(localc.iYB);
        bof localbof2 = com.tencent.mm.plugin.ipcall.b.c.Y(localc.mkd);
        bpo localbpo = new bpo();
        localbpo.uZI = 0;
        localbpo.uZJ = 0;
        localbpo.uZK = 0;
        localbpo.userName = "";
        localbpo.lnX = "";
        this.mkO.a(localbof1, localbof1, localbof2, localbpo);
      }
      w.d("MicroMsg.IPCallEngineManager", "finish set svr addr");
      this.mkO.qJu = localc.mjY;
      this.mkO.qKm = localc.mkb;
      if (localc.mkc != null) {
        this.mkO.qKn = localc.mkc.toByteArray();
      }
      if (localc.mjZ != null) {
        this.mkO.qJv = localc.mjZ.toByteArray();
      }
      this.mkO.mjF = localc.mjF;
      this.mkO.mjG = localc.mjG;
      this.mkO.mjN = localc.mjN;
      this.mkO.qJx = localc.mjW;
      this.mkO.qJw = localc.mjX;
      this.mkO.qJy = localc.mke;
      if (this.mkO.qJv != null) {
        break label450;
      }
    }
    label450:
    for (int i = 0;; i = this.mkO.qJv.length)
    {
      i = this.mkO.setConfigConnect(this.mkO.qJp, this.mkO.mjF, this.mkO.mjN, this.mkO.mjG, this.mkO.field_peerId, 1, this.mkO.qJw, this.mkO.qJx, this.mkO.qJu, i, this.mkO.qJv, this.mkO.qJy, 0, 0, this.mkO.qKm, this.mkO.qKn, 255, 0);
      w.d("MicroMsg.IPCallEngineManager", "setConfigConnect, ret: %d", new Object[] { Integer.valueOf(i) });
      if (i < 0)
      {
        w.e("MicroMsg.IPCallEngineManager", "setConfigConnect failed, ret: %d", new Object[] { Integer.valueOf(i) });
        if (this.mkT != null) {
          this.mkT.pj(21);
        }
      }
      this.mkQ = true;
      GMTrace.o(11569702371328L, 86201);
      return;
    }
  }
  
  public final void aIL()
  {
    GMTrace.i(11569970806784L, 86203);
    this.mkR = false;
    this.mkQ = false;
    this.mkS = false;
    GMTrace.o(11569970806784L, 86203);
  }
  
  public final void po(int paramInt)
  {
    GMTrace.i(16062372380672L, 119674);
    w.d("MicroMsg.IPCallEngineManager", "channel connect failed!");
    if (this.mkT != null) {
      this.mkT.pj(paramInt);
    }
    GMTrace.o(16062372380672L, 119674);
  }
  
  public final void pp(int paramInt)
  {
    GMTrace.i(11569836589056L, 86202);
    if (!this.mkR)
    {
      GMTrace.o(11569836589056L, 86202);
      return;
    }
    w.d("MicroMsg.IPCallEngineManager", "setDtmfPayloadType: %d", new Object[] { Integer.valueOf(paramInt) });
    paramInt = this.mkO.SetDTMFPayload(paramInt);
    if (paramInt < 0) {
      w.i("MicroMsg.IPCallEngineManager", "setDtmfPayloadType failed, ret: %d", new Object[] { Integer.valueOf(paramInt) });
    }
    GMTrace.o(11569836589056L, 86202);
  }
  
  public static abstract interface a
  {
    public abstract void aHK();
    
    public abstract void aHL();
    
    public abstract void pj(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */