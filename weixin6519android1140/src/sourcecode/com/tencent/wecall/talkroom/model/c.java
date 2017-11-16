package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.tencent.pb.b.a.a;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.c.f;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
{
  private static boolean DEBUG = false;
  public static boolean ykf = false;
  private static final f<c> ykg = new f() {};
  Map<String, TalkRoom> ykh = new HashMap();
  Map<String, String> yki = new HashMap();
  g ykj;
  
  public c()
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "asyncLoadCache" });
  }
  
  public static boolean YU(String paramString)
  {
    paramString = crn().YR(paramString);
    if (paramString == null) {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isMySelfExit talkRoom is null" });
    }
    do
    {
      return true;
      paramString = paramString.crj();
    } while ((paramString == null) || (20 == paramString.getState()));
    return false;
  }
  
  public static int YV(String paramString)
  {
    Object localObject = crn().YR(paramString);
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMySelfReason talkRoom is null groupId: ", paramString });
      return 0;
    }
    localObject = ((TalkRoom)localObject).crj();
    if ((localObject != null) && (((d)localObject).ykk != null)) {}
    for (int i = ((d)localObject).ykk.eMw;; i = 0)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMySelfReason groupId: ", paramString, " reason: ", Integer.valueOf(i) });
      return i;
    }
  }
  
  public static c crn()
  {
    return (c)ykg.get();
  }
  
  static void cro()
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "asyncWriteBackCache" });
  }
  
  public final TalkRoom YR(String paramString)
  {
    TalkRoom localTalkRoom2 = (TalkRoom)this.ykh.get(paramString);
    TalkRoom localTalkRoom1 = localTalkRoom2;
    if (localTalkRoom2 == null)
    {
      localTalkRoom1 = localTalkRoom2;
      if (j.Zd(paramString))
      {
        paramString = (String)this.yki.get(paramString);
        localTalkRoom1 = (TalkRoom)this.ykh.get(paramString);
      }
    }
    return localTalkRoom1;
  }
  
  public final int YS(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getSelfMemberId invalid groupId" });
      return -1;
    }
    Object localObject = YR(paramString);
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoom is null  groupId: ", paramString });
      return -1;
    }
    localObject = ((TalkRoom)localObject).YQ(a.cmY());
    if (localObject != null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoomMember is not null groupId: ", paramString, " uuid: ", a.cmY(), " memberId: ", Integer.valueOf(((d)localObject).crq()) });
      return ((d)localObject).crq();
    }
    com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoomMember is null" });
    return -1;
  }
  
  public final int YT(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getRountIdByGrouId invalid groupId" });
      return 0;
    }
    TalkRoom localTalkRoom = YR(paramString);
    if (localTalkRoom == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getRountIdByGrouId TalkRoom is null  groupId: ", paramString });
      return 0;
    }
    return localTalkRoom.cre();
  }
  
  public final MultiTalkGroup YW(String paramString)
  {
    paramString = YR(paramString);
    if (paramString == null) {
      return null;
    }
    MultiTalkGroup localMultiTalkGroup = new MultiTalkGroup();
    localMultiTalkGroup.xOx = paramString.xOx;
    localMultiTalkGroup.xOy = paramString.xOy;
    localMultiTalkGroup.xKw = paramString.xKw;
    localMultiTalkGroup.xOz = paramString.xOz;
    localMultiTalkGroup.xOA = paramString.xOA;
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.cri();
    if (paramString.size() > 0)
    {
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (locald != null)
        {
          MultiTalkGroupMember localMultiTalkGroupMember = new MultiTalkGroupMember();
          localMultiTalkGroupMember.xOC = locald.crp();
          if (locald.ykk != null)
          {
            paramString = locald.ykk.xNN;
            label154:
            localMultiTalkGroupMember.xOD = paramString;
            if (locald.ykk == null) {
              break label246;
            }
            i = locald.ykk.eMw;
            label177:
            localMultiTalkGroupMember.eMw = i;
            localMultiTalkGroupMember.status = locald.getState();
            if ((locald.ykk == null) || (locald.ykk.xNB == 0)) {
              break label251;
            }
          }
          label246:
          label251:
          for (int i = locald.ykk.xNB;; i = 0)
          {
            localMultiTalkGroupMember.xNB = i;
            localArrayList.add(localMultiTalkGroupMember);
            break;
            paramString = "";
            break label154;
            i = 0;
            break label177;
          }
        }
      }
    }
    localMultiTalkGroup.xOB = localArrayList;
    return localMultiTalkGroup;
  }
  
  public final boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2, String... paramVarArgs)
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newTmpGroup groupId: ", paramString1 });
    if (!j.Zd(paramString1))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newTmpGroup invalid clientGroupId" });
      return false;
    }
    if ((paramVarArgs == null) || (paramVarArgs.length == 0))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newTmpGroup empty uuid array" });
      return false;
    }
    try
    {
      Object localObject = new a.at();
      ((a.at)localObject).eIv = 0;
      ((a.at)localObject).xNm = paramString2;
      ((a.at)localObject).xNl = a.cmY();
      paramString2 = new TalkRoom(paramString1, null, (a.at)localObject);
      paramInt2 = paramVarArgs.length;
      paramInt1 = 0;
      while (paramInt1 != paramInt2)
      {
        localObject = paramVarArgs[paramInt1];
        a.av localav = new a.av();
        localav.xMH = ((String)localObject);
        localav.xNN = a.cmY();
        localav.status = 20;
        localav.mkl = -1;
        localav.xNB = ((int)(System.currentTimeMillis() / 1000L));
        paramString2.a(new d(localav, new a.aw()));
        paramInt1 += 1;
      }
      this.ykh.put(paramString1, paramString2);
      cro();
      return true;
    }
    catch (Exception paramString1)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newTmpGroup err: ", paramString1 });
    }
    return false;
  }
  
  public final boolean bl(String paramString, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf groupid is null" });
      return false;
    }
    paramString = YR(paramString);
    if (paramString == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf talkRoom is null" });
      return false;
    }
    paramString = paramString.crh();
    if (paramString == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf TalkRoomMember list is null" });
      return false;
    }
    paramString = paramString.iterator();
    int j = 0;
    int i = 0;
    label89:
    int k;
    for (;;)
    {
      if (paramString.hasNext())
      {
        d locald = (d)paramString.next();
        if (locald != null)
        {
          TalkRoom.crd();
          if (locald.getState() != 10) {
            break label204;
          }
          if (locald.crr())
          {
            k = 1;
            j = i;
            i = k;
          }
        }
      }
    }
    for (;;)
    {
      if ((paramBoolean) && (j != 0))
      {
        return true;
        i = j;
        j = 1;
      }
      else
      {
        if ((i != 0) && (j != 0))
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf is true" });
          return true;
        }
        k = j;
        j = i;
        i = k;
        break label89;
        break;
        label204:
        k = i;
        i = j;
        j = k;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */