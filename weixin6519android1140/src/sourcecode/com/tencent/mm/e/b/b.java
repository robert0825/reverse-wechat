package com.tencent.mm.e.b;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bb.c.1;
import com.tencent.mm.bb.d;
import com.tencent.mm.bb.d.a;
import com.tencent.mm.bb.d.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public final class b
{
  public static Object exe;
  public int ewU;
  public String ewV;
  private int ewW;
  public com.tencent.mm.e.c.c ewX;
  public a ewY;
  public com.tencent.mm.bb.c ewZ;
  public d.a exa;
  public long exb;
  public long exc;
  public int exd;
  public int exf;
  public boolean exg;
  public MediaRecorder exh;
  public c exi;
  public com.tencent.mm.compatible.b.b.a exj;
  public b exk;
  public volatile boolean exl;
  public com.tencent.mm.compatible.util.g.a exm;
  private c.a exn;
  public int mSampleRate;
  
  static
  {
    GMTrace.i(4474550616064L, 33338);
    exe = new Object();
    GMTrace.o(4474550616064L, 33338);
  }
  
  public b(com.tencent.mm.compatible.b.b.a parama)
  {
    GMTrace.i(4469987213312L, 33304);
    this.ewU = 0;
    this.ewV = null;
    this.ewX = null;
    this.ewZ = null;
    this.exa = null;
    this.exb = 0L;
    this.exc = 0L;
    this.exd = 0;
    this.mSampleRate = 8000;
    this.exf = 16000;
    this.exg = false;
    this.exi = null;
    this.exl = false;
    this.exm = new com.tencent.mm.compatible.util.g.a();
    this.exn = new c.a()
    {
      private static byte[] e(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(4478979801088L, 33371);
        int j = paramAnonymousInt % 4;
        int i = paramAnonymousInt;
        if (j != 0) {
          i = paramAnonymousInt - j;
        }
        if (i <= 0)
        {
          GMTrace.o(4478979801088L, 33371);
          return null;
        }
        byte[] arrayOfByte = new byte[i / 2];
        paramAnonymousInt = 0;
        while (paramAnonymousInt < i / 2)
        {
          arrayOfByte[paramAnonymousInt] = paramAnonymousArrayOfByte[(paramAnonymousInt * 2)];
          arrayOfByte[(paramAnonymousInt + 1)] = paramAnonymousArrayOfByte[(paramAnonymousInt * 2 + 1)];
          paramAnonymousInt += 2;
        }
        GMTrace.o(4478979801088L, 33371);
        return arrayOfByte;
      }
      
      private void f(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(4479114018816L, 33372);
        int i = 0;
        while (i < paramAnonymousInt / 2)
        {
          int j = (short)(paramAnonymousArrayOfByte[(i * 2)] & 0xFF | paramAnonymousArrayOfByte[(i * 2 + 1)] << 8);
          if (j > b.this.ewU) {
            b.this.ewU = j;
          }
          i += 1;
        }
        GMTrace.o(4479114018816L, 33372);
      }
      
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4479248236544L, 33373);
        GMTrace.o(4479248236544L, 33373);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(4478845583360L, 33370);
        w.i("MicroMsg.MMAudioRecorder", "onRecPcmDataReady, markStop: %s", new Object[] { Boolean.valueOf(b.this.exl) });
        if ((b.this.exk == b.b.exu) && (!b.this.exl))
        {
          w.w("MicroMsg.MMAudioRecorder", "recorder has been stopped");
          GMTrace.o(4478845583360L, 33370);
          return;
        }
        boolean bool1 = false;
        boolean bool2 = false;
        synchronized (b.exe)
        {
          if (b.this.exl)
          {
            if (b.this.exi != null)
            {
              w.i("MicroMsg.MMAudioRecorder", "do stop pcm recorder, last frame data: %s, read: %s", new Object[] { paramAnonymousArrayOfByte, Integer.valueOf(paramAnonymousInt) });
              b.this.exi.qn();
              b.this.exi.exR = null;
              b.this.exi = null;
              bool1 = true;
              b.this.exl = false;
            }
          }
          else
          {
            long l = bg.aH(b.this.exc);
            if ((b.this.exb <= 0L) || (l <= b.this.exb)) {
              break label281;
            }
            w.w("MicroMsg.MMAudioRecorder", "Stop now ! expire duration ms:" + l);
            new ae(Looper.getMainLooper()).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(4475758575616L, 33347);
                b.this.qt();
                if (b.this.ewY != null) {
                  b.this.ewY.onError();
                }
                GMTrace.o(4475758575616L, 33347);
              }
            });
            GMTrace.o(4478845583360L, 33370);
            return;
          }
          w.i("MicroMsg.MMAudioRecorder", "stop now, but recorder is null");
          bool1 = bool2;
        }
        label281:
        w.d("MicroMsg.MMAudioRecorder", "read :" + paramAnonymousInt + " time: " + b.this.exm.tD() + " dataReadedCnt: " + b.this.exd);
        if (paramAnonymousInt < 0)
        {
          if (b.this.exk == b.b.exu)
          {
            w.w("MicroMsg.MMAudioRecorder", "recorder has been stopped");
            GMTrace.o(4478845583360L, 33370);
            return;
          }
          new ae(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4480187760640L, 33380);
              b.this.qt();
              if (b.this.ewY != null) {
                b.this.ewY.onError();
              }
              GMTrace.o(4480187760640L, 33380);
            }
          });
          GMTrace.o(4478845583360L, 33370);
          return;
        }
        b.this.exd += paramAnonymousInt;
        if ((b.this.ewZ == null) && ((b.this.exj == com.tencent.mm.compatible.b.b.a.fMK) || (b.this.exj == com.tencent.mm.compatible.b.b.a.fMM)) && (b.this.exa != null) && (b.this.exg))
        {
          b.this.ewZ = new com.tencent.mm.bb.c();
          ??? = b.this.ewZ;
          i = b.this.mSampleRate;
          w.i("MicroMsg.SpeexEncoderWorker", "init ");
          ((com.tencent.mm.bb.c)???).gVV.clear();
          d.b localb = new d.b();
          localb.gTl = d.getPrefix();
          localb.sampleRate = i;
          localb.gVQ = 1;
          localb.gVR = 16;
          ((com.tencent.mm.bb.c)???).mFileName = String.format("%s%d_%d_%d_%d", new Object[] { localb.gTl, Integer.valueOf(localb.sampleRate), Integer.valueOf(localb.gVQ), Integer.valueOf(localb.gVR), Long.valueOf(System.currentTimeMillis()) });
        }
        if (b.this.ewZ != null)
        {
          ??? = b.this.ewZ;
          w.d("MicroMsg.SpeexEncoderWorker", "push into queue queueLen:" + ((com.tencent.mm.bb.c)???).gVV.size());
          if ((paramAnonymousArrayOfByte != null) && (paramAnonymousArrayOfByte.length > 0)) {
            ((com.tencent.mm.bb.c)???).gVV.add(new g.a(paramAnonymousArrayOfByte, paramAnonymousArrayOfByte.length));
          }
        }
        if (b.this.exj == com.tencent.mm.compatible.b.b.a.fMM)
        {
          if (b.this.ewX == null)
          {
            b.this.ewX = new com.tencent.mm.e.c.c(b.this.mSampleRate, b.this.exf);
            b.this.ewX.bU(b.this.ewV);
          }
          f(paramAnonymousArrayOfByte, paramAnonymousInt);
          ??? = b.this.ewX;
          if (((com.tencent.mm.e.c.c)???).ezr == null) {
            i = -1;
          }
          for (;;)
          {
            int j;
            if (paramAnonymousArrayOfByte == null)
            {
              j = -1;
              label801:
              w.d("MicroMsg.SilkWriter", "pushBuf queueLen:%d bufLen:%d len:%d, lastFrame: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramAnonymousInt), Boolean.valueOf(bool1) });
              if (paramAnonymousInt <= 0) {
                break label967;
              }
            }
            try
            {
              if (((com.tencent.mm.e.c.c)???).ezs)
              {
                w.e("MicroMsg.SilkWriter", "already stop");
                GMTrace.o(4478845583360L, 33370);
                return;
                i = ((com.tencent.mm.e.c.c)???).ezr.size();
                continue;
                j = paramAnonymousArrayOfByte.length;
                break label801;
              }
              else
              {
                if (((com.tencent.mm.e.c.c)???).ezy == null)
                {
                  ((com.tencent.mm.e.c.c)???).ezy = new com.tencent.mm.e.c.c.a((com.tencent.mm.e.c.c)???);
                  com.tencent.mm.sdk.f.e.post(((com.tencent.mm.e.c.c)???).ezy, "SilkWriter_run");
                }
                if (((com.tencent.mm.e.c.c)???).ezr != null) {
                  ((com.tencent.mm.e.c.c)???).ezr.add(new g.a(paramAnonymousArrayOfByte, paramAnonymousInt, bool1));
                }
                label967:
                GMTrace.o(4478845583360L, 33370);
                return;
              }
            }
            finally {}
          }
        }
        ??? = paramAnonymousArrayOfByte;
        int i = paramAnonymousInt;
        if (b.this.mSampleRate == 16000)
        {
          ??? = e(paramAnonymousArrayOfByte, paramAnonymousInt);
          i = ???.length;
        }
        f((byte[])???, i);
        GMTrace.o(4478845583360L, 33370);
      }
    };
    w.i("MicroMsg.MMAudioRecorder", "MMAudioRecorder recMode: " + parama);
    this.exj = parama;
    if (!g.b.qB())
    {
      w.i("MicroMsg.MMAudioRecorder", "can't use silk encode, force to use amr mode now");
      this.exj = com.tencent.mm.compatible.b.b.a.fML;
    }
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      this.ewW = 7;
      this.exh = new MediaRecorder();
    }
    for (;;)
    {
      this.exl = false;
      GMTrace.o(4469987213312L, 33304);
      return;
      qs();
      this.ewW = 1;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(4470121431040L, 33305);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh == null)
      {
        GMTrace.o(4470121431040L, 33305);
        return;
      }
      this.ewY = parama;
      this.exh.setOnErrorListener(new MediaRecorder.OnErrorListener()
      {
        public final void onError(MediaRecorder paramAnonymousMediaRecorder, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(4490119872512L, 33454);
          if (b.this.ewY != null) {
            b.this.ewY.onError();
          }
          try
          {
            b.this.exh.release();
            b.this.exk = b.b.ext;
            GMTrace.o(4490119872512L, 33454);
            return;
          }
          catch (Exception paramAnonymousMediaRecorder)
          {
            for (;;)
            {
              w.e("MicroMsg.MMAudioRecorder", paramAnonymousMediaRecorder.getMessage());
            }
          }
        }
      });
      GMTrace.o(4470121431040L, 33305);
      return;
    }
    if (this.exk == b.exq)
    {
      this.ewY = parama;
      GMTrace.o(4470121431040L, 33305);
      return;
    }
    w.e("MicroMsg.MMAudioRecorder", "setOnErrorListener on wrong state");
    GMTrace.o(4470121431040L, 33305);
  }
  
  public final int getMaxAmplitude()
  {
    GMTrace.i(4470926737408L, 33311);
    int i;
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh == null)
      {
        GMTrace.o(4470926737408L, 33311);
        return 0;
      }
      i = this.exh.getMaxAmplitude();
      GMTrace.o(4470926737408L, 33311);
      return i;
    }
    if (this.exk == b.exs)
    {
      i = this.ewU;
      this.ewU = 0;
      GMTrace.o(4470926737408L, 33311);
      return i;
    }
    GMTrace.o(4470926737408L, 33311);
    return 0;
  }
  
  public final void prepare()
  {
    GMTrace.i(4471329390592L, 33314);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh != null) {
        this.exh.prepare();
      }
      GMTrace.o(4471329390592L, 33314);
      return;
    }
    if ((this.exk != b.exq) || (this.ewV == null))
    {
      this.exk = b.ext;
      release();
      GMTrace.o(4471329390592L, 33314);
      return;
    }
    this.exk = b.exr;
    GMTrace.o(4471329390592L, 33314);
  }
  
  public final void qp()
  {
    GMTrace.i(4470524084224L, 33308);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh != null) {
        this.exh.setAudioEncoder(1);
      }
      GMTrace.o(4470524084224L, 33308);
      return;
    }
    GMTrace.o(4470524084224L, 33308);
  }
  
  public final void qq()
  {
    GMTrace.i(4470658301952L, 33309);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh == null)
      {
        GMTrace.o(4470658301952L, 33309);
        return;
      }
      this.exh.setAudioSource(1);
      GMTrace.o(4470658301952L, 33309);
      return;
    }
    GMTrace.o(4470658301952L, 33309);
  }
  
  public final void qr()
  {
    GMTrace.i(4470792519680L, 33310);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh == null)
      {
        GMTrace.o(4470792519680L, 33310);
        return;
      }
      this.exh.setOutputFormat(3);
      GMTrace.o(4470792519680L, 33310);
      return;
    }
    GMTrace.o(4470792519680L, 33310);
  }
  
  public final void qs()
  {
    GMTrace.i(4471060955136L, 33312);
    this.exa = d.a.Md();
    boolean bool;
    if (this.exa != null)
    {
      ??? = this.exa;
      if (1 != g.k("EnableSpeexVoiceUpload", 0)) {
        break label260;
      }
      bool = true;
    }
    for (;;)
    {
      this.exg = bool;
      Object localObject2;
      if (this.exj == com.tencent.mm.compatible.b.b.a.fMM)
      {
        ??? = ((a)h.h(a.class)).ut().getValue("VoiceSamplingRate");
        this.mSampleRate = bg.getInt((String)???, 16000);
        localObject2 = ((a)h.h(a.class)).ut().getValue("VoiceRate");
        this.exf = bg.getInt((String)localObject2, 16000);
        w.i("MicroMsg.MMAudioRecorder", "initMediaRecorder dynamicSample: %s sampleRate: %d dynamicEncoding: %s audioEncoding: %d", new Object[] { ???, Integer.valueOf(this.mSampleRate), localObject2, Integer.valueOf(this.exf) });
        label163:
        this.ewU = 0;
        this.ewV = null;
        this.ewZ = null;
        this.ewX = null;
        this.exd = 0;
      }
      try
      {
        synchronized (exe)
        {
          this.exi = new c(this.mSampleRate, 1, 0);
          this.exi.aA(true);
          this.exi.de(120);
          this.exi.exR = this.exn;
          this.exk = b.exq;
          GMTrace.o(4471060955136L, 33312);
          return;
          label260:
          w.d("upload", "type " + d.chatType);
          int j = ((d.a)???).Mc();
          int i = ((d.a)???).Mb();
          h.xz();
          localObject2 = Integer.valueOf(bg.e((Integer)h.xy().xh().get(16646145, null)));
          w.d("upload", "daycount " + ((d.a)???).Mc() + "  count " + localObject2 + " rate " + i);
          if ((((Integer)localObject2).intValue() <= j) && (i != 0) && (am.isWifi(ab.getContext())))
          {
            h.xz();
            j = bg.a((Integer)h.xy().xh().get(12290, null), 0);
            if (((d.a)???).fja == 0) {
              bool = true;
            }
            for (;;)
            {
              w.d("upload", "fitSex " + ((d.a)???).fja + " " + bool + " " + ((d.a)???).fja);
              if ((!bool) || (!((d.a)???).Ma())) {
                break label557;
              }
              j = ((d.a)???).gWj.nextInt(i);
              w.d("upload", "luck " + j);
              if (j != i / 2) {
                break label557;
              }
              bool = true;
              break;
              if (((d.a)???).fja == j) {
                bool = true;
              } else {
                bool = false;
              }
            }
          }
          label557:
          bool = false;
          continue;
          if (this.exg)
          {
            this.mSampleRate = 16000;
            h.xz();
            i = bg.a((Integer)h.xy().fYL.get(27), 0);
            w.i("MicroMsg.MMAudioRecorder", "sampleRate: " + this.mSampleRate + " notSupp16K: " + i);
            if (i != 1) {
              break label163;
            }
            this.mSampleRate = 8000;
            break label163;
          }
          this.mSampleRate = 8000;
        }
        w.e("MicroMsg.MMAudioRecorder", localException.getMessage());
      }
      catch (Exception localException)
      {
        if (localException.getMessage() == null) {}
      }
    }
    for (;;)
    {
      this.exk = b.ext;
      GMTrace.o(4471060955136L, 33312);
      return;
      w.e("MicroMsg.MMAudioRecorder", "Unknown error occured while initializing recording");
    }
  }
  
  public final boolean qt()
  {
    GMTrace.i(4471597826048L, 33316);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      w.i("MicroMsg.MMAudioRecorder", "stop sysMediaRecorder: %s", new Object[] { this.exh });
      if (this.exh != null)
      {
        this.exh.stop();
        this.exh.release();
        this.exh = null;
      }
      GMTrace.o(4471597826048L, 33316);
      return true;
    }
    com.tencent.mm.compatible.util.g.a locala = new com.tencent.mm.compatible.util.g.a();
    w.i("MicroMsg.MMAudioRecorder", "stop now state: " + this.exk);
    if (this.exk != b.exs)
    {
      w.e("MicroMsg.MMAudioRecorder", "stop() called on illegal state");
      this.exk = b.ext;
      GMTrace.o(4471597826048L, 33316);
      return true;
    }
    for (;;)
    {
      long l1;
      long l2;
      int i;
      int j;
      synchronized (exe)
      {
        if (this.exi != null)
        {
          this.exl = true;
          l1 = locala.tD();
          this.exk = b.exu;
          l2 = locala.tD();
          if (this.exl)
          {
            w.i("MicroMsg.MMAudioRecorder", "start to wait pcmrecorder stop, markStop: %s", new Object[] { Boolean.valueOf(this.exl) });
            i = 0;
            j = i;
            if (this.exl) {
              j = i + 1;
            }
          }
        }
      }
      try
      {
        Thread.sleep(20L);
        i = j;
        if (j < 25) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        synchronized (exe)
        {
          w.i("MicroMsg.MMAudioRecorder", "wait pcmrecorder stop, reach maximum count!, mPcmRecorder: %s", new Object[] { this.exi });
          c localc = this.exi;
          if (localc != null) {}
          try
          {
            this.exi.qn();
            this.exi.exR = null;
            this.exi = null;
            w.i("MicroMsg.MMAudioRecorder", "finish to wait pcmrecorder stop, markStop: %s, count: %s", new Object[] { Boolean.valueOf(this.exl), Integer.valueOf(j) });
            if (this.ewX != null) {
              this.ewX.qI();
            }
            if (this.ewZ != null)
            {
              ??? = this.ewZ;
              w.i("MicroMsg.SpeexEncoderWorker", "stop ");
              new ae(Looper.getMainLooper()).post(new c.1((com.tencent.mm.bb.c)???));
            }
            long l3 = bg.aH(this.exc);
            w.i("MicroMsg.MMAudioRecorder", "toNow " + l3 + " startTickCnt: " + this.exc + " pcmDataReadedCnt: " + this.exd);
            if ((l3 > 2000L) && (this.exd == 0))
            {
              h.xz();
              h.xy().fYL.set(27, Integer.valueOf(1));
              w.i("MicroMsg.MMAudioRecorder", "16k not suppourt");
            }
            w.i("MicroMsg.MMAudioRecorder", "Wait Stop Time Media:" + l1 + " Read:" + l2 + " Thr:" + locala.tD());
            GMTrace.o(4471597826048L, 33316);
            return false;
            this.exl = false;
            continue;
            localObject1 = finally;
            throw ((Throwable)localObject1);
            localInterruptedException = localInterruptedException;
            w.printErrStackTrace("MicroMsg.MMAudioRecorder", localInterruptedException, "", new Object[0]);
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.MMAudioRecorder", localException, "", new Object[0]);
            }
          }
        }
      }
    }
  }
  
  public final void release()
  {
    GMTrace.i(4471463608320L, 33315);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh != null) {
        this.exh.release();
      }
      GMTrace.o(4471463608320L, 33315);
      return;
    }
    if (this.exk == b.exs) {
      qt();
    }
    synchronized (exe)
    {
      if (this.exi != null)
      {
        this.exi.qn();
        this.exi.exR = null;
        this.exi = null;
      }
      GMTrace.o(4471463608320L, 33315);
      return;
      ??? = b.exr;
    }
  }
  
  public final void setMaxDuration(int paramInt)
  {
    GMTrace.i(4470389866496L, 33307);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh != null) {
        this.exh.setMaxDuration(paramInt);
      }
      GMTrace.o(4470389866496L, 33307);
      return;
    }
    this.exb = paramInt;
    GMTrace.o(4470389866496L, 33307);
  }
  
  public final void setOutputFile(String paramString)
  {
    GMTrace.i(4470255648768L, 33306);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh == null)
      {
        GMTrace.o(4470255648768L, 33306);
        return;
      }
      this.exh.setOutputFile(paramString);
      this.ewV = paramString;
      GMTrace.o(4470255648768L, 33306);
      return;
    }
    if (this.exk == b.exq)
    {
      this.ewV = paramString;
      GMTrace.o(4470255648768L, 33306);
      return;
    }
    w.e("MicroMsg.MMAudioRecorder", "set output path on wrong state");
    this.exk = b.ext;
    GMTrace.o(4470255648768L, 33306);
  }
  
  public final void start()
  {
    GMTrace.i(4471195172864L, 33313);
    if (this.exj == com.tencent.mm.compatible.b.b.a.fML)
    {
      if (this.exh != null) {
        this.exh.start();
      }
      GMTrace.o(4471195172864L, 33313);
      return;
    }
    w.i("MicroMsg.MMAudioRecorder", "Start record now state: " + this.exk + " recMode: " + this.exj);
    if (this.exk == b.exr)
    {
      this.exc = System.currentTimeMillis();
      this.exd = 0;
    }
    for (this.exk = b.exs;; this.exk = b.ext)
    {
      synchronized (exe)
      {
        this.exi.qw();
        this.exl = false;
        GMTrace.o(4471195172864L, 33313);
        return;
      }
      h.xz();
      h.xy().fYL.set(27, Integer.valueOf(1));
      w.e("MicroMsg.MMAudioRecorder", "start() called on illegal state");
    }
  }
  
  public static abstract interface a
  {
    public abstract void onError();
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(4480858849280L, 33385);
      exq = new b("INITIALIZING", 0);
      exr = new b("READY", 1);
      exs = new b("RECORDING", 2);
      ext = new b("ERROR", 3);
      exu = new b("STOPPED", 4);
      exv = new b[] { exq, exr, exs, ext, exu };
      GMTrace.o(4480858849280L, 33385);
    }
    
    private b()
    {
      GMTrace.i(4480724631552L, 33384);
      GMTrace.o(4480724631552L, 33384);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */