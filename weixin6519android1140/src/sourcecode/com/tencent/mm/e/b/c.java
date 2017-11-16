package com.tencent.mm.e.b;

import android.media.AudioRecord;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.compatible.b.h;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.a.ll;
import com.tencent.mm.g.a.ll.b;
import com.tencent.mm.g.a.lm;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class c
{
  private int exA;
  public int exB;
  private boolean exC;
  public boolean exD;
  private int exE;
  private int exF;
  public int exG;
  private boolean exH;
  public long exI;
  int exJ;
  boolean exK;
  int exL;
  private boolean exM;
  public int exN;
  public boolean exO;
  public boolean exP;
  private AudioRecord exQ;
  public a exR;
  private f exS;
  private com.tencent.mm.compatible.b.f exT;
  public com.tencent.mm.e.c.b exU;
  private int exV;
  public int exW;
  private int exX;
  private f.a exY;
  public int exw;
  int exx;
  int exy;
  int exz;
  private int mSampleRate;
  
  public c(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20207686909952L, 150559);
    this.exw = 0;
    this.exx = 0;
    this.exy = 0;
    this.exz = 0;
    this.exA = 1;
    this.mSampleRate = 8000;
    this.exB = 120;
    this.exC = false;
    this.exD = false;
    this.exE = 10;
    this.exF = -1;
    this.exG = -123456789;
    this.exH = false;
    this.exI = -1L;
    this.exK = false;
    this.exM = false;
    this.exN = 0;
    this.exO = false;
    this.exP = false;
    this.exV = 2;
    this.exW = 1;
    this.exX = 0;
    this.exY = new f.a()
    {
      public final void c(int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(4478308712448L, 33366);
        c.this.exN += 1;
        if ((c.this.exP) && (System.currentTimeMillis() - c.this.exI <= 1000L) && (c.this.exN - 10 > (System.currentTimeMillis() - c.this.exI) / c.this.exB))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 4L, 1L, false);
          w.e("MicroMsg.MMPcmRecorder", "return too many data, force stop, %d, %d", new Object[] { Integer.valueOf(c.this.exN), Long.valueOf((System.currentTimeMillis() - c.this.exI) / c.this.exB) });
          c.this.exO = true;
        }
        if (c.this.exU != null) {
          c.this.exU.h(paramAnonymousArrayOfByte, paramAnonymousInt);
        }
        c localc;
        int m;
        int i;
        int k;
        int n;
        int j;
        if (paramAnonymousInt > 0)
        {
          localc = c.this;
          if ((!localc.exK) || (-2 != localc.exy))
          {
            m = paramAnonymousInt / localc.exJ;
            i = 5;
            if (i <= localc.exL + m)
            {
              k = (i - localc.exL - 1) * localc.exJ;
              n = localc.exJ + k;
              if (k >= 0)
              {
                j = k;
                if (n <= paramAnonymousInt) {
                  break label642;
                }
              }
              w.e("MicroMsg.MMPcmRecorder", "error start: %d, end: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(n) });
            }
            localc.exL = ((localc.exL + m) % 5);
            if (localc.exy == 20)
            {
              localc.exw = 6;
              w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_ERROR");
              if ((localc.exx != -1) || (localc.exz != -1)) {
                break label687;
              }
              localc.exw = 11;
              w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
              label385:
              com.tencent.mm.plugin.report.service.g.ork.a(151L, 0L, 1L, false);
              com.tencent.mm.plugin.report.service.g.ork.a(151L, 5L, 1L, false);
              localc.exy = -2;
              localc.qx();
            }
          }
        }
        if (c.this.exD)
        {
          if (paramAnonymousInt > 0)
          {
            localc = c.this;
            if (localc.exx != -1)
            {
              j = 0;
              i = 0;
              label457:
              if (i < paramAnonymousInt / 2)
              {
                m = (short)(paramAnonymousArrayOfByte[(i * 2 + 1)] << 8 | paramAnonymousArrayOfByte[(i * 2 + 0)] & 0xFF);
                if (m < 32760)
                {
                  k = j;
                  if (m != 32768) {}
                }
                else
                {
                  k = j + 1;
                }
                if (k < 5) {
                  break label739;
                }
                localc.exx += 1;
              }
              if (localc.exx > 100)
              {
                localc.exw = 7;
                w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_ERROR");
                if ((localc.exy != -2) || (localc.exz != -1)) {
                  break label750;
                }
                localc.exw = 11;
                w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
              }
            }
            for (;;)
            {
              com.tencent.mm.plugin.report.service.g.ork.a(151L, 0L, 1L, false);
              com.tencent.mm.plugin.report.service.g.ork.a(151L, 6L, 1L, false);
              localc.qx();
              localc.exx = -1;
              GMTrace.o(4478308712448L, 33366);
              return;
              label642:
              do
              {
                j += 1;
                if (j >= n) {
                  break;
                }
              } while (paramAnonymousArrayOfByte[j] == 0);
              localc.exy = -1;
              localc.exK = true;
              localc.exy += 1;
              i += 5;
              break;
              label687:
              if (localc.exx == -1)
              {
                localc.exw = 8;
                w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_ERROR");
                break label385;
              }
              if (localc.exz != -1) {
                break label385;
              }
              localc.exw = 9;
              w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_READRET_ERROR");
              break label385;
              label739:
              i += 1;
              j = k;
              break label457;
              label750:
              if (localc.exy == -2)
              {
                localc.exw = 8;
                w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_ERROR");
              }
              else if (localc.exz == -1)
              {
                localc.exw = 10;
                w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_READRET_ERROR");
              }
            }
          }
          paramAnonymousArrayOfByte = c.this;
          if ((paramAnonymousArrayOfByte.exz != -1) && (paramAnonymousInt < 0))
          {
            paramAnonymousArrayOfByte.exz += 1;
            if (paramAnonymousArrayOfByte.exz >= 50)
            {
              paramAnonymousArrayOfByte.exw = 5;
              w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_READRET_ERROR");
              if ((paramAnonymousArrayOfByte.exy != -2) || (paramAnonymousArrayOfByte.exx != -1)) {
                break label925;
              }
              paramAnonymousArrayOfByte.exw = 11;
              w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
            }
          }
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 7L, 1L, false);
          paramAnonymousArrayOfByte.qx();
          paramAnonymousArrayOfByte.exz = -1;
          GMTrace.o(4478308712448L, 33366);
          return;
          label925:
          if (paramAnonymousArrayOfByte.exy == -2)
          {
            paramAnonymousArrayOfByte.exw = 9;
            w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_READRET_ERROR");
          }
          else if (paramAnonymousArrayOfByte.exx == -1)
          {
            paramAnonymousArrayOfByte.exw = 10;
            w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_READRET_ERROR");
          }
        }
      }
    };
    this.exA = paramInt2;
    this.mSampleRate = paramInt1;
    this.exF = paramInt3;
    if (this.exA == 2)
    {
      this.exV = 3;
      if ((this.exF == 0) && (p.fQL.fPv > 0)) {
        this.exB = p.fQL.fPv;
      }
      if (p.fQL.fPG > 0) {
        this.exV = p.fQL.fPG;
      }
      if (p.fQL.fPq > 0) {
        this.exE = p.fQL.fPq;
      }
      if (p.fQD.fNT) {
        this.exU = new com.tencent.mm.e.c.b(g.eyu, this.exA, this.mSampleRate);
      }
      if (1 != g.k("EnableRecorderCheckUnreasonableData", 1)) {
        break label361;
      }
    }
    label361:
    for (boolean bool = true;; bool = false)
    {
      this.exP = bool;
      w.i("MicroMsg.MMPcmRecorder", "MMPcmRecorder sampleRate:%d channelCnt:%d durationPreFrame:%d newBufPreFrame:%b Biz:%d", new Object[] { Integer.valueOf(this.mSampleRate), Integer.valueOf(this.exA), Integer.valueOf(this.exB), Boolean.valueOf(this.exC), Integer.valueOf(this.exF) });
      GMTrace.o(20207686909952L, 150559);
      return;
      this.exV = 2;
      break;
    }
  }
  
  private boolean init()
  {
    GMTrace.i(4491059396608L, 33461);
    this.exW = 1;
    boolean bool1;
    if (p.fQL.fPr == 2)
    {
      bool1 = false;
      i = l.sK();
      j = p.fQD.fOg;
      if ((i & 0x400) == 0) {
        break label163;
      }
      i = j;
      if (j <= 0) {
        i = 0;
      }
      w.i("MicroMsg.MMPcmRecorder", "CPU ARMv7, enableRecTimerMode: " + i);
      label74:
      if (i != 1) {
        break label168;
      }
    }
    label163:
    label168:
    for (int k = 1;; k = 0)
    {
      w.d("MicroMsg.MMPcmRecorder", "init, start getMinBufferSize");
      i = AudioRecord.getMinBufferSize(this.mSampleRate, this.exV, 2);
      if ((i != -2) && (i != -1)) {
        break label173;
      }
      this.exW = 3;
      this.exw = 1;
      w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_MINBUFFER_ERROR " + i);
      qx();
      GMTrace.o(4491059396608L, 33461);
      return false;
      bool1 = true;
      break;
      i = 1;
      break label74;
    }
    label173:
    w.d("MicroMsg.MMPcmRecorder", "finish getMinBufferSize, minBufSize: %d", new Object[] { Integer.valueOf(i) });
    this.exJ = (this.mSampleRate * 20 * this.exA * 2 / 1000);
    int m = this.mSampleRate * this.exB * this.exA / 1000;
    int n = m * 2;
    w.i("MicroMsg.MMPcmRecorder", "Construct AudioRecord, minBufSize:%d, sampleRate:%d, sampleCntPreFrame:%d, sizePreFrame:%d, timesOfMinBuffer:%d, readMode:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(this.mSampleRate), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(this.exE), Boolean.valueOf(bool1) });
    int i1 = this.exF;
    int i = 1;
    if ((1 == i1) || (6 == i1) || (7 == i1))
    {
      if (Build.VERSION.SDK_INT >= 11) {
        break label587;
      }
      i = 1;
      if (p.fQD.fNp) {
        i = 1;
      }
      if (p.fQD.fNN < 0) {
        break label1244;
      }
    }
    label587:
    label651:
    label656:
    label724:
    label883:
    label1244:
    for (int j = p.fQD.fNN;; j = i)
    {
      i = j;
      if (6 == i1)
      {
        i = j;
        if (p.fQD.fOq >= 0) {
          i = p.fQD.fOq;
        }
      }
      j = qv();
      for (;;)
      {
        try
        {
          this.exQ = new AudioRecord(i, this.mSampleRate, this.exV, 2, j);
          if (this.exQ.getState() == 0)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(151L, 0L, 1L, false);
            com.tencent.mm.plugin.report.service.g.ork.a(151L, 2L, 1L, false);
            this.exQ.release();
            this.exw = 2;
            w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_NEWAUDIORECORD_ERROR");
            if (7 != i) {
              break label651;
            }
            i = 1;
            this.exQ = new AudioRecord(i, this.mSampleRate, this.exV, 2, j);
          }
          if (this.exQ.getState() != 0) {
            break label656;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 2L, 1L, false);
          this.exQ.release();
          this.exQ = null;
          this.exW = 2;
          this.exw = 3;
          w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_SECNEWAUDIORECORD_ERROR");
          qx();
          GMTrace.o(4491059396608L, 33461);
          return false;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.MMPcmRecorder", "new AudioRecord failed");
          this.exw = 12;
          w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_NEW_AUDIORECORD_EXCEPTION");
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 1L, 1L, false);
          GMTrace.o(4491059396608L, 33461);
          return false;
        }
        i = 7;
        break;
        i = 0;
      }
      Object localObject1;
      Object localObject2;
      if (bool1)
      {
        localObject1 = this.exQ;
        boolean bool2 = this.exC;
        localObject2 = this.exR;
        if (((this.exF == 1) || (this.exF == 6)) && (k != 0))
        {
          bool1 = true;
          this.exS = new e((AudioRecord)localObject1, bool2, n, (a)localObject2, bool1);
          this.exS.a(this.exY);
          if (-123456789 != this.exG) {
            this.exS.df(this.exG);
          }
          if (this.exH)
          {
            this.exT = new com.tencent.mm.compatible.b.f();
            localObject1 = this.exT;
            localObject2 = this.exQ;
            i = this.exF;
            w.d("MicroMsg.MMAudioPreProcess", "api " + Build.VERSION.SDK_INT);
            if (!com.tencent.mm.compatible.util.f.eu(16))
            {
              if (localObject2 != null) {
                break label883;
              }
              w.d("MicroMsg.MMAudioPreProcess", "audio is null");
            }
          }
        }
      }
      for (;;)
      {
        GMTrace.o(4491059396608L, 33461);
        return true;
        bool1 = false;
        break;
        this.exS = new d(this.exQ, this.exR, this.exC, m, n);
        break label724;
        if (1 == i)
        {
          if (p.fQL.fPN != 1)
          {
            w.d("MicroMsg.MMAudioPreProcess", "disable by config");
          }
          else
          {
            if (p.fQL.fPO != 2)
            {
              ((com.tencent.mm.compatible.b.f)localObject1).fNk = new h((AudioRecord)localObject2);
              if ((((com.tencent.mm.compatible.b.f)localObject1).fNk != null) && (((com.tencent.mm.compatible.b.f)localObject1).fNk.isAvailable())) {
                ((com.tencent.mm.compatible.b.f)localObject1).fNk.sc();
              }
            }
            if (p.fQL.fPP != 2)
            {
              ((com.tencent.mm.compatible.b.f)localObject1).fNl = new com.tencent.mm.compatible.b.d((AudioRecord)localObject2);
              if ((((com.tencent.mm.compatible.b.f)localObject1).fNl != null) && (((com.tencent.mm.compatible.b.f)localObject1).fNl.isAvailable())) {
                ((com.tencent.mm.compatible.b.f)localObject1).fNl.sc();
              }
            }
            if (p.fQL.fPQ != 2)
            {
              ((com.tencent.mm.compatible.b.f)localObject1).fNm = new com.tencent.mm.compatible.b.g((AudioRecord)localObject2);
              if ((((com.tencent.mm.compatible.b.f)localObject1).fNm != null) && (((com.tencent.mm.compatible.b.f)localObject1).fNm.isAvailable())) {
                ((com.tencent.mm.compatible.b.f)localObject1).fNm.sc();
              }
            }
          }
        }
        else if (p.fQL.fPu != 1)
        {
          w.d("MicroMsg.MMAudioPreProcess", "disable by config");
        }
        else
        {
          ((com.tencent.mm.compatible.b.f)localObject1).fNk = new h((AudioRecord)localObject2);
          if ((((com.tencent.mm.compatible.b.f)localObject1).fNk != null) && (((com.tencent.mm.compatible.b.f)localObject1).fNk.isAvailable())) {
            ((com.tencent.mm.compatible.b.f)localObject1).fNk.sc();
          }
          ((com.tencent.mm.compatible.b.f)localObject1).fNl = new com.tencent.mm.compatible.b.d((AudioRecord)localObject2);
          if ((((com.tencent.mm.compatible.b.f)localObject1).fNl != null) && (((com.tencent.mm.compatible.b.f)localObject1).fNl.isAvailable())) {
            ((com.tencent.mm.compatible.b.f)localObject1).fNl.sc();
          }
          ((com.tencent.mm.compatible.b.f)localObject1).fNm = new com.tencent.mm.compatible.b.g((AudioRecord)localObject2);
          if ((((com.tencent.mm.compatible.b.f)localObject1).fNm != null) && (((com.tencent.mm.compatible.b.f)localObject1).fNm.isAvailable())) {
            ((com.tencent.mm.compatible.b.f)localObject1).fNm.sc();
          }
        }
      }
    }
  }
  
  public final void aA(boolean paramBoolean)
  {
    GMTrace.i(4490522525696L, 33457);
    this.exC = paramBoolean;
    w.i("MicroMsg.MMPcmRecorder", "mNewBufPreFrame: " + this.exC);
    GMTrace.o(4490522525696L, 33457);
  }
  
  public final void aB(boolean paramBoolean)
  {
    GMTrace.i(4490925178880L, 33460);
    this.exH = paramBoolean;
    w.i("MicroMsg.MMPcmRecorder", "mUsePreProcess: " + this.exH);
    GMTrace.o(4490925178880L, 33460);
  }
  
  public final void aC(boolean paramBoolean)
  {
    GMTrace.i(4491193614336L, 33462);
    w.i("MicroMsg.MMPcmRecorder", "switchMute mute:" + paramBoolean);
    if (this.exS != null) {
      this.exS.aC(paramBoolean);
    }
    GMTrace.o(4491193614336L, 33462);
  }
  
  public final void de(int paramInt)
  {
    GMTrace.i(4490388307968L, 33456);
    this.exB = paramInt;
    w.i("MicroMsg.MMPcmRecorder", "mDurationPreFrame: " + this.exB);
    GMTrace.o(4490388307968L, 33456);
  }
  
  public final void j(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(4490790961152L, 33459);
    if ((10 == this.exE) || (paramBoolean))
    {
      this.exE = paramInt;
      w.i("MicroMsg.MMPcmRecorder", "mMultipleOfMinBuffer: " + this.exE);
    }
    GMTrace.o(4490790961152L, 33459);
  }
  
  public final boolean qn()
  {
    boolean bool2 = true;
    boolean bool1 = true;
    for (;;)
    {
      try
      {
        GMTrace.i(4491462049792L, 33464);
        if (true == this.exM)
        {
          w.i("MicroMsg.MMPcmRecorder", "already have stopped");
          GMTrace.o(4491462049792L, 33464);
          return bool1;
        }
        this.exM = true;
        Object localObject1 = new g.a();
        if (this.exU != null)
        {
          this.exU.qK();
          this.exU = null;
        }
        ((g.a)localObject1).fSo = SystemClock.elapsedRealtime();
        if (this.exS != null)
        {
          this.exS.pL();
          this.exS = null;
        }
        w.i("MicroMsg.MMPcmRecorder", "cost " + ((g.a)localObject1).tD() + "ms to call stopRecord");
        w.i("MicroMsg.MMPcmRecorder", "stopRecord, " + Thread.currentThread().getStackTrace()[2].getMethodName());
        if (this.exQ == null)
        {
          w.e("MicroMsg.MMPcmRecorder", "audioRecord is null");
          bool1 = false;
          if (((!this.exK) && (-1L != this.exI) && (System.currentTimeMillis() - this.exI >= 2000L)) || (this.exO))
          {
            w.i("MicroMsg.MMPcmRecorder", "stopRecord publish PermissionShowDlgEvent");
            localObject1 = new lm();
            ((lm)localObject1).ePT.type = 1;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            bool2 = false;
          }
          localObject1 = new ll();
          ((ll)localObject1).ePO.type = 1;
          ((ll)localObject1).ePO.ePQ = false;
          ((ll)localObject1).ePO.ePR = bool2;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          w.i("MicroMsg.MMPcmRecorder", "doNewIDKeyStatOnStopRecord, mRecordDetailState: %d", new Object[] { Integer.valueOf(this.exw) });
          localObject1 = new ArrayList();
          ((ArrayList)localObject1).add(new IDKey(357, 0, 1));
          if (this.exw != 0) {
            ((ArrayList)localObject1).add(new IDKey(357, 1, 1));
          }
        }
        switch (this.exw)
        {
        case 1: 
          w.i("MicroMsg.MMPcmRecorder", "do idkey, infolist size: %d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
          com.tencent.mm.plugin.report.service.g.ork.b((ArrayList)localObject1, false);
          GMTrace.o(4491462049792L, 33464);
          continue;
          if (this.exQ.getState() != 1)
          {
            w.e("MicroMsg.MMPcmRecorder", "audioRecord sate error " + this.exQ.getState());
            bool1 = false;
            continue;
          }
          ((g.a)localObject1).fSo = SystemClock.elapsedRealtime();
          this.exQ.stop();
          this.exQ.release();
          this.exQ = null;
          w.i("MicroMsg.MMPcmRecorder", "cost " + ((g.a)localObject1).tD() + "ms to call stop and release");
          bool1 = true;
          continue;
          ((ArrayList)localObject1).add(new IDKey(357, 2, 1));
          break;
        case 2: 
          ((ArrayList)localObject2).add(new IDKey(357, 3, 1));
        }
      }
      finally {}
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 4, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 5, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 6, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 7, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 8, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 9, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 10, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 11, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 12, 1));
      continue;
      ((ArrayList)localObject2).add(new IDKey(357, 13, 1));
    }
  }
  
  public final void qu()
  {
    GMTrace.i(4490656743424L, 33458);
    this.exD = true;
    w.i("MicroMsg.MMPcmRecorder", "mCheckAudioQuality: " + this.exD);
    GMTrace.o(4490656743424L, 33458);
  }
  
  public final int qv()
  {
    GMTrace.i(20207821127680L, 150560);
    if (this.exX > 0)
    {
      i = this.exX;
      GMTrace.o(20207821127680L, 150560);
      return i;
    }
    int i = AudioRecord.getMinBufferSize(this.mSampleRate, this.exV, 2);
    w.i("MicroMsg.MMPcmRecorder", "getDefaultMinBufferSize minBufSize:%d", new Object[] { Integer.valueOf(i) });
    if ((i == -2) || (i == -1))
    {
      GMTrace.o(20207821127680L, 150560);
      return 0;
    }
    this.exX = (this.exE * i);
    i = this.exX;
    GMTrace.o(20207821127680L, 150560);
    return i;
  }
  
  public final boolean qw()
  {
    boolean bool = false;
    GMTrace.i(4491327832064L, 33463);
    w.d("MicroMsg.MMPcmRecorder", "startRecord");
    Object localObject = new ll();
    ((ll)localObject).ePO.type = 1;
    ((ll)localObject).ePO.ePQ = true;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    this.exI = System.currentTimeMillis();
    this.exK = false;
    if (((ll)localObject).ePP.ePS)
    {
      w.i("MicroMsg.MMPcmRecorder", "can't start record due to permission tips policy");
      this.exw = 13;
      GMTrace.o(4491327832064L, 33463);
      return false;
    }
    this.exM = false;
    localObject = new g.a();
    w.i("MicroMsg.MMPcmRecorder", "startRecord, " + Thread.currentThread().getStackTrace()[2].getMethodName());
    if (this.exQ != null) {
      w.e("MicroMsg.MMPcmRecorder", "start error ,is recording ");
    }
    for (;;)
    {
      if (!bool)
      {
        qn();
        localObject = new lm();
        ((lm)localObject).ePT.type = 1;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      }
      GMTrace.o(4491327832064L, 33463);
      return bool;
      ((g.a)localObject).fSo = SystemClock.elapsedRealtime();
      w.d("MicroMsg.MMPcmRecorder", "startRecordInternal, start init");
      if (!init())
      {
        w.e("MicroMsg.MMPcmRecorder", "startRecord init error");
      }
      else
      {
        w.i("MicroMsg.MMPcmRecorder", "init cost: " + ((g.a)localObject).tD() + "ms");
        ((g.a)localObject).fSo = SystemClock.elapsedRealtime();
        this.exQ.startRecording();
        w.i("MicroMsg.MMPcmRecorder", "startRecording cost: " + ((g.a)localObject).tD());
        if (this.exQ.getRecordingState() != 3)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.a(151L, 3L, 1L, false);
          this.exW = 2;
          this.exw = 4;
          w.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_STARTRECORDING_ERROR");
          qx();
        }
        else if (this.exS != null)
        {
          bool = this.exS.qw();
        }
        else
        {
          w.e("MicroMsg.MMPcmRecorder", "mRecordMode is null");
        }
      }
    }
  }
  
  final void qx()
  {
    GMTrace.i(4491596267520L, 33465);
    if (this.exR != null) {
      this.exR.ax(this.exW, this.exw);
    }
    GMTrace.o(4491596267520L, 33465);
  }
  
  public final int qy()
  {
    GMTrace.i(4491730485248L, 33466);
    if (this.exS != null)
    {
      int i = this.exS.qy();
      GMTrace.o(4491730485248L, 33466);
      return i;
    }
    GMTrace.o(4491730485248L, 33466);
    return -1;
  }
  
  public static abstract interface a
  {
    public abstract void ax(int paramInt1, int paramInt2);
    
    public abstract void d(byte[] paramArrayOfByte, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */