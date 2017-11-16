package com.tencent.mm.bd;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bny;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class g
{
  public String hfs;
  LinkedHashMap<String, a> hft;
  final ReadWriteLock hfu;
  private StringBuilder hfv;
  
  public g(String paramString)
  {
    GMTrace.i(4389993447424L, 32708);
    this.hfu = new ReentrantReadWriteLock();
    this.hfv = new StringBuilder();
    this.hft = new LinkedHashMap();
    this.hfs = paramString;
    GMTrace.o(4389993447424L, 32708);
  }
  
  public final LinkedList<azq> Og()
  {
    GMTrace.i(4390127665152L, 32709);
    LinkedList localLinkedList = new LinkedList();
    this.hfu.readLock().lock();
    Iterator localIterator = this.hft.values().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.hfx) {
        localLinkedList.add(new azq().Rq(locala.hfw));
      }
    }
    this.hfu.readLock().unlock();
    GMTrace.o(4390127665152L, 32709);
    return localLinkedList;
  }
  
  public final String Oh()
  {
    GMTrace.i(4390261882880L, 32710);
    this.hfv.setLength(0);
    this.hfu.readLock().lock();
    Object localObject = this.hft.values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if (locala.data != null) {
        this.hfv.append(locala.data);
      }
    }
    this.hfu.readLock().unlock();
    localObject = this.hfv.toString();
    GMTrace.o(4390261882880L, 32710);
    return (String)localObject;
  }
  
  public final boolean Oi()
  {
    GMTrace.i(4390396100608L, 32711);
    this.hfu.readLock().lock();
    if (this.hft.size() == 0)
    {
      w.i("MicroMsg.ShortSentenceContainer", "isAllRespEnd innerContainer.size() == 0");
      GMTrace.o(4390396100608L, 32711);
      return false;
    }
    Iterator localIterator = this.hft.values().iterator();
    a locala;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      locala = (a)localIterator.next();
      w.d("MicroMsg.ShortSentenceContainer", "isAllRespEnd voiceId:%s isRequestEnd:%s isResponseEnd:%s", new Object[] { locala.hfw, Boolean.valueOf(locala.hfy), Boolean.valueOf(locala.hfC) });
    } while (locala.hfC);
    for (boolean bool = false;; bool = true)
    {
      this.hfu.readLock().unlock();
      GMTrace.o(4390396100608L, 32711);
      return bool;
    }
  }
  
  public final void Q(List<bny> paramList)
  {
    GMTrace.i(4390530318336L, 32712);
    int i;
    Object localObject;
    if (paramList == null)
    {
      i = 0;
      this.hfu.readLock().lock();
      if (this.hft.size() != 0) {
        break label120;
      }
      this.hfu.readLock().unlock();
      localObject = "[]";
    }
    for (;;)
    {
      w.d("MicroMsg.ShortSentenceContainer", "updateVoiceInfoResult respVTList size %s innerContainer %s", new Object[] { Integer.valueOf(i), localObject });
      if ((paramList != null) && (paramList.size() != 0)) {
        break label267;
      }
      w.i("MicroMsg.ShortSentenceContainer", "respList == null");
      GMTrace.o(4390530318336L, 32712);
      return;
      i = paramList.size();
      break;
      label120:
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("[");
      localIterator = this.hft.values().iterator();
      while (localIterator.hasNext()) {
        ((StringBuilder)localObject).append(((a)localIterator.next()).hfw).append(", ");
      }
      if (((StringBuilder)localObject).length() <= 3)
      {
        this.hfu.readLock().unlock();
        localObject = "]";
      }
      else
      {
        ((StringBuilder)localObject).setLength(((StringBuilder)localObject).length() - 2);
        this.hfu.readLock().unlock();
        localObject = "]";
      }
    }
    label267:
    this.hfu.readLock().lock();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      bny localbny = (bny)localIterator.next();
      if (localbny == null)
      {
        w.i("MicroMsg.ShortSentenceContainer", "setFetchedVoiceInfoResult voiceTransCell is null.");
      }
      else
      {
        a locala = (a)this.hft.get(localbny.udw);
        if (locala == null)
        {
          w.i("MicroMsg.ShortSentenceContainer", "voiceInfoContainer not found the voiceId %s", new Object[] { localbny.udw });
        }
        else if (localbny == null)
        {
          w.d("MicroMsg.ShortSentenceContainer", "update VoiceInfo cell is null");
        }
        else
        {
          String str1 = localbny.udw;
          i = localbny.uXJ;
          label419:
          boolean bool1;
          label430:
          int j;
          String str2;
          boolean bool2;
          boolean bool3;
          int k;
          int m;
          if ((localbny.uVG == null) || (localbny.uVG.uNP == null))
          {
            paramList = null;
            if (localbny.tTL == 0) {
              break label630;
            }
            bool1 = true;
            j = localbny.tTL;
            str2 = locala.hfw;
            bool2 = locala.hfx;
            bool3 = locala.hfy;
            k = locala.hfz;
            m = locala.hfB;
            if (locala.data != null) {
              break label636;
            }
          }
          label630:
          label636:
          for (localObject = null;; localObject = Integer.valueOf(locala.data.length()))
          {
            w.d("MicroMsg.ShortSentenceContainer", "update VoiceInfo get {cell} %s, seq %s, text %s, endFlag %s, endFlag %s {currentInfo} %s, isRequestStart %s, isRequestEnd %s, voiceFileMark %s, seq %s, data %s, isResponseEnd %s", new Object[] { str1, Integer.valueOf(i), paramList, Boolean.valueOf(bool1), Integer.valueOf(j), str2, Boolean.valueOf(bool2), Boolean.valueOf(bool3), Integer.valueOf(k), Integer.valueOf(m), localObject, Boolean.valueOf(locala.hfC) });
            if ((localbny.uXJ >= locala.hfB) && (!locala.hfC)) {
              break label652;
            }
            w.d("MicroMsg.ShortSentenceContainer", "update seq not fit.");
            break;
            paramList = Integer.valueOf(localbny.uVG.uNN);
            break label419;
            bool1 = false;
            break label430;
          }
          label652:
          locala.hfB = localbny.uXJ;
          if ((localbny.uVG == null) || (localbny.uVG.uNP == null))
          {
            paramList = null;
            label683:
            locala.data = paramList;
            if (localbny.tTL == 0) {
              break label819;
            }
            bool1 = true;
            label700:
            locala.hfC = bool1;
            paramList = localbny.udw;
            j = locala.hfB;
            bool1 = locala.hfC;
            if (locala.data != null) {
              break label825;
            }
          }
          label819:
          label825:
          for (i = -1;; i = locala.data.length())
          {
            w.i("MicroMsg.ShortSentenceContainer", "update VoiceId = %s,respSeq = %s,isResponseEnd = %s,data.length = %s", new Object[] { paramList, Integer.valueOf(j), Boolean.valueOf(bool1), Integer.valueOf(i) });
            if (localbny.tTL != 2) {
              break;
            }
            w.e("MicroMsg.ShortSentenceContainer", "update cell.EndFlag = 2 VoiceId = %s", new Object[] { localbny.udw });
            break;
            paramList = localbny.uVG.uNP.bNS();
            break label683;
            bool1 = false;
            break label700;
          }
        }
      }
    }
    this.hfu.readLock().unlock();
    GMTrace.o(4390530318336L, 32712);
  }
  
  public final void hs(int paramInt)
  {
    GMTrace.i(4390664536064L, 32713);
    w.i("MicroMsg.ShortSentenceContainer", "cutShortSentence markEnd:%s", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 0) {
      throw new IllegalStateException("splitShortSentence file mark less than zero. mark: " + paramInt);
    }
    this.hfu.readLock().lock();
    if (this.hft.size() == 0)
    {
      w.e("MicroMsg.ShortSentenceContainer", "splitShortSentence there is no last one");
      GMTrace.o(4390664536064L, 32713);
      return;
    }
    Iterator localIterator = this.hft.values().iterator();
    for (a locala = null; localIterator.hasNext(); locala = (a)localIterator.next()) {}
    if (locala == null) {
      throw new IllegalStateException("splitShortSentence last info is null");
    }
    w.d("MicroMsg.ShortSentenceContainer", "cutShortSentence voiceFileMarkEnd:%s voiceId:%s markEnd:%s", new Object[] { Integer.valueOf(locala.hfz), locala.hfw, Integer.valueOf(paramInt) });
    locala.hfz = paramInt;
    this.hfu.readLock().unlock();
    GMTrace.o(4390664536064L, 32713);
  }
  
  public final a ht(int paramInt)
  {
    GMTrace.i(4390798753792L, 32714);
    this.hfu.readLock().lock();
    if (this.hft.size() == 0)
    {
      GMTrace.o(4390798753792L, 32714);
      return null;
    }
    Iterator localIterator = this.hft.values().iterator();
    a locala;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      locala = (a)localIterator.next();
      w.d("MicroMsg.ShortSentenceContainer", "locateCurrentShortSentence oldOffset = %s voiceFileMarkEnd = %s info.isRequestEnd = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(locala.hfz), Boolean.valueOf(locala.hfy) });
    } while ((locala.hfy) || (paramInt > locala.hfz));
    for (;;)
    {
      this.hfu.readLock().unlock();
      GMTrace.o(4390798753792L, 32714);
      return locala;
      locala = null;
    }
  }
  
  public final class a
  {
    public String data;
    public int hfA;
    public int hfB;
    public boolean hfC;
    public String hfw;
    public boolean hfx;
    public boolean hfy;
    public int hfz;
    
    public a()
    {
      GMTrace.i(4389859229696L, 32707);
      long l3 = 0xFFFFFFFF & System.currentTimeMillis();
      long l4 = 0xFFFFFFFF & new Random(System.currentTimeMillis()).nextInt();
      long l2 = l3 << 32 | l4;
      long l1 = l2;
      if (l2 < 0L) {
        l1 = Math.abs(l2);
      }
      this$1 = g.this.hfs + String.valueOf(l1);
      w.i("MicroMsg.ShortSentenceContainer", "finally random = %s(%s) time = %s(%s) id = %s(%s) session = %s strId = %s", new Object[] { Long.valueOf(l4), Long.toBinaryString(l4), Long.valueOf(l3), Long.toBinaryString(l3), Long.valueOf(l1), Long.toBinaryString(l1), g.this.hfs, g.this });
      this.hfw = g.this;
      this.hfx = false;
      this.hfy = false;
      this.hfz = Integer.MAX_VALUE;
      this.hfA = 0;
      this.hfB = -1;
      this.data = null;
      this.hfC = false;
      GMTrace.o(4389859229696L, 32707);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */