package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.ua;
import com.tencent.mm.protocal.c.ub;
import com.tencent.mm.protocal.c.uc;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class t
{
  public HashMap<String, WeakReference<a>> gEO;
  public uc lbp;
  private HashSet<Integer> lbq;
  private boolean lbr;
  private List<ua> lbs;
  
  public t()
  {
    GMTrace.i(6269310074880L, 46710);
    this.lbp = new uc();
    this.gEO = new HashMap();
    this.lbq = new HashSet();
    this.lbr = true;
    this.lbs = new LinkedList();
    at.AR();
    byte[] arrayOfByte = bg.St((String)com.tencent.mm.y.c.xh().get(225283, ""));
    try
    {
      this.lbp.aD(arrayOfByte);
      w.i("MicroMsg.FavTagSetMgr", "tag:\n%s", new Object[] { this.lbp.ulN });
      GMTrace.o(6269310074880L, 46710);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FavTagSetMgr", localException, "", new Object[0]);
        w.w("MicroMsg.FavTagSetMgr", "init tag info set fail, %s", new Object[] { localException.getMessage() });
        this.lbp = new uc();
      }
    }
  }
  
  private void er(boolean paramBoolean)
  {
    GMTrace.i(6269578510336L, 46712);
    Iterator localIterator = this.gEO.values().iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null)) {
        if (paramBoolean) {
          ((a)localWeakReference.get()).axS();
        } else {
          ((a)localWeakReference.get()).axT();
        }
      }
    }
    GMTrace.o(6269578510336L, 46712);
  }
  
  private void removeTag(final String paramString)
  {
    GMTrace.i(6270652252160L, 46720);
    if (bg.nm(paramString))
    {
      GMTrace.o(6270652252160L, 46720);
      return;
    }
    this.lbq.remove(Integer.valueOf(paramString.hashCode()));
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      w.d("MicroMsg.FavTagSetMgr", "remove tag %s, post", new Object[] { paramString });
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6275752525824L, 46758);
          t.this.xN(paramString);
          GMTrace.o(6275752525824L, 46758);
        }
      });
      GMTrace.o(6270652252160L, 46720);
      return;
    }
    w.d("MicroMsg.FavTagSetMgr", "remove tag %s", new Object[] { paramString });
    xN(paramString);
    GMTrace.o(6270652252160L, 46720);
  }
  
  private void save()
  {
    GMTrace.i(6269712728064L, 46713);
    try
    {
      final byte[] arrayOfByte = this.lbp.toByteArray();
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6276020961280L, 46760);
          String str = bg.bs(arrayOfByte);
          at.AR();
          com.tencent.mm.y.c.xh().set(225283, str);
          GMTrace.o(6276020961280L, 46760);
        }
        
        public final String toString()
        {
          GMTrace.i(6276155179008L, 46761);
          String str = super.toString() + "|save";
          GMTrace.o(6276155179008L, 46761);
          return str;
        }
      });
      this.lbr = true;
      GMTrace.o(6269712728064L, 46713);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FavTagSetMgr", localException, "", new Object[0]);
        w.w("MicroMsg.FavTagSetMgr", "save tag info set fail, %s", new Object[] { localException.getMessage() });
        Object localObject = null;
      }
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6269444292608L, 46711);
    if (parama == null)
    {
      GMTrace.o(6269444292608L, 46711);
      return;
    }
    this.gEO.put(parama.toString(), new WeakReference(parama));
    GMTrace.o(6269444292608L, 46711);
  }
  
  public final int axR()
  {
    GMTrace.i(6269981163520L, 46715);
    Iterator localIterator = this.lbp.ulN.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((ub)localIterator.next()).ulM.size() + i) {}
    GMTrace.o(6269981163520L, 46715);
    return i;
  }
  
  public final void c(Set<String> paramSet)
  {
    GMTrace.i(6270518034432L, 46719);
    if ((paramSet == null) || (paramSet.isEmpty()))
    {
      GMTrace.o(6270518034432L, 46719);
      return;
    }
    w.d("MicroMsg.FavTagSetMgr", "do remove tags: %s", new Object[] { paramSet });
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      removeTag((String)paramSet.next());
    }
    GMTrace.o(6270518034432L, 46719);
  }
  
  public final void i(j paramj)
  {
    GMTrace.i(6270383816704L, 46718);
    if (paramj == null)
    {
      GMTrace.o(6270383816704L, 46718);
      return;
    }
    paramj = paramj.field_tagProto.ulP.iterator();
    while (paramj.hasNext()) {
      removeTag((String)paramj.next());
    }
    GMTrace.o(6270383816704L, 46718);
  }
  
  public final List<ua> nA(int paramInt)
  {
    GMTrace.i(6269846945792L, 46714);
    if ((paramInt < 0) || (paramInt > 1))
    {
      GMTrace.o(6269846945792L, 46714);
      return null;
    }
    if (this.lbr)
    {
      w.w("MicroMsg.FavTagSetMgr", "want get tag list, it is dirty, reload data");
      this.lbs.clear();
      localObject = this.lbp.ulN.iterator();
      while (((Iterator)localObject).hasNext())
      {
        ub localub = (ub)((Iterator)localObject).next();
        this.lbs.addAll(localub.ulM);
      }
      this.lbr = false;
    }
    w.i("MicroMsg.FavTagSetMgr", "want get tag list, tag list size is %d", new Object[] { Integer.valueOf(this.lbs.size()) });
    Object localObject = this.lbs;
    GMTrace.o(6269846945792L, 46714);
    return (List<ua>)localObject;
  }
  
  public final void xL(final String paramString)
  {
    GMTrace.i(6270115381248L, 46716);
    if (bg.nm(paramString))
    {
      GMTrace.o(6270115381248L, 46716);
      return;
    }
    if (this.lbq.contains(Integer.valueOf(paramString.hashCode())))
    {
      w.d("MicroMsg.FavTagSetMgr", "has add tag %s", new Object[] { paramString });
      GMTrace.o(6270115381248L, 46716);
      return;
    }
    this.lbq.add(Integer.valueOf(paramString.hashCode()));
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      w.d("MicroMsg.FavTagSetMgr", "add tag %s, post", new Object[] { paramString });
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6279644839936L, 46787);
          t.this.xM(paramString);
          GMTrace.o(6279644839936L, 46787);
        }
      });
      GMTrace.o(6270115381248L, 46716);
      return;
    }
    w.d("MicroMsg.FavTagSetMgr", "add tag %s", new Object[] { paramString });
    xM(paramString);
    GMTrace.o(6270115381248L, 46716);
  }
  
  public final void xM(String paramString)
  {
    int k = 0;
    GMTrace.i(6270249598976L, 46717);
    String str = com.tencent.mm.platformtools.c.nb(paramString.toLowerCase());
    if ((str != null) && (str.length() > 0)) {}
    for (int i = str.charAt(0);; i = 35)
    {
      Object localObject = this.lbp.ulN.iterator();
      int j = 0;
      ub localub;
      if (((Iterator)localObject).hasNext())
      {
        localub = (ub)((Iterator)localObject).next();
        if (localub.ulL != i) {}
      }
      for (;;)
      {
        label86:
        if (localub == null)
        {
          localub = new ub();
          localub.ulL = i;
          this.lbp.ulN.add(localub);
        }
        for (;;)
        {
          localObject = localub.ulM.iterator();
          i = k;
          label132:
          if (((Iterator)localObject).hasNext())
          {
            ua localua = (ua)((Iterator)localObject).next();
            j = localua.ulK.compareTo(str);
            if (j != 0) {
              break label355;
            }
            j = localua.rOy.compareTo(paramString);
          }
          label355:
          for (;;)
          {
            if (j == 0)
            {
              GMTrace.o(6270249598976L, 46717);
              return;
              if (localub.ulL > i)
              {
                localub = new ub();
                localub.ulL = i;
                this.lbp.ulN.add(j, localub);
                break label86;
              }
              j += 1;
              break;
            }
            if (j > 0)
            {
              localObject = new ua();
              ((ua)localObject).rOy = paramString;
              ((ua)localObject).ulK = str;
              localub.ulM.add(i, localObject);
              save();
              er(true);
              GMTrace.o(6270249598976L, 46717);
              return;
            }
            i += 1;
            break label132;
            localObject = new ua();
            ((ua)localObject).rOy = paramString;
            ((ua)localObject).ulK = str;
            localub.ulM.add(localObject);
            er(true);
            save();
            GMTrace.o(6270249598976L, 46717);
            return;
          }
        }
        localub = null;
      }
    }
  }
  
  public final void xN(String paramString)
  {
    GMTrace.i(6270786469888L, 46721);
    String str = com.tencent.mm.platformtools.c.nb(paramString.toLowerCase());
    if ((str != null) && (str.length() > 0)) {}
    for (int j = str.charAt(0);; j = 35)
    {
      Object localObject = this.lbp.ulN.iterator();
      int i = 0;
      ub localub;
      if (((Iterator)localObject).hasNext())
      {
        localub = (ub)((Iterator)localObject).next();
        if (localub.ulL != j) {}
      }
      for (;;)
      {
        if (localub == null)
        {
          GMTrace.o(6270786469888L, 46721);
          return;
          if (localub.ulL > j)
          {
            GMTrace.o(6270786469888L, 46721);
            return;
          }
          i += 1;
          break;
        }
        Iterator localIterator = localub.ulM.iterator();
        j = 0;
        if (localIterator.hasNext())
        {
          localObject = (ua)localIterator.next();
          int m = ((ua)localObject).ulK.compareTo(str);
          k = m;
          if (m == 0) {
            k = ((ua)localObject).rOy.compareTo(paramString);
          }
          if (k == 0)
          {
            paramString = h.axA();
            str = ((ua)localObject).rOy;
            if (!bg.nm(str))
            {
              str = "select count(localId) from FavSearchInfo where tagContent like '%" + str + "%'";
              w.d("MicroMsg.FavSearchStorage", "is tag exist sql {%s}", new Object[] { str });
              paramString = paramString.fTZ.a(str, null, 2);
              if ((paramString == null) || (!paramString.moveToFirst())) {
                break label407;
              }
            }
          }
        }
        label407:
        for (int k = paramString.getInt(0);; k = 0)
        {
          if (paramString != null) {
            paramString.close();
          }
          if (k > 0) {}
          for (k = 1;; k = 0)
          {
            if (k == 0)
            {
              localub.ulM.remove(j);
              if (localub.ulM.isEmpty()) {
                this.lbp.ulN.remove(i);
              }
              er(false);
              save();
            }
            GMTrace.o(6270786469888L, 46721);
            return;
          }
          if (k > 0)
          {
            GMTrace.o(6270786469888L, 46721);
            return;
          }
          j += 1;
          break;
          GMTrace.o(6270786469888L, 46721);
          return;
        }
        localub = null;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void axS();
    
    public abstract void axT();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */