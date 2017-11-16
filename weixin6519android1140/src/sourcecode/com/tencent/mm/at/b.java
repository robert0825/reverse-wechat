package com.tencent.mm.at;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.jm.b;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.b.a;

public final class b
{
  public static final void JO()
  {
    GMTrace.i(4411602501632L, 32869);
    jm localjm = new jm();
    localjm.eNj.action = -1;
    a.vgX.m(localjm);
    GMTrace.o(4411602501632L, 32869);
  }
  
  public static final void JP()
  {
    GMTrace.i(18644184596480L, 138910);
    jm localjm = new jm();
    localjm.eNj.action = 11;
    a.vgX.m(localjm);
    GMTrace.o(18644184596480L, 138910);
  }
  
  public static boolean JQ()
  {
    GMTrace.i(4411870937088L, 32871);
    jm localjm = new jm();
    localjm.eNj.action = -3;
    a.vgX.m(localjm);
    boolean bool = localjm.eNk.eAO;
    GMTrace.o(4411870937088L, 32871);
    return bool;
  }
  
  public static boolean JR()
  {
    GMTrace.i(4412005154816L, 32872);
    jm localjm = new jm();
    localjm.eNj.action = 9;
    a.vgX.m(localjm);
    boolean bool = localjm.eNk.eAO;
    GMTrace.o(4412005154816L, 32872);
    return bool;
  }
  
  public static apv JS()
  {
    GMTrace.i(4412139372544L, 32873);
    Object localObject = new jm();
    ((jm)localObject).eNj.action = -2;
    a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((jm)localObject).eNk.eNl;
    GMTrace.o(4412139372544L, 32873);
    return (apv)localObject;
  }
  
  public static d JT()
  {
    GMTrace.i(4413213114368L, 32881);
    Object localObject = new jm();
    ((jm)localObject).eNj.action = 8;
    a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((jm)localObject).eNk.eNo;
    GMTrace.o(4413213114368L, 32881);
    return (d)localObject;
  }
  
  public static final void a(apv paramapv)
  {
    GMTrace.i(4411736719360L, 32870);
    jm localjm = new jm();
    localjm.eNj.action = 6;
    localjm.eNj.eNl = paramapv;
    a.vgX.m(localjm);
    GMTrace.o(4411736719360L, 32870);
  }
  
  public static void b(apv paramapv)
  {
    GMTrace.i(4412273590272L, 32874);
    jm localjm = new jm();
    localjm.eNj.action = 0;
    localjm.eNj.eNl = paramapv;
    a.vgX.m(localjm);
    GMTrace.o(4412273590272L, 32874);
  }
  
  public static void c(apv paramapv)
  {
    GMTrace.i(4412407808000L, 32875);
    jm localjm = new jm();
    localjm.eNj.action = 3;
    localjm.eNj.eNl = paramapv;
    a.vgX.m(localjm);
    GMTrace.o(4412407808000L, 32875);
  }
  
  public static boolean d(apv paramapv)
  {
    GMTrace.i(4412944678912L, 32879);
    if (paramapv == null)
    {
      GMTrace.o(4412944678912L, 32879);
      return false;
    }
    switch (paramapv.uFq)
    {
    default: 
      GMTrace.o(4412944678912L, 32879);
      return false;
    }
    GMTrace.o(4412944678912L, 32879);
    return true;
  }
  
  public static boolean gG(int paramInt)
  {
    GMTrace.i(4413078896640L, 32880);
    jm localjm = new jm();
    localjm.eNj.action = 7;
    localjm.eNj.position = paramInt;
    a.vgX.m(localjm);
    boolean bool = localjm.eNk.eAO;
    GMTrace.o(4413078896640L, 32880);
    return bool;
  }
  
  public static final void so()
  {
    GMTrace.i(4411334066176L, 32867);
    jm localjm = new jm();
    localjm.eNj.action = 1;
    a.vgX.m(localjm);
    GMTrace.o(4411334066176L, 32867);
  }
  
  public static final void sp()
  {
    GMTrace.i(4411468283904L, 32868);
    jm localjm = new jm();
    localjm.eNj.action = 2;
    a.vgX.m(localjm);
    GMTrace.o(4411468283904L, 32868);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\at\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */