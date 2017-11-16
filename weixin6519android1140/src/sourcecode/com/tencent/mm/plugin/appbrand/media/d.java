package com.tencent.mm.plugin.appbrand.media;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.g.a.lf;
import com.tencent.mm.g.a.lf.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.media.encode.c.a;
import com.tencent.mm.plugin.appbrand.media.record.RecordParam;
import com.tencent.mm.plugin.appbrand.media.record.a.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;

public final class d
{
  private a.a irA;
  private c.a irB;
  private aj irc;
  public com.tencent.mm.plugin.appbrand.media.record.a irq;
  public Object irr;
  public RecordParam irs;
  public int irt;
  public com.tencent.mm.plugin.appbrand.media.encode.c iru;
  public boolean irv;
  public int irw;
  public long irx;
  private int iry;
  private ae irz;
  private long mDuration;
  private String mFilePath;
  public boolean mIsRecording;
  private long mStartTime;
  
  public d()
  {
    GMTrace.i(19858318163968L, 147956);
    this.irq = null;
    this.mIsRecording = false;
    this.irr = new Object();
    this.irt = a.irD;
    this.iru = null;
    this.irv = false;
    this.irw = 0;
    this.irc = null;
    this.mDuration = 0L;
    this.irx = 0L;
    this.iry = 0;
    this.mStartTime = 0L;
    this.irA = new a.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19847446528000L, 147875);
        w.i("MicroMsg.AudioRecordMgr", "onRecError state:%d, detailState:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        d.this.onError(1);
        GMTrace.o(19847446528000L, 147875);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(19847312310272L, 147874);
        if ((d.this.iru != null) && (d.this.irq != null))
        {
          d locald = d.this;
          int j = d.this.irw;
          com.tencent.mm.plugin.appbrand.media.record.a locala = d.this.irq;
          if (locala.exi != null) {}
          for (int i = locala.exi.exB;; i = 20)
          {
            locald.irw = (i + j);
            try
            {
              if (!d.this.iru.a(d.this.irv, paramAnonymousArrayOfByte, paramAnonymousInt)) {
                w.e("MicroMsg.AudioRecordMgr", "encode pcm fail!");
              }
              GMTrace.o(19847312310272L, 147874);
              return;
            }
            catch (Exception paramAnonymousArrayOfByte)
            {
              w.printErrStackTrace("MicroMsg.AudioRecordMgr", paramAnonymousArrayOfByte, "onRecPcmDataReady", new Object[0]);
              if ((d.this.irs == null) || (!"mp3".equalsIgnoreCase(d.this.irs.iaF))) {
                break;
              }
              g.iZ(19);
              GMTrace.o(19847312310272L, 147874);
              return;
              if ((d.this.irs == null) || (!"aac".equalsIgnoreCase(d.this.irs.iaF))) {
                break label212;
              }
              g.iZ(23);
            }
          }
        }
        label212:
        GMTrace.o(19847312310272L, 147874);
      }
    };
    this.irB = new c.a()
    {
      public final void a(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(19846909657088L, 147871);
        w.i("MicroMsg.AudioRecordMgr", "onFrameRecorded  buffSize:%d, isLastFrameL:%b", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(paramAnonymousBoolean) });
        lf locallf = new lf();
        locallf.ePx.state = "frameRecorded";
        locallf.ePx.action = 5;
        byte[] arrayOfByte = new byte[paramAnonymousInt];
        System.arraycopy(paramAnonymousArrayOfByte, 0, arrayOfByte, 0, paramAnonymousInt);
        locallf.ePx.ePy = arrayOfByte;
        locallf.ePx.ePz = paramAnonymousBoolean;
        com.tencent.mm.sdk.b.a.vgX.a(locallf, Looper.getMainLooper());
        GMTrace.o(19846909657088L, 147871);
      }
    };
    GMTrace.o(19858318163968L, 147956);
  }
  
  private boolean YG()
  {
    GMTrace.i(19858720817152L, 147959);
    w.i("MicroMsg.AudioRecordMgr", "startRecordInternal");
    if (this.irq != null)
    {
      this.irq.qn();
      this.irq = null;
      w.i("MicroMsg.AudioRecordMgr", "mRecorder is not null, stop it, and not callback stop event");
    }
    if (this.irq == null)
    {
      this.irq = new com.tencent.mm.plugin.appbrand.media.record.a(this.irs);
      this.irq.irX = this.irA;
    }
    com.tencent.mm.plugin.appbrand.media.record.a locala = this.irq;
    w.i("MicroMsg.AppBrandRecorder", "startRecord");
    if (locala.exi != null)
    {
      locala.exi.qn();
      locala.exi = null;
    }
    locala.irW = System.currentTimeMillis();
    w.i("MicroMsg.AppBrandRecorder", "start time ticket:%d", new Object[] { Long.valueOf(locala.irW) });
    locala.exi = new com.tencent.mm.e.b.c(locala.sampleRate, locala.irV, locala.exF);
    if ("mp3".equalsIgnoreCase(locala.irU.iaF))
    {
      locala.exi.de(40);
      locala.exi.aA(false);
      locala.exi.exR = locala.irY;
      if (!locala.exi.qw()) {
        break label253;
      }
    }
    label253:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.AudioRecordMgr", "record start:%b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(19858720817152L, 147959);
      return bool;
      locala.exi.de(20);
      break;
    }
  }
  
  private boolean YI()
  {
    GMTrace.i(19858989252608L, 147961);
    w.i("MicroMsg.AudioRecordMgr", "initEncode");
    if (this.iru != null)
    {
      this.iru.close();
      this.iru = null;
    }
    Object localObject1 = this.irs.iaF;
    Object localObject2 = this.irs.fRL;
    File localFile = new File(h.xy().fYU, "audio");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    localObject2 = new StringBuilder("audio").append(aa.RP((String)localObject2));
    if (!TextUtils.isEmpty((CharSequence)localObject1)) {
      if ("aac".equalsIgnoreCase((String)localObject1))
      {
        localObject1 = ".m4a";
        localObject1 = (String)localObject1;
        localFile = new File(localFile, (String)localObject1);
        w.d("MicroMsg.AudioRecordUtil", "getAudioFilePath audio name %s path %s", new Object[] { localObject1, localFile.getAbsoluteFile() });
        this.mFilePath = localFile.getAbsolutePath();
        w.i("MicroMsg.AudioRecordMgr", "mFilePath:%s", new Object[] { this.mFilePath });
        localObject1 = this.irs.iaF;
        w.i("MicroMsg.AudioEncodeFactory", "createEncodeByType:%s", new Object[] { localObject1 });
        if (!e.ri((String)localObject1)) {
          break label365;
        }
        if (!"aac".equalsIgnoreCase((String)localObject1)) {
          break label324;
        }
        localObject1 = new com.tencent.mm.plugin.appbrand.media.encode.a();
      }
    }
    boolean bool;
    for (;;)
    {
      this.iru = ((com.tencent.mm.plugin.appbrand.media.encode.c)localObject1);
      if (this.iru == null) {
        break label447;
      }
      bool = e.rj(this.mFilePath);
      if (bool) {
        break label370;
      }
      w.e("MicroMsg.AudioRecordMgr", "prepare cache file fail");
      GMTrace.o(19858989252608L, 147961);
      return bool;
      if ("mp3".equalsIgnoreCase((String)localObject1))
      {
        localObject1 = ".mp3";
        break;
      }
      if ("wav".equalsIgnoreCase((String)localObject1))
      {
        localObject1 = ".wav";
        break;
      }
      localObject1 = "";
      break;
      label324:
      if ("mp3".equalsIgnoreCase((String)localObject1)) {
        localObject1 = new com.tencent.mm.plugin.appbrand.media.encode.d();
      } else if ("wav".equalsIgnoreCase((String)localObject1)) {
        localObject1 = new com.tencent.mm.plugin.appbrand.media.encode.e();
      } else {
        label365:
        localObject1 = null;
      }
    }
    try
    {
      label370:
      bool = this.iru.e(this.mFilePath, this.irs.sampleRate, this.irs.isa, this.irs.isb);
      this.iru.a(this.irB);
      GMTrace.o(19858989252608L, 147961);
      return bool;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "init encoder fail", new Object[0]);
        bool = false;
      }
    }
    label447:
    GMTrace.o(19858989252608L, 147961);
    return false;
  }
  
  private ae YM()
  {
    GMTrace.i(19859526123520L, 147965);
    if (this.irz == null) {
      this.irz = new ae(Looper.getMainLooper());
    }
    ae localae = this.irz;
    GMTrace.o(19859526123520L, 147965);
    return localae;
  }
  
  public final void YH()
  {
    GMTrace.i(19858855034880L, 147960);
    for (;;)
    {
      try
      {
        w.i("MicroMsg.AudioRecordMgr", "_start in runnable");
        if (!YI())
        {
          onError(2);
          w.e("MicroMsg.AudioRecordMgr", "init encoder fail");
          GMTrace.o(19858855034880L, 147960);
          return;
        }
        this.irv = false;
        this.irw = 0;
        if (!YG()) {
          break;
        }
        Object localObject = this.iru;
        com.tencent.mm.plugin.appbrand.media.record.a locala = this.irq;
        if (locala.exi != null)
        {
          i = locala.exi.qv();
          ((com.tencent.mm.plugin.appbrand.media.encode.c)localObject).ja(i);
          this.iru.jb(this.irs.isc);
          this.iry = 0;
          this.mDuration = this.irs.duration;
          this.mStartTime = System.currentTimeMillis();
          this.irx = this.mDuration;
          w.i("MicroMsg.AudioRecordMgr", "mDuration:%d, mCurrentTime:%d", new Object[] { Long.valueOf(this.mDuration), Long.valueOf(this.mStartTime) });
          YM().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19853486325760L, 147920);
              d.this.aM(d.this.irx);
              GMTrace.o(19853486325760L, 147920);
            }
          });
          w.i("MicroMsg.AudioRecordMgr", "onStart");
          this.irt = a.irE;
          this.mIsRecording = true;
          localObject = new lf();
          ((lf)localObject).ePx.action = 0;
          ((lf)localObject).ePx.state = "start";
          com.tencent.mm.sdk.b.a.vgX.a((b)localObject, Looper.getMainLooper());
          w.i("MicroMsg.AudioRecordMgr", "start record success");
          GMTrace.o(19858855034880L, 147960);
          return;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "_start", new Object[0]);
        onError(4);
        GMTrace.o(19858855034880L, 147960);
        return;
      }
      int i = 0;
    }
    onError(6);
    w.e("MicroMsg.AudioRecordMgr", "start record fail");
    GMTrace.o(19858855034880L, 147960);
  }
  
  public final void YJ()
  {
    GMTrace.i(19859123470336L, 147962);
    try
    {
      w.i("MicroMsg.AudioRecordMgr", "_resume in runnable");
      if (this.iru == null)
      {
        onError(3);
        w.e("MicroMsg.AudioRecordMgr", "resume record fail");
        GMTrace.o(19859123470336L, 147962);
        return;
      }
      if (this.irx <= 0L)
      {
        YL();
        w.e("MicroMsg.AudioRecordMgr", "resume record fail, record time reach max time, to stop record");
        GMTrace.o(19859123470336L, 147962);
        return;
      }
      if (YG())
      {
        this.mStartTime = System.currentTimeMillis();
        w.i("MicroMsg.AudioRecordMgr", "mLimitTime:%d, currentTime:%d", new Object[] { Long.valueOf(this.irx), Long.valueOf(this.mStartTime) });
        YM().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19853217890304L, 147918);
            d.this.aM(d.this.irx);
            GMTrace.o(19853217890304L, 147918);
          }
        });
        w.i("MicroMsg.AudioRecordMgr", "onResume");
        this.irt = a.irF;
        this.mIsRecording = true;
        lf locallf = new lf();
        locallf.ePx.action = 1;
        locallf.ePx.state = "resume";
        com.tencent.mm.sdk.b.a.vgX.a(locallf, Looper.getMainLooper());
        w.i("MicroMsg.AudioRecordMgr", "resume record success");
        GMTrace.o(19859123470336L, 147962);
        return;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "_resume", new Object[0]);
      onError(5);
      GMTrace.o(19859123470336L, 147962);
      return;
    }
    onError(7);
    w.e("MicroMsg.AudioRecordMgr", "resume record fail");
    GMTrace.o(19859123470336L, 147962);
  }
  
  final void YK()
  {
    GMTrace.i(19859257688064L, 147963);
    w.i("MicroMsg.AudioRecordMgr", "pause record in runnable");
    for (;;)
    {
      try
      {
        if (isPause())
        {
          w.e("MicroMsg.AudioRecordMgr", "is paused, don't pause again");
          GMTrace.o(19859257688064L, 147963);
          return;
        }
        if (this.irq == null) {
          break label332;
        }
        bool = this.irq.qn();
        this.irq = null;
        YM().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19860868300800L, 147975);
            d.this.stopTimer();
            GMTrace.o(19860868300800L, 147975);
          }
        });
        long l1 = System.currentTimeMillis();
        long l2 = l1 - this.mStartTime;
        w.i("MicroMsg.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(this.iry) });
        this.iry = ((int)(this.iry + l2));
        this.irx = (this.mDuration - this.iry);
        w.i("MicroMsg.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", new Object[] { Long.valueOf(this.irx), Integer.valueOf(this.iry) });
      }
      catch (Exception localException)
      {
        lf locallf;
        w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "_pause", new Object[0]);
        bool = false;
        continue;
        onError(8);
        w.e("MicroMsg.AudioRecordMgr", "pause record fail");
        GMTrace.o(19859257688064L, 147963);
        return;
      }
      w.i("MicroMsg.AudioRecordMgr", "stop:%b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        w.i("MicroMsg.AudioRecordMgr", "onPause");
        this.irt = a.irG;
        this.mIsRecording = false;
        locallf = new lf();
        locallf.ePx.action = 3;
        locallf.ePx.state = "pause";
        com.tencent.mm.sdk.b.a.vgX.a(locallf, Looper.getMainLooper());
        w.i("MicroMsg.AudioRecordMgr", "pause record success");
        GMTrace.o(19859257688064L, 147963);
        return;
      }
      label332:
      boolean bool = false;
    }
  }
  
  public final void YL()
  {
    GMTrace.i(19859391905792L, 147964);
    w.i("MicroMsg.AudioRecordMgr", "stop record in runnable");
    for (;;)
    {
      try
      {
        if (bwb())
        {
          w.e("MicroMsg.AudioRecordMgr", "is stopped, don't stop again");
          GMTrace.o(19859391905792L, 147964);
          return;
        }
        if (this.irq == null) {
          continue;
        }
        bool = this.irq.qn();
        this.irq = null;
        this.irv = true;
        w.i("MicroMsg.AudioRecordMgr", "mPcmDuration:%d", new Object[] { Integer.valueOf(this.irw) });
        if (this.iru != null)
        {
          this.iru.flush();
          this.iru.close();
          this.iru = null;
        }
        YM().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19853754761216L, 147922);
            d.this.stopTimer();
            GMTrace.o(19853754761216L, 147922);
          }
        });
        l1 = System.currentTimeMillis();
        long l2 = System.currentTimeMillis() - this.mStartTime;
        w.i("MicroMsg.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(this.iry) });
        this.iry = ((int)(this.iry + l2));
        this.irx = (this.mDuration - this.iry);
        w.i("MicroMsg.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", new Object[] { Long.valueOf(this.irx), Integer.valueOf(this.iry) });
      }
      catch (Exception localException)
      {
        lf locallf;
        lf.a locala;
        String str;
        File localFile;
        w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "_stop", new Object[0]);
        boolean bool = false;
        continue;
        w.i("MicroMsg.AudioRecordUtil", "audio file not exit, path:%s", new Object[] { str });
        long l1 = -1L;
        continue;
        onError(9);
        w.e("MicroMsg.AudioRecordMgr", "stop record fail");
        continue;
      }
      w.i("MicroMsg.AudioRecordMgr", "stop:%b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        continue;
      }
      w.i("MicroMsg.AudioRecordMgr", "onStop");
      this.irt = a.irH;
      this.mIsRecording = false;
      locallf = new lf();
      locallf.ePx.action = 2;
      locallf.ePx.state = "stop";
      locallf.ePx.duration = this.iry;
      locallf.ePx.filePath = this.mFilePath;
      locala = locallf.ePx;
      str = this.mFilePath;
      localFile = new File(str);
      if (!localFile.exists()) {
        continue;
      }
      w.i("MicroMsg.AudioRecordUtil", "exist audio file");
      l1 = localFile.length();
      locala.fileSize = ((int)l1);
      com.tencent.mm.sdk.b.a.vgX.a(locallf, Looper.getMainLooper());
      w.i("MicroMsg.AudioRecordMgr", "stop record success");
      this.irs = null;
      GMTrace.o(19859391905792L, 147964);
      return;
      w.e("MicroMsg.AudioRecordMgr", "mRecorder is null, has stop record!");
      bool = true;
    }
  }
  
  public final void aM(long paramLong)
  {
    GMTrace.i(19858183946240L, 147955);
    stopTimer();
    w.i("MicroMsg.AudioRecordMgr", "startTimer");
    this.irc = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(19856573333504L, 147943);
        w.i("MicroMsg.AudioRecordMgr", "timer, onTimerExpired to stop record");
        d.this.qn();
        GMTrace.o(19856573333504L, 147943);
        return true;
      }
    }, false);
    this.irc.z(paramLong, paramLong);
    GMTrace.o(19858183946240L, 147955);
  }
  
  public final boolean bwb()
  {
    GMTrace.i(21076478263296L, 157032);
    if (this.irt == a.irH)
    {
      GMTrace.o(21076478263296L, 157032);
      return true;
    }
    GMTrace.o(21076478263296L, 157032);
    return false;
  }
  
  public final boolean isPause()
  {
    GMTrace.i(19858452381696L, 147957);
    if (this.irt == a.irG)
    {
      GMTrace.o(19858452381696L, 147957);
      return true;
    }
    GMTrace.o(19858452381696L, 147957);
    return false;
  }
  
  protected final void onError(int paramInt)
  {
    GMTrace.i(19859660341248L, 147966);
    w.i("MicroMsg.AudioRecordMgr", "onError errType:%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.irt != a.irI)
    {
      localObject1 = new ArrayList();
      localObject2 = new IDKey();
      ((IDKey)localObject2).SetID(689);
      ((IDKey)localObject2).SetKey(1);
      ((IDKey)localObject2).SetValue(1L);
      localObject3 = new IDKey();
      ((IDKey)localObject3).SetID(689);
      ((IDKey)localObject3).SetKey(f.iY(paramInt));
      ((IDKey)localObject3).SetValue(1L);
      ((ArrayList)localObject1).add(localObject2);
      ((ArrayList)localObject1).add(localObject3);
      com.tencent.mm.plugin.report.service.g.ork.b((ArrayList)localObject1, true);
    }
    this.irt = a.irI;
    this.mIsRecording = false;
    Object localObject1 = new lf();
    ((lf)localObject1).ePx.action = 4;
    ((lf)localObject1).ePx.state = "error";
    ((lf)localObject1).ePx.errCode = paramInt;
    Object localObject2 = ((lf)localObject1).ePx;
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("errType:" + paramInt + ", err:");
    switch (paramInt)
    {
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    default: 
      ((StringBuilder)localObject3).append("unknow error");
    }
    for (;;)
    {
      ((lf.a)localObject2).eAR = ((StringBuilder)localObject3).toString();
      com.tencent.mm.sdk.b.a.vgX.a((b)localObject1, Looper.getMainLooper());
      GMTrace.o(19859660341248L, 147966);
      return;
      ((StringBuilder)localObject3).append("error PCM record callback");
      continue;
      ((StringBuilder)localObject3).append("init encoder fail, occur exception");
      continue;
      ((StringBuilder)localObject3).append("encoder un initial occur exception");
      continue;
      ((StringBuilder)localObject3).append("start record occur exception");
      continue;
      ((StringBuilder)localObject3).append("resume record occur exception");
      continue;
      ((StringBuilder)localObject3).append("fail to start record");
      continue;
      ((StringBuilder)localObject3).append("fail to resume record");
      continue;
      ((StringBuilder)localObject3).append("fail to pause record");
      continue;
      ((StringBuilder)localObject3).append("fail to stop record");
      continue;
      ((StringBuilder)localObject3).append("check param invalid");
      continue;
      ((StringBuilder)localObject3).append("not support format type");
      continue;
      ((StringBuilder)localObject3).append("fail to init mp3 encoder");
      continue;
      ((StringBuilder)localObject3).append("mp3 file not found exception");
      continue;
      ((StringBuilder)localObject3).append("mp3 encode exception");
      continue;
      ((StringBuilder)localObject3).append("mp3 write buffer exception");
      continue;
      ((StringBuilder)localObject3).append("fail to init aac encoder");
      continue;
      ((StringBuilder)localObject3).append("fail to create mp4 file");
      continue;
      ((StringBuilder)localObject3).append("aac encode exception");
      continue;
      ((StringBuilder)localObject3).append("create cache file fail");
      continue;
      ((StringBuilder)localObject3).append("init encoder fail");
      continue;
      ((StringBuilder)localObject3).append("not support sample rate");
    }
  }
  
  public final boolean qn()
  {
    GMTrace.i(19858586599424L, 147958);
    w.i("MicroMsg.AudioRecordMgr", "stopRecord");
    if ((this.irq == null) && (this.iru == null))
    {
      w.e("MicroMsg.AudioRecordMgr", "mRecord is null and mAudioEncoder is null, stop fail");
      GMTrace.o(19858586599424L, 147958);
      return false;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19856841768960L, 147945);
        synchronized (d.this.irr)
        {
          d.this.YL();
          GMTrace.o(19856841768960L, 147945);
          return;
        }
      }
    }, "app_brand_stop_record");
    GMTrace.o(19858586599424L, 147958);
    return true;
  }
  
  public final void stopTimer()
  {
    GMTrace.i(19858049728512L, 147954);
    w.i("MicroMsg.AudioRecordMgr", "stopTimer");
    if (this.irc != null) {
      this.irc.stopTimer();
    }
    this.irc = null;
    GMTrace.o(19858049728512L, 147954);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19847043874816L, 147872);
      irD = 1;
      irE = 2;
      irF = 3;
      irG = 4;
      irH = 5;
      irI = 6;
      irJ = new int[] { irD, irE, irF, irG, irH, irI };
      GMTrace.o(19847043874816L, 147872);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */