package com.tencent.wecall.talkroom.model;

import com.tencent.pb.b.a.a;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.h;

public final class d
{
  private String qhG;
  a.av ykk;
  private a.aw ykl;
  
  public d(a.av paramav)
  {
    a(paramav);
  }
  
  public d(a.av paramav, a.aw paramaw)
  {
    a(paramav);
    if (paramaw == null)
    {
      c.k("tagorewang:TalkRoomMember", new Object[] { "set null profile" });
      return;
    }
    this.ykl = paramaw;
  }
  
  public final void a(a.av paramav)
  {
    if (paramav == null)
    {
      c.k("tagorewang:TalkRoomMember", new Object[] { "set null info" });
      return;
    }
    this.ykk = paramav;
  }
  
  public final String crp()
  {
    if (this.ykk != null) {
      return this.ykk.xMH;
    }
    return "";
  }
  
  public final int crq()
  {
    if (this.ykk == null) {
      return -1;
    }
    return this.ykk.mkl;
  }
  
  public final boolean crr()
  {
    return h.equals(a.cmY(), crp());
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof d))) {
      return false;
    }
    return h.equals(crp(), ((d)paramObject).crp());
  }
  
  public final String getDisplayName()
  {
    try
    {
      localObject2 = this.qhG;
      if ((localObject2 == null) || (((String)localObject2).trim().length() == 0)) {
        break label157;
      }
      localObject1 = ((String)localObject2).trim().toCharArray();
      j = 0;
      i = 0;
      if (j >= localObject1.length) {
        break label174;
      }
      if (localObject1[j] < '¡') {
        break label167;
      }
      i += 2;
    }
    catch (Exception localException)
    {
      Object localObject1;
      label60:
      label73:
      c.k("tagorewang:TalkRoomMember", new Object[] { "getDisplayName err: ", localException });
      return this.qhG;
    }
    Object localObject2 = new StringBuilder();
    int i = 0;
    int j = 0;
    if (j < localObject1.length)
    {
      if (localObject1[j] < '¡') {
        break label183;
      }
      i += 2;
    }
    for (;;)
    {
      if (i + 1 <= 10)
      {
        ((StringBuilder)localObject2).append(localObject1[j]);
        j += 1;
        break label73;
      }
      ((StringBuilder)localObject2).append('…');
      localObject1 = ((StringBuilder)localObject2).toString();
      return (String)localObject1;
      label157:
      return (String)localObject2;
      for (;;)
      {
        j += 1;
        break;
        label167:
        i += 1;
      }
      label174:
      if (i > 10) {
        break label60;
      }
      return (String)localObject2;
      label183:
      i += 1;
    }
  }
  
  public final int getState()
  {
    if (this.ykk == null) {
      return 0;
    }
    return this.ykk.status;
  }
  
  public final int hashCode()
  {
    String str = crp();
    if (str == null) {
      return 0;
    }
    return str.hashCode();
  }
  
  public final String toString()
  {
    int i = 0;
    if (this.ykk != null) {
      i = this.ykk.tLG;
    }
    while ((this.ykk == null) || (this.ykl == null))
    {
      return "invlaid TalkRoomMember which uuid is " + i;
      if (this.ykl != null) {
        i = this.ykl.tLG;
      }
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    Object localObject = this.ykk;
    StringBuilder localStringBuilder2;
    if (localObject == null)
    {
      localObject = "null";
      localStringBuilder2 = localStringBuilder1.append((String)localObject).append(" ");
      localObject = this.ykl;
      if (localObject != null) {
        break label238;
      }
    }
    label238:
    StringBuilder localStringBuilder3;
    for (localObject = "null";; localObject = localStringBuilder3.toString())
    {
      localStringBuilder2.append((String)localObject);
      return localStringBuilder1.toString();
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("VoiceGroupMem");
      localStringBuilder2.append(" uuid:").append(((a.av)localObject).tLG);
      localStringBuilder2.append(" openClientId:").append(((a.av)localObject).xNE);
      localStringBuilder2.append(" invite uuid: ").append(((a.av)localObject).xNA);
      localStringBuilder2.append(" member id:").append(((a.av)localObject).mkl);
      localStringBuilder2.append(" status: ").append(((a.av)localObject).status);
      localStringBuilder2.append(" reason: ").append(((a.av)localObject).eMw);
      localObject = localStringBuilder2.toString();
      break;
      localStringBuilder3 = new StringBuilder();
      localStringBuilder3.append("VoiceGroupUsrProfile");
      localStringBuilder3.append(" uuid: ").append(((a.aw)localObject).tLG);
      localStringBuilder3.append(" user name: ").append(((a.aw)localObject).username);
      localStringBuilder3.append(" head url: ").append(((a.aw)localObject).ofe);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */