package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.google.a.a.e;
import com.tencent.pb.b.a.a;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.b.a.a.t;
import com.tencent.pb.common.c.c;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TalkRoom
  extends MultiTalkGroup
{
  a.at ykc;
  Map<String, d> ykd = new ConcurrentHashMap();
  
  public TalkRoom(String paramString, Integer paramInteger, a.at paramat)
  {
    c(paramString, paramInteger);
    b(paramat);
  }
  
  private static void Gj(int paramInt)
  {
    c.d("tagorewang:TalkRoom", new Object[] { "setRoomId: ", Integer.valueOf(paramInt) });
  }
  
  private void YP(String paramString)
  {
    if (j.Zd(paramString)) {
      this.xOy = paramString;
    }
  }
  
  private static a.t a(a.at paramat)
  {
    if (paramat != null) {
      try
      {
        if (paramat.xNf != null)
        {
          paramat = paramat.xNf;
          paramat = (a.t)e.a(new a.t(), paramat, paramat.length);
          return paramat;
        }
      }
      catch (Exception paramat)
      {
        c.k("tagorewang:TalkRoom", new Object[] { "toPlayItemInfo err: ", paramat });
        return null;
      }
    }
    return null;
  }
  
  public static TalkRoom a(TalkRoom paramTalkRoom, String paramString1, String paramString2, Integer paramInteger, int paramInt, long paramLong, a.at paramat, a.av[] paramArrayOfav, a.aw[] paramArrayOfaw)
  {
    if (paramTalkRoom == null)
    {
      c.k("tagorewang:TalkRoom:update", new Object[] { "updateAll null" });
      return null;
    }
    c.d("tagorewang:TalkRoom:update", new Object[] { "updateAll groupId: ", paramString1, " tmpId: ", paramString2 });
    paramTalkRoom.c(paramString1, paramInteger);
    paramTalkRoom.YP(paramString2);
    Gj(paramInt);
    fw(paramLong);
    paramTalkRoom.b(paramat);
    if (paramArrayOfav == null)
    {
      paramInt = 0;
      if (paramArrayOfaw != null) {
        break label124;
      }
    }
    label124:
    for (int i = 0;; i = paramArrayOfaw.length)
    {
      if ((paramInt != 0) || (i != 0)) {
        break label132;
      }
      c.k("tagorewang:TalkRoom:update", new Object[] { "updateAll null VoiceGroupMem or VoiceGroupUsrProfile array." });
      return paramTalkRoom;
      paramInt = paramArrayOfav.length;
      break;
    }
    label132:
    paramString2 = new HashSet(paramTalkRoom.ykd.keySet());
    paramString2.remove(a.cmY());
    i = 0;
    while (i != paramInt)
    {
      paramInteger = paramArrayOfav[i];
      if (paramInteger == null)
      {
        c.k("tagorewang:TalkRoom:update", new Object[] { "null member info, index: ", Integer.valueOf(i) });
        i += 1;
      }
      else
      {
        paramString1 = paramTalkRoom.YQ(paramInteger.xMH);
        if (paramString1 == null)
        {
          c.d("tagorewang:TalkRoom:update", new Object[] { "add new member" });
          paramString1 = new d(paramInteger);
          paramTalkRoom.a(paramString1);
        }
        for (;;)
        {
          paramString2.remove(paramString1.crp());
          break;
          paramString1.a(paramInteger);
        }
      }
    }
    paramString1 = paramString2.iterator();
    while (paramString1.hasNext())
    {
      paramInteger = (String)paramString1.next();
      c.d("tagorewang:TalkRoom:update", new Object[] { "keyset", paramInteger });
      c.d("tagorewang:TalkRoom", new Object[] { "remove", paramTalkRoom.ykd.remove(paramInteger) });
    }
    if (paramString2.size() > 0) {
      c.k("tagorewang:TalkRoom:update", new Object[] { "updateAll not update uuid keyset.size(): ", Integer.valueOf(paramString2.size()) });
    }
    c.d("tagorewang:TalkRoom:update", new Object[] { "did updateAll" });
    return paramTalkRoom;
  }
  
  public static TalkRoom a(String paramString1, String paramString2, Integer paramInteger, int paramInt, long paramLong, a.at paramat, a.av[] paramArrayOfav, a.aw[] paramArrayOfaw)
  {
    c.d("tagorewang:TalkRoom:create", new Object[] { "create groupId: ", paramString1, " tmpId: ", paramString2 });
    paramInteger = new TalkRoom(paramString1, paramInteger, paramat);
    paramInteger.YP(paramString2);
    Gj(paramInt);
    fw(paramLong);
    if (paramArrayOfav == null)
    {
      paramInt = 0;
      if (paramArrayOfaw != null) {
        break label125;
      }
    }
    label125:
    for (int i = 0;; i = paramArrayOfaw.length)
    {
      int j = 0;
      for (;;)
      {
        if (j == paramInt) {
          break label218;
        }
        paramString2 = paramArrayOfav[j];
        if (paramString2 != null) {
          break;
        }
        c.k("tagorewang:TalkRoom:create", new Object[] { "null member info, index: ", Integer.valueOf(j) });
        j += 1;
      }
      paramInt = paramArrayOfav.length;
      break;
    }
    int k = 0;
    for (;;)
    {
      paramString1 = null;
      if (k != i)
      {
        paramString1 = paramArrayOfaw[k];
        if ((paramString1 != null) && (paramString1.tLG == paramString2.tLG)) {
          c.d("tagorewang:TalkRoom:create", new Object[] { "member info: ", paramString2, " profile: ", paramString1 });
        }
      }
      else
      {
        paramInteger.a(new d(paramString2, paramString1));
        break;
      }
      k += 1;
    }
    label218:
    c.d("tagorewang:TalkRoom:create", new Object[] { "did create" });
    return paramInteger;
  }
  
  private void b(a.at paramat)
  {
    if (paramat == null) {
      return;
    }
    for (;;)
    {
      a.t localt2;
      try
      {
        this.xOz = paramat.xNm;
        this.xOA = paramat.xNl;
        if ((this.ykc != null) && (paramat.eIv != 0))
        {
          a.t localt1 = a(paramat);
          localt2 = a(this.ykc);
          if (localt1 == null) {
            paramat.xNf = this.ykc.xNf;
          }
        }
        else
        {
          this.ykc = paramat;
          return;
        }
      }
      catch (Exception localException)
      {
        c.k("tagorewang:TalkRoom", new Object[] { "setRoomInfo assert failed: ", localException });
        this.ykc = paramat;
        return;
      }
      if ((localException.xLY == 0) || (localException.xLY != localt2.xLY))
      {
        c.k("tagorewang:TalkRoom", new Object[] { "setRoomInfo bad id: ", Integer.valueOf(localt2.xLY), " -> ", Integer.valueOf(localException.xLY) });
        paramat.xNf = this.ykc.xNf;
      }
    }
  }
  
  public static long buL()
  {
    return j.crL();
  }
  
  private void c(String paramString, Integer paramInteger)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      if (j.Zd(paramString)) {
        this.xOy = paramString;
      }
      while (paramInteger != null)
      {
        this.xKw = paramInteger.intValue();
        return;
        this.xOx = paramString;
      }
    }
  }
  
  public static boolean crd()
  {
    return false;
  }
  
  public static int crf()
  {
    return j.crK();
  }
  
  private String crg()
  {
    if ((this.ykc == null) || (TextUtils.isEmpty(this.ykc.name)))
    {
      Object localObject1 = new ArrayList(this.ykd.values());
      Object localObject2 = a.cmY();
      ((List)localObject1).remove(this.ykd.get(localObject2));
      localObject1 = dk((List)localObject1);
      c.j("tagorewang:TalkRoom", new Object[] { "getOtherMembers size: ", Integer.valueOf(((List)localObject1).size()), " all size: ", Integer.valueOf(this.ykd.size()) });
      localObject2 = new StringBuilder();
      if (localObject1 != null)
      {
        int j = ((List)localObject1).size();
        int i = 0;
        while (i != j)
        {
          try
          {
            ((StringBuilder)localObject2).append(((d)((List)localObject1).get(i)).getDisplayName());
            if (i != j - 1) {
              ((StringBuilder)localObject2).append('、');
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              c.k("tagorewang:TalkRoom", new Object[] { "updateRoomNameIfEmpty err and continue: ", localException });
            }
          }
          i += 1;
        }
      }
      if (((StringBuilder)localObject2).toString().length() > 0) {
        return ((StringBuilder)localObject2).toString();
      }
    }
    if ((this.ykc != null) && (!TextUtils.isEmpty(this.ykc.name))) {
      return this.ykc.name;
    }
    c.k("tagorewang:TalkRoom", new Object[] { "updateRoomNameIfEmpty still empty, groupId: ", this.xOx, " tmpId: ", this.xOy });
    return null;
  }
  
  private static List<d> dk(List<d> paramList)
  {
    if (paramList.isEmpty()) {
      return paramList;
    }
    Collections.sort(paramList, new a());
    return paramList;
  }
  
  private static void fw(long paramLong)
  {
    c.d("tagorewang:TalkRoom", new Object[] { "setRoomKey: ", Long.valueOf(paramLong) });
  }
  
  public final d YQ(String paramString)
  {
    return (d)this.ykd.get(paramString);
  }
  
  public final void a(d paramd)
  {
    this.ykd.put(paramd.crp(), paramd);
  }
  
  public final int cre()
  {
    if (this.xKw == 0) {
      return 0;
    }
    return this.xKw;
  }
  
  public final List<d> crh()
  {
    List localList = dk(new ArrayList(this.ykd.values()));
    d locald = crj();
    localList.remove(locald);
    localList.add(0, locald);
    locald = (d)this.ykd.get(Integer.valueOf(90100));
    if (locald != null)
    {
      localList.remove(locald);
      localList.add(locald);
    }
    return localList;
  }
  
  public final List<d> cri()
  {
    return new ArrayList(this.ykd.values());
  }
  
  public final d crj()
  {
    return (d)this.ykd.get(a.cmY());
  }
  
  public final List<a.av> crk()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.ykd.entrySet().iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((d)((Map.Entry)localIterator.next()).getValue()).ykk);
    }
    return localArrayList;
  }
  
  public String toString()
  {
    localStringBuilder1 = new StringBuilder();
    for (;;)
    {
      try
      {
        localStringBuilder1.append("groupId: ").append(this.xOx);
        localStringBuilder1.append(" tmpId: ").append(this.xOy);
        localStringBuilder1.append(" routeId: ").append(this.xKw);
        StringBuilder localStringBuilder2 = localStringBuilder1.append(" room name: ");
        if ((this.ykc != null) && (!TextUtils.isEmpty(this.ykc.name))) {
          continue;
        }
        str = crg();
        localStringBuilder2.append(str);
      }
      catch (Exception localException)
      {
        String str;
        localStringBuilder1.append(" broken by " + localException.getMessage());
        continue;
      }
      return localStringBuilder1.toString();
      str = this.ykc.name;
    }
  }
  
  static final class a
    implements Comparator<d>
  {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\TalkRoom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */