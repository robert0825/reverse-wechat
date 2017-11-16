package com.tencent.mm.e.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.g;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.d;
import com.tencent.mm.modelvoice.d.a;
import com.tencent.mm.modelvoice.d.b;
import com.tencent.mm.modelvoice.i;
import com.tencent.mm.modelvoice.j;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.s;
import com.tencent.mm.plugin.e.a.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.aq.a;
import com.tencent.mm.sdk.platformtools.aq.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class a
  implements g, e.a
{
  public static String ewL;
  public Context context;
  private d ewC;
  public boolean ewD;
  private boolean ewE;
  public boolean ewF;
  private int ewG;
  private boolean ewH;
  public boolean ewI;
  public boolean ewJ;
  public String ewK;
  private b.a ewM;
  public com.tencent.mm.ad.g.b ewN;
  public g.a ewO;
  
  static
  {
    GMTrace.i(18913022705664L, 140913);
    ewL = null;
    GMTrace.o(18913022705664L, 140913);
  }
  
  public a(Context paramContext)
  {
    this(paramContext, 0);
    GMTrace.i(4493206880256L, 33477);
    GMTrace.o(4493206880256L, 33477);
  }
  
  public a(Context paramContext, int paramInt)
  {
    GMTrace.i(4493341097984L, 33478);
    this.ewC = null;
    this.context = null;
    this.ewD = false;
    this.ewE = false;
    this.ewF = false;
    this.ewG = 0;
    this.ewH = false;
    this.ewI = false;
    this.ewJ = true;
    this.ewK = null;
    this.ewM = new b.a()
    {
      public final void dd(int paramAnonymousInt)
      {
        GMTrace.i(17480248459264L, 130238);
        w.i("MicroMsg.SceneVoicePlayer", "on audio focus chage: %s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if ((paramAnonymousInt == -2) || (paramAnonymousInt == -3))
        {
          if (a.this.isPlaying())
          {
            w.v("MicroMsg.SceneVoicePlayer", "alvinluo current fileName: %s, lastFileName: %s", new Object[] { a.this.ewK, a.ewL });
            if ((a.this.ewK == null) || (a.this.ewK.equals(a.ewL)))
            {
              a.this.aw(false);
              GMTrace.o(17480248459264L, 130238);
            }
          }
        }
        else
        {
          if ((paramAnonymousInt == 1) || (paramAnonymousInt == 2) || (paramAnonymousInt == 3))
          {
            a.this.qj();
            GMTrace.o(17480248459264L, 130238);
            return;
          }
          if (paramAnonymousInt == -1) {
            a.this.ax(false);
          }
        }
        GMTrace.o(17480248459264L, 130238);
      }
    };
    this.ewN = null;
    this.context = paramContext;
    this.ewG = paramInt;
    new com.tencent.mm.e.b.g.b();
    GMTrace.o(4493341097984L, 33478);
  }
  
  private void ql()
  {
    GMTrace.i(4495085928448L, 33491);
    d.a local3 = new d.a()
    {
      public final void onCompletion()
      {
        GMTrace.i(17480919547904L, 130243);
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17479711588352L, 130234);
            try
            {
              if (p.fQD.fNy == 1) {
                Thread.sleep(300L);
              }
              w.i("MicroMsg.SceneVoicePlayer", "onCompletion, intOnCompletion: %s, shouldPlayComplete: %s", new Object[] { a.this.ewO, Boolean.valueOf(a.this.ewJ) });
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(17480114241536L, 130237);
                  com.tencent.mm.compatible.b.e.sd().e(a.this.ewD, false);
                  aq.b localb;
                  if (a.this.ewJ)
                  {
                    Context localContext = a.this.context;
                    int i = a.a.iUG;
                    boolean bool = a.this.ewD;
                    aq.a local1 = new aq.a()
                    {
                      public final void onCompletion()
                      {
                        GMTrace.i(17480651112448L, 130241);
                        w.i("MicroMsg.SceneVoicePlayer", "play sound end onCompletion");
                        if (!a.this.isPlaying())
                        {
                          com.tencent.mm.compatible.b.e.sd().b(a.this);
                          w.i("MicroMsg.SceneVoicePlayer", "onCompletion() continuousPlay:%s", new Object[] { Boolean.valueOf(a.this.ewF) });
                          if (!a.this.ewF) {
                            com.tencent.mm.compatible.b.e.sd().sg();
                          }
                          a.this.ewF = false;
                          a.this.ewI = false;
                          com.tencent.mm.compatible.b.e.sd().setMode(0);
                          w.i("MicroMsg.SceneVoicePlayer", "onCompletion() resetSpeaker");
                        }
                        GMTrace.o(17480651112448L, 130241);
                      }
                    };
                    if (bool)
                    {
                      localb = aq.b.vke;
                      aq.a(localContext, i, localb, false, local1);
                    }
                  }
                  for (;;)
                  {
                    if (a.this.ewO == null) {
                      break label300;
                    }
                    w.i("MicroMsg.SceneVoicePlayer", "intOnCompletion onCompletion()");
                    a.this.ewO.onCompletion();
                    GMTrace.o(17480114241536L, 130237);
                    return;
                    localb = aq.b.vkf;
                    break;
                    w.i("MicroMsg.SceneVoicePlayer", "play sound end onCompletion");
                    if (!a.this.isPlaying())
                    {
                      com.tencent.mm.compatible.b.e.sd().b(a.this);
                      w.i("MicroMsg.SceneVoicePlayer", "onCompletion() continuousPlay:%s", new Object[] { Boolean.valueOf(a.this.ewF) });
                      if (!a.this.ewF) {
                        com.tencent.mm.compatible.b.e.sd().sg();
                      }
                      a.this.ewF = false;
                      a.this.ewI = false;
                      com.tencent.mm.compatible.b.e.sd().setMode(0);
                      w.i("MicroMsg.SceneVoicePlayer", "onCompletion() resetSpeaker");
                    }
                  }
                  label300:
                  w.e("MicroMsg.SceneVoicePlayer", "intOnCompletion is null!!!");
                  GMTrace.o(17480114241536L, 130237);
                }
              });
              GMTrace.o(17479711588352L, 130234);
              return;
            }
            catch (Exception localException)
            {
              w.e("MicroMsg.SceneVoicePlayer", "exception:%s", new Object[] { bg.f(localException) });
              GMTrace.o(17479711588352L, 130234);
            }
          }
        }, "SceneVoice_onCompletion");
        GMTrace.o(17480919547904L, 130243);
      }
    };
    if (this.ewC != null) {
      this.ewC.a(local3);
    }
    GMTrace.o(4495085928448L, 33491);
  }
  
  private void setError()
  {
    GMTrace.i(4494817492992L, 33489);
    d.b local2 = new d.b()
    {
      public final void onError()
      {
        GMTrace.i(17479845806080L, 130235);
        com.tencent.mm.compatible.b.e.sd().b(a.this);
        if (a.this.ewI)
        {
          com.tencent.mm.compatible.b.e.sd().sg();
          a.this.ewI = false;
        }
        com.tencent.mm.compatible.b.e.sd().setMode(0);
        if (a.this.ewN != null) {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4492267356160L, 33470);
              a.this.ewN.onError();
              GMTrace.o(4492267356160L, 33470);
            }
          });
        }
        GMTrace.o(17479845806080L, 130235);
      }
    };
    if (this.ewC != null) {
      this.ewC.a(local2);
    }
    GMTrace.o(4494817492992L, 33489);
  }
  
  public final void a(g.a parama)
  {
    GMTrace.i(4494951710720L, 33490);
    this.ewO = parama;
    GMTrace.o(4494951710720L, 33490);
  }
  
  public final void a(com.tencent.mm.ad.g.b paramb)
  {
    GMTrace.i(4494683275264L, 33488);
    this.ewN = paramb;
    GMTrace.o(4494683275264L, 33488);
  }
  
  public final boolean a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(4493743751168L, 33481);
    w.i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(true), Integer.valueOf(paramInt1), Integer.valueOf(this.ewG) });
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (FileOp.aZ(paramString)) {
        break;
      }
      w.e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", new Object[] { paramString, paramString });
      GMTrace.o(4493743751168L, 33481);
      return false;
    }
    int i = paramInt1;
    if (paramInt1 == -1) {
      i = o.e(paramString, this.ewG, true);
    }
    if (i == 0) {
      if (this.context != null) {
        this.ewC = new s(this.context);
      }
    }
    for (;;)
    {
      if (this.ewC != null) {
        this.ewC.b(this.ewM);
      }
      this.ewD = paramBoolean;
      this.ewH = paramBoolean;
      if ((com.tencent.mm.compatible.b.e.sd().sn()) || (com.tencent.mm.compatible.b.e.sd().sh()))
      {
        w.i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(com.tencent.mm.compatible.b.e.sd().sn()), Boolean.valueOf(com.tencent.mm.compatible.b.e.sd().sh()) });
        this.ewD = false;
      }
      com.tencent.mm.compatible.b.e.sd().e(this.ewD, false);
      ql();
      setError();
      com.tencent.mm.compatible.b.e.sd().a(this);
      if (!com.tencent.mm.compatible.b.e.sd().sn())
      {
        com.tencent.mm.compatible.b.e.sd().sf();
        this.ewI = true;
      }
      if (this.ewC.c(paramString, this.ewD, paramInt2)) {
        break;
      }
      w.i("MicroMsg.SceneVoicePlayer", "start play fileName[" + paramString + "], [" + paramBoolean + "]");
      com.tencent.mm.compatible.b.e.sd().sg();
      this.ewI = false;
      GMTrace.o(4493743751168L, 33481);
      return false;
      this.ewC = new s();
      continue;
      if (i == 1)
      {
        if (this.context != null) {
          this.ewC = new j(this.context);
        } else {
          this.ewC = new j();
        }
      }
      else if (i == 2) {
        if (this.context != null) {
          this.ewC = new i(this.context);
        } else {
          this.ewC = new i();
        }
      }
    }
    GMTrace.o(4493743751168L, 33481);
    return true;
  }
  
  public final boolean a(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    GMTrace.i(4493609533440L, 33480);
    w.i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt), Integer.valueOf(this.ewG) });
    boolean bool;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      ewL = this.ewK;
      this.ewK = paramString;
      if (!paramBoolean2) {
        break label142;
      }
      str = paramString;
      label90:
      if (FileOp.aZ(str)) {
        break label160;
      }
      if (!paramBoolean2) {
        break label151;
      }
    }
    label142:
    label151:
    for (String str = paramString;; str = q.getFullPath(paramString))
    {
      w.e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", new Object[] { paramString, str });
      GMTrace.o(4493609533440L, 33480);
      return false;
      bool = false;
      break;
      str = q.getFullPath(paramString);
      break label90;
    }
    label160:
    int i = paramInt;
    if (paramInt == -1) {
      i = o.e(paramString, this.ewG, paramBoolean2);
    }
    if (i == 0) {
      if (this.context != null)
      {
        this.ewC = new s(this.context);
        if (this.ewC != null) {
          this.ewC.b(this.ewM);
        }
        this.ewD = paramBoolean1;
        this.ewH = paramBoolean1;
        if ((com.tencent.mm.compatible.b.e.sd().sn()) || (com.tencent.mm.compatible.b.e.sd().sh()))
        {
          w.i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(com.tencent.mm.compatible.b.e.sd().sn()), Boolean.valueOf(com.tencent.mm.compatible.b.e.sd().sh()) });
          this.ewD = false;
        }
        com.tencent.mm.compatible.b.e.sd().e(this.ewD, false);
        ql();
        setError();
        str = null;
        if (!paramBoolean2) {
          break label534;
        }
        str = paramString;
      }
    }
    for (;;)
    {
      com.tencent.mm.compatible.b.e.sd().a(this);
      if (!com.tencent.mm.compatible.b.e.sd().sn())
      {
        com.tencent.mm.compatible.b.e.sd().sf();
        this.ewI = true;
      }
      if (this.ewC.F(str, this.ewD)) {
        break label550;
      }
      w.i("MicroMsg.SceneVoicePlayer", "start play error fileName[" + paramString + "], [" + paramBoolean1 + "]");
      com.tencent.mm.compatible.b.e.sd().sg();
      this.ewI = false;
      GMTrace.o(4493609533440L, 33480);
      return false;
      this.ewC = new s();
      break;
      if (i == 1)
      {
        if (this.context != null)
        {
          this.ewC = new j(this.context);
          break;
        }
        this.ewC = new j();
        break;
      }
      if (i != 2) {
        break;
      }
      if (this.context != null)
      {
        this.ewC = new i(this.context);
        break;
      }
      this.ewC = new i();
      break;
      label534:
      if (this.ewG == 0) {
        str = q.getFullPath(paramString);
      }
    }
    label550:
    GMTrace.o(4493609533440L, 33480);
    return true;
  }
  
  public final boolean aw(boolean paramBoolean)
  {
    GMTrace.i(17480382676992L, 130239);
    if (this.ewC == null)
    {
      GMTrace.o(17480382676992L, 130239);
      return false;
    }
    w.i("MicroMsg.SceneVoicePlayer", "pause");
    if (this.ewC.isPlaying()) {}
    for (paramBoolean = this.ewC.aw(paramBoolean);; paramBoolean = false)
    {
      if ((paramBoolean) && (this.ewI))
      {
        com.tencent.mm.compatible.b.e.sd().sg();
        this.ewI = false;
      }
      com.tencent.mm.compatible.b.e.sd().setMode(0);
      GMTrace.o(17480382676992L, 130239);
      return paramBoolean;
    }
  }
  
  public final void ax(boolean paramBoolean)
  {
    GMTrace.i(14893872840704L, 110968);
    if (this.ewC == null)
    {
      GMTrace.o(14893872840704L, 110968);
      return;
    }
    w.i("MicroMsg.SceneVoicePlayer", "stop, isRequestStartBluetooth: %b, player.isPlaying: %b, fromStart: %b", new Object[] { Boolean.valueOf(this.ewI), Boolean.valueOf(this.ewC.isPlaying()), Boolean.valueOf(paramBoolean) });
    this.ewC.qt();
    com.tencent.mm.compatible.b.e.sd().b(this);
    if ((this.ewI) && (!paramBoolean))
    {
      com.tencent.mm.compatible.b.e.sd().sg();
      this.ewI = false;
    }
    com.tencent.mm.compatible.b.e.sd().setMode(0);
    GMTrace.o(14893872840704L, 110968);
  }
  
  public final void ay(boolean paramBoolean)
  {
    GMTrace.i(4494549057536L, 33487);
    if (this.ewD == paramBoolean)
    {
      GMTrace.o(4494549057536L, 33487);
      return;
    }
    this.ewD = paramBoolean;
    if ((this.ewC != null) && (this.ewC.isPlaying())) {
      this.ewC.ay(paramBoolean);
    }
    com.tencent.mm.compatible.b.e.sd().e(paramBoolean, false);
    GMTrace.o(4494549057536L, 33487);
  }
  
  public final void az(boolean paramBoolean)
  {
    GMTrace.i(14894007058432L, 110969);
    w.i("MicroMsg.SceneVoicePlayer", "setContinuousPlay() continuousPlay:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.ewF = paramBoolean;
    GMTrace.o(14894007058432L, 110969);
  }
  
  public final void dc(int paramInt)
  {
    GMTrace.i(4495488581632L, 33494);
    w.i("MicroMsg.SceneVoicePlayer", "onBluetoothHeadsetStateChange, status: %d, currentSpeaker: %b, bluetoothResumeSpeaker: %b, isRequestStartBluetooth: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.ewD), Boolean.valueOf(this.ewH), Boolean.valueOf(this.ewI) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(4495488581632L, 33494);
      return;
      ay(false);
      GMTrace.o(4495488581632L, 33494);
      return;
      ay(this.ewH);
      if (this.ewI)
      {
        com.tencent.mm.compatible.b.e.sd().sg();
        this.ewI = false;
        GMTrace.o(4495488581632L, 33494);
        return;
        ay(this.ewH);
        if ((this.ewC != null) && (this.ewC.isPlaying()))
        {
          com.tencent.mm.compatible.b.e.sd().sf();
          this.ewI = true;
          GMTrace.o(4495488581632L, 33494);
          return;
          if ((this.ewC != null) && (this.ewC.isPlaying()))
          {
            com.tencent.mm.compatible.b.e.sd().sf();
            this.ewI = true;
          }
        }
      }
    }
  }
  
  public final boolean h(String paramString, boolean paramBoolean)
  {
    GMTrace.i(4494146404352L, 33484);
    paramBoolean = a(paramString, paramBoolean, false, -1);
    GMTrace.o(4494146404352L, 33484);
    return paramBoolean;
  }
  
  public final boolean isPause()
  {
    GMTrace.i(4495354363904L, 33493);
    if (this.ewC == null)
    {
      GMTrace.o(4495354363904L, 33493);
      return false;
    }
    if (this.ewC.getStatus() == 2)
    {
      GMTrace.o(4495354363904L, 33493);
      return true;
    }
    GMTrace.o(4495354363904L, 33493);
    return false;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(4493475315712L, 33479);
    if (this.ewC == null)
    {
      GMTrace.o(4493475315712L, 33479);
      return false;
    }
    boolean bool = this.ewC.isPlaying();
    GMTrace.o(4493475315712L, 33479);
    return bool;
  }
  
  public final boolean pause()
  {
    GMTrace.i(4493877968896L, 33482);
    boolean bool = aw(true);
    GMTrace.o(4493877968896L, 33482);
    return bool;
  }
  
  public final boolean qj()
  {
    GMTrace.i(4494012186624L, 33483);
    if (this.ewC == null)
    {
      GMTrace.o(4494012186624L, 33483);
      return false;
    }
    w.i("MicroMsg.SceneVoicePlayer", "resume");
    boolean bool = this.ewC.qj();
    if (bool)
    {
      com.tencent.mm.compatible.b.e.sd().sf();
      this.ewI = true;
      if (com.tencent.mm.compatible.b.e.sd().sh()) {
        this.ewD = false;
      }
      com.tencent.mm.compatible.b.e.sd().e(this.ewD, false);
    }
    GMTrace.o(4494012186624L, 33483);
    return bool;
  }
  
  public final boolean qk()
  {
    GMTrace.i(4494280622080L, 33485);
    boolean bool = this.ewE;
    GMTrace.o(4494280622080L, 33485);
    return bool;
  }
  
  public final double qm()
  {
    GMTrace.i(4495220146176L, 33492);
    if (this.ewC == null)
    {
      GMTrace.o(4495220146176L, 33492);
      return 0.0D;
    }
    double d = this.ewC.qm();
    GMTrace.o(4495220146176L, 33492);
    return d;
  }
  
  public final void stop()
  {
    GMTrace.i(4494414839808L, 33486);
    ax(false);
    GMTrace.o(4494414839808L, 33486);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */