package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ac;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class g
  extends d
{
  public String lTW;
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xKr, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ac)e.a(new a.ac(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSModifyVoiceGroupInfoReq";
  }
  
  public final int getType()
  {
    return 209;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */