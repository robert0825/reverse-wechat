package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.aj;
import com.tencent.pb.common.b.a.a.k;
import com.tencent.pb.common.b.d;

public final class h
  extends d
{
  public String groupId;
  public int mjF;
  public long mjG;
  
  public h(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "NetSceneRejectVoiceGroup" });
    a.k localk = new a.k();
    try
    {
      localk.groupId = paramString;
      localk.qGO = paramInt1;
      localk.qGP = paramLong;
      localk.mkl = paramInt2;
      localk.xLi = 2;
      this.lIE = 3;
      this.xKw = com.tencent.wecall.talkroom.model.c.crn().YT(paramString);
      c(211, localk);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xKr, new Object[] { "NetSceneRedirect constructor", paramString });
      }
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.aj)e.a(new a.aj(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSVoiceRedirectReq";
  }
  
  public final int getType()
  {
    return 211;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */