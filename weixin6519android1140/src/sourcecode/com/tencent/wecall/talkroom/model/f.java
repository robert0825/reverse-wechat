package com.tencent.wecall.talkroom.model;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.mm.plugin.multi.talk.a;
import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.ab;
import com.tencent.pb.common.b.a.a.ac;
import com.tencent.pb.common.b.a.a.af;
import com.tencent.pb.common.b.a.a.ah;
import com.tencent.pb.common.b.a.a.aj;
import com.tencent.pb.common.b.a.a.ak;
import com.tencent.pb.common.b.a.a.as;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.au;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.b.a.a.ay;
import com.tencent.pb.common.b.a.a.o;
import com.tencent.pb.common.b.a.a.p;
import com.tencent.pb.common.b.a.a.q;
import com.tencent.pb.common.b.a.a.r;
import com.tencent.pb.common.b.a.a.x;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.wecall.talkroom.a.l;
import com.tencent.wecall.talkroom.a.m;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public final class f
  implements Handler.Callback, com.tencent.e.a.d, com.tencent.pb.common.b.b
{
  private static com.tencent.pb.talkroom.sdk.e xKI = null;
  public static String[] ykW = { "GLOBAL_TOPIC_NETWORK_CHANGE", "topic_bind_mobile_other" };
  public static List<Integer> yks = new ArrayList();
  private static int ykz = 30000;
  public String lTW;
  public Handler mHandler;
  public boolean mIsMute = false;
  public int mqe;
  public boolean mzT = false;
  boolean qHg = false;
  public int state = 0;
  int xKw;
  private com.tencent.e.a.a yjU;
  public boolean ykA = false;
  public boolean ykB = false;
  public String ykC;
  public long ykD;
  public int ykE = 0;
  public int ykF = 0;
  public int ykG = 0;
  private long ykH = 0L;
  private boolean ykI = true;
  public int ykJ = 0;
  public int ykK = -1;
  public h ykL = h.ylT;
  public b ykM;
  private talk.a ykN;
  private TimerTask ykO;
  TimerTask ykP;
  Timer ykQ = new Timer("TalkRoomService_HelloTimer");
  private TimerTask ykR;
  private Timer ykS = new Timer("TalkRoomService_talkDurationTimer");
  public g ykT = new g();
  private int ykU = 0;
  public boolean ykV = false;
  public String ykX = null;
  HashSet<Long> ykY = new HashSet();
  public boolean ykZ = false;
  f ykr;
  private Map<String, e> ykt = new HashMap();
  private final int yku = 1;
  private final int ykv = 2;
  private final int ykw = 3;
  private final int ykx = 4;
  public final int yky = 6;
  public boolean yla = true;
  public boolean ylb = true;
  private short[] ylc = null;
  private int[] yld = null;
  private short[] yle = null;
  private int[] ylf = null;
  private int ylg = 0;
  public boolean ylh = false;
  public boolean yli = true;
  private Runnable ylj = new Runnable()
  {
    public final void run()
    {
      if ((f.this.btN()) && (f.this.mzT))
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "finishtalk becos holdtimeout" });
        h.Go(63533);
        f.this.ykL.Gr(401);
        f.this.ac(f.this.lTW, 3, 108);
      }
    }
  };
  public com.tencent.pb.common.b.d ylk = null;
  public Runnable yll = new Runnable()
  {
    public final void run()
    {
      Object localObject2 = null;
      int i = f.this.state;
      if (f.this.ylk == null) {}
      for (Object localObject1 = null;; localObject1 = Integer.valueOf(f.this.ylk.getType()))
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "beginSenceCircle state: ", Integer.valueOf(i), " mCircleScene: ", localObject1, " mIsAck: ", Boolean.valueOf(f.this.ykA) });
        if (f.this.ylk != null) {
          break;
        }
        f.this.mHandler.removeCallbacks(f.this.yll);
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
        return;
      }
      if (!f.this.btN())
      {
        f.this.mHandler.removeCallbacks(f.this.yll);
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
        return;
      }
      localObject1 = localObject2;
      if (f.this.ylk != null)
      {
        localObject1 = localObject2;
        if (f.this.ylk.getType() == 202)
        {
          localObject1 = localObject2;
          if (f.this.state == 3)
          {
            com.tencent.wecall.talkroom.a.e locale = (com.tencent.wecall.talkroom.a.e)f.this.ylk;
            localObject1 = localObject2;
            if (f.this.b(locale.lTW, locale.mqe, locale.ykD, f.Gm(locale.ymv)))
            {
              localObject1 = new com.tencent.wecall.talkroom.a.e(locale);
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "beginSenceCircle enter" });
            }
          }
        }
      }
      if (localObject1 != null)
      {
        com.tencent.pb.common.b.e.cmC().a((com.tencent.pb.common.b.d)localObject1);
        return;
      }
      f.this.mHandler.removeCallbacks(f.this.yll);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
    }
  };
  
  public f()
  {
    com.tencent.pb.common.b.e.cmC().a(201, this);
    com.tencent.pb.common.b.e.cmC().a(202, this);
    com.tencent.pb.common.b.e.cmC().a(203, this);
    com.tencent.pb.common.b.e.cmC().a(204, this);
    com.tencent.pb.common.b.e.cmC().a(205, this);
    com.tencent.pb.common.b.e.cmC().a(206, this);
    com.tencent.pb.common.b.e.cmC().a(207, this);
    com.tencent.pb.common.b.e.cmC().a(208, this);
    com.tencent.pb.common.b.e.cmC().a(210, this);
    com.tencent.pb.common.b.e.cmC().a(209, this);
    com.tencent.pb.common.b.e.cmC().a(211, this);
    com.tencent.pb.common.b.e.cmC().a(212, this);
    com.tencent.pb.common.b.e.cmC().a(213, this);
    com.tencent.pb.common.b.e.cmC().a(214, this);
    com.tencent.pb.common.b.e.cmC().a(800, this);
    Object localObject = c.crn();
    g localg = this.ykT;
    Throwable localThrowable = new Throwable("trace caller");
    try
    {
      localThrowable.getStackTrace();
      ((c)localObject).ykj = localg;
      localObject = new HandlerThread("TalkRoomService");
      ((HandlerThread)localObject).start();
      this.mHandler = new Handler(((HandlerThread)localObject).getLooper(), this);
      if (this.yjU == null) {
        this.yjU = ((com.tencent.e.a.a)com.tencent.e.f.YN("EventCenter"));
      }
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "register", Boolean.valueOf(true) });
      this.yjU.a(this, ykW);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "setTalkServerCallback caller stack: ", localThrowable });
      }
    }
  }
  
  public static boolean Gm(int paramInt)
  {
    return paramInt != 1;
  }
  
  private void a(int paramInt1, int paramInt2, Object paramObject, com.tencent.wecall.talkroom.a.h paramh)
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRedirectResp", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt2 != 0) || (paramObject == null))
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleRedirectResp err", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (b(paramh.groupId, paramh.mjF, paramh.mjG, false)) {
        this.ykL.O(new String[] { "redirect", "resp", "-1", String.valueOf(this.state) });
      }
      return;
    }
    paramObject = (a.aj)paramObject;
    if (!b(((a.aj)paramObject).groupId, ((a.aj)paramObject).qGO, ((a.aj)paramObject).qGP, false))
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleRedirectResp roomid error", Integer.valueOf(((a.aj)paramObject).qGO), Integer.valueOf(this.mqe) });
      return;
    }
    this.ykL.O(new String[] { "redirect", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
    a(((a.aj)paramObject).groupId, null, this.xKw, ((a.aj)paramObject).qGO, ((a.aj)paramObject).qGP, ((a.aj)paramObject).xMu, ((a.aj)paramObject).xMw, ((a.aj)paramObject).xLe, false, false);
    paramh = new byte[((a.aj)paramObject).xMy.length];
    paramInt1 = 0;
    while (paramInt1 < ((a.aj)paramObject).xMy.length)
    {
      paramh[paramInt1] = ((byte)paramObject.xMy[paramInt1]);
      paramInt1 += 1;
    }
    a(((a.aj)paramObject).xMv, ((a.aj)paramObject).xMC, ((a.aj)paramObject).xMD);
    this.ykM.Close();
    a.av[] arrayOfav = ((a.aj)paramObject).xMu;
    a.as localas = ((a.aj)paramObject).xLJ;
    if ((((a.aj)paramObject).xMx & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      a(0, arrayOfav, localas, paramh, bool, ((a.aj)paramObject).groupId, ((a.aj)paramObject).qGO, ((a.aj)paramObject).qGP);
      return;
    }
  }
  
  private void a(int paramInt, a.aa paramaa, com.tencent.wecall.talkroom.a.e parame)
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd", parame.lTW, Integer.valueOf(parame.mqe), Long.valueOf(parame.ykD), " errCode: ", Integer.valueOf(paramInt), " state: ", Integer.valueOf(this.state) });
    Object localObject = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(14200), Integer.valueOf(64435), Integer.valueOf(14201), Integer.valueOf(64434), Integer.valueOf(14202), Integer.valueOf(64433), Integer.valueOf(14203), Integer.valueOf(64432), Integer.valueOf(14204), Integer.valueOf(64431), Integer.valueOf(14205), Integer.valueOf(64425) });
    if (((Map)localObject).containsKey(Integer.valueOf(paramInt))) {
      h.Gn(((Integer)((Map)localObject).get(Integer.valueOf(paramInt))).intValue());
    }
    if (paramInt == 14255)
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", Integer.valueOf(14255), paramaa.groupId, Integer.valueOf(paramaa.qGO), Long.valueOf(paramaa.qGP) });
      this.ykT.e(51281, paramaa);
      return;
    }
    if (paramInt == 14256)
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", Integer.valueOf(14256), paramaa.groupId, Integer.valueOf(paramaa.qGO), Long.valueOf(paramaa.qGP) });
      this.ykT.e(51280, paramaa);
      return;
    }
    if ((paramInt != 0) && (paramInt != 14204))
    {
      if (!b(parame.lTW, parame.mqe, parame.ykD, Gm(parame.ymv)))
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd isCurrentRoom is false errCode:", Integer.valueOf(paramInt), " enterScene.mGroupId: ", parame.lTW, " mGroupId: ", this.lTW, Integer.valueOf(parame.mqe), Integer.valueOf(this.mqe), Long.valueOf(parame.ykD), Long.valueOf(this.ykD) });
        return;
      }
      if (3 != this.state)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd state is error: ", Integer.valueOf(this.state), " errCode: ", Integer.valueOf(paramInt), parame.lTW, Integer.valueOf(parame.mqe), Long.valueOf(parame.ykD) });
        return;
      }
      this.ykL.O(new String[] { "enter", "resp", String.valueOf(paramInt), String.valueOf(this.state) });
      this.ykL.Gr(322);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom handleEnterTalkRoomEnd fail errCode: ", Integer.valueOf(paramInt), parame.lTW, Integer.valueOf(parame.mqe), Long.valueOf(parame.ykD) });
      a(parame.lTW, parame.mqe, parame.ykD, true);
      if (paramInt == 14251)
      {
        this.ykT.e(64536, null);
        return;
      }
      if (paramInt == 14252)
      {
        this.ykT.e(64336, null);
        return;
      }
      if (paramInt == 14253)
      {
        parame = Integer.valueOf(60);
        if (paramaa != null) {
          parame = Integer.valueOf(paramaa.xMA);
        }
        this.ykT.e(64036, parame);
        return;
      }
      this.ykT.e(65336, null);
      return;
    }
    if ((paramInt == 14204) && (this.state == 4))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode == EmRetCode.E_Talk_Enter_AlreadyEnter", paramaa.groupId, Integer.valueOf(paramaa.qGO), Long.valueOf(paramaa.qGP) });
      return;
    }
    if (!b(paramaa.groupId, paramaa.qGO, paramaa.qGP, Gm(paramaa.xLo)))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd isCurrentRoom is false,state: ", Integer.valueOf(this.state), " resp.groupId锟斤拷", paramaa.groupId, " mGroupId: ", this.lTW, Integer.valueOf(paramaa.qGO), Integer.valueOf(this.mqe), Long.valueOf(paramaa.qGP), Long.valueOf(this.ykD) });
      a(paramaa.groupId, paramaa.qGO, paramaa.qGP, 111, false);
      h.Gn(64426);
      return;
    }
    if (this.state != 3)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd state is error: ", Integer.valueOf(this.state), paramaa.groupId, Integer.valueOf(paramaa.qGO), Long.valueOf(paramaa.qGP) });
      return;
    }
    this.ykL.O(new String[] { "enter", "resp", String.valueOf(paramInt), String.valueOf(this.state) });
    if ((paramaa.xMv == null) || (paramaa.xMv.length == 0))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd resp.addrlist is null,errCode: ", Integer.valueOf(paramInt), paramaa.groupId, Integer.valueOf(paramaa.qGO), Long.valueOf(paramaa.qGP) });
      h.Gn(63931);
      this.ykL.qRu = 329;
      a(paramaa.groupId, paramaa.qGO, paramaa.qGP, 116, true);
      this.ykT.e(65336, null);
      return;
    }
    this.lTW = paramaa.groupId;
    this.ykX = paramaa.groupId;
    this.mqe = paramaa.qGO;
    this.ykD = paramaa.qGP;
    setState(4);
    a(paramaa.xMv, paramaa.xMC, paramaa.xMD);
    a(paramaa.groupId, null, this.xKw, paramaa.qGO, paramaa.qGP, paramaa.xMu, paramaa.xMw, paramaa.xLe, false, true);
    parame = this.ykT;
    localObject = new g.7(parame, c.crn().YW(paramaa.groupId));
    if (Looper.myLooper() == Looper.getMainLooper()) {
      ((Runnable)localObject).run();
    }
    for (;;)
    {
      parame = new byte[paramaa.xMy.length];
      paramInt = 0;
      while (paramInt < paramaa.xMy.length)
      {
        parame[paramInt] = ((byte)paramaa.xMy[paramInt]);
        paramInt += 1;
      }
      parame.handler.post((Runnable)localObject);
    }
    localObject = paramaa.xMu;
    a.as localas = paramaa.xLJ;
    if ((paramaa.xMx & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      a(0, (a.av[])localObject, localas, parame, bool, paramaa.groupId, paramaa.qGO, paramaa.qGP);
      if (paramaa.xMB != 0)
      {
        com.tencent.pb.common.c.c.j("TalkRoomService", new Object[] { "get helloFreqSeconds:" + paramaa.xMB });
        ykz = paramaa.xMB * 1000;
      }
      crB();
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange handleEnterTalkRoomEnd", this.lTW, Integer.valueOf(this.mqe), Long.valueOf(this.ykD) });
      return;
    }
  }
  
  private void a(int paramInt, a.ah paramah)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleGetGroupInfoBatch errCode: ", Integer.valueOf(paramInt) });
    if (paramInt != 0)
    {
      this.ykT.dl(null);
      return;
    }
    paramah = paramah.xMF;
    if ((paramah == null) || (paramah.length == 0))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleGetGroupInfoBatch resp.groupInfoList is null" });
      return;
    }
    ArrayList localArrayList = new ArrayList();
    int i = paramah.length;
    paramInt = 0;
    while (paramInt < i)
    {
      Object localObject = paramah[paramInt];
      if (localObject != null)
      {
        a(((a.au)localObject).groupId, null, 0, ((a.au)localObject).qGO, ((a.au)localObject).qGP, ((a.au)localObject).xMu, null, null, false, false);
        localArrayList.add(c.crn().YW(((a.au)localObject).groupId));
      }
      paramInt += 1;
    }
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleGetGroupInfoBatch multiTalkGrouplist size: ", Integer.valueOf(localArrayList.size()) });
    this.ykT.dl(localArrayList);
  }
  
  public static void a(com.tencent.pb.talkroom.sdk.e parame)
  {
    xKI = parame;
  }
  
  private void a(String paramString, int paramInt, long paramLong, boolean paramBoolean)
  {
    a(paramString, paramInt, paramLong, paramBoolean, true, true);
  }
  
  private void a(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong, a.av[] paramArrayOfav, a.aw[] paramArrayOfaw, a.at paramat, boolean paramBoolean1, boolean paramBoolean2)
  {
    c localc;
    Object localObject2;
    label66:
    boolean bool;
    if (paramArrayOfav == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "printMembersLog members is null groupId: ", paramString1, "  roomid: ", Integer.valueOf(paramInt2), "  roomKey", Long.valueOf(paramLong) });
      localc = c.crn();
      if (paramInt1 != 0) {
        break label690;
      }
      localObject2 = null;
      if ((this.lTW == null) || (!this.lTW.equals(paramString1))) {
        break label699;
      }
      bool = true;
      label87:
      com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup groupId: ", paramString1, " isActive: ", Boolean.valueOf(bool) });
      if (!TextUtils.isEmpty(paramString1)) {
        break label1281;
      }
    }
    label196:
    label451:
    label456:
    label690:
    label699:
    label792:
    label820:
    label1157:
    label1162:
    label1233:
    label1281:
    for (String str = paramString2;; str = paramString1)
    {
      if (TextUtils.isEmpty(str)) {
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newOrUpdateGroup invalid groupId" });
      }
      long l;
      Object localObject1;
      for (paramBoolean1 = false;; paramBoolean1 = false)
      {
        paramString2 = this.lTW;
        int i = this.mqe;
        l = this.ykD;
        bool = b(paramString1, paramInt2, paramLong, false);
        if (paramArrayOfav == null) {
          break label1157;
        }
        paramInt1 = paramArrayOfav.length;
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "engine handleVoiceGroupMemberChange", paramString1, paramString2, Integer.valueOf(paramInt2), Integer.valueOf(i), Long.valueOf(paramLong), Long.valueOf(l), Boolean.valueOf(paramBoolean1), " isCurrentRoom: ", Boolean.valueOf(bool), " members.length: ", Integer.valueOf(paramInt1), " isCallBackEngine: ", Boolean.valueOf(paramBoolean2), " mFirstGetAudioData: ", Boolean.valueOf(this.ykI) });
        if (c.crn().bl(this.lTW, false))
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange isGroupActive mFirstGetAudioData: ", Boolean.valueOf(this.ykI), " mGroupId: ", this.lTW, " roomId: ", Integer.valueOf(paramInt2) });
          if (this.ykI)
          {
            this.ykI = false;
            this.mzT = true;
            this.ykV = k.crM();
            this.ykG = this.ykE;
            if (this.ykR == null) {
              break label1162;
            }
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "refreashTalkingTime mTalkDurationTimerTask is null" });
          }
        }
        if (paramArrayOfav != null) {
          break label1233;
        }
        return;
        localObject1 = new StringBuffer();
        int j = paramArrayOfav.length;
        i = 0;
        while (i < j)
        {
          localObject2 = paramArrayOfav[i];
          if (localObject2 != null) {
            ((StringBuffer)localObject1).append(" memberId:" + ((a.av)localObject2).mkl + " uuid: " + ((a.av)localObject2).xMH + " status: " + ((a.av)localObject2).status + "   mem.inviteTime:" + ((a.av)localObject2).xNB + "  mem.reason: " + ((a.av)localObject2).eMw + "  mem.inviteuuid: " + ((a.av)localObject2).xNN + "\n");
          }
          i += 1;
        }
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "printMembersLog groupId: ", paramString1, "  romid: ", Integer.valueOf(paramInt2), "  roomKey", Long.valueOf(paramLong), "  members.length: ", Integer.valueOf(paramArrayOfav.length), "  ", ((StringBuffer)localObject1).toString() });
        break;
        localObject2 = Integer.valueOf(paramInt1);
        break label66;
        bool = false;
        break label87;
        if (j.Zd(paramString2)) {
          localc.yki.put(paramString2, str);
        }
        localObject1 = (TalkRoom)localc.ykh.get(str);
        if ((TextUtils.isEmpty(paramString2)) || (localObject1 == null) || (paramat == null) || (paramat.eIv == 100)) {
          break label792;
        }
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newOrUpdateGroup clientGroupId is not empty , room is not null" });
      }
      if (localObject1 == null) {
        if (j.Zd(paramString2))
        {
          localObject1 = (TalkRoom)localc.ykh.get(paramString2);
          localObject3 = localObject1;
          if (localObject1 != null) {
            localc.ykh.put(str, localObject1);
          }
        }
      }
      for (Object localObject3 = localObject1;; localObject3 = localObject1)
      {
        if ((localObject3 != null) && (bool))
        {
          paramInt1 = j.crK();
          l = j.crL();
          com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "check current active group roomId: ", Integer.valueOf(paramInt1), " and roomKey: ", Long.valueOf(paramLong) });
          if ((paramInt1 != 0) && (paramInt1 != paramInt2))
          {
            com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "diff roomId: ", Integer.valueOf(paramInt1), " -> ", Integer.valueOf(paramInt2) });
            paramBoolean1 = false;
            break;
          }
          if ((0L != l) && (l != paramLong))
          {
            com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "diff roomKey: ", Long.valueOf(l), " -> ", Long.valueOf(paramLong) });
            paramBoolean1 = false;
            break;
          }
        }
        if (localObject3 == null)
        {
          com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup create groupId: ", str });
          paramString2 = TalkRoom.a(str, paramString2, (Integer)localObject2, paramInt2, paramLong, paramat, paramArrayOfav, paramArrayOfaw);
          localc.ykh.put(str, paramString2);
        }
        for (;;)
        {
          if ((localc.ykj != null) && (paramBoolean1)) {
            localc.ykj.g(localc.YW(str));
          }
          c.cro();
          paramBoolean1 = true;
          break;
          com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup update groupId: ", str });
          TalkRoom.a((TalkRoom)localObject3, str, paramString2, (Integer)localObject2, paramInt2, paramLong, paramat, paramArrayOfav, paramArrayOfaw);
        }
        paramInt1 = 0;
        break label196;
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "refreashTalkingTime mTalkRoomTalkingCallBack: ", this.ykr, " mIsHoldOn: ", Boolean.valueOf(this.ylh) });
        this.ykR = new TimerTask()
        {
          public final void run()
          {
            if (!f.this.ylh)
            {
              f.this.ykE += 1;
              if (f.this.ykV) {
                f.this.ykG += 1;
              }
              if ((f.this.ykK == 3) || (f.this.ykK == 2))
              {
                f.this.ykF += 1;
                f.this.ykL.qRI = (f.this.ykF * 1000);
              }
              f.this.ykL.ylY = (f.this.ykE * 1000);
              f.this.ykL.qRH = f.this.ykL.ylY;
            }
            if (f.this.ykr != null)
            {
              f.f localf = f.this.ykr;
              boolean bool = f.this.ylh;
              int i = f.this.ykE;
            }
          }
        };
        this.ykS.scheduleAtFixedRate(this.ykR, 1000L, 1000L);
        break label451;
        if ((!paramBoolean2) || (!b(paramString1, paramInt2, paramLong, false)) || (paramArrayOfav.length <= 0) || (this.ykM == null)) {
          break label456;
        }
        a(paramArrayOfav);
        return;
        break label820;
      }
    }
  }
  
  private void a(a.av[] paramArrayOfav)
  {
    if (paramArrayOfav == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "onMebersChangedToEngine members is null" });
      return;
    }
    int[] arrayOfInt = new int[paramArrayOfav.length];
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramArrayOfav.length)
    {
      arrayOfInt[i] = paramArrayOfav[i].mkl;
      localStringBuffer.append(paramArrayOfav[i].mkl);
      localStringBuffer.append(",");
      i += 1;
    }
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "engine handleVoiceGroupMemberChange engine.OnMembersChanged memberid: ", localStringBuffer.toString() });
    if (this.ykM == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "onMebersChangedToEngine engine is null" });
      return;
    }
    this.ykM.OnMembersChanged(arrayOfInt);
  }
  
  private void a(a.o[] paramArrayOfo1, a.o[] paramArrayOfo2, int paramInt)
  {
    if (paramArrayOfo1 == null) {}
    for (int i = 0;; i = paramArrayOfo1.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRelayData addrs length: ", Integer.valueOf(i) });
      if ((paramArrayOfo1 != null) && (paramArrayOfo1.length > 0)) {
        break;
      }
      return;
    }
    this.yld = new int[paramArrayOfo1.length];
    this.ylc = new short[paramArrayOfo1.length];
    this.ylf = new int[paramArrayOfo2.length];
    this.yle = new short[paramArrayOfo2.length];
    this.ylg = paramInt;
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRelayData tcpStartTime: ", Integer.valueOf(this.ylg) });
    int j = paramArrayOfo1.length;
    paramInt = 0;
    i = 0;
    while (paramInt < j)
    {
      a.o localo = paramArrayOfo1[paramInt];
      this.yld[i] = localo.xLF;
      this.ylc[i] = ((short)localo.port);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRelayData ip: ", Integer.valueOf(localo.xLF), " addr.port: ", Integer.valueOf(localo.port) });
      i += 1;
      paramInt += 1;
    }
    j = paramArrayOfo2.length;
    paramInt = 0;
    i = 0;
    while (paramInt < j)
    {
      paramArrayOfo1 = paramArrayOfo2[paramInt];
      this.ylf[i] = paramArrayOfo1.xLF;
      this.yle[i] = ((short)paramArrayOfo1.port);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRelayData tcpIp: ", Integer.valueOf(paramArrayOfo1.xLF), " tcpAddr.port: ", Integer.valueOf(paramArrayOfo1.port) });
      i += 1;
      paramInt += 1;
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRelayData", Arrays.toString(this.yld), Arrays.toString(this.ylc), this.lTW, this.lTW, Integer.valueOf(this.mqe), Long.valueOf(this.ykD), Arrays.toString(this.ylf), Arrays.toString(this.yle), Integer.valueOf(this.ylg) });
  }
  
  private boolean a(a.av[] paramArrayOfav, a.as paramas, byte[] paramArrayOfByte, boolean paramBoolean, int paramInt, long paramLong)
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "connectToCompenent myRoomMemId roomid:", Integer.valueOf(paramInt), " roomKey: ", Long.valueOf(paramLong), " groupId: ", this.lTW, " ip: ", Arrays.toString(this.yld), " ports: ", Arrays.toString(this.ylc), " tcpIp: ", Arrays.toString(this.ylf), " tcpPorts: ", Arrays.toString(this.yle), " tcpStartTime: ", Integer.valueOf(this.ylg) });
    Object localObject2 = com.tencent.pb.b.a.a.cmY();
    int i = -1;
    Object localObject1;
    if ((paramArrayOfav != null) && (paramArrayOfav.length > 0))
    {
      localObject1 = new int[paramArrayOfav.length];
      j = 0;
      while (j < paramArrayOfav.length)
      {
        localObject1[j] = paramArrayOfav[j].mkl;
        if (com.tencent.pb.common.c.h.equals(paramArrayOfav[j].xMH, (String)localObject2)) {
          i = paramArrayOfav[j].mkl;
        }
        j += 1;
      }
      paramArrayOfav = (a.av[])localObject1;
    }
    for (int j = i;; j = -1)
    {
      int k = c.crn().YS(this.lTW);
      this.ykL.mkl = j;
      for (;;)
      {
        try
        {
          localObject2 = this.ykM;
          talk.a locala = this.ykN;
          localObject3 = c.crn();
          localObject1 = this.lTW;
          localObject3 = ((c)localObject3).YR((String)localObject1);
          if (localObject3 != null) {
            continue;
          }
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMyUuid TalkRoom is null  groupId: ", localObject1 });
          i = 0;
          localObject3 = this.yld;
          short[] arrayOfShort1 = this.ylc;
          int[] arrayOfInt = this.ylf;
          short[] arrayOfShort2 = this.yle;
          int m = this.ylg;
          com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "Open" });
          localObject1 = null;
          if (paramas == null) {
            continue;
          }
          paramas = new i(paramas.xMT, paramas.gBs, paramas.gBt, paramas.xMU, paramas.xMV, paramas.xMW, paramas.xMX, paramas.xMY, paramas.xMZ, paramas.xNa, paramas.xNb, paramas.xNc);
          int n = k.im(com.tencent.pb.common.c.d.qNP);
          paramInt = ((b)localObject2).yke.Open(locala, paramas, i, j, paramInt, paramLong, (int[])localObject3, arrayOfShort1, 0, paramArrayOfav, paramArrayOfByte, paramBoolean, n, arrayOfInt, arrayOfShort2, m);
        }
        catch (Throwable paramArrayOfav)
        {
          Object localObject3;
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "connectToCompenent", paramArrayOfav });
          paramInt = -99999;
          continue;
          paramArrayOfav.handler.post(paramas);
          continue;
        }
        paramArrayOfav = this.ykT;
        paramas = new g.2(paramArrayOfav, paramInt);
        if (Looper.myLooper() != Looper.getMainLooper()) {
          continue;
        }
        paramas.run();
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "connectToCompenent ret =", Integer.valueOf(paramInt), Integer.valueOf(j), Integer.valueOf(k) });
        if (paramInt < 0) {
          h.Gq(62534);
        }
        if (paramInt == 0) {
          this.ykL.qRx = 1;
        }
        if (paramInt != 0) {
          break label758;
        }
        return true;
        localObject3 = ((TalkRoom)localObject3).YQ(com.tencent.pb.b.a.a.cmY());
        if (localObject3 == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMyUuid talkRoomMember is null  groupId: ", localObject1 });
          i = 0;
        }
        else
        {
          localObject3 = ((d)localObject3).ykk;
          if (localObject3 == null)
          {
            com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMyUuid voiceGroupMem is null  groupId: ", localObject1 });
            i = 0;
          }
          else
          {
            com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getMyUuid groupId: ", localObject1, " uuid: ", Integer.valueOf(((a.av)localObject3).tLG) });
            i = ((a.av)localObject3).tLG;
            continue;
            com.tencent.pb.common.c.c.k("simon:TalkRoomContext", new Object[] { "voiceConf is null" });
            paramas = (a.as)localObject1;
          }
        }
      }
      label758:
      return false;
      paramArrayOfav = null;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, com.tencent.pb.talkroom.sdk.b paramb)
  {
    j = -100;
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = xKI;
      i = j;
      if (locale != null) {
        i = locale.a(paramInt1, paramInt2, paramb);
      }
    }
    catch (Exception paramb)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "startPlayer: ", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramb });
        int i = j;
      }
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "startPlayer samplerate: ", " frameDuration: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(i) });
    return i;
  }
  
  private static int b(int paramInt1, int paramInt2, com.tencent.pb.talkroom.sdk.c paramc)
  {
    j = -100;
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = xKI;
      i = j;
      if (locale != null) {
        i = locale.a(paramInt1, paramInt2, paramc);
      }
    }
    catch (Exception paramc)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "startRecord: ", paramc });
        int i = j;
      }
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "startRecord samplerate: ", " frameDuration: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(i) });
    return i;
  }
  
  private void b(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendEnterGroupScence groupId: ", paramString, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " enterType: ", Integer.valueOf(paramInt3), " isSenceCircle: ", Boolean.valueOf(true) });
    if ((paramInt1 == 0) || (paramLong == 0L))
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "roomId or roomkey is 0..return." });
      return;
    }
    h localh;
    if (!Gm(paramInt3))
    {
      localh = this.ykL;
      com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "endAnswerTime", Long.valueOf(localh.ymj) });
      if (localh.ymj != 0L) {
        break label231;
      }
    }
    label231:
    for (localh.mlb = 0L;; localh.mlb = (System.currentTimeMillis() - localh.ymj))
    {
      this.ykL.crI();
      paramString = new com.tencent.wecall.talkroom.a.e(paramString, paramInt1, paramLong, this.ykM.crl(), paramInt2, paramInt3);
      com.tencent.pb.common.b.e.cmC().a(paramString);
      this.mHandler.removeCallbacks(this.yll);
      this.ylk = paramString;
      this.mHandler.postDelayed(this.yll, 3000L);
      return;
    }
  }
  
  private void b(String paramString1, int paramInt, long paramLong, String paramString2)
  {
    this.mqe = paramInt;
    this.ykD = paramLong;
    this.lTW = paramString2;
    this.ykC = paramString1;
  }
  
  private void crB()
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "hello timer start~~" });
    if (this.ykO != null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "dealWithInit enter talkroom not first time" });
      return;
    }
    try
    {
      this.ykO = new TimerTask()
      {
        public final void run()
        {
          if ((f.this.mqe == 0) || (f.this.lTW == null))
          {
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "talkNoopTimer error: roomId %d, talkUsername %s", Integer.valueOf(f.this.mqe), f.this.lTW });
            f.this.crD();
          }
          f localf;
          m localm;
          do
          {
            return;
            localf = f.this;
            localm = f.this.crA();
          } while (localf.ykP != null);
          localf.ykP = new f.3(localf, localm);
          localf.ykQ.schedule(localf.ykP, 120000L);
        }
      };
      this.ykQ.schedule(this.ykO, 0L, ykz);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "startNooper: ", localException });
    }
  }
  
  private void crC()
  {
    try
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelHelloTimeOutTask" });
      if (this.ykP != null) {
        this.ykP.cancel();
      }
      this.ykP = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelHelloTimeOutTask: ", localException });
      }
    }
  }
  
  public static com.tencent.pb.talkroom.sdk.e crF()
  {
    return xKI;
  }
  
  private boolean cry()
  {
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = xKI;
      if (locale == null) {
        break label74;
      }
      this.ykL.qJP = locale.aQY();
      bool = locale.aQW();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "stopPlayer: ", localException });
        label74:
        boolean bool = false;
      }
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "stopPlayer ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  static String[] dm(List<String> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      String[] arrayOfString = new String[paramList.size()];
      paramList = paramList.iterator();
      int i = 0;
      while (paramList.hasNext())
      {
        arrayOfString[i] = ((String)paramList.next());
        i += 1;
      }
      return arrayOfString;
    }
    return new String[0];
  }
  
  private boolean du(String paramString, int paramInt)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelCreateTalkRoom clientGroupId: ", paramString });
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    com.tencent.wecall.talkroom.a.c localc = new com.tencent.wecall.talkroom.a.c(paramString, paramInt, this.xKw);
    boolean bool = com.tencent.pb.common.b.e.cmC().a(localc);
    this.ykL.O(new String[] { "cancel", "req", String.valueOf(bool), String.valueOf(this.state) });
    a(paramString, this.mqe, this.ykD, true);
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelCreateTalkRoom ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  private void i(String paramString, int paramInt, long paramLong)
  {
    Object localObject1 = null;
    for (;;)
    {
      Object localObject2;
      try
      {
        localObject2 = c.crn();
        if ((paramInt == 0) && (paramLong == 0L))
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId roomId and roomKey is 0,groupId: ", paramString });
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "addCallLog groupId: ", paramString, " mIsOutCall: ", Boolean.valueOf(this.qHg), " mTalkDuration: ", Integer.valueOf(this.ykE), " msgKey: ", localObject1 });
          return;
        }
        localObject2 = ((c)localObject2).YR(paramString);
        if (localObject2 == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId talkRoom is null,groupId: ", paramString });
          continue;
        }
        localObject2 = ((TalkRoom)localObject2).YQ(com.tencent.pb.b.a.a.cmY());
      }
      catch (Throwable paramString)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRoomExit: ", paramString });
        return;
      }
      if (localObject2 == null)
      {
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId talkRoomMember is null,groupId: ", paramString });
      }
      else
      {
        localObject2 = ((d)localObject2).ykk;
        if (localObject2 == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId voiceGroupMem is null,groupId: ", paramString });
        }
        else
        {
          localObject1 = new StringBuffer();
          ((StringBuffer)localObject1).append(paramString);
          ((StringBuffer)localObject1).append(",");
          ((StringBuffer)localObject1).append(paramInt);
          ((StringBuffer)localObject1).append(",");
          ((StringBuffer)localObject1).append(paramLong);
          ((StringBuffer)localObject1).append(",");
          ((StringBuffer)localObject1).append(((a.av)localObject2).xND);
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId msgKey is", ((StringBuffer)localObject1).toString() });
          localObject1 = ((StringBuffer)localObject1).toString();
        }
      }
    }
  }
  
  private boolean qn()
  {
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = xKI;
      if (locale == null) {
        break label74;
      }
      this.ykL.qJI = locale.aQZ();
      bool = locale.aQX();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "stopRecord: ", localException });
        label74:
        boolean bool = false;
      }
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "stopRecord ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  public static boolean sm()
  {
    try
    {
      bool = ((AudioManager)com.tencent.pb.common.c.d.qNP.getSystemService("audio")).isSpeakerphoneOn();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "isSpeakerOn ret: ", Boolean.valueOf(bool) });
      return bool;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "isSpeakerOn ", localException });
        boolean bool = false;
      }
    }
  }
  
  public final e YX(String paramString)
  {
    return (e)this.ykt.get(paramString);
  }
  
  public final boolean YY(String paramString)
  {
    return (e)this.ykt.get(paramString) != null;
  }
  
  public final b a(Activity paramActivity, String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "enterTalkRoom", paramString, Integer.valueOf(this.mqe), Integer.valueOf(paramInt1), Long.valueOf(this.ykD), Long.valueOf(paramLong), Integer.valueOf(paramInt3), "needConfirm", Boolean.valueOf(false) });
    if (!com.tencent.pb.b.a.a.cmZ())
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "enterTalkRoom isAuthed: ", Boolean.valueOf(com.tencent.pb.b.a.a.cmZ()), " isBindMobile: ", Boolean.valueOf(true) });
      h.a(paramString, "", this.mqe, this.ykD, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "noAuth" });
      return b.ylC;
    }
    com.tencent.pb.common.b.h.isNetworkConnected();
    if ((Gm(paramInt3)) && (paramInt3 != 100) && (btN()))
    {
      h.a(paramString, "", this.mqe, this.ykD, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "isBusy" });
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "enterTalkRoom isBusy" });
      return b.ylG;
    }
    boolean bool;
    if (paramInt3 == 100) {
      bool = true;
    }
    while (!bool)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom isValidEnterState is false enterType: ", Integer.valueOf(paramInt3), " state: ", Integer.valueOf(this.state) });
      h.a(paramString, "", this.mqe, this.ykD, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "isNotValidEnterState" });
      return b.ylH;
      if (Gm(paramInt3))
      {
        if (this.state == 0) {
          bool = true;
        } else {
          bool = false;
        }
      }
      else if (paramInt3 == 1) {
        bool = YY(paramString);
      } else {
        bool = false;
      }
    }
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom groupId is null" });
      h.a(paramString, "", this.mqe, this.ykD, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "groupIdnull" });
      return b.ylI;
    }
    if (Gm(paramInt3))
    {
      crz();
      nf(false);
    }
    crw();
    if (!bsv())
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom initEngine fail" });
      if (Gm(paramInt3))
      {
        h.a(paramString, "", this.mqe, this.ykD, new String[] { "enter", "req", "false", "initEnginefail" });
        nf(false);
      }
      for (;;)
      {
        return b.ylK;
        this.ykL.O(new String[] { "enter", "req", "false", "initEnginefail" });
      }
    }
    this.lTW = paramString;
    int i;
    long l;
    if (!Gm(paramInt3))
    {
      paramActivity = YX(paramString);
      if (paramActivity == null)
      {
        i = 0;
        this.mqe = i;
        if (paramActivity != null) {
          break label843;
        }
        l = 0L;
        label695:
        this.ykD = l;
        label701:
        this.ykX = paramString;
        this.xKw = paramInt2;
        setState(3);
        if (!Gm(paramInt3)) {
          break label866;
        }
        bool = true;
        label728:
        this.qHg = bool;
        if (this.qHg) {
          this.ykL.crH();
        }
        if ((!this.qHg) || (c.crn().bl(this.lTW, true))) {
          break label872;
        }
        paramActivity = new c();
        paramActivity.groupId = paramString;
        paramActivity.mjF = paramInt1;
        paramActivity.mjG = paramLong;
        paramActivity.xLo = paramInt3;
        paramActivity.xLh = paramInt2;
        paramString = Message.obtain();
        paramString.what = 3;
        paramString.obj = paramActivity;
        this.mHandler.sendMessageDelayed(paramString, 0L);
      }
    }
    for (;;)
    {
      return b.ylB;
      i = paramActivity.mjF;
      break;
      label843:
      l = paramActivity.mjG;
      break label695;
      this.mqe = paramInt1;
      this.ykD = paramLong;
      break label701;
      label866:
      bool = false;
      break label728;
      label872:
      b(paramString, this.mqe, this.ykD, paramInt2, paramInt3);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.pb.common.b.d paramd)
  {
    int i;
    if (paramd != null)
    {
      paramString = Integer.valueOf(paramd.getType());
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT onNetSceneEnd errCode:", Integer.valueOf(paramInt2), " errType: ", Integer.valueOf(paramInt1), " scene.getType(): ", paramString });
      if ((paramInt1 == 1) || (paramInt1 == 2))
      {
        paramString = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(201), Integer.valueOf(64532), Integer.valueOf(202), Integer.valueOf(64429), Integer.valueOf(203), Integer.valueOf(64331), Integer.valueOf(204), Integer.valueOf(64232), Integer.valueOf(205), Integer.valueOf(64133), Integer.valueOf(207), Integer.valueOf(64034), Integer.valueOf(209), Integer.valueOf(64024), Integer.valueOf(206), Integer.valueOf(64014), Integer.valueOf(208), Integer.valueOf(64004), Integer.valueOf(210), Integer.valueOf(63994) });
        i = paramd.getType();
        if (paramString.containsKey(Integer.valueOf(i))) {
          h.Gn(((Integer)paramString.get(Integer.valueOf(i))).intValue());
        }
      }
      if (paramInt2 != -1) {
        break label1043;
      }
    }
    label1043:
    label1332:
    label2000:
    label2258:
    label2699:
    label2901:
    label2907:
    label3166:
    label3168:
    label3726:
    label4031:
    label4042:
    label4205:
    label4248:
    label4263:
    label4631:
    label4644:
    label4666:
    label4765:
    label4866:
    label4933:
    for (;;)
    {
      try
      {
        if (paramd.getType() == 201)
        {
          paramString = (com.tencent.wecall.talkroom.a.d)paramd;
          if (com.tencent.pb.common.c.h.fw(this.ykC, paramString.ykC))
          {
            this.ykL.Gr(301);
            this.ykL.O(new String[] { "create", "resp", "-1", String.valueOf(this.state) });
            du(paramString.ykC, 1001);
            if (!paramString.ymu) {
              this.yjU.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
            }
            this.ykT.e(-100, null);
          }
          return;
          paramString = "";
          break;
        }
        if (paramd.getType() == 209)
        {
          paramString = (com.tencent.wecall.talkroom.a.g)paramd;
          this.ykT.dt(paramString.lTW, paramInt2);
          return;
        }
      }
      catch (Exception paramString)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelCreateTalkRoom: ", paramString });
        return;
      }
      if (paramd.getType() == 206)
      {
        paramString = (com.tencent.wecall.talkroom.a.a)paramd;
        if (!b(paramString.lTW, paramString.mqe, paramString.ykD, false)) {
          h.a(paramString.lTW, paramString.mqe, paramString.ykD, new String[] { "ack", "resp", "-1", String.valueOf(this.state) });
        }
        this.ykT.a(paramString.ymt, c.crn().YW(paramString.lTW));
        return;
      }
      if (paramd.getType() == 204)
      {
        paramString = (com.tencent.wecall.talkroom.a.b)paramd;
        if (b(paramString.lTW, paramString.mqe, paramString.ykD, false))
        {
          this.ykL.O(new String[] { "add", "resp", "-1", String.valueOf(this.state) });
          this.ykT.e(65236, null);
        }
      }
      else if (paramd.getType() == 202)
      {
        paramString = (com.tencent.wecall.talkroom.a.e)paramd;
        if ((b(paramString.lTW, paramString.mqe, paramString.ykD, Gm(paramString.ymv))) && (this.state == 3))
        {
          this.ykL.Gr(302);
          this.ykT.e(65336, null);
        }
      }
      else
      {
        if (paramd.getType() == 212)
        {
          this.ykT.dl(null);
          return;
        }
        if (paramd.getType() == 213)
        {
          if (com.tencent.pb.common.c.h.equals(((com.tencent.wecall.talkroom.a.j)paramd).lTW, this.lTW))
          {
            this.ykL.O(new String[] { "sendmsg", "resp", "-1", String.valueOf(this.state) });
            this.ykT.e(64836, null);
          }
        }
        else if (paramd.getType() == 211)
        {
          paramString = (com.tencent.wecall.talkroom.a.h)paramd;
          if (b(paramString.groupId, paramString.mjF, paramString.mjG, false)) {
            this.ykL.O(new String[] { "redirect", "resp", "-1", String.valueOf(this.state) });
          }
        }
        else if (paramd.getType() == 214)
        {
          paramString = (l)paramd;
          if (b(paramString.lTW, paramString.mqe, paramString.ykD, false)) {
            this.ykT.e(64736, null);
          }
        }
        else if (paramd.getType() == 800)
        {
          paramString = (com.tencent.wecall.talkroom.a.k)paramd;
          if (b(paramString.lTW, paramString.mqe, paramString.ykD, false))
          {
            this.ykT.e(63936, null);
            return;
            Object localObject1;
            Object localObject2;
            if (paramd.getType() == 201)
            {
              localObject1 = (com.tencent.wecall.talkroom.a.d)paramd;
              if ((localObject1 != null) && (((com.tencent.pb.common.b.d)localObject1).xKu != null))
              {
                paramString = (a.z)((com.tencent.pb.common.b.d)localObject1).xKu;
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd errCode: ", Integer.valueOf(paramInt2), Integer.valueOf(((com.tencent.wecall.talkroom.a.d)localObject1).mType), ((com.tencent.wecall.talkroom.a.d)localObject1).ykC });
                if (((com.tencent.wecall.talkroom.a.d)localObject1).ymu) {
                  break label2901;
                }
                i = 1;
                localObject2 = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(14000), Integer.valueOf(64535), Integer.valueOf(14001), Integer.valueOf(64534), Integer.valueOf(14002), Integer.valueOf(64527) });
                if (((Map)localObject2).containsKey(Integer.valueOf(paramInt2))) {
                  h.Gn(((Integer)((Map)localObject2).get(Integer.valueOf(paramInt2))).intValue());
                }
                if (paramInt2 != 14002)
                {
                  yks = null;
                  if (paramInt2 == 0) {
                    break label3168;
                  }
                  if (com.tencent.pb.common.c.h.fw(this.ykC, ((com.tencent.wecall.talkroom.a.d)localObject1).ykC)) {
                    break label2907;
                  }
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd mClientGroupId is not same mClientGroupId: ", this.ykC, " createScene.mClientGroupId: ", ((com.tencent.wecall.talkroom.a.d)localObject1).ykC, " errCode: ", Integer.valueOf(paramInt2) });
                  if (i != 0) {
                    this.yjU.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                  }
                }
              }
            }
            if (paramd.getType() == 202)
            {
              paramString = (com.tencent.wecall.talkroom.a.e)paramd;
              if ((paramString != null) && (paramString.xKu != null)) {
                a(paramInt2, (a.aa)paramString.xKu, paramString);
              }
            }
            if (paramd.getType() == 204)
            {
              paramString = (com.tencent.wecall.talkroom.a.b)paramd;
              if ((paramString != null) && (paramString.xKu != null))
              {
                localObject1 = (a.x)paramString.xKu;
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd", this.lTW, Integer.valueOf(this.mqe), Long.valueOf(this.ykD), " errCode: ", Integer.valueOf(paramInt2) });
                localObject2 = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(14600), Integer.valueOf(64235), Integer.valueOf(14601), Integer.valueOf(64234), Integer.valueOf(14602), Integer.valueOf(64233) });
                if (((Map)localObject2).containsKey(Integer.valueOf(paramInt2))) {
                  h.Gn(((Integer)((Map)localObject2).get(Integer.valueOf(paramInt2))).intValue());
                }
                if (paramInt2 == 0) {
                  break label4031;
                }
                if (b(paramString.lTW, paramString.mqe, paramString.ykD, false))
                {
                  this.ykL.O(new String[] { "add", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                  this.ykT.e(65236, null);
                }
              }
            }
            if (paramd.getType() == 203)
            {
              paramString = (com.tencent.wecall.talkroom.a.f)paramd;
              if ((paramString != null) && (paramString.xKu != null))
              {
                com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleExitVoiceRoomEnd", ((a.ab)paramString.xKu).groupId, this.lTW, Integer.valueOf(this.mqe), Long.valueOf(this.ykD), " errCode: ", Integer.valueOf(paramInt2) });
                paramString = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(14400), Integer.valueOf(64335), Integer.valueOf(14401), Integer.valueOf(64334), Integer.valueOf(14402), Integer.valueOf(64333), Integer.valueOf(14403), Integer.valueOf(64332) });
                if (paramString.containsKey(Integer.valueOf(paramInt2))) {
                  h.Gn(((Integer)paramString.get(Integer.valueOf(paramInt2))).intValue());
                }
                if (paramInt2 != 0) {
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleExitVoiceRoomEnd fail errCode is ", Integer.valueOf(paramInt2) });
                }
              }
            }
            if (paramd.getType() == 205)
            {
              paramString = (m)paramd;
              if ((paramString != null) && (paramString.xKu != null))
              {
                com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleHelloEnd", ((a.ak)paramString.xKu).groupId, this.lTW, Integer.valueOf(this.mqe), Long.valueOf(this.ykD), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
                crC();
                i = 0;
                if (paramInt2 != 14800) {
                  break label4248;
                }
                i = 64135;
                if (i != 0)
                {
                  this.ykL.Gr(324);
                  h.Gn(i);
                }
              }
            }
            if (paramd.getType() == 206)
            {
              paramString = (com.tencent.wecall.talkroom.a.a)paramd;
              if ((paramString != null) && (paramString.xKu != null))
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd errCode is ", Integer.valueOf(paramInt2), " groupId: ", paramString.lTW, " roomid: ", Integer.valueOf(paramString.mqe), " roomKey: ", Long.valueOf(paramString.ykD) });
                if (paramInt2 != 18950) {
                  break label4263;
                }
                if (!b(paramString.lTW, paramString.mqe, paramString.ykD, false)) {
                  h.a(paramString.lTW, paramString.mqe, paramString.ykD, new String[] { "ack", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                }
                localObject1 = c.crn().YW(paramString.lTW);
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd onMisscMultiTalk mGroupId:", paramString.lTW, " multiTalkGroup: ", localObject1 });
                if (localObject1 != null) {
                  this.ykT.a(paramString.ymt, (MultiTalkGroup)localObject1);
                }
              }
            }
            if (paramd.getType() == 207)
            {
              paramString = (com.tencent.wecall.talkroom.a.i)paramd;
              if ((paramString != null) && (paramString.xKu != null))
              {
                if (paramInt2 == 18100) {
                  h.Gn(64035);
                }
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRejectEnd  errCode is ", Integer.valueOf(paramInt2) });
              }
            }
            if (paramd.getType() == 208)
            {
              paramString = (com.tencent.wecall.talkroom.a.c)paramd;
              if ((paramString != null) && (paramString.xKu != null))
              {
                if (paramInt2 == 18300) {
                  h.Gn(64005);
                }
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCancelCreateEnd errCode is ", Integer.valueOf(paramInt2) });
              }
            }
            if (paramd.getType() == 209)
            {
              localObject1 = (com.tencent.wecall.talkroom.a.g)paramd;
              if ((localObject1 != null) && (((com.tencent.pb.common.b.d)localObject1).xKu != null))
              {
                paramString = (a.ac)((com.tencent.pb.common.b.d)localObject1).xKu;
                if (paramInt2 == 17900) {
                  h.Gn(64025);
                }
                if (paramInt2 == 0) {
                  break label4666;
                }
                this.ykT.dt(((com.tencent.wecall.talkroom.a.g)localObject1).lTW, paramInt2);
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleNetSceneModifyVoiceGroupEnd fail errCode is ", Integer.valueOf(paramInt2) });
              }
            }
            if (paramd.getType() == 210)
            {
              com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "talkHoldonResp", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
              if (paramInt2 == 19100) {
                h.Gn(63995);
              }
            }
            if (paramd.getType() == 211)
            {
              paramString = (com.tencent.wecall.talkroom.a.h)paramd;
              if (paramString != null) {
                a(paramInt1, paramInt2, paramd.xKu, paramString);
              }
            }
            if (paramd.getType() == 212) {
              a(paramInt2, (a.ah)paramd.xKu);
            }
            if (paramd.getType() == 213)
            {
              paramString = (com.tencent.wecall.talkroom.a.j)paramd;
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleSendMsg errCode: ", Integer.valueOf(paramInt2) });
              if (paramInt2 == 0) {
                break label4765;
              }
              if (com.tencent.pb.common.c.h.equals(paramString.lTW, this.lTW))
              {
                this.ykL.O(new String[] { "sendmsg", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                this.ykT.e(64836, null);
              }
            }
            if (paramd.getType() == 214)
            {
              paramString = (a.af)paramd.xKu;
              localObject1 = (l)paramd;
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleSwitchVideoGroup errCode: ", Integer.valueOf(paramInt2) });
              if (b(((l)localObject1).lTW, ((l)localObject1).mqe, ((l)localObject1).ykD, false)) {
                break label4866;
              }
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleSwitchVideoGroup isCurrentRoom is not same", ((l)localObject1).lTW, Integer.valueOf(((l)localObject1).mqe) });
            }
            for (;;)
            {
              if (paramd.getType() != 800) {
                break label4933;
              }
              paramString = (com.tencent.wecall.talkroom.a.k)paramd;
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleSubscribeLargeVideo errCode: ", Integer.valueOf(paramInt2) });
              if (b(paramString.lTW, paramString.mqe, paramString.ykD, false)) {
                break label4935;
              }
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleSubscribeLargeVideo isCurrentRoom is not same", paramString.lTW, Integer.valueOf(paramString.mqe) });
              return;
              i = 0;
              break;
              if (paramInt2 != -1)
              {
                this.ykL.Gr(321);
                this.ykL.O(new String[] { "create", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
              }
              if (this.state != 1)
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd state is error: ", Integer.valueOf(this.state), "  errCode: ", Integer.valueOf(paramInt2), ((com.tencent.wecall.talkroom.a.d)localObject1).ykC });
                if (i == 0) {
                  break label1332;
                }
                this.yjU.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                break label1332;
              }
              a(this.lTW, this.mqe, this.ykD, true);
              if (paramInt2 == 14051) {
                this.ykT.e(64636, null);
              }
              for (;;)
              {
                if (i == 0) {
                  break label3166;
                }
                this.yjU.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                break;
                if (paramInt2 == 14052) {
                  this.ykT.e(64436, null);
                } else if (paramInt2 == 14053) {
                  this.ykT.e(64236, paramString);
                } else if (paramInt2 == 14504) {
                  this.ykT.e(64136, null);
                } else {
                  this.ykT.e(-100, null);
                }
              }
              break label1332;
              if (!com.tencent.pb.common.c.h.fw(this.ykC, paramString.xLc))
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd mClientGroupId is not same mClientGroupId: ", this.ykC, " resp.clientGroupId: ", paramString.xLc, Integer.valueOf(paramString.qGO), Long.valueOf(paramString.qGP) });
                a(paramString.groupId, paramString.qGO, paramString.qGP, 110, false);
                if (i == 0) {
                  break label1332;
                }
                this.yjU.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                break label1332;
              }
              this.ykL.O(new String[] { "create", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
              if (this.state != 1)
              {
                h.Gn(64533);
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd state != STATE_CREATING_TAKLROOM: ", Integer.valueOf(this.state), paramString.xLc, Integer.valueOf(paramString.qGO), Long.valueOf(paramString.qGP) });
                if (i == 0) {
                  break label1332;
                }
                this.yjU.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                break label1332;
              }
              if ((paramString.xMv == null) || (paramString.xMv.length == 0))
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd resp.addrlist is null,errCode: ", Integer.valueOf(paramInt2), paramString.xLc, Integer.valueOf(paramString.qGO), Long.valueOf(paramString.qGP) });
                h.Gn(63931);
                this.ykL.qRu = 329;
                a(paramString.groupId, paramString.qGO, paramString.qGP, 116, true);
                if (i != 0) {
                  this.yjU.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                }
                this.ykT.e(-100, null);
                break label1332;
              }
              b(paramString.xLc, paramString.qGO, paramString.qGP, paramString.groupId);
              this.ykX = paramString.groupId;
              this.xKw = paramString.xLh;
              setState(4);
              a(paramString.xMv, paramString.xMC, paramString.xMD);
              a(paramString.groupId, paramString.xLc, paramString.xLh, paramString.qGO, paramString.qGP, paramString.xLI, paramString.xMw, paramString.xLe, false, true);
              if (this.ykT != null)
              {
                localObject1 = this.ykT;
                localObject2 = new g.6((g)localObject1, c.crn().YW(paramString.groupId));
                if (Looper.myLooper() != Looper.getMainLooper()) {
                  break label3726;
                }
                ((Runnable)localObject2).run();
              }
              for (;;)
              {
                localObject1 = new byte[paramString.xMy.length];
                int j = 0;
                while (j < paramString.xMy.length)
                {
                  localObject1[j] = ((byte)paramString.xMy[j]);
                  j += 1;
                }
                ((g)localObject1).handler.post((Runnable)localObject2);
              }
              localObject2 = paramString.xLI;
              a.as localas = paramString.xLJ;
              if ((paramString.xMx & 0x2) != 0) {}
              for (boolean bool = true;; bool = false)
              {
                a(0, (a.av[])localObject2, localas, (byte[])localObject1, bool, paramString.groupId, paramString.qGO, paramString.qGP);
                if (paramString.xMB != 0)
                {
                  com.tencent.pb.common.c.c.j("TalkRoomService", new Object[] { "get helloFreqSeconds:" + paramString.xMB });
                  ykz = paramString.xMB * 1000;
                }
                crB();
                i(paramString.groupId, paramString.qGO, paramString.qGP);
                if (i != 0)
                {
                  localObject1 = new HashMap();
                  ((Map)localObject1).put("result", Boolean.valueOf(true));
                  ((Map)localObject1).put("shareUrl", new String(paramString.xLe.xNg, Charset.forName("utf-8")));
                  ((Map)localObject1).put("smsShortUrl", new String(paramString.xLe.xNh, Charset.forName("utf-8")));
                  ((Map)localObject1).put("groupId", paramString.groupId);
                  this.yjU.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, localObject1);
                }
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd", this.lTW, Integer.valueOf(this.mqe), Long.valueOf(this.ykD) });
                break;
              }
              if (((a.x)localObject1).xMu == null)
              {
                i = 0;
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd  resp.members length: ", Integer.valueOf(i) });
                if (b(((a.x)localObject1).groupId, ((a.x)localObject1).qGO, ((a.x)localObject1).qGP, false)) {
                  break label4205;
                }
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd isCurrentRoom false resp.groupId: ", ((a.x)localObject1).groupId, this.lTW, " resp.roomid: ", Integer.valueOf(((a.x)localObject1).qGO), Integer.valueOf(this.mqe) });
                h.Gn(64228);
              }
              for (;;)
              {
                a(((a.x)localObject1).groupId, null, this.xKw, ((a.x)localObject1).qGO, ((a.x)localObject1).qGP, ((a.x)localObject1).xMu, null, ((a.x)localObject1).xLe, true, true);
                break;
                i = ((a.x)localObject1).xMu.length;
                break label4042;
                this.ykL.O(new String[] { "add", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
              }
              if (paramInt2 != 14801) {
                break label2000;
              }
              i = 64134;
              break label2000;
              if (paramInt2 == 0) {
                this.ykA = true;
              }
              if (!btN())
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd is working groupId: ", paramString.lTW });
                crz();
                nf(false);
                this.ykL.O(new String[] { "ack", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                this.qHg = false;
                this.lTW = paramString.lTW;
                this.ykX = this.lTW;
                this.mqe = paramString.mqe;
                this.ykD = paramString.ykD;
                this.xKw = paramString.xKw;
                setState(2);
                this.ykH = System.currentTimeMillis();
                localObject1 = this.ykL;
                com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "beginNotifyTime" });
                ((h)localObject1).ymj = System.currentTimeMillis();
                if (paramInt2 == 18900) {
                  h.Gn(64015);
                }
              }
              while (!com.tencent.pb.common.c.h.equals(paramString.lTW, this.lTW))
              {
                localObject1 = new e();
                ((e)localObject1).groupId = paramString.lTW;
                ((e)localObject1).mjF = paramString.mqe;
                ((e)localObject1).mjG = paramString.ykD;
                this.ykt.put(paramString.lTW, localObject1);
                localObject1 = c.crn().YW(paramString.lTW);
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd onInviteMultiTalk mGroupId:", paramString.lTW, " multiTalkGroup: ", localObject1 });
                if (localObject1 == null) {
                  break label4644;
                }
                paramString = this.ykT;
                localObject1 = new g.20(paramString, (MultiTalkGroup)localObject1);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                  break label4631;
                }
                ((Runnable)localObject1).run();
                break;
              }
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd groupid same return ", this.lTW });
              break label2258;
              paramString.handler.post((Runnable)localObject1);
              break label2258;
              a(paramString.lTW, paramString.mqe, paramString.ykD, false, false, false);
              break label2258;
              localObject1 = c.crn().YR(paramString.groupId);
              if (localObject1 != null)
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange handleModifyVoiceGroupEnd" });
                a(paramString.groupId, null, ((TalkRoom)localObject1).cre(), TalkRoom.crf(), TalkRoom.buL(), null, null, paramString.xLe, true, false);
              }
              for (;;)
              {
                this.ykT.dt(paramString.groupId, 0);
                break;
                a(paramString.groupId, null, 0, 0, 0L, null, null, paramString.xLe, true, false);
              }
              if (!com.tencent.pb.common.c.h.equals(paramString.lTW, this.lTW)) {
                break label2699;
              }
              this.ykL.O(new String[] { "sendmsg", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
              paramString = this.ykT;
              localObject1 = new g.18(paramString);
              if (Looper.myLooper() == Looper.getMainLooper())
              {
                ((Runnable)localObject1).run();
                break label2699;
              }
              paramString.handler.post((Runnable)localObject1);
              break label2699;
              if (paramInt2 == 0)
              {
                localObject1 = this.ykT;
                paramString = new g.15((g)localObject1, paramString.bitRate);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                  paramString.run();
                } else {
                  ((g)localObject1).handler.post(paramString);
                }
              }
              else
              {
                this.ykT.e(64736, null);
              }
            }
          }
        }
      }
    }
    label4935:
    if (paramInt2 == 0)
    {
      paramString = this.ykT;
      paramd = new g.16(paramString);
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        paramd.run();
        return;
      }
      paramString.handler.post(paramd);
      return;
    }
    this.ykT.e(63936, null);
  }
  
  public final void a(final int paramInt1, final a.av[] paramArrayOfav, final a.as paramas, final byte[] paramArrayOfByte, final boolean paramBoolean, final String paramString, final int paramInt2, final long paramLong)
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "dealWithInit", Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2), Long.valueOf(paramLong), Integer.valueOf(this.state) });
    if (this.ykM != null) {
      for (;;)
      {
        try
        {
          if (this.state != 4)
          {
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "dealWithInit state is error: ", Integer.valueOf(this.state) });
            bool = false;
          }
        }
        catch (Exception localException1)
        {
          boolean bool = false;
        }
        try
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "dealWithInit ret: ", Boolean.valueOf(bool) });
          if (!bool) {
            break;
          }
          return;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        bool = a(paramArrayOfav, paramas, paramArrayOfByte, paramBoolean, paramInt2, paramLong);
        continue;
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "dealWithInit ", localException1 });
      }
    }
    if (paramInt1 <= 0)
    {
      this.ykL.Gr(202);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom dealWithInit fail" });
      a(paramString, paramInt2, paramLong, 102, true);
      this.ykT.e(65136, null);
      return;
    }
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        f.this.a(paramInt1 - 1, paramArrayOfav, paramas, paramArrayOfByte, paramBoolean, paramString, paramInt2, paramLong);
      }
    }, 50L);
  }
  
  public final void a(String paramString, int paramInt, long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "closeVoiceGroup groupId: ", paramString, " mGroupId: ", this.lTW, " roomId: ", Integer.valueOf(paramInt), " mRoomId: ", Integer.valueOf(this.mqe), " roomKey: ", Long.valueOf(paramLong), " mRoomKey: ", Long.valueOf(this.ykD) });
    Object localObject1 = c.crn();
    for (;;)
    {
      try
      {
        localObject1 = ((c)localObject1).YR(paramString);
        if (localObject1 != null) {
          continue;
        }
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "handleRoomExit assert failed: current TalkRoom MUST exists" });
      }
      catch (Throwable localThrowable)
      {
        Object localObject2;
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "handleRoomExit: ", localThrowable });
        continue;
        String str = localThrowable.xOx;
        continue;
        str.handler.post((Runnable)localObject2);
        continue;
      }
      if (paramBoolean1) {
        i(paramString, paramInt, paramLong);
      }
      this.ykt.remove(paramString);
      if (b(paramString, paramInt, paramLong, false))
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "closeVoiceGroup isCurrentRoom groupId: ", paramString, " roomId: ", Integer.valueOf(paramInt), " roomKey: ", Long.valueOf(paramLong) });
        nf(true);
        localObject1 = this.ykT;
        localObject2 = new g.8((g)localObject1, paramString, paramBoolean2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
          continue;
        }
        ((Runnable)localObject2).run();
      }
      if (paramBoolean3)
      {
        paramString = c.crn().YW(paramString);
        if (paramString != null) {
          this.ykT.g(paramString);
        }
      }
      return;
      localObject2 = ((TalkRoom)localObject1).YQ(com.tencent.pb.b.a.a.cmY());
      if (localObject2 != null)
      {
        ((d)localObject2).ykk.status = 20;
        ((d)localObject2).ykk.mkl = -1;
      }
      if (((TalkRoom)localObject1).xOx != null) {
        continue;
      }
      localObject1 = "";
      com.tencent.pb.common.c.c.d("tagorewang:TalkRoom", new Object[] { "resetRoomTempInfo groupId: ", localObject1 });
      c.cro();
    }
  }
  
  public final boolean a(String paramString, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "exitTalkRoom: has exited" });
      return false;
    }
    com.tencent.wecall.talkroom.a.f localf = new com.tencent.wecall.talkroom.a.f(paramString, paramInt1, paramLong, paramInt2);
    boolean bool = com.tencent.pb.common.b.e.cmC().a(localf);
    this.ykL.O(new String[] { "exit", "req", String.valueOf(bool), String.valueOf(this.state) });
    a(paramString, paramInt1, paramLong, paramBoolean);
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  final void aIH()
  {
    qn();
    int i = b(talk.nlR, talk.nlS, new com.tencent.pb.talkroom.sdk.c()
    {
      public final void C(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        try
        {
          if (!f.this.ykB) {
            return;
          }
          if (f.this.mIsMute)
          {
            int i = 0;
            while (i < paramAnonymousArrayOfByte.length)
            {
              paramAnonymousArrayOfByte[i] = 0;
              i += 1;
            }
          }
          if (f.this.ykB)
          {
            b localb = f.this.ykM;
            short s = (short)paramAnonymousInt;
            if (com.tencent.pb.common.a.a.xJW) {
              localb.yke.SendAudio(paramAnonymousArrayOfByte, s, 0);
            }
            if (f.this.yla)
            {
              f.this.yla = false;
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "onRecPcmDataCallBack len: ", Integer.valueOf(paramAnonymousInt) });
              return;
            }
          }
        }
        catch (Exception paramAnonymousArrayOfByte)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "initMediaComponent record", paramAnonymousArrayOfByte });
        }
      }
    });
    if (i <= 0)
    {
      this.ykL.Gr(101);
      h.Go(63535);
      this.ykT.e(65036, null);
    }
    h localh;
    if (i > 0) {
      localh = this.ykL;
    }
    for (localh.ylU &= 0xFFFFFFFE;; localh.ylU |= 0x1)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "audioAdapter startRecord ret: ", Integer.valueOf(i) });
      return;
      localh = this.ykL;
    }
  }
  
  public final boolean ac(String paramString, int paramInt1, int paramInt2)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "finishCurrentTalk groupId: ", paramString, " rejectReason: ", Integer.valueOf(paramInt1), " exitReason: ", Integer.valueOf(paramInt2) });
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    if ((paramInt1 == 1) || (paramInt2 == 100))
    {
      localObject = this.ykL;
      com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "endCancelCreate", Long.valueOf(System.currentTimeMillis() - ((h)localObject).ymh), Long.valueOf(((h)localObject).ylW) });
      if (((h)localObject).ylW <= 0L)
      {
        ((h)localObject).qRB = 1;
        if (((h)localObject).ymh != 0L) {
          break label195;
        }
      }
    }
    int i;
    long l;
    int j;
    label195:
    for (((h)localObject).qRC = 0L;; ((h)localObject).qRC = (System.currentTimeMillis() - ((h)localObject).ymh))
    {
      i = this.mqe;
      l = this.ykD;
      j = a.crb().state;
      if (!j.Zd(paramString)) {
        break;
      }
      this.ykL.Gr(327);
      return a.crb().du(paramString, 1000);
    }
    if (j == 2) {
      return a.crb().b(paramString, i, l, paramInt1);
    }
    Object localObject = new ArrayList();
    paramInt1 = 0;
    while (paramInt1 < 7)
    {
      ((List)localObject).add(new Integer[] { Integer.valueOf(102), Integer.valueOf(103), Integer.valueOf(104), Integer.valueOf(105), Integer.valueOf(106), Integer.valueOf(107), Integer.valueOf(108) }[paramInt1]);
      paramInt1 += 1;
    }
    ((List)localObject).contains(Integer.valueOf(paramInt2));
    return a.crb().a(paramString, i, l, paramInt2, true);
  }
  
  public final boolean b(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "rejectTalkRoom groupId: ", paramString, " mGroupId: ", this.lTW, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " reason: ", Integer.valueOf(paramInt2) });
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    int i;
    boolean bool;
    if (1 == paramInt2)
    {
      i = 1;
      if ((3 == i) && (paramInt2 != 7) && (this.ykH != 0L)) {
        System.currentTimeMillis();
      }
      com.tencent.wecall.talkroom.a.i locali = new com.tencent.wecall.talkroom.a.i(paramString, paramInt1, paramLong, paramInt2);
      bool = com.tencent.pb.common.b.e.cmC().a(locali);
      if (!b(paramString, paramInt1, paramLong, false)) {
        break label239;
      }
      this.ykL.O(new String[] { "reject", "req", String.valueOf(bool), String.valueOf(this.state) });
    }
    for (;;)
    {
      a(paramString, paramInt1, paramLong, false);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "rejectTalkRoom ret: ", Boolean.valueOf(bool) });
      return bool;
      i = 3;
      break;
      label239:
      h.a(paramString, paramInt1, paramLong, new String[] { "reject", "req", String.valueOf(bool), String.valueOf(this.state) });
    }
  }
  
  public final boolean b(String paramString, int paramInt, long paramLong, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = com.tencent.pb.common.c.h.fw(paramString, this.lTW);
    }
    do
    {
      return paramBoolean;
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "isCurrentRoom groupId: ", paramString, " mGroupId: ", this.lTW, "roomId: ", Integer.valueOf(paramInt), " mRoomId: ", Integer.valueOf(this.mqe), " roomKey: ", Long.valueOf(paramLong), " mRoomKey: ", Long.valueOf(this.ykD) });
      if ((!com.tencent.pb.common.c.h.fw(paramString, this.lTW)) || (paramInt != this.mqe)) {
        break;
      }
      paramBoolean = bool;
    } while (paramLong == this.ykD);
    return false;
  }
  
  public final int bM(byte[] paramArrayOfByte)
  {
    long l;
    int i;
    try
    {
      paramArrayOfByte = (a.p)com.google.a.a.e.a(new a.p(), paramArrayOfByte, paramArrayOfByte.length);
      if (paramArrayOfByte == null) {
        if ((!TextUtils.isEmpty(this.lTW)) || (!TextUtils.isEmpty(this.ykC)))
        {
          this.ykL.O(new String[] { "notify", "pasrefail" });
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange groupChg null" });
          return -2;
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;)
      {
        h.Gn(63935);
        paramArrayOfByte = null;
        continue;
        h.a(this.mqe, this.ykD, new String[] { "notify", "pasrefail" });
      }
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange", this.lTW, Integer.valueOf(this.mqe), Long.valueOf(this.ykD), Long.valueOf(paramArrayOfByte.eDr), Integer.valueOf(paramArrayOfByte.xLG) });
      l = paramArrayOfByte.eDr;
      if (this.ykY.contains(Long.valueOf(l)))
      {
        i = 1;
        if (i == 0) {
          break label350;
        }
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange isMsgDouble error" });
        if (!b(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, false)) {
          break label306;
        }
        this.ykL.O(new String[] { "notify", "repeat", String.valueOf(paramArrayOfByte.xLG) });
      }
      for (;;)
      {
        return -3;
        this.ykY.add(Long.valueOf(l));
        i = 0;
        break;
        label306:
        h.a(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, new String[] { "notify", "repeat", String.valueOf(paramArrayOfByte.xLG) });
      }
      label350:
      if (b(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, false)) {
        this.ykL.O(new String[] { "notify", "succ", String.valueOf(paramArrayOfByte.xLG) });
      }
      if (paramArrayOfByte.xLG == 4) {
        break label419;
      }
    }
    if (paramArrayOfByte.xLG == 2) {
      label419:
      a(paramArrayOfByte.groupId, null, paramArrayOfByte.xLh, paramArrayOfByte.qGO, paramArrayOfByte.qGP, paramArrayOfByte.xLI, paramArrayOfByte.xLH, paramArrayOfByte.xLe, true, true);
    }
    for (;;)
    {
      return 0;
      if (paramArrayOfByte.xLG == 16)
      {
        a(paramArrayOfByte.groupId, null, paramArrayOfByte.xLh, paramArrayOfByte.qGO, paramArrayOfByte.qGP, paramArrayOfByte.xLI, paramArrayOfByte.xLH, paramArrayOfByte.xLe, true, false);
      }
      else
      {
        Object localObject1;
        int j;
        if (paramArrayOfByte.xLG == 1)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroupChange groupChg.groupId: ", paramArrayOfByte.groupId, " roomId: ", Integer.valueOf(paramArrayOfByte.qGO), " roomkey: ", Long.valueOf(paramArrayOfByte.qGP) });
          if (!com.tencent.pb.b.a.a.cmZ())
          {
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handlerCreateGroupChange isAuthed is false" });
          }
          else if ((btN()) && (com.tencent.pb.common.c.h.equals(paramArrayOfByte.groupId, this.lTW)))
          {
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handlerCreateGroupChange return is same groupId: ", this.lTW });
          }
          else
          {
            a(paramArrayOfByte.groupId, null, paramArrayOfByte.xLh, paramArrayOfByte.qGO, paramArrayOfByte.qGP, paramArrayOfByte.xLI, paramArrayOfByte.xLH, paramArrayOfByte.xLe, false, true);
            localObject1 = paramArrayOfByte.groupId;
            i = paramArrayOfByte.qGO;
            l = paramArrayOfByte.qGP;
            j = paramArrayOfByte.xLh;
            int k = paramArrayOfByte.xLK;
            if (TextUtils.isEmpty((CharSequence)localObject1)) {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT ackTalkRoom groupId is null" });
            }
            for (;;)
            {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroupChange start ui" });
              break;
              paramArrayOfByte = new com.tencent.wecall.talkroom.a.a((String)localObject1, i, l, j, k);
              com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT ackTalkRoom groupId: ", localObject1, Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(k), Boolean.valueOf(com.tencent.pb.common.b.e.cmC().a(paramArrayOfByte)) });
            }
          }
        }
        else if (paramArrayOfByte.xLG == 8)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCancelCreateVoiceGroupChange groupChg.groupId: ", paramArrayOfByte.groupId, " mGroupId: ", this.lTW });
          if (b(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, false))
          {
            a(paramArrayOfByte.groupId, null, paramArrayOfByte.xLh, paramArrayOfByte.qGO, paramArrayOfByte.qGP, paramArrayOfByte.xLI, paramArrayOfByte.xLH, paramArrayOfByte.xLe, true, false);
            a(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, false, false, true);
          }
          else
          {
            a(paramArrayOfByte.groupId, null, paramArrayOfByte.xLh, paramArrayOfByte.qGO, paramArrayOfByte.qGP, paramArrayOfByte.xLI, paramArrayOfByte.xLH, paramArrayOfByte.xLe, true, false);
          }
        }
        else
        {
          String str;
          if (paramArrayOfByte.xLG == 128)
          {
            localObject1 = paramArrayOfByte.groupId;
            str = this.lTW;
            if (paramArrayOfByte.xLL == null) {}
            for (i = 0;; i = paramArrayOfByte.xLL.length)
            {
              com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleMemberWhisper groupChg.groupChg.groupId: ", localObject1, " mGroupId: ", str, " groupChg.whisperBuf size: ", Integer.valueOf(i) });
              localObject1 = this.ykT;
              paramArrayOfByte = new g.17((g)localObject1, paramArrayOfByte.groupId, paramArrayOfByte.xLL);
              if (Looper.myLooper() != Looper.getMainLooper()) {
                break label1110;
              }
              paramArrayOfByte.run();
              break;
            }
            label1110:
            ((g)localObject1).handler.post(paramArrayOfByte);
          }
          else
          {
            Object localObject2;
            if (paramArrayOfByte.xLG == 256)
            {
              if (!b(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, false)) {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember is not same room ", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.qGO) });
              } else if (paramArrayOfByte.xLL == null) {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember whisperBuf is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.qGO) });
              } else {
                try
                {
                  localObject1 = paramArrayOfByte.xLL;
                  localObject1 = (a.r)com.google.a.a.e.a(new a.r(), (byte[])localObject1, localObject1.length);
                  if ((localObject1 == null) || (((a.r)localObject1).xLP == null)) {
                    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember notify is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.qGO) });
                  }
                }
                catch (com.google.a.a.d locald1)
                {
                  for (;;)
                  {
                    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember ", locald1 });
                    localObject2 = null;
                  }
                  paramArrayOfByte = new ArrayList();
                  localObject2 = ((a.r)localObject2).xLP;
                  j = localObject2.length;
                  i = 0;
                  while (i < j)
                  {
                    str = localObject2[i];
                    if (str != null) {
                      paramArrayOfByte.add(str);
                    }
                    i += 1;
                  }
                  com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleVideoMember groupid: ", this.lTW, " roomId: ", Integer.valueOf(this.mqe), " videoUserNames: ", paramArrayOfByte });
                  localObject2 = this.ykT;
                  paramArrayOfByte = new g.11((g)localObject2, paramArrayOfByte);
                  if (Looper.myLooper() == Looper.getMainLooper())
                  {
                    paramArrayOfByte.run();
                    continue;
                  }
                  ((g)localObject2).handler.post(paramArrayOfByte);
                }
              }
            }
            else if (paramArrayOfByte.xLG == 1024)
            {
              if (!b(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, false))
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleOtherDevice is not same room ", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.qGO) });
              }
              else if ((this.state != 3) && (this.state != 4))
              {
                b(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, 1);
                this.ykT.e(64136, null);
              }
            }
            else if (paramArrayOfByte.xLG == 512) {
              if (!b(paramArrayOfByte.groupId, paramArrayOfByte.qGO, paramArrayOfByte.qGP, false)) {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoSubscribes is not same room ", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.qGO) });
              } else if (paramArrayOfByte.xLL == null) {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoSubscribes whisperBuf is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.qGO) });
              } else {
                try
                {
                  localObject2 = paramArrayOfByte.xLL;
                  localObject2 = (a.q)com.google.a.a.e.a(new a.q(), (byte[])localObject2, localObject2.length);
                  if (localObject2 == null) {
                    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember notify is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.qGO) });
                  }
                }
                catch (com.google.a.a.d locald2)
                {
                  for (;;)
                  {
                    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoSubscribes ", locald2 });
                    local1 = null;
                  }
                  paramArrayOfByte = this.ykT;
                  g.1 local1 = new g.1(paramArrayOfByte, local1.xLO);
                  if (Looper.myLooper() == Looper.getMainLooper()) {
                    local1.run();
                  } else {
                    paramArrayOfByte.handler.post(local1);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  final boolean bsv()
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "initEngine", this.lTW, Integer.valueOf(this.mqe), Long.valueOf(this.ykD), Integer.valueOf(this.state) });
    try
    {
      localb = this.ykM;
      boolean bool = com.tencent.pb.common.a.a.xJW;
      if (bool) {
        break label119;
      }
      i = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        b localb;
        label119:
        String str;
        com.tencent.pb.talkroom.sdk.e locale;
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "initEngine", localException });
        i = -99999;
        continue;
        i = localException.yke.field_capInfo.length;
      }
    }
    if (i < 0)
    {
      h.Gq(62535);
      this.ykL.Gr(201);
      this.ykM = null;
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "initEngine engine.protocalInit error", Integer.valueOf(i) });
      return false;
      str = com.tencent.pb.common.c.d.qNP.getDir("lib", 0).getAbsolutePath();
      locale = xKI;
      if (locale == null) {
        break label338;
      }
    }
    label338:
    for (int i = locale.sK();; i = 0)
    {
      int j = k.im(com.tencent.pb.common.c.d.qNP);
      com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "protocalInit netType:", Integer.valueOf(j), " cpuFlag:", Integer.valueOf(i), "libPath:", str });
      j = localb.yke.init(j, i, str + "/");
      if (localb.yke.field_capInfo == null)
      {
        i = 0;
        com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "protocalInit", Integer.valueOf(j), "field_capInfo length: ", Integer.valueOf(i) });
        i = j;
        break;
      }
      return true;
    }
  }
  
  public final boolean btN()
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "state: ", Integer.valueOf(this.state) });
    return this.state != 0;
  }
  
  public final m crA()
  {
    if (TextUtils.isEmpty(this.lTW))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "doHelloVoiceRoom mGroupId is null" });
      return null;
    }
    int i = c.crn().YS(this.lTW);
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "doHelloVoiceRoom mGroupId: ", this.lTW, " mRoomId: ", Integer.valueOf(this.mqe), " mRoomKey: ", Long.valueOf(this.ykD), " selfMemberId: ", Integer.valueOf(i), " mCallData: ", Integer.valueOf(this.ykJ) });
    m localm = new m(this.lTW, this.mqe, this.ykD, i, this.ykJ);
    com.tencent.pb.common.b.e.cmC().a(localm);
    return localm;
  }
  
  public final void crD()
  {
    try
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelHelloTimerTask" });
      if (this.ykO != null) {
        this.ykO.cancel();
      }
      this.ykO = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelHelloTimerTask: ", localException });
      }
    }
  }
  
  final void crE()
  {
    cry();
    final Object localObject = new AtomicInteger();
    final AtomicInteger localAtomicInteger = new AtomicInteger();
    int i = b(talk.nlR, talk.nlS, new com.tencent.pb.talkroom.sdk.b()
    {
      public final int B(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        if (!f.this.ykB) {
          return 0;
        }
        try
        {
          b localb = f.this.ykM;
          int i = (short)paramAnonymousInt;
          AtomicInteger localAtomicInteger1 = localObject;
          AtomicInteger localAtomicInteger2 = localAtomicInteger;
          if (!com.tencent.pb.common.a.a.xJW) {}
          for (i = 1; (f.this.ylb) && (i >= 0); i = localb.yke.GetAudioData(paramAnonymousArrayOfByte, i, localAtomicInteger1, localAtomicInteger2))
          {
            f.this.ylb = false;
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "onPlayPcmDataCallBack len: ", Integer.valueOf(paramAnonymousInt), " ret: ", Integer.valueOf(i) });
            break;
          }
          return i;
        }
        catch (Exception paramAnonymousArrayOfByte)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "initMediaComponent play", paramAnonymousArrayOfByte });
          return -1;
        }
      }
    });
    if (i <= 0)
    {
      this.ykL.Gr(101);
      h.Go(63535);
      localObject = this.ykL;
      ((h)localObject).ylU |= 0x1;
      this.ykT.e(65036, null);
    }
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "audioAdapter startPlayer ret: ", Integer.valueOf(i) });
  }
  
  final boolean crw()
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "initService" });
    com.tencent.pb.talkroom.sdk.e locale = xKI;
    if (locale != null) {
      locale.aQU();
    }
    this.ykM = new b();
    this.ykX = this.lTW;
    this.ykN = new talk.a()
    {
      public final void keep_OnError(int paramAnonymousInt)
      {
        int j = 207;
        int i = 62529;
        int k = 103;
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          h.Gq(i);
          f.this.ykL.Gr(j);
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "engine exitTalkRoom engineCallback OnError:", Integer.valueOf(paramAnonymousInt) });
          f.this.a(f.this.lTW, f.this.mqe, f.this.ykD, k, true);
          f.this.ykT.e(65136, null);
          return;
          j = 203;
          i = 62533;
          k = 112;
          continue;
          j = 204;
          i = 62532;
          k = 113;
          continue;
          j = 205;
          i = 62531;
          k = 114;
          continue;
          j = 206;
          i = 62530;
          k = 115;
        }
      }
      
      public final void keep_OnNotify(int paramAnonymousInt)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "keep_OnNotify eventCode: ", Integer.valueOf(paramAnonymousInt) });
        h localh;
        if (paramAnonymousInt == 5)
        {
          f.this.ykL.ylV = 1;
          localh = f.this.ykL;
          if (localh.ymi != 0L) {
            break label111;
          }
        }
        label111:
        for (localh.ylW = 0L;; localh.ylW = (System.currentTimeMillis() - localh.ymi))
        {
          com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "endRecvFirstPcm", Long.valueOf(localh.ymi), Long.valueOf(localh.ylW) });
          f.this.ykJ = 1;
          f.this.crA();
          return;
        }
      }
      
      /* Error */
      public final void keep_OnOpenSuccess()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   4: getfield 32	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
        //   7: iconst_1
        //   8: putfield 121	com/tencent/wecall/talkroom/model/h:mlc	I
        //   11: ldc 37
        //   13: iconst_1
        //   14: anewarray 4	java/lang/Object
        //   17: dup
        //   18: iconst_0
        //   19: ldc 123
        //   21: aastore
        //   22: invokestatic 51	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   25: aload_0
        //   26: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   29: getfield 126	com/tencent/wecall/talkroom/model/f:state	I
        //   32: iconst_4
        //   33: if_icmpeq +31 -> 64
        //   36: ldc 37
        //   38: iconst_2
        //   39: anewarray 4	java/lang/Object
        //   42: dup
        //   43: iconst_0
        //   44: ldc -128
        //   46: aastore
        //   47: dup
        //   48: iconst_1
        //   49: aload_0
        //   50: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   53: getfield 126	com/tencent/wecall/talkroom/model/f:state	I
        //   56: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   59: aastore
        //   60: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   63: return
        //   64: aload_0
        //   65: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   68: astore 5
        //   70: invokestatic 134	com/tencent/wecall/talkroom/model/c:crn	()Lcom/tencent/wecall/talkroom/model/c;
        //   73: astore 4
        //   75: aload_0
        //   76: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   79: getfield 55	com/tencent/wecall/talkroom/model/f:lTW	Ljava/lang/String;
        //   82: astore 6
        //   84: aload 6
        //   86: invokestatic 140	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
        //   89: ifeq +352 -> 441
        //   92: aconst_null
        //   93: astore 4
        //   95: aload 4
        //   97: ifnonnull +491 -> 588
        //   100: ldc 37
        //   102: iconst_1
        //   103: anewarray 4	java/lang/Object
        //   106: dup
        //   107: iconst_0
        //   108: ldc -114
        //   110: aastore
        //   111: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   114: aload_0
        //   115: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   118: getfield 146	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
        //   121: ifnull +38 -> 159
        //   124: aload_0
        //   125: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   128: getfield 146	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
        //   131: astore 4
        //   133: invokestatic 149	com/tencent/wecall/talkroom/model/f:sm	()Z
        //   136: istore_3
        //   137: getstatic 155	com/tencent/pb/common/a/a:xJW	Z
        //   140: ifeq +19 -> 159
        //   143: iload_3
        //   144: ifeq +519 -> 663
        //   147: aload 4
        //   149: getfield 161	com/tencent/wecall/talkroom/model/b:yke	Lcom/tencent/mm/plugin/multi/talk;
        //   152: sipush 401
        //   155: invokevirtual 167	com/tencent/mm/plugin/multi/talk:qZ	(I)I
        //   158: pop
        //   159: aload_0
        //   160: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   163: iconst_1
        //   164: putfield 170	com/tencent/wecall/talkroom/model/f:ykB	Z
        //   167: aload_0
        //   168: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   171: getfield 146	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
        //   174: astore 4
        //   176: invokestatic 174	com/tencent/wecall/talkroom/model/f:crF	()Lcom/tencent/pb/talkroom/sdk/e;
        //   179: astore 4
        //   181: aload 4
        //   183: ifnull +11 -> 194
        //   186: aload 4
        //   188: invokeinterface 180 1 0
        //   193: pop
        //   194: aload_0
        //   195: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   198: getfield 146	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
        //   201: getfield 161	com/tencent/wecall/talkroom/model/b:yke	Lcom/tencent/mm/plugin/multi/talk;
        //   204: astore 6
        //   206: getstatic 155	com/tencent/pb/common/a/a:xJW	Z
        //   209: ifeq +83 -> 292
        //   212: new 182	java/util/concurrent/atomic/AtomicInteger
        //   215: dup
        //   216: invokespecial 183	java/util/concurrent/atomic/AtomicInteger:<init>	()V
        //   219: astore 4
        //   221: new 182	java/util/concurrent/atomic/AtomicInteger
        //   224: dup
        //   225: invokespecial 183	java/util/concurrent/atomic/AtomicInteger:<init>	()V
        //   228: astore 5
        //   230: aload 6
        //   232: aload 4
        //   234: aload 5
        //   236: invokevirtual 187	com/tencent/mm/plugin/multi/talk:getSampleRate	(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;)I
        //   239: pop
        //   240: aload 4
        //   242: invokevirtual 190	java/util/concurrent/atomic/AtomicInteger:get	()I
        //   245: istore_1
        //   246: aload 5
        //   248: invokevirtual 190	java/util/concurrent/atomic/AtomicInteger:get	()I
        //   251: istore_2
        //   252: iload_1
        //   253: putstatic 193	com/tencent/mm/plugin/multi/talk:nlR	I
        //   256: iload_2
        //   257: putstatic 196	com/tencent/mm/plugin/multi/talk:nlS	I
        //   260: ldc -58
        //   262: iconst_3
        //   263: anewarray 4	java/lang/Object
        //   266: dup
        //   267: iconst_0
        //   268: ldc -56
        //   270: aastore
        //   271: dup
        //   272: iconst_1
        //   273: getstatic 193	com/tencent/mm/plugin/multi/talk:nlR	I
        //   276: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   279: aastore
        //   280: dup
        //   281: iconst_2
        //   282: getstatic 196	com/tencent/mm/plugin/multi/talk:nlS	I
        //   285: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   288: aastore
        //   289: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   292: aload_0
        //   293: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   296: astore 4
        //   298: aload 4
        //   300: getfield 146	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
        //   303: ifnonnull +400 -> 703
        //   306: ldc 37
        //   308: iconst_1
        //   309: anewarray 4	java/lang/Object
        //   312: dup
        //   313: iconst_0
        //   314: ldc -54
        //   316: aastore
        //   317: invokestatic 204	com/tencent/pb/common/c/c:e	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   320: aload_0
        //   321: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   324: getfield 32	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
        //   327: astore 4
        //   329: aload 4
        //   331: getfield 89	com/tencent/wecall/talkroom/model/h:ymi	J
        //   334: lconst_0
        //   335: lcmp
        //   336: ifne +430 -> 766
        //   339: aload 4
        //   341: lconst_0
        //   342: putfield 207	com/tencent/wecall/talkroom/model/h:ylX	J
        //   345: getstatic 95	com/tencent/wecall/talkroom/model/h:TAG	Ljava/lang/String;
        //   348: iconst_3
        //   349: anewarray 4	java/lang/Object
        //   352: dup
        //   353: iconst_0
        //   354: ldc -47
        //   356: aastore
        //   357: dup
        //   358: iconst_1
        //   359: aload 4
        //   361: getfield 207	com/tencent/wecall/talkroom/model/h:ylX	J
        //   364: invokestatic 102	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   367: aastore
        //   368: dup
        //   369: iconst_2
        //   370: aload 4
        //   372: getfield 89	com/tencent/wecall/talkroom/model/h:ymi	J
        //   375: invokestatic 102	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   378: aastore
        //   379: invokestatic 51	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   382: aload_0
        //   383: getfield 17	com/tencent/wecall/talkroom/model/f$1:ylm	Lcom/tencent/wecall/talkroom/model/f;
        //   386: getfield 71	com/tencent/wecall/talkroom/model/f:ykT	Lcom/tencent/wecall/talkroom/model/g;
        //   389: astore 4
        //   391: new 211	com/tencent/wecall/talkroom/model/g$3
        //   394: dup
        //   395: aload 4
        //   397: invokespecial 214	com/tencent/wecall/talkroom/model/g$3:<init>	(Lcom/tencent/wecall/talkroom/model/g;)V
        //   400: astore 5
        //   402: invokestatic 220	android/os/Looper:myLooper	()Landroid/os/Looper;
        //   405: invokestatic 223	android/os/Looper:getMainLooper	()Landroid/os/Looper;
        //   408: if_acmpne +375 -> 783
        //   411: aload 5
        //   413: invokeinterface 228 1 0
        //   418: return
        //   419: astore 4
        //   421: ldc 37
        //   423: iconst_2
        //   424: anewarray 4	java/lang/Object
        //   427: dup
        //   428: iconst_0
        //   429: ldc -26
        //   431: aastore
        //   432: dup
        //   433: iconst_1
        //   434: aload 4
        //   436: aastore
        //   437: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   440: return
        //   441: aload 4
        //   443: aload 6
        //   445: invokevirtual 234	com/tencent/wecall/talkroom/model/c:YR	(Ljava/lang/String;)Lcom/tencent/wecall/talkroom/model/TalkRoom;
        //   448: astore 4
        //   450: aload 4
        //   452: ifnonnull +9 -> 461
        //   455: aconst_null
        //   456: astore 4
        //   458: goto -363 -> 95
        //   461: aload 4
        //   463: invokevirtual 240	com/tencent/wecall/talkroom/model/TalkRoom:crh	()Ljava/util/List;
        //   466: astore 6
        //   468: aload 6
        //   470: ifnonnull +9 -> 479
        //   473: aconst_null
        //   474: astore 4
        //   476: goto -381 -> 95
        //   479: aload 6
        //   481: invokeinterface 245 1 0
        //   486: newarray <illegal type>
        //   488: astore 4
        //   490: new 247	java/lang/StringBuffer
        //   493: dup
        //   494: invokespecial 248	java/lang/StringBuffer:<init>	()V
        //   497: astore 7
        //   499: iconst_0
        //   500: istore_1
        //   501: iload_1
        //   502: aload 6
        //   504: invokeinterface 245 1 0
        //   509: if_icmpge +52 -> 561
        //   512: aload 6
        //   514: iload_1
        //   515: invokeinterface 251 2 0
        //   520: checkcast 253	com/tencent/wecall/talkroom/model/d
        //   523: astore 8
        //   525: aload 8
        //   527: ifnull +268 -> 795
        //   530: aload 4
        //   532: iload_1
        //   533: aload 8
        //   535: invokevirtual 256	com/tencent/wecall/talkroom/model/d:crq	()I
        //   538: iastore
        //   539: aload 7
        //   541: aload 4
        //   543: iload_1
        //   544: iaload
        //   545: invokevirtual 260	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
        //   548: pop
        //   549: aload 7
        //   551: ldc_w 262
        //   554: invokevirtual 265	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   557: pop
        //   558: goto +237 -> 795
        //   561: ldc_w 267
        //   564: iconst_2
        //   565: anewarray 4	java/lang/Object
        //   568: dup
        //   569: iconst_0
        //   570: ldc_w 269
        //   573: aastore
        //   574: dup
        //   575: iconst_1
        //   576: aload 7
        //   578: invokevirtual 273	java/lang/StringBuffer:toString	()Ljava/lang/String;
        //   581: aastore
        //   582: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   585: goto -490 -> 95
        //   588: aload 4
        //   590: ifnonnull +53 -> 643
        //   593: iconst_0
        //   594: istore_1
        //   595: ldc 37
        //   597: iconst_2
        //   598: anewarray 4	java/lang/Object
        //   601: dup
        //   602: iconst_0
        //   603: ldc_w 275
        //   606: aastore
        //   607: dup
        //   608: iconst_1
        //   609: iload_1
        //   610: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   613: aastore
        //   614: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   617: aload 5
        //   619: getfield 146	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
        //   622: ifnonnull +28 -> 650
        //   625: ldc 37
        //   627: iconst_1
        //   628: anewarray 4	java/lang/Object
        //   631: dup
        //   632: iconst_0
        //   633: ldc_w 277
        //   636: aastore
        //   637: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   640: goto -526 -> 114
        //   643: aload 4
        //   645: arraylength
        //   646: istore_1
        //   647: goto -52 -> 595
        //   650: aload 5
        //   652: getfield 146	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
        //   655: aload 4
        //   657: invokevirtual 281	com/tencent/wecall/talkroom/model/b:OnMembersChanged	([I)V
        //   660: goto -546 -> 114
        //   663: aload 4
        //   665: getfield 161	com/tencent/wecall/talkroom/model/b:yke	Lcom/tencent/mm/plugin/multi/talk;
        //   668: sipush 402
        //   671: invokevirtual 167	com/tencent/mm/plugin/multi/talk:qZ	(I)I
        //   674: pop
        //   675: goto -516 -> 159
        //   678: astore 6
        //   680: ldc -58
        //   682: iconst_2
        //   683: anewarray 4	java/lang/Object
        //   686: dup
        //   687: iconst_0
        //   688: ldc_w 283
        //   691: aastore
        //   692: dup
        //   693: iconst_1
        //   694: aload 6
        //   696: aastore
        //   697: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   700: goto -460 -> 240
        //   703: ldc 37
        //   705: iconst_1
        //   706: anewarray 4	java/lang/Object
        //   709: dup
        //   710: iconst_0
        //   711: ldc_w 285
        //   714: aastore
        //   715: invokestatic 51	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   718: sipush 411
        //   721: iconst_1
        //   722: ldc_w 287
        //   725: invokestatic 293	com/tencent/pb/common/c/g:y	(IILjava/lang/String;)V
        //   728: aload 4
        //   730: invokevirtual 296	com/tencent/wecall/talkroom/model/f:crE	()V
        //   733: aload 4
        //   735: invokevirtual 299	com/tencent/wecall/talkroom/model/f:aIH	()V
        //   738: goto -418 -> 320
        //   741: astore 4
        //   743: ldc 37
        //   745: iconst_2
        //   746: anewarray 4	java/lang/Object
        //   749: dup
        //   750: iconst_0
        //   751: ldc_w 301
        //   754: aastore
        //   755: dup
        //   756: iconst_1
        //   757: aload 4
        //   759: aastore
        //   760: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   763: goto -443 -> 320
        //   766: aload 4
        //   768: invokestatic 115	java/lang/System:currentTimeMillis	()J
        //   771: aload 4
        //   773: getfield 89	com/tencent/wecall/talkroom/model/h:ymi	J
        //   776: lsub
        //   777: putfield 207	com/tencent/wecall/talkroom/model/h:ylX	J
        //   780: goto -435 -> 345
        //   783: aload 4
        //   785: getfield 305	com/tencent/wecall/talkroom/model/g:handler	Landroid/os/Handler;
        //   788: aload 5
        //   790: invokevirtual 311	android/os/Handler:post	(Ljava/lang/Runnable;)Z
        //   793: pop
        //   794: return
        //   795: iload_1
        //   796: iconst_1
        //   797: iadd
        //   798: istore_1
        //   799: goto -298 -> 501
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	802	0	this	1
        //   245	554	1	i	int
        //   251	6	2	j	int
        //   136	8	3	bool	boolean
        //   73	323	4	localObject1	Object
        //   419	23	4	localThrowable1	Throwable
        //   448	286	4	localObject2	Object
        //   741	43	4	localThrowable2	Throwable
        //   68	721	5	localObject3	Object
        //   82	431	6	localObject4	Object
        //   678	17	6	localThrowable3	Throwable
        //   497	80	7	localStringBuffer	StringBuffer
        //   523	11	8	locald	d
        // Exception table:
        //   from	to	target	type
        //   64	92	419	java/lang/Throwable
        //   100	114	419	java/lang/Throwable
        //   114	143	419	java/lang/Throwable
        //   147	159	419	java/lang/Throwable
        //   159	181	419	java/lang/Throwable
        //   186	194	419	java/lang/Throwable
        //   194	230	419	java/lang/Throwable
        //   240	292	419	java/lang/Throwable
        //   320	345	419	java/lang/Throwable
        //   345	418	419	java/lang/Throwable
        //   441	450	419	java/lang/Throwable
        //   461	468	419	java/lang/Throwable
        //   479	499	419	java/lang/Throwable
        //   501	525	419	java/lang/Throwable
        //   530	558	419	java/lang/Throwable
        //   561	585	419	java/lang/Throwable
        //   595	640	419	java/lang/Throwable
        //   643	647	419	java/lang/Throwable
        //   650	660	419	java/lang/Throwable
        //   663	675	419	java/lang/Throwable
        //   680	700	419	java/lang/Throwable
        //   743	763	419	java/lang/Throwable
        //   766	780	419	java/lang/Throwable
        //   783	794	419	java/lang/Throwable
        //   230	240	678	java/lang/Throwable
        //   292	320	741	java/lang/Throwable
        //   703	738	741	java/lang/Throwable
      }
      
      public final void keep_OnReportChannel(String paramAnonymousString)
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "keep_OnReportChannel:", paramAnonymousString });
        StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.h.XJ(f.this.ykX));
        localStringBuilder.append(",");
        localStringBuilder.append(paramAnonymousString);
        h.Zc(localStringBuilder.toString());
      }
      
      public final void keep_OnReportEngineRecv(String paramAnonymousString, int paramAnonymousInt)
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "keep_OnReportEngineRecv:", Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.h.XJ(f.this.ykX));
        localStringBuilder.append(",");
        localStringBuilder.append(paramAnonymousString);
        h.Za(localStringBuilder.toString());
      }
      
      public final void keep_OnReportEngineSend(String paramAnonymousString)
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "keep_OnReportEngineSend:", paramAnonymousString });
        StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.h.XJ(f.this.ykX));
        localStringBuilder.append(",");
        localStringBuilder.append(paramAnonymousString);
        h.Zb(localStringBuilder.toString());
      }
    };
    return true;
  }
  
  public final void crx()
  {
    try
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "stopHoldeOnPusher " });
      if (this.ylj != null) {
        this.mHandler.removeCallbacks(this.ylj);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { " stopTimer: ", localThrowable });
    }
  }
  
  public final void crz()
  {
    h localh = this.ykL;
    com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "reset" });
    localh.ymj = 0L;
    localh.ymi = 0L;
    localh.ymh = 0L;
    localh.groupId = "";
    localh.xLc = "";
    localh.qJB = 1;
    localh.mjF = 0;
    localh.mjG = 0L;
    localh.mkl = -1;
    localh.qRu = 0;
    localh.qRB = 0;
    localh.qRx = 0;
    localh.mlc = 0;
    localh.ylU = 0;
    localh.ylV = 0;
    localh.ylW = 0L;
    localh.ylX = 0L;
    localh.ylY = 0;
    localh.ylZ = 0;
    localh.yma = 0;
    localh.ymb = 0L;
    localh.qRC = 0L;
    localh.mlb = 0L;
    localh.qRH = 0;
    localh.qRI = 0;
    localh.netType = -1;
    localh.ymc = 0;
    localh.ymd = 0;
    localh.yme = "";
    localh.deviceModel = "";
    localh.ymf = -1;
    localh.qRN = "";
    localh.ymg.setLength(0);
    localh.qJP = -1;
    localh.qJI = 0;
  }
  
  public final void ds(String paramString, int paramInt)
  {
    if ((com.tencent.pb.common.c.h.equals("GLOBAL_TOPIC_NETWORK_CHANGE", paramString)) && (btN()) && ((this.mzT) || (this.ykB))) {
      switch (paramInt)
      {
      }
    }
    do
    {
      return;
      switch (k.im(com.tencent.pb.common.c.d.qNP))
      {
      }
      for (this.ykV = false; (this.mqe == 0) || (this.ykD == 0L); this.ykV = true)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendRedirect mRoomId valid(session ended)" });
        return;
      }
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendRedirect", this.lTW, Integer.valueOf(this.mqe) });
      this.ykL.crI();
      paramString = new com.tencent.wecall.talkroom.a.h(this.lTW, this.mqe, this.ykD, c.crn().YS(this.lTW));
      boolean bool = com.tencent.pb.common.b.e.cmC().a(paramString);
      this.ykL.O(new String[] { "redirect", "req", String.valueOf(bool), String.valueOf(this.state) });
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendRedirect ret: ", Boolean.valueOf(bool) });
      return;
      paramString = this.ykM;
      paramInt = k.im(com.tencent.pb.common.c.d.qNP);
    } while (!com.tencent.pb.common.a.a.xJW);
    paramString.yke.onNetworkChange(paramInt);
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      paramMessage = paramMessage.obj;
      if (this.state == 4)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerInviteTimeOut state: ", Integer.valueOf(this.state) });
      }
      else if (!(paramMessage instanceof d))
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerInviteTimeOut obj is not GroupRoomInfo" });
      }
      else
      {
        paramMessage = (d)paramMessage;
        if (paramMessage.lTW == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerInviteTimeOut groupRoomInfo.mGroupId is null" });
        }
        else
        {
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handlerInviteTimeOut" });
          if ((paramMessage.lTW.equals(this.lTW)) && (paramMessage.mqe == this.mqe) && (paramMessage.ykD == this.ykD))
          {
            h.crJ();
            this.ykL.Gr(501);
            b(paramMessage.lTW, paramMessage.mqe, paramMessage.ykD, 7);
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerInviteTimeOut groupRoomInfo.mGroupId: ", paramMessage.lTW });
            continue;
            paramMessage = paramMessage.obj;
            if (this.state != 1)
            {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroup state: ", Integer.valueOf(this.state) });
            }
            else if (!(paramMessage instanceof a))
            {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroup obj is not CreateGroupObj" });
            }
            else
            {
              paramMessage = (a)paramMessage;
              if (com.tencent.pb.common.c.h.fw(paramMessage.groupId, this.lTW))
              {
                String str1 = paramMessage.groupId;
                Object localObject1 = paramMessage.ylv;
                a.ay localay = paramMessage.ylw;
                int i = paramMessage.xLh;
                int j = paramMessage.type;
                long l = paramMessage.ylx;
                String str2 = paramMessage.yly;
                boolean bool = paramMessage.ylz;
                String str3 = paramMessage.ylA;
                this.ykL.crI();
                Object localObject2 = c.crn();
                paramMessage = "";
                localObject2 = ((c)localObject2).YR(str1);
                if (localObject2 != null) {
                  if (((TalkRoom)localObject2).ykc != null) {
                    break label608;
                  }
                }
                label608:
                for (paramMessage = "";; paramMessage = ((TalkRoom)localObject2).ykc.name)
                {
                  localObject1 = new com.tencent.wecall.talkroom.a.d(str1, (String[])localObject1, this.ykM.crl(), paramMessage, localay, i, j, l, str2, bool, str3);
                  bool = com.tencent.pb.common.b.e.cmC().a((com.tencent.pb.common.b.d)localObject1);
                  this.ykL.O(new String[] { "create", "req", String.valueOf(bool), String.valueOf(this.state) });
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendCreateSence groupId: ", str1, " routeId:", Integer.valueOf(i), " type: ", Integer.valueOf(j), " playId: ", Long.valueOf(l), " name: ", paramMessage, " ret: ", Boolean.valueOf(bool) });
                  break;
                }
                paramMessage = paramMessage.obj;
                if (this.state != 3)
                {
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerEnterGroup state: ", Integer.valueOf(this.state) });
                }
                else if (!(paramMessage instanceof c))
                {
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroup obj is not CreateGroupObj" });
                }
                else
                {
                  paramMessage = (c)paramMessage;
                  if (b(paramMessage.groupId, paramMessage.mjF, paramMessage.mjG, false))
                  {
                    b(paramMessage.groupId, paramMessage.mjF, paramMessage.mjG, paramMessage.xLh, paramMessage.xLo);
                    continue;
                    com.tencent.pb.common.c.g.cmX();
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  /* Error */
  public final void nf(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   4: aload_0
    //   5: getfield 509	com/tencent/wecall/talkroom/model/f:lTW	Ljava/lang/String;
    //   8: putfield 1926	com/tencent/wecall/talkroom/model/h:groupId	Ljava/lang/String;
    //   11: aload_0
    //   12: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   15: aload_0
    //   16: getfield 1080	com/tencent/wecall/talkroom/model/f:ykC	Ljava/lang/String;
    //   19: putfield 1927	com/tencent/wecall/talkroom/model/h:xLc	Ljava/lang/String;
    //   22: aload_0
    //   23: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   26: getfield 1926	com/tencent/wecall/talkroom/model/h:groupId	Ljava/lang/String;
    //   29: invokestatic 2074	com/tencent/pb/common/c/h:yp	(Ljava/lang/String;)Z
    //   32: ifeq +13 -> 45
    //   35: aload_0
    //   36: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   39: ldc_w 1230
    //   42: putfield 1926	com/tencent/wecall/talkroom/model/h:groupId	Ljava/lang/String;
    //   45: aload_0
    //   46: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   49: getfield 1927	com/tencent/wecall/talkroom/model/h:xLc	Ljava/lang/String;
    //   52: invokestatic 2074	com/tencent/pb/common/c/h:yp	(Ljava/lang/String;)Z
    //   55: ifeq +13 -> 68
    //   58: aload_0
    //   59: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   62: ldc_w 1230
    //   65: putfield 1927	com/tencent/wecall/talkroom/model/h:xLc	Ljava/lang/String;
    //   68: aload_0
    //   69: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   72: iconst_1
    //   73: putfield 1930	com/tencent/wecall/talkroom/model/h:qJB	I
    //   76: aload_0
    //   77: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   80: aload_0
    //   81: getfield 394	com/tencent/wecall/talkroom/model/f:mqe	I
    //   84: putfield 1931	com/tencent/wecall/talkroom/model/h:mjF	I
    //   87: aload_0
    //   88: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   91: aload_0
    //   92: getfield 510	com/tencent/wecall/talkroom/model/f:ykD	J
    //   95: putfield 1932	com/tencent/wecall/talkroom/model/h:mjG	J
    //   98: ldc_w 291
    //   101: iconst_2
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: ldc_w 2076
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: iload_1
    //   114: invokestatic 328	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   117: aastore
    //   118: invokestatic 333	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: ldc_w 291
    //   124: iconst_1
    //   125: anewarray 4	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc_w 2078
    //   133: aastore
    //   134: invokestatic 333	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: aload_0
    //   138: invokespecial 1650	com/tencent/wecall/talkroom/model/f:qn	()Z
    //   141: pop
    //   142: aload_0
    //   143: invokespecial 1898	com/tencent/wecall/talkroom/model/f:cry	()Z
    //   146: pop
    //   147: aload_0
    //   148: getfield 158	com/tencent/wecall/talkroom/model/f:ykt	Ljava/util/Map;
    //   151: aload_0
    //   152: getfield 509	com/tencent/wecall/talkroom/model/f:lTW	Ljava/lang/String;
    //   155: invokeinterface 1622 2 0
    //   160: pop
    //   161: aload_0
    //   162: iconst_0
    //   163: putfield 219	com/tencent/wecall/talkroom/model/f:ykU	I
    //   166: aload_0
    //   167: iconst_0
    //   168: putfield 246	com/tencent/wecall/talkroom/model/f:mIsMute	Z
    //   171: aload_0
    //   172: iconst_0
    //   173: invokevirtual 549	com/tencent/wecall/talkroom/model/f:setState	(I)V
    //   176: aload_0
    //   177: iconst_0
    //   178: putfield 176	com/tencent/wecall/talkroom/model/f:ykB	Z
    //   181: aload_0
    //   182: aload_0
    //   183: getfield 1080	com/tencent/wecall/talkroom/model/f:ykC	Ljava/lang/String;
    //   186: iconst_0
    //   187: lconst_0
    //   188: aconst_null
    //   189: invokespecial 1498	com/tencent/wecall/talkroom/model/f:b	(Ljava/lang/String;IJLjava/lang/String;)V
    //   192: aload_0
    //   193: aconst_null
    //   194: putfield 1080	com/tencent/wecall/talkroom/model/f:ykC	Ljava/lang/String;
    //   197: aload_0
    //   198: iconst_0
    //   199: putfield 396	com/tencent/wecall/talkroom/model/f:xKw	I
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield 180	com/tencent/wecall/talkroom/model/f:ykE	I
    //   207: aload_0
    //   208: iconst_0
    //   209: putfield 182	com/tencent/wecall/talkroom/model/f:ykF	I
    //   212: aload_0
    //   213: iconst_0
    //   214: putfield 184	com/tencent/wecall/talkroom/model/f:ykG	I
    //   217: aload_0
    //   218: iconst_1
    //   219: putfield 188	com/tencent/wecall/talkroom/model/f:ykI	Z
    //   222: aload_0
    //   223: iconst_1
    //   224: putfield 232	com/tencent/wecall/talkroom/model/f:yla	Z
    //   227: aload_0
    //   228: lconst_0
    //   229: putfield 186	com/tencent/wecall/talkroom/model/f:ykH	J
    //   232: aload_0
    //   233: iconst_0
    //   234: putfield 190	com/tencent/wecall/talkroom/model/f:ykJ	I
    //   237: aload_0
    //   238: iconst_0
    //   239: putfield 174	com/tencent/wecall/talkroom/model/f:ykA	Z
    //   242: aload_0
    //   243: iconst_0
    //   244: putfield 248	com/tencent/wecall/talkroom/model/f:ylh	Z
    //   247: aload_0
    //   248: iconst_1
    //   249: putfield 250	com/tencent/wecall/talkroom/model/f:yli	Z
    //   252: aload_0
    //   253: invokevirtual 2080	com/tencent/wecall/talkroom/model/f:crx	()V
    //   256: aload_0
    //   257: getfield 306	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   260: iconst_1
    //   261: invokevirtual 2083	android/os/Handler:removeMessages	(I)V
    //   264: aload_0
    //   265: getfield 429	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
    //   268: ifnull +24 -> 292
    //   271: aload_0
    //   272: getfield 429	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
    //   275: astore 4
    //   277: getstatic 1841	com/tencent/pb/common/a/a:xJW	Z
    //   280: ifeq +12 -> 292
    //   283: aload 4
    //   285: getfield 967	com/tencent/wecall/talkroom/model/b:yke	Lcom/tencent/mm/plugin/multi/talk;
    //   288: aconst_null
    //   289: putfield 1873	com/tencent/mm/plugin/multi/talk:field_capInfo	[B
    //   292: aload_0
    //   293: invokevirtual 2085	com/tencent/wecall/talkroom/model/f:crD	()V
    //   296: aload_0
    //   297: invokespecial 1443	com/tencent/wecall/talkroom/model/f:crC	()V
    //   300: ldc_w 291
    //   303: iconst_1
    //   304: anewarray 4	java/lang/Object
    //   307: dup
    //   308: iconst_0
    //   309: ldc_w 2087
    //   312: aastore
    //   313: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   316: aload_0
    //   317: getfield 692	com/tencent/wecall/talkroom/model/f:ykR	Ljava/util/TimerTask;
    //   320: ifnull +11 -> 331
    //   323: aload_0
    //   324: getfield 692	com/tencent/wecall/talkroom/model/f:ykR	Ljava/util/TimerTask;
    //   327: invokevirtual 1102	java/util/TimerTask:cancel	()Z
    //   330: pop
    //   331: aload_0
    //   332: aconst_null
    //   333: putfield 692	com/tencent/wecall/talkroom/model/f:ykR	Ljava/util/TimerTask;
    //   336: aload_0
    //   337: getfield 306	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   340: aload_0
    //   341: getfield 260	com/tencent/wecall/talkroom/model/f:yll	Ljava/lang/Runnable;
    //   344: invokevirtual 1066	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   347: aload_0
    //   348: aconst_null
    //   349: putfield 257	com/tencent/wecall/talkroom/model/f:ylk	Lcom/tencent/pb/common/b/d;
    //   352: aload_0
    //   353: iconst_0
    //   354: putfield 178	com/tencent/wecall/talkroom/model/f:mzT	Z
    //   357: aload_0
    //   358: iconst_0
    //   359: putfield 230	com/tencent/wecall/talkroom/model/f:ykZ	Z
    //   362: ldc_w 1009
    //   365: istore_3
    //   366: iload_3
    //   367: istore_2
    //   368: aload_0
    //   369: getfield 429	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
    //   372: ifnull +45 -> 417
    //   375: aload_0
    //   376: aload_0
    //   377: getfield 429	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
    //   380: invokevirtual 2090	com/tencent/wecall/talkroom/model/b:crm	()I
    //   383: putfield 219	com/tencent/wecall/talkroom/model/f:ykU	I
    //   386: aload_0
    //   387: getfield 429	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
    //   390: invokevirtual 435	com/tencent/wecall/talkroom/model/b:Close	()I
    //   393: istore_2
    //   394: ldc_w 291
    //   397: iconst_2
    //   398: anewarray 4	java/lang/Object
    //   401: dup
    //   402: iconst_0
    //   403: ldc_w 2092
    //   406: aastore
    //   407: dup
    //   408: iconst_1
    //   409: iload_2
    //   410: invokestatic 350	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   413: aastore
    //   414: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   417: aload_0
    //   418: getfield 429	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
    //   421: ifnull +301 -> 722
    //   424: aload_0
    //   425: getfield 429	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
    //   428: invokevirtual 2095	com/tencent/wecall/talkroom/model/b:uninitLive	()I
    //   431: istore_3
    //   432: iload_3
    //   433: istore_2
    //   434: aload_0
    //   435: aconst_null
    //   436: putfield 429	com/tencent/wecall/talkroom/model/f:ykM	Lcom/tencent/wecall/talkroom/model/b;
    //   439: iload_1
    //   440: ifeq +129 -> 569
    //   443: aload_0
    //   444: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   447: invokevirtual 2098	com/tencent/wecall/talkroom/model/h:crG	()Ljava/lang/String;
    //   450: astore 4
    //   452: aload_0
    //   453: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   456: getfield 1926	com/tencent/wecall/talkroom/model/h:groupId	Ljava/lang/String;
    //   459: invokestatic 664	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   462: ifeq +16 -> 478
    //   465: aload_0
    //   466: getfield 199	com/tencent/wecall/talkroom/model/f:ykL	Lcom/tencent/wecall/talkroom/model/h;
    //   469: getfield 1927	com/tencent/wecall/talkroom/model/h:xLc	Ljava/lang/String;
    //   472: invokestatic 664	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   475: ifne +26 -> 501
    //   478: aload 4
    //   480: invokestatic 2101	com/tencent/wecall/talkroom/model/h:YZ	(Ljava/lang/String;)V
    //   483: aload_0
    //   484: getfield 306	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   487: iconst_4
    //   488: invokevirtual 2083	android/os/Handler:removeMessages	(I)V
    //   491: aload_0
    //   492: getfield 306	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   495: iconst_4
    //   496: lconst_0
    //   497: invokevirtual 2105	android/os/Handler:sendEmptyMessageDelayed	(IJ)Z
    //   500: pop
    //   501: aload_0
    //   502: invokevirtual 1275	com/tencent/wecall/talkroom/model/f:crz	()V
    //   505: getstatic 959	com/tencent/pb/common/c/d:qNP	Landroid/content/Context;
    //   508: ldc_w 1199
    //   511: invokevirtual 1204	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   514: checkcast 1206	android/media/AudioManager
    //   517: astore 4
    //   519: aload 4
    //   521: iconst_0
    //   522: invokevirtual 2108	android/media/AudioManager:setMode	(I)V
    //   525: ldc_w 291
    //   528: iconst_4
    //   529: anewarray 4	java/lang/Object
    //   532: dup
    //   533: iconst_0
    //   534: ldc_w 2110
    //   537: aastore
    //   538: dup
    //   539: iconst_1
    //   540: aload 4
    //   542: invokevirtual 2113	android/media/AudioManager:getMode	()I
    //   545: invokestatic 350	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   548: aastore
    //   549: dup
    //   550: iconst_2
    //   551: ldc_w 2115
    //   554: aastore
    //   555: dup
    //   556: iconst_3
    //   557: aload 4
    //   559: invokevirtual 1209	android/media/AudioManager:isSpeakerphoneOn	()Z
    //   562: invokestatic 328	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   565: aastore
    //   566: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   569: ldc_w 291
    //   572: iconst_2
    //   573: anewarray 4	java/lang/Object
    //   576: dup
    //   577: iconst_0
    //   578: ldc_w 2117
    //   581: aastore
    //   582: dup
    //   583: iconst_1
    //   584: iload_2
    //   585: invokestatic 350	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   588: aastore
    //   589: invokestatic 333	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   592: return
    //   593: astore 4
    //   595: ldc_w 291
    //   598: iconst_2
    //   599: anewarray 4	java/lang/Object
    //   602: dup
    //   603: iconst_0
    //   604: ldc_w 2119
    //   607: aastore
    //   608: dup
    //   609: iconst_1
    //   610: aload 4
    //   612: aastore
    //   613: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   616: goto -474 -> 142
    //   619: astore 4
    //   621: ldc_w 291
    //   624: iconst_2
    //   625: anewarray 4	java/lang/Object
    //   628: dup
    //   629: iconst_0
    //   630: ldc_w 2119
    //   633: aastore
    //   634: dup
    //   635: iconst_1
    //   636: aload 4
    //   638: aastore
    //   639: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   642: goto -495 -> 147
    //   645: astore 4
    //   647: ldc_w 291
    //   650: iconst_2
    //   651: anewarray 4	java/lang/Object
    //   654: dup
    //   655: iconst_0
    //   656: ldc_w 2121
    //   659: aastore
    //   660: dup
    //   661: iconst_1
    //   662: aload 4
    //   664: aastore
    //   665: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   668: goto -337 -> 331
    //   671: astore 4
    //   673: ldc_w 291
    //   676: iconst_2
    //   677: anewarray 4	java/lang/Object
    //   680: dup
    //   681: iconst_0
    //   682: ldc_w 2123
    //   685: aastore
    //   686: dup
    //   687: iconst_1
    //   688: aload 4
    //   690: aastore
    //   691: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   694: iload_3
    //   695: istore_2
    //   696: goto -302 -> 394
    //   699: astore 4
    //   701: ldc_w 291
    //   704: iconst_2
    //   705: anewarray 4	java/lang/Object
    //   708: dup
    //   709: iconst_0
    //   710: ldc_w 2125
    //   713: aastore
    //   714: dup
    //   715: iconst_1
    //   716: aload 4
    //   718: aastore
    //   719: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   722: goto -288 -> 434
    //   725: astore 4
    //   727: ldc_w 291
    //   730: iconst_2
    //   731: anewarray 4	java/lang/Object
    //   734: dup
    //   735: iconst_0
    //   736: ldc_w 2127
    //   739: aastore
    //   740: dup
    //   741: iconst_1
    //   742: aload 4
    //   744: aastore
    //   745: invokestatic 513	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   748: goto -179 -> 569
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	751	0	this	f
    //   0	751	1	paramBoolean	boolean
    //   367	329	2	i	int
    //   365	330	3	j	int
    //   275	283	4	localObject	Object
    //   593	18	4	localThrowable1	Throwable
    //   619	18	4	localThrowable2	Throwable
    //   645	18	4	localException1	Exception
    //   671	18	4	localThrowable3	Throwable
    //   699	18	4	localException2	Exception
    //   725	18	4	localThrowable4	Throwable
    // Exception table:
    //   from	to	target	type
    //   137	142	593	java/lang/Throwable
    //   142	147	619	java/lang/Throwable
    //   300	331	645	java/lang/Exception
    //   375	394	671	java/lang/Throwable
    //   424	432	699	java/lang/Exception
    //   505	569	725	java/lang/Throwable
  }
  
  public final void ng(boolean paramBoolean)
  {
    try
    {
      qn();
      cry();
      if (paramBoolean)
      {
        crE();
        aIH();
      }
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setRecordDevActive active: ", Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setRecordDevActive active: ", Boolean.valueOf(paramBoolean), localThrowable });
    }
  }
  
  final void setState(int paramInt)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setState newState: ", Integer.valueOf(paramInt) });
    if (this.state == paramInt) {
      return;
    }
    this.state = paramInt;
    g localg = this.ykT;
    g.9 local9 = new g.9(localg, paramInt);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      local9.run();
      return;
    }
    localg.handler.post(local9);
  }
  
  final class a
  {
    String groupId;
    int type;
    int xLh;
    String ylA;
    String[] ylv;
    a.ay ylw;
    long ylx;
    String yly;
    boolean ylz;
    
    a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
  
  final class c
  {
    String groupId;
    int mjF;
    long mjG;
    int xLh;
    int xLo;
    
    c() {}
  }
  
  final class d
  {
    String lTW;
    int mqe;
    long ykD;
  }
  
  final class e
  {
    String groupId;
    int mjF;
    long mjG;
    
    e() {}
  }
  
  public static abstract interface f {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */