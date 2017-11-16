package com.tencent.mm.plugin.voip_cs.b.b;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip_cs.b.d;
import com.tencent.mm.protocal.c.bmx;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public final class a
{
  public v2protocal mkO;
  private ae mkP;
  public boolean mkQ;
  public boolean mkR;
  public a qSK;
  
  public a()
  {
    GMTrace.i(11252814315520L, 83840);
    this.mkQ = false;
    this.mkR = false;
    this.qSK = null;
    this.mkP = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11253216968704L, 83843);
        if (paramAnonymousMessage == null)
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(11253216968704L, 83843);
          return;
        }
        w.d("MicroMsg.VoipCSEngine", "msg.what: %d, msg.obj: %s, msg.arg1: %s, msg.arg2: %s", new Object[] { Integer.valueOf(paramAnonymousMessage.what), paramAnonymousMessage.obj, Integer.valueOf(paramAnonymousMessage.arg1), Integer.valueOf(paramAnonymousMessage.arg2) });
        int i;
        switch (paramAnonymousMessage.arg1)
        {
        default: 
          GMTrace.o(11253216968704L, 83843);
          return;
        case 6: 
          w.i("MicroMsg.VoipCSEngine", "jni throw NOTIFY_FROM_JNI_CHANNEL_CONNECTED");
          paramAnonymousMessage = com.tencent.mm.plugin.voip_cs.b.b.bwq();
          w.d("MicroMsg.VoipCSReportHelper", "channelConnect");
          paramAnonymousMessage.qRy = 1;
          paramAnonymousMessage = a.this;
          w.i("MicroMsg.VoipCSEngine", "channel connect!");
          if (paramAnonymousMessage.mkR)
          {
            w.i("MicroMsg.VoipCSEngine", "channel already connect! do call not startEngine again");
            GMTrace.o(11253216968704L, 83843);
            return;
          }
          paramAnonymousMessage.mkR = true;
          w.i("MicroMsg.VoipCSEngine", "start engine");
          paramAnonymousMessage.mkO.setInactive();
          w.d("MicroMsg.VoipCSEngine", "setChannelActiveAfterAccept");
          if (!paramAnonymousMessage.mkR) {
            w.d("MicroMsg.VoipCSEngine", "channel not connect now");
          }
          paramAnonymousMessage.mkO.setActive();
          i = paramAnonymousMessage.mkO.startEngine();
          if (i == 0)
          {
            w.i("MicroMsg.VoipCSEngine", "start engine suc!");
            localObject1 = new int[2];
            localObject1[0] = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qKw;
            localObject1[1] = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qKx;
            Object localObject2 = ByteBuffer.allocate(8);
            ((ByteBuffer)localObject2).asIntBuffer().put((int[])localObject1);
            localObject2 = ((ByteBuffer)localObject2).array();
            if (com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.setAppCmd(34, (byte[])localObject2, 2) < 0) {
              w.i("MicroMsg.VoipCSEngine", "setAppCmd: type:34,qosparam:" + localObject1[0] + "," + localObject1[1] + ",ret:" + i);
            }
          }
          for (com.tencent.mm.plugin.voip_cs.b.b.bwq().qRw = 1;; com.tencent.mm.plugin.voip_cs.b.b.bwq().qRw = 0)
          {
            if ((paramAnonymousMessage.qSK != null) && (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb != 2))
            {
              paramAnonymousMessage.qSK.aHL();
              com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb = 2;
            }
            GMTrace.o(11253216968704L, 83843);
            return;
            w.i("MicroMsg.VoipCSEngine", "start engine fail!");
          }
        case 5: 
          w.i("MicroMsg.VoipCSEngine", "jni throw NOTIFY_FROM_JNI_RESET");
          if (paramAnonymousMessage.arg2 == 4)
          {
            w.i("MicroMsg.VoipCSEngine", "channel broken...");
            com.tencent.mm.plugin.voip_cs.b.b.bwq().qRv = 1;
          }
          for (;;)
          {
            paramAnonymousMessage = a.this;
            w.i("MicroMsg.VoipCSEngine", "channel connect failed!");
            com.tencent.mm.plugin.voip_cs.b.b.bwq().aGU = 1;
            if (paramAnonymousMessage.qSK != null) {
              paramAnonymousMessage.qSK.bwE();
            }
            GMTrace.o(11253216968704L, 83843);
            return;
            if (paramAnonymousMessage.arg2 == 5)
            {
              w.i("MicroMsg.VoipCSEngine", "channel event network failer...");
              com.tencent.mm.plugin.voip_cs.b.b.bwq().qRv = 6;
            }
            else
            {
              w.i("MicroMsg.VoipCSEngine", "channel connect fail...");
              com.tencent.mm.plugin.voip_cs.b.b.bwq().qRv = 5;
            }
          }
        case 3: 
          w.d("MicroMsg.VoipCSEngine", "start dev!");
          GMTrace.o(11253216968704L, 83843);
          return;
        case 1: 
          GMTrace.o(11253216968704L, 83843);
          return;
        case 4: 
          GMTrace.o(11253216968704L, 83843);
          return;
        case 100: 
          com.tencent.mm.plugin.voip.b.a.a((byte[])paramAnonymousMessage.obj, "MicroMsg.VoipCSEngine", paramAnonymousMessage.arg2);
          GMTrace.o(11253216968704L, 83843);
          return;
        case 101: 
          com.tencent.mm.plugin.voip.b.a.a((byte[])paramAnonymousMessage.obj, "MicroMsg.VoipCSEngine-JNI_CORE", paramAnonymousMessage.arg2);
          GMTrace.o(11253216968704L, 83843);
          return;
        }
        Object localObject1 = (byte[])paramAnonymousMessage.obj;
        paramAnonymousMessage = a.this;
        for (;;)
        {
          try
          {
            localObject1 = (bmx)new bmx().aD((byte[])localObject1);
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipCSEngine", "steve: onRecvRUDPCmd:" + ((bmx)localObject1).uWZ);
            i = ((bmx)localObject1).uWZ;
            switch (i)
            {
            default: 
              GMTrace.o(11253216968704L, 83843);
              return;
            }
            if (((bmx)localObject1).uXa == null) {
              break label906;
            }
            localObject1 = ((bmx)localObject1).uXa.tJp;
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipCSEngine", "steve: remote new network type:" + localObject1);
            i = paramAnonymousMessage.mkO.setAppCmd(302, (byte[])localObject1, 4);
            if (i < 0) {
              com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipCSEngine", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] update remote network type " + localObject1 + "fail:" + i + ", [roomid=" + paramAnonymousMessage.mkO.qJq + ", roomkey=" + paramAnonymousMessage.mkO.mjG + "]");
            }
            GMTrace.o(11253216968704L, 83843);
            return;
          }
          catch (Exception paramAnonymousMessage)
          {
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipCSEngine", "onVoipLocalNetTypeChange Error");
          }
          break;
          label906:
          com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipCSEngine", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] empty buffer");
        }
      }
    };
    this.mkO = new v2protocal(this.mkP);
    GMTrace.o(11252814315520L, 83840);
  }
  
  public static int JX(String paramString)
  {
    GMTrace.i(11252948533248L, 83841);
    paramString = paramString.split("\\.");
    int i = bg.getInt(paramString[0], 0);
    int j = bg.getInt(paramString[1], 0);
    int k = bg.getInt(paramString[2], 0);
    int m = bg.getInt(paramString[3], 0);
    GMTrace.o(11252948533248L, 83841);
    return m + ((i << 24) + (j << 16) + (k << 8));
  }
  
  public static abstract interface a
  {
    public abstract void aHL();
    
    public abstract void bwE();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */