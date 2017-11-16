package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsimple.m;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhs;
import com.tencent.mm.protocal.c.gl;
import com.tencent.mm.protocal.c.gm;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.m.a;
import com.tencent.mm.protocal.m.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.au;
import java.util.Iterator;
import java.util.LinkedList;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static a gDt;
  public com.tencent.mm.ad.e fUd;
  public final q guL;
  private int gup;
  
  public s(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3)
  {
    GMTrace.i(13173335785472L, 98149);
    this.fUd = null;
    this.gup = 2;
    this.guL = new b();
    m.a locala = (m.a)this.guL.DC();
    locala.tKx.tSK = paramInt1;
    w.d("MicroMsg.NetSceneBindMobileForReg", "Get mobile:" + paramString1 + " opcode:" + paramInt1 + " verifyCode:" + paramString2);
    locala.tKx.tUD = paramString1;
    locala.tKx.tUE = paramString2;
    locala.tKx.tUF = paramInt2;
    locala.tKx.tUG = paramString3;
    locala.tKx.kBh = v.bPK();
    locala.tKx.tSy = a.wN();
    if ((bg.nm(locala.tKx.tUI)) && (bg.nm(locala.tKx.tUJ)))
    {
      paramString2 = locala.tKx;
      if (gDt == null) {
        break label232;
      }
    }
    label232:
    for (paramString1 = gDt.HM();; paramString1 = "")
    {
      paramString2.tUI = paramString1;
      locala.tKx.tUJ = d.tJA;
      GMTrace.o(13173335785472L, 98149);
      return;
    }
  }
  
  public s(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    this(paramString1, paramInt1, paramString2, 0, paramString3);
    GMTrace.i(13173201567744L, 98148);
    ((m.a)this.guL.DC()).tKx.tSm = paramString4;
    GMTrace.o(13173201567744L, 98148);
  }
  
  public s(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this(paramString1, 11, paramString2, 0, paramString3, paramString4);
    GMTrace.i(13173067350016L, 98147);
    paramString1 = (m.a)this.guL.DC();
    paramString1.tKx.tUI = paramString5;
    paramString1.tKx.tUJ = paramString6;
    GMTrace.o(13173067350016L, 98147);
  }
  
  private int HH()
  {
    GMTrace.i(13175885922304L, 98168);
    Object localObject = ((m.b)this.guL.AZ()).tKy.tSl;
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
      GMTrace.o(13175885922304L, 98168);
      return i;
    }
  }
  
  public final int CD()
  {
    GMTrace.i(13173738438656L, 98152);
    int i = ((m.a)this.guL.DC()).tKx.tSK;
    GMTrace.o(13173738438656L, 98152);
    return i;
  }
  
  public final int HA()
  {
    GMTrace.i(20305128980480L, 151285);
    int i = ((m.b)this.guL.AZ()).tKy.tUN;
    GMTrace.o(20305128980480L, 151285);
    return i;
  }
  
  public final String HB()
  {
    GMTrace.i(20305263198208L, 151286);
    String str = ((m.b)this.guL.AZ()).tKy.tVa;
    GMTrace.o(20305263198208L, 151286);
    return str;
  }
  
  public final String HC()
  {
    GMTrace.i(20305397415936L, 151287);
    String str = ((m.b)this.guL.AZ()).tKy.tVb;
    GMTrace.o(20305397415936L, 151287);
    return str;
  }
  
  public final int HD()
  {
    GMTrace.i(13175349051392L, 98164);
    Object localObject = ((m.b)this.guL.AZ()).tKy.tSl;
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
      } while (localbhs.oqG != 6);
    }
    for (int i = bg.getInt(localbhs.uTC, 3);; i = 3)
    {
      GMTrace.o(13175349051392L, 98164);
      return i;
    }
  }
  
  public final int HE()
  {
    GMTrace.i(13175483269120L, 98165);
    Object localObject = ((m.b)this.guL.AZ()).tKy.tSl;
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
      } while (localbhs.oqG != 4);
    }
    for (int i = bg.getInt(localbhs.uTC, 30);; i = 30)
    {
      GMTrace.o(13175483269120L, 98165);
      return i;
    }
  }
  
  public final int HF()
  {
    GMTrace.i(13175617486848L, 98166);
    Object localObject = ((m.b)this.guL.AZ()).tKy.tSl;
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
      } while (localbhs.oqG != 5);
    }
    for (int i = bg.getInt(localbhs.uTC, 0);; i = 0)
    {
      GMTrace.o(13175617486848L, 98166);
      return i;
    }
  }
  
  public final boolean HG()
  {
    GMTrace.i(13175751704576L, 98167);
    Object localObject = ((m.b)this.guL.AZ()).tKy.tSl;
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
      } while (localbhs.oqG != 7);
    }
    for (int i = bg.getInt(localbhs.uTC, 0);; i = 0)
    {
      if (i > 0)
      {
        GMTrace.o(13175751704576L, 98167);
        return true;
      }
      GMTrace.o(13175751704576L, 98167);
      return false;
    }
  }
  
  public final boolean HI()
  {
    GMTrace.i(13176020140032L, 98169);
    Object localObject = ((m.b)this.guL.AZ()).tKy.tSl;
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
      } while (localbhs.oqG != 10);
    }
    for (int i = bg.getInt(localbhs.uTC, 0);; i = 0)
    {
      if (i > 0)
      {
        GMTrace.o(13176020140032L, 98169);
        return true;
      }
      GMTrace.o(13176020140032L, 98169);
      return false;
    }
  }
  
  public final String HJ()
  {
    GMTrace.i(13176154357760L, 98170);
    Object localObject = ((m.b)this.guL.AZ()).tKy.tSl;
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
      } while (localbhs.oqG != 14);
    }
    for (localObject = localbhs.uTC;; localObject = null)
    {
      GMTrace.o(13176154357760L, 98170);
      return (String)localObject;
    }
  }
  
  public final String HK()
  {
    GMTrace.i(13176288575488L, 98171);
    Object localObject = ((m.b)this.guL.AZ()).tKy.tSl;
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
      } while (localbhs.oqG != 15);
    }
    for (localObject = localbhs.uTC;; localObject = null)
    {
      GMTrace.o(13176288575488L, 98171);
      return (String)localObject;
    }
  }
  
  public final String HL()
  {
    GMTrace.i(20305531633664L, 151288);
    String str = ((m.b)this.guL.AZ()).tKy.tUO;
    GMTrace.o(20305531633664L, 151288);
    return str;
  }
  
  public final String Hw()
  {
    GMTrace.i(13174677962752L, 98159);
    String str = ((m.b)this.guL.AZ()).tKy.tUR;
    GMTrace.o(13174677962752L, 98159);
    return str;
  }
  
  public final String Hx()
  {
    GMTrace.i(13174946398208L, 98161);
    String str = ((m.b)this.guL.AZ()).tKy.eEU;
    GMTrace.o(13174946398208L, 98161);
    return str;
  }
  
  public final String Hy()
  {
    GMTrace.i(13175080615936L, 98162);
    String str = ((m.b)this.guL.AZ()).tKy.tSm;
    GMTrace.o(13175080615936L, 98162);
    return str;
  }
  
  public final String Hz()
  {
    GMTrace.i(13175214833664L, 98163);
    String str = ((m.b)this.guL.AZ()).tKy.tUY;
    GMTrace.o(13175214833664L, 98163);
    return str;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13173872656384L, 98153);
    this.fUd = parame1;
    parame1 = (m.a)this.guL.DC();
    if ((parame1.tKx.tUD == null) || (parame1.tKx.tUD.length() <= 0))
    {
      w.e("MicroMsg.NetSceneBindMobileForReg", "doScene getMobile Error: " + parame1.tKx.tUD);
      GMTrace.o(13173872656384L, 98153);
      return -1;
    }
    if (((parame1.tKx.tSK == 6) || (parame1.tKx.tSK == 9)) && ((parame1.tKx.tUE == null) || (parame1.tKx.tUE.length() <= 0)))
    {
      w.e("MicroMsg.NetSceneBindMobileForReg", "doScene getVerifyCode Error: " + parame1.tKx.tUD);
      GMTrace.o(13173872656384L, 98153);
      return -1;
    }
    int i = a(parame, this.guL, this);
    GMTrace.o(13173872656384L, 98153);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(13174275309568L, 98156);
    int i = k.b.gum;
    GMTrace.o(13174275309568L, 98156);
    return i;
  }
  
  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13174543745024L, 98158);
    w.d("MicroMsg.NetSceneBindMobileForReg", "dkidc onGYNetEnd  errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramArrayOfByte = (m.b)paramq.AZ();
    if ((paramInt2 == 4) && (paramInt3 == 65235))
    {
      au.a(true, paramArrayOfByte.tKy.tUT, paramArrayOfByte.tKy.tUU, paramArrayOfByte.tKy.tUS);
      this.gup -= 1;
      if (this.gup <= 0)
      {
        this.fUd.a(3, -1, "", this);
        GMTrace.o(13174543745024L, 98158);
        return;
      }
      a(this.gtW, this.fUd);
      GMTrace.o(13174543745024L, 98158);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.DC().tKq.ver;
      w.d("MicroMsg.NetSceneBindMobileForReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13177362317312L, 98179);
          new m().a(s.this.gtW, new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              GMTrace.i(13177764970496L, 98182);
              w.d("MicroMsg.NetSceneBindMobileForReg", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymous2k.getType()), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
              if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
              {
                s.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", s.this);
                GMTrace.o(13177764970496L, 98182);
                return;
              }
              s.this.a(s.this.gtW, s.this.fUd);
              GMTrace.o(13177764970496L, 98182);
            }
          });
          GMTrace.o(13177362317312L, 98179);
        }
      });
      GMTrace.o(13174543745024L, 98158);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneBindMobileForReg", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13174543745024L, 98158);
      return;
    }
    au.a(false, paramArrayOfByte.tKy.tUT, paramArrayOfByte.tKy.tUU, paramArrayOfByte.tKy.tUS);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      b.hI(HH());
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(13174543745024L, 98158);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(13174409527296L, 98157);
    GMTrace.o(13174409527296L, 98157);
  }
  
  public final void ge(int paramInt)
  {
    GMTrace.i(13173470003200L, 98150);
    ((m.a)this.guL.DC()).tKx.tUL = paramInt;
    GMTrace.o(13173470003200L, 98150);
  }
  
  public final int getType()
  {
    GMTrace.i(13174006874112L, 98154);
    GMTrace.o(13174006874112L, 98154);
    return 145;
  }
  
  public final String getUsername()
  {
    GMTrace.i(13174812180480L, 98160);
    String str = ((m.b)this.guL.AZ()).tKy.tRz;
    GMTrace.o(13174812180480L, 98160);
    return str;
  }
  
  public final void gf(int paramInt)
  {
    GMTrace.i(13173604220928L, 98151);
    ((m.a)this.guL.DC()).tKx.tUM = paramInt;
    GMTrace.o(13173604220928L, 98151);
  }
  
  public final void jU(String paramString)
  {
    GMTrace.i(20305665851392L, 151289);
    ((m.a)this.guL.DC()).tKx.tUO = paramString;
    GMTrace.o(20305665851392L, 151289);
  }
  
  protected final int vB()
  {
    GMTrace.i(13174141091840L, 98155);
    GMTrace.o(13174141091840L, 98155);
    return 3;
  }
  
  public static abstract interface a
  {
    public abstract String HM();
  }
  
  public static final class b
    extends i
  {
    private final m.a gDx;
    private final m.b gDy;
    
    public b()
    {
      GMTrace.i(13176422793216L, 98172);
      this.gDx = new m.a();
      this.gDy = new m.b();
      GMTrace.o(13176422793216L, 98172);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(13176557010944L, 98173);
      m.a locala = this.gDx;
      GMTrace.o(13176557010944L, 98173);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(13176691228672L, 98174);
      m.b localb = this.gDy;
      GMTrace.o(13176691228672L, 98174);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(13177093881856L, 98177);
      GMTrace.o(13177093881856L, 98177);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(13176825446400L, 98175);
      GMTrace.o(13176825446400L, 98175);
      return 145;
    }
    
    public final String getUri()
    {
      GMTrace.i(13176959664128L, 98176);
      GMTrace.o(13176959664128L, 98176);
      return "/cgi-bin/micromsg-bin/bindopmobileforreg";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */