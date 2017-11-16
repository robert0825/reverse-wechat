package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.c;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Timer;
import java.util.TimerTask;

public final class b
{
  private static float qEj;
  Context context;
  private Timer eym;
  private boolean eyn;
  private int fNO;
  AudioTrack hdT;
  int hdW;
  public int hdX;
  private int hdY;
  private Runnable hdZ;
  public int heb;
  int hec;
  public boolean hed;
  public boolean qDU;
  boolean qDV;
  boolean qDW;
  e qDX;
  public int qDY;
  public byte[] qDZ;
  public final Object qEA;
  public int qEB;
  private int qEC;
  private int qED;
  public int qEE;
  public int qEF;
  public byte[] qEa;
  public byte[] qEb;
  public byte[] qEc;
  public byte[] qEd;
  private int qEe;
  public a qEf;
  private int qEg;
  private int qEh;
  public int qEi;
  public int qEk;
  public int qEl;
  public int qEm;
  public int qEn;
  public int qEo;
  public int qEp;
  public int qEq;
  public long qEr;
  public long qEs;
  private int qEt;
  public int qEu;
  public int qEv;
  public int qEw;
  public long qEx;
  private int qEy;
  public int qEz;
  
  static
  {
    GMTrace.i(5285091475456L, 39377);
    qEj = 0.0F;
    GMTrace.o(5285091475456L, 39377);
  }
  
  public b()
  {
    GMTrace.i(5277843718144L, 39323);
    this.qDU = false;
    this.qDV = false;
    this.qDW = true;
    this.qDX = null;
    this.hdW = 2;
    this.heb = 0;
    this.qDY = 0;
    this.qDZ = null;
    this.qEa = null;
    this.qEb = null;
    this.qEc = null;
    this.qEd = null;
    this.hdX = 0;
    this.qEe = 0;
    this.hdY = 0;
    this.hec = 20;
    this.hdT = null;
    this.qEf = null;
    this.eym = null;
    this.eyn = false;
    this.qEg = 1;
    this.qEh = 1;
    this.qEi = 0;
    this.fNO = 3;
    this.hed = false;
    this.qEk = 0;
    this.qEl = 0;
    this.qEm = 0;
    this.qEn = 0;
    this.qEo = 0;
    this.qEp = 1;
    this.qEq = 0;
    this.qEr = 0L;
    this.qEs = 0L;
    this.qEt = 1;
    this.qEu = 0;
    this.qEv = -1;
    this.qEw = 0;
    this.qEx = 0L;
    this.qEy = 1;
    this.qEz = 0;
    this.qEA = new Object();
    this.qEB = 0;
    this.qEC = 0;
    this.qED = 0;
    this.qEE = 0;
    this.qEF = 0;
    GMTrace.o(5277843718144L, 39323);
  }
  
  private int iu(boolean paramBoolean)
  {
    GMTrace.i(5278380589056L, 39327);
    int j = 0;
    int i;
    if (p.fQD.fNq > 0)
    {
      j = at.AS().aK(paramBoolean);
      if ((!paramBoolean) || (p.fQD.fNR < 0)) {
        break label122;
      }
      i = p.fQD.fNR;
      label47:
      j = i;
      if (1 == this.qED)
      {
        if (p.fQD.fOr >= 0) {
          i = p.fQD.fOr;
        }
        if ((!paramBoolean) || (p.fQD.fOs < 0)) {
          break label149;
        }
        j = p.fQD.fOs;
      }
    }
    for (;;)
    {
      GMTrace.o(5278380589056L, 39327);
      return j;
      if (p.fQD.fNQ < 0) {
        break;
      }
      j = p.fQD.fNQ;
      break;
      label122:
      i = j;
      if (paramBoolean) {
        break label47;
      }
      i = j;
      if (p.fQD.fNS < 0) {
        break label47;
      }
      i = p.fQD.fNS;
      break label47;
      label149:
      j = i;
      if (!paramBoolean)
      {
        j = i;
        if (p.fQD.fOt >= 0) {
          j = p.fQD.fOt;
        }
      }
    }
  }
  
  public final int P(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5278649024512L, 39329);
    if (true == this.qDU)
    {
      GMTrace.o(5278649024512L, 39329);
      return 0;
    }
    this.hdX = paramInt1;
    this.qEe = 1;
    this.hdY = paramInt2;
    this.qED = paramInt3;
    this.hec = (this.hdX / 1000 * 1 * this.hdY * 2);
    this.qEw = (this.hdX * 60 / 1000);
    GMTrace.o(5278649024512L, 39329);
    return 1;
  }
  
  public final int btA()
  {
    GMTrace.i(5278783242240L, 39330);
    if (true == this.qDU)
    {
      GMTrace.o(5278783242240L, 39330);
      return 1;
    }
    if (this.hdT == null)
    {
      w.e("MicroMsg.Voip.AudioPlayer", "audioTrack error: audioTrack is null!!");
      GMTrace.o(5278783242240L, 39330);
      return 0;
    }
    this.qDU = true;
    try
    {
      this.hdT.play();
      if (this.hdT.getPlayState() != 3)
      {
        this.qEB = 4;
        w.e("MicroMsg.Voip.AudioPlayer", "audioTrack play error: AudioTrack.PLAYSTATE_PLAYING, play do not start !");
        GMTrace.o(5278783242240L, 39330);
        return 0;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.Voip.AudioPlayer", "audioTrack.play Exception:%s", new Object[] { localException.getMessage() });
      }
      if (this.hdT.getState() == 0)
      {
        w.e("MicroMsg.Voip.AudioPlayer", "audioTrack error: AudioTrack.STATE_UNINITIALIZED, no more AudioTrack resource!!");
        GMTrace.o(5278783242240L, 39330);
        return 0;
      }
      if (this.qDW)
      {
        int i;
        if ((this.eyn) || (this.eym != null))
        {
          w.w("MicroMsg.Voip.AudioPlayer", "Timer has been created or, timer has been started, " + this.eyn);
          i = -1;
        }
        while (i != 0)
        {
          w.e("MicroMsg.Voip.AudioPlayer", "InitAudioRecTimer failed, error code = -1");
          GMTrace.o(5278783242240L, 39330);
          return 0;
          this.eym = new Timer();
          if (this.eym == null) {
            i = -1;
          } else {
            i = 0;
          }
        }
        this.eym.scheduleAtFixedRate(new a(), 0L, 20L);
        this.eyn = true;
      }
      this.hdZ = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5315290464256L, 39602);
          Process.setThreadPriority(-19);
          w.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer enter  to start....");
          int j = 0;
          while ((b.this.qDU) && (b.this.hdT != null))
          {
            int i;
            long l;
            try
            {
              i = b.this.hdT.getPlaybackHeadPosition();
              l = System.currentTimeMillis();
              b.this.qEn = (b.this.qEk - i);
              if (b.this.qEp == 1)
              {
                b.this.qEq = i;
                b.this.qEr = l;
                b.this.qEs = l;
                b.this.qEp = 0;
                b.this.qEx = l;
                if ((i != 0) && (b.this.qDW)) {
                  b.this.qEi = 1;
                }
                if (b.this.qEf == null) {
                  break label1218;
                }
                b.this.qEz += b.this.hec;
                if (b.this.qEi != 0) {
                  break label564;
                }
                i = b.this.qEf.x(b.this.qEc, b.this.hec);
                if (i >= 0) {
                  break label809;
                }
                com.tencent.mm.plugin.voip.b.a.ww(5);
                w.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  pDevCallBack.PlayDevDataCallBack ret :" + i);
              }
            }
            catch (Exception localException)
            {
              for (;;)
              {
                w.w("MicroMsg.Voip.AudioPlayer", "getPlaybackHeadPosition: ", new Object[] { localException });
                b.this.qEB = 7;
                i = 0;
                continue;
                int k = i - b.this.qEq;
                if (k > b.this.qEv)
                {
                  b.this.qEv = k;
                  label312:
                  b.this.qEx = l;
                  if (b.this.qEn != 0) {
                    break label461;
                  }
                  b.this.qEu += b.this.qEo;
                }
                for (;;)
                {
                  if (b.this.qEu < b.this.qEw) {
                    b.this.qEu = b.this.qEw;
                  }
                  if (b.this.qEu < b.this.qEo) {
                    b.this.qEu = b.this.qEo;
                  }
                  if (k <= 0) {
                    break;
                  }
                  b.this.qEq = i;
                  break;
                  b.this.qEv = ((int)(b.this.qEv * 49999.0F / 50000.0F + k / 50000.0F));
                  break label312;
                  label461:
                  if (l > b.this.qEs + 5000L)
                  {
                    b.this.qEs = l;
                    if (b.this.qEv < b.this.qEu >> 1) {
                      b.this.qEu -= (b.this.qEo >> 2);
                    }
                    if (b.this.qEv > b.this.qEu) {
                      b.this.qEu = b.this.qEv;
                    }
                  }
                }
                label564:
                System.currentTimeMillis();
                if (b.this.qEm >= b.this.hec) {
                  synchronized (b.this.qEA)
                  {
                    System.arraycopy(b.this.qEa, 0, b.this.qEc, 0, b.this.hec);
                    i = b.this.qEm - b.this.hec;
                    System.arraycopy(b.this.qEa, b.this.hec, b.this.qEb, 0, i);
                    System.arraycopy(b.this.qEb, 0, b.this.qEa, 0, i);
                    b.this.qEm -= b.this.hec;
                    i = 0;
                  }
                }
                if ((b.this.qEn >= b.this.hdX * 5 / 1000) || (b.this.qEE != 0)) {
                  break;
                }
                b.this.qEF = 1;
                i = b.this.qEf.x(b.this.qEc, b.this.hec);
                b.this.qEF = 0;
              }
              com.tencent.mm.plugin.voip.b.a.ww(2);
            }
            continue;
            label809:
            if (b.this.hed)
            {
              w.d("MicroMsg.Voip.AudioPlayer", "isSwitching " + b.this.hed);
              com.tencent.mm.plugin.voip.b.a.ww(10);
            }
            else
            {
              b.this.qEr = l;
              if (b.this.heb >= b.this.hec)
              {
                if (!b.this.hed)
                {
                  i = b.this.hdT.write(b.this.qEc, 0, b.this.hec);
                  if (i < 0)
                  {
                    b.this.wd(i);
                    w.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  audioTrack.write ret :" + i);
                  }
                  b.this.qEk += (b.this.hec >> 1);
                }
              }
              else
              {
                System.arraycopy(b.this.qEc, 0, b.this.qDZ, j, b.this.heb - j);
                i = b.this.hdT.write(b.this.qDZ, 0, b.this.qDZ.length);
                if (i < 0)
                {
                  b.this.wd(i);
                  w.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  audioTrack.write ret :" + i);
                }
                b.this.qEk += (b.this.qDZ.length >> 1);
                j = b.this.heb - j;
                i = b.this.hec - j;
                while (i >= b.this.heb)
                {
                  b.this.hdT.write(b.this.qEc, j, b.this.heb);
                  j += b.this.heb;
                  i -= b.this.heb;
                  b.this.qEk += (b.this.heb >> 1);
                }
                System.arraycopy(b.this.qEc, j, b.this.qDZ, 0, i);
                j = i;
                continue;
                label1218:
                com.tencent.mm.plugin.voip.b.a.ww(10);
              }
            }
          }
          GMTrace.o(5315290464256L, 39602);
        }
      };
      com.tencent.mm.sdk.f.e.b(this.hdZ, "AudioPlayer_play", 10);
      GMTrace.o(5278783242240L, 39330);
    }
    return 1;
  }
  
  public final int btB()
  {
    GMTrace.i(5278917459968L, 39331);
    if (this.hdT == null)
    {
      w.d("MicroMsg.Voip.AudioPlayer", "  audioTrack==null,m_iPlayBufSizeOrg:" + this.qEo + ",nSamplerate:" + this.hdX);
      i = this.qEo * 1000 / this.hdX;
      GMTrace.o(5278917459968L, 39331);
      return i;
    }
    if ((this.qDU) && (this.hdT.getState() != 0)) {
      try
      {
        i = this.hdT.getPlaybackHeadPosition();
        i = (this.qEk - i) * 1000 / this.hdX;
        GMTrace.o(5278917459968L, 39331);
        return i;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.Voip.AudioPlayer", "audioTrack getPlaybackHeadPosition error:%s", new Object[] { localException.getMessage() });
        i = this.qEo * 1000 / this.hdX;
        GMTrace.o(5278917459968L, 39331);
        return i;
      }
    }
    int i = this.qEo * 1000 / this.hdX;
    GMTrace.o(5278917459968L, 39331);
    return i;
  }
  
  public final int btC()
  {
    GMTrace.i(5279051677696L, 39332);
    if ((this.eyn) && (this.eym != null))
    {
      this.eym.cancel();
      this.eyn = false;
    }
    if (!this.qDU)
    {
      GMTrace.o(5279051677696L, 39332);
      return 1;
    }
    this.qDU = false;
    this.qEz = 0;
    try
    {
      if (this.hdZ != null) {
        com.tencent.mm.sdk.f.e.N(this.hdZ);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      try
      {
        for (;;)
        {
          if (this.hdT != null)
          {
            this.hdT.stop();
            this.hdT.release();
            w.i("MicroMsg.Voip.AudioPlayer", "StopPlay stop audioTrack");
          }
          GMTrace.o(5279051677696L, 39332);
          return 1;
          localInterruptedException = localInterruptedException;
          w.printErrStackTrace("MicroMsg.Voip.AudioPlayer", localInterruptedException, "", new Object[0]);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.Voip.AudioPlayer", "StopPlay audioTrack.stop Exception:%s", new Object[] { localException.getMessage() });
        }
      }
    }
  }
  
  public final int btD()
  {
    GMTrace.i(5279185895424L, 39333);
    w.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer  mAudioPlayErrState:" + this.qEB);
    int i = this.qEB;
    GMTrace.o(5279185895424L, 39333);
    return i;
  }
  
  public final int btE()
  {
    GMTrace.i(5279320113152L, 39334);
    if (this.hdT != null)
    {
      i = this.hdT.getStreamType();
      GMTrace.o(5279320113152L, 39334);
      return i;
    }
    int i = iu(true);
    GMTrace.o(5279320113152L, 39334);
    return i;
  }
  
  public final int bty()
  {
    GMTrace.i(5277977935872L, 39324);
    int i = this.qEz / this.hec;
    int j = this.hdY;
    GMTrace.o(5277977935872L, 39324);
    return i * j;
  }
  
  public final int btz()
  {
    GMTrace.i(5278514806784L, 39328);
    if (this.hdT != null)
    {
      this.hdT.release();
      this.hdT = null;
    }
    this.qDU = false;
    this.qDV = false;
    GMTrace.o(5278514806784L, 39328);
    return 1;
  }
  
  public final boolean it(boolean paramBoolean)
  {
    GMTrace.i(5278246371328L, 39326);
    w.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer enter to switchSpeakerPhone...");
    int i = iu(paramBoolean);
    if (at.AS().sh()) {
      i = 0;
    }
    w.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone:speakerOn:" + paramBoolean + ":streamtype:" + i);
    if ((this.hdT != null) && (i == this.hdT.getStreamType()))
    {
      w.d("MicroMsg.Voip.AudioPlayer", "switchSpeakerPhone:stream type do not need to  change");
      GMTrace.o(5278246371328L, 39326);
      return false;
    }
    btC();
    this.hed = true;
    if (this.qEe == 2) {}
    for (this.hdW = 3;; this.hdW = 2)
    {
      this.heb = AudioTrack.getMinBufferSize(this.hdX, this.hdW, 2);
      if ((this.heb != -2) && (this.heb != -1)) {
        break;
      }
      this.hed = false;
      GMTrace.o(5278246371328L, 39326);
      return false;
    }
    this.qEk = 0;
    this.qEn = 0;
    this.qEp = 1;
    this.qEq = 0;
    this.qEr = 0L;
    this.qEs = 0L;
    this.qEt = 1;
    this.qEv = -1;
    this.qEw = 0;
    this.qEo = this.heb;
    this.qEu = (this.qEo * this.qEt);
    this.heb *= this.qEy;
    float f = this.qEo / 16.0F;
    w.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone:playBufSize:" + this.heb + "  MinBufSizeInMs:" + f);
    if (this.hdT != null) {}
    try
    {
      this.hdT.stop();
      this.hdT.release();
      this.hdT = null;
      w.i("MicroMsg.Voip.AudioPlayer", "AudioPlayer dkbt switchSpeakerPhone mode:%d issp:%b m:%d size %d,nSamplerate:%d", new Object[] { Integer.valueOf(at.AS().fMS.getMode()), Boolean.valueOf(at.AS().fMS.isSpeakerphoneOn()), Integer.valueOf(i), Integer.valueOf(this.heb), Integer.valueOf(this.hdX) });
      this.hdT = new c(i, this.hdX, this.hdW, 2, this.heb);
      if ((this.hdT != null) && (this.hdT.getState() == 0))
      {
        w.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone STATE_UNINITIALIZED call AudioTrack.release() and return");
        this.hdT.release();
        this.hdT = null;
        GMTrace.o(5278246371328L, 39326);
        return false;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone audioTrack.stop Exception:%s", new Object[] { localException.getMessage() });
      }
      w.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer leave  switchSpeakerPhone...");
      if (this.hdT != null)
      {
        this.hed = false;
        btA();
        GMTrace.o(5278246371328L, 39326);
        return true;
      }
      this.hed = false;
      GMTrace.o(5278246371328L, 39326);
    }
    return false;
  }
  
  public final int k(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(5278112153600L, 39325);
    w.d("MicroMsg.Voip.AudioPlayer", "enter to Init...");
    this.context = paramContext;
    if (this.qEe == 2) {}
    for (this.hdW = 3;; this.hdW = 2)
    {
      this.heb = AudioTrack.getMinBufferSize(this.hdX, this.hdW, 2);
      if ((this.heb != -2) && (this.heb != -1)) {
        break;
      }
      this.qEB = 1;
      GMTrace.o(5278112153600L, 39325);
      return -1;
    }
    this.qEo = this.heb;
    this.qEu = (this.qEo * this.qEt);
    this.heb *= this.qEy;
    float f = (this.qEo >> 1) / this.hdX;
    int i = l.sK();
    int j = p.fQD.fOh;
    if ((i & 0x400) != 0)
    {
      i = j;
      if (j <= 0) {
        i = 0;
      }
      w.i("MicroMsg.Voip.AudioPlayer", "CPU ARMv7, ablePlayTimer: " + i);
    }
    for (;;)
    {
      if ((1000.0F * f < 60.0F) || (this.qED != 0)) {
        i = 0;
      }
      boolean bool;
      if (i == 0)
      {
        bool = false;
        this.qDW = bool;
        w.d("MicroMsg.Voip.AudioPlayer", "playBufSize:" + this.heb + "  MinBufSizeInMs:" + f + ",bPlayTimer:" + this.qDW);
        i = iu(paramBoolean);
      }
      try
      {
        this.hdT = new c(i, this.hdX, this.hdW, 2, this.heb);
        if ((this.hdT == null) || (this.hdT.getState() == 0))
        {
          this.qEB = 2;
          w.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer audioTrack.getState() == AudioTrack.STATE_UNINITIALIZED");
          if (this.hdT != null) {
            this.hdT.release();
          }
          if (i == 0) {
            this.hdT = new c(3, this.hdX, this.hdW, 2, this.heb);
          }
        }
        else
        {
          if (this.hdT != null) {
            break label485;
          }
          this.qEB = 3;
          w.e("MicroMsg.Voip.AudioPlayer", "null == audioTrack return");
          GMTrace.o(5278112153600L, 39325);
          return -1;
          i = 0;
          continue;
          bool = true;
        }
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          w.w("MicroMsg.Voip.AudioPlayer", "new AudioTrack:", new Object[] { paramContext });
          this.qEB = 6;
          continue;
          this.hdT = new c(0, this.hdX, this.hdW, 2, this.heb);
        }
        label485:
        if (this.hdT.getState() == 0)
        {
          this.qEB = 3;
          w.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer STATE_UNINITIALIZED call AudioTrack.release() and return");
          this.hdT.release();
          this.hdT = null;
          GMTrace.o(5278112153600L, 39325);
          return -1;
        }
        this.qDZ = new byte[this.heb];
        if (this.qDZ == null)
        {
          w.e("MicroMsg.Voip.AudioPlayer", "null == playBuffer return");
          GMTrace.o(5278112153600L, 39325);
          return -1;
        }
        this.qEc = new byte[this.hec];
        if (this.qEc == null)
        {
          w.e("MicroMsg.Voip.AudioPlayer", "null == frmBuffer return");
          GMTrace.o(5278112153600L, 39325);
          return -1;
        }
        if (this.qDW)
        {
          this.qDY = this.heb;
          this.qEa = new byte[this.qDY];
          if (this.qEa == null)
          {
            w.e("MicroMsg.Voip.AudioPlayer", "null == playTaskBuffer return");
            GMTrace.o(5278112153600L, 39325);
            return -1;
          }
          this.qEb = new byte[this.qDY];
          if (this.qEb == null)
          {
            w.e("MicroMsg.Voip.AudioPlayer", "null == playTaskBufferTmp return");
            GMTrace.o(5278112153600L, 39325);
            return -1;
          }
          this.qEd = new byte[this.hec];
          if (this.qEd == null)
          {
            w.e("MicroMsg.Voip.AudioPlayer", "null == frmTaskBuffer return");
            GMTrace.o(5278112153600L, 39325);
            return -1;
          }
        }
        this.qDU = false;
        this.qDV = false;
        w.i("MicroMsg.Voip.AudioPlayer", "dkbt AudioTrack init ok, mode:%d issp:%b m:%d size %d,nSamplerate:%d", new Object[] { Integer.valueOf(at.AS().fMS.getMode()), Boolean.valueOf(at.AS().fMS.isSpeakerphoneOn()), Integer.valueOf(i), Integer.valueOf(this.heb), Integer.valueOf(this.hdX) });
        i = this.heb * 1000 / (this.hdX * 2);
        GMTrace.o(5278112153600L, 39325);
      }
    }
    return i;
  }
  
  public final void wd(int paramInt)
  {
    GMTrace.i(16026402029568L, 119406);
    if (this.qEC == -1)
    {
      GMTrace.o(16026402029568L, 119406);
      return;
    }
    if (paramInt < 0)
    {
      this.qEC += 1;
      if (this.qEC >= 50)
      {
        this.qEB = 5;
        this.qEC = -1;
        GMTrace.o(16026402029568L, 119406);
        return;
      }
    }
    GMTrace.o(16026402029568L, 119406);
  }
  
  final class a
    extends TimerTask
  {
    a()
    {
      GMTrace.i(5285494128640L, 39380);
      GMTrace.o(5285494128640L, 39380);
    }
    
    public final void run()
    {
      GMTrace.i(5285628346368L, 39381);
      System.currentTimeMillis();
      if ((b.this.qEi == 1) && (b.this.qDU == true))
      {
        System.currentTimeMillis();
        if ((b.this.qEm + b.this.hec < b.this.qDY) && (b.this.qEF == 0))
        {
          b.this.qEE = 1;
          int i = b.this.qEf.x(b.this.qEd, b.this.hec);
          b.this.qEE = 0;
          if (i < 0)
          {
            w.d("MicroMsg.Voip.AudioPlayer", "Task AudioPlayer::  pDevCallBack.PlayDevDataCallBack ret :" + i);
            GMTrace.o(5285628346368L, 39381);
            return;
          }
          synchronized (b.this.qEA)
          {
            System.arraycopy(b.this.qEd, 0, b.this.qEa, b.this.qEm, b.this.hec);
            b.this.qEm += b.this.hec;
            b.this.qEl += (b.this.hec >> 1);
            GMTrace.o(5285628346368L, 39381);
            return;
          }
        }
      }
      GMTrace.o(5285628346368L, 39381);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */