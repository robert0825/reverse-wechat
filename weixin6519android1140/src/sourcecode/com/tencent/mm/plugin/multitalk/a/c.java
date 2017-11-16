package com.tencent.mm.plugin.multitalk.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.s;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

public final class c
  implements com.tencent.mm.ad.e
{
  public c.a eyi;
  public com.tencent.pb.talkroom.sdk.d nlX;
  public b nlY;
  public com.tencent.mm.e.b.c nlZ;
  public com.tencent.pb.talkroom.sdk.c nma;
  public com.tencent.pb.talkroom.sdk.b nmb;
  public com.tencent.mm.plugin.voip.model.a nmc;
  
  public c()
  {
    GMTrace.i(4767682134016L, 35522);
    this.eyi = new c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4749831176192L, 35389);
        w.i("MicroMsg.MT.MultiTalkEngine", "OnPcmRecListener onRecError %d %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        GMTrace.o(4749831176192L, 35389);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(4749696958464L, 35388);
        if (paramAnonymousInt <= 0)
        {
          w.e("MicroMsg.MT.MultiTalkEngine", "pcm data len <= 0");
          GMTrace.o(4749696958464L, 35388);
          return;
        }
        if (c.this.nma != null) {
          c.this.nma.C(paramAnonymousArrayOfByte, paramAnonymousInt);
        }
        GMTrace.o(4749696958464L, 35388);
      }
    };
    this.nmc = new com.tencent.mm.plugin.voip.model.a()
    {
      public final int x(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(4739899064320L, 35315);
        if (c.this.nmb != null) {}
        for (paramAnonymousInt = c.this.nmb.B(paramAnonymousArrayOfByte, paramAnonymousInt);; paramAnonymousInt = 0)
        {
          if (paramAnonymousInt < 0)
          {
            GMTrace.o(4739899064320L, 35315);
            return -1;
          }
          GMTrace.o(4739899064320L, 35315);
          return 0;
        }
      }
    };
    w.i("MicroMsg.MT.MultiTalkEngine", "init multiTalk engine");
    Context localContext = ab.getContext();
    com.tencent.wecall.talkroom.model.e locale = com.tencent.wecall.talkroom.model.e.crs();
    com.tencent.wecall.talkroom.model.e.il(localContext);
    this.nlX = locale;
    this.nlX.cna();
    this.nlY = new b();
    int i = bg.e((Integer)at.AP().get(1));
    this.nlX.a(o.aRR(), new com.tencent.pb.talkroom.sdk.e()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.pb.talkroom.sdk.b paramAnonymousb)
      {
        GMTrace.i(4769695399936L, 35537);
        c.this.nmb = paramAnonymousb;
        paramAnonymousb = c.this.nlY;
        com.tencent.mm.plugin.voip.model.a locala = c.this.nmc;
        if (paramAnonymousb.isStart)
        {
          w.d("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay, already start");
          paramAnonymousInt1 = -1;
        }
        for (;;)
        {
          w.i("MicroMsg.MT.MultiTalkEngine", "isSpeakerOn=%b isHandsFree=%b", new Object[] { Boolean.valueOf(at.AS().sm()), Boolean.valueOf(o.aRR().nmk) });
          if (at.AS().sm() != o.aRR().nmk) {
            c.this.nlY.fn(o.aRR().nmk);
          }
          GMTrace.o(4769695399936L, 35537);
          return paramAnonymousInt1;
          w.i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay");
          if (paramAnonymousb.mkm == null)
          {
            paramAnonymousb.mkm = new com.tencent.mm.plugin.voip.model.b();
            paramAnonymousb.mkm.P(paramAnonymousInt1, paramAnonymousInt2, 0);
          }
          paramAnonymousb.mkm.k(ab.getContext(), false);
          paramAnonymousb.mkm.qEf = locala;
          at.AS().a(paramAnonymousb);
          paramAnonymousb.mkA = at.AS().sn();
          paramAnonymousb.mkz = at.AS().sh();
          w.i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b", new Object[] { Boolean.valueOf(paramAnonymousb.mkA), Boolean.valueOf(paramAnonymousb.mkz) });
          paramAnonymousInt1 = paramAnonymousb.mkm.btA();
          paramAnonymousb.hez.requestFocus();
          paramAnonymousb.mkv.a(ab.getContext(), paramAnonymousb);
          paramAnonymousb.isStart = true;
        }
      }
      
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.pb.talkroom.sdk.c paramAnonymousc)
      {
        GMTrace.i(4769829617664L, 35538);
        c.this.nma = paramAnonymousc;
        c.this.nlZ = new com.tencent.mm.e.b.c(paramAnonymousInt1, 1, 7);
        c.this.nlZ.de(paramAnonymousInt2);
        c.this.nlZ.aB(true);
        c.this.nlZ.qu();
        c.this.nlZ.exG = -19;
        c.this.nlZ.j(1, false);
        c.this.nlZ.aA(true);
        c.this.nlZ.exR = c.this.eyi;
        if (c.this.nlZ.qw())
        {
          GMTrace.o(4769829617664L, 35538);
          return 1;
        }
        GMTrace.o(4769829617664L, 35538);
        return -1;
      }
      
      public final boolean aQU()
      {
        GMTrace.i(4769158529024L, 35533);
        int i = l.sK();
        w.i("MicroMsg.MT.MultiTalkEngine", "loadVoipCodecLib cpuFlag:" + i);
        if ((i & 0x400) != 0) {
          com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v7a.so");
        }
        for (;;)
        {
          GMTrace.o(4769158529024L, 35533);
          return true;
          if ((i & 0x200) != 0) {
            com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec.so");
          } else {
            com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v5.so");
          }
        }
      }
      
      public final int aQV()
      {
        GMTrace.i(4769426964480L, 35535);
        at.AR();
        String str = com.tencent.mm.y.c.xi().bUq();
        p.dO(str);
        w.i("MicroMsg.MT.MultiTalkEngine", "MTSDK audioAdapter startRecord setMultiTalkAppCmd info: " + str);
        int i = c.this.nlX.a(p.fQD.fNC, p.fQD.fNE, p.fQD.fND, p.fQD.fNF, p.fQD.fNI, p.fQD.fNJ, p.fQD.fNK, p.fQD.fNL, p.fQD.fNz, p.fQD.fNA, p.fQD.fOb, p.fQD.fOc, p.fQD.fOd, p.fQD.fOe);
        GMTrace.o(4769426964480L, 35535);
        return i;
      }
      
      public final boolean aQW()
      {
        GMTrace.i(4769963835392L, 35539);
        w.i("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkPlayer");
        b localb = c.this.nlY;
        if (localb.isStart) {
          w.i("MicroMsg.MT.MultiTalkAudioPlayer", "stopPlay");
        }
        synchronized (localb.mkn)
        {
          com.tencent.mm.sdk.f.e.post(new b.a(localb, localb.mkm), "MultiTalkAudioPlayer_stop");
          localb.isStart = false;
          localb.mkm = null;
          localb.mkv.di(ab.getContext());
          at.AS().b(localb);
          localb.hez.tx();
          GMTrace.o(4769963835392L, 35539);
          return true;
        }
      }
      
      public final boolean aQX()
      {
        GMTrace.i(4770098053120L, 35540);
        w.i("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkRecord");
        try
        {
          if (c.this.nlZ != null)
          {
            c.this.nlZ.exR = null;
            c.this.nlZ.qn();
          }
          c.this.nlZ = null;
          GMTrace.o(4770098053120L, 35540);
          return true;
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkPlayer :" + localException);
          GMTrace.o(4770098053120L, 35540);
        }
        return false;
      }
      
      public final int aQY()
      {
        int j = 0;
        GMTrace.i(16568507432960L, 123445);
        w.i("MicroMsg.MT.MultiTalkEngine", "getMultiTalkPlayVolume");
        int i = j;
        if (c.this.nlY != null)
        {
          b localb = c.this.nlY;
          i = j;
          if (localb.mkm != null) {
            i = localb.mkm.btE();
          }
        }
        float f = at.AS().getStreamMaxVolume(i);
        i = (int)(at.AS().getStreamVolume(i) / f * 100.0F);
        GMTrace.o(16568507432960L, 123445);
        return i;
      }
      
      public final int aQZ()
      {
        GMTrace.i(16568641650688L, 123446);
        w.i("MicroMsg.MT.MultiTalkEngine", "getMultiTalkRecordReadNum");
        if (c.this.nlZ != null)
        {
          int i = c.this.nlZ.qy();
          GMTrace.o(16568641650688L, 123446);
          return i;
        }
        GMTrace.o(16568641650688L, 123446);
        return -2;
      }
      
      public final boolean b(int paramAnonymousInt1, int paramAnonymousInt2, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(4769024311296L, 35532);
        w.i("MicroMsg.MT.MultiTalkEngine", "sendMultiTalkReq " + paramAnonymousInt1 + " cmdid " + paramAnonymousInt2);
        paramAnonymousArrayOfByte = new n(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousArrayOfByte);
        at.wS().a(paramAnonymousArrayOfByte, 0);
        GMTrace.o(4769024311296L, 35532);
        return false;
      }
      
      public final boolean gi(boolean paramAnonymousBoolean)
      {
        GMTrace.i(4769561182208L, 35536);
        w.i("MicroMsg.MT.MultiTalkEngine", "setMultiTalkSpeaker %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        c.this.nlY.fn(paramAnonymousBoolean);
        GMTrace.o(4769561182208L, 35536);
        return true;
      }
      
      public final boolean l(int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(4768890093568L, 35531);
        switch (paramAnonymousInt)
        {
        default: 
          w.v(paramAnonymousString1, paramAnonymousString2);
        }
        for (;;)
        {
          GMTrace.o(4768890093568L, 35531);
          return false;
          w.v(paramAnonymousString1, paramAnonymousString2);
          continue;
          w.d(paramAnonymousString1, paramAnonymousString2);
          continue;
          w.i(paramAnonymousString1, paramAnonymousString2);
          continue;
          w.w(paramAnonymousString1, paramAnonymousString2);
          continue;
          w.e(paramAnonymousString1, paramAnonymousString2);
          continue;
          w.f(paramAnonymousString1, paramAnonymousString2);
        }
      }
      
      public final int sK()
      {
        GMTrace.i(4769292746752L, 35534);
        int i = l.sK();
        GMTrace.o(4769292746752L, 35534);
        return i;
      }
    });
    this.nlX.aQ(i, q.zE());
    at.wS().a(1918, this);
    at.wS().a(1919, this);
    at.wS().a(1927, this);
    at.wS().a(1928, this);
    at.wS().a(1929, this);
    at.wS().a(1931, this);
    at.wS().a(1932, this);
    at.wS().a(1933, this);
    at.wS().a(1935, this);
    at.wS().a(1937, this);
    at.wS().a(1938, this);
    at.wS().a(1939, this);
    GMTrace.o(4767682134016L, 35522);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4767816351744L, 35523);
    paramString = (n)paramk;
    w.i("MicroMsg.MT.MultiTalkEngine", "onSceneEnd errtype " + paramInt1 + " errCode " + paramInt2 + " cmdid " + paramString.kwO);
    this.nlX.c(paramInt2, paramString.kwN, paramString.kwO, paramString.eWZ);
    GMTrace.o(4767816351744L, 35523);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */