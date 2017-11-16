package com.tencent.mm.view.f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a.b;
import com.tencent.mm.g.a.qs;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.protocal.c.bef;
import com.tencent.mm.protocal.c.beg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  public int QU;
  private final String TAG;
  public int gRb;
  public int iPJ;
  public int iPK;
  public int lyd;
  private Context sN;
  public String tzq;
  public boolean xCA;
  public boolean xCB;
  public boolean xCC;
  public boolean xCD;
  public boolean xCE;
  public boolean xCF;
  public boolean xCG;
  public boolean xCH;
  public boolean xCI;
  public int[] xCJ;
  public boolean xCK;
  public boolean xCL;
  public ArrayList<com.tencent.mm.view.c.a> xCM;
  public HashMap<String, Integer> xCN;
  public com.tencent.mm.sdk.b.c xCO;
  public volatile boolean xCP;
  public int xCl;
  public int xCm;
  public int xCn;
  public int xCo;
  public int xCp;
  public int xCq;
  public int xCr;
  public int xCs;
  private int xCt;
  public int xCu;
  public int xCv;
  public int xCw;
  public int xCx;
  public String xCy;
  public int xCz;
  public int xdQ;
  public int xzw;
  
  public a()
  {
    GMTrace.i(20111587016704L, 149843);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelStg";
    this.xdQ = 0;
    this.xCv = 0;
    this.QU = 0;
    this.lyd = 0;
    this.xCy = "";
    this.xCz = 0;
    this.xCH = false;
    this.xCI = false;
    this.xCM = new ArrayList();
    this.xCN = new HashMap();
    this.xCP = false;
    this.sN = ab.getContext();
    this.xCm = this.sN.getResources().getDimensionPixelSize(a.c.aRY);
    this.xCl = this.sN.getResources().getDimensionPixelSize(a.c.kvK);
    this.xCn = this.sN.getResources().getDimensionPixelSize(a.c.kvJ);
    this.xCs = com.tencent.mm.br.a.fromDPToPix(this.sN, 48);
    this.xCt = com.tencent.mm.br.a.fromDPToPix(this.sN, 43);
    this.xCp = com.tencent.mm.br.a.fromDPToPix(this.sN, 86);
    this.xCq = com.tencent.mm.br.a.fromDPToPix(this.sN, 80);
    this.xCr = com.tencent.mm.br.a.fromDPToPix(this.sN, 65);
    this.xCo = com.tencent.mm.br.a.V(this.sN, a.c.aPv);
    this.xCx = com.tencent.mm.br.a.fromDPToPix(this.sN, 6);
    this.xCy = "TAG_DEFAULT_TAB";
    this.xCz = 0;
    this.xzw = com.tencent.mm.br.a.V(this.sN, a.c.kvQ);
    this.xCu = com.tencent.mm.br.a.V(this.sN, a.c.aPv);
    cly();
    clp();
    GMTrace.o(20111587016704L, 149843);
  }
  
  private int[] aaW()
  {
    GMTrace.i(20114808242176L, 149867);
    int[] arrayOfInt = new int[2];
    Object localObject;
    if ((this.sN instanceof Activity))
    {
      localObject = new DisplayMetrics();
      ((Activity)this.sN).getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
      arrayOfInt[0] = ((DisplayMetrics)localObject).widthPixels;
      arrayOfInt[1] = ((DisplayMetrics)localObject).heightPixels;
    }
    for (;;)
    {
      GMTrace.o(20114808242176L, 149867);
      return arrayOfInt;
      localObject = ((WindowManager)this.sN.getSystemService("window")).getDefaultDisplay();
      arrayOfInt[0] = ((Display)localObject).getWidth();
      arrayOfInt[1] = ((Display)localObject).getHeight();
    }
  }
  
  public static boolean cll()
  {
    GMTrace.i(20111855452160L, 149845);
    for (;;)
    {
      try
      {
        a.b localb;
        if (((f)h.xv().wZ()).eR(""))
        {
          com.tencent.mm.bq.a.bOv();
          localb = com.tencent.mm.bq.a.veh;
          bool1 = a.b.Ae(208913);
        }
        boolean bool1 = false;
      }
      catch (Exception localException1)
      {
        try
        {
          com.tencent.mm.bq.a.bOv();
          localb = com.tencent.mm.bq.a.veh;
          bool2 = a.b.Ae(208899);
          if ((!bool2) && (!bool1)) {
            continue;
          }
          GMTrace.o(20111855452160L, 149845);
          return true;
        }
        catch (Exception localException2)
        {
          continue;
        }
        localException1 = localException1;
        bool1 = false;
        w.e("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "[cpan] get new emoji flag faild.%s", new Object[] { localException1.toString() });
        bool2 = false;
        continue;
        GMTrace.o(20111855452160L, 149845);
        return false;
      }
      boolean bool2 = false;
    }
  }
  
  public static boolean clm()
  {
    GMTrace.i(20111989669888L, 149846);
    for (;;)
    {
      try
      {
        if (((f)h.xv().wZ()).eR("")) {
          bool1 = com.tencent.mm.s.c.vK().aD(262147, 266244);
        }
        boolean bool3;
        boolean bool1 = false;
      }
      catch (Exception localException1)
      {
        try
        {
          bool3 = com.tencent.mm.s.c.vK().aD(262149, 266244);
          bool2 = bool1;
          bool1 = bool3;
          if ((!bool2) && (!bool1)) {
            continue;
          }
          GMTrace.o(20111989669888L, 149846);
          return true;
        }
        catch (Exception localException2)
        {
          bool2 = bool1;
          continue;
        }
        localException1 = localException1;
        bool2 = false;
        w.e("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "[cpan] get new emoji flag faild.%s", new Object[] { localException1.toString() });
        bool1 = false;
        continue;
        GMTrace.o(20111989669888L, 149846);
        return false;
      }
      boolean bool2 = false;
    }
  }
  
  public static EmojiGroupInfo clq()
  {
    GMTrace.i(20112929193984L, 149853);
    EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
    localEmojiGroupInfo.field_productID = "TAG_DEFAULT_TAB";
    GMTrace.o(20112929193984L, 149853);
    return localEmojiGroupInfo;
  }
  
  public static EmojiGroupInfo clr()
  {
    GMTrace.i(20113063411712L, 149854);
    EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
    localEmojiGroupInfo.field_productID = String.valueOf(EmojiGroupInfo.vCm);
    GMTrace.o(20113063411712L, 149854);
    return localEmojiGroupInfo;
  }
  
  public static boolean d(EmojiGroupInfo paramEmojiGroupInfo)
  {
    GMTrace.i(20113197629440L, 149855);
    if ((paramEmojiGroupInfo != null) && (paramEmojiGroupInfo.field_packStatus == 1))
    {
      GMTrace.o(20113197629440L, 149855);
      return true;
    }
    GMTrace.o(20113197629440L, 149855);
    return false;
  }
  
  public static boolean isSDCardAvailable()
  {
    GMTrace.i(20114539806720L, 149865);
    if (((f)h.xv().wZ()).eR(""))
    {
      h.xz();
      boolean bool = h.xy().isSDCardAvailable();
      GMTrace.o(20114539806720L, 149865);
      return bool;
    }
    GMTrace.o(20114539806720L, 149865);
    return true;
  }
  
  public final void EI(int paramInt)
  {
    GMTrace.i(20112258105344L, 149848);
    this.iPJ = paramInt;
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "set viewpager height px: %d mViewPagerHeightPx:%d ", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.iPJ) });
    GMTrace.o(20112258105344L, 149848);
  }
  
  public final com.tencent.mm.view.c.a EJ(int paramInt)
  {
    GMTrace.i(20113600282624L, 149858);
    if (this.xCM == null)
    {
      GMTrace.o(20113600282624L, 149858);
      return null;
    }
    com.tencent.mm.view.c.a locala = (com.tencent.mm.view.c.a)this.xCM.get(EK(paramInt));
    GMTrace.o(20113600282624L, 149858);
    return locala;
  }
  
  public final int EK(int paramInt)
  {
    GMTrace.i(20113734500352L, 149859);
    if ((this.xCJ == null) || (paramInt >= this.xCJ.length) || (paramInt <= 0))
    {
      GMTrace.o(20113734500352L, 149859);
      return 0;
    }
    paramInt = this.xCJ[paramInt];
    GMTrace.o(20113734500352L, 149859);
    return paramInt;
  }
  
  public final int Xo(String paramString)
  {
    GMTrace.i(20112123887616L, 149847);
    if ("TAG_DEFAULT_TAB".equals(paramString))
    {
      i = this.xCs;
      GMTrace.o(20112123887616L, 149847);
      return i;
    }
    int i = this.xCp;
    GMTrace.o(20112123887616L, 149847);
    return i;
  }
  
  public final void Xp(String paramString)
  {
    GMTrace.i(20112526540800L, 149850);
    if (bg.nm(paramString))
    {
      GMTrace.o(20112526540800L, 149850);
      return;
    }
    this.xCy = paramString;
    GMTrace.o(20112526540800L, 149850);
  }
  
  public final com.tencent.mm.view.c.a Xq(String paramString)
  {
    GMTrace.i(20113466064896L, 149857);
    if ((this.xCM == null) || (paramString == null))
    {
      w.w("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "getTab failed.");
      GMTrace.o(20113466064896L, 149857);
      return null;
    }
    Iterator localIterator = this.xCM.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.view.c.a locala = (com.tencent.mm.view.c.a)localIterator.next();
      if (locala == null)
      {
        w.e("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "get null tab");
      }
      else if (locala.klt == null)
      {
        w.e("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "get null tab productId");
      }
      else if (locala.klt.equals(paramString))
      {
        GMTrace.o(20113466064896L, 149857);
        return locala;
      }
    }
    GMTrace.o(20113466064896L, 149857);
    return null;
  }
  
  public final int Xr(String paramString)
  {
    int j = 4;
    GMTrace.i(20114271371264L, 149863);
    if (bg.nm(paramString))
    {
      GMTrace.o(20114271371264L, 149863);
      return 0;
    }
    if (paramString.equals("TAG_DEFAULT_TAB"))
    {
      if (clw())
      {
        GMTrace.o(20114271371264L, 149863);
        return 7;
      }
      i = cln() / this.xCt;
      GMTrace.o(20114271371264L, 149863);
      return i;
    }
    if (this.iPJ <= 0)
    {
      GMTrace.o(20114271371264L, 149863);
      return 0;
    }
    if (paramString.equals("TAG_STORE_TAB"))
    {
      GMTrace.o(20114271371264L, 149863);
      return 3;
    }
    int i = cln() / this.xCq;
    if (clw()) {
      if (i > 4) {
        i = j;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "return calc Col Nums: %d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(20114271371264L, 149863);
      return i;
    }
  }
  
  public final int cln()
  {
    GMTrace.i(20112392323072L, 149849);
    if (this.iPK <= 1) {
      this.iPK = aaW()[0];
    }
    int i = this.iPK;
    GMTrace.o(20112392323072L, 149849);
    return i;
  }
  
  public final void clo()
  {
    GMTrace.i(20112660758528L, 149851);
    if (bg.nm(this.xCy))
    {
      GMTrace.o(20112660758528L, 149851);
      return;
    }
    if (this.xCA)
    {
      GMTrace.o(20112660758528L, 149851);
      return;
    }
    w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "save product Id:%s selected index:%d", new Object[] { this.xCy, Integer.valueOf(this.xCz) });
    com.tencent.mm.bq.a.bOv();
    a.b localb = com.tencent.mm.bq.a.veh;
    a.b.Rr(this.xCy);
    GMTrace.o(20112660758528L, 149851);
  }
  
  public final void clp()
  {
    GMTrace.i(20112794976256L, 149852);
    if (this.xCA)
    {
      if (!this.xCy.equals("TAG_DEFAULT_TAB"))
      {
        this.xCy = "TAG_DEFAULT_TAB";
        this.xCz = bg.a((Integer)this.xCN.get(this.xCy), 0);
      }
      GMTrace.o(20112794976256L, 149852);
      return;
    }
    com.tencent.mm.bq.a.bOv();
    a.b localb = com.tencent.mm.bq.a.veh;
    this.xCy = a.b.aE(-29414086, "TAG_DEFAULT_TAB");
    this.xCz = bg.a((Integer)this.xCN.get(this.xCy), 0);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "restoreShowProductId product id: %s selected index:%d", new Object[] { this.xCy, Integer.valueOf(this.xCz) });
    GMTrace.o(20112794976256L, 149852);
  }
  
  public final boolean cls()
  {
    GMTrace.i(20113331847168L, 149856);
    com.tencent.mm.bq.a.bOv();
    a.b localb = com.tencent.mm.bq.a.veh;
    if ((a.b.Ae(66832)) && (!this.xCG))
    {
      GMTrace.o(20113331847168L, 149856);
      return true;
    }
    GMTrace.o(20113331847168L, 149856);
    return false;
  }
  
  public final int clt()
  {
    GMTrace.i(20113868718080L, 149860);
    String str = this.xCy;
    if (this.xCM != null)
    {
      int i = 0;
      while (i < this.xCM.size())
      {
        com.tencent.mm.view.c.a locala = (com.tencent.mm.view.c.a)this.xCM.get(i);
        if ((locala != null) && (locala.klt.equals(str)))
        {
          GMTrace.o(20113868718080L, 149860);
          return i;
        }
        i += 1;
      }
    }
    GMTrace.o(20113868718080L, 149860);
    return 0;
  }
  
  public final com.tencent.mm.view.c.a clu()
  {
    GMTrace.i(20114002935808L, 149861);
    com.tencent.mm.view.c.a locala = Xq(this.xCy);
    GMTrace.o(20114002935808L, 149861);
    return locala;
  }
  
  public final void clv()
  {
    GMTrace.i(20114137153536L, 149862);
    this.lyd = 0;
    if (this.xCM == null)
    {
      GMTrace.o(20114137153536L, 149862);
      return;
    }
    Object localObject = this.xCM.iterator();
    int i;
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.view.c.a locala = (com.tencent.mm.view.c.a)((Iterator)localObject).next();
      i = this.lyd;
      this.lyd = (locala.cld() + i);
    }
    if (this.xCM != null) {}
    for (;;)
    {
      try
      {
        this.xCJ = new int[this.lyd];
        j = 0;
        i = 0;
        if (j < this.xCM.size())
        {
          localObject = (com.tencent.mm.view.c.a)this.xCM.get(j);
          k = 0;
          if (k >= ((com.tencent.mm.view.c.a)localObject).cld()) {
            continue;
          }
          int m = this.lyd;
          if (i < m) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        int j;
        int k;
        w.printErrStackTrace("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", localException, "", new Object[0]);
        continue;
      }
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "refreshAllCount count: %d", new Object[] { Integer.valueOf(this.lyd) });
      GMTrace.o(20114137153536L, 149862);
      return;
      this.xCJ[i] = j;
      k += 1;
      i += 1;
      continue;
      j += 1;
    }
  }
  
  public final boolean clw()
  {
    GMTrace.i(20114674024448L, 149866);
    if (this.QU == 0)
    {
      int[] arrayOfInt = aaW();
      if (arrayOfInt[0] >= arrayOfInt[1]) {
        break label54;
      }
    }
    label54:
    for (this.QU = 1; this.QU == 1; this.QU = 2)
    {
      GMTrace.o(20114674024448L, 149866);
      return true;
    }
    GMTrace.o(20114674024448L, 149866);
    return false;
  }
  
  public final void clx()
  {
    GMTrace.i(20114942459904L, 149868);
    if (this.xCO != null)
    {
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "remove succeed send listener");
      com.tencent.mm.sdk.b.a.vgX.c(this.xCO);
      this.xCO = null;
    }
    GMTrace.o(20114942459904L, 149868);
  }
  
  public final void cly()
  {
    GMTrace.i(20115210895360L, 149870);
    long l = System.currentTimeMillis();
    if (this.xCN == null) {
      this.xCN = new HashMap();
    }
    this.xCN.clear();
    Object localObject = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqE();
    if ((localObject != null) && (((bef)localObject).uPV != null) && (!((bef)localObject).uPV.isEmpty()))
    {
      localObject = ((bef)localObject).uPV.iterator();
      while (((Iterator)localObject).hasNext())
      {
        beg localbeg = (beg)((Iterator)localObject).next();
        this.xCN.put(localbeg.tRS, Integer.valueOf(localbeg.tTI));
      }
    }
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "restore smiley tab map use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(20115210895360L, 149870);
  }
  
  public final int dk(String paramString, int paramInt)
  {
    GMTrace.i(20114405588992L, 149864);
    paramInt = (this.iPJ - Xo(paramString) * paramInt) / (paramInt + 1);
    GMTrace.o(20114405588992L, 149864);
    return paramInt;
  }
  
  public final int getColumnWidth()
  {
    int j = 4;
    GMTrace.i(20115076677632L, 149869);
    int i;
    if (this.xdQ == 0)
    {
      i = cln() / this.xCq;
      if (!clw()) {
        break label71;
      }
      if (i <= 4) {
        break label68;
      }
      i = j;
    }
    label68:
    label71:
    for (;;)
    {
      this.xdQ = (cln() / i);
      i = this.xdQ;
      GMTrace.o(20115076677632L, 149869);
      return i;
    }
  }
  
  public final void onPause()
  {
    GMTrace.i(20111721234432L, 149844);
    this.xCF = false;
    clx();
    GMTrace.o(20111721234432L, 149844);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(20111452798976L, 149842);
      xCR = new a("RECOMMEND", 0);
      xCS = new a("DEFAULT", 1);
      xCT = new a("EMOJI", 2);
      xCU = new a[] { xCR, xCS, xCT };
      GMTrace.o(20111452798976L, 149842);
    }
    
    private a()
    {
      GMTrace.i(20111318581248L, 149841);
      GMTrace.o(20111318581248L, 149841);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */