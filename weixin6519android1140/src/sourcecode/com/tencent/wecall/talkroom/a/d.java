package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.b.a.a;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.ay;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.d;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.common.c.c;

public final class d
  extends com.tencent.pb.common.b.d
{
  public int mType;
  public String ykC;
  public boolean ymu = true;
  
  public d(String paramString1, String[] paramArrayOfString, byte[] paramArrayOfByte, String paramString2, a.ay paramay, int paramInt1, int paramInt2, long paramLong, String paramString3, boolean paramBoolean, String paramString4)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xKr, "create" });
    a.d locald = new a.d();
    for (;;)
    {
      try
      {
        locald.xLc = paramString1;
        this.ykC = paramString1;
        locald.xLh = paramInt1;
        this.xKw = paramInt1;
        if (paramay != null) {
          locald.xLj = paramay;
        }
        paramString1 = new a.at();
        paramString1.name = paramString2;
        paramString1.xNm = paramString4;
        paramString1.xNl = a.cmY();
        paramString1.eIv = paramInt2;
        this.mType = paramInt2;
        this.ymu = paramBoolean;
        paramString1.xNe = paramLong;
        locald.xLe = paramString1;
        locald.xLl = paramArrayOfString;
        paramString1 = paramString3;
        if (paramString3 == null) {
          paramString1 = "";
        }
        locald.xLk = paramString1;
        paramString1 = new a.al();
        if (paramArrayOfByte == null) {
          continue;
        }
        paramString1.buffer = paramArrayOfByte;
        paramString1.uNN = paramArrayOfByte.length;
        paramArrayOfString = new a.ba();
        paramArrayOfString.type = 3;
        paramArrayOfString.xOh = paramString1;
        locald.xLg = paramArrayOfString;
        this.lIE = 3;
        locald.xLi = 2;
      }
      catch (Exception paramString1)
      {
        c.k(this.xKr, new Object[] { "NetSceneCreateVoiceGroup constructor", paramString1 });
        continue;
      }
      c(139, locald);
      return;
      paramString1.uNN = 0;
    }
  }
  
  protected final Object bw(byte[] paramArrayOfByte)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xKr, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.z)e.a(new a.z(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSCreateVoiceGroupReq";
  }
  
  public final int getType()
  {
    return 201;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */