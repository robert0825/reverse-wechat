package com.tencent.mm.plugin.multitalk.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.video.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class b
  implements e.a, HeadsetPlugReceiver.a
{
  com.tencent.mm.compatible.util.b hez;
  boolean isStart;
  boolean mkA;
  com.tencent.mm.plugin.voip.model.b mkm;
  final Object mkn;
  HeadsetPlugReceiver mkv;
  boolean mkz;
  private int nlV;
  
  public b()
  {
    GMTrace.i(4764058255360L, 35495);
    this.mkm = null;
    this.mkn = new Object();
    this.isStart = false;
    this.mkA = false;
    this.mkz = false;
    this.hez = new com.tencent.mm.compatible.util.b(ab.getContext());
    this.mkv = new HeadsetPlugReceiver();
    GMTrace.o(4764058255360L, 35495);
  }
  
  private boolean aQT()
  {
    GMTrace.i(17439043616768L, 129931);
    if (o.aRR().mjp.bwb())
    {
      if (!this.mkA)
      {
        GMTrace.o(17439043616768L, 129931);
        return true;
      }
      GMTrace.o(17439043616768L, 129931);
      return false;
    }
    GMTrace.o(17439043616768L, 129931);
    return false;
  }
  
  public final void dc(int paramInt)
  {
    GMTrace.i(4764460908544L, 35498);
    w.i("MicroMsg.MT.MultiTalkAudioPlayer", "onBluetoothHeadsetStateChange, status: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      this.nlV = paramInt;
      GMTrace.o(4764460908544L, 35498);
      return;
      this.mkz = true;
      at.AS().sf();
      continue;
      if (paramInt != this.nlV)
      {
        this.mkz = true;
        fn(false);
        o.aRR().gm(false);
        continue;
        if (paramInt != this.nlV)
        {
          this.mkz = false;
          boolean bool = aQT();
          fn(bool);
          o.aRR().gm(bool);
          continue;
          if (paramInt != this.nlV)
          {
            this.mkz = false;
            at.AS().sg();
            bool = aQT();
            fn(bool);
            o.aRR().gm(bool);
          }
        }
      }
    }
  }
  
  public final void fn(boolean paramBoolean)
  {
    GMTrace.i(4764192473088L, 35496);
    w.i("MicroMsg.MT.MultiTalkAudioPlayer", "setSpeakerPhoneOn, isSpeakerPhoneOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    at.AS().aL(paramBoolean);
    if ((this.mkm != null) && (this.mkm.qDU)) {
      this.mkm.it(paramBoolean);
    }
    GMTrace.o(4764192473088L, 35496);
  }
  
  public final void fp(boolean paramBoolean)
  {
    boolean bool = false;
    GMTrace.i(4764326690816L, 35497);
    if (this.mkA != paramBoolean)
    {
      this.mkA = paramBoolean;
      w.i("MicroMsg.MT.MultiTalkAudioPlayer", "onHeadsetState: isHeadsetPlugged" + paramBoolean);
      if (!o.aRR().mjp.bwb()) {
        break label100;
      }
      if (this.mkA) {
        break label95;
      }
      paramBoolean = true;
      if (!this.mkz) {
        break label105;
      }
      paramBoolean = bool;
    }
    label95:
    label100:
    label105:
    for (;;)
    {
      fn(paramBoolean);
      o.aRR().gm(paramBoolean);
      GMTrace.o(4764326690816L, 35497);
      return;
      paramBoolean = false;
      break;
      paramBoolean = false;
      break;
    }
  }
  
  final class a
    implements Runnable
  {
    private com.tencent.mm.plugin.voip.model.b mkr;
    
    public a(com.tencent.mm.plugin.voip.model.b paramb)
    {
      GMTrace.i(4763252948992L, 35489);
      this.mkr = null;
      this.mkr = paramb;
      GMTrace.o(4763252948992L, 35489);
    }
    
    public final void run()
    {
      GMTrace.i(4763387166720L, 35490);
      if (this.mkr != null)
      {
        this.mkr.btC();
        this.mkr.btz();
        this.mkr = null;
        at.AS().sr();
        at.AS().setMode(0);
      }
      GMTrace.o(4763387166720L, 35490);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */