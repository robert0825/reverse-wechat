package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelsimple.m;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.adw;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.t.a;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class x
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.e fUd;
  public final q guL;
  
  public x(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(4447572852736L, 33137);
    this.fUd = null;
    this.guL = new a();
    t.a locala = (t.a)this.guL.DC();
    locala.tKO.utC = paramString1;
    locala.tKO.utD = paramString2;
    locala.tKO.jio = paramString3;
    locala.tKO.utE = paramString4;
    locala.tKO.utF = paramString5;
    locala.tKO.utG = paramString6;
    locala.tKO.utH = paramInt;
    locala.tKO.kBh = v.bPK();
    locala.tKO.tSy = at.wN();
    GMTrace.o(4447572852736L, 33137);
  }
  
  public final byte[] HP()
  {
    GMTrace.i(4448512376832L, 33144);
    byte[] arrayOfByte = n.a(((t.b)this.guL.AZ()).tKP.utI, new byte[0]);
    GMTrace.o(4448512376832L, 33144);
    return arrayOfByte;
  }
  
  public final String HQ()
  {
    GMTrace.i(4448646594560L, 33145);
    String str = ((t.b)this.guL.AZ()).tKP.utF;
    GMTrace.o(4448646594560L, 33145);
    return str;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4447707070464L, 33138);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(4447707070464L, 33138);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(4448109723648L, 33141);
    int i = k.b.gum;
    GMTrace.o(4448109723648L, 33141);
    return i;
  }
  
  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4448378159104L, 33143);
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.DC().tKq.ver;
      w.d("MicroMsg.NetSceneGetSuggestAlias", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4433345773568L, 33031);
          new m().a(x.this.gtW, new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              GMTrace.i(4433614209024L, 33033);
              w.d("MicroMsg.NetSceneGetSuggestAlias", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymous2k.getType()), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
              if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
              {
                x.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", x.this);
                GMTrace.o(4433614209024L, 33033);
                return;
              }
              x.this.a(x.this.gtW, x.this.fUd);
              GMTrace.o(4433614209024L, 33033);
            }
          });
          GMTrace.o(4433345773568L, 33031);
        }
      });
      GMTrace.o(4448378159104L, 33143);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4448378159104L, 33143);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(4448243941376L, 33142);
    GMTrace.o(4448243941376L, 33142);
  }
  
  public final int getType()
  {
    GMTrace.i(4447841288192L, 33139);
    GMTrace.o(4447841288192L, 33139);
    return 429;
  }
  
  protected final int vB()
  {
    GMTrace.i(4447975505920L, 33140);
    GMTrace.o(4447975505920L, 33140);
    return 3;
  }
  
  public static final class a
    extends i
  {
    private final t.a gDE;
    private final t.b gDF;
    
    public a()
    {
      GMTrace.i(4454954827776L, 33192);
      this.gDE = new t.a();
      this.gDF = new t.b();
      GMTrace.o(4454954827776L, 33192);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(4455089045504L, 33193);
      t.a locala = this.gDE;
      GMTrace.o(4455089045504L, 33193);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(4455223263232L, 33194);
      t.b localb = this.gDF;
      GMTrace.o(4455223263232L, 33194);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(4455625916416L, 33197);
      GMTrace.o(4455625916416L, 33197);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(4455357480960L, 33195);
      GMTrace.o(4455357480960L, 33195);
      return 429;
    }
    
    public final String getUri()
    {
      GMTrace.i(4455491698688L, 33196);
      GMTrace.o(4455491698688L, 33196);
      return "/cgi-bin/micromsg-bin/getsuggestalias";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */