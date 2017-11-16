package com.tencent.wecall.talkroom.a;

import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.e;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class e
  extends d
{
  public String lTW = null;
  public int mqe = 0;
  public long ykD = 0L;
  public int ymv = 0;
  
  public e(e parame)
  {
    this.lTW = parame.lTW;
    this.mqe = parame.mqe;
    this.ykD = parame.ykD;
    this.ymv = parame.ymv;
    this.xKt = parame.xKt;
    this.xKv = parame.xKv;
    this.xKw = parame.xKw;
    this.lIE = 1;
  }
  
  public e(String paramString, int paramInt1, long paramLong, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xKr, "enter", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong) });
    a.e locale = new a.e();
    for (;;)
    {
      try
      {
        locale.groupId = paramString;
        this.lTW = paramString;
        locale.qGO = paramInt1;
        this.mqe = paramInt1;
        locale.qGP = paramLong;
        this.ykD = paramLong;
        locale.xLo = paramInt3;
        this.ymv = paramInt3;
        paramString = new a.al();
        if (paramArrayOfByte == null) {
          continue;
        }
        paramString.buffer = paramArrayOfByte;
        paramString.uNN = paramArrayOfByte.length;
        paramArrayOfByte = new a.ba();
        paramArrayOfByte.type = 3;
        paramArrayOfByte.xOh = paramString;
        locale.xLg = paramArrayOfByte;
        this.lIE = 2;
        this.xKw = paramInt2;
        locale.xLi = 2;
      }
      catch (Exception paramString)
      {
        c.k(this.xKr, new Object[] { "NetSceneEnterVoiceRoom constructor", paramString });
        continue;
      }
      c(141, locale);
      return;
      paramString.uNN = 0;
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.aa)com.google.a.a.e.a(new a.aa(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSEnterVoiceRoomReq";
  }
  
  public final int getType()
  {
    return 202;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */