package com.tencent.mm.wallet_core.e.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.i;
import com.tencent.mm.protocal.c.atl;
import com.tencent.mm.protocal.c.atm;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.m;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.TenpayUtil;
import java.net.URLEncoder;

public abstract class a
  extends h
{
  public a()
  {
    GMTrace.i(1527800397824L, 11383);
    GMTrace.o(1527800397824L, 11383);
  }
  
  public final String Kb(String paramString)
  {
    GMTrace.i(1528471486464L, 11388);
    paramString = TenpayUtil.signWith3Des(paramString);
    GMTrace.o(1528471486464L, 11388);
    return paramString;
  }
  
  public int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1529008357376L, 11392);
    this.fUd = parame1;
    if (!q.zR())
    {
      w.e("MicroMsg.NetScenePayUBase", "hy: serious error: not payupay");
      parame1.a(1000, -100868, "Pay Method Err", this);
      GMTrace.o(1529008357376L, 11392);
      return 1;
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(1529008357376L, 11392);
    return i;
  }
  
  public final void a(b paramb, azp paramazp)
  {
    GMTrace.i(1528605704192L, 11389);
    ((atl)paramb.gtC.gtK).uwW = paramazp;
    GMTrace.o(1528605704192L, 11389);
  }
  
  public final void b(b paramb, azp paramazp)
  {
    GMTrace.i(1528739921920L, 11390);
    ((atl)paramb.gtC.gtK).uJc = paramazp;
    GMTrace.o(1528739921920L, 11390);
  }
  
  public final void b(StringBuilder paramStringBuilder, String paramString)
  {
    GMTrace.i(1529142575104L, 11393);
    paramStringBuilder.append(URLEncoder.encode(paramString));
    GMTrace.o(1529142575104L, 11393);
  }
  
  public final int bxK()
  {
    GMTrace.i(1528068833280L, 11385);
    int i = bxZ();
    GMTrace.o(1528068833280L, 11385);
    return i;
  }
  
  public abstract int bxZ();
  
  public final m d(b paramb)
  {
    GMTrace.i(1528874139648L, 11391);
    paramb = (atm)paramb.gtD.gtK;
    m localm = new m();
    localm.uxa = paramb.uxa;
    localm.uwZ = paramb.uwZ;
    localm.uwY = paramb.uwY;
    localm.uwX = paramb.uwX;
    localm.kBl = paramb.uJe;
    localm.xDt = paramb.uJd;
    GMTrace.o(1528874139648L, 11391);
    return localm;
  }
  
  public final int getType()
  {
    GMTrace.i(1528337268736L, 11387);
    GMTrace.o(1528337268736L, 11387);
    return 1518;
  }
  
  public final void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1528203051008L, 11386);
    Object localObject2 = this.fUa;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).gtF = new atl();
      ((b.a)localObject1).gtG = new atm();
      ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/payu";
      ((b.a)localObject1).gtE = 1518;
      ((b.a)localObject1).gtH = 0;
      ((b.a)localObject1).gtI = 0;
      localObject1 = ((b.a)localObject1).DA();
      ((i)localObject1).gtT = true;
    }
    localObject2 = (atl)((b)localObject1).gtC.gtK;
    if (paramBoolean1) {
      ((atl)localObject2).uwU = bxZ();
    }
    if (paramBoolean2) {
      ((atl)localObject2).uwV = 1;
    }
    this.fUa = ((b)localObject1);
    GMTrace.o(1528203051008L, 11386);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\e\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */