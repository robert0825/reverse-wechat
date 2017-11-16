package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.af;
import com.tencent.pb.common.b.a.a.i;
import com.tencent.pb.common.b.d;

public final class l
  extends d
{
  public String lTW;
  public int mqe;
  public long ykD;
  
  public l(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "NetSceneSwitchVideoGroup" });
    a.i locali = new a.i();
    try
    {
      locali.groupId = paramString;
      this.lTW = paramString;
      locali.mjF = paramInt1;
      this.mqe = paramInt1;
      locali.mjG = paramLong;
      this.ykD = paramLong;
      locali.action = paramInt2;
      locali.timestamp = System.currentTimeMillis();
      this.lIE = 3;
      this.xKw = com.tencent.wecall.talkroom.model.c.crn().YT(paramString);
      c(243, locali);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xKr, new Object[] { "NetSceneSwitchVideoGroup constructor", paramString });
      }
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.af)e.a(new a.af(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSSwitchVideoGroupReq";
  }
  
  public final int getType()
  {
    return 214;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */