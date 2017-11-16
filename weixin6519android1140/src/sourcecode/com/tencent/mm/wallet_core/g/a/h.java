package com.tencent.mm.wallet_core.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.i;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.wallet.d;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.biv;
import com.tencent.mm.protocal.c.biw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.c.m;
import com.tencent.mm.wallet_core.c.r;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.Vector;
import org.json.JSONObject;

public abstract class h
  extends com.tencent.mm.wallet_core.c.h
{
  public static Vector<String> xDZ;
  protected boolean xDY;
  
  static
  {
    GMTrace.i(1522834341888L, 11346);
    xDZ = new Vector();
    int i = 0;
    while (i < d.tIL.length)
    {
      xDZ.add(d.tIL[i]);
      i += 1;
    }
    GMTrace.o(1522834341888L, 11346);
  }
  
  public h()
  {
    GMTrace.i(1520821075968L, 11331);
    this.xDY = false;
    GMTrace.o(1520821075968L, 11331);
  }
  
  private int e(com.tencent.mm.ad.b paramb)
  {
    GMTrace.i(1522163253248L, 11341);
    Object localObject1 = (biv)paramb.gtC.gtK;
    if (((biv)localObject1).uwW != null) {
      new String(((biv)localObject1).uwW.uNP.tJp);
    }
    if (((biv)localObject1).uJc != null) {
      new String(((biv)localObject1).uJc.uNP.tJp);
    }
    s.clV();
    if (this.xDY)
    {
      Object localObject2 = (biw)paramb.gtD.gtK;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new biw();
      }
      localObject2 = "".getBytes();
      ((biw)localObject1).uwX = new azp().be((byte[])localObject2);
      ((biw)localObject1).uxa = bxK();
      ((biw)localObject1).uwY = 0;
      try
      {
        localObject2 = new JSONObject(null);
        ((biw)localObject1).uJd = ((JSONObject)localObject2).optInt("TenpayErrType");
        ((biw)localObject1).uJe = ((JSONObject)localObject2).optString("TenpayErrMsg");
        a(1, 0, 0, "", paramb, null);
        GMTrace.o(1522163253248L, 11341);
        return 1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSenceTenPayBase", localException, "", new Object[0]);
        }
      }
    }
    GMTrace.o(1522163253248L, 11341);
    return -1;
  }
  
  public int Bb()
  {
    GMTrace.i(1522700124160L, 11345);
    GMTrace.o(1522700124160L, 11345);
    return 385;
  }
  
  public final String Kb(String paramString)
  {
    GMTrace.i(1521626382336L, 11337);
    paramString = TenpayUtil.signWith3Des(paramString);
    GMTrace.o(1521626382336L, 11337);
    return paramString;
  }
  
  public int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1522431688704L, 11343);
    this.fUd = parame1;
    String str1 = this.fUa.uri;
    if (xDZ.contains(str1))
    {
      w.d("MicroMsg.NetSenceTenPayBase", "black cgi bye bye %s", new Object[] { str1 });
      if (this.xDY)
      {
        i = e(this.fUa);
        if (i != -1)
        {
          GMTrace.o(1522431688704L, 11343);
          return i;
        }
      }
    }
    else
    {
      a.clF();
      w.i("MicroMsg.NetSenceTenPayBase", "cert try get errormsg %s", new Object[] { Integer.valueOf(a.getLastError()) });
      long l = System.currentTimeMillis();
      a.clF();
      a.init(ab.getContext());
      biv localbiv = (biv)this.fUa.gtC.gtK;
      str1 = "";
      String str2 = "";
      if (localbiv.uwW != null) {
        str1 = new String(localbiv.uwW.uNP.tJp);
      }
      if (localbiv.uJc != null) {
        str2 = new String(localbiv.uJc.uNP.tJp);
      }
      str1 = new String((str1 + "&&" + str2).getBytes());
      r.clT();
      str2 = r.clS();
      a.clF();
      if (a.isCertExist(str2))
      {
        g.ork.a(414L, 20L, 1L, true);
        a.clF();
        String str3 = a.genUserSig(str2, str1);
        g.ork.a(414L, 21L, System.currentTimeMillis() - l, true);
        w.v("MicroMsg.NetSenceTenPayBase", "sign ret src:%s sign:%s", new Object[] { str1, str3 });
        localbiv.sign = str3;
        localbiv.uTW = str2;
      }
      for (;;)
      {
        w.i("MicroMsg.NetSenceTenPayBase", "sign cost time %s cn %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), str2 });
        break;
        a.clF();
        w.i("MicroMsg.NetSenceTenPayBase", "cert not exist cn %s %s", new Object[] { str2, Integer.valueOf(a.getLastError()) });
      }
    }
    if (q.zR())
    {
      w.e("MicroMsg.NetSenceTenPayBase", "hy: serious error: is payupay");
      parame1.a(1000, -100868, "Pay Method Err", this);
      GMTrace.o(1522431688704L, 11343);
      return 1;
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(1522431688704L, 11343);
    return i;
  }
  
  public final void a(com.tencent.mm.ad.b paramb, azp paramazp)
  {
    GMTrace.i(1521760600064L, 11338);
    ((biv)paramb.gtC.gtK).uwW = paramazp;
    GMTrace.o(1521760600064L, 11338);
  }
  
  public abstract int aoD();
  
  public final void b(com.tencent.mm.ad.b paramb, azp paramazp)
  {
    GMTrace.i(1521894817792L, 11339);
    ((biv)paramb.gtC.gtK).uJc = paramazp;
    GMTrace.o(1521894817792L, 11339);
  }
  
  public boolean bjT()
  {
    GMTrace.i(1521357946880L, 11335);
    GMTrace.o(1521357946880L, 11335);
    return true;
  }
  
  public int bxK()
  {
    GMTrace.i(1521089511424L, 11333);
    int i = aoD();
    GMTrace.o(1521089511424L, 11333);
    return i;
  }
  
  public final void cme()
  {
    GMTrace.i(1522297470976L, 11342);
    this.xDY = true;
    GMTrace.o(1522297470976L, 11342);
  }
  
  public final m d(com.tencent.mm.ad.b paramb)
  {
    GMTrace.i(1522029035520L, 11340);
    paramb = (biw)paramb.gtD.gtK;
    m localm = new m();
    localm.uxa = paramb.uxa;
    localm.uwZ = paramb.uwZ;
    localm.uwY = paramb.uwY;
    localm.uwX = paramb.uwX;
    localm.kBl = paramb.uJe;
    localm.xDt = paramb.uJd;
    GMTrace.o(1522029035520L, 11340);
    return localm;
  }
  
  public int getType()
  {
    GMTrace.i(1521492164608L, 11336);
    GMTrace.o(1521492164608L, 11336);
    return 385;
  }
  
  public String getUri()
  {
    GMTrace.i(1522565906432L, 11344);
    GMTrace.o(1522565906432L, 11344);
    return "/cgi-bin/micromsg-bin/tenpay";
  }
  
  public void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1521223729152L, 11334);
    Object localObject1 = this.fUa;
    Object localObject2;
    boolean bool;
    if (localObject1 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).gtF = new biv();
      ((b.a)localObject1).gtG = new biw();
      localObject2 = getUri();
      int i = Bb();
      ((b.a)localObject1).uri = ((String)localObject2);
      ((b.a)localObject1).gtE = i;
      ((b.a)localObject1).gtH = 185;
      ((b.a)localObject1).gtI = 1000000185;
      localObject1 = ((b.a)localObject1).DA();
      if (!bjT())
      {
        bool = true;
        ((i)localObject1).gtT = bool;
      }
    }
    for (;;)
    {
      localObject2 = (biv)((com.tencent.mm.ad.b)localObject1).gtC.gtK;
      if (paramBoolean1) {
        ((biv)localObject2).uwU = aoD();
      }
      if (paramBoolean2) {
        ((biv)localObject2).uwV = 1;
      }
      this.fUa = ((com.tencent.mm.ad.b)localObject1);
      GMTrace.o(1521223729152L, 11334);
      return;
      bool = false;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\g\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */