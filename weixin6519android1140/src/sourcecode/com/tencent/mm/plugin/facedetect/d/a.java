package com.tencent.mm.plugin.facedetect.d;

import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.e.c.d;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
{
  public static final String kTR;
  public static final String kTW;
  public com.tencent.mm.e.b.c.a exR;
  public com.tencent.mm.e.b.c exi;
  boolean hfI;
  int hfa;
  int hfb;
  public com.tencent.mm.e.c.a hfg;
  public com.tencent.mm.bd.a.c hfm;
  public com.tencent.mm.bd.a.c.a hfn;
  public b kTS;
  public boolean kTT;
  public String kTU;
  public ArrayList<com.tencent.mm.e.b.c.a> kTV;
  public com.tencent.mm.e.b.c.a kTX;
  
  static
  {
    GMTrace.i(5951079841792L, 44339);
    kTR = n.awv() + File.separator + "fdv_v_";
    kTW = h.getExternalStorageDirectory().getAbsolutePath() + "/temp_debug_raw.spx";
    GMTrace.o(5951079841792L, 44339);
  }
  
  public a()
  {
    GMTrace.i(5948663922688L, 44321);
    this.kTS = null;
    this.hfI = true;
    this.kTT = false;
    this.kTU = "";
    this.kTV = new ArrayList(5);
    this.hfb = 0;
    this.hfa = 0;
    this.kTX = new com.tencent.mm.e.b.c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(5959535558656L, 44402);
        if (a.this.kTV != null)
        {
          Iterator localIterator = a.this.kTV.iterator();
          while (localIterator.hasNext())
          {
            com.tencent.mm.e.b.c.a locala = (com.tencent.mm.e.b.c.a)localIterator.next();
            if (locala != null) {
              locala.ax(paramAnonymousInt1, paramAnonymousInt2);
            }
          }
        }
        GMTrace.o(5959535558656L, 44402);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(5959401340928L, 44401);
        if (a.this.kTV != null)
        {
          Iterator localIterator = a.this.kTV.iterator();
          while (localIterator.hasNext())
          {
            com.tencent.mm.e.b.c.a locala = (com.tencent.mm.e.b.c.a)localIterator.next();
            if (locala != null) {
              locala.d(paramAnonymousArrayOfByte, paramAnonymousInt);
            }
          }
        }
        GMTrace.o(5959401340928L, 44401);
      }
    };
    this.exR = new com.tencent.mm.e.b.c.a()
    {
      short[] hfo;
      
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(5961280389120L, 44415);
        w.e("MicroMsg.FaceVoiceRecordLogic", "onRecError state = " + paramAnonymousInt1 + " detailState = " + paramAnonymousInt2);
        a.this.awy();
        if (a.this.kTS != null) {
          a.this.kTS.onError(2);
        }
        GMTrace.o(5961280389120L, 44415);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(5961146171392L, 44414);
        w.d("MicroMsg.FaceVoiceRecordLogic", "OnRecPcmDataReady len: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if ((this.hfo == null) || (this.hfo.length < paramAnonymousInt / 2)) {
          this.hfo = new short[paramAnonymousInt / 2];
        }
        int i = 0;
        while (i < paramAnonymousInt / 2)
        {
          this.hfo[i] = ((short)(paramAnonymousArrayOfByte[(i * 2)] & 0xFF | paramAnonymousArrayOfByte[(i * 2 + 1)] << 8));
          i += 1;
        }
        a locala = a.this;
        short[] arrayOfShort = this.hfo;
        int j = paramAnonymousInt / 2;
        i = 0;
        while (i < j)
        {
          int k = arrayOfShort[i];
          if (k > locala.hfa) {
            locala.hfa = k;
          }
          i += 1;
        }
        if (a.this.hfm != null)
        {
          a.this.hfm.c(this.hfo, paramAnonymousInt / 2);
          if (a.this.hfg == null) {
            break label317;
          }
        }
        label317:
        for (paramAnonymousInt = a.this.hfg.a(new g.a(paramAnonymousArrayOfByte, paramAnonymousInt), 0);; paramAnonymousInt = -1)
        {
          if ((-1 == paramAnonymousInt) && (a.this.kTS != null))
          {
            a.this.kTS.onError(3);
            a.this.awy();
            w.e("MicroMsg.FaceVoiceRecordLogic", "write to file failed");
            GMTrace.o(5961146171392L, 44414);
            return;
          }
          GMTrace.o(5961146171392L, 44414);
          return;
          if (a.this.kTS != null)
          {
            a.this.kTS.onError(1);
            a.this.awy();
          }
          w.e("MicroMsg.FaceVoiceRecordLogic", "mVoiceSilentDetectAPI is null");
          GMTrace.o(5961146171392L, 44414);
          return;
        }
      }
    };
    this.hfn = new com.tencent.mm.bd.a.c.a()
    {
      public final void Od()
      {
        GMTrace.i(5953495760896L, 44357);
        w.d("MicroMsg.FaceVoiceRecordLogic", "hy: onSpeakToSilent");
        GMTrace.o(5953495760896L, 44357);
      }
      
      public final void Oe()
      {
        GMTrace.i(5953629978624L, 44358);
        w.d("MicroMsg.FaceVoiceRecordLogic", "hy: onSilentToSpeak");
        if (a.this.kTS != null) {
          a.this.kTS.awz();
        }
        GMTrace.o(5953629978624L, 44358);
      }
      
      public final void a(short[] paramAnonymousArrayOfShort, int paramAnonymousInt)
      {
        GMTrace.i(5953361543168L, 44356);
        w.d("MicroMsg.FaceVoiceRecordLogic", "onFilteredSpeakVoice data %s size %d", new Object[] { paramAnonymousArrayOfShort, Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(5953361543168L, 44356);
      }
      
      public final void qf()
      {
        GMTrace.i(5953764196352L, 44359);
        w.d("MicroMsg.FaceVoiceRecordLogic", "Silent enough to finish");
        if (a.this.kTS != null) {
          a.this.kTS.onError(11);
        }
        GMTrace.o(5953764196352L, 44359);
      }
    };
    GMTrace.o(5948663922688L, 44321);
  }
  
  public final void a(com.tencent.mm.e.b.c.a parama)
  {
    GMTrace.i(5948932358144L, 44323);
    this.kTV.add(parama);
    GMTrace.o(5948932358144L, 44323);
  }
  
  public final void awy()
  {
    GMTrace.i(5948798140416L, 44322);
    b.deleteFile(this.kTU);
    GMTrace.o(5948798140416L, 44322);
  }
  
  private final class a
    implements Runnable
  {
    private Runnable kTZ;
    
    public a(Runnable paramRunnable)
    {
      GMTrace.i(5958193381376L, 44392);
      this.kTZ = null;
      this.kTZ = paramRunnable;
      GMTrace.o(5958193381376L, 44392);
    }
    
    public final void run()
    {
      GMTrace.i(5958327599104L, 44393);
      for (;;)
      {
        synchronized (a.this)
        {
          if (a.this.kTT) {
            break label557;
          }
          w.i("MicroMsg.FaceVoiceRecordLogic", "hy: initDeviceInLock");
          a.this.kTU = (a.kTR + bg.Pw() + ".spx");
          try
          {
            new File(a.this.kTU).delete();
            a.this.exi = new com.tencent.mm.e.b.c(16000, 1, 3);
            a.this.exi.exG = -19;
            a.this.exi.aA(false);
            a.this.hfg = new d();
            if (!a.this.hfg.bU(a.this.kTU))
            {
              w.e("MicroMsg.FaceVoiceRecordLogic", "hy: init speex writer failed");
              a.this.hfg.qI();
              a.this.hfg = null;
              if (a.this.kTS != null) {
                a.this.kTS.onError(5);
              }
              GMTrace.o(5958327599104L, 44393);
              return;
            }
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("MicroMsg.FaceVoiceRecordLogic", localException, "hy: delete file failed", new Object[0]);
            continue;
          }
        }
        if (p.fQL.fPy > 0)
        {
          a.this.exi.j(p.fQL.fPy, true);
          a.this.exi.de(50);
          a.this.exi.aB(false);
        }
        try
        {
          a.this.hfm = new com.tencent.mm.bd.a.c(5000, 16000, com.tencent.mm.bd.a.c.ghC.getInt("sil_time", 200), com.tencent.mm.bd.a.c.ghC.getFloat("s_n_ration", 2.5F), com.tencent.mm.bd.a.c.ghC.getInt("s_window", 50), com.tencent.mm.bd.a.c.ghC.getInt("s_length", 35), com.tencent.mm.bd.a.c.ghC.getInt("s_delay_time", 20), false, false);
          a.this.hfm.hfR = a.this.hfn;
          a.this.exi.exR = a.this.kTX;
          a.this.a(a.this.exR);
          if (!a.this.exi.qw())
          {
            w.e("MicroMsg.FaceVoiceRecordLogic", "hy: start record failed");
            if (a.this.kTS == null) {
              continue;
            }
            a.this.kTS.onError(7);
            continue;
            a.this.exi.j(5, false);
          }
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            w.e("MicroMsg.FaceVoiceRecordLogic", "hy: init VoiceDetectAPI failed :" + localThrowable.getMessage());
            if (a.this.kTS != null) {
              a.this.kTS.onError(6);
            }
          }
        }
        if (this.kTZ != null)
        {
          this.kTZ.run();
          continue;
          label557:
          w.w("MicroMsg.FaceVoiceRecordLogic", "hy: already called stop. should not start record");
        }
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void awz();
    
    public abstract void onError(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */