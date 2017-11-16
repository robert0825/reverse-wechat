package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voip.model.a.b;
import com.tencent.mm.plugin.voip.model.a.i;
import com.tencent.mm.plugin.voip.model.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public final class n
  implements e.a
{
  public static int joK;
  public static int qIA;
  static int qIB;
  public WifiManager aKk;
  public e qDX;
  public String qIC;
  public int qID;
  Timer qIE;
  public WifiInfo qIF;
  private aj qIG;
  public byte[] qIH;
  public aj qII;
  public aj qIJ;
  aj qIK;
  private Object qIx;
  com.tencent.mm.plugin.voip.video.h qIy;
  public int qIz;
  
  static
  {
    GMTrace.i(16564615118848L, 123416);
    joK = -1;
    qIA = -1;
    qIB = 20;
    GMTrace.o(16564615118848L, 123416);
  }
  
  public n()
  {
    GMTrace.i(5318243254272L, 39624);
    this.qIx = new Object();
    this.qIz = 0;
    this.qIE = null;
    this.qIG = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5263348203520L, 39215);
        if (n.this.qDX.qFr.qJp == 1)
        {
          e locale = n.this.qDX;
          if ((locale.mStatus != 2) && (locale.mStatus != 4)) {
            break label188;
          }
        }
        label188:
        for (int i = 1;; i = 0)
        {
          if (i != 0)
          {
            com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", "call timeout!");
            n.this.qDX.qFr.qKT.qGe = 101;
            com.tencent.mm.plugin.report.service.g.ork.i(11521, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(4), Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()) });
            n.this.buX();
            n.this.qDX.qFs.bur();
          }
          GMTrace.o(5263348203520L, 39215);
          return false;
        }
      }
    }, false);
    this.qIH = new byte['Ǵ'];
    this.qII = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5264019292160L, 39220);
        Object localObject = n.this.qDX;
        ((e)localObject).qFz += 1;
        if (n.this.qDX.qFr.mjF == 0)
        {
          com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.tC() + "double link switch roomId == 0 ");
          n.this.qII.stopTimer();
        }
        for (;;)
        {
          GMTrace.o(5264019292160L, 39220);
          return true;
          n.this.qDX.qFr.app2EngineDataEx(n.this.qDX.qFr.qKq, n.this.qDX.qFr.qKr, n.this.qDX.qFr.qKs, 0, 0);
          if ((!n.this.qDX.qFy) && (1 == n.this.qDX.qFr.field_mGetValidSample))
          {
            n.this.qDX.qFy = true;
            n.this.qDX.qFA = n.this.qDX.qFz;
          }
          if (1 == n.this.qDX.qFe) {
            n.this.qDX.qFe = 15;
          }
          if ((true == n.this.qDX.qFy) && (n.this.qDX.qFz - n.this.qDX.qFA == n.this.qDX.qFe) && ((n.this.qDX.qFr.qKh & 0x1) == 0))
          {
            n.this.qDX.qFA = n.this.qDX.qFz;
            int i = n.this.qDX.qFr.isDCSameLan();
            int k = n.this.qDX.qFr.getCurrentConnType();
            if ((1 == i) && (1 == k))
            {
              com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  In the Same LAN, isDCSameLan = " + i);
              localObject = n.this.qDX;
              ((e)localObject).qFz += 1;
              GMTrace.o(5264019292160L, 39220);
              return true;
            }
            int m = n.this.qDX.qFr.getcurstrategy();
            int n = n.this.qDX.qFr.isRelayConnReady();
            int i1 = n.this.qDX.qFr.isDCReady();
            int j = n.this.qDX.qFe - 3;
            i = j;
            if (j > 15) {
              i = 15;
            }
            n.this.qDX.qFr.app2EngineLinkQualityEx(i, n.this.qIH);
            new com.tencent.mm.plugin.voip.model.a.d(n.this.qDX.qFr.mjF, n.this.qDX.qFr.mjG, n.this.qDX.qFr.mjN, k, n, i1, m, n.this.qIH, n.this.qDX.qFr.field_realLinkQualityInfoBuffLen).bvg();
            localObject = n.this.qDX.qFr;
            ((v2protocal)localObject).qKj += 1;
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  doubleLinkSwitchReportStatus " + n.this.qDX.qFe + " isFirstValidSampleSet " + n.this.qDX.qFy + " mGetValidSample " + n.this.qDX.qFr.field_mGetValidSample + "mDoubleLinkSwitchReqCnt " + n.this.qDX.qFr.qKj + "mTimerCounter " + n.this.qDX.qFz + "mLastSwitchTimer " + n.this.qDX.qFA);
          }
        }
      }
    }, true);
    this.qIJ = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5261066502144L, 39198);
        if (n.this.qDX.qFr.mjF == 0)
        {
          com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.tC() + " roomId == 0 ");
          n.this.qIJ.stopTimer();
        }
        label142:
        for (;;)
        {
          GMTrace.o(5261066502144L, 39198);
          return true;
          if (n.this.qDX.mStatus >= 5) {}
          for (int i = 1;; i = 0)
          {
            if (i == 0) {
              break label142;
            }
            new com.tencent.mm.plugin.voip.model.a.f(n.this.qDX.qFr.mjF, n.this.qDX.qFr.mjG, n.this.qDX.qFC).bvg();
            break;
          }
        }
      }
    }, true);
    this.qIK = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5317169512448L, 39616);
        w.i("MicroMsg.Voip.VoipServiceEx", "voip called out of time,now destroy...");
        if ((3 == n.this.qDX.mStatus) && (n.this.qIz != 0) && (n.this.qIz == n.this.qDX.qFr.mjF))
        {
          n.this.qIz = 0;
          n.this.qDX.r(5, 56536, "");
        }
        GMTrace.o(5317169512448L, 39616);
        return false;
      }
    }, true);
    this.qDX = f.btX();
    this.qDX.a(this);
    this.qIy = new com.tencent.mm.plugin.voip.video.h(ab.getContext());
    GMTrace.o(5318243254272L, 39624);
  }
  
  public static void a(int paramInt1, long paramLong, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
  {
    GMTrace.i(5319988084736L, 39637);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipServiceEx", "doAck roomId " + paramInt1 + "  roomKey " + paramLong + " status " + paramInt2);
    if ((paramInt1 != 0) && (paramLong != 0L)) {
      new com.tencent.mm.plugin.voip.model.a.a(paramInt1, paramLong, paramInt2, paramArrayOfByte1, paramArrayOfByte2, paramString).bvg();
    }
    GMTrace.o(5319988084736L, 39637);
  }
  
  public static boolean buV()
  {
    GMTrace.i(16564346683392L, 123414);
    if (((TelephonyManager)ab.getContext().getSystemService("phone")).getCallState() != 0)
    {
      GMTrace.o(16564346683392L, 123414);
      return true;
    }
    GMTrace.o(16564346683392L, 123414);
    return false;
  }
  
  public final int bZ(String paramString, int paramInt)
  {
    GMTrace.i(5319316996096L, 39632);
    w.i("MicroMsg.Voip.VoipServiceEx", "call username:%s, callType:%d, inviteType:%d", new Object[] { paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
    if (bg.nm(paramString))
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed call without valid username.");
      GMTrace.o(5319316996096L, 39632);
      return -1;
    }
    if (this.qDX.btN())
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed call withing calling.");
      GMTrace.o(5319316996096L, 39632);
      return -1;
    }
    this.qDX.qFr.qJp = 1;
    this.qDX.qFr.mzB = paramString;
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.tC() + "call username:" + paramString);
    if (this.qDX.qFr.ndo)
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.tC() + "v2protocal already init.");
      this.qDX.qFr.iB(false);
      this.qDX.qFr.reset();
    }
    if (this.qDX.qFr.brY() < 0)
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
      GMTrace.o(5319316996096L, 39632);
      return -1;
    }
    this.qIJ.z(50000L, 50000L);
    this.qDX.qFr.mjI = ((int)System.currentTimeMillis());
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    new com.tencent.mm.plugin.voip.model.a.g(localArrayList, this.qDX.qFr.field_peerId, this.qDX.qFr.field_capInfo, this.qDX.qFr.netType, 0, paramInt, this.qDX.qFr.mjI).bvg();
    this.qDX.dB(2);
    this.qDX.qFt.qFN = 1;
    this.qIG.z(60000L, 60000L);
    this.qDX.qFr.qKT.qGJ = System.currentTimeMillis();
    this.qDX.qFr.qKT.beginTime = System.currentTimeMillis();
    this.qDX.qFr.qKT.qGp = paramInt;
    w.d("MicroMsg.Voip.VoipServiceEx", "iRoomType " + this.qDX.qFr.qKT.qGp);
    GMTrace.o(5319316996096L, 39632);
    return 0;
  }
  
  public final boolean btN()
  {
    GMTrace.i(5318914342912L, 39629);
    if (this.qDX.btN())
    {
      GMTrace.o(5318914342912L, 39629);
      return true;
    }
    GMTrace.o(5318914342912L, 39629);
    return false;
  }
  
  public final boolean buU()
  {
    GMTrace.i(5318780125184L, 39628);
    if (this.qDX.qFr.mjF != 0)
    {
      GMTrace.o(5318780125184L, 39628);
      return true;
    }
    GMTrace.o(5318780125184L, 39628);
    return false;
  }
  
  public final void buW()
  {
    GMTrace.i(5319048560640L, 39630);
    if (this.qDX.btN()) {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "checkStartup failed, stauts = " + this.qDX.mStatus);
    }
    com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "checkStartup...devicekey = " + ba.bUs());
    this.qDX.btJ();
    w.d("MicroMsg.Voip.VoipServiceEx", "reset");
    this.qDX.reset();
    this.qIJ.stopTimer();
    this.qIG.stopTimer();
    this.qII.stopTimer();
    this.qIK.stopTimer();
    this.qIz = 0;
    at.AR();
    com.tencent.mm.compatible.d.p.dO(com.tencent.mm.y.c.xi().bUq());
    GMTrace.o(5319048560640L, 39630);
  }
  
  public final int buX()
  {
    GMTrace.i(5319451213824L, 39633);
    if (!this.qDX.btN())
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call ,as not in calling.");
      GMTrace.o(5319451213824L, 39633);
      return -1;
    }
    w.i("MicroMsg.Voip.VoipServiceEx", "cancelCallEx, roomId:%d, msgID:%d, inviteId:%d", new Object[] { Integer.valueOf(this.qDX.qFr.mjF), Integer.valueOf(this.qDX.qFr.qJm), Integer.valueOf(this.qDX.qFr.mjI) });
    synchronized (this.qIx)
    {
      if ((this.qDX.qFr.mjF == 0) && (this.qDX.qFr.mjI == 0))
      {
        com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call with roomid = 0 and inviteId = 0 ");
        GMTrace.o(5319451213824L, 39633);
        return -1;
      }
      Object localObject2 = this.qDX.qFr.iB(true);
      int i;
      long l;
      if (((String)localObject2).length() > 0)
      {
        i = this.qDX.qFr.mjF;
        l = this.qDX.qFr.mjG;
        int j = this.qDX.qFr.qJm;
        new com.tencent.mm.plugin.voip.model.a.c(i, l, this.qDX.qFr.mzB, (String)localObject2, this.qDX.qFr.mjI).bvg();
      }
      localObject2 = this.qDX.qFr.qKT;
      ((h)localObject2).qGz = ((int)(System.currentTimeMillis() - ((h)localObject2).qGJ));
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.VoipDailReport", "devin:cancelInvite:" + ((h)localObject2).qGz);
      if ((this.qDX.qFr.qJE == 0) && (this.qDX.qFr.qJF == 0)) {
        this.qDX.btK();
      }
      this.qDX.wf(this.qIy.bwd());
      localObject2 = v2protocal.bvp();
      String str1 = this.qDX.qFr.bvq();
      String str2 = this.qDX.qFr.bvs();
      String str3 = this.qDX.qFr.bvr();
      String str4 = this.qDX.qFr.bvt();
      if (str1.length() > 0)
      {
        i = this.qDX.qFr.mjF;
        l = this.qDX.qFr.mjG;
        i = this.qDX.qFr.qJm;
        String str5 = this.qDX.qFr.mzB;
        new l((String)localObject2, str1, str3, str2, str4).bvg();
      }
      this.qDX.btI();
      reset();
      this.qDX.qFr.mjF = 0;
      this.qDX.qFr.mjI = 0;
      GMTrace.o(5319451213824L, 39633);
      return 0;
    }
  }
  
  public final int buY()
  {
    GMTrace.i(5319585431552L, 39634);
    w.i("MicroMsg.Voip.VoipServiceEx", "reject");
    if (!this.qDX.btM())
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to reject with calling, status =" + this.qDX.mStatus);
      GMTrace.o(5319585431552L, 39634);
      return -1;
    }
    synchronized (this.qIx)
    {
      if (this.qDX.qFr.mjF == 0)
      {
        com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to reject with roomid = 0. ");
        GMTrace.o(5319585431552L, 39634);
        return -1;
      }
      this.qDX.qFr.qKT.bua();
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", " reject, status:" + this.qDX.mStatus + " roomid:" + this.qDX.qFr.mjF);
      int i = this.qDX.qFr.netType;
      int j = this.qDX.qFr.mjF;
      long l = this.qDX.qFr.mjG;
      new b(2, i, j, new byte[0], new byte[0], l, false, false).bvg();
      if ((this.qDX.qFr.qJE == 0) && (this.qDX.qFr.qJF == 0)) {
        this.qDX.btK();
      }
      this.qDX.wf(this.qIy.bwd());
      this.qDX.qFr.iB(true);
      String str1 = v2protocal.bvp();
      String str2 = this.qDX.qFr.bvq();
      String str3 = this.qDX.qFr.bvs();
      String str4 = this.qDX.qFr.bvr();
      String str5 = this.qDX.qFr.bvt();
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", "devin: statreport");
      if (str2.length() > 0)
      {
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() > 0");
        i = this.qDX.qFr.mjF;
        l = this.qDX.qFr.mjG;
        i = this.qDX.qFr.qJm;
        String str6 = this.qDX.qFr.mzB;
        new l(str1, str2, str4, str3, str5).bvg();
        this.qDX.btI();
        reset();
        this.qDX.qFr.mjF = 0;
        GMTrace.o(5319585431552L, 39634);
        return 0;
      }
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() <= 0");
    }
  }
  
  public final int buZ()
  {
    GMTrace.i(5319719649280L, 39635);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipServiceEx", "hangUp,status:" + this.qDX.mStatus + " roomid:" + this.qDX.qFr.mjF + ",threadid = " + Thread.currentThread().getId());
    this.qDX.qFt.btZ();
    if (this.qDX.qFr.qKT.qGo == 1)
    {
      ??? = this.qDX.qFr.qKT;
      if (((h)???).qGF != 0L) {
        break label521;
      }
      ((h)???).qGy = 0;
    }
    for (;;)
    {
      if (((h)???).qGy < 0)
      {
        ((h)???).qGy = 0;
        com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.VoipDailReport", "devin:endTalk, iCallTime Err, rest 0");
      }
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.VoipDailReport", "devin:endTalk:" + ((h)???).qGy);
      synchronized (this.qIx)
      {
        int i = this.qDX.qFr.qKT.qGq;
        if ((this.qDX.qFr.mjF != 0) || (8 == i) || (9 == i) || (10 == i) || (11 == i) || (12 == i) || (99 == i))
        {
          this.qDX.qFs.buu();
          com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipServiceEx", "steve:hangUp, uninitGLRender before protocalUninit first!!");
          String str1 = this.qDX.qFr.iB(true);
          if (str1.length() > 0)
          {
            new i(this.qDX.qFr.mjF, this.qDX.qFr.mjG, str1).bvg();
            com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "devin: shutdown cgi ");
          }
          this.qDX.wf(this.qIy.bwd());
          str1 = v2protocal.bvp();
          String str2 = this.qDX.qFr.bvq();
          String str3 = this.qDX.qFr.bvs();
          String str4 = this.qDX.qFr.bvr();
          String str5 = this.qDX.qFr.bvt();
          if (str2.length() > 0)
          {
            i = this.qDX.qFr.mjF;
            long l = this.qDX.qFr.mjG;
            i = this.qDX.qFr.qJm;
            String str6 = this.qDX.qFr.mzB;
            new l(str1, str2, str4, str3, str5).bvg();
            com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "devin: statreport cgi ");
          }
          this.qDX.btI();
          reset();
          this.qDX.qFr.mjF = 0;
          com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", "hangUp over");
          GMTrace.o(5319719649280L, 39635);
          return 0;
          label521:
          ((h)???).qGy = ((int)((System.currentTimeMillis() - ((h)???).qGF) / 1000L));
          continue;
        }
        com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "call hangUp roomId == 0 ");
      }
    }
  }
  
  public final int bva()
  {
    GMTrace.i(5319853867008L, 39636);
    w.i("MicroMsg.Voip.VoipServiceEx", "ignoreInvite");
    if (!this.qDX.btM())
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to ignore with calling, status =" + this.qDX.mStatus);
      GMTrace.o(5319853867008L, 39636);
      return -1;
    }
    synchronized (this.qIx)
    {
      if (this.qDX.qFr.mjF == 0)
      {
        com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to reject with roomid = 0. ");
        GMTrace.o(5319853867008L, 39636);
        return -1;
      }
      int i = this.qDX.qFr.netType;
      int j = this.qDX.qFr.mjF;
      long l = this.qDX.qFr.mjG;
      new b(3, i, j, new byte[0], new byte[0], l, false, false).bvg();
      reset();
      this.qDX.qFr.mjF = 0;
      GMTrace.o(5319853867008L, 39636);
      return 0;
    }
  }
  
  public final void bvb()
  {
    GMTrace.i(5320122302464L, 39638);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipServiceEx", "devincdai: voip reset timecount");
    this.qIG.stopTimer();
    this.qIG.z(60000L, 60000L);
    GMTrace.o(5320122302464L, 39638);
  }
  
  protected final void finalize()
  {
    GMTrace.i(5318511689728L, 39626);
    stop();
    super.finalize();
    GMTrace.o(5318511689728L, 39626);
  }
  
  public final void r(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(5319182778368L, 39631);
    w.i("MicroMsg.Voip.VoipServiceEx", "onFinishVoIP finishType: " + paramInt1);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5319182778368L, 39631);
      return;
      buZ();
      this.qDX.qFs.onReject();
      GMTrace.o(5319182778368L, 39631);
      return;
      buZ();
      this.qDX.qFs.bur();
      GMTrace.o(5319182778368L, 39631);
      return;
      buZ();
      this.qDX.qFs.but();
      GMTrace.o(5319182778368L, 39631);
      return;
      buZ();
      this.qDX.qFs.onError(paramInt2, paramString);
    }
  }
  
  public final void reset()
  {
    GMTrace.i(5318645907456L, 39627);
    w.d("MicroMsg.Voip.VoipServiceEx", "reset");
    this.qDX.reset();
    this.qIJ.stopTimer();
    this.qIG.stopTimer();
    this.qII.stopTimer();
    this.qIK.stopTimer();
    if (this.qIE != null)
    {
      this.qIE.cancel();
      this.qIE = null;
    }
    this.qIz = 0;
    d.btG().qHD = null;
    GMTrace.o(5318645907456L, 39627);
  }
  
  public final int setNetSignalValue(int paramInt1, int paramInt2)
  {
    GMTrace.i(16564480901120L, 123415);
    paramInt1 = this.qDX.qFr.setNetSignalValue(paramInt1, paramInt2);
    GMTrace.o(16564480901120L, 123415);
    return paramInt1;
  }
  
  public final void stop()
  {
    GMTrace.i(5318377472000L, 39625);
    w.i("MicroMsg.Voip.VoipServiceEx", "stop");
    reset();
    this.qDX.a(null);
    GMTrace.o(5318377472000L, 39625);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */