package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.a;
import com.tencent.pb.common.b.a.a.x;
import com.tencent.pb.common.b.d;

public final class b
  extends d
{
  public String lTW;
  public int mqe;
  public long ykD;
  
  public b(String paramString, int paramInt, long paramLong, String[] paramArrayOfString)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "addmember", paramString });
    a.a locala = new a.a();
    try
    {
      locala.groupId = paramString;
      this.lTW = paramString;
      locala.qGO = paramInt;
      this.mqe = paramInt;
      locala.qGP = paramLong;
      this.ykD = paramLong;
      locala.xLb = paramArrayOfString;
      locala.qGO = paramInt;
      this.lIE = 3;
      this.xKw = com.tencent.wecall.talkroom.model.c.crn().YT(paramString);
      c(145, locala);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xKr, new Object[] { "NetSceneAddVoiceGroupMember constructor", paramString });
      }
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.x)e.a(new a.x(), paramArrayOfByte, paramArrayOfByte.length);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.pb.common.c.c.k(this.xKr, new Object[] { "data2Resp", paramArrayOfByte.getMessage() });
        return null;
      }
    }
    return null;
  }
  
  protected final String cmB()
  {
    return "CsCmd.Cmd_V_CSAddVoiceGroupMemberReq";
  }
  
  public final int getType()
  {
    return 204;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */