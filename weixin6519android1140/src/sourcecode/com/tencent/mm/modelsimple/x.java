package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.av.i;
import com.tencent.mm.av.i.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.network.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.auth.PluginAuth;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.aqg;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhs;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.y.a;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.as;
import com.tencent.mm.y.au;
import com.tencent.mm.y.aw;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class x
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.e fUd;
  private final String gUO;
  private final String gUP;
  private final String gUQ;
  private final String gUR;
  private final String gUS;
  private final String gUT;
  private final int gUU;
  private final int gUV;
  private boolean gUW;
  public boolean gUX;
  public q guL;
  private int gup;
  
  public x(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, String paramString6, int paramInt2)
  {
    GMTrace.i(13165416939520L, 98090);
    this.gUW = true;
    this.gUX = false;
    this.gup = 2;
    w.d("MicroMsg.NetSceneReg", "NetSceneReg: username = " + paramString1 + " nickname = " + paramString3);
    w.d("MicroMsg.NetSceneReg", "NetSceneReg: bindUin = " + paramInt1 + "bindEmail = " + paramString4 + " bindMobile = " + paramString5);
    w.d("MicroMsg.NetSceneReg", "NetSceneReg: regMode = " + paramInt2 + " ticket: " + paramString6);
    this.gUV = paramInt2;
    this.guL = new aw();
    y.a locala = (y.a)this.guL.DC();
    locala.dp(0);
    locala.tKV.jhi = paramString1;
    locala.tKV.tUR = bg.Sr(paramString2);
    if (paramInt2 == 4)
    {
      locala.tKV.tUR = paramString6;
      w.w("MicroMsg.NetSceneReg", "dkreg rand:" + paramString6 + " reqMd5:" + locala.tKV.tUR);
    }
    locala.tKV.jio = paramString3;
    locala.tKV.tOs = paramInt1;
    locala.tKV.tOt = paramString4;
    locala.tKV.tOu = paramString5;
    locala.tKV.ugx = paramString6;
    locala.tKV.utH = paramInt2;
    locala.tKV.kBg = bg.bQP();
    locala.tKV.ugv = p.getSimCountryIso();
    locala.tKV.kBh = v.bPK();
    locala.tKV.tSx = 0;
    locala.tKV.uGh = 0;
    locala.tKV.uGi = p.getAndroidId();
    locala.tKV.ujc = p.tb();
    locala.tKV.uGj = ab.getContext().getSharedPreferences(ab.bPU(), 0).getString("installreferer", "");
    locala.tKV.uGk = com.tencent.mm.plugin.normsg.a.d.nxJ.rR(2);
    locala.tKV.uGl = ab.getContext().getSharedPreferences(ab.bPU() + "_google_aid", 4).getString("getgoogleaid", "");
    this.gUO = paramString1;
    this.gUP = paramString2;
    this.gUQ = paramString3;
    this.gUR = paramString4;
    this.gUS = paramString5;
    this.gUU = paramInt1;
    this.gUT = "";
    if (((paramString6 == null) || (paramString6.length() <= 0)) && (paramString4.length() <= 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.gUW = bool;
      locala.tKV.tSy = com.tencent.mm.kernel.a.wN();
      GMTrace.o(13165416939520L, 98090);
      return;
    }
  }
  
  public x(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt2, String paramString9, String paramString10, String paramString11, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13165551157248L, 98091);
    this.gUW = true;
    this.gUX = false;
    this.gup = 2;
    w.i("MicroMsg.NetSceneReg", "init: use:%s pwd:%s nick:%s bindqq:%d email:%s mobile:%s [%s,%s,%s] regmode:%d alias:%s [%s,%s] force:%b avatar:%b", new Object[] { paramString1, bg.SJ(paramString2), paramString3, Integer.valueOf(paramInt1), paramString4, paramString5, paramString6, paramString7, paramString8, Integer.valueOf(paramInt2), paramString9, paramString11, paramString10, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    this.gUV = paramInt2;
    this.guL = new aw();
    paramString6 = (y.a)this.guL.DC();
    paramString6.dp(0);
    paramString6.tKV.jhi = paramString1;
    paramString6.tKV.tUR = bg.Sr(paramString2);
    if (paramInt2 == 4)
    {
      paramString6.tKV.tUR = paramString8;
      w.w("MicroMsg.NetSceneReg", "dkreg rand:" + paramString8 + " reqMd5:" + paramString6.tKV.tUR);
    }
    paramString6.tKV.jio = paramString3;
    paramString6.tKV.tOs = paramInt1;
    paramString6.tKV.tOt = paramString4;
    paramString6.tKV.tOu = paramString5;
    paramString6.tKV.ugx = paramString8;
    paramString6.tKV.utH = paramInt2;
    paramString6.tKV.kBg = bg.bQP();
    paramString6.tKV.ugv = p.getSimCountryIso();
    paramString6.tKV.kBh = v.bPK();
    paramString6.tKV.tSx = 0;
    paramString6.tKV.gCC = paramString9;
    paramString6.tKV.utG = paramString11;
    paramString6.tKV.utF = paramString10;
    paramString7 = paramString6.tKV;
    if (paramBoolean1)
    {
      paramInt2 = 1;
      paramString7.tUH = paramInt2;
      paramString7 = paramString6.tKV;
      if (!paramBoolean2) {
        break label647;
      }
      paramInt2 = 1;
      label430:
      paramString7.uGg = paramInt2;
      paramString6.tKV.tSy = com.tencent.mm.kernel.a.wN();
      paramString6.tKV.uGi = p.getAndroidId();
      paramString6.tKV.ujc = p.tb();
      paramString6.tKV.uGj = ab.getContext().getSharedPreferences(ab.bPU(), 0).getString("installreferer", "");
      paramString6.tKV.uGk = com.tencent.mm.plugin.normsg.a.d.nxJ.rR(2);
      paramString6.tKV.uGl = ab.getContext().getSharedPreferences(ab.bPU() + "_google_aid", 4).getString("getgoogleaid", "");
      this.gUO = paramString1;
      this.gUP = paramString2;
      this.gUQ = paramString3;
      this.gUR = paramString4;
      this.gUS = paramString5;
      this.gUU = paramInt1;
      this.gUT = paramString9;
      if (((paramString8 != null) && (paramString8.length() > 0)) || ((paramString4 != null) && (paramString4.length() > 0))) {
        break label653;
      }
    }
    label647:
    label653:
    for (paramBoolean1 = true;; paramBoolean1 = false)
    {
      this.gUW = paramBoolean1;
      GMTrace.o(13165551157248L, 98091);
      return;
      paramInt2 = 0;
      break;
      paramInt2 = 0;
      break label430;
    }
  }
  
  public final int HH()
  {
    GMTrace.i(13166893334528L, 98101);
    Object localObject = ((y.b)this.guL.AZ()).tKW.tSl;
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
      GMTrace.o(13166893334528L, 98101);
      return i;
    }
  }
  
  public final byte[] HP()
  {
    GMTrace.i(13166490681344L, 98098);
    byte[] arrayOfByte = com.tencent.mm.platformtools.n.a(((y.b)this.guL.AZ()).tKW.utI, new byte[0]);
    GMTrace.o(13166490681344L, 98098);
    return arrayOfByte;
  }
  
  public final String HQ()
  {
    GMTrace.i(13166624899072L, 98099);
    String str = ((y.b)this.guL.AZ()).tKW.utF;
    GMTrace.o(13166624899072L, 98099);
    return str;
  }
  
  public final String LD()
  {
    GMTrace.i(13166759116800L, 98100);
    String str = ((y.b)this.guL.AZ()).tKW.uGw;
    GMTrace.o(13166759116800L, 98100);
    return str;
  }
  
  public final String LE()
  {
    GMTrace.i(13167027552256L, 98102);
    Object localObject = ((y.b)this.guL.AZ()).tKW.tSl;
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
      } while (localbhs.oqG != 2);
    }
    for (localObject = localbhs.uTC;; localObject = "")
    {
      GMTrace.o(13167027552256L, 98102);
      return (String)localObject;
    }
  }
  
  public final int LF()
  {
    GMTrace.i(13167161769984L, 98103);
    Object localObject = ((y.b)this.guL.AZ()).tKW.tSl;
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
      } while (localbhs.oqG != 3);
    }
    for (int i = bg.getInt(localbhs.uTC, 2);; i = 2)
    {
      GMTrace.o(13167161769984L, 98103);
      return i;
    }
  }
  
  public final String LG()
  {
    GMTrace.i(13167295987712L, 98104);
    Object localObject = ((y.b)this.guL.AZ()).tKW.tSl;
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
      } while (localbhs.oqG != 17);
    }
    for (localObject = localbhs.uTC;; localObject = null)
    {
      GMTrace.o(13167295987712L, 98104);
      return (String)localObject;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13165685374976L, 98092);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(13165685374976L, 98092);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(13165953810432L, 98094);
    int i = k.b.gum;
    GMTrace.o(13165953810432L, 98094);
    return i;
  }
  
  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, final byte[] paramArrayOfByte)
  {
    GMTrace.i(13166356463616L, 98097);
    paramArrayOfByte = (y.b)paramq.AZ();
    if ((paramInt2 == 4) && (paramInt3 == 65235))
    {
      au.a(true, paramArrayOfByte.tKW.tUT, paramArrayOfByte.tKW.tUU, paramArrayOfByte.tKW.tUS);
      this.gup -= 1;
      if (this.gup <= 0)
      {
        this.fUd.a(3, -1, "", this);
        GMTrace.o(13166356463616L, 98097);
        return;
      }
      a(this.gtW, this.fUd);
      GMTrace.o(13166356463616L, 98097);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.DC().tKq.ver;
      w.d("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13157095440384L, 98028);
          new m().a(x.this.gtW, new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              GMTrace.i(13159511359488L, 98046);
              w.d("MicroMsg.NetSceneReg", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymous2k.getType()), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
              if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
              {
                x.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", x.this);
                GMTrace.o(13159511359488L, 98046);
                return;
              }
              x.this.a(x.this.gtW, x.this.fUd);
              GMTrace.o(13159511359488L, 98046);
            }
          });
          GMTrace.o(13157095440384L, 98028);
        }
      });
      GMTrace.o(13166356463616L, 98097);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13166356463616L, 98097);
      return;
    }
    paramq = (y.a)paramq.DC();
    w.d("MicroMsg.NetSceneReg", "dkreg: pass:" + paramArrayOfByte.tKW.kAY + " regtype:" + paramArrayOfByte.tKW.tOw + " mode:" + paramq.tKV.utH);
    if ((paramArrayOfByte.tKW.kAW != 0) && (!this.gUW))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.fh(paramArrayOfByte.tKW.kAW);
      if (paramq.tKV.utH == 4) {
        com.tencent.mm.kernel.h.xy().xh().set(2, paramq.tKV.jhi);
      }
      com.tencent.mm.kernel.h.xy().xh().set(16, Integer.valueOf(1));
      com.tencent.mm.kernel.h.xy().xh().set(52, Integer.valueOf(paramArrayOfByte.tKW.tOw));
      com.tencent.mm.kernel.h.xy().xh().set(340240, Long.valueOf(System.currentTimeMillis()));
      com.tencent.mm.kernel.h.xy().xh().set(340241, Boolean.valueOf(true));
      if ((this.gUO != null) && (this.gUO.length() > 0) && (this.gUV != 1)) {
        paramArrayOfByte.tKW.jhi = this.gUO;
      }
      paramArrayOfByte.tKW.tOt = this.gUR;
      paramArrayOfByte.tKW.jhA = 0;
      if ((com.tencent.mm.kernel.h.xw().wL()) && (com.tencent.mm.kernel.h.xy().xh() != null))
      {
        paramq = this.gUT;
        paramInt1 = this.gUU;
        String str1 = this.gUQ;
        String str2 = this.gUS;
        String str3 = paramArrayOfByte.tKW.jhi;
        String str4 = paramArrayOfByte.tKW.tOt;
        int i = paramArrayOfByte.tKW.jhA;
        String str5 = paramArrayOfByte.tKW.tOz;
        String str6 = paramArrayOfByte.tKW.tOA;
        int j = paramArrayOfByte.tKW.tOB;
        int k = paramArrayOfByte.tKW.uGq;
        String str7 = paramArrayOfByte.tKW.tNa;
        String str8 = paramArrayOfByte.tKW.tOC;
        String str9 = paramArrayOfByte.tKW.tSi;
        Object localObject = paramArrayOfByte.tKW.uGp;
        w.i("MicroMsg.HandleAuthResponse", "dkwt updateProfile user:%s alias:%s qq:%s nick:%s email:%s mobile:%s status:%d offuser:%s offnick:%s pushmail:%d sendCard:%d session:%s fsurl:%s pluginFlag:%d atuhkey:%s a2:%s newa2:%s kisd:%s safedev:%d MicroBlog:%s emailpwd:%d", new Object[] { str3, paramq, o.getString(paramInt1), str1, str4, str2, Integer.valueOf(i), str5, str6, Integer.valueOf(j), Integer.valueOf(k), bg.SJ(str7), str8, Integer.valueOf(0), bg.SJ(str9), bg.SJ(null), bg.SJ(null), bg.SJ(null), Integer.valueOf(-1), localObject, Integer.valueOf(0) });
        localObject = com.tencent.mm.kernel.h.xy().xh();
        as.gnb.M("login_weixin_username", str3);
        as.gnb.c(str2, paramInt1, str4);
        ((t)localObject).set(2, str3);
        ((t)localObject).set(42, paramq);
        ((t)localObject).set(9, Integer.valueOf(paramInt1));
        ((t)localObject).set(4, str1);
        ((t)localObject).set(5, str4);
        ((t)localObject).set(6, str2);
        ((t)localObject).set(7, Integer.valueOf(i));
        ((t)localObject).set(21, str5);
        ((t)localObject).set(22, str6);
        ((t)localObject).set(57, Integer.valueOf(0));
        ((t)localObject).set(17, Integer.valueOf(j));
        ((t)localObject).set(25, Integer.valueOf(k));
        ((t)localObject).set(1, str7);
        ((t)localObject).set(29, str8);
        ((t)localObject).set(34, Integer.valueOf(0));
        ((t)localObject).set(256, Boolean.valueOf(false));
        w.i("MicroMsg.HandleAuthResponse", "summerstatus USERINFO_FORCE_UPDATE_AUTH set false");
        ((t)localObject).set(-1535680990, str9);
        ((t)localObject).set(46, null);
        ((t)localObject).set(72, null);
        ((t)localObject).set(64, Integer.valueOf(-1));
        ((t)localObject).kL(true);
        ((PluginAuth)com.tencent.mm.kernel.h.j(PluginAuth.class)).getHandleAuthResponseCallbacks().a(paramArrayOfByte, this.gUT, this.gUU, this.gUQ, this.gUS, 0);
        au.a(false, paramArrayOfByte.tKW.tUT, paramArrayOfByte.tKW.tUU, paramArrayOfByte.tKW.tUS);
        com.tencent.mm.kernel.h.xy().xh().kL(true);
        com.tencent.mm.kernel.h.wS().a(new bf(new bf.a()
        {
          public final void a(com.tencent.mm.network.e paramAnonymouse)
          {
            GMTrace.i(13159242924032L, 98044);
            if (paramAnonymouse == null)
            {
              GMTrace.o(13159242924032L, 98044);
              return;
            }
            paramAnonymouse.DY().i(paramArrayOfByte.hge, paramArrayOfByte.tKW.kAW);
            GMTrace.o(13159242924032L, 98044);
          }
        }), 0);
        w.d("MicroMsg.NetSceneReg", "resp return flag" + paramArrayOfByte.tKW.uGs);
        if ((paramArrayOfByte.tKW.uGs & 0x1) == 0) {
          break label1456;
        }
        bool = true;
        label1192:
        this.gUX = bool;
      }
    }
    else
    {
      paramq = new LinkedList();
      paramq.add(new i.a(21, "android-" + Build.VERSION.SDK_INT + "-" + Build.MODEL));
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new i(paramq));
      if ((paramInt2 == 0) && (paramInt3 == 0)) {
        com.tencent.mm.plugin.c.b.hI(HH());
      }
      paramInt1 = paramArrayOfByte.tKW.tSq;
      w.i("MicroMsg.NetSceneReg", "summerauth mmtls:%d", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().fYL.set(47, Integer.valueOf(paramInt1));
      paramq = com.tencent.mm.kernel.h.xx().fYr.gus;
      if (paramq != null) {
        if ((paramInt1 & 0x1) != 0) {
          break label1462;
        }
      }
    }
    label1456:
    label1462:
    for (boolean bool = true;; bool = false)
    {
      paramq.bp(bool);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13166356463616L, 98097);
      return;
      bool = com.tencent.mm.kernel.h.xw().wL();
      com.tencent.mm.kernel.h.xw();
      w.e("MicroMsg.NetSceneReg", "dkwt ERR: updateProfile acc:%b uin:%s userConfigStg:%s", new Object[] { Boolean.valueOf(bool), o.getString(com.tencent.mm.kernel.a.ww()), com.tencent.mm.kernel.h.xy().xh() });
      break;
      bool = false;
      break label1192;
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(13166088028160L, 98095);
    GMTrace.o(13166088028160L, 98095);
  }
  
  public final void gY(int paramInt)
  {
    GMTrace.i(20304726327296L, 151282);
    ((y.a)this.guL.DC()).tKV.tUN = paramInt;
    GMTrace.o(20304726327296L, 151282);
  }
  
  public final int getType()
  {
    GMTrace.i(13166222245888L, 98096);
    GMTrace.o(13166222245888L, 98096);
    return 126;
  }
  
  public final void lq(String paramString)
  {
    GMTrace.i(20304860545024L, 151283);
    if (!bg.nm(paramString)) {
      ((y.a)this.guL.DC()).tKV.tUO = paramString;
    }
    GMTrace.o(20304860545024L, 151283);
  }
  
  protected final int vB()
  {
    GMTrace.i(13165819592704L, 98093);
    GMTrace.o(13165819592704L, 98093);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */