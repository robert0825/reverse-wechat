package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ag;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.j;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class a
  extends d
{
  public String lTW = null;
  public int mqe = 0;
  public int xKw;
  public long ykD = 0L;
  public int ymt;
  
  public a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xKr, "NetSceneAckVoiceGroup" });
    a.j localj = new a.j();
    try
    {
      localj.groupId = paramString;
      this.lTW = paramString;
      localj.qGO = paramInt1;
      this.mqe = paramInt1;
      localj.qGP = paramLong;
      this.ykD = paramLong;
      this.ymt = paramInt3;
      this.xKw = paramInt2;
      paramString = new a.al();
      paramString.uNN = 0;
      a.ba localba = new a.ba();
      localba.type = 3;
      localba.xOh = paramString;
      localj.xLg = localba;
      this.lIE = 3;
      this.xKw = paramInt2;
      c(189, localj);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        c.k(this.xKr, new Object[] { "NetSceneAckVoiceGroup constructor", paramString });
      }
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xKr, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ag)e.a(new a.ag(), paramArrayOfByte, paramArrayOfByte.length);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        c.k(this.xKr, new Object[] { "data2Resp", paramArrayOfByte.getMessage() });
        return null;
      }
    }
    return null;
  }
  
  protected final String cmB()
  {
    return "CsCmd.Cmd_V_CSVoiceAckReq";
  }
  
  public final int getType()
  {
    return 206;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */