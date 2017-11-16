package com.tencent.mm.bd;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ae;
import java.io.File;

public final class e
  implements com.tencent.mm.ad.e
{
  public static int ezm;
  private static final String heY;
  private static final String heZ;
  public com.tencent.mm.e.b.c.a exR;
  com.tencent.mm.e.b.c exi;
  ae handler;
  public int heT;
  public int hfa;
  int hfb;
  boolean hfc;
  public int hfd;
  public boolean hfe;
  b hff;
  com.tencent.mm.e.c.a hfg;
  com.tencent.qqpinyin.voicerecoapi.c hfh;
  public a hfi;
  
  static
  {
    GMTrace.i(4388248616960L, 32695);
    heY = com.tencent.mm.storage.w.ghv + "tmp_voiceaddr.spx";
    heZ = com.tencent.mm.storage.w.ghv + "tmp_voiceaddr.amr";
    ezm = 100;
    GMTrace.o(4388248616960L, 32695);
  }
  
  public e(b paramb, int paramInt)
  {
    GMTrace.i(4386235351040L, 32680);
    this.heT = 1;
    this.hfa = 0;
    this.hfb = 0;
    this.hfc = false;
    this.hfd = 500000;
    this.hfe = false;
    this.hff = null;
    this.hfh = null;
    this.hfi = null;
    this.exR = new com.tencent.mm.e.b.c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4386101133312L, 32679);
        GMTrace.o(4386101133312L, 32679);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(4385966915584L, 32678);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SceneVoiceAddr", "OnRecPcmDataReady len: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        com.tencent.qqpinyin.voicerecoapi.c.a locala = new com.tencent.qqpinyin.voicerecoapi.c.a();
        short[] arrayOfShort = new short[paramAnonymousInt / 2];
        int i = 0;
        while (i < paramAnonymousInt / 2)
        {
          arrayOfShort[i] = ((short)(paramAnonymousArrayOfByte[(i * 2)] & 0xFF | paramAnonymousArrayOfByte[(i * 2 + 1)] << 8));
          i += 1;
        }
        if (e.this.hfh != null) {
          e.this.hfh.a(arrayOfShort, paramAnonymousInt / 2, locala);
        }
        e locale = e.this;
        int j = paramAnonymousInt / 2;
        i = 0;
        while (i < j)
        {
          int k = arrayOfShort[i];
          if (k > locale.hfa) {
            locale.hfa = k;
          }
          i += 1;
        }
        if (e.this.hfg != null) {}
        for (paramAnonymousInt = e.this.hfg.a(new g.a(paramAnonymousArrayOfByte, paramAnonymousInt), 0);; paramAnonymousInt = -1)
        {
          if (-1 == paramAnonymousInt)
          {
            e.this.finish();
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceAddr", "write to file failed");
            GMTrace.o(4385966915584L, 32678);
            return;
          }
          paramAnonymousArrayOfByte = e.this;
          paramAnonymousArrayOfByte.hfb = (paramAnonymousInt + paramAnonymousArrayOfByte.hfb);
          if ((e.this.hfb > 3300) && (!e.this.hfc))
          {
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SceneVoiceAddr", "sendEmptyMessage(0)");
            e.this.handler.sendEmptyMessage(0);
            e.this.hfc = true;
          }
          if ((locala.xOY == 2) || (locala.xOY == 3))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceAddr", "state.vad_flag: " + locala.xOY);
            e.this.finish();
          }
          GMTrace.o(4385966915584L, 32678);
          return;
        }
      }
    };
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(4388919705600L, 32700);
        if (paramAnonymousMessage.what == 2)
        {
          if (e.this.hff != null)
          {
            e.this.hff.Ob();
            GMTrace.o(4388919705600L, 32700);
          }
        }
        else
        {
          if (paramAnonymousMessage.what == 0)
          {
            if (e.this.heT == 0)
            {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SceneVoiceAddr", "addSceneEndListener MMFunc_UploadInputVoice");
              h.wS().a(349, e.this);
              if (e.this.heT != 0) {
                break label194;
              }
              if (e.this.hfe) {
                break label169;
              }
              e.this.hfi = new d(e.this.NZ(), 0);
            }
            for (;;)
            {
              h.wS().a(e.this.hfi, 0);
              GMTrace.o(4388919705600L, 32700);
              return;
              h.wS().a(206, e.this);
              break;
              label169:
              e.this.hfi = new d(e.this.NZ(), 1);
              continue;
              label194:
              e.this.hfi = new c(e.this.NZ(), e.this.heT);
            }
          }
          if ((paramAnonymousMessage.what == 3) && (e.this.hff != null)) {
            e.this.hff.a(new String[0], -1L);
          }
        }
        GMTrace.o(4388919705600L, 32700);
      }
    };
    this.hff = paramb;
    this.heT = paramInt;
    if (this.heT == 1) {}
    for (paramInt = i;; paramInt = 1500000)
    {
      this.hfd = paramInt;
      GMTrace.o(4386235351040L, 32680);
      return;
    }
  }
  
  public final String NZ()
  {
    GMTrace.i(16022912368640L, 119380);
    if (!this.hfe)
    {
      str = heY;
      GMTrace.o(16022912368640L, 119380);
      return str;
    }
    String str = heZ;
    GMTrace.o(16022912368640L, 119380);
    return str;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4386369568768L, 32681);
    long l;
    if (this.heT == 0)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SceneVoiceAddr", "removeSceneEndListener MMFunc_UploadInputVoice");
      h.wS().b(349, this);
      paramString = ((a)paramk).NT();
      l = ((a)paramk).NU();
      if (paramString != null) {
        break label143;
      }
    }
    label143:
    for (int i = -1;; i = paramString.length)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceAddr", "onSceneEnd errType:%d errCode:%d list:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if (this.hff == null) {
        break label162;
      }
      if ((paramInt2 == 0) && (paramInt1 == 0)) {
        break label150;
      }
      this.hff.Oa();
      cancel();
      GMTrace.o(4386369568768L, 32681);
      return;
      h.wS().b(206, this);
      break;
    }
    label150:
    this.hff.a(paramString, l);
    label162:
    GMTrace.o(4386369568768L, 32681);
  }
  
  public final void cancel()
  {
    GMTrace.i(4386638004224L, 32683);
    this.hff = null;
    finish();
    GMTrace.o(4386638004224L, 32683);
  }
  
  public final void finish()
  {
    GMTrace.i(4386503786496L, 32682);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceAddr", "finish");
    com.tencent.mm.sdk.platformtools.w.k("MicroMsg.SceneVoiceAddr", "finish", new Object[0]);
    if (this.hfi != null) {
      this.hfi.NS();
    }
    this.handler.sendEmptyMessage(2);
    if (!this.hfc) {
      this.handler.sendEmptyMessage(3);
    }
    reset();
    GMTrace.o(4386503786496L, 32682);
  }
  
  public final void reset()
  {
    GMTrace.i(4386772221952L, 32684);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceAddr", "reset");
    try
    {
      if (this.exi != null)
      {
        this.exi.qn();
        this.exi = null;
      }
      if (this.hfg != null)
      {
        this.hfg.qI();
        this.hfg = null;
      }
      if (this.hfh != null) {
        this.hfh.stop();
      }
      this.hfh = null;
      if (this.hfi != null)
      {
        this.hfi.NS();
        this.hfi = null;
      }
      this.hfb = 0;
      this.hfc = false;
      GMTrace.o(4386772221952L, 32684);
      return;
    }
    finally {}
  }
  
  public final class a
    implements Runnable
  {
    public a()
    {
      GMTrace.i(4392946237440L, 32730);
      GMTrace.o(4392946237440L, 32730);
    }
    
    public final void run()
    {
      GMTrace.i(4393080455168L, 32731);
      for (;;)
      {
        synchronized (e.this)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SceneVoiceAddr", "initDeviceInLock");
          try
          {
            new File(e.this.NZ()).delete();
            if (e.this.hfe)
            {
              i = 8000;
              e.this.exi = new com.tencent.mm.e.b.c(i, 1, 3);
              e.this.exi.exG = -19;
              e.this.exi.aA(false);
              if (!e.this.hfe)
              {
                e.this.hfg = new com.tencent.mm.e.c.d();
                if (!e.this.hfg.bU(e.this.NZ()))
                {
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceAddr", "init speex writer failed");
                  e.this.hfg.qI();
                  e.this.hfg = null;
                }
              }
              if ((e.this.hfe) || (p.fQL.fPy <= 0)) {
                break label342;
              }
              e.this.exi.j(p.fQL.fPy, true);
              e.this.exi.aB(false);
              e.this.hfh = new com.tencent.qqpinyin.voicerecoapi.c(e.this.hfd);
              i = e.this.hfh.start();
              if (i == 0) {
                break label357;
              }
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceAddr", "init VoiceDetectAPI failed :" + i);
              e.this.reset();
              GMTrace.o(4393080455168L, 32731);
              return;
            }
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceAddr", "delete file failed, " + e.this.NZ(), new Object[] { localException });
            continue;
          }
        }
        int i = 16000;
        continue;
        label342:
        e.this.exi.j(5, false);
        continue;
        label357:
        e.this.exi.exR = e.this.exR;
        if (!e.this.exi.qw())
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SceneVoiceAddr", "start record failed");
          e.this.reset();
        }
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void Oa();
    
    public abstract void Ob();
    
    public abstract void a(String[] paramArrayOfString, long paramLong);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */