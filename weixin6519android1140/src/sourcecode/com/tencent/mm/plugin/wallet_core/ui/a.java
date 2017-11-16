package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.g;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class a
{
  public f rkm;
  Map<String, q> rkn;
  Map<String, h> rko;
  
  public a(f paramf)
  {
    GMTrace.i(6992475193344L, 52098);
    this.rkm = null;
    this.rkn = null;
    this.rko = null;
    Assert.assertNotNull(paramf);
    this.rkm = paramf;
    PY();
    GMTrace.o(6992475193344L, 52098);
  }
  
  public static String[] Kv(String paramString)
  {
    GMTrace.i(6993280499712L, 52104);
    if (bg.nm(paramString))
    {
      GMTrace.o(6993280499712L, 52104);
      return null;
    }
    paramString = paramString.split("-");
    GMTrace.o(6993280499712L, 52104);
    return paramString;
  }
  
  private void PY()
  {
    int j = 0;
    GMTrace.i(6992609411072L, 52099);
    this.rkn = new HashMap();
    LinkedList localLinkedList = this.rkm.qXA;
    int i;
    Object localObject;
    if (localLinkedList != null)
    {
      i = 0;
      while (i < localLinkedList.size())
      {
        localObject = (q)localLinkedList.get(i);
        this.rkn.put(((q)localObject).qXt, localObject);
        i += 1;
      }
    }
    w.w("MicroMsg.FavorLogicHelper", "func[initData] favorList null");
    this.rko = new HashMap();
    if ((this.rkm.qXB != null) && (this.rkm.qXB.qXL != null))
    {
      localLinkedList = this.rkm.qXB.qXL;
      i = j;
      while (i < localLinkedList.size())
      {
        localObject = (h)localLinkedList.get(i);
        this.rko.put(((h)localObject).qXN, localObject);
        i += 1;
      }
      GMTrace.o(6992609411072L, 52099);
      return;
    }
    w.w("MicroMsg.FavorLogicHelper", "func[initData] favorComposeList null");
    GMTrace.o(6992609411072L, 52099);
  }
  
  public static boolean a(FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard)
  {
    GMTrace.i(6993817370624L, 52108);
    if (paramBankcard == null)
    {
      w.w("MicroMsg.FavorLogicHelper", "curBankcard null");
      GMTrace.o(6993817370624L, 52108);
      return true;
    }
    if ((paramFavorPayInfo != null) && (!bg.nm(paramFavorPayInfo.rgo)))
    {
      if (paramFavorPayInfo.rgp != 0) {}
      for (i = 1; (i != 0) && (!bg.nm(paramFavorPayInfo.rgq)) && (paramFavorPayInfo.rgt != null) && (paramFavorPayInfo.rgt.contains(paramBankcard.field_bindSerial)); i = 0)
      {
        GMTrace.o(6993817370624L, 52108);
        return false;
      }
    }
    if (paramFavorPayInfo.rgp != 0) {}
    for (int i = 1; (i != 0) && (((!bg.nm(paramFavorPayInfo.rgq)) && (paramBankcard.field_bankcardType != null) && (!paramBankcard.field_bankcardType.equals(paramFavorPayInfo.rgq))) || ((bg.nm(paramFavorPayInfo.rgq)) && (paramBankcard.field_bankcardType.equals("CFT")))); i = 0)
    {
      GMTrace.o(6993817370624L, 52108);
      return true;
    }
    GMTrace.o(6993817370624L, 52108);
    return false;
  }
  
  private static String bO(List<String> paramList)
  {
    GMTrace.i(6993951588352L, 52109);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramList.size())
    {
      localStringBuilder.append((String)paramList.get(i));
      if (i < paramList.size() - 1) {
        localStringBuilder.append("-");
      }
      i += 1;
    }
    paramList = localStringBuilder.toString();
    GMTrace.o(6993951588352L, 52109);
    return paramList;
  }
  
  public final Map<String, a> Ks(String paramString)
  {
    GMTrace.i(6992743628800L, 52100);
    paramString = aB(paramString, false);
    GMTrace.o(6992743628800L, 52100);
    return paramString;
  }
  
  public final List<q> Kt(String paramString)
  {
    GMTrace.i(6993012064256L, 52102);
    LinkedList localLinkedList = new LinkedList();
    if (this.rkm.qXA != null)
    {
      paramString = Ks(paramString);
      int i = 0;
      if (i < this.rkm.qXA.size())
      {
        q localq = (q)this.rkm.qXA.get(i);
        if (localq != null) {
          if (localq.qYq == 0) {
            break label115;
          }
        }
        label115:
        for (int j = 1;; j = 0)
        {
          if ((j != 0) && (paramString.containsKey(localq.qYr))) {
            localLinkedList.add(localq);
          }
          i += 1;
          break;
        }
      }
    }
    else
    {
      w.w("MicroMsg.FavorLogicHelper", "fucn[getBankFavorListWithSelectedCompId] mFavorInfo.tradeFavList null");
    }
    GMTrace.o(6993012064256L, 52102);
    return localLinkedList;
  }
  
  public final h Ku(String paramString)
  {
    GMTrace.i(6993146281984L, 52103);
    paramString = (h)this.rko.get(paramString);
    GMTrace.o(6993146281984L, 52103);
    return paramString;
  }
  
  public final String Kw(String paramString)
  {
    GMTrace.i(6993414717440L, 52105);
    paramString = aC(paramString, false);
    GMTrace.o(6993414717440L, 52105);
    return paramString;
  }
  
  public final FavorPayInfo Kx(String paramString)
  {
    GMTrace.i(6993683152896L, 52107);
    FavorPayInfo localFavorPayInfo = new FavorPayInfo();
    if (this.rko.get(paramString) == null)
    {
      localFavorPayInfo.rgo = "0";
      if (this.rkm != null) {
        localFavorPayInfo.rgr = this.rkm.qXz;
      }
      localFavorPayInfo.rgp = 0;
      GMTrace.o(6993683152896L, 52107);
      return localFavorPayInfo;
    }
    localFavorPayInfo.rgo = paramString;
    if (this.rkm != null) {
      localFavorPayInfo.rgr = this.rkm.qXz;
    }
    localFavorPayInfo.rgp = 0;
    paramString = Kv(paramString);
    if (paramString == null)
    {
      GMTrace.o(6993683152896L, 52107);
      return localFavorPayInfo;
    }
    int i = paramString.length - 1;
    for (;;)
    {
      if (i >= 0)
      {
        q localq = (q)this.rkn.get(paramString[i]);
        if (localq != null)
        {
          int j;
          if (localq.qYq != 0) {
            j = 1;
          }
          while (j != 0)
          {
            localFavorPayInfo.rgp = 1;
            if ((localq.qYt != null) && (localq.qYt.size() > 0))
            {
              localFavorPayInfo.rgt = new LinkedList();
              Iterator localIterator = localq.qYt.iterator();
              for (;;)
              {
                if (localIterator.hasNext())
                {
                  b localb = (b)localIterator.next();
                  localFavorPayInfo.rgt.add(com.tencent.mm.platformtools.n.a(localb));
                  continue;
                  j = 0;
                  break;
                }
              }
            }
            if (bg.nm(localq.qYr)) {
              break label294;
            }
            localFavorPayInfo.rgq = localq.qYr;
          }
        }
      }
      else
      {
        GMTrace.o(6993683152896L, 52107);
        return localFavorPayInfo;
      }
      label294:
      i -= 1;
    }
  }
  
  public final String Ky(String paramString)
  {
    GMTrace.i(6994085806080L, 52110);
    ArrayList localArrayList2 = com.tencent.mm.plugin.wallet_core.model.n.byx().iL(true);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    while (i < localArrayList2.size())
    {
      localHashMap.put(((Bankcard)localArrayList2.get(i)).field_bankcardType, Integer.valueOf(0));
      i += 1;
    }
    paramString = Kv(paramString);
    if (paramString != null)
    {
      i = 0;
      if (i < paramString.length)
      {
        localArrayList2 = paramString[i];
        q localq = (q)this.rkn.get(localArrayList2);
        int j;
        if (localq != null) {
          if (localq.qYq != 0)
          {
            j = 1;
            label131:
            if (j == 0) {
              break label183;
            }
            if ((localHashMap.containsKey(localq.qYr)) || (bg.nm(localq.qYr))) {
              localArrayList1.add(localArrayList2);
            }
          }
        }
        for (;;)
        {
          i += 1;
          break;
          j = 0;
          break label131;
          label183:
          localArrayList1.add(localArrayList2);
        }
      }
    }
    if (localArrayList1.size() == 0)
    {
      GMTrace.o(6994085806080L, 52110);
      return "0";
    }
    paramString = bO(localArrayList1);
    GMTrace.o(6994085806080L, 52110);
    return paramString;
  }
  
  public final Map<String, a> aB(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6992877846528L, 52101);
    HashMap localHashMap = new HashMap();
    LinkedList localLinkedList;
    if ((this.rkm.qXB != null) && (this.rkm.qXB.qXL != null))
    {
      localLinkedList = this.rkm.qXB.qXL;
      if (!this.rko.containsKey(paramString)) {
        break label441;
      }
    }
    label141:
    label415:
    label441:
    for (double d = ((h)this.rko.get(paramString)).qXO;; d = 0.0D)
    {
      int i = 0;
      if (i < localLinkedList.size())
      {
        h localh = (h)localLinkedList.get(i);
        a locala = null;
        Object localObject;
        if ((paramString.equals("0")) && (!localh.equals("0")))
        {
          localObject = localh.qXN;
          localObject = Kv((String)localObject);
          if ((localObject != null) && (localObject.length > 0))
          {
            localObject = (q)this.rkn.get(localObject[0]);
            if (localObject != null) {
              if (((q)localObject).qYq == 0) {
                break label415;
              }
            }
          }
        }
        for (int j = 1;; j = 0)
        {
          if ((j != 0) && (!bg.nm(((q)localObject).qYr)) && (((q)localObject).qYt.size() <= 0) && ((paramBoolean) || (!((q)localObject).qYr.equalsIgnoreCase("CFT"))))
          {
            locala = (a)localHashMap.get(((q)localObject).qYr);
            if ((locala == null) || (localh.qXO > locala.rkp.qXO))
            {
              locala = new a();
              locala.rkp = localh;
              locala.nEp = ((q)localObject).nEp;
              locala.rkq = (localh.qXO - d);
              locala.rkr = ((q)localObject).qYr;
              localHashMap.put(((q)localObject).qYr, locala);
            }
          }
          i += 1;
          break;
          localObject = locala;
          if (!localh.qXN.startsWith(paramString)) {
            break label141;
          }
          localObject = locala;
          if (paramString.equals(localh.qXN)) {
            break label141;
          }
          localObject = localh.qXN.replace(paramString + "-", "");
          break label141;
        }
        w.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
      }
      GMTrace.o(6992877846528L, 52101);
      return localHashMap;
    }
  }
  
  public final String aC(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6993548935168L, 52106);
    paramString = Kv(paramString);
    if (paramString != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      if (i < paramString.length)
      {
        q localq = (q)this.rkn.get(paramString[i]);
        if (localq != null) {
          if (localq.qYq == 0) {
            break label125;
          }
        }
        label125:
        for (int j = 1;; j = 0)
        {
          if ((j == 0) || ((bg.nm(localq.qYr)) && (!paramBoolean)))
          {
            localStringBuilder.append(paramString[i]);
            localStringBuilder.append("-");
          }
          i += 1;
          break;
        }
      }
      if (localStringBuilder.length() == 0)
      {
        GMTrace.o(6993548935168L, 52106);
        return "0";
      }
      paramString = localStringBuilder.delete(localStringBuilder.length() - 1, localStringBuilder.length()).toString();
      GMTrace.o(6993548935168L, 52106);
      return paramString;
    }
    GMTrace.o(6993548935168L, 52106);
    return "0";
  }
  
  public final List<q> bzs()
  {
    GMTrace.i(6994220023808L, 52111);
    Object localObject = com.tencent.mm.plugin.wallet_core.model.n.byx().iL(true);
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < ((ArrayList)localObject).size())
    {
      localHashMap.put(((Bankcard)((ArrayList)localObject).get(i)).field_bankcardType, Integer.valueOf(0));
      i += 1;
    }
    localObject = new LinkedList();
    LinkedList localLinkedList = this.rkm.qXA;
    if (localLinkedList != null)
    {
      i = 0;
      if (i < localLinkedList.size())
      {
        q localq = (q)localLinkedList.get(i);
        int j;
        if (localq != null) {
          if (localq.qYq != 0)
          {
            j = 1;
            label131:
            if (j == 0) {
              break label182;
            }
            if ((localHashMap.containsKey(localq.qYr)) || (bg.nm(localq.qYr))) {
              ((List)localObject).add(localq);
            }
          }
        }
        for (;;)
        {
          i += 1;
          break;
          j = 0;
          break label131;
          label182:
          ((List)localObject).add(localq);
        }
      }
    }
    GMTrace.o(6994220023808L, 52111);
    return (List<q>)localObject;
  }
  
  public static final class a
  {
    public String nEp;
    public h rkp;
    public double rkq;
    public String rkr;
    
    public a()
    {
      GMTrace.i(6983751041024L, 52033);
      GMTrace.o(6983751041024L, 52033);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */