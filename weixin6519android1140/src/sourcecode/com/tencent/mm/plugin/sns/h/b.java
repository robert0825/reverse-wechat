package com.tencent.mm.plugin.sns.h;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qa;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.tf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.Iterator;

public final class b
{
  c fJv;
  int fKa;
  public int juE;
  long pAA;
  long pAB;
  long pAC;
  long pAD;
  long pAE;
  long pAF;
  long pAG;
  long pAH;
  long pAI;
  long pAJ;
  long pAK;
  long pAL;
  long pAM;
  long pAN;
  long pAO;
  long pAP;
  long pAQ;
  long pAR;
  long pAS;
  long pAT;
  long pAU;
  long pAV;
  long pAW;
  String pAX;
  int pAY;
  long pAZ;
  int pAa;
  public int pAb;
  public int pAc;
  public int pAd;
  public int pAe;
  public int pAf;
  public int pAg;
  public int pAh;
  public int pAi;
  int pAj;
  int pAk;
  int pAl;
  int pAm;
  int pAn;
  int pAo;
  public int pAp;
  public int pAq;
  int pAr;
  int pAs;
  public long pAt;
  public long pAu;
  long pAv;
  long pAw;
  long pAx;
  long pAy;
  long pAz;
  public HashSet<String> pBA;
  public HashSet<String> pBB;
  public HashSet<String> pBC;
  public HashSet<String> pBD;
  public HashSet<String> pBE;
  public long pBF;
  private long pBa;
  long pBb;
  private long pBc;
  private HashSet<String> pBd;
  HashSet<String> pBe;
  public HashSet<String> pBf;
  HashSet<String> pBg;
  public HashSet<String> pBh;
  HashSet<String> pBi;
  HashSet<String> pBj;
  public HashSet<String> pBk;
  public HashSet<String> pBl;
  HashSet<String> pBm;
  public HashSet<String> pBn;
  private HashSet<String> pBo;
  public HashSet<String> pBp;
  public HashSet<String> pBq;
  public int pBr;
  public int pBs;
  public HashSet<String> pBt;
  public HashSet<String> pBu;
  public HashSet<String> pBv;
  public HashSet<String> pBw;
  public HashSet<String> pBx;
  public HashSet<String> pBy;
  public HashSet<String> pBz;
  public boolean pzI;
  public long pzJ;
  public long pzK;
  public int pzL;
  int pzM;
  int pzN;
  int pzO;
  public int pzP;
  public int pzQ;
  int pzR;
  public int pzS;
  public int pzT;
  public int pzU;
  public int pzV;
  public int pzW;
  public String pzX;
  public String pzY;
  String pzZ;
  
  public b()
  {
    GMTrace.i(8885347811328L, 66201);
    this.pzI = false;
    this.pzJ = -1L;
    this.pzK = 0L;
    this.pzL = 0;
    this.pzM = 0;
    this.pzN = 0;
    this.pzO = 0;
    this.pzP = 0;
    this.pzQ = 0;
    this.pzR = 0;
    this.pzS = 0;
    this.pzT = 0;
    this.pzU = 0;
    this.pzV = 0;
    this.pzW = 0;
    this.pzX = "";
    this.pzY = "";
    this.pzZ = "";
    this.pAb = 0;
    this.pAc = 0;
    this.pAd = 0;
    this.pAe = 0;
    this.pAf = 0;
    this.pAg = 0;
    this.pAh = 0;
    this.juE = 0;
    this.pAi = 0;
    this.pAj = 0;
    this.pAk = 0;
    this.pAl = 0;
    this.pAm = 0;
    this.pAn = 0;
    this.pAo = 0;
    this.pAp = 0;
    this.pAq = 0;
    this.pAr = 0;
    this.pAs = 0;
    this.pAt = 0L;
    this.pAu = 0L;
    this.pAv = 0L;
    this.pAw = 0L;
    this.pAx = 0L;
    this.pAy = 0L;
    this.pAz = 0L;
    this.pAA = 0L;
    this.pAB = 0L;
    this.pAC = 0L;
    this.pAD = 0L;
    this.pAE = 0L;
    this.pAF = 0L;
    this.pAG = 0L;
    this.pAH = 0L;
    this.pAI = 0L;
    this.pAJ = 0L;
    this.pAK = 0L;
    this.pAL = 0L;
    this.pAM = 0L;
    this.pAN = 0L;
    this.pAO = 0L;
    this.pAP = 0L;
    this.pAQ = 0L;
    this.pAR = 0L;
    this.pAS = 0L;
    this.pAT = 0L;
    this.pAU = 0L;
    this.pAV = 0L;
    this.pAW = 0L;
    this.pAZ = 0L;
    this.pBa = 0L;
    this.pBb = 0L;
    this.pBc = 0L;
    this.pBd = new HashSet();
    this.pBe = new HashSet();
    this.pBf = new HashSet();
    this.pBg = new HashSet();
    this.pBh = new HashSet();
    this.pBi = new HashSet();
    this.pBj = new HashSet();
    this.pBk = new HashSet();
    this.pBl = new HashSet();
    this.pBm = new HashSet();
    this.pBn = new HashSet();
    this.pBo = new HashSet();
    this.pBp = new HashSet();
    this.pBq = new HashSet();
    this.pBr = Integer.MAX_VALUE;
    this.pBs = 0;
    this.pBt = new HashSet();
    this.pBu = new HashSet();
    this.pBv = new HashSet();
    this.pBw = new HashSet();
    this.pBx = new HashSet();
    this.pBy = new HashSet();
    this.pBz = new HashSet();
    this.pBA = new HashSet();
    this.pBB = new HashSet();
    this.pBC = new HashSet();
    this.pBD = new HashSet();
    this.pBE = new HashSet();
    this.fJv = new c() {};
    this.pBF = 0L;
    a.vgX.b(this.fJv);
    GMTrace.o(8885347811328L, 66201);
  }
  
  public b(int paramInt1, String paramString, int paramInt2)
  {
    this();
    GMTrace.i(8885482029056L, 66202);
    this.fKa = paramInt1;
    this.pAX = paramString;
    this.pAY = paramInt2;
    GMTrace.o(8885482029056L, 66202);
  }
  
  static String f(HashSet<String> paramHashSet)
  {
    GMTrace.i(8885616246784L, 66203);
    StringBuffer localStringBuffer = new StringBuffer();
    paramHashSet = paramHashSet.iterator();
    int i = 1;
    while (paramHashSet.hasNext())
    {
      String str = (String)paramHashSet.next();
      if (i != 0)
      {
        localStringBuffer.append(str);
        i = 0;
      }
      else
      {
        localStringBuffer.append("|" + str);
      }
    }
    paramHashSet = localStringBuffer.toString();
    GMTrace.o(8885616246784L, 66203);
    return paramHashSet;
  }
  
  public final void a(m paramm, boolean paramBoolean)
  {
    GMTrace.i(8882931892224L, 66183);
    if (paramm == null)
    {
      GMTrace.o(8882931892224L, 66183);
      return;
    }
    if (paramBoolean) {
      this.pBi.add(i.g(paramm));
    }
    for (;;)
    {
      this.pBm.add(paramm.field_userName);
      this.pzO = this.pBm.size();
      if (!ae.biJ().equals(paramm.field_userName)) {
        break;
      }
      hF(true);
      GMTrace.o(8882931892224L, 66183);
      return;
      this.pBj.add(i.g(paramm));
    }
    hG(true);
    GMTrace.o(8882931892224L, 66183);
  }
  
  public final void dJ(String paramString1, String paramString2)
  {
    GMTrace.i(8883066109952L, 66184);
    this.pBg.add(paramString2);
    this.pBo.add(paramString1);
    this.pzR = this.pBo.size();
    GMTrace.o(8883066109952L, 66184);
  }
  
  public final void hE(boolean paramBoolean)
  {
    GMTrace.i(8883200327680L, 66185);
    if (paramBoolean)
    {
      this.pAw = System.currentTimeMillis();
      GMTrace.o(8883200327680L, 66185);
      return;
    }
    if (this.pAw > 0L)
    {
      this.pAv += System.currentTimeMillis() - this.pAw;
      this.pAw = 0L;
    }
    GMTrace.o(8883200327680L, 66185);
  }
  
  public final void hF(boolean paramBoolean)
  {
    GMTrace.i(8883334545408L, 66186);
    if (paramBoolean)
    {
      this.pAy = System.currentTimeMillis();
      GMTrace.o(8883334545408L, 66186);
      return;
    }
    if (this.pAy > 0L)
    {
      this.pAx += System.currentTimeMillis() - this.pAy;
      this.pAy = 0L;
    }
    GMTrace.o(8883334545408L, 66186);
  }
  
  public final void hG(boolean paramBoolean)
  {
    GMTrace.i(8883468763136L, 66187);
    if (paramBoolean)
    {
      this.pAA = System.currentTimeMillis();
      GMTrace.o(8883468763136L, 66187);
      return;
    }
    if (this.pAA > 0L)
    {
      this.pAz += System.currentTimeMillis() - this.pAA;
      this.pAA = 0L;
    }
    GMTrace.o(8883468763136L, 66187);
  }
  
  public final void hH(boolean paramBoolean)
  {
    GMTrace.i(8883602980864L, 66188);
    if (paramBoolean)
    {
      this.pAC = System.currentTimeMillis();
      GMTrace.o(8883602980864L, 66188);
      return;
    }
    if (this.pAC > 0L)
    {
      this.pAB += System.currentTimeMillis() - this.pAC;
      this.pAC = 0L;
    }
    GMTrace.o(8883602980864L, 66188);
  }
  
  public final void hI(boolean paramBoolean)
  {
    GMTrace.i(8883737198592L, 66189);
    if (paramBoolean)
    {
      this.pAE = System.currentTimeMillis();
      GMTrace.o(8883737198592L, 66189);
      return;
    }
    if (this.pAE > 0L)
    {
      this.pAD += System.currentTimeMillis() - this.pAE;
      this.pAE = 0L;
    }
    GMTrace.o(8883737198592L, 66189);
  }
  
  public final void hJ(boolean paramBoolean)
  {
    GMTrace.i(8883871416320L, 66190);
    if (paramBoolean)
    {
      this.pAG = System.currentTimeMillis();
      GMTrace.o(8883871416320L, 66190);
      return;
    }
    if (this.pAG > 0L)
    {
      this.pAF += System.currentTimeMillis() - this.pAG;
      this.pAG = 0L;
    }
    GMTrace.o(8883871416320L, 66190);
  }
  
  public final void hK(boolean paramBoolean)
  {
    GMTrace.i(8884005634048L, 66191);
    if (paramBoolean)
    {
      this.pBa = System.currentTimeMillis();
      GMTrace.o(8884005634048L, 66191);
      return;
    }
    if (this.pBa > 0L)
    {
      this.pAZ += System.currentTimeMillis() - this.pBa;
      this.pBa = 0L;
    }
    GMTrace.o(8884005634048L, 66191);
  }
  
  public final void hL(boolean paramBoolean)
  {
    GMTrace.i(8884139851776L, 66192);
    if (paramBoolean)
    {
      this.pBc = System.currentTimeMillis();
      GMTrace.o(8884139851776L, 66192);
      return;
    }
    if (this.pBc > 0L)
    {
      this.pBb += System.currentTimeMillis() - this.pBc;
      this.pBc = 0L;
    }
    GMTrace.o(8884139851776L, 66192);
  }
  
  public final void hM(boolean paramBoolean)
  {
    GMTrace.i(8884274069504L, 66193);
    if (paramBoolean)
    {
      this.pAI = System.currentTimeMillis();
      GMTrace.o(8884274069504L, 66193);
      return;
    }
    if (this.pAI > 0L)
    {
      this.pAH += System.currentTimeMillis() - this.pAI;
      this.pAI = 0L;
    }
    GMTrace.o(8884274069504L, 66193);
  }
  
  public final void hN(boolean paramBoolean)
  {
    GMTrace.i(8884408287232L, 66194);
    if (paramBoolean)
    {
      this.pAK = System.currentTimeMillis();
      GMTrace.o(8884408287232L, 66194);
      return;
    }
    if (this.pAK > 0L)
    {
      this.pAJ += System.currentTimeMillis() - this.pAK;
      this.pAK = 0L;
    }
    GMTrace.o(8884408287232L, 66194);
  }
  
  public final void hO(boolean paramBoolean)
  {
    GMTrace.i(8884542504960L, 66195);
    if (paramBoolean)
    {
      this.pAM = System.currentTimeMillis();
      GMTrace.o(8884542504960L, 66195);
      return;
    }
    if (this.pAM > 0L)
    {
      this.pAL += System.currentTimeMillis() - this.pAM;
      this.pAM = 0L;
    }
    GMTrace.o(8884542504960L, 66195);
  }
  
  public final void hP(boolean paramBoolean)
  {
    GMTrace.i(8884676722688L, 66196);
    if (paramBoolean)
    {
      this.pAO = System.currentTimeMillis();
      GMTrace.o(8884676722688L, 66196);
      return;
    }
    if (this.pAO > 0L)
    {
      this.pAN += System.currentTimeMillis() - this.pAO;
      this.pAO = 0L;
    }
    GMTrace.o(8884676722688L, 66196);
  }
  
  public final void hQ(boolean paramBoolean)
  {
    GMTrace.i(8884810940416L, 66197);
    if (paramBoolean)
    {
      this.pAS = System.currentTimeMillis();
      GMTrace.o(8884810940416L, 66197);
      return;
    }
    if (this.pAS > 0L)
    {
      this.pAR += System.currentTimeMillis() - this.pAS;
      this.pAS = 0L;
    }
    GMTrace.o(8884810940416L, 66197);
  }
  
  public final void hR(boolean paramBoolean)
  {
    GMTrace.i(8884945158144L, 66198);
    if (paramBoolean)
    {
      this.pAU = System.currentTimeMillis();
      GMTrace.o(8884945158144L, 66198);
      return;
    }
    if (this.pAU > 0L)
    {
      this.pAT += System.currentTimeMillis() - this.pAU;
      this.pAU = 0L;
    }
    GMTrace.o(8884945158144L, 66198);
  }
  
  public final void hS(boolean paramBoolean)
  {
    GMTrace.i(8885079375872L, 66199);
    if (paramBoolean)
    {
      this.pAW = System.currentTimeMillis();
      GMTrace.o(8885079375872L, 66199);
      return;
    }
    if (this.pAW > 0L)
    {
      this.pAV += System.currentTimeMillis() - this.pAW;
      this.pAW = 0L;
    }
    GMTrace.o(8885079375872L, 66199);
  }
  
  public final void hT(boolean paramBoolean)
  {
    GMTrace.i(8885213593600L, 66200);
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.pAa = i;
      GMTrace.o(8885213593600L, 66200);
      return;
    }
  }
  
  public final void u(m paramm)
  {
    GMTrace.i(8882663456768L, 66181);
    if (paramm == null)
    {
      GMTrace.o(8882663456768L, 66181);
      return;
    }
    this.pBd.add(paramm.blY());
    this.pzM = this.pBd.size();
    GMTrace.o(8882663456768L, 66181);
  }
  
  public final void v(m paramm)
  {
    GMTrace.i(8882797674496L, 66182);
    if (paramm == null)
    {
      GMTrace.o(8882797674496L, 66182);
      return;
    }
    String str1 = paramm.blY();
    String str2 = i.g(paramm);
    if (this.pBe.contains(str2))
    {
      GMTrace.o(8882797674496L, 66182);
      return;
    }
    w.i("MicroMsg.SnsBrowseInfoHelper", "onClickFeed localId:Td, snsId:%s", new Object[] { str1, str2 });
    this.pzN += 1;
    this.pBe.add(str2);
    if (paramm.uX(32)) {
      this.pAs += 1;
    }
    switch (paramm.field_type)
    {
    }
    while (paramm.uX(32)) {
      if ((paramm.blz() != null) && (paramm.blz().pCp))
      {
        hK(true);
        GMTrace.o(8882797674496L, 66182);
        return;
        this.pAl += 1;
        continue;
        this.pAn += 1;
        continue;
        this.pAm += 1;
        continue;
        this.pAo += 1;
        continue;
        this.pAr += 1;
        continue;
        if (!bg.nm(paramm.blD().uUd)) {
          this.pAj += 1;
        } else {
          this.pAk += 1;
        }
      }
      else
      {
        if (paramm.field_type == 1)
        {
          hP(true);
          GMTrace.o(8882797674496L, 66182);
          return;
        }
        if (paramm.field_type != 15) {
          break label464;
        }
        hQ(true);
        GMTrace.o(8882797674496L, 66182);
        return;
      }
    }
    if ((paramm.blD() != null) && (!bg.nm(paramm.blD().pRQ)))
    {
      hL(true);
      GMTrace.o(8882797674496L, 66182);
      return;
    }
    switch (paramm.field_type)
    {
    }
    for (;;)
    {
      label464:
      GMTrace.o(8882797674496L, 66182);
      return;
      hJ(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      hO(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      hM(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      hO(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      hS(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      if (!bg.nm(paramm.blD().uUd))
      {
        hN(true);
        GMTrace.o(8882797674496L, 66182);
        return;
      }
      hO(true);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */