package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ae;
import com.tencent.pb.common.b.a.a.h;
import com.tencent.pb.common.b.d;

public final class k
  extends d
{
  public String lTW;
  public int mqe;
  public long ykD;
  
  public k(String paramString1, int paramInt, long paramLong, String paramString2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "NetSceneSubscribeLargeVideo" });
    a.h localh = new a.h();
    try
    {
      localh.groupId = paramString1;
      this.lTW = paramString1;
      localh.mjF = paramInt;
      this.mqe = paramInt;
      localh.mjG = paramLong;
      this.ykD = paramLong;
      localh.jQV = paramString2;
      localh.timestamp = System.currentTimeMillis();
      com.tencent.pb.common.c.c.j("MicroMsg.Voip", new Object[] { "roomId: %d, roomKey: %d, groupId: %s, ownerUserName: %s, timestamp: %d", Integer.valueOf(localh.mjF), Long.valueOf(localh.mjG), localh.groupId, localh.jQV, Long.valueOf(localh.timestamp) });
      this.lIE = 3;
      this.xKw = com.tencent.wecall.talkroom.model.c.crn().YT(paramString1);
      c(245, localh);
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xKr, new Object[] { "NetSceneSwitchVideoGroup constructor", paramString1 });
      }
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ae)e.a(new a.ae(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSSubscribeLargeVideoReq";
  }
  
  public final int getType()
  {
    return 800;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */