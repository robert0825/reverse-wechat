package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.util.SparseArray;
import android.widget.AbsListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.in;
import com.tencent.mm.protocal.c.is;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.sortview.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class c
  extends b
{
  protected int gRb;
  protected String jtD;
  protected int jtF;
  private List<a> jtI;
  private int jtJ;
  private boolean jtK;
  protected boolean jtL;
  protected boolean jtM;
  int jtN;
  protected long[] jtO;
  protected b jtP;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10854590316544L, 80873);
    this.jtI = new ArrayList();
    j(true, true);
    this.jtK = true;
    c(new long[] { 1L });
    GMTrace.o(10854590316544L, 80873);
  }
  
  private static int a(a parama)
  {
    int j = 1;
    GMTrace.i(10855529840640L, 80880);
    if (parama == null)
    {
      GMTrace.o(10855529840640L, 80880);
      return 0;
    }
    int k = parama.count;
    int i;
    if (parama.jtS)
    {
      i = 1;
      if (!parama.jtT) {
        break label64;
      }
    }
    for (;;)
    {
      GMTrace.o(10855529840640L, 80880);
      return i + k + j;
      i = 0;
      break;
      label64:
      j = 0;
    }
  }
  
  private a a(in paramin)
  {
    GMTrace.i(10854858752000L, 80875);
    a locala = new a();
    locala.jtU = new LinkedList();
    locala.jtU.add(paramin);
    locala.eBk = paramin.tXu;
    locala.count = paramin.lSa.size();
    locala.gLP = paramin.tXv;
    locala.jtR = new LinkedList();
    locala.jtR.addAll(paramin.lSa);
    locala.jtQ = paramin.tXw;
    locala.jtS = this.jtM;
    if ((this.jtL) && (locala.gLP != 0)) {}
    for (boolean bool = true;; bool = false)
    {
      locala.jtT = bool;
      GMTrace.o(10854858752000L, 80875);
      return locala;
    }
  }
  
  private void aii()
  {
    boolean bool = true;
    for (;;)
    {
      int i;
      try
      {
        GMTrace.i(10855664058368L, 80881);
        HashMap localHashMap = new HashMap();
        i = 0;
        a locala;
        if (i < this.jtI.size())
        {
          locala = (a)this.jtI.get(i);
          if (locala != null) {
            localHashMap.put(Long.valueOf(locala.eBk), locala);
          }
        }
        else
        {
          this.jtI.clear();
          this.jtJ = 0;
          i = 0;
          int j;
          if (i < this.jtO.length)
          {
            locala = (a)localHashMap.get(Long.valueOf(this.jtO[i]));
            if (locala == null) {
              break label285;
            }
            this.jtI.add(locala);
            j = this.jtJ;
            this.jtJ = (a(locala) + j);
            break label285;
          }
          if (this.jtI.size() > 0)
          {
            locala = (a)this.jtI.get(this.jtI.size() - 1);
            if (locala.jtT == this.jtK)
            {
              j = this.jtJ;
              if (!locala.jtT) {
                continue;
              }
              i = -1;
              this.jtJ = (i + j);
              if (this.jtK) {
                continue;
              }
              locala.jtT = bool;
            }
          }
          localHashMap.clear();
          GMTrace.o(10855664058368L, 80881);
          return;
          i = 1;
          continue;
          bool = false;
          continue;
        }
        i += 1;
      }
      finally {}
      continue;
      label285:
      i += 1;
    }
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(10857140453376L, 80892);
    this.jtP = paramb;
    GMTrace.o(10857140453376L, 80892);
  }
  
  public void a(in paramin, boolean paramBoolean)
  {
    GMTrace.i(10854992969728L, 80876);
    if (((this.jtK) && (paramin == null)) || (paramin.lSa == null))
    {
      w.e("MicroMsg.BrandService.BizSearchResultAdapter", "The content or content.ItemList is null or the mode do not support to append data.");
      GMTrace.o(10854992969728L, 80876);
      return;
    }
    if (isEmpty()) {
      this.jtN = ((int)(System.currentTimeMillis() / 1000L));
    }
    a locala = aV(paramin.tXu);
    if (locala == null) {
      if (paramBoolean)
      {
        paramin = a(paramin);
        this.jtI.add(paramin);
        aii();
      }
    }
    for (;;)
    {
      af.t(this.wlp);
      GMTrace.o(10854992969728L, 80876);
      return;
      w.e("MicroMsg.BrandService.BizSearchResultAdapter", "The type(%d) do not exist.", new Object[] { Long.valueOf(paramin.tXu) });
      GMTrace.o(10854992969728L, 80876);
      return;
      if (locala.jtR == null) {
        locala.jtR = new LinkedList();
      }
      locala.jtR.addAll(paramin.lSa);
      if (locala.jtU == null) {
        locala.jtU = new LinkedList();
      }
      locala.jtU.add(paramin);
      locala.count += paramin.lSa.size();
      this.jtJ += paramin.lSa.size();
    }
  }
  
  final a aV(long paramLong)
  {
    GMTrace.i(10855127187456L, 80877);
    int i = 0;
    if (i < this.jtI.size()) {
      if (((a)this.jtI.get(i)).eBk != paramLong) {}
    }
    for (;;)
    {
      if (i < 0) {
        break label86;
      }
      a locala = (a)this.jtI.get(i);
      GMTrace.o(10855127187456L, 80877);
      return locala;
      i += 1;
      break;
      i = -1;
    }
    label86:
    GMTrace.o(10855127187456L, 80877);
    return null;
  }
  
  public void aij()
  {
    GMTrace.i(10856469364736L, 80887);
    c(null, null);
    this.jtN = 0;
    GMTrace.o(10856469364736L, 80887);
  }
  
  public void c(String paramString, List<in> paramList)
  {
    GMTrace.i(10854724534272L, 80874);
    this.jtI.clear();
    this.wlo.clear();
    af.t(this.wlp);
    this.jtJ = 0;
    this.jtD = paramString;
    if (paramList != null)
    {
      this.jtN = ((int)(System.currentTimeMillis() / 1000L));
      int i = 0;
      while (i < paramList.size())
      {
        paramString = (in)paramList.get(i);
        if ((paramString != null) && (paramString.lSa != null) && (paramString.lSa.size() > 0))
        {
          paramString = a(paramString);
          this.jtJ += a(paramString);
          this.jtI.add(paramString);
          w.i("MicroMsg.BrandService.BizSearchResultAdapter", "type(%d) , count(%d) , offset(%d)", new Object[] { Long.valueOf(paramString.eBk), Integer.valueOf(paramString.count), Integer.valueOf(this.jtJ) });
        }
        i += 1;
      }
      aii();
    }
    af.t(this.wlp);
    GMTrace.o(10854724534272L, 80874);
  }
  
  public final void c(long... paramVarArgs)
  {
    GMTrace.i(10856200929280L, 80885);
    if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {
      this.jtO = paramVarArgs;
    }
    GMTrace.o(10856200929280L, 80885);
  }
  
  public int getCount()
  {
    GMTrace.i(10856335147008L, 80886);
    int i = this.jtJ;
    GMTrace.o(10856335147008L, 80886);
    return i;
  }
  
  public final void j(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(10855798276096L, 80882);
    this.jtM = paramBoolean1;
    this.jtL = paramBoolean2;
    GMTrace.o(10855798276096L, 80882);
  }
  
  protected final a lo(int paramInt)
  {
    GMTrace.i(10855261405184L, 80878);
    if (paramInt >= 0)
    {
      int i = 0;
      int j = 0;
      while (i < this.jtI.size())
      {
        a locala = (a)this.jtI.get(i);
        j += a(locala);
        if (paramInt < j)
        {
          GMTrace.o(10855261405184L, 80878);
          return locala;
        }
        i += 1;
      }
    }
    GMTrace.o(10855261405184L, 80878);
    return null;
  }
  
  protected final in lp(int paramInt)
  {
    int k = 0;
    GMTrace.i(10855395622912L, 80879);
    if (paramInt >= 0)
    {
      int i = 0;
      int j = 0;
      while (i < this.jtI.size())
      {
        a locala = (a)this.jtI.get(i);
        int m = a(locala);
        j += m;
        if (paramInt < j)
        {
          if (locala.jtS)
          {
            i = 1;
            j = i + (j - m);
            i = k;
          }
          for (;;)
          {
            if (i >= locala.jtU.size()) {
              break label162;
            }
            in localin = (in)locala.jtU.get(i);
            j += localin.lSa.size();
            if (paramInt < j)
            {
              GMTrace.o(10855395622912L, 80879);
              return localin;
              i = 0;
              break;
            }
            i += 1;
          }
        }
        i += 1;
      }
    }
    label162:
    GMTrace.o(10855395622912L, 80879);
    return null;
  }
  
  public final void lq(int paramInt)
  {
    GMTrace.i(10855932493824L, 80883);
    this.gRb = paramInt;
    GMTrace.o(10855932493824L, 80883);
  }
  
  public final void lr(int paramInt)
  {
    GMTrace.i(10856066711552L, 80884);
    this.jtF = paramInt;
    GMTrace.o(10856066711552L, 80884);
  }
  
  protected final com.tencent.mm.ui.base.sortview.a ls(int paramInt)
  {
    int k = 0;
    GMTrace.i(20419885137920L, 152140);
    int i = 0;
    int j = 0;
    while (i < this.jtI.size())
    {
      Object localObject2 = (a)this.jtI.get(i);
      int m = a((a)localObject2);
      j += m;
      if ((((a)localObject2).jtS) && (paramInt == j - m)) {
        if (((a)localObject2).jtU.size() == 0) {
          localObject1 = null;
        }
      }
      while (localObject1 != null)
      {
        localObject1 = new d(((in)localObject1).eBt);
        GMTrace.o(20419885137920L, 152140);
        return (com.tencent.mm.ui.base.sortview.a)localObject1;
        localObject1 = (in)((a)localObject2).jtU.get(0);
        continue;
        if ((((a)localObject2).jtT) && (paramInt == j - 1))
        {
          localObject1 = new e(null, ((a)localObject2).eBk, ((a)localObject2).count, this.jtD);
          GMTrace.o(20419885137920L, 152140);
          return (com.tencent.mm.ui.base.sortview.a)localObject1;
        }
        if (paramInt < j)
        {
          m = ((a)localObject2).count;
          i = k;
          if (((a)localObject2).jtT) {
            i = 1;
          }
          i += paramInt - j + m;
          localObject1 = (is)((a)localObject2).jtR.get(i);
          long l = ((a)localObject2).eBk;
          localObject2 = this.jtP;
          if (localObject1 == null)
          {
            w.e("MicroMsg.BrandService.BizSearchResultAdapter", "data is null.");
            GMTrace.o(20419885137920L, 152140);
            return null;
          }
          if (l == 1L)
          {
            w.v("MicroMsg.BrandService.BizSearchResultAdapter", "Create a BizContactDataItem.");
            localObject1 = new a(localObject1);
          }
          for (;;)
          {
            if ((localObject1 instanceof com.tencent.mm.plugin.brandservice.ui.base.a))
            {
              com.tencent.mm.plugin.brandservice.ui.base.a locala = (com.tencent.mm.plugin.brandservice.ui.base.a)localObject1;
              locala.lw(i);
              locala.lx(paramInt);
              locala.a((b)localObject2);
            }
            GMTrace.o(20419885137920L, 152140);
            return (com.tencent.mm.ui.base.sortview.a)localObject1;
            if (l == 4L) {
              localObject1 = new g(localObject1);
            } else if (l == 1073741824L) {
              localObject1 = new g(localObject1);
            } else {
              localObject1 = new g(localObject1);
            }
          }
        }
      }
      i += 1;
    }
    Object localObject1 = new g(null);
    GMTrace.o(20419885137920L, 152140);
    return (com.tencent.mm.ui.base.sortview.a)localObject1;
  }
  
  protected Object[] lt(int paramInt)
  {
    GMTrace.i(10857006235648L, 80891);
    Object localObject2 = lo(paramInt);
    Object localObject1 = lp(paramInt);
    if (localObject1 != null) {}
    for (localObject1 = ((in)localObject1).tXx; localObject2 != null; localObject1 = "")
    {
      localObject2 = ((a)localObject2).jtQ;
      paramInt = this.jtF;
      GMTrace.o(10857006235648L, 80891);
      return new Object[] { this, localObject2, Integer.valueOf(paramInt), localObject1 };
    }
    GMTrace.o(10857006235648L, 80891);
    return null;
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(10856737800192L, 80889);
    GMTrace.o(10856737800192L, 80889);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(10856603582464L, 80888);
    GMTrace.o(10856603582464L, 80888);
  }
  
  protected static final class a
  {
    public int count;
    public long eBk;
    public int gLP;
    public List<String> jtQ;
    public List<is> jtR;
    public boolean jtS;
    public boolean jtT;
    public List<in> jtU;
    
    protected a()
    {
      GMTrace.i(10877675765760L, 81045);
      GMTrace.o(10877675765760L, 81045);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(c paramc, com.tencent.mm.ui.base.sortview.a parama, int paramInt1, String paramString, int paramInt2, int paramInt3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */