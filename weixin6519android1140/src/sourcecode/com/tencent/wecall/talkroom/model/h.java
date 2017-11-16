package com.tencent.wecall.talkroom.model;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.pb.common.c.d;
import com.tencent.pb.common.c.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class h
{
  static final String TAG = h.class.getCanonicalName();
  public static h ylT = new h();
  String deviceModel;
  public String groupId = "";
  public int mjF = 0;
  public long mjG = 0L;
  public int mkl = -1;
  long mlb = 0L;
  int mlc = 0;
  public int netType = -1;
  public int qJB = 1;
  public int qJI = 0;
  public int qJP = -1;
  int qRB = 0;
  long qRC = 0L;
  int qRH = 0;
  public int qRI = 0;
  String qRN = "";
  int qRu = 0;
  int qRx = 0;
  public String xLc = "";
  public int ylU = 0;
  int ylV = 0;
  long ylW = 0L;
  long ylX = 0L;
  int ylY = 0;
  public int ylZ = 0;
  int yma = 0;
  long ymb = 0L;
  int ymc;
  int ymd = -1;
  String yme;
  int ymf;
  StringBuffer ymg = new StringBuffer();
  long ymh = 0L;
  long ymi = 0L;
  long ymj = 0L;
  
  public static void Gn(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendNetSceneStat", Integer.valueOf(paramInt) });
    g.y(527, 3, String.valueOf(paramInt));
  }
  
  public static void Go(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendDeviceStat", Integer.valueOf(paramInt) });
    g.y(528, 3, String.valueOf(paramInt));
  }
  
  public static void Gp(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendtalkRoomDialStat", Integer.valueOf(paramInt) });
    g.y(530, 3, String.valueOf(paramInt));
  }
  
  public static void Gq(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineStat", Integer.valueOf(paramInt) });
    g.y(529, 3, String.valueOf(paramInt));
  }
  
  public static void YZ(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendSummaryNetScene", paramString });
    g.y(532, 3, paramString);
  }
  
  public static void Za(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineRecv", paramString });
    g.y(533, 3, paramString);
  }
  
  public static void Zb(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineSend", paramString });
    g.y(534, 3, paramString);
  }
  
  public static void Zc(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendChannelStat", paramString });
    g.y(535, 3, paramString);
  }
  
  public static void a(int paramInt, long paramLong, String... paramVarArgs)
  {
    h localh = new h();
    localh.groupId = "";
    localh.mjF = paramInt;
    localh.mjG = paramLong;
    localh.xLc = "";
    localh.O(paramVarArgs);
    YZ(localh.crG());
    g.cmX();
  }
  
  public static void a(String paramString, int paramInt, long paramLong, String... paramVarArgs)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k(TAG, new Object[] { "uploadTempReport groupId is null" });
      return;
    }
    com.tencent.pb.common.c.c.k(TAG, new Object[] { "uploadTempReport: ", paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    h localh = new h();
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    localh.groupId = str;
    localh.mjF = paramInt;
    localh.mjG = paramLong;
    localh.O(paramVarArgs);
    YZ(localh.crG());
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, long paramLong, String... paramVarArgs)
  {
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      com.tencent.pb.common.c.c.k(TAG, new Object[] { "uploadTempReport groupId and clientGroupId is null" });
      return;
    }
    com.tencent.pb.common.c.c.k(TAG, new Object[] { "uploadTempReport: ", paramString1, " clientGroupId: ", paramString2, " roomid: ", Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    h localh = new h();
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    localh.groupId = str;
    localh.mjF = paramInt;
    localh.mjG = paramLong;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    localh.xLc = paramString1;
    localh.O(paramVarArgs);
    YZ(localh.crG());
    g.cmX();
  }
  
  public static void crJ()
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendTalkRoomOnDialStat", Integer.valueOf(60535) });
    g.y(531, 3, "-5001");
  }
  
  public final void Gr(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "stopStatus", Integer.valueOf(paramInt) });
    this.qRu = paramInt;
  }
  
  public final void O(String... paramVarArgs)
  {
    int i = 0;
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {}
    for (;;)
    {
      return;
      if (this.ymg.length() > 900)
      {
        this.ymg.setLength(0);
        this.ymg.append("overmaxsize");
      }
      if (this.ymg.length() != 0) {
        this.ymg.append("-");
      }
      int j = paramVarArgs.length;
      while (i < j)
      {
        String str = paramVarArgs[i];
        this.ymg.append(str);
        this.ymg.append("|");
        i += 1;
      }
    }
  }
  
  public final String crG()
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "collectInfo" });
    this.yme = Build.MANUFACTURER;
    this.deviceModel = Build.MODEL;
    this.ymf = Build.VERSION.SDK_INT;
    this.qRN = Build.VERSION.RELEASE;
    this.netType = k.im(d.qNP);
    this.qRH = 0;
    this.qRI = 0;
    this.ymc = -1;
    this.ymd = -1;
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(this.groupId);
    ((List)localObject1).add(this.xLc);
    ((List)localObject1).add(Integer.valueOf(this.qJB));
    ((List)localObject1).add(Integer.valueOf(this.mjF));
    ((List)localObject1).add(Long.valueOf(this.mjG));
    ((List)localObject1).add(Integer.valueOf(this.mkl));
    ((List)localObject1).add(Integer.valueOf(this.qRu));
    ((List)localObject1).add(Integer.valueOf(this.qRB));
    ((List)localObject1).add(Integer.valueOf(this.qRx));
    ((List)localObject1).add(Integer.valueOf(this.mlc));
    ((List)localObject1).add(Integer.valueOf(this.ylU));
    ((List)localObject1).add(Integer.valueOf(this.ylV));
    ((List)localObject1).add(Long.valueOf(this.ylW));
    ((List)localObject1).add(Long.valueOf(this.ylX));
    ((List)localObject1).add(Integer.valueOf(this.ylY));
    ((List)localObject1).add(Integer.valueOf(this.ylZ));
    ((List)localObject1).add(Integer.valueOf(this.yma));
    ((List)localObject1).add(Long.valueOf(this.ymb));
    ((List)localObject1).add(Long.valueOf(this.qRC));
    ((List)localObject1).add(Long.valueOf(this.mlb));
    ((List)localObject1).add(Integer.valueOf(this.qRH));
    ((List)localObject1).add(Integer.valueOf(this.qRI));
    ((List)localObject1).add(Integer.valueOf(this.netType));
    ((List)localObject1).add(Integer.valueOf(this.ymc));
    ((List)localObject1).add(Integer.valueOf(this.ymd));
    ((List)localObject1).add(this.yme);
    ((List)localObject1).add(this.deviceModel);
    ((List)localObject1).add(Integer.valueOf(this.ymf));
    ((List)localObject1).add(this.qRN);
    Object localObject2 = c.crn();
    String str = this.groupId;
    localObject2 = ((c)localObject2).YR(str);
    int i;
    if (localObject2 == null) {
      i = 0;
    }
    for (;;)
    {
      ((List)localObject1).add(Integer.valueOf(i));
      ((List)localObject1).add(this.ymg.toString());
      ((List)localObject1).add(Integer.valueOf(this.qJP));
      ((List)localObject1).add(Integer.valueOf(this.qJI));
      localObject1 = com.tencent.pb.common.c.h.a((Iterable)localObject1, ",", "_");
      com.tencent.pb.common.c.c.d(TAG, new Object[] { "logBuf: ", this.ymg.toString() });
      com.tencent.pb.common.c.c.d(TAG, new Object[] { "statresult", localObject1 });
      return (String)localObject1;
      i = ((TalkRoom)localObject2).ykd.size();
      com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getGroupMemberSize groupid: ", str, " size: ", Integer.valueOf(i) });
    }
  }
  
  public final void crH()
  {
    this.ymh = System.currentTimeMillis();
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "beginCreateOrEnter", Long.valueOf(this.ymh) });
  }
  
  public final void crI()
  {
    com.tencent.pb.common.c.c.k(TAG, new Object[] { "beginCreateOrNotify" });
    this.ymi = System.currentTimeMillis();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */