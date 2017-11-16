package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ak;
import com.tencent.pb.common.b.a.a.l;
import com.tencent.pb.common.b.d;

public final class m
  extends d
{
  public String lTW;
  public int mqe;
  public long ykD;
  
  public m(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "hello", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong) });
    a.l locall = new a.l();
    locall.xLt = paramInt3;
    locall.qGO = paramInt1;
    this.mqe = paramInt1;
    locall.qGP = paramLong;
    this.ykD = paramLong;
    locall.groupId = paramString;
    this.lTW = paramString;
    locall.mkl = paramInt2;
    this.lIE = 3;
    try
    {
      this.xKw = com.tencent.wecall.talkroom.model.c.crn().YT(paramString);
      c(147, locall);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xKr, new Object[] { "NetSceneVoiceRoomHello constructor", paramString });
      }
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ak)e.a(new a.ak(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSVoiceRoomHelloReq";
  }
  
  public final int getType()
  {
    return 205;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */