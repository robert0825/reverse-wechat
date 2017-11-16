package com.tencent.mm.ui;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.a.a;
import com.tencent.mm.bu.a.d;
import com.tencent.mm.bu.a.e;
import com.tencent.mm.bu.a.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class f<K, T extends a>
  extends BaseAdapter
{
  public String TAG;
  public Context context;
  private int myt;
  private int pageSize;
  public boolean vGM;
  public f<K, T>.c vGN;
  private HashMap<K, b<K, T>> vGO;
  protected a vGP;
  public int vGQ;
  public int vGR;
  public boolean vGS;
  int vGT;
  private boolean vGU;
  private boolean vGV;
  private f<K, T>.e vGW;
  public K vGX;
  
  public f(Context paramContext)
  {
    this(true, paramContext);
    GMTrace.i(2934402187264L, 21863);
    this.pageSize = 5000;
    w.i(this.TAG, "newCursor setPageSize %d", new Object[] { Integer.valueOf(5000) });
    GMTrace.o(2934402187264L, 21863);
  }
  
  public f(Context paramContext, byte paramByte)
  {
    this(paramContext, 800, 2000);
    GMTrace.i(2934804840448L, 21866);
    GMTrace.o(2934804840448L, 21866);
  }
  
  private f(Context paramContext, int paramInt1, int paramInt2)
  {
    GMTrace.i(2934670622720L, 21865);
    this.TAG = "MicroMsg.CursorDataAdapter";
    this.vGM = true;
    this.vGQ = 1000;
    this.vGR = 3000;
    this.vGS = true;
    this.myt = 0;
    this.vGT = 0;
    this.vGX = null;
    this.context = paramContext;
    this.vGU = true;
    this.vGV = false;
    this.vGQ = 800;
    this.vGR = 2000;
    GMTrace.o(2934670622720L, 21865);
  }
  
  private f(boolean paramBoolean, Context paramContext)
  {
    GMTrace.i(2934536404992L, 21864);
    this.TAG = "MicroMsg.CursorDataAdapter";
    this.vGM = true;
    this.vGQ = 1000;
    this.vGR = 3000;
    this.vGS = true;
    this.myt = 0;
    this.vGT = 0;
    this.vGX = null;
    this.context = paramContext;
    this.vGU = true;
    GMTrace.o(2934536404992L, 21864);
  }
  
  private void a(d<K> paramd)
  {
    GMTrace.i(16852109492224L, 125558);
    kV(true);
    if ((this.vGN == null) || (this.vGN.vEh != paramd))
    {
      if ((this.vGN != null) && (!this.vGN.isClosed()))
      {
        this.vGN.close();
        this.vGN = null;
      }
      this.vGN = new c(paramd);
      this.vGN.getCount();
      bWs();
      notifyDataSetChanged();
    }
    GMTrace.o(16852109492224L, 125558);
  }
  
  private void a(f<K, T>.c paramf)
  {
    GMTrace.i(2934939058176L, 21867);
    kV(false);
    this.vGN = paramf;
    this.vGN.getCount();
    bWs();
    GMTrace.o(2934939058176L, 21867);
  }
  
  private void a(final f<K, T>.c paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(2937891848192L, 21889);
    if (paramBoolean1)
    {
      if ((this.vGW != null) && (this.vGW.bWF())) {
        this.vGW.bWC();
      }
      if (this.vGO != null) {
        this.vGO.clear();
      }
    }
    if (paramBoolean2)
    {
      a(new d()
      {
        public final void bWz()
        {
          GMTrace.i(3088752574464L, 23013);
          f.a(f.this, paramf);
          GMTrace.o(3088752574464L, 23013);
        }
      });
      GMTrace.o(2937891848192L, 21889);
      return;
    }
    a(paramf);
    GMTrace.o(2937891848192L, 21889);
  }
  
  private void a(d paramd)
  {
    GMTrace.i(2937623412736L, 21887);
    long l = System.currentTimeMillis();
    if (this.vGP != null) {
      this.vGP.QD();
    }
    paramd.bWz();
    notifyDataSetChanged();
    if (this.vGP != null) {
      this.vGP.QC();
    }
    if (this.vGW != null) {
      this.vGW.bWG();
    }
    w.i(this.TAG, "newcursor update callback last :%d ", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(2937623412736L, 21887);
  }
  
  private void bWs()
  {
    GMTrace.i(2935207493632L, 21869);
    if (this.vGU) {
      if (!this.vGN.bVh()) {
        break label114;
      }
    }
    label114:
    for (int i = 1;; i = 2)
    {
      if ((i != this.vGT) && (this.vGT != 0))
      {
        if ((this.vGW != null) && (this.vGW.bWF())) {
          a(new c(bWu()), true, false);
        }
        w.i(this.TAG, "newcursor change update stats  %d ", new Object[] { Integer.valueOf(i) });
      }
      this.vGT = i;
      GMTrace.o(2935207493632L, 21869);
      return;
    }
  }
  
  private void bWw()
  {
    GMTrace.i(2936952324096L, 21882);
    this.vGO.clear();
    this.vGO.put(this.vGX, null);
    GMTrace.o(2936952324096L, 21882);
  }
  
  private int bWx()
  {
    GMTrace.i(2937220759552L, 21884);
    if ((this.vGO == null) || (this.vGO.size() == 0))
    {
      GMTrace.o(2937220759552L, 21884);
      return 0;
    }
    if (this.vGO.containsKey(this.vGX))
    {
      GMTrace.o(2937220759552L, 21884);
      return 2;
    }
    GMTrace.o(2937220759552L, 21884);
    return 1;
  }
  
  private void bWy()
  {
    GMTrace.i(2937757630464L, 21888);
    if ((this.vGN != null) && (!this.vGN.isClosed()) && (this.vGO.size() == 0))
    {
      w.i(this.TAG, "events size is 0  ");
      GMTrace.o(2937757630464L, 21888);
      return;
    }
    a(new d()
    {
      public final void bWz()
      {
        GMTrace.i(2536580841472L, 18899);
        Object localObject1;
        Object localObject2;
        if (f.a(f.this, f.b(f.this)))
        {
          localObject1 = new HashSet(f.b(f.this).size());
          localObject2 = f.b(f.this).values().iterator();
          while (((Iterator)localObject2).hasNext()) {
            ((HashSet)localObject1).add(((f.b)((Iterator)localObject2).next()).yA);
          }
          w.i(f.this.TAG, "newcursor all event is delete");
          f.c(f.this).c(((HashSet)localObject1).toArray(), null);
        }
        for (;;)
        {
          f.b(f.this).clear();
          GMTrace.o(2536580841472L, 18899);
          return;
          long l;
          if (!f.b(f.this).containsKey(f.this.vGX))
          {
            l = System.currentTimeMillis();
            localObject2 = f.this.bWv();
            localObject1 = f.this.a(new HashSet(f.b(f.this).values()), (SparseArray[])localObject2);
            int j = localObject2.length;
            if (j > 1)
            {
              int i = 0;
              while (i < j)
              {
                w.i(f.this.TAG, "newcursor %d  refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(localObject2[i].size()), Integer.valueOf(localObject1[i].size()) });
                i += 1;
              }
            }
            w.i(f.this.TAG, "newcursor refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(localObject2[0].size()), Integer.valueOf(localObject1[0].size()) });
            localObject2 = f.b(f.this).values().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              f.b localb = (f.b)((Iterator)localObject2).next();
              if (localb != null)
              {
                if (localb.vHb != null) {
                  w.i(f.this.TAG, "newcursor notify cache update : key : %s ", new Object[] { localb.yA });
                }
                f.c(f.this).c(localb.yA, (a)localb.vHb);
              }
              else
              {
                w.e(f.this.TAG, "newcursor event is null ! ");
              }
            }
            f.this.a((SparseArray[])localObject1);
            w.i(f.this.TAG, "newcursor after resort new pos size :%d  ", new Object[] { Integer.valueOf(f.c(f.this).bVf()[0].size()) });
          }
          else
          {
            l = System.currentTimeMillis();
            f.a(f.this, new f.c(f.this, f.this.bWu()), true, false);
            w.i(f.this.TAG, "cache unuseful,reset cursor,last : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          }
        }
      }
    });
    GMTrace.o(2937757630464L, 21888);
  }
  
  public final T AH(int paramInt)
  {
    GMTrace.i(16852243709952L, 125559);
    if (this.vGN == null) {
      a(bWu());
    }
    aY("getItem", false);
    this.vGN.vEh.moveToPosition(paramInt);
    a locala = this.vGN.vEh.AH(paramInt);
    if (locala != null) {
      locala.bSi();
    }
    for (;;)
    {
      GMTrace.o(16852243709952L, 125559);
      return locala;
      w.e(this.TAG, "newcursor getItem error %d", new Object[] { Integer.valueOf(paramInt) });
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(2934133751808L, 21861);
    this.vGP = parama;
    GMTrace.o(2934133751808L, 21861);
  }
  
  public final void a(SparseArray<K>[] paramArrayOfSparseArray)
  {
    GMTrace.i(2938026065920L, 21890);
    SparseArray[] arrayOfSparseArray = this.vGN.bVf();
    int i = 0;
    while (i < arrayOfSparseArray.length)
    {
      arrayOfSparseArray[i].clear();
      int j = 0;
      while (j < paramArrayOfSparseArray[i].size())
      {
        arrayOfSparseArray[i].put(j, paramArrayOfSparseArray[i].get(j));
        j += 1;
      }
      i += 1;
    }
    GMTrace.o(2938026065920L, 21890);
  }
  
  public abstract SparseArray<K>[] a(HashSet<b<K, T>> paramHashSet, SparseArray<K>[] paramArrayOfSparseArray);
  
  public final void aY(String paramString, boolean paramBoolean)
  {
    GMTrace.i(2935744364544L, 21873);
    if (this.myt == 0) {}
    for (int i = 1;; i = 0)
    {
      if ((i == 0) && ((this.vGS | paramBoolean)))
      {
        if (!paramBoolean) {
          w.i(this.TAG, "newcursor cache needRefresh : needRefreshInfront :%b from : %s %s", new Object[] { Boolean.valueOf(this.vGS), paramString, bg.bQW() });
        }
        kU(false);
      }
      GMTrace.o(2935744364544L, 21873);
      return;
    }
  }
  
  public abstract ArrayList<T> ah(ArrayList<K> paramArrayList);
  
  public final T bM(K paramK)
  {
    GMTrace.i(16852377927680L, 125560);
    if (this.vGN == null)
    {
      GMTrace.o(16852377927680L, 125560);
      return null;
    }
    paramK = this.vGN.vEh.bM(paramK);
    GMTrace.o(16852377927680L, 125560);
    return paramK;
  }
  
  public boolean bVh()
  {
    GMTrace.i(2935341711360L, 21870);
    if (this.vGN == null)
    {
      GMTrace.o(2935341711360L, 21870);
      return false;
    }
    boolean bool = this.vGN.bVh();
    GMTrace.o(2935341711360L, 21870);
    return bool;
  }
  
  public abstract T bVm();
  
  public final void bWr()
  {
    GMTrace.i(2934267969536L, 21862);
    this.vGP = null;
    GMTrace.o(2934267969536L, 21862);
  }
  
  public final int bWt()
  {
    GMTrace.i(2935610146816L, 21872);
    if (this.vGN == null)
    {
      GMTrace.o(2935610146816L, 21872);
      return 0;
    }
    d locald = this.vGN.vEh;
    if (locald == null)
    {
      GMTrace.o(2935610146816L, 21872);
      return 0;
    }
    if ((locald instanceof e))
    {
      int i = ((e)locald).vDY[0].getCount();
      GMTrace.o(2935610146816L, 21872);
      return i;
    }
    throw new RuntimeException("the cursor is not instanceof MergeHeapCursor ,please call getCount() instead ");
  }
  
  public abstract d<K> bWu();
  
  public final SparseArray<K>[] bWv()
  {
    GMTrace.i(2936818106368L, 21881);
    if (this.vGN == null)
    {
      GMTrace.o(2936818106368L, 21881);
      return null;
    }
    SparseArray[] arrayOfSparseArray1 = this.vGN.bVf();
    SparseArray[] arrayOfSparseArray2 = new SparseArray[arrayOfSparseArray1.length];
    int i = 0;
    while (i < arrayOfSparseArray2.length)
    {
      arrayOfSparseArray2[i] = new SparseArray();
      int j = 0;
      while (j < arrayOfSparseArray1[i].size())
      {
        arrayOfSparseArray2[i].put(j, arrayOfSparseArray1[i].get(j));
        j += 1;
      }
      i += 1;
    }
    GMTrace.o(2936818106368L, 21881);
    return arrayOfSparseArray2;
  }
  
  public int getCount()
  {
    GMTrace.i(2935475929088L, 21871);
    if (this.vGN == null)
    {
      long l = System.currentTimeMillis();
      a(bWu());
      w.i(this.TAG, "newcursor createCursor last : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    aY("getcount", false);
    int i = this.vGN.getCount();
    GMTrace.o(2935475929088L, 21871);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(2936012800000L, 21875);
    GMTrace.o(2936012800000L, 21875);
    return 0L;
  }
  
  public final void kU(boolean paramBoolean)
  {
    GMTrace.i(2937086541824L, 21883);
    int i;
    if ((this.vGV) || (paramBoolean)) {
      if (((this.vGW != null) && (this.vGW.bWF())) || (bWx() != 0))
      {
        i = 1;
        if (i != 0)
        {
          i = bWx();
          if (this.vGW == null) {
            break label266;
          }
          int j = this.vGW.bWH();
          w.i(this.TAG, "newcursor mWorkerHandler.isHandingMsg,type is %d ", new Object[] { Integer.valueOf(j) });
          if (j != 0) {
            this.vGW.bWC();
          }
          if (i == 2) {
            break label266;
          }
          i = j;
        }
      }
    }
    label266:
    for (;;)
    {
      w.i(this.TAG, "newcursor ensureNewState  refreshstatus is %d ", new Object[] { Integer.valueOf(i) });
      this.myt = 0;
      if (i == 2) {
        a(new c(bWu()), true, true);
      }
      for (;;)
      {
        this.myt = 0;
        GMTrace.o(2937086541824L, 21883);
        return;
        i = 0;
        break;
        bWy();
        continue;
        i = bWx();
        if (i == 0)
        {
          w.i(this.TAG, "newcursor need not change ");
          GMTrace.o(2937086541824L, 21883);
          return;
        }
        if (i == 2)
        {
          w.i(this.TAG, "newcursor enqueueMessage resetcursor ");
          this.vGO.clear();
        }
        if (this.vGW == null) {
          this.vGW = new e();
        }
        this.vGW.AQ(i);
      }
    }
  }
  
  public final void kV(boolean paramBoolean)
  {
    GMTrace.i(2938160283648L, 21891);
    if (this.vGN != null)
    {
      this.vGN.close();
      this.vGN = null;
    }
    if ((paramBoolean) && (this.vGW != null))
    {
      this.vGW.quit();
      this.vGW = null;
      if (this.vGO != null)
      {
        this.vGO.clear();
        w.i(this.TAG, "newcursor closeCursor,clear events");
      }
    }
    this.myt = 0;
    this.vGT = 0;
    GMTrace.o(2938160283648L, 21891);
  }
  
  public void n(K paramK, int paramInt)
  {
    GMTrace.i(2937354977280L, 21885);
    if (this.vGN != null)
    {
      if (this.vGO == null) {
        this.vGO = new HashMap();
      }
      boolean bool = this.vGO.containsKey(this.vGX);
      int i;
      label96:
      int j;
      if ((paramInt == 5) || (!this.vGU) || (paramInt == 1)) {
        if (paramInt != 5)
        {
          bWw();
          w.i(this.TAG, "newcursor syncHandle is true ,changeType is %d  ", new Object[] { Integer.valueOf(paramInt) });
          i = 1;
          this.myt = bWx();
          paramK = this.TAG;
          j = this.myt;
          if (this.vGT != 1) {
            break label737;
          }
        }
      }
      label331:
      label416:
      label701:
      label737:
      for (bool = true;; bool = false)
      {
        w.i(paramK, "newcursor refreshStatus: %d ,hasLoadedAllDataStatus %b changeType :%d ", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool), Integer.valueOf(paramInt) });
        if (i == 0) {
          break label743;
        }
        w.i(this.TAG, "newcursor event is refresh sync ");
        kU(true);
        GMTrace.o(2937354977280L, 21885);
        return;
        if (bool) {
          break;
        }
        this.vGO.put(paramK, new b(paramK, paramInt, null));
        break;
        if (bool)
        {
          w.i(this.TAG, "newcursor need reset ,return ");
          GMTrace.o(2937354977280L, 21885);
          return;
        }
        if (this.vGT == 1)
        {
          if ((this.vGN.bL(paramK)) || (paramInt == 2))
          {
            HashMap localHashMap = this.vGO;
            b localb1 = new b(paramK, paramInt, null);
            if ((localb1.vHa == 2) && (this.vGN.bL(localb1.yA))) {
              localb1.vHa = 3;
            }
            b localb2 = (b)localHashMap.get(paramK);
            if (localb2 != null)
            {
              i = 1;
              if (i == 0) {
                break label701;
              }
              localHashMap.remove(localb2);
              switch (localb1.vHa)
              {
              case 3: 
              case 4: 
              default: 
                switch (localb2.vHa)
                {
                case 3: 
                case 4: 
                default: 
                  localb1.vHa = 3;
                  localHashMap.put(paramK, localb1);
                }
                break;
              }
            }
            for (;;)
            {
              paramK = this.vGN;
              i = localHashMap.size();
              if (!paramK.vEh.AG(i))
              {
                w.i(this.TAG, "newcursor events size exceed limit :size is :  %d", new Object[] { Integer.valueOf(localHashMap.size()) });
                localHashMap.clear();
                localHashMap.put(this.vGX, null);
              }
              w.i(this.TAG, "newcursor add event events size %d", new Object[] { Integer.valueOf(this.vGO.size()) });
              i = 0;
              break;
              i = 0;
              break label331;
              switch (localb2.vHa)
              {
              case 2: 
              case 3: 
              case 4: 
              default: 
                localb1.vHa = 5;
                break;
              case 5: 
                w.i(this.TAG, "newcursor processEvent last delete, now delete, impossible");
                localb1.vHa = 5;
                break;
                switch (localb2.vHa)
                {
                case 3: 
                case 4: 
                default: 
                  w.i(this.TAG, "newcursor processEvent last update, now insert, impossible");
                  localb1.vHa = 2;
                  break;
                case 5: 
                  localb1.vHa = 3;
                  break;
                case 2: 
                  w.i(this.TAG, "newcursor processEvent last insert, now insert, impossible");
                  localb1.vHa = 2;
                  break;
                  w.i(this.TAG, "newcursor processEvent last delete, now update, impossible");
                  break label416;
                  localb1.vHa = 2;
                  break;
                  localHashMap.put(paramK, localb1);
                }
                break;
              }
            }
          }
          w.i(this.TAG, "newcursor event pass ");
          i = 0;
          break label96;
        }
        bWw();
        i = 0;
        break label96;
      }
      label743:
      if ((this.vGM) && (this.vGS)) {
        kU(false);
      }
    }
    GMTrace.o(2937354977280L, 21885);
  }
  
  public void pause()
  {
    GMTrace.i(2937489195008L, 21886);
    this.vGM = false;
    w.i(this.TAG, "new cursor pasue");
    GMTrace.o(2937489195008L, 21886);
  }
  
  public static abstract interface a
  {
    public abstract void QC();
    
    public abstract void QD();
  }
  
  public static final class b<K, T>
  {
    public int vHa;
    public T vHb;
    public K yA;
    
    public b(K paramK, int paramInt, T paramT)
    {
      GMTrace.i(2065208180736L, 15387);
      this.yA = paramK;
      this.vHa = paramInt;
      this.vHb = null;
      GMTrace.o(2065208180736L, 15387);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(2065476616192L, 15389);
      if (this == paramObject)
      {
        GMTrace.o(2065476616192L, 15389);
        return true;
      }
      if (paramObject == null)
      {
        GMTrace.o(2065476616192L, 15389);
        return false;
      }
      if (getClass() != paramObject.getClass())
      {
        GMTrace.o(2065476616192L, 15389);
        return false;
      }
      paramObject = (b)paramObject;
      if (this.vHa != ((b)paramObject).vHa)
      {
        GMTrace.o(2065476616192L, 15389);
        return false;
      }
      if (this.yA == null)
      {
        if (((b)paramObject).yA != null)
        {
          GMTrace.o(2065476616192L, 15389);
          return false;
        }
      }
      else if (!this.yA.equals(((b)paramObject).yA))
      {
        GMTrace.o(2065476616192L, 15389);
        return false;
      }
      GMTrace.o(2065476616192L, 15389);
      return true;
    }
    
    public final int hashCode()
    {
      GMTrace.i(2065342398464L, 15388);
      int j = this.vHa;
      if (this.yA == null) {}
      for (int i = 0;; i = this.yA.hashCode())
      {
        GMTrace.o(2065342398464L, 15388);
        return i + (j + 31) * 31;
      }
    }
  }
  
  final class c
    extends g<K, T>
  {
    public c()
    {
      super(f.a(f.this));
      GMTrace.i(16804596416512L, 125204);
      GMTrace.o(16804596416512L, 125204);
    }
    
    public final ArrayList<T> ah(ArrayList paramArrayList)
    {
      GMTrace.i(2551344791552L, 19009);
      paramArrayList = f.this.ah(paramArrayList);
      GMTrace.o(2551344791552L, 19009);
      return paramArrayList;
    }
    
    public final T bVo()
    {
      GMTrace.i(16804730634240L, 125205);
      a locala = f.this.bVm();
      GMTrace.o(16804730634240L, 125205);
      return locala;
    }
  }
  
  private static abstract interface d
  {
    public abstract void bWz();
  }
  
  private final class e
  {
    public f<K, T>.e.b vHc;
    private f<K, T>.e.c vHd;
    public LinkedList<Integer> vHe;
    public int vHf;
    
    public e()
    {
      GMTrace.i(1704296710144L, 12698);
      bWA();
      GMTrace.o(1704296710144L, 12698);
    }
    
    private void bWA()
    {
      GMTrace.i(1704430927872L, 12699);
      this.vHc = new b(Looper.getMainLooper());
      this.vHd = new c(at.xB().ngv.getLooper());
      GMTrace.o(1704430927872L, 12699);
    }
    
    private void bWB()
    {
      GMTrace.i(1704565145600L, 12700);
      Object localObject = this.vHd;
      ((c)localObject).removeMessages(((c)localObject).vHm);
      ((c)localObject).removeMessages(((c)localObject).vHn);
      localObject = this.vHc;
      ((b)localObject).vHi = true;
      ((b)localObject).removeMessages(1);
      ((b)localObject).removeMessages(2);
      this.vHe.clear();
      this.vHf = 0;
      GMTrace.o(1704565145600L, 12700);
    }
    
    public final void AQ(int paramInt)
    {
      try
      {
        GMTrace.i(1705504669696L, 12707);
        if (!this.vHe.contains(Integer.valueOf(paramInt))) {
          this.vHe.add(Integer.valueOf(paramInt));
        }
        this.vHf = bWE();
        c localc = this.vHd;
        localc.sendEmptyMessage(localc.vHn);
        GMTrace.o(1705504669696L, 12707);
        return;
      }
      finally {}
    }
    
    public final void bWC()
    {
      try
      {
        GMTrace.i(1704699363328L, 12701);
        w.i(f.this.TAG, "newcursor resetQueue ");
        bWB();
        bWA();
        GMTrace.o(1704699363328L, 12701);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final void bWD()
    {
      GMTrace.i(16013651345408L, 119311);
      Object localObject3;
      try
      {
        int i = bWE();
        this.vHe.clear();
        localObject3 = new a(i);
        if (((a)localObject3).vHg == 2)
        {
          long l = System.currentTimeMillis();
          Object localObject1 = ((a)localObject3).vHh.vGY.bWu();
          localObject1 = new f.c(((a)localObject3).vHh.vGY, (d)localObject1);
          i = ((f.c)localObject1).getCount();
          w.i(((a)localObject3).vHh.vGY.TAG, "newcursor fillCursor last : %d  count %d ", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(i) });
          localObject3 = ((a)localObject3).vHh.vHc;
          Message localMessage = Message.obtain();
          localMessage.obj = localObject1;
          localMessage.what = 2;
          ((b)localObject3).sendMessage(localMessage);
          GMTrace.o(16013651345408L, 119311);
          return;
        }
      }
      finally {}
      ((a)localObject3).vHh.vHc.sendEmptyMessage(1);
      GMTrace.o(16013651345408L, 119311);
    }
    
    public final int bWE()
    {
      int i = 0;
      GMTrace.i(1704967798784L, 12703);
      if (this.vHe.size() > 1) {
        i = 2;
      }
      for (;;)
      {
        GMTrace.o(1704967798784L, 12703);
        return i;
        if (this.vHe.size() == 1) {
          i = ((Integer)this.vHe.get(0)).intValue();
        }
      }
    }
    
    /* Error */
    public final boolean bWF()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: ldc2_w 226
      //   5: sipush 12704
      //   8: invokestatic 44	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   11: aload_0
      //   12: getfield 111	com/tencent/mm/ui/f$e:vHf	I
      //   15: ifeq +18 -> 33
      //   18: iconst_1
      //   19: istore_1
      //   20: ldc2_w 226
      //   23: sipush 12704
      //   26: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   29: aload_0
      //   30: monitorexit
      //   31: iload_1
      //   32: ireturn
      //   33: iconst_0
      //   34: istore_1
      //   35: ldc2_w 226
      //   38: sipush 12704
      //   41: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   44: goto -15 -> 29
      //   47: astore_2
      //   48: aload_0
      //   49: monitorexit
      //   50: aload_2
      //   51: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	52	0	this	e
      //   19	16	1	bool	boolean
      //   47	4	2	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	18	47	finally
      //   20	29	47	finally
      //   35	44	47	finally
    }
    
    public final void bWG()
    {
      try
      {
        GMTrace.i(1705236234240L, 12705);
        this.vHd.lastUpdateTime = System.currentTimeMillis();
        GMTrace.o(1705236234240L, 12705);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final int bWH()
    {
      try
      {
        GMTrace.i(1705370451968L, 12706);
        int i = this.vHf;
        GMTrace.o(1705370451968L, 12706);
        return i;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final void quit()
    {
      try
      {
        GMTrace.i(1704833581056L, 12702);
        w.i(f.this.TAG, "newcursor quit ");
        bWB();
        GMTrace.o(1704833581056L, 12702);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    private final class a
    {
      int vHg;
      
      public a(int paramInt)
      {
        GMTrace.i(2916685447168L, 21731);
        this.vHg = paramInt;
        GMTrace.o(2916685447168L, 21731);
      }
    }
    
    final class b
      extends ae
    {
      boolean vHi;
      public final int vHj;
      public final int vHk;
      
      public b(Looper paramLooper)
      {
        super();
        GMTrace.i(1603633414144L, 11948);
        this.vHj = 1;
        this.vHk = 2;
        GMTrace.o(1603633414144L, 11948);
      }
      
      public final void handleMessage(Message paramMessage)
      {
        GMTrace.i(1603767631872L, 11949);
        super.handleMessage(paramMessage);
        if (this.vHi)
        {
          GMTrace.o(1603767631872L, 11949);
          return;
        }
        synchronized (f.e.this)
        {
          f.e.this.vHf = f.e.this.bWE();
          w.i(f.this.TAG, "newcursor updateWorkerRefresh status %d", new Object[] { Integer.valueOf(f.e.this.vHf) });
          if (paramMessage.what == 1)
          {
            f.d(f.this);
            GMTrace.o(1603767631872L, 11949);
            return;
          }
        }
        if (paramMessage.what == 2) {
          f.a(f.this, (f.c)paramMessage.obj, false, true);
        }
        GMTrace.o(1603767631872L, 11949);
      }
    }
    
    final class c
      extends ae
    {
      long lastUpdateTime;
      long vHl;
      final int vHm;
      final int vHn;
      
      public c(Looper paramLooper)
      {
        super();
        GMTrace.i(2933865316352L, 21859);
        this.vHm = (hashCode() | 0x776);
        this.vHn = (hashCode() | 0x77A);
        f.e.this.vHe = new LinkedList();
        GMTrace.o(2933865316352L, 21859);
      }
      
      public final void handleMessage(Message paramMessage)
      {
        GMTrace.i(2933999534080L, 21860);
        super.handleMessage(paramMessage);
        if (paramMessage.what == this.vHn)
        {
          removeMessages(this.vHm);
          long l = System.currentTimeMillis();
          if ((l - this.vHl > f.this.vGQ) || (l - this.vHl < 0L) || ((this.lastUpdateTime != 0L) && (l - this.lastUpdateTime > f.this.vGR)) || (l - this.lastUpdateTime < 0L)) {
            f.e.this.bWD();
          }
          for (;;)
          {
            this.vHl = l;
            GMTrace.o(2933999534080L, 21860);
            return;
            sendEmptyMessageDelayed(this.vHm, f.this.vGQ);
          }
        }
        if (paramMessage.what == this.vHm) {
          f.e.this.bWD();
        }
        GMTrace.o(2933999534080L, 21860);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */