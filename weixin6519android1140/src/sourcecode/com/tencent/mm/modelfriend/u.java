package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhs;
import com.tencent.mm.protocal.c.qo;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.p.a;
import com.tencent.mm.protocal.p.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.au;
import java.util.Iterator;
import java.util.LinkedList;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public q guL;
  private int gup;
  
  private u(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(4436432781312L, 33054);
    this.gup = 2;
    this.guL = new a();
    p.a locala = (p.a)this.guL.DC();
    locala.tKF.tSK = paramInt;
    locala.tKF.tUp = paramString1;
    locala.tKF.kBh = v.bPK();
    locala.tKF.tUR = bg.Sr(paramString2);
    locala.tKF.ugu = paramString3;
    locala.tKF.tSy = at.wN();
    locala.tKF.ugv = p.getSimCountryIso();
    locala.tKF.ugw = 1;
    GMTrace.o(4436432781312L, 33054);
  }
  
  public u(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2, "");
    GMTrace.i(4436701216768L, 33056);
    GMTrace.o(4436701216768L, 33056);
  }
  
  public u(String paramString1, String paramString2, String paramString3)
  {
    this(2, paramString1, paramString2, paramString3);
    GMTrace.i(4436566999040L, 33055);
    GMTrace.o(4436566999040L, 33055);
  }
  
  public final int HH()
  {
    GMTrace.i(4437372305408L, 33061);
    Object localObject = ((p.b)this.guL.AZ()).tKG.tSl;
    bhs localbhs;
    if ((localObject != null) && (((bdz)localObject).uPQ != null) && (((bdz)localObject).uPQ.size() > 0))
    {
      localObject = ((bdz)localObject).uPQ.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localbhs = (bhs)((Iterator)localObject).next();
      } while (localbhs.oqG != 1);
    }
    for (int i = bg.getInt(localbhs.uTC, 0);; i = 0)
    {
      GMTrace.o(4437372305408L, 33061);
      return i;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4436835434496L, 33057);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(4436835434496L, 33057);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(4437238087680L, 33060);
    int i = k.b.gum;
    GMTrace.o(4437238087680L, 33060);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4436969652224L, 33058);
    w.i("MicroMsg.NetSceneEmailReg", "onGYNetEnd  errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramq = (p.b)paramq.AZ();
    if ((paramInt2 == 4) && (paramInt3 == 65235))
    {
      au.a(true, paramq.tKG.tUT, paramq.tKG.tUU, paramq.tKG.tUS);
      this.gup -= 1;
      if (this.gup <= 0)
      {
        this.fUd.a(3, -1, "", this);
        GMTrace.o(4436969652224L, 33058);
        return;
      }
      a(this.gtW, this.fUd);
      GMTrace.o(4436969652224L, 33058);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneEmailReg", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4436969652224L, 33058);
      return;
    }
    au.a(false, paramq.tKG.tUT, paramq.tKG.tUU, paramq.tKG.tUS);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      b.hI(HH());
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4436969652224L, 33058);
  }
  
  public final int getType()
  {
    GMTrace.i(4437506523136L, 33062);
    GMTrace.o(4437506523136L, 33062);
    return 481;
  }
  
  protected final int vB()
  {
    GMTrace.i(4437103869952L, 33059);
    GMTrace.o(4437103869952L, 33059);
    return 5;
  }
  
  public static final class a
    extends i
  {
    private p.b gDA;
    private p.a gDz;
    
    public a()
    {
      GMTrace.i(4418581823488L, 32921);
      this.gDz = new p.a();
      this.gDA = new p.b();
      GMTrace.o(4418581823488L, 32921);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(4419118694400L, 32925);
      p.a locala = this.gDz;
      GMTrace.o(4419118694400L, 32925);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(4418984476672L, 32924);
      p.b localb = this.gDA;
      GMTrace.o(4418984476672L, 32924);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(4419252912128L, 32926);
      GMTrace.o(4419252912128L, 32926);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(4418716041216L, 32922);
      GMTrace.o(4418716041216L, 32922);
      return 481;
    }
    
    public final String getUri()
    {
      GMTrace.i(4418850258944L, 32923);
      GMTrace.o(4418850258944L, 32923);
      return "/cgi-bin/micromsg-bin/emailreg";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */