package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class au
  implements f
{
  private static HashMap<String, b> pwe;
  private static HashMap<String, WeakReference<b>> pwf;
  
  static
  {
    GMTrace.i(8107153424384L, 60403);
    pwe = new HashMap();
    pwf = new HashMap();
    GMTrace.o(8107153424384L, 60403);
  }
  
  public au()
  {
    GMTrace.i(8106213900288L, 60396);
    GMTrace.o(8106213900288L, 60396);
  }
  
  public static void HE(String paramString)
  {
    GMTrace.i(8106348118016L, 60397);
    if (r.hkJ) {
      w.d("MicroMsg.TimelineSmallPicStat", "recordStartLoadSmallPic, mediaId:%s", new Object[] { paramString });
    }
    paramString = (WeakReference)pwf.get(paramString);
    if (paramString != null)
    {
      paramString = (b)paramString.get();
      if (paramString != null)
      {
        paramString.med = true;
        GMTrace.o(8106348118016L, 60397);
        return;
      }
    }
    GMTrace.o(8106348118016L, 60397);
  }
  
  public static void HF(String paramString)
  {
    GMTrace.i(8106482335744L, 60398);
    if (r.hkJ) {
      w.d("MicroMsg.TimelineSmallPicStat", "recordEndLoadSmallPic, mediaId:%s", new Object[] { paramString });
    }
    Object localObject = (WeakReference)pwf.get(paramString);
    if (localObject != null)
    {
      localObject = (b)((WeakReference)localObject).get();
      if (localObject != null)
      {
        if ((localObject != null) && (((b)localObject).pwg == -1L))
        {
          HashMap localHashMap = ((b)localObject).pwl;
          if ((localHashMap != null) && (localHashMap.containsKey(paramString)))
          {
            paramString = (a)localHashMap.get(paramString);
            if ((paramString != null) && (paramString.pwg == -1L))
            {
              paramString.pwg = 1L;
              ((b)localObject).pwk += 1;
            }
          }
        }
        GMTrace.o(8106482335744L, 60398);
        return;
      }
    }
    GMTrace.o(8106482335744L, 60398);
  }
  
  public static void HG(String paramString)
  {
    GMTrace.i(8106616553472L, 60399);
    w.d("MicroMsg.TimelineSmallPicStat", "recordClickBigpic, localId:%s", new Object[] { paramString });
    if (pwe.containsKey(paramString))
    {
      w.d("MicroMsg.TimelineSmallPicStat", "recordClickBigPic, localId:%s, update map", new Object[] { paramString });
      paramString = (b)pwe.get(paramString);
      if ((paramString != null) && (paramString.pwg == -1L) && (paramString.startTime != -1L))
      {
        paramString.pwg = 1L;
        paramString.pwk = paramString.pwj;
        paramString.endTime = System.currentTimeMillis();
        paramString.pwi = (paramString.endTime - paramString.startTime);
        paramString = paramString.pwl.values().iterator();
        while (paramString.hasNext()) {
          ((a)paramString.next()).pwg = 1L;
        }
      }
    }
    GMTrace.o(8106616553472L, 60399);
  }
  
  public final void Hi(String paramString)
  {
    GMTrace.i(8106884988928L, 60401);
    if (pwe.containsKey(paramString))
    {
      if (r.hkJ) {
        w.d("MicroMsg.TimelineSmallPicStat", "load finish localId:%s", new Object[] { paramString });
      }
      paramString = (b)pwe.get(paramString);
      if ((paramString != null) && (paramString.startTime != -1L) && (paramString.pwg == -1L))
      {
        paramString.endTime = System.currentTimeMillis();
        paramString.pwi = (paramString.endTime - paramString.startTime);
        if (paramString.pwk == paramString.pwj)
        {
          paramString.pwg = 1L;
          GMTrace.o(8106884988928L, 60401);
          return;
        }
        paramString.pwg = 2L;
      }
    }
    GMTrace.o(8106884988928L, 60401);
  }
  
  public final void a(String paramString, biz parambiz)
  {
    GMTrace.i(8106750771200L, 60400);
    if (!pwe.containsKey(paramString))
    {
      if (r.hkJ) {
        w.d("MicroMsg.TimelineSmallPicStat", "put localId:%s into reportData", new Object[] { paramString });
      }
      if ((parambiz != null) && (parambiz.uUc != null) && (parambiz.uUc.ueV == 1) && (parambiz.uUc.ueW != null) && (parambiz.uUc.ueW.size() > 0))
      {
        b localb = new b();
        localb.pwj = parambiz.uUc.ueW.size();
        localb.pwk = 0;
        localb.pwl = new HashMap();
        parambiz = parambiz.uUc.ueW.iterator();
        while (parambiz.hasNext())
        {
          anu localanu = (anu)parambiz.next();
          a locala = new a();
          locala.mediaId = localanu.mmR;
          localb.pwl.put(localanu.mmR, locala);
          pwf.put(localanu.mmR, new WeakReference(localb));
        }
        localb.startTime = System.currentTimeMillis();
        pwe.put(paramString, localb);
        GMTrace.o(8106750771200L, 60400);
        return;
      }
      if (r.hkJ) {
        w.d("MicroMsg.TimelineSmallPicStat", "onItemAdd error, timelineObject is nulli");
      }
    }
    GMTrace.o(8106750771200L, 60400);
  }
  
  public final void bir()
  {
    GMTrace.i(8107019206656L, 60402);
    w.d("MicroMsg.TimelineSmallPicStat", "reportAll, reportData.size:%d", new Object[] { Integer.valueOf(pwe.size()) });
    int i = i.bhU();
    Iterator localIterator = pwe.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (b)pwe.get(localObject);
      if ((localObject != null) && (((b)localObject).med))
      {
        if ((((b)localObject).pwi == -1L) || (((b)localObject).pwg == -1L) || (((b)localObject).startTime == -1L))
        {
          if (((b)localObject).startTime == -1L) {
            continue;
          }
          ((b)localObject).endTime = System.currentTimeMillis();
          ((b)localObject).pwi = (((b)localObject).endTime - ((b)localObject).startTime);
          if (((b)localObject).pwj != ((b)localObject).pwk) {
            break label289;
          }
        }
        label289:
        for (((b)localObject).pwg = 1L;; ((b)localObject).pwg = 2L)
        {
          w.d("MicroMsg.TimelineSmallPicStat", "reportAll, picNum:%d, loadResult:%d, loadCostTime:%d, loadPicNum:%d, networkType:%d", new Object[] { Integer.valueOf(((b)localObject).pwj), Long.valueOf(((b)localObject).pwg), Long.valueOf(((b)localObject).pwi), Integer.valueOf(((b)localObject).pwk), Integer.valueOf(i) });
          g.ork.i(11600, new Object[] { Integer.valueOf(((b)localObject).pwj), Long.valueOf(((b)localObject).pwg), Long.valueOf(((b)localObject).pwi), Integer.valueOf(((b)localObject).pwk), Integer.valueOf(i) });
          break;
        }
      }
    }
    pwe.clear();
    pwf.clear();
    GMTrace.o(8107019206656L, 60402);
  }
  
  final class a
  {
    String mediaId;
    long pwg;
    
    a()
    {
      GMTrace.i(8152653234176L, 60742);
      this.pwg = -1L;
      GMTrace.o(8152653234176L, 60742);
    }
  }
  
  final class b
  {
    long endTime;
    boolean med;
    long pwg;
    long pwi;
    int pwj;
    int pwk;
    HashMap<String, au.a> pwl;
    long startTime;
    
    b()
    {
      GMTrace.i(8121380503552L, 60509);
      this.startTime = -1L;
      this.endTime = -1L;
      this.pwg = -1L;
      this.pwi = -1L;
      this.pwj = 0;
      this.pwk = 0;
      this.med = false;
      this.pwl = new HashMap();
      GMTrace.o(8121380503552L, 60509);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */