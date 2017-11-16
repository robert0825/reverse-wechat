package com.tencent.mm.pluginsdk.j.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mk;
import com.tencent.mm.protocal.c.ml;
import com.tencent.mm.protocal.c.ri;
import com.tencent.mm.protocal.c.rj;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.q.a;
import com.tencent.mm.protocal.q.b;
import java.util.LinkedList;

public final class o
  extends n
{
  public o()
  {
    GMTrace.i(847048081408L, 6311);
    GMTrace.o(847048081408L, 6311);
  }
  
  public static void agL()
  {
    GMTrace.i(16426370859008L, 122386);
    o localo = new o();
    h.xx().fYr.a(localo, 0);
    GMTrace.o(16426370859008L, 122386);
  }
  
  protected final q bKj()
  {
    GMTrace.i(847584952320L, 6315);
    a locala = new a();
    q.a locala1 = (q.a)locala.tqS;
    locala1.dp(0);
    locala1.tKH.uhS.uhQ.udm.addAll(this.tqO);
    GMTrace.o(847584952320L, 6315);
    return locala;
  }
  
  protected final String getTag()
  {
    GMTrace.i(847182299136L, 6312);
    GMTrace.o(847182299136L, 6312);
    return "MicroMsg.ResDownloader.CheckResUpdate.NetSceneEncryptCheckResUpdate";
  }
  
  public final int getType()
  {
    GMTrace.i(847450734592L, 6314);
    GMTrace.o(847450734592L, 6314);
    return 722;
  }
  
  protected final ml i(q paramq)
  {
    GMTrace.i(847316516864L, 6313);
    paramq = ((a)paramq).tqT.tKK;
    GMTrace.o(847316516864L, 6313);
    return paramq;
  }
  
  private static final class a
    extends i
  {
    final q.a tqS;
    public final q.b tqT;
    
    public a()
    {
      GMTrace.i(852819443712L, 6354);
      this.tqS = new q.a();
      this.tqT = new q.b();
      GMTrace.o(852819443712L, 6354);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(852953661440L, 6355);
      q.a locala = this.tqS;
      GMTrace.o(852953661440L, 6355);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(853356314624L, 6358);
      q.b localb = this.tqT;
      GMTrace.o(853356314624L, 6358);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(853490532352L, 6359);
      GMTrace.o(853490532352L, 6359);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(853087879168L, 6356);
      GMTrace.o(853087879168L, 6356);
      return 722;
    }
    
    public final String getUri()
    {
      GMTrace.i(853222096896L, 6357);
      GMTrace.o(853222096896L, 6357);
      return "/cgi-bin/micromsg-bin/encryptcheckresupdate";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */