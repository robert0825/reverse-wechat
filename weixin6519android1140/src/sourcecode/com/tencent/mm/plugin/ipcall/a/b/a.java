package com.tencent.mm.plugin.ipcall.a.b;

import android.media.AudioManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.b;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class a
{
  public boolean isStart;
  public b mkm;
  public final Object mkn;
  public int mko;
  public boolean mkp;
  
  public a()
  {
    GMTrace.i(11607954423808L, 86486);
    this.mkm = null;
    this.mkn = new Object();
    this.isStart = false;
    this.mko = 0;
    this.mkp = false;
    GMTrace.o(11607954423808L, 86486);
  }
  
  public static boolean sm()
  {
    GMTrace.i(11608222859264L, 86488);
    boolean bool = at.AS().fMS.isSpeakerphoneOn();
    GMTrace.o(11608222859264L, 86488);
    return bool;
  }
  
  public final void fn(boolean paramBoolean)
  {
    GMTrace.i(11608088641536L, 86487);
    w.i("MicroMsg.IPCallAudioPlayer", "setSpeakerPhoneOn, old isSpeakerPhoneOn: %b, new isSpeakerPhoneOn: %b", new Object[] { Boolean.valueOf(this.mkp), Boolean.valueOf(paramBoolean) });
    at.AS().aL(paramBoolean);
    com.tencent.mm.plugin.ipcall.a.c.a locala = i.aIp();
    if (paramBoolean) {}
    for (int i = locala.mkO.qZ(401);; i = locala.mkO.qZ(402))
    {
      if (i < 0) {
        w.e("MicroMsg.IPCallEngineManager", "setSpeakerPhoneOn, failed, ret: %d", new Object[] { Integer.valueOf(i) });
      }
      if (paramBoolean != this.mkp)
      {
        this.mkp = paramBoolean;
        if ((this.mkm != null) && (this.mkm.qDU)) {
          this.mkm.it(paramBoolean);
        }
      }
      GMTrace.o(11608088641536L, 86487);
      return;
    }
  }
  
  public final class a
    implements Runnable
  {
    private b mkr;
    
    public a(b paramb)
    {
      GMTrace.i(11607551770624L, 86483);
      this.mkr = null;
      this.mkr = paramb;
      GMTrace.o(11607551770624L, 86483);
    }
    
    public final void run()
    {
      GMTrace.i(11607685988352L, 86484);
      if (this.mkr != null)
      {
        this.mkr.btC();
        this.mkr.btz();
        this.mkr = null;
        a.this.mkp = false;
      }
      at.AS().setMode(0);
      GMTrace.o(11607685988352L, 86484);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */