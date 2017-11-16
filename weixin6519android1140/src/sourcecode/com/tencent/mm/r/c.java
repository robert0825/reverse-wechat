package com.tencent.mm.r;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c
{
  public volatile boolean fTT;
  private volatile boolean fTU;
  public List<Map<String, String>> fTV;
  
  public c()
  {
    GMTrace.i(4504481169408L, 33561);
    this.fTT = false;
    this.fTU = false;
    this.fTV = new CopyOnWriteArrayList();
    GMTrace.o(4504481169408L, 33561);
  }
  
  private static bu a(bu parambu)
  {
    boolean bool = true;
    GMTrace.i(4504883822592L, 33564);
    if (parambu == null)
    {
      GMTrace.o(4504883822592L, 33564);
      return null;
    }
    Object localObject = parambu.tPW;
    int i = parambu.lQc;
    if (parambu.tPY == null) {}
    for (;;)
    {
      w.i("MicroMsg.FunctionMsgFetcher", "processAddMsg, fromUser: %s, msgType: %s, content==null: %s", new Object[] { localObject, Integer.valueOf(i), Boolean.valueOf(bool) });
      localObject = bg.nl(n.a(parambu.tPW));
      if ("readerapp".equals(localObject))
      {
        parambu.tPW = n.ni("newsapp");
        parambu.lQc = 12399999;
      }
      if (("blogapp".equals(localObject)) || ("newsapp".equals(localObject))) {
        parambu.lQc = 12399999;
      }
      GMTrace.o(4504883822592L, 33564);
      return parambu;
      bool = false;
    }
  }
  
  public static void b(List<d> paramList, boolean paramBoolean)
  {
    GMTrace.i(4505420693504L, 33568);
    if (paramList != null)
    {
      Object localObject2;
      try
      {
        if (paramList.size() <= 0) {
          break label328;
        }
        localObject1 = new ArrayList();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localObject2 = (d)paramList.next();
          if (((d)localObject2).field_needShow)
          {
            ((d)localObject2).b(a(((d)localObject2).field_addMsg));
            ((List)localObject1).add(localObject2);
          }
        }
      }
      catch (Exception paramList)
      {
        w.e("MicroMsg.FunctionMsgFetcher", "callbackToUpdate error: %s", new Object[] { paramList.getMessage() });
        GMTrace.o(4505420693504L, 33568);
        return;
      }
      tmp125_122[0] = Integer.valueOf(((List)localObject1).size());
      Object[] tmp137_125 = tmp125_122;
      tmp137_125[1] = Boolean.valueOf(paramBoolean);
      w.d("MicroMsg.FunctionMsgFetcher", "callbackToUpdate, msgList.size: %s, isShow: %s", tmp137_125);
      paramList = c((Collection)localObject1);
      Object localObject1 = paramList.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        int i = ((Integer)((Iterator)localObject1).next()).intValue();
        Object localObject3 = (List)paramList.get(Integer.valueOf(i));
        localObject2 = new HashMap();
        localObject3 = ((List)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          d locald = (d)((Iterator)localObject3).next();
          ((Map)localObject2).put(locald.field_functionmsgid, locald.field_addMsg);
        }
        localObject3 = (List)i.vE().fUk.get(Integer.valueOf(i));
        if (localObject3 != null)
        {
          localObject3 = ((List)localObject3).iterator();
          while (((Iterator)localObject3).hasNext()) {
            ((f)((Iterator)localObject3).next()).a(0, (Map)localObject2, paramBoolean);
          }
        }
      }
    }
    label328:
    GMTrace.o(4505420693504L, 33568);
  }
  
  private static Map<Integer, List<d>> c(Collection<d> paramCollection)
  {
    GMTrace.i(4505554911232L, 33569);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (locald.field_addMsg != null)
      {
        List localList = (List)localHashMap.get(Integer.valueOf(locald.field_addMsg.lQc));
        paramCollection = localList;
        if (localList == null) {
          paramCollection = new ArrayList();
        }
        paramCollection.add(locald);
        localHashMap.put(Integer.valueOf(locald.field_addMsg.lQc), paramCollection);
      }
    }
    GMTrace.o(4505554911232L, 33569);
    return localHashMap;
  }
  
  public final boolean vw()
  {
    boolean bool;
    try
    {
      GMTrace.i(4504749604864L, 33563);
      if (this.fTV.size() <= 0)
      {
        w.i("MicroMsg.FunctionMsgFetcher", "processNextNewXml, all process finished");
        bool = false;
        GMTrace.o(4504749604864L, 33563);
      }
      for (;;)
      {
        return bool;
        if (!this.fTU) {
          break;
        }
        w.i("MicroMsg.FunctionMsgFetcher", "processNextNewXml, processing new xml");
        bool = false;
        GMTrace.o(4504749604864L, 33563);
      }
      this.fTU = true;
    }
    finally {}
    Object localObject2 = (Map)this.fTV.remove(0);
    Object localObject4 = (String)((Map)localObject2).get(".sysmsg.functionmsg.cgi");
    int j = bg.getInt((String)((Map)localObject2).get(".sysmsg.functionmsg.cmdid"), 0);
    String str1 = (String)((Map)localObject2).get(".sysmsg.functionmsg.functionmsgid");
    long l1 = bg.getLong((String)((Map)localObject2).get(".sysmsg.functionmsg.version"), 0L);
    int i = bg.getInt((String)((Map)localObject2).get(".sysmsg.functionmsg.op"), 0);
    int k = bg.getInt((String)((Map)localObject2).get(".sysmsg.functionmsg.retryinterval"), 0);
    int m = bg.getInt((String)((Map)localObject2).get(".sysmsg.functionmsg.reportid"), 0);
    int n = bg.getInt((String)((Map)localObject2).get(".sysmsg.functionmsg.successkey"), 0);
    int i1 = bg.getInt((String)((Map)localObject2).get(".sysmsg.functionmsg.failkey"), 0);
    int i2 = bg.getInt((String)((Map)localObject2).get(".sysmsg.functionmsg.finalfailkey"), 0);
    String str2 = (String)((Map)localObject2).get(".sysmsg.functionmsg.custombuff");
    w.d("MicroMsg.FunctionMsgFetcher", "processNextNewXml, cgi: %s, cmdId: %s, functionMsgId: %s, version: %s, op: %s, retryInterval: %s, reportId: %s, successKey: %s, failKey: %s, finalKey: %s, customBuff: %s", new Object[] { localObject4, Integer.valueOf(j), str1, Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), str2 });
    Object localObject3 = new d();
    if (!bg.nm((String)localObject4)) {
      ((d)localObject3).field_cgi = ((String)localObject4);
    }
    ((d)localObject3).field_cmdid = j;
    if (!bg.nm(str1)) {
      ((d)localObject3).field_functionmsgid = str1;
    }
    ((d)localObject3).field_version = l1;
    ((d)localObject3).field_retryinterval = k;
    ((d)localObject3).field_reportid = m;
    ((d)localObject3).field_successkey = n;
    ((d)localObject3).field_failkey = i1;
    ((d)localObject3).field_finalfailkey = i2;
    if (!bg.nm(str2)) {
      ((d)localObject3).field_custombuff = str2;
    }
    ((d)localObject3).field_status = -1;
    ((d)localObject3).b(null);
    j = Integer.valueOf((String)((Map)localObject2).get("FUNCTION_MSG_ADD_MSG_CREATE_TIME_KEY")).intValue();
    localObject2 = i.vF().ei(((d)localObject3).field_functionmsgid);
    if (localObject2 != null) {
      w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgItem.status: %s, version: %s, preVersion: %s", new Object[] { Integer.valueOf(((d)localObject2).field_status), Long.valueOf(((d)localObject2).field_version), Long.valueOf(((d)localObject2).field_preVersion) });
    }
    w.d("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgItem: %s", new Object[] { localObject2 });
    if (i == 0)
    {
      ((d)localObject3).field_needShow = true;
      if (localObject2 == null)
      {
        w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op update, insert a new one", new Object[] { ((d)localObject3).field_functionmsgid });
        i.vF().b((com.tencent.mm.sdk.e.c)localObject3);
      }
      for (;;)
      {
        vy();
        bool = true;
        GMTrace.o(4504749604864L, 33563);
        break;
        if (((d)localObject2).field_version < ((d)localObject3).field_version)
        {
          w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op update, update the exist one", new Object[] { ((d)localObject3).field_functionmsgid });
          ((d)localObject2).field_preVersion = ((d)localObject2).field_version;
          ((d)localObject3).field_preVersion = ((d)localObject2).field_version;
          i.vF().a(((d)localObject2).field_functionmsgid, (d)localObject3);
        }
      }
    }
    if (i == 1)
    {
      w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, op delete");
      if (localObject2 != null)
      {
        w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op delete, newFunctionMsgItem.version: %s, functionMsgItem.version: %s", new Object[] { ((d)localObject2).field_functionmsgid, Long.valueOf(((d)localObject3).field_version), Long.valueOf(((d)localObject2).field_version) });
        if (((d)localObject3).field_version != ((d)localObject2).field_version)
        {
          l1 = ((d)localObject3).field_version;
          if (l1 != 0L) {}
        }
        else if (localObject2 == null) {}
      }
    }
    for (;;)
    {
      try
      {
        localObject4 = a(((d)localObject2).field_addMsg);
        if (localObject4 != null) {
          break label1357;
        }
        bool = true;
        w.d("MicroMsg.FunctionMsgFetcher", "callbackToDelete, msgContent==null: %s", new Object[] { Boolean.valueOf(bool) });
        if (localObject4 != null)
        {
          localObject3 = Collections.singletonMap(((d)localObject2).field_functionmsgid, ((d)localObject2).field_addMsg);
          localObject4 = (List)i.vE().fUk.get(Integer.valueOf(((bu)localObject4).lQc));
          if (localObject4 != null)
          {
            localObject4 = ((List)localObject4).iterator();
            if (((Iterator)localObject4).hasNext())
            {
              ((f)((Iterator)localObject4).next()).a(1, (Map)localObject3, false);
              continue;
            }
          }
        }
        i.vF().a((com.tencent.mm.sdk.e.c)localObject2, new String[0]);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.FunctionMsgFetcher", "callbackToDelete error: %s", new Object[] { localException.getMessage() });
      }
      for (;;)
      {
        vz();
        break;
        w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op delete, the origin one not exist", new Object[] { localException.field_functionmsgid });
      }
      if (i == 2)
      {
        localException.field_needShow = false;
        if (localObject2 == null)
        {
          w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op update but no show, insert a new one", new Object[] { localException.field_functionmsgid });
          i.vF().b(localException);
        }
        for (;;)
        {
          vy();
          break;
          if (((d)localObject2).field_version < localException.field_version)
          {
            w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op update but no show, update the exist one, preVersion: %s", new Object[] { localException.field_functionmsgid, Long.valueOf(((d)localObject2).field_preVersion) });
            ((d)localObject2).field_preVersion = ((d)localObject2).field_version;
            localException.field_preVersion = ((d)localObject2).field_version;
            i.vF().a(((d)localObject2).field_functionmsgid, localException);
          }
        }
      }
      long l2;
      if (i == 3)
      {
        w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, functionMsgId: %s, op show, functionMsgItem: %s", new Object[] { localException.field_functionmsgid, localObject2 });
        localException.field_needShow = true;
        if (localObject2 != null)
        {
          l1 = localException.field_version;
          l2 = ((d)localObject2).field_version;
          if (((d)localObject2).field_addMsg != null) {
            break label1351;
          }
        }
      }
      label1351:
      for (bool = true;; bool = false)
      {
        w.i("MicroMsg.FunctionMsgFetcher", "fetchInternal, op show, newFunctionMsgItem.version: %s, functionMsgItem.version: %s, functionMsgItem.msgContent == null: %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool) });
        if ((((d)localObject2).field_version >= localException.field_version) || (localException.field_version == 0L))
        {
          ((d)localObject2).field_needShow = true;
          if (((d)localObject2).field_addMsg != null)
          {
            w.i("MicroMsg.FunctionMsgFetcher", "show, update create time to: %s", new Object[] { Integer.valueOf(j) });
            ((d)localObject2).field_addMsg.nFd = j;
          }
          i.vF().a(((d)localObject2).field_functionmsgid, (d)localObject2);
          if (((d)localObject2).field_addMsg != null) {
            b(Collections.singletonList(localObject2), true);
          }
        }
        vz();
        break;
      }
      label1357:
      bool = false;
    }
  }
  
  public final boolean vx()
  {
    try
    {
      GMTrace.i(4505018040320L, 33565);
      boolean bool = this.fTT;
      GMTrace.o(4505018040320L, 33565);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void vy()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(4505152258048L, 33566);
        if (this.fTT)
        {
          w.k("MicroMsg.FunctionMsgFetcher", "fetchAllIfNeed, isFetching, ignore this", new Object[0]);
          vz();
          GMTrace.o(4505152258048L, 33566);
          return;
        }
        if (!am.isNetworkConnected(ab.getContext()))
        {
          w.k("MicroMsg.FunctionMsgFetcher", "fetchAllIfNeed network not connected, ignore this", new Object[0]);
          vz();
          GMTrace.o(4505152258048L, 33566);
          continue;
        }
        this.fTT = true;
      }
      finally {}
      List localList = i.vF().vA();
      w.d("MicroMsg.FunctionMsgFetcher", "fetchAllIfNeed, fetchItems: %s", new Object[] { localList });
      if ((localList != null) && (localList.size() > 0))
      {
        w.i("MicroMsg.FunctionMsgFetcher", "fetchAllIfNeed, fetchItem.size: %s", new Object[] { Integer.valueOf(localList.size()) });
        new b(localList, new b.a()
        {
          public final void r(List<d> paramAnonymousList)
          {
            GMTrace.i(4507836612608L, 33586);
            c.this.fTT = false;
            if (paramAnonymousList != null)
            {
              w.i("MicroMsg.FunctionMsgFetcher", "onFetchFinish, fetchSuccessList.size: %s", new Object[] { paramAnonymousList });
              c.b(paramAnonymousList, false);
            }
            c.this.vz();
            GMTrace.o(4507836612608L, 33586);
          }
        }).start();
        GMTrace.o(4505152258048L, 33566);
      }
      else
      {
        this.fTT = false;
        vz();
        GMTrace.o(4505152258048L, 33566);
      }
    }
  }
  
  public final void vz()
  {
    GMTrace.i(4505286475776L, 33567);
    w.k("MicroMsg.FunctionMsgFetcher", "loopToNextNewXml", new Object[0]);
    this.fTU = false;
    vw();
    GMTrace.o(4505286475776L, 33567);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\r\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */