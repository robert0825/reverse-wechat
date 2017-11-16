package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ab;
import com.tencent.pb.common.b.a.a.f;
import com.tencent.pb.common.b.d;

public final class f
  extends d
{
  public f(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "eixt", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    a.f localf = new a.f();
    try
    {
      localf.groupId = paramString;
      localf.qGO = paramInt1;
      localf.qGP = paramLong;
      localf.eMw = paramInt2;
      this.lIE = 2;
      this.xKw = com.tencent.wecall.talkroom.model.c.crn().YT(paramString);
      c(143, localf);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xKr, new Object[] { "NetSceneExitVoiceRoom constructor", paramString });
      }
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ab)e.a(new a.ab(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSExitVoiceRoomReq";
  }
  
  public final int getType()
  {
    return 203;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */