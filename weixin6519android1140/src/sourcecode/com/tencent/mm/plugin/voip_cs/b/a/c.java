package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class c
{
  private c.a mkI;
  public com.tencent.mm.e.b.c nlZ;
  private com.tencent.mm.plugin.voip.model.a nmc;
  public com.tencent.mm.plugin.voip.model.b qFL;
  
  public c()
  {
    GMTrace.i(11263283298304L, 83918);
    this.mkI = new c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(11263149080576L, 83917);
        w.i("MicroMsg.cs.VoipCsAudioManager", "OnPcmRecListener onRecError %d %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        GMTrace.o(11263149080576L, 83917);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(11263014862848L, 83916);
        if (paramAnonymousInt <= 0)
        {
          w.e("MicroMsg.cs.VoipCsAudioManager", "pcm data len <= 0");
          GMTrace.o(11263014862848L, 83916);
          return;
        }
        w.d("MicroMsg.cs.VoipCsAudioManager", "onRecPcmDataReady,pcm data len:" + paramAnonymousArrayOfByte.length);
        paramAnonymousInt = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.recordCallback(paramAnonymousArrayOfByte, paramAnonymousInt, 200);
        w.d("MicroMsg.cs.VoipCsAudioManager", "recordCallback,ret:" + paramAnonymousInt);
        GMTrace.o(11263014862848L, 83916);
      }
    };
    this.nmc = new com.tencent.mm.plugin.voip.model.a()
    {
      public final int x(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(11259256766464L, 83888);
        w.d("MicroMsg.cs.VoipCsAudioManager", "PlayDevDataCallBack,pcm data len:" + paramAnonymousArrayOfByte.length);
        paramAnonymousInt = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.playCallback(paramAnonymousArrayOfByte, paramAnonymousInt);
        if (paramAnonymousInt != 0) {
          w.d("MicroMsg.cs.VoipCsAudioManager", "PlayDevDataCallBack is failure! pc data:" + paramAnonymousArrayOfByte.length + ",ret:" + paramAnonymousInt);
        }
        if (paramAnonymousInt != 0)
        {
          GMTrace.o(11259256766464L, 83888);
          return 1;
        }
        GMTrace.o(11259256766464L, 83888);
        return 0;
      }
    };
    this.nlZ = new com.tencent.mm.e.b.c(v2protocal.nlR, 1, 1);
    this.nlZ.de(20);
    this.nlZ.aB(true);
    this.nlZ.qu();
    this.nlZ.j(1, false);
    this.nlZ.aA(true);
    this.nlZ.exR = this.mkI;
    this.qFL = new com.tencent.mm.plugin.voip.model.b();
    this.qFL.P(v2protocal.nlR, 20, 0);
    this.qFL.k(ab.getContext(), false);
    this.qFL.qEf = this.nmc;
    GMTrace.o(11263283298304L, 83918);
  }
  
  private boolean it(boolean paramBoolean)
  {
    GMTrace.i(11263417516032L, 83919);
    if (this.qFL != null)
    {
      paramBoolean = this.qFL.it(paramBoolean);
      GMTrace.o(11263417516032L, 83919);
      return paramBoolean;
    }
    GMTrace.o(11263417516032L, 83919);
    return false;
  }
  
  public final void iv(boolean paramBoolean)
  {
    GMTrace.i(11263551733760L, 83920);
    w.j("MicroMsg.cs.VoipCsAudioManager", "enableSpeaker: " + paramBoolean, new Object[0]);
    w.d("MicroMsg.cs.VoipCsAudioManager", "MMCore.getAudioManager() " + at.AS().sl());
    if (at.AS().sh()) {
      paramBoolean = false;
    }
    if (p.fQD.fNp)
    {
      p.fQD.dump();
      if (p.fQD.fNq > 0) {
        it(paramBoolean);
      }
    }
    if ((p.fQD.fNR >= 0) || (p.fQD.fNS >= 0)) {
      it(paramBoolean);
    }
    com.tencent.mm.plugin.voip_cs.b.b.a locala;
    if (this.qFL != null)
    {
      i = this.qFL.btE();
      at.AS().a(paramBoolean, i);
      locala = com.tencent.mm.plugin.voip_cs.b.b.bwo();
      if (!paramBoolean) {
        break label201;
      }
    }
    label201:
    for (int i = locala.mkO.qZ(401);; i = locala.mkO.qZ(402))
    {
      if (i < 0) {
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.VoipCSEngine", "voipContext trySwitchSpeakerPhone ret:" + i);
      }
      GMTrace.o(11263551733760L, 83920);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */