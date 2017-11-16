package com.tencent.wecall.talkroom.model;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.b.a.a.am;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.system.ConnectReceiver;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.g;
import com.tencent.wecall.talkroom.a.k;
import com.tencent.wecall.talkroom.a.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class e
  implements com.tencent.pb.talkroom.sdk.d
{
  private static e ykn = null;
  private final String TAG = "TalkRoomSdkApi";
  public com.tencent.pb.talkroom.sdk.a ykm = null;
  private ConnectReceiver yko = new ConnectReceiver();
  private g.a ykp = new g.a()
  {
    public final void Gk(int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onOpeningChannel", Integer.valueOf(paramAnonymousInt) });
    }
    
    public final void Gl(int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSwitchMultiTalkVideoSuss bitRate: ", Integer.valueOf(paramAnonymousInt) });
      if (e.this.ykm != null) {
        e.this.ykm.aRy();
      }
    }
    
    public final void a(int paramAnonymousInt, MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onMisscMultiTalk", paramAnonymousMultiTalkGroup, " time: ", Integer.valueOf(paramAnonymousInt) });
      if (e.this.ykm != null)
      {
        e.this.ykm.d(paramAnonymousMultiTalkGroup);
        if (com.tencent.pb.common.a.a.xJV) {
          Toast.makeText(com.tencent.pb.common.c.d.qNP, "onMisscMultiTalk " + paramAnonymousMultiTalkGroup, 0).show();
        }
      }
    }
    
    public final void aKX()
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onInitSeccess" });
      if (com.tencent.pb.common.a.a.xJV) {
        Toast.makeText(com.tencent.pb.common.c.d.qNP, "onInitSeccess ", 0).show();
      }
      if (e.this.ykm != null) {
        e.this.ykm.aRx();
      }
    }
    
    public final void aRz()
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSubscribeLargeVideoSuss" });
      if (e.this.ykm != null) {
        e.this.ykm.aRz();
      }
    }
    
    public final void aX(List<a.am> paramAnonymousList)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onVideoGroupMemberChange videoUserNames: ", paramAnonymousList });
      if (e.this.ykm != null) {
        e.this.ykm.aX(paramAnonymousList);
      }
    }
    
    public final void b(MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onInviteMultiTalk", paramAnonymousMultiTalkGroup });
      if (e.this.ykm != null)
      {
        e.this.ykm.b(paramAnonymousMultiTalkGroup);
        if (com.tencent.pb.common.a.a.xJV) {
          Toast.makeText(com.tencent.pb.common.c.d.qNP, "onInviteMultiTalk " + paramAnonymousMultiTalkGroup, 0).show();
        }
      }
    }
    
    public final void bm(String paramAnonymousString, boolean paramAnonymousBoolean)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onExitRoom", paramAnonymousString, a.crb().lTW, Boolean.valueOf(paramAnonymousBoolean) });
    }
    
    public final void crt()
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSelfHoldOnBegin" });
    }
    
    public final void cru()
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSelfHoldOnEnd" });
    }
    
    public final void crv()
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onSendMsgSucc" });
    }
    
    public final void dl(List<MultiTalkGroup> paramAnonymousList)
    {
      com.tencent.pb.common.c.c.j("TalkRoomSdkApi", new Object[] { "onActiveMultiTalkList ", paramAnonymousList });
    }
    
    public final void dt(String paramAnonymousString, int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onModifyGroupInfo", paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
    }
    
    public final void e(int paramAnonymousInt, Object paramAnonymousObject)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onErr errCode: ", Integer.valueOf(paramAnonymousInt), " data: ", paramAnonymousObject });
      if (e.this.ykm != null) {
        e.this.ykm.e(paramAnonymousInt, paramAnonymousObject);
      }
    }
    
    public final void g(MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      Object localObject = a.crb().lTW;
      String str = null;
      if (paramAnonymousMultiTalkGroup != null) {
        str = paramAnonymousMultiTalkGroup.xOx;
      }
      com.tencent.pb.common.c.c.j("TalkRoomSdkApi", new Object[] { "onMemberChange mGroupId: ", localObject, " groupId: ", str, paramAnonymousMultiTalkGroup });
      if (com.tencent.pb.common.a.a.xJV) {
        Toast.makeText(com.tencent.pb.common.c.d.qNP, "onMemberChange " + paramAnonymousMultiTalkGroup, 0).show();
      }
      int k;
      int j;
      int i;
      if (com.tencent.pb.common.c.h.fw(str, (String)localObject))
      {
        c.crn();
        if ((c.YU((String)localObject)) && (a.crb().state != 3))
        {
          c.crn();
          k = c.YV((String)localObject);
          if (k != 104) {
            break label276;
          }
          j = 63934;
          i = 325;
        }
      }
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onMemberChange isMySelfExit finish ", "stopstatus", Integer.valueOf(j), Integer.valueOf(i), str, " reason: ", Integer.valueOf(k) });
        h.Gn(j);
        a.crb().ykL.Gr(i);
        localObject = a.crb();
        i = a.crb().mqe;
        long l = a.crb().ykD;
        boolean bool = a.crb().qHg;
        ((f)localObject).a(str, i, l, false, false, false);
        if (e.this.ykm != null) {
          e.this.ykm.g(paramAnonymousMultiTalkGroup);
        }
        return;
        label276:
        if (k == 2)
        {
          j = 63933;
          i = 326;
        }
        else
        {
          j = 63932;
          i = 328;
        }
      }
    }
    
    public final void gg(boolean paramAnonymousBoolean)
    {
      com.tencent.pb.common.c.c.j("TalkRoomSdkApi", new Object[] { "onMuteStateChange", Boolean.valueOf(paramAnonymousBoolean) });
      if (e.this.ykm != null) {
        e.this.ykm.gg(paramAnonymousBoolean);
      }
    }
    
    public final void onStateChanged(int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onStateChanged", Integer.valueOf(paramAnonymousInt) });
    }
    
    public final void p(MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onCreateRoom", paramAnonymousMultiTalkGroup });
      if (com.tencent.pb.common.a.a.xJV) {
        Toast.makeText(com.tencent.pb.common.c.d.qNP, "onCreateRoom " + paramAnonymousMultiTalkGroup, 0).show();
      }
      if (e.this.ykm != null) {
        e.this.ykm.e(paramAnonymousMultiTalkGroup);
      }
    }
    
    public final void q(MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onEnterRoom", paramAnonymousMultiTalkGroup });
      if (e.this.ykm != null)
      {
        e.this.ykm.f(paramAnonymousMultiTalkGroup);
        if (com.tencent.pb.common.a.a.xJV) {
          Toast.makeText(com.tencent.pb.common.c.d.qNP, "onEnterRoom " + paramAnonymousMultiTalkGroup, 0).show();
        }
      }
    }
    
    public final void rb(int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onNotifyLargeVideoSubscribersChange largeVideoSubscribersCnt: ", Integer.valueOf(paramAnonymousInt) });
      if (e.this.ykm != null) {
        e.this.ykm.rb(paramAnonymousInt);
      }
    }
    
    public final void y(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
    {
      int i = 0;
      if (paramAnonymousArrayOfByte == null) {}
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onRcvMultiTalkMsg groupId: ", paramAnonymousString, " datas size: ", Integer.valueOf(i) });
        return;
        i = paramAnonymousArrayOfByte.length;
      }
    }
  };
  
  public static e crs()
  {
    if (ykn == null) {}
    try
    {
      if (ykn == null) {
        ykn = new e();
      }
      return ykn;
    }
    finally {}
  }
  
  public static void il(Context paramContext)
  {
    com.tencent.pb.common.c.d.qNP = paramContext;
    com.tencent.e.i.ik(paramContext);
  }
  
  public final boolean CQ(String paramString)
  {
    if (!a.crb().btN())
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "subscribeLargeVideo isWorking is false" });
      return false;
    }
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "subscribeLargeVideo ownerUserName: ", paramString });
    f localf = a.crb();
    if (TextUtils.isEmpty(localf.lTW))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "subscribeLargeVideo mGroupId null " });
      return false;
    }
    paramString = new k(localf.lTW, localf.mqe, localf.ykD, paramString);
    boolean bool = com.tencent.pb.common.b.e.cmC().a(paramString);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "subscribeLargeVideo ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean CY(String paramString)
  {
    if (!com.tencent.pb.common.c.h.fw(paramString, a.crb().lTW))
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "exitMultiTalk groupid is not same; multiTalkGroupid: ", paramString, a.crb().lTW });
      f.e locale;
      f localf;
      if (a.crb().YY(paramString))
      {
        locale = a.crb().YX(paramString);
        localf = a.crb();
        if (locale != null) {
          break label90;
        }
        i = 0;
        if (locale != null) {
          break label99;
        }
      }
      label90:
      label99:
      for (l = 0L;; l = locale.mjG)
      {
        localf.b(paramString, i, l, 1);
        return false;
        i = locale.mjF;
        break;
      }
    }
    int i = a.crb().mqe;
    long l = a.crb().ykD;
    boolean bool = a.crb().ac(paramString, 1, 100);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "exitMultiTalk groupId: ", paramString, " roomId: ", Integer.valueOf(i), " roomKey: ", Long.valueOf(l) });
    return bool;
  }
  
  public final List<String> XL(String paramString)
  {
    if (!com.tencent.pb.common.c.h.fw(paramString, a.crb().lTW))
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "getTalkingMember groupid is not same; multiTalkGroupid: ", paramString, a.crb().lTW });
      return null;
    }
    Object localObject1 = c.crn().YR(paramString);
    if (localObject1 == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getTalkingMember talkroom is null: groupId: ", paramString });
      return null;
    }
    localObject1 = ((TalkRoom)localObject1).cri();
    paramString = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    label192:
    label195:
    for (;;)
    {
      d locald;
      int i;
      if (((Iterator)localObject1).hasNext())
      {
        locald = (d)((Iterator)localObject1).next();
        if (locald == null) {
          continue;
        }
        Object localObject2 = a.crb();
        i = locald.crq();
        if (((f)localObject2).ykM == null) {
          break label192;
        }
        localObject2 = ((f)localObject2).ykM;
        if ((com.tencent.pb.common.a.a.xJW) && (((b)localObject2).yke.GetVoiceActivity(i) == 1)) {
          i = 1;
        }
      }
      for (;;)
      {
        if (i == 0) {
          break label195;
        }
        paramString.add(locald.crp());
        break;
        i = 0;
        continue;
        return paramString;
        i = 0;
      }
    }
  }
  
  public final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
  {
    Object localObject = a.crb().ykM;
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setMultiTalkAppCmd talkRoomContext is null" });
      return -100;
    }
    localObject = ((b)localObject).yke;
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setMultiTalkAppCmd engine is null" });
      return -101;
    }
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setMultiTalkAppCmd inputVolumeScale: ", Integer.valueOf(paramInt1), " inputVolumeScaleForSpeaker: ", Integer.valueOf(paramInt2), " outputVolumeScale: ", Integer.valueOf(paramInt3), " outputVolumeScaleForSpeaker: ", Integer.valueOf(paramInt4), " ehanceHeadsetEC: ", Integer.valueOf(paramInt5), " setECModeLevelForHeadSet: ", Integer.valueOf(paramInt6), " setECModeLevelForSpeaker: ", Integer.valueOf(paramInt7), " enableSpeakerEnhanceEC: ", Integer.valueOf(paramInt8), " aecMode: ", Integer.valueOf(paramInt9), " nsMode: ", Integer.valueOf(paramInt10), " agcMode: ", Integer.valueOf(paramInt11), " agctargetdb: ", Integer.valueOf(paramInt12), " agcgaindb: ", Integer.valueOf(paramInt13), " agcFlag: ", Integer.valueOf(paramInt14) });
    if (!com.tencent.pb.common.a.a.xJW) {
      return 65336;
    }
    byte[] arrayOfByte;
    if (com.tencent.pb.a.a.a.xHQ)
    {
      arrayOfByte = new byte[2];
      byte[] tmp309_307 = arrayOfByte;
      tmp309_307[0] = 0;
      byte[] tmp315_309 = tmp309_307;
      tmp315_309[1] = 0;
      tmp315_309;
      arrayOfByte[1] = 2;
      arrayOfByte[0] = 2;
      ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
      ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
      ((talk)localObject).cw(419, 0);
      ((talk)localObject).cw(418, 4);
      if ((paramInt1 >= 0) || (paramInt2 >= 0))
      {
        arrayOfByte = new byte[2];
        byte[] tmp391_389 = arrayOfByte;
        tmp391_389[0] = 0;
        byte[] tmp397_391 = tmp391_389;
        tmp397_391[1] = 0;
        tmp397_391;
        if (paramInt1 >= 0) {
          arrayOfByte[0] = ((byte)paramInt1);
        }
        if (paramInt2 >= 0) {
          arrayOfByte[1] = ((byte)paramInt2);
        }
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
      }
      if ((paramInt3 >= 0) || (paramInt4 >= 0))
      {
        arrayOfByte = new byte[2];
        byte[] tmp452_450 = arrayOfByte;
        tmp452_450[0] = 0;
        byte[] tmp458_452 = tmp452_450;
        tmp458_452[1] = 0;
        tmp458_452;
        if (paramInt3 >= 0) {
          arrayOfByte[0] = ((byte)paramInt3);
        }
        if (paramInt4 >= 0) {
          arrayOfByte[1] = ((byte)paramInt4);
        }
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
      }
      if (paramInt5 >= 0) {
        ((talk)localObject).cw(416, paramInt5);
      }
      if (paramInt6 >= 0) {
        ((talk)localObject).cw(417, paramInt6);
      }
      if (paramInt7 >= 0) {
        ((talk)localObject).cw(418, paramInt7);
      }
      if (paramInt8 >= 0) {
        ((talk)localObject).cw(419, paramInt8);
      }
      if (paramInt9 < 0) {
        break label1877;
      }
      ((talk)localObject).cw(406, paramInt9);
      label579:
      if (paramInt10 < 0) {
        break label1896;
      }
      ((talk)localObject).cw(408, paramInt10);
      label595:
      if (paramInt11 < 0) {
        break label1915;
      }
      if ((paramInt12 >= 0) && (paramInt13 >= 0))
      {
        arrayOfByte = new byte[4];
        byte[] tmp617_615 = arrayOfByte;
        tmp617_615[0] = 0;
        byte[] tmp623_617 = tmp617_615;
        tmp623_617[1] = 0;
        byte[] tmp629_623 = tmp623_617;
        tmp629_623[2] = 0;
        byte[] tmp635_629 = tmp629_623;
        tmp635_629[3] = 0;
        tmp635_629;
        arrayOfByte[0] = ((byte)paramInt14);
        arrayOfByte[1] = ((byte)paramInt11);
        arrayOfByte[2] = ((byte)paramInt12);
        arrayOfByte[3] = ((byte)paramInt13);
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        com.tencent.pb.common.c.c.d("VoipAdapterUtil", new Object[] { "setAppCmd:EMethodSetAgcOn:" + arrayOfByte[0] + " " + arrayOfByte[1] });
      }
    }
    for (;;)
    {
      return 0;
      if ((com.tencent.pb.a.a.a.xHS) || (com.tencent.pb.a.a.a.xHR))
      {
        arrayOfByte = new byte[2];
        byte[] tmp749_747 = arrayOfByte;
        tmp749_747[0] = 0;
        byte[] tmp755_749 = tmp749_747;
        tmp755_749[1] = 0;
        tmp755_749;
        arrayOfByte[1] = 4;
        arrayOfByte[0] = 4;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        arrayOfByte[1] = 6;
        arrayOfByte[0] = 6;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        ((talk)localObject).cw(416, 1);
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xJf)
      {
        ((talk)localObject).cw(416, 1);
        break;
      }
      if (com.tencent.pb.a.a.a.xHT)
      {
        ((talk)localObject).setAppCmd(414, new byte[] { 2, 2 }, 2);
        break;
      }
      if (com.tencent.pb.a.a.a.xHU)
      {
        ((talk)localObject).setAppCmd(415, new byte[] { 2, 2 }, 2);
        ((talk)localObject).cw(417, 3);
        ((talk)localObject).cw(418, 4);
        ((talk)localObject).cw(416, 1);
        break;
      }
      if (com.tencent.pb.a.a.a.xJr)
      {
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xHV)
      {
        arrayOfByte = new byte[2];
        byte[] tmp980_978 = arrayOfByte;
        tmp980_978[0] = 0;
        byte[] tmp986_980 = tmp980_978;
        tmp986_980[1] = 0;
        tmp986_980;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 1;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xJg)
      {
        ((talk)localObject).cw(416, 1);
        arrayOfByte = new byte[4];
        byte[] tmp1051_1049 = arrayOfByte;
        tmp1051_1049[0] = 0;
        byte[] tmp1057_1051 = tmp1051_1049;
        tmp1057_1051[1] = 0;
        byte[] tmp1063_1057 = tmp1057_1051;
        tmp1063_1057[2] = 0;
        byte[] tmp1069_1063 = tmp1063_1057;
        tmp1069_1063[3] = 0;
        tmp1069_1063;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        arrayOfByte[2] = 12;
        arrayOfByte[3] = 9;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        ((talk)localObject).cw(418, 4);
        break;
      }
      if (com.tencent.pb.a.a.a.xHW)
      {
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xHX)
      {
        arrayOfByte = new byte[2];
        byte[] tmp1155_1153 = arrayOfByte;
        tmp1155_1153[0] = 0;
        byte[] tmp1161_1155 = tmp1155_1153;
        tmp1161_1155[1] = 0;
        tmp1161_1155;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        arrayOfByte[0] = 0;
        arrayOfByte[1] = 1;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        ((talk)localObject).cw(417, 3);
        ((talk)localObject).cw(418, 4);
        break;
      }
      if (com.tencent.pb.a.a.a.xIb)
      {
        ((talk)localObject).cw(417, 3);
        arrayOfByte = new byte[2];
        byte[] tmp1258_1256 = arrayOfByte;
        tmp1258_1256[0] = 0;
        byte[] tmp1264_1258 = tmp1258_1256;
        tmp1264_1258[1] = 0;
        tmp1264_1258;
        arrayOfByte[0] = 0;
        arrayOfByte[1] = 1;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        break;
      }
      if (com.tencent.pb.a.a.a.xHY)
      {
        arrayOfByte = new byte[2];
        byte[] tmp1309_1307 = arrayOfByte;
        tmp1309_1307[0] = 0;
        byte[] tmp1315_1309 = tmp1309_1307;
        tmp1315_1309[1] = 0;
        tmp1315_1309;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        arrayOfByte[0] = 1;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xHZ)
      {
        arrayOfByte = new byte[2];
        byte[] tmp1392_1390 = arrayOfByte;
        tmp1392_1390[0] = 0;
        byte[] tmp1398_1392 = tmp1392_1390;
        tmp1398_1392[1] = 0;
        tmp1398_1392;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        arrayOfByte[0] = 1;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xIa)
      {
        arrayOfByte = new byte[4];
        byte[] tmp1475_1473 = arrayOfByte;
        tmp1475_1473[0] = 0;
        byte[] tmp1481_1475 = tmp1475_1473;
        tmp1481_1475[1] = 0;
        byte[] tmp1487_1481 = tmp1481_1475;
        tmp1487_1481[2] = 0;
        byte[] tmp1493_1487 = tmp1487_1481;
        tmp1493_1487[3] = 0;
        tmp1493_1487;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        arrayOfByte[2] = 15;
        arrayOfByte[3] = 9;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xJA)
      {
        ((talk)localObject).setAppCmd(414, new byte[] { 0, 6 }, 2);
        ((talk)localObject).cw(408, 2);
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xIc)
      {
        ((talk)localObject).cw(417, 1);
        ((talk)localObject).cw(418, 2);
        break;
      }
      if (com.tencent.pb.a.a.a.xIg)
      {
        arrayOfByte = new byte[4];
        byte[] tmp1643_1641 = arrayOfByte;
        tmp1643_1641[0] = 0;
        byte[] tmp1649_1643 = tmp1643_1641;
        tmp1649_1643[1] = 0;
        byte[] tmp1655_1649 = tmp1649_1643;
        tmp1655_1649[2] = 0;
        byte[] tmp1661_1655 = tmp1655_1649;
        tmp1661_1655[3] = 0;
        tmp1661_1655;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        arrayOfByte[2] = 3;
        arrayOfByte[3] = 9;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        ((talk)localObject).cw(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xIh)
      {
        ((talk)localObject).cw(419, 0);
        arrayOfByte = new byte[2];
        byte[] tmp1737_1735 = arrayOfByte;
        tmp1737_1735[0] = 0;
        byte[] tmp1743_1737 = tmp1737_1735;
        tmp1743_1737[1] = 0;
        tmp1743_1737;
        arrayOfByte[0] = 0;
        arrayOfByte[1] = 3;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        break;
      }
      if (com.tencent.pb.a.a.a.xIj)
      {
        arrayOfByte = new byte[4];
        byte[] tmp1788_1786 = arrayOfByte;
        tmp1788_1786[0] = 0;
        byte[] tmp1794_1788 = tmp1788_1786;
        tmp1794_1788[1] = 0;
        byte[] tmp1800_1794 = tmp1794_1788;
        tmp1800_1794[2] = 0;
        byte[] tmp1806_1800 = tmp1800_1794;
        tmp1806_1800[3] = 0;
        tmp1806_1800;
        arrayOfByte[0] = 3;
        arrayOfByte[1] = 2;
        arrayOfByte[2] = 12;
        arrayOfByte[3] = 9;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        break;
      }
      if (com.tencent.pb.a.a.a.xIk)
      {
        ((talk)localObject).cw(419, 0);
        break;
      }
      boolean bool = com.tencent.pb.a.a.a.xIi;
      break;
      label1877:
      if (paramInt9 != -2) {
        break label579;
      }
      ((talk)localObject).qZ(407);
      break label579;
      label1896:
      if (paramInt10 != -2) {
        break label595;
      }
      ((talk)localObject).qZ(409);
      break label595;
      label1915:
      if (paramInt11 == -2)
      {
        ((talk)localObject).qZ(405);
      }
      else if (com.tencent.pb.a.a.a.xJp)
      {
        arrayOfByte = new byte[4];
        tmp1947_1945 = arrayOfByte;
        tmp1947_1945[0] = 3;
        tmp1953_1947 = tmp1947_1945;
        tmp1953_1947[1] = 1;
        tmp1959_1953 = tmp1953_1947;
        tmp1959_1953[2] = 6;
        tmp1965_1959 = tmp1959_1953;
        tmp1965_1959[3] = 9;
        tmp1965_1959;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        com.tencent.pb.common.c.c.d("VoipAdapterUtil", new Object[] { "setAppCmd:EMethodSetAgcOn:" + arrayOfByte[0] + " " + arrayOfByte[1] });
      }
      else if (com.tencent.pb.a.a.a.xJq)
      {
        arrayOfByte = new byte[4];
        tmp2046_2044 = arrayOfByte;
        tmp2046_2044[0] = 1;
        tmp2052_2046 = tmp2046_2044;
        tmp2052_2046[1] = 2;
        tmp2058_2052 = tmp2052_2046;
        tmp2058_2052[2] = 2;
        tmp2064_2058 = tmp2058_2052;
        tmp2064_2058[3] = 9;
        tmp2064_2058;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        com.tencent.pb.common.c.c.d("VoipAdapterUtil", new Object[] { "setAppCmd:EMethodSetAgcOn:" + arrayOfByte[0] + " " + arrayOfByte[1] });
      }
    }
  }
  
  public final int a(byte[] paramArrayOfByte, short paramShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    f localf = a.crb();
    int i;
    if (localf.ykM != null)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "sendVideo ", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      i = localf.ykM.yke.SendVideo(paramArrayOfByte, paramShort, paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramArrayOfByte != null) {
        break label179;
      }
    }
    label179:
    for (int j = 0;; j = paramArrayOfByte.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "sendVideo buffer size: ", Integer.valueOf(j), " len: ", Short.valueOf(paramShort), " w: ", Integer.valueOf(paramInt1), " h: ", Integer.valueOf(paramInt2), " format: ", Integer.valueOf(paramInt3), " mode: ", Integer.valueOf(paramInt4) });
      return i;
      i = -1;
      break;
    }
  }
  
  public final g a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    f localf = a.crb();
    g localg = new g();
    int i;
    if (localf.ykM != null)
    {
      b localb = localf.ykM;
      i = localb.yke.videoTrans(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
      localg = new g();
      localg.xOJ = paramArrayOfInt;
      localg.xOK = localb.yke.field_localImgWidth;
      localg.xOL = localb.yke.field_localImgHeight;
      localg.ret = i;
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "videoTrans ", Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), " multiTalkVideoRGBinfo: ", localg, " engine: ", localf.ykM });
    if (paramArrayOfByte == null)
    {
      i = 0;
      if (paramArrayOfInt != null) {
        break label278;
      }
    }
    label278:
    for (int j = 0;; j = paramArrayOfInt.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "videoTrans recordData size: ", Integer.valueOf(i), " len: ", Integer.valueOf(paramInt1), " localImg size: ", Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), " multiTalkVideoRGBinfo: ", localg });
      return localg;
      i = paramArrayOfByte.length;
      break;
    }
  }
  
  /* Error */
  public final boolean a(com.tencent.pb.talkroom.sdk.a parama, com.tencent.pb.talkroom.sdk.e parame)
  {
    // Byte code:
    //   0: getstatic 53	com/tencent/pb/common/c/d:qNP	Landroid/content/Context;
    //   3: ifnonnull +26 -> 29
    //   6: ldc 28
    //   8: iconst_2
    //   9: anewarray 4	java/lang/Object
    //   12: dup
    //   13: iconst_0
    //   14: ldc_w 467
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: getstatic 53	com/tencent/pb/common/c/d:qNP	Landroid/content/Context;
    //   23: aastore
    //   24: invokestatic 80	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: iconst_0
    //   28: ireturn
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 32	com/tencent/wecall/talkroom/model/e:ykm	Lcom/tencent/pb/talkroom/sdk/a;
    //   34: aload_2
    //   35: invokestatic 470	com/tencent/wecall/talkroom/model/f:a	(Lcom/tencent/pb/talkroom/sdk/e;)V
    //   38: invokestatic 66	com/tencent/wecall/talkroom/model/a:crb	()Lcom/tencent/wecall/talkroom/model/f;
    //   41: astore_3
    //   42: aload_0
    //   43: getfield 42	com/tencent/wecall/talkroom/model/e:ykp	Lcom/tencent/wecall/talkroom/model/g$a;
    //   46: astore_1
    //   47: aload_3
    //   48: getfield 474	com/tencent/wecall/talkroom/model/f:ykT	Lcom/tencent/wecall/talkroom/model/g;
    //   51: astore_3
    //   52: aload_1
    //   53: monitorenter
    //   54: aload_3
    //   55: getfield 480	com/tencent/wecall/talkroom/model/g:fIz	Ljava/util/List;
    //   58: aload_1
    //   59: invokeinterface 483 2 0
    //   64: ifeq +70 -> 134
    //   67: aload_1
    //   68: monitorexit
    //   69: invokestatic 489	com/tencent/pb/common/b/f:cmF	()Lcom/tencent/pb/common/b/f;
    //   72: aload_2
    //   73: putfield 493	com/tencent/pb/common/b/f:xKI	Lcom/tencent/pb/talkroom/sdk/e;
    //   76: invokestatic 497	com/tencent/wecall/talkroom/model/a:cra	()Lcom/tencent/wecall/talkroom/model/a;
    //   79: pop
    //   80: invokestatic 500	com/tencent/wecall/talkroom/model/a:crc	()V
    //   83: new 502	android/content/IntentFilter
    //   86: dup
    //   87: invokespecial 503	android/content/IntentFilter:<init>	()V
    //   90: astore_1
    //   91: aload_1
    //   92: ldc_w 504
    //   95: invokevirtual 508	android/content/IntentFilter:setPriority	(I)V
    //   98: aload_1
    //   99: ldc_w 510
    //   102: invokevirtual 513	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   105: getstatic 53	com/tencent/pb/common/c/d:qNP	Landroid/content/Context;
    //   108: aload_0
    //   109: getfield 37	com/tencent/wecall/talkroom/model/e:yko	Lcom/tencent/pb/common/system/ConnectReceiver;
    //   112: aload_1
    //   113: invokevirtual 519	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   116: pop
    //   117: ldc 28
    //   119: iconst_1
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: ldc_w 521
    //   128: aastore
    //   129: invokestatic 85	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: iconst_1
    //   133: ireturn
    //   134: aload_3
    //   135: getfield 480	com/tencent/wecall/talkroom/model/g:fIz	Ljava/util/List;
    //   138: aload_1
    //   139: invokeinterface 255 2 0
    //   144: pop
    //   145: aload_1
    //   146: monitorexit
    //   147: goto -78 -> 69
    //   150: astore_2
    //   151: aload_1
    //   152: monitorexit
    //   153: aload_2
    //   154: athrow
    //   155: astore_1
    //   156: ldc 28
    //   158: iconst_2
    //   159: anewarray 4	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: ldc_w 523
    //   167: aastore
    //   168: dup
    //   169: iconst_1
    //   170: aload_1
    //   171: aastore
    //   172: invokestatic 80	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: iconst_0
    //   176: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	e
    //   0	177	1	parama	com.tencent.pb.talkroom.sdk.a
    //   0	177	2	parame	com.tencent.pb.talkroom.sdk.e
    //   41	94	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   54	69	150	finally
    //   134	147	150	finally
    //   151	153	150	finally
    //   29	54	155	java/lang/Exception
    //   69	132	155	java/lang/Exception
    //   153	155	155	java/lang/Exception
  }
  
  public final boolean a(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    f.b localb = a.crb().a(null, paramString, paramInt1, paramLong, paramInt2, 100);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "enterMultiTalk multiTalkGroupid:", paramString, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " routId: ", Integer.valueOf(paramInt2), " ret: ", localb });
    return localb == f.b.ylB;
  }
  
  public final void aQ(int paramInt, String paramString)
  {
    com.tencent.pb.b.a.a.EV(paramInt);
    com.tencent.pb.b.a.a.XK(paramString);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setWxUinAndUsrName uin: ", Integer.valueOf(paramInt), " usrname: ", paramString });
  }
  
  public final boolean bz(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.b.f.cmF();
    int i = com.tencent.pb.common.b.f.by(paramArrayOfByte);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "handleMultiTalkNotify ret: ", Integer.valueOf(i) });
    return i == 0;
  }
  
  public final boolean c(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "handleMultiTalkResp retCode: ", Integer.valueOf(paramInt1), " seq: ", Integer.valueOf(paramInt2), " cmdId: ", Integer.valueOf(paramInt3), " data length: ", Integer.valueOf(i) });
      if (paramInt1 != 0) {
        break label97;
      }
      com.tencent.pb.common.b.f.cmF().p(paramInt2, paramArrayOfByte);
    }
    label97:
    com.tencent.pb.common.b.f.a locala;
    do
    {
      return true;
      i = paramArrayOfByte.length;
      break;
      paramArrayOfByte = com.tencent.pb.common.b.f.cmF();
      locala = paramArrayOfByte.EU(paramInt2);
    } while (locala == null);
    com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "CLTRCV FAIL", Integer.valueOf(paramInt2), locala.xKL, Integer.valueOf(1), Integer.valueOf(paramInt1) });
    paramArrayOfByte.a(locala, -1, null);
    return true;
  }
  
  public final boolean cna()
  {
    try
    {
      com.tencent.pb.common.c.c.y(true, 0);
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setOpenLog: isOpenSdkLog", Boolean.valueOf(true), " level: ", Integer.valueOf(0) });
      return true;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setOpenLog: ", localThrowable });
    }
    return false;
  }
  
  public final String cnb()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("client_");
    ((StringBuilder)localObject).append(com.tencent.pb.b.a.a.cmY());
    ((StringBuilder)localObject).append("_");
    ((StringBuilder)localObject).append(System.currentTimeMillis());
    localObject = ((StringBuilder)localObject).toString();
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "genMultiTalkClientId clientId: ", localObject });
    return (String)localObject;
  }
  
  public final boolean dn(String paramString, int paramInt)
  {
    Object localObject = a.crb();
    localObject = ((f)localObject).a(null, paramString, ((f)localObject).mqe, ((f)localObject).ykD, paramInt, 1);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "enterMultiTalk multiTalkGroupid:", paramString, " isAccept: ", Boolean.valueOf(true), " routId: ", Integer.valueOf(paramInt), " ret: ", localObject });
    return localObject == f.b.ylB;
  }
  
  public final boolean e(String paramString1, String paramString2, List<String> paramList)
  {
    f localf = a.crb();
    Object localObject1 = f.dm(paramList);
    int i;
    if (localObject1.length > 0)
    {
      if (TextUtils.isEmpty(null)) {
        break label289;
      }
      throw new NullPointerException();
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom cliendId: ", paramString1, " voiceSingle2MultiInfo: ", null, " memeberUuids size: ", Integer.valueOf(localObject1.length), "routeId", Integer.valueOf(i), " context: ", null, " type: ", Integer.valueOf(0), " playId: ", Long.valueOf(0L), " sdkKey: ", null });
      if (com.tencent.pb.b.a.a.cmZ()) {
        break label318;
      }
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom isAuthed: ", Boolean.valueOf(com.tencent.pb.b.a.a.cmZ()), " isBindMobile: ", Boolean.valueOf(true) });
      h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "noAuth" });
    }
    for (;;)
    {
      paramString1 = null;
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "createTalkRoom clientId is: ", paramString1, "wXgroupId: ", paramString2, " creatorUsrName: ", com.tencent.pb.b.a.a.cmY(), " usrnameList: ", paramList });
      if (paramString1 == null) {
        break label986;
      }
      return true;
      label289:
      i = new Random().nextInt() << 16 | com.tencent.pb.b.a.a.cmY().hashCode() & 0xFFFF;
      break;
      label318:
      if (!com.tencent.pb.common.b.h.isNetworkConnected())
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom isNetworkConnected is false" });
        h.Gp(61533);
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "noNetwork" });
      }
      else if (localf.btN())
      {
        if (localf.btN()) {
          h.Gp(61534);
        }
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "isBusy" });
      }
      else if (TextUtils.isEmpty(paramString1))
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom cliendId is null" });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "cliendIdnull" });
      }
      else if (!j.Zd(paramString1))
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom groupId is not cliend id: ", paramString1 });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "isnotcliendId" });
      }
      else
      {
        if (c.crn().YR(paramString1) == null) {
          c.crn().a(paramString1, paramString2, 0, 0, (String[])localObject1);
        }
        localf.crz();
        localf.nf(false);
        localf.crw();
        if (localf.bsv()) {
          break label684;
        }
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom initEngine fail" });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "initEnginefail" });
        localf.nf(false);
      }
    }
    label684:
    localf.ykL.crH();
    localf.lTW = paramString1;
    localf.ykX = paramString1;
    localf.xKw = i;
    localf.ykC = paramString1;
    localf.setState(1);
    localf.qHg = true;
    Object localObject2 = new f.a(localf);
    ((f.a)localObject2).groupId = localf.lTW;
    ((f.a)localObject2).ylv = ((String[])localObject1);
    ((f.a)localObject2).ylw = null;
    ((f.a)localObject2).xLh = i;
    ((f.a)localObject2).type = 0;
    ((f.a)localObject2).ylx = 0L;
    ((f.a)localObject2).yly = null;
    ((f.a)localObject2).ylz = false;
    ((f.a)localObject2).ylA = paramString2;
    localObject1 = Message.obtain();
    ((Message)localObject1).what = 2;
    ((Message)localObject1).obj = localObject2;
    localf.mHandler.removeMessages(2);
    localObject2 = c.crn().YR(localf.lTW);
    if (localObject2 == null) {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup talkroom is null" });
    }
    for (;;)
    {
      localf.mHandler.sendMessage((Message)localObject1);
      localf.ykZ = true;
      break;
      localObject2 = ((TalkRoom)localObject2).crh();
      if ((localObject2 == null) || (((List)localObject2).size() != 1))
      {
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup TalkRoomMember list is not match" });
      }
      else
      {
        localObject2 = (d)((List)localObject2).get(0);
        if (localObject2 == null) {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup talkRoomMember is null" });
        } else {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup ret: ", Boolean.valueOf(((d)localObject2).crr()) });
        }
      }
    }
    label986:
    return false;
  }
  
  public final void gm(boolean paramBoolean)
  {
    a.crb();
    com.tencent.pb.talkroom.sdk.e locale = f.crF();
    if (locale != null) {}
    for (boolean bool = locale.gi(paramBoolean);; bool = false)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "switchSpeakerPhone", Boolean.valueOf(paramBoolean), " ret: ", Boolean.valueOf(bool), " realret: ", Boolean.valueOf(f.sm()), " wxCallBack: ", locale });
      return;
    }
  }
  
  public final void mT(boolean paramBoolean)
  {
    f localf = a.crb();
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setMute isMute: ", Boolean.valueOf(paramBoolean) });
    localf.mIsMute = paramBoolean;
    com.tencent.pb.common.c.i.Z(new g.14(localf.ykT, paramBoolean));
  }
  
  public final boolean mU(boolean paramBoolean)
  {
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "holadMultiTalk isHold", Boolean.valueOf(paramBoolean) });
    f localf;
    if (paramBoolean)
    {
      localf = a.crb();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "startHoldOn" });
      localf.ylh = true;
      localf.ng(false);
      com.tencent.pb.common.c.i.Z(new g.10(localf.ykT));
    }
    do
    {
      return true;
      localf = a.crb();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "endHoldOn" });
      localf.ylh = false;
      localf.crx();
    } while ((!localf.btN()) || (!localf.mzT));
    localf.ng(true);
    com.tencent.pb.common.c.i.Z(new g.12(localf.ykT));
    return true;
  }
  
  public final boolean rc(int paramInt)
  {
    if (!a.crb().btN())
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "switchMultiTalkVideo isWorking is false" });
      return false;
    }
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "switchMultiTalkVideo action: ", Integer.valueOf(paramInt) });
    Object localObject = a.crb();
    if (TextUtils.isEmpty(((f)localObject).lTW))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "switchMultiTalkVideo mGroupId is null" });
      return false;
    }
    ((f)localObject).ykK = paramInt;
    localObject = new l(((f)localObject).lTW, ((f)localObject).mqe, ((f)localObject).ykD, paramInt);
    boolean bool = com.tencent.pb.common.b.e.cmC().a((com.tencent.pb.common.b.d)localObject);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "switchMultiTalkVideo ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  public final com.tencent.pb.talkroom.sdk.f s(int[] paramArrayOfInt)
  {
    int j = 0;
    Object localObject1 = a.crb();
    Object localObject2;
    if (((f)localObject1).ykM != null)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "receiveVideo" });
      localObject2 = ((f)localObject1).ykM;
      localObject1 = new com.tencent.pb.talkroom.sdk.f();
      if (paramArrayOfInt == null)
      {
        com.tencent.pb.common.c.c.k("simon:TalkRoomContext", new Object[] { "receiveVideo imgBuffer is null" });
        if (paramArrayOfInt != null) {
          break label470;
        }
      }
    }
    label232:
    label233:
    label238:
    label350:
    label452:
    label470:
    for (int i = j;; i = paramArrayOfInt.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "receiveVideo imgBuffer size: ", Integer.valueOf(i), " MultiTalkVideoDecodeInfo: ", localObject1 });
      return (com.tencent.pb.talkroom.sdk.f)localObject1;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).ret = ((b)localObject2).yke.videoDecode(paramArrayOfInt);
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xOE = paramArrayOfInt;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xOF = ((b)localObject2).yke.field_remoteImgLength;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xOG = ((b)localObject2).yke.field_remoteImgWidth;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xOH = ((b)localObject2).yke.field_remoteImgHeight;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xOI = (((b)localObject2).yke.field_remoteImgChannel & 0x3FFF);
      Object localObject3 = c.crn();
      localObject2 = a.crb().lTW;
      i = ((com.tencent.pb.talkroom.sdk.f)localObject1).xOI;
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getUsrNameByMemberId groupId is null memberId: ", Integer.valueOf(i) });
        break label350;
        localObject2 = "";
        ((com.tencent.pb.talkroom.sdk.f)localObject1).xOC = ((String)localObject2);
        if (paramArrayOfInt != null) {
          break label452;
        }
      }
      for (i = 0;; i = paramArrayOfInt.length)
      {
        com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "receiveVideo imgBuffer size:", Integer.valueOf(i), " MultiTalkVideoDecodeInfo: ", localObject1 });
        break;
        localObject3 = ((c)localObject3).YR((String)localObject2);
        if (localObject3 == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getUsrNameByMemberId talkRoom is null groupId: ", localObject2, " memberId: ", Integer.valueOf(i) });
          break label233;
        }
        localObject3 = ((TalkRoom)localObject3).crk().iterator();
        if (!((Iterator)localObject3).hasNext()) {
          break label233;
        }
        a.av localav = (a.av)((Iterator)localObject3).next();
        if ((localav == null) || (localav.mkl != i)) {
          break label232;
        }
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getUsrNameByMemberId wxUserName:", localav.xMH, " groupId: ", localObject2, " memberId: ", Integer.valueOf(i) });
        if (localav.xMH == null) {
          break label233;
        }
        localObject2 = localav.xMH;
        break label238;
      }
      localObject1 = new com.tencent.pb.talkroom.sdk.f();
      break;
    }
  }
  
  public final int setAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    f localf = a.crb();
    if (localf.ykM == null) {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setAppCmd type: ", Integer.valueOf(paramInt1), " engine is null" });
    }
    for (int i = -1;; i = localf.ykM.yke.setAppCmd(paramInt1, paramArrayOfByte, paramInt2))
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "setAppCmd type: ", Integer.valueOf(paramInt1), " paramLen: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(i) });
      return i;
    }
  }
  
  public final boolean t(String paramString, List<String> paramList)
  {
    if (!com.tencent.pb.common.c.h.fw(paramString, a.crb().lTW))
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "addMultiTalkMember groupid is not same; multiTalkGroupid: ", paramString, a.crb().lTW });
      return false;
    }
    f localf = a.crb();
    int j = localf.mqe;
    long l = localf.ykD;
    int i;
    boolean bool;
    if (paramList == null)
    {
      i = 0;
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "addrTalkRoomMember", paramString, Integer.valueOf(j), Long.valueOf(l), " users length: ", Integer.valueOf(i) });
      localf.ykZ = false;
      if ((!TextUtils.isEmpty(paramString)) && (paramList != null)) {
        break label173;
      }
      bool = false;
    }
    for (;;)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "addMultiTalkMember ret: ", Boolean.valueOf(bool) });
      return bool;
      i = paramList.size();
      break;
      label173:
      if (!com.tencent.pb.common.b.h.isNetworkConnected())
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "addTalkRoomMember isNetworkConnected is false" });
        bool = false;
      }
      else
      {
        paramList = f.dm(paramList);
        if (paramList.length <= 0)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "addTalkRoomMember users is null" });
          bool = false;
        }
        else
        {
          paramString = new com.tencent.wecall.talkroom.a.b(paramString, localf.mqe, localf.ykD, paramList);
          bool = com.tencent.pb.common.b.e.cmC().a(paramString);
          localf.ykL.O(new String[] { "add", "req", String.valueOf(bool), String.valueOf(localf.state) });
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */