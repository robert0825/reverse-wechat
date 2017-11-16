package com.tencent.mm.plugin.ipcall;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.plugin.ipcall.a.b.a.1;
import com.tencent.mm.plugin.ipcall.a.b.b.a;
import com.tencent.mm.plugin.ipcall.a.b.c.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.g.a;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI;
import com.tencent.mm.plugin.ipcall.ui.j;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.k.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.h.7;
import com.tencent.mm.plugin.voip.video.h.8;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;

public final class c
  implements com.tencent.mm.plugin.ipcall.a.c.a.a, g.a, k.a
{
  public static ae ghS;
  private com.tencent.mm.sdk.platformtools.aj euU;
  public Object laY;
  public e mig;
  public com.tencent.mm.plugin.ipcall.a.g.k mih;
  public boolean mii;
  public TelephonyManager mij;
  public PhoneStateListener mik;
  public com.tencent.mm.sdk.b.c mil;
  public Runnable mim;
  public Runnable mio;
  public boolean mip;
  public com.tencent.mm.plugin.voip.ui.a miq;
  private long mir;
  
  static
  {
    GMTrace.i(11735595483136L, 87437);
    ghS = new ae(Looper.getMainLooper());
    GMTrace.o(11735595483136L, 87437);
  }
  
  public c()
  {
    GMTrace.i(11731703169024L, 87408);
    this.mii = false;
    this.laY = new Object();
    this.mik = new PhoneStateListener()
    {
      public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(11743916982272L, 87499);
        super.onCallStateChanged(paramAnonymousInt, paramAnonymousString);
        w.d("MicroMsg.IPCallManager", "onCallStateChanged " + paramAnonymousInt);
        if (paramAnonymousInt == 2)
        {
          w.i("MicroMsg.IPCallManager", "system phone call state offhook, stop call");
          c.this.co(0, 0);
        }
        GMTrace.o(11743916982272L, 87499);
      }
    };
    this.mil = new com.tencent.mm.sdk.b.c() {};
    this.mim = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14297946128384L, 106528);
        if (!com.tencent.mm.plugin.ipcall.a.i.aIs().aIl())
        {
          w.i("MicroMsg.IPCallManager", "timeout! still not accept!");
          if (c.this.co(9, 12)) {
            c.this.c(9, null, ab.getContext().getString(R.l.dbJ), 2);
          }
        }
        GMTrace.o(14297946128384L, 106528);
      }
    };
    this.mio = new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(11621644632064L, 86588);
        com.tencent.mm.plugin.voip.video.h localh = com.tencent.mm.plugin.ipcall.a.i.aIy();
        int j = R.k.cMR;
        localh.qPN = 0;
        if (j == 0)
        {
          localh.iH(true);
          GMTrace.o(11621644632064L, 86588);
          return;
        }
        if (3500L != -1L) {
          try
          {
            at.AR();
            bool = ((Boolean)com.tencent.mm.y.c.xh().get(73218, Boolean.valueOf(true))).booleanValue();
            if ((!bool) || (localh.eqj)) {}
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              try
              {
                localh.qPO = System.currentTimeMillis();
                localh.qPM = new com.tencent.mm.compatible.b.i();
                w.d("MicroMsg.RingPlayer", "isBluetoothOn: %b, isHeadsetPlugged: %b", new Object[] { Boolean.valueOf(at.AS().sh()), Boolean.valueOf(at.AS().sn()) });
                if (p.fQD.fNU >= 0) {
                  i = p.fQD.fNU;
                }
                localh.iG(false);
                localh.a(j, 3500L, true, i);
                localh.eqj = true;
                GMTrace.o(11621644632064L, 86588);
                return;
              }
              catch (Exception localException1)
              {
                boolean bool;
                w.e("MicroMsg.RingPlayer", "new MediaPlayer failed, " + localException1.toString());
              }
              localException2 = localException2;
              w.e("MicroMsg.RingPlayer", "get voip sound failed: " + localException2.getMessage());
              bool = true;
            }
            GMTrace.o(11621644632064L, 86588);
            return;
          }
        }
        localException1.l(j, 2, true);
        GMTrace.o(11621644632064L, 86588);
      }
    };
    this.miq = new com.tencent.mm.plugin.voip.ui.a()
    {
      public final void a(Intent paramAnonymousIntent, com.tencent.mm.plugin.voip.ui.h paramAnonymoush)
      {
        GMTrace.i(14298214563840L, 106530);
        if (!com.tencent.mm.plugin.ipcall.a.i.aIs().aIl())
        {
          paramAnonymoush.JQ(ab.getContext().getString(R.l.dKo));
          GMTrace.o(14298214563840L, 106530);
          return;
        }
        int i = c.this.aHQ();
        paramAnonymoush.JR(String.format("%02d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }));
        GMTrace.o(14298214563840L, 106530);
      }
      
      public final boolean aHS()
      {
        GMTrace.i(14298080346112L, 106529);
        if (com.tencent.mm.plugin.ipcall.a.i.aIs().aIi())
        {
          GMTrace.o(14298080346112L, 106529);
          return true;
        }
        GMTrace.o(14298080346112L, 106529);
        return false;
      }
    };
    this.mir = 0L;
    GMTrace.o(11731703169024L, 87408);
  }
  
  public static boolean Ag(String paramString)
  {
    GMTrace.i(11732105822208L, 87411);
    w.d("MicroMsg.IPCallManager", "dialWhenTalking, dialButton: %s", new Object[] { paramString });
    if (!com.tencent.mm.plugin.ipcall.a.i.aIs().aIl())
    {
      w.i("MicroMsg.IPCallManager", "ipcall not connect, cannot call dialWhenTalking now");
      GMTrace.o(11732105822208L, 87411);
      return false;
    }
    if ((!bg.nm(paramString)) && (paramString.length() == 1))
    {
      int i;
      if ((!bg.nm(paramString)) && (paramString.length() == 1))
      {
        i = paramString.charAt(0);
        if ((i >= 48) && (i <= 57)) {
          i -= 48;
        }
      }
      while (i != -1)
      {
        paramString = com.tencent.mm.plugin.ipcall.a.i.aIp();
        w.d("MicroMsg.IPCallEngineManager", "sendDTMF: %d", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aIq();
        localb.mlv += 1;
        w.i("MicroMsg.IPCallReportHelper", "now addCallClickCnt %d", new Object[] { Integer.valueOf(localb.mlv) });
        i = paramString.mkO.SendDTMF(i);
        if (i < 0) {
          w.i("MicroMsg.IPCallEngineManager", "sendDTMF failed, ret: %d", new Object[] { Integer.valueOf(i) });
        }
        GMTrace.o(11732105822208L, 87411);
        return true;
        if (i == 42) {
          i = 10;
        } else if (i == 35) {
          i = 11;
        } else if ((i >= 65) && (i <= 68)) {
          i = i - 65 + 12;
        } else {
          i = -1;
        }
      }
    }
    GMTrace.o(11732105822208L, 87411);
    return false;
  }
  
  private boolean D(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11731971604480L, 87410);
    ??? = com.tencent.mm.plugin.ipcall.a.i.aIo().miY;
    if (!com.tencent.mm.plugin.ipcall.a.i.aIs().pl(paramInt1))
    {
      w.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
      if (??? != null) {
        w.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now inviteId:%d, roomId:%d, state:%d,errStatus:%d, pstnErrCode:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).mjI), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).mjF), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      }
      GMTrace.o(11731971604480L, 87410);
      return false;
    }
    if (??? != null) {
      w.i("MicroMsg.IPCallManager", "finishIPCall inviteId:%d, roomId:%d, state:%d, errStatus:%d, pstnErrCode:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).mjI), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).mjF), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    w.i("MicroMsg.IPCallManager", "closeDeviceEngine");
    com.tencent.mm.plugin.voip.model.k.buC().buE();
    com.tencent.mm.plugin.voip.model.k.buC().qHT = null;
    ??? = com.tencent.mm.plugin.ipcall.a.i.aIq();
    ??? = com.tencent.mm.plugin.ipcall.a.i.aIr();
    label328:
    Object localObject6;
    if (((com.tencent.mm.plugin.ipcall.a.b.b)???).mkt != null)
    {
      ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mkt;
      if (((com.tencent.mm.plugin.ipcall.a.b.c)???).mkC != null)
      {
        i = ((com.tencent.mm.plugin.ipcall.a.b.c)???).mkC.exw;
        if (((com.tencent.mm.plugin.ipcall.a.c.b)???).mls == 0) {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).mls = i;
        }
        ??? = com.tencent.mm.plugin.ipcall.a.i.aIq();
        ??? = com.tencent.mm.plugin.ipcall.a.i.aIr();
        if (((com.tencent.mm.plugin.ipcall.a.b.b)???).mks == null) {
          break label1724;
        }
        ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mks;
        if (((com.tencent.mm.plugin.ipcall.a.b.a)???).mkm == null) {
          break label1718;
        }
        w.d("MicroMsg.IPCallAudioPlayer", "AudioPlayer  mAudioPlayErrState:" + ((com.tencent.mm.plugin.ipcall.a.b.a)???).mkm.btD());
        i = ((com.tencent.mm.plugin.ipcall.a.b.a)???).mkm.btD();
        if (((com.tencent.mm.plugin.ipcall.a.c.b)???).mlt == 0) {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).mlt = i;
        }
        ??? = com.tencent.mm.plugin.ipcall.a.i.aIr();
        ??? = com.tencent.mm.plugin.ipcall.a.i.aIp();
        i = 0;
        if (((com.tencent.mm.plugin.ipcall.a.b.b)???).mks != null)
        {
          localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mks;
          if ((((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mkm == null) || (!((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).isStart)) {
            break label1730;
          }
          i = ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mkm.btE();
        }
        label397:
        if (i != -1) {
          break label1736;
        }
        i = 0;
        label406:
        ((com.tencent.mm.plugin.ipcall.a.c.a)???).mkO.qJP = i;
        ((com.tencent.mm.plugin.ipcall.a.b.b)???).hez.tx();
        localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mks;
        if (((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).isStart) {
          w.i("MicroMsg.IPCallAudioPlayer", "stopPlay");
        }
        synchronized (((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mkn)
        {
          com.tencent.mm.sdk.f.e.post(new com.tencent.mm.plugin.ipcall.a.b.a.a((com.tencent.mm.plugin.ipcall.a.b.a)localObject6, ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mkm), "IPCallAudioPlayer_stop");
          ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).isStart = false;
          ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).mkm = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).ezR = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).mkv.di(ab.getContext());
          at.AS().sg();
          at.AS().b((e.a)???);
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).mky = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).mkw = null;
          ??? = com.tencent.mm.plugin.ipcall.a.i.aIr();
          localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).mkt;
          if (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).isStart) {
            w.i("MicroMsg.IPCallRecorder", "stop record");
          }
        }
      }
    }
    for (;;)
    {
      synchronized (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).mkD)
      {
        if (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).mkC != null)
        {
          com.tencent.mm.sdk.f.e.post(new c.a((com.tencent.mm.plugin.ipcall.a.b.c)localObject6, ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).mkC), "IPCallRecorder_stopRecord");
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).mkC = null;
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).isStart = false;
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).jGN = false;
        }
        ((com.tencent.mm.plugin.ipcall.a.b.b)???).ezR = null;
        ??? = com.tencent.mm.plugin.ipcall.a.i.aIp();
        w.i("MicroMsg.IPCallEngineManager", "close engine");
        ((com.tencent.mm.plugin.ipcall.a.c.a)???).mkO.iB(true);
        ??? = com.tencent.mm.plugin.ipcall.a.i.aIq();
        boolean bool;
        if ((bg.nm(((com.tencent.mm.plugin.ipcall.a.c.b)???).mln)) && (bg.nm(((com.tencent.mm.plugin.ipcall.a.c.b)???).mlm)))
        {
          Object localObject7 = com.tencent.mm.plugin.ipcall.a.i.aIo().miY;
          localObject6 = com.tencent.mm.plugin.ipcall.a.i.aIp().mkO;
          if (((com.tencent.mm.plugin.ipcall.a.c.b)???).mlc == 1)
          {
            i = 1;
            int j = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject7).mkb;
            localObject7 = ((v2protocal)localObject6).qKN;
            int k = ((v2protocal)localObject6).qKN.length;
            if (i == 0) {
              break label1791;
            }
            i = 1;
            ((v2protocal)localObject6).getPstnChannelInfo((byte[])localObject7, k, i, j);
            w.d("MicroMsg.Voip", "field_pstnChannelInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject6).field_pstnChannelInfoLength) });
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).mln = new String(((v2protocal)localObject6).qKN, 0, ((v2protocal)localObject6).field_pstnChannelInfoLength);
            localObject6 = com.tencent.mm.plugin.ipcall.a.i.aIp().mkO;
            ((v2protocal)localObject6).getPstnEngineInfo(((v2protocal)localObject6).qKO, ((v2protocal)localObject6).qKO.length);
            w.d("MicroMsg.Voip", "field_pstnEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject6).field_pstnEngineInfoLength) });
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).mlm = new String(((v2protocal)localObject6).qKO, 0, ((v2protocal)localObject6).field_pstnEngineInfoLength);
            localObject6 = com.tencent.mm.plugin.ipcall.a.i.aIp().mkO;
            i = v2protocal.qwP;
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).mlo = (v2protocal.bvj() + "," + ((v2protocal)localObject6).qJQ + "," + (i & 0xFF) + ((v2protocal)localObject6).bvo() + "," + ((v2protocal)localObject6).qJP);
            w.d("MicroMsg.IPCallReportHelper", "nativeChannelReportString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).mln });
            w.d("MicroMsg.IPCallReportHelper", "nativeEngineReportString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).mlm });
            w.d("MicroMsg.IPCallReportHelper", "clientReportExString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).mlo });
          }
        }
        else
        {
          ((com.tencent.mm.plugin.ipcall.a.c.a)???).mkO.reset();
          ((com.tencent.mm.plugin.ipcall.a.c.a)???).aIL();
          com.tencent.mm.plugin.ipcall.a.i.aIy().stop();
          ??? = com.tencent.mm.plugin.ipcall.a.i.aIy();
          i = R.k.cOi;
          com.tencent.mm.plugin.ipcall.a.i.aIr();
          bool = at.AS().fMS.isSpeakerphoneOn();
          ((com.tencent.mm.plugin.voip.video.h)???).mContext.getSharedPreferences(ab.bPU(), 0).getBoolean("settings_shake", true);
          at.AS().setSpeakerphoneOn(bool);
          if (!bool) {
            break label1797;
          }
          at.AS().setMode(0);
          ((com.tencent.mm.plugin.voip.video.h)???).qPP = System.currentTimeMillis();
          ??? = new com.tencent.mm.compatible.b.i();
        }
        try
        {
          ((MediaPlayer)???).setDataSource(((com.tencent.mm.plugin.voip.video.h)???).mContext, Uri.parse("android.resource://" + ((com.tencent.mm.plugin.voip.video.h)???).mContext.getPackageName() + "/" + i));
          ((MediaPlayer)???).setOnCompletionListener(new h.7((com.tencent.mm.plugin.voip.video.h)???));
          ((MediaPlayer)???).setOnErrorListener(new h.8((com.tencent.mm.plugin.voip.video.h)???));
          if (at.AS().sh()) {
            break label2313;
          }
          if (bool) {
            break label1807;
          }
        }
        catch (Throwable localThrowable)
        {
          long l2;
          long l3;
          float f;
          w.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", new Object[] { localThrowable });
          ((com.tencent.mm.plugin.voip.video.h)localObject2).qPN = 6;
          ((MediaPlayer)localObject5).stop();
          ((MediaPlayer)localObject5).release();
          continue;
          if (paramInt1 != 12) {
            break label1953;
          }
          com.tencent.mm.plugin.ipcall.a.i.aIo().aIm();
          com.tencent.mm.plugin.ipcall.a.i.aIq().aIN();
          if (paramInt2 != 11) {
            break label1888;
          }
          com.tencent.mm.plugin.ipcall.a.g.m.b(this.mih);
          continue;
          Object localObject3 = this.mih;
          if (localObject3 == null) {
            continue;
          }
          w.d("MicroMsg.IPCallRecordStorageLogic", "recordCallFailed, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).vmr) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).vmr == -1L) {
            continue;
          }
          ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_status = 6;
          com.tencent.mm.plugin.ipcall.a.i.aIv().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject3);
          continue;
          if (paramInt1 != 9) {
            break label1989;
          }
          com.tencent.mm.plugin.ipcall.a.i.aIo().pm(1);
          com.tencent.mm.plugin.ipcall.a.i.aIq().aIM();
          com.tencent.mm.plugin.ipcall.a.g.m.a(this.mih, com.tencent.mm.plugin.ipcall.a.i.aIq().mld);
          continue;
          if (paramInt1 != 10) {
            break label2108;
          }
          com.tencent.mm.plugin.ipcall.a.i.aIo().pm(1);
          localObject3 = com.tencent.mm.plugin.ipcall.a.i.aIq();
          w.i("MicroMsg.IPCallReportHelper", "otherSideUserShutdown");
          ((com.tencent.mm.plugin.ipcall.a.c.b)localObject3).mkX = 1;
          localObject3 = this.mih;
          long l1 = com.tencent.mm.plugin.ipcall.a.i.aIq().mld;
          if (localObject3 == null) {
            continue;
          }
          w.d("MicroMsg.IPCallRecordStorageLogic", "recordOthersideShutdownCall, localId: %d, talkTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).vmr), Long.valueOf(l1) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).vmr == -1L) {
            continue;
          }
          ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_status = 5;
          ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_duration = l1;
          com.tencent.mm.plugin.ipcall.a.i.aIv().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject3);
          continue;
          if (paramInt1 != 11) {
            continue;
          }
          if (paramInt2 != 5) {
            break label2149;
          }
          com.tencent.mm.plugin.ipcall.a.i.aIo().pm(3);
          for (;;)
          {
            com.tencent.mm.plugin.ipcall.a.i.aIq().aIM();
            if (paramInt2 != 11) {
              break label2175;
            }
            com.tencent.mm.plugin.ipcall.a.g.m.b(this.mih);
            break;
            if (paramInt2 == 11) {
              com.tencent.mm.plugin.ipcall.a.i.aIo().pm(1);
            } else {
              com.tencent.mm.plugin.ipcall.a.i.aIo().pm(2);
            }
          }
          com.tencent.mm.plugin.ipcall.a.g.m.a(this.mih, com.tencent.mm.plugin.ipcall.a.i.aIq().mld);
          continue;
          if (l3 - l2 >= 1800L) {
            break label2216;
          }
          w.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog not reach INTERVAL_TIMES_TRY_SHOW_WCO_FEEDBACK_MAIN");
          continue;
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsx, Integer.valueOf(paramInt1 + 1));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsw, Long.valueOf(l3));
          Intent localIntent = new Intent();
          localIntent.putExtra("IPCallFeedbackDialogUI_KRoomId", paramInt2);
          localIntent.putExtra("IPCallFeedbackDialogUI_KCallseq", l1);
          com.tencent.mm.bj.d.b((Context)localObject3, "ipcall", ".ui.IPCallFeedbackDialogUI", localIntent);
          continue;
          w.e("MicroMsg.IPCallManager", "roomId = 0,ignore feedback");
          continue;
          continue;
          i = 0;
          continue;
        }
        ((MediaPlayer)???).setAudioStreamType(i);
        ((MediaPlayer)???).prepare();
        ((MediaPlayer)???).setLooping(false);
        ((MediaPlayer)???).start();
        if (System.currentTimeMillis() - ((com.tencent.mm.plugin.voip.video.h)???).qPP > 2000L) {
          ((com.tencent.mm.plugin.voip.video.h)???).qPN = 7;
        }
        ghS.removeCallbacks(this.mio);
        ghS.removeCallbacks(this.mim);
        if (this.euU != null)
        {
          this.euU.stopTimer();
          this.euU = null;
        }
        com.tencent.mm.plugin.ipcall.a.i.aIq().mle = paramInt3;
        ??? = com.tencent.mm.plugin.ipcall.a.i.aIq();
        w.d("MicroMsg.IPCallReportHelper", "markEndTalk");
        if ((((com.tencent.mm.plugin.ipcall.a.c.b)???).mll == 0L) && (((com.tencent.mm.plugin.ipcall.a.c.b)???).mlk != 0L))
        {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).mll = System.currentTimeMillis();
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).mld = ((((com.tencent.mm.plugin.ipcall.a.c.b)???).mll - ((com.tencent.mm.plugin.ipcall.a.c.b)???).mlk) / 1000L);
          w.d("MicroMsg.IPCallReportHelper", "callTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.c.b)???).mld) });
        }
        if (paramInt1 != 8) {
          break label1853;
        }
        com.tencent.mm.plugin.ipcall.a.i.aIo().aIm();
        com.tencent.mm.plugin.ipcall.a.i.aIq().aIN();
        ??? = this.mih;
        if (??? != null)
        {
          w.d("MicroMsg.IPCallRecordStorageLogic", "recordCancelCall, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)???).vmr) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)???).vmr != -1L)
          {
            ((com.tencent.mm.plugin.ipcall.a.g.k)???).field_status = 2;
            com.tencent.mm.plugin.ipcall.a.i.aIv().a((com.tencent.mm.plugin.ipcall.a.g.k)???);
          }
        }
        if (com.tencent.mm.plugin.ipcall.a.i.aIo().eQN)
        {
          if ((this.mip) || (com.tencent.mm.plugin.ipcall.a.i.aIo().miY.mjF == 0) || (com.tencent.mm.plugin.ipcall.a.i.aIo().miY.mjH == 0L)) {
            break label2299;
          }
          ??? = ab.getContext();
          paramInt2 = com.tencent.mm.plugin.ipcall.a.i.aIo().miY.mjF;
          l1 = com.tencent.mm.plugin.ipcall.a.i.aIo().miY.mjH;
          w.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog");
          if (d.aHT())
          {
            paramInt3 = com.tencent.mm.k.g.ut().getInt("WCOMaxTimesForShowFeedback", 0);
            at.AR();
            paramInt1 = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vsx, Integer.valueOf(0))).intValue();
            at.AR();
            l2 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsw, Long.valueOf(0L))).longValue();
            l3 = bg.Pu();
            if (l3 - l2 <= 86400L) {
              break label2310;
            }
            paramInt1 = 0;
            w.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reset time");
            if (paramInt1 < paramInt3) {
              break label2192;
            }
            w.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reach max time" + paramInt3);
          }
        }
        com.tencent.mm.plugin.ipcall.a.i.aIo().miP = null;
        com.tencent.mm.plugin.ipcall.a.i.aIp().mkT = null;
        com.tencent.mm.plugin.ipcall.a.i.aIs().miI = -1;
        aHP();
        art();
        GMTrace.o(11731971604480L, 87410);
        return true;
        i = 0;
        break;
        i = 0;
        break;
        label1718:
        i = 0;
        break label328;
        label1724:
        i = 0;
        break label328;
        label1730:
        i = -1;
        break label397;
        label1736:
        f = at.AS().getStreamMaxVolume(i);
        i = (int)(at.AS().getStreamVolume(i) / f * 100.0F);
        break label406;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      i = 0;
      continue;
      label1791:
      i = 0;
      continue;
      label1797:
      at.AS().setMode(2);
      continue;
      label1807:
      i = 2;
    }
  }
  
  private void aHR()
  {
    GMTrace.i(11735327047680L, 87435);
    w.i("MicroMsg.IPCallManager", "startTimeCount");
    if (this.euU != null)
    {
      this.euU.stopTimer();
      GMTrace.o(11735327047680L, 87435);
      return;
    }
    if (this.euU == null) {
      this.euU = new com.tencent.mm.sdk.platformtools.aj(Looper.getMainLooper(), new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(11743111675904L, 87493);
          c.this.aHO();
          if ((com.tencent.mm.plugin.ipcall.a.i.aIs().aIl()) && (c.this.mig != null)) {
            c.this.mig.aHX();
          }
          GMTrace.o(11743111675904L, 87493);
          return true;
        }
      }, true);
    }
    this.euU.z(1000L, 1000L);
    GMTrace.o(11735327047680L, 87435);
  }
  
  public final void aHF()
  {
    GMTrace.i(11732240039936L, 87412);
    w.i("MicroMsg.IPCallManager", "onInviteSuccess");
    if (!com.tencent.mm.plugin.ipcall.a.i.aIs().pl(3))
    {
      GMTrace.o(11732240039936L, 87412);
      return;
    }
    Object localObject = com.tencent.mm.plugin.ipcall.a.i.aIq();
    w.d("MicroMsg.IPCallReportHelper", "markStartInvite");
    if (((com.tencent.mm.plugin.ipcall.a.c.b)localObject).mli == 0L) {
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).mli = System.currentTimeMillis();
    }
    localObject = com.tencent.mm.plugin.ipcall.a.i.aIo().miY;
    com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aIq();
    int i = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mjI;
    String str1 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).eTy;
    String str2 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mkh;
    int j = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mjF;
    long l1 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mjG;
    long l2 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).mjH;
    localb.mjI = i;
    localb.mlh = str1;
    localb.htr = str2;
    localb.mjF = j;
    localb.mjG = l1;
    localb.mlf = l2;
    if (this.mig != null) {
      this.mig.aHF();
    }
    GMTrace.o(11732240039936L, 87412);
  }
  
  public final void aHG()
  {
    GMTrace.i(11732508475392L, 87414);
    w.i("MicroMsg.IPCallManager", "onStartRing, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (!com.tencent.mm.plugin.ipcall.a.i.aIs().pl(4))
    {
      GMTrace.o(11732508475392L, 87414);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aIq();
    w.d("MicroMsg.IPCallReportHelper", "markStartRing");
    if (localb.mlj == 0L)
    {
      localb.mlj = System.currentTimeMillis();
      localb.mla = (localb.mlj - localb.mli);
      w.d("MicroMsg.IPCallReportHelper", "ringTime: %d", new Object[] { Long.valueOf(localb.mla) });
    }
    com.tencent.mm.plugin.ipcall.a.i.aIp().aIK();
    localb = com.tencent.mm.plugin.ipcall.a.i.aIq();
    w.i("MicroMsg.IPCallReportHelper", "startRing");
    localb.mkV = 1;
    if (this.mig != null) {
      this.mig.aHG();
    }
    GMTrace.o(11732508475392L, 87414);
  }
  
  public final void aHH()
  {
    GMTrace.i(11732642693120L, 87415);
    w.i("MicroMsg.IPCallManager", "onAccept, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (!com.tencent.mm.plugin.ipcall.a.i.aIs().pl(5))
    {
      GMTrace.o(11732642693120L, 87415);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aIq();
    w.d("MicroMsg.IPCallReportHelper", "markUserAccept");
    if (localb.mir == 0L)
    {
      localb.mir = System.currentTimeMillis();
      localb.mlb = (localb.mir - localb.mli);
      w.d("MicroMsg.IPCallReportHelper", "answerTime: %d", new Object[] { Long.valueOf(localb.mlb) });
    }
    com.tencent.mm.plugin.ipcall.a.i.aIp().aIK();
    localb = com.tencent.mm.plugin.ipcall.a.i.aIq();
    w.i("MicroMsg.IPCallReportHelper", "userAccept");
    localb.mkW = 1;
    ghS.removeCallbacks(this.mim);
    com.tencent.mm.plugin.ipcall.a.i.aIy().stop();
    ghS.removeCallbacks(this.mio);
    com.tencent.mm.plugin.ipcall.a.i.aIr().aIH();
    if ((com.tencent.mm.plugin.ipcall.a.i.aIp().mkR) && (!this.mii))
    {
      com.tencent.mm.plugin.ipcall.a.i.aIq().aIO();
      com.tencent.mm.plugin.ipcall.a.i.aIq().aIR();
      this.mii = true;
      this.mir = bg.Pu();
      aHR();
      com.tencent.mm.plugin.ipcall.a.i.aIp().aIJ();
      if (this.mig != null) {
        this.mig.aHU();
      }
      com.tencent.mm.plugin.ipcall.a.i.aIq().aIQ();
      com.tencent.mm.plugin.voip.model.k.buC().buD();
      com.tencent.mm.plugin.voip.model.k.buC().qHT = this;
    }
    GMTrace.o(11732642693120L, 87415);
  }
  
  public final void aHI()
  {
    GMTrace.i(11733179564032L, 87419);
    w.i("MicroMsg.IPCallManager", "onShutdownByOtherSide, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (D(10, 0, 32))
    {
      if (this.mig != null)
      {
        this.mig.aHV();
        GMTrace.o(11733179564032L, 87419);
        return;
      }
      Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dEX), 1).show();
    }
    GMTrace.o(11733179564032L, 87419);
  }
  
  public final void aHJ()
  {
    GMTrace.i(11733447999488L, 87421);
    w.i("MicroMsg.IPCallManager", "onHeartbeatFailed");
    if (co(7, 29)) {
      c(7, null, ab.getContext().getString(R.l.dbG), 1);
    }
    GMTrace.o(11733447999488L, 87421);
  }
  
  public final void aHK()
  {
    GMTrace.i(11734119088128L, 87426);
    w.i("MicroMsg.IPCallManager", "onStartEngineFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (co(6, 0)) {
      c(6, null, ab.getContext().getString(R.l.dbJ), 1);
    }
    GMTrace.o(11734119088128L, 87426);
  }
  
  public final void aHL()
  {
    GMTrace.i(11734253305856L, 87427);
    w.i("MicroMsg.IPCallManager", "onChannelConnected, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    com.tencent.mm.plugin.ipcall.a.i.aIy().stop();
    ghS.removeCallbacks(this.mio);
    Object localObject;
    com.tencent.mm.plugin.ipcall.a.b.a locala;
    if (com.tencent.mm.plugin.ipcall.a.i.aIs().aIj())
    {
      localObject = com.tencent.mm.plugin.ipcall.a.i.aIr();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkv.a(ab.getContext(), (HeadsetPlugReceiver.a)localObject);
      at.AS().a((e.a)localObject);
      at.AS().sf();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkA = at.AS().sn();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkz = at.AS().sh();
      w.d("MicroMsg.IPCallDeviceManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkA), Boolean.valueOf(((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkz) });
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).hez.requestFocus();
      locala = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mks;
      if (!locala.isStart) {
        break label387;
      }
      w.d("MicroMsg.IPCallAudioPlayer", "startPlay, already start");
    }
    for (;;)
    {
      if ((((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkA) && (!((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkz) && (((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mky != null)) {
        ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mky.fq(true);
      }
      if ((((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkz) && (!((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mkA) && (((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mky != null)) {
        ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mky.fr(true);
      }
      com.tencent.mm.plugin.ipcall.a.i.aIq().aIO();
      com.tencent.mm.plugin.ipcall.a.i.aIr().aIH();
      if ((com.tencent.mm.plugin.ipcall.a.i.aIs().aIl()) && (!this.mii))
      {
        com.tencent.mm.plugin.ipcall.a.i.aIq().aIR();
        com.tencent.mm.plugin.ipcall.a.i.aIp().aIJ();
        this.mii = true;
        this.mir = bg.Pu();
        aHR();
        if (this.mig != null) {
          this.mig.aHU();
        }
        localObject = this.mih;
        if (localObject != null)
        {
          w.d("MicroMsg.IPCallRecordStorageLogic", "recordStartTalk, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject).vmr) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject).vmr != -1L)
          {
            ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_status = 3;
            com.tencent.mm.plugin.ipcall.a.i.aIv().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject);
          }
        }
        com.tencent.mm.plugin.ipcall.a.i.aIq().aIQ();
        com.tencent.mm.plugin.voip.model.k.buC().buD();
        com.tencent.mm.plugin.voip.model.k.buC().qHT = this;
      }
      GMTrace.o(11734253305856L, 87427);
      return;
      label387:
      w.i("MicroMsg.IPCallAudioPlayer", "startPlay");
      if (locala.mkm == null)
      {
        locala.mkm = new com.tencent.mm.plugin.voip.model.b();
        locala.mkm.P(v2protocal.nlR, 20, 1);
      }
      locala.mko = locala.mkm.k(ab.getContext(), false);
      locala.mkm.qEf = new a.1(locala);
      if (locala.mkm.btA() <= 0) {
        com.tencent.mm.plugin.ipcall.a.i.aIq().aIP();
      }
      locala.fn(locala.mkp);
      locala.isStart = true;
    }
  }
  
  public final void aHM()
  {
    GMTrace.i(11734655959040L, 87430);
    if (com.tencent.mm.plugin.ipcall.a.i.aIs().miI != 5)
    {
      w.i("MicroMsg.IPCallManager", "onBadNetStatus currentState != accept:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
      GMTrace.o(11734655959040L, 87430);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.b.b localb = com.tencent.mm.plugin.ipcall.a.i.aIr();
    w.i("MicroMsg.IPCallDeviceManager", "onBadNetStatus");
    if (localb.mkw != null)
    {
      j localj = localb.mkw;
      if (localj.muc != null) {
        localj.muc.setVisibility(0);
      }
      if (localj.mud != null) {
        localj.mud.setVisibility(0);
      }
    }
    if (!at.AS().fMS.isSpeakerphoneOn())
    {
      long l = System.currentTimeMillis();
      if (l - localb.mkB > 30000L)
      {
        localb.mkB = l;
        com.tencent.mm.plugin.voip.model.d.btG().ws(R.k.cPz);
      }
    }
    GMTrace.o(11734655959040L, 87430);
  }
  
  public final void aHN()
  {
    GMTrace.i(11734790176768L, 87431);
    if (com.tencent.mm.plugin.ipcall.a.i.aIs().miI != 5)
    {
      w.i("MicroMsg.IPCallManager", "onResumeGoodNetStatus currentState != accept:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
      GMTrace.o(11734790176768L, 87431);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.b.b localb = com.tencent.mm.plugin.ipcall.a.i.aIr();
    w.i("MicroMsg.IPCallDeviceManager", "onResumeGoodNetStatus");
    if (localb.mkw != null) {
      localb.mkw.aJA();
    }
    GMTrace.o(11734790176768L, 87431);
  }
  
  public final void aHO()
  {
    GMTrace.i(11734924394496L, 87432);
    if (com.tencent.mm.plugin.ipcall.a.i.aIs().aIl()) {}
    for (Object localObject1 = ab.getContext().getString(R.l.dEu, new Object[] { String.format("%02d:%02d", new Object[] { Long.valueOf(bg.aG(this.mir) / 60L), Long.valueOf(bg.aG(this.mir) % 60L) }) });; localObject1 = ab.getContext().getString(R.l.dEt))
    {
      Object localObject2 = new Intent(ab.getContext(), IPCallTalkUI.class);
      ((Intent)localObject2).putExtra("IPCallTalkUI_isFromMiniNotification", true);
      localObject2 = PendingIntent.getActivity(ab.getContext(), 42, (Intent)localObject2, 134217728);
      int i = R.g.aYD;
      if (com.tencent.mm.compatible.util.d.eu(19)) {
        i = R.g.aYC;
      }
      localObject1 = new Notification.Builder(ab.getContext()).setTicker(ab.getContext().getString(R.l.dEt)).setWhen(System.currentTimeMillis()).setContentTitle(ab.getContext().getString(R.l.dEm)).setContentText((CharSequence)localObject1).setContentIntent((PendingIntent)localObject2).getNotification();
      ((Notification)localObject1).icon = i;
      ((Notification)localObject1).flags |= 0x20;
      at.getNotification().a(42, (Notification)localObject1, false);
      if (com.tencent.mm.plugin.ipcall.a.i.aIs().aIl()) {
        break;
      }
      com.tencent.mm.plugin.voip.model.d.btH().JQ(ab.getContext().getString(R.l.dKo));
      GMTrace.o(11734924394496L, 87432);
      return;
    }
    com.tencent.mm.plugin.voip.model.d.btH().uM(aHQ());
    GMTrace.o(11734924394496L, 87432);
  }
  
  public final void aHP()
  {
    GMTrace.i(11735058612224L, 87433);
    synchronized (this.laY)
    {
      this.mip = false;
      com.tencent.mm.plugin.voip.model.d.btH().dismiss();
      ((NotificationManager)ab.getContext().getSystemService("notification")).cancel(42);
      GMTrace.o(11735058612224L, 87433);
      return;
    }
  }
  
  public final int aHQ()
  {
    GMTrace.i(11735192829952L, 87434);
    int i = (int)bg.aG(this.mir);
    if (i > 0)
    {
      GMTrace.o(11735192829952L, 87434);
      return i;
    }
    GMTrace.o(11735192829952L, 87434);
    return 0;
  }
  
  public final void art()
  {
    GMTrace.i(11731837386752L, 87409);
    if (this.mij != null)
    {
      this.mij.listen(this.mik, 0);
      this.mij = null;
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.mil);
    GMTrace.o(11731837386752L, 87409);
  }
  
  public final void bf(String paramString, int paramInt)
  {
    GMTrace.i(11732911128576L, 87417);
    w.i("MicroMsg.IPCallManager", "onUnAvaliable, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (co(3, 5)) {
      c(3, null, paramString, paramInt);
    }
    GMTrace.o(11732911128576L, 87417);
  }
  
  public final void bg(String paramString, int paramInt)
  {
    GMTrace.i(11733045346304L, 87418);
    w.i("MicroMsg.IPCallManager", "onBusy, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (co(1, 4)) {
      c(1, null, paramString, paramInt);
    }
    GMTrace.o(11733045346304L, 87418);
  }
  
  public final void bh(String paramString, int paramInt)
  {
    GMTrace.i(11733313781760L, 87420);
    w.i("MicroMsg.IPCallManager", "onSyncFailed");
    if (co(7, 35)) {
      c(7, null, paramString, paramInt);
    }
    GMTrace.o(11733313781760L, 87420);
  }
  
  public final void c(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(11732776910848L, 87416);
    if (this.mig != null)
    {
      this.mig.c(paramInt1, paramString1, paramString2, paramInt2);
      GMTrace.o(11732776910848L, 87416);
      return;
    }
    Toast.makeText(ab.getContext(), paramString2, 1).show();
    GMTrace.o(11732776910848L, 87416);
  }
  
  public final boolean co(int paramInt1, int paramInt2)
  {
    GMTrace.i(11734521741312L, 87429);
    if (com.tencent.mm.plugin.ipcall.a.i.aIs().aIl())
    {
      if (paramInt1 == 0)
      {
        bool = D(9, paramInt1, paramInt2);
        GMTrace.o(11734521741312L, 87429);
        return bool;
      }
      bool = D(11, paramInt1, paramInt2);
      GMTrace.o(11734521741312L, 87429);
      return bool;
    }
    if (paramInt1 == 0)
    {
      bool = D(8, paramInt1, paramInt2);
      GMTrace.o(11734521741312L, 87429);
      return bool;
    }
    boolean bool = D(12, paramInt1, paramInt2);
    GMTrace.o(11734521741312L, 87429);
    return bool;
  }
  
  public final void pj(int paramInt)
  {
    GMTrace.i(11734387523584L, 87428);
    w.i("MicroMsg.IPCallManager", "onChannelConnectFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (com.tencent.mm.plugin.ipcall.a.i.aIp().mkR)
    {
      w.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel already connected");
      if (co(5, paramInt))
      {
        c(5, null, ab.getContext().getString(R.l.dbG), 1);
        GMTrace.o(11734387523584L, 87428);
      }
    }
    else
    {
      w.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel not connet, may be request connect failed");
      if (co(4, paramInt)) {
        c(4, null, ab.getContext().getString(R.l.dbG), 1);
      }
    }
    GMTrace.o(11734387523584L, 87428);
  }
  
  public final void u(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11732374257664L, 87413);
    w.i("MicroMsg.IPCallManager", "onInviteFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (co(2, 0)) {
      c(2, paramString1, paramString2, paramInt);
    }
    GMTrace.o(11732374257664L, 87413);
  }
  
  public final void v(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11733582217216L, 87422);
    w.i("MicroMsg.IPCallManager", "onAccountOverdue, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (co(8, 9)) {
      c(8, paramString1, paramString2, paramInt);
    }
    GMTrace.o(11733582217216L, 87422);
  }
  
  public final void w(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11733716434944L, 87423);
    w.i("MicroMsg.IPCallManager", "onCallRestricted, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (co(10, 0)) {
      c(10, paramString1, paramString2, paramInt);
    }
    GMTrace.o(11733716434944L, 87423);
  }
  
  public final void x(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11733850652672L, 87424);
    w.i("MicroMsg.IPCallManager", "onCallPhoneNumberInvalid, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    if (co(11, 0)) {
      c(11, paramString1, paramString2, paramInt);
    }
    GMTrace.o(11733850652672L, 87424);
  }
  
  public final void y(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11733984870400L, 87425);
    do
    {
      w.i("MicroMsg.IPCallManager", "onDisasterHappen, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aIs().miI) });
    } while (co(12, 0));
    GMTrace.o(11733984870400L, 87425);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */