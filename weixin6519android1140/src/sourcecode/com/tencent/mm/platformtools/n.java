package com.tencent.mm.platformtools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;

public final class n
{
  public static azp H(byte[] paramArrayOfByte)
  {
    GMTrace.i(13452240224256L, 100227);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(13452240224256L, 100227);
      return null;
    }
    azp localazp = new azp();
    localazp.be(paramArrayOfByte);
    GMTrace.o(13452240224256L, 100227);
    return localazp;
  }
  
  public static String a(b paramb)
  {
    GMTrace.i(13452911312896L, 100232);
    if (paramb == null)
    {
      GMTrace.o(13452911312896L, 100232);
      return null;
    }
    paramb = paramb.bNS();
    GMTrace.o(13452911312896L, 100232);
    return paramb;
  }
  
  public static String a(azq paramazq)
  {
    GMTrace.i(13452642877440L, 100230);
    if (paramazq == null)
    {
      GMTrace.o(13452642877440L, 100230);
      return null;
    }
    paramazq = paramazq.uNR;
    GMTrace.o(13452642877440L, 100230);
    return paramazq;
  }
  
  public static byte[] a(azp paramazp)
  {
    GMTrace.i(13452374441984L, 100228);
    if ((paramazp == null) || (paramazp.uNP == null))
    {
      GMTrace.o(13452374441984L, 100228);
      return null;
    }
    paramazp = paramazp.uNP.toByteArray();
    GMTrace.o(13452374441984L, 100228);
    return paramazp;
  }
  
  public static byte[] a(azp paramazp, byte[] paramArrayOfByte)
  {
    GMTrace.i(13452508659712L, 100229);
    if ((paramazp == null) || (paramazp.uNP == null))
    {
      GMTrace.o(13452508659712L, 100229);
      return paramArrayOfByte;
    }
    paramazp = paramazp.uNP.toByteArray();
    GMTrace.o(13452508659712L, 100229);
    return paramazp;
  }
  
  public static String b(azp paramazp)
  {
    GMTrace.i(13453045530624L, 100233);
    if ((paramazp == null) || (paramazp.uNP == null))
    {
      GMTrace.o(13453045530624L, 100233);
      return null;
    }
    paramazp = paramazp.uNP.bNS();
    GMTrace.o(13453045530624L, 100233);
    return paramazp;
  }
  
  public static azq ni(String paramString)
  {
    GMTrace.i(13452777095168L, 100231);
    if (paramString == null)
    {
      GMTrace.o(13452777095168L, 100231);
      return null;
    }
    azq localazq = new azq();
    localazq.Rq(paramString);
    GMTrace.o(13452777095168L, 100231);
    return localazq;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */