package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.plugin.wear.model.e.p.1;
import com.tencent.mm.plugin.wear.model.e.q;
import com.tencent.mm.protocal.c.btd;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.qqpinyin.voicerecoapi.c;
import java.io.IOException;
import java.util.LinkedList;

public class WearMessageLogic
  extends BroadcastReceiver
{
  public WearMessageLogic()
  {
    GMTrace.i(9193109061632L, 68494);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.wear.message");
    ab.getContext().registerReceiver(this, localIntentFilter, "com.tencent.mm.wear.message", null);
    GMTrace.o(9193109061632L, 68494);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(9193243279360L, 68495);
    if (paramIntent.getAction().equals("com.tencent.mm.wear.message"))
    {
      paramContext = paramIntent.getExtras();
      int i = paramContext.getInt("key_connecttype");
      if (i == 1)
      {
        paramIntent = new a();
        paramIntent.rzX = i;
        paramIntent.rzY = paramContext.getInt("key_funid");
        paramIntent.otj = paramContext.getInt("key_sessionid");
        paramIntent.rzZ = paramContext.getByteArray("key_data");
        paramContext = a.bBm().rzr.xm(paramIntent.rzY);
        if (paramContext != null) {}
        for (boolean bool = paramContext.xl(paramIntent.rzY); bool; bool = false)
        {
          af.t(paramIntent);
          GMTrace.o(9193243279360L, 68495);
          return;
        }
        e.post(paramIntent, "WearHttpMessageTask_" + paramIntent.rzY);
        GMTrace.o(9193243279360L, 68495);
        return;
      }
      if (i == 2)
      {
        paramIntent = new b();
        paramIntent.rzX = i;
        paramIntent.rzY = paramContext.getInt("key_funid");
        paramIntent.otj = paramContext.getInt("key_sessionid");
        paramIntent.rzZ = paramContext.getByteArray("key_data");
        a.bBm().rzz.a(paramIntent);
        GMTrace.o(9193243279360L, 68495);
        return;
      }
      if (i == 3) {
        a.bBm().rzz.a(new c());
      }
    }
    GMTrace.o(9193243279360L, 68495);
  }
  
  private final class a
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    public int otj;
    public int rzX;
    public int rzY;
    public byte[] rzZ;
    
    public a()
    {
      GMTrace.i(9195659198464L, 68513);
      GMTrace.o(9195659198464L, 68513);
    }
    
    protected final void execute()
    {
      GMTrace.i(9195793416192L, 68514);
      w.i("MicroMsg.Wear.WearMessageLogic", "handle message %s", new Object[] { toString() });
      com.tencent.mm.plugin.wear.model.e.a locala = a.bBm().rzr.xm(this.rzY);
      if (locala != null) {
        locala.b(this.rzX, this.otj, this.rzY, this.rzZ);
      }
      GMTrace.o(9195793416192L, 68514);
    }
    
    public final String getName()
    {
      GMTrace.i(9195927633920L, 68515);
      GMTrace.o(9195927633920L, 68515);
      return "HttpMessageTask";
    }
    
    public final String toString()
    {
      GMTrace.i(9196061851648L, 68516);
      String str = String.format("connectType=%d funId=%d sessionId=%d", new Object[] { Integer.valueOf(this.rzX), Integer.valueOf(this.rzY), Integer.valueOf(this.otj) });
      GMTrace.o(9196061851648L, 68516);
      return str;
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    public int otj;
    public int rzX;
    public int rzY;
    public byte[] rzZ;
    
    public b()
    {
      GMTrace.i(9182640078848L, 68416);
      GMTrace.o(9182640078848L, 68416);
    }
    
    protected final void execute()
    {
      GMTrace.i(9182774296576L, 68417);
      switch (this.rzY)
      {
      }
      for (;;)
      {
        GMTrace.o(9182774296576L, 68417);
        return;
        p localp = a.bBm().rzt.rzM;
        int i = this.otj;
        Object localObject = this.rzZ;
        if (localp.rAI.contains(Integer.valueOf(i))) {
          continue;
        }
        btd localbtd = new btd();
        try
        {
          localbtd.aD((byte[])localObject);
          if (localp.rAG == i)
          {
            if (localbtd.vbY)
            {
              w.i("MicroMsg.Wear.VoiceToTextServer", "cancel session %d", new Object[] { Integer.valueOf(i) });
              localp.reset();
              GMTrace.o(9182774296576L, 68417);
              return;
            }
            if (localbtd.vbX)
            {
              localp.a(i, localbtd);
              if (localp.rAE != null)
              {
                localp.rAE.qI();
                localp.rAE = null;
                w.i("MicroMsg.Wear.VoiceToTextServer", "finish speex compress");
              }
              if (localp.rAD != null)
              {
                localp.rAD.stop();
                localp.rAD = null;
                w.i("MicroMsg.Wear.VoiceToTextServer", "finish voiceDetectAPI");
              }
              if (localp.rAC != null)
              {
                localp.rAC.hdn = true;
                if (!localp.eYr) {
                  at.wS().a(localp.rAC, 0);
                }
                localp.rAC = null;
                w.i("MicroMsg.Wear.VoiceToTextServer", "finish netSceneVoiceToText");
              }
              GMTrace.o(9182774296576L, 68417);
              return;
            }
            localp.a(i, localbtd);
            GMTrace.o(9182774296576L, 68417);
            return;
          }
          localp.reset();
          localp.rAG = i;
          w.i("MicroMsg.Wear.VoiceToTextServer", "startNewSession %s", new Object[] { Integer.valueOf(localp.rAG) });
          com.tencent.mm.loader.stub.b.deleteFile(p.rAB);
          if (localp.rAE == null)
          {
            localp.rAE = new com.tencent.mm.e.c.d();
            localp.rAE.bU(p.rAB);
          }
          if (localp.rAD == null)
          {
            localp.rAD = new c(1500000);
            if (localp.rAD.start() != 0)
            {
              localp.rAH = -2;
              GMTrace.o(9182774296576L, 68417);
              return;
            }
          }
          localObject = localbtd.vbv;
          if (localp.rAC == null) {
            af.t(new p.1(localp, (String)localObject));
          }
          localp.a(i, localbtd);
        }
        catch (IOException localIOException)
        {
          for (;;) {}
        }
      }
    }
    
    public final String getName()
    {
      GMTrace.i(9182908514304L, 68418);
      GMTrace.o(9182908514304L, 68418);
      return "LongConnectTask";
    }
  }
  
  private final class c
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    public c()
    {
      GMTrace.i(18827928666112L, 140279);
      GMTrace.o(18827928666112L, 140279);
    }
    
    protected final void execute()
    {
      GMTrace.i(18828062883840L, 140280);
      if (a.bBm().rzt.bBs() != null) {
        a.bBm().rzt.bBs().bBv();
      }
      GMTrace.o(18828062883840L, 140280);
    }
    
    public final String getName()
    {
      GMTrace.i(18828197101568L, 140281);
      GMTrace.o(18828197101568L, 140281);
      return "RefreshConnectTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\WearMessageLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */