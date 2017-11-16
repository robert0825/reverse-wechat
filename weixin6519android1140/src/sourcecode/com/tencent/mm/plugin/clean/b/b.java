package com.tencent.mm.plugin.clean.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.clean.c.i;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
  implements Runnable
{
  private long jSM;
  private List<String> jSQ;
  private List<i> jSR;
  private com.tencent.mm.plugin.clean.c.h jSS;
  
  public b(List<String> paramList, List<i> paramList1, com.tencent.mm.plugin.clean.c.h paramh)
  {
    GMTrace.i(20558800486400L, 153175);
    this.jSM = 0L;
    this.jSQ = paramList;
    this.jSR = paramList1;
    this.jSS = paramh;
    GMTrace.o(20558800486400L, 153175);
  }
  
  private String aiH()
  {
    GMTrace.i(21052184854528L, 156851);
    String str = hashCode();
    GMTrace.o(21052184854528L, 156851);
    return str;
  }
  
  private void ak(List<com.tencent.mm.plugin.i.b.a> paramList)
  {
    GMTrace.i(20558934704128L, 153176);
    int j = paramList.size();
    HashSet localHashSet = new HashSet();
    at.AR();
    long l1 = com.tencent.mm.y.c.yH().cE(Thread.currentThread().getId());
    int i = 0;
    while (i < j)
    {
      com.tencent.mm.plugin.i.b.a locala = (com.tencent.mm.plugin.i.b.a)paramList.get(i);
      long l2 = bg.Pw();
      if (!localHashSet.contains(Long.valueOf(locala.field_msgId)))
      {
        at.AR();
        au localau = com.tencent.mm.y.c.yM().cM(locala.field_msgId);
        if ((localau.field_msgId != 0L) && (!localau.bTO()))
        {
          com.tencent.mm.plugin.i.b localb = com.tencent.mm.plugin.i.b.aiA();
          long l3 = locala.field_msgId;
          localb.rZT = true;
          localb.yvi.add(Long.valueOf(l3));
          w.d("MicroMsg.CalcWxService", "%d lock msg change [%d] [%s]", new Object[] { Integer.valueOf(localb.hashCode()), Long.valueOf(l3), bg.bQW() });
          localau.bTP();
          at.AR();
          com.tencent.mm.y.c.yM().a(locala.field_msgId, localau);
        }
        localHashSet.add(Long.valueOf(locala.field_msgId));
        w.d("MicroMsg.DeleteFileByWxIndex", "%s deleteByIndex handle msg[%d]", new Object[] { aiH(), Long.valueOf(bg.aI(l2)) });
      }
      if ((locala != null) && (!com.tencent.mm.plugin.i.a.ly(locala.field_msgSubType)) && (locala.field_size > 0L))
      {
        this.jSM += locala.field_size;
        FileOp.deleteFile(com.tencent.mm.kernel.h.xy().fYT + locala.field_path);
        locala.field_path = "";
        locala.field_size = 0L;
        com.tencent.mm.plugin.i.b.aiA().aiB().a(locala.vmr, locala, false);
      }
      w.d("MicroMsg.DeleteFileByWxIndex", "%s deleteByIndex[%d]", new Object[] { aiH(), Long.valueOf(bg.aI(l2)) });
      i += 1;
    }
    at.AR();
    com.tencent.mm.y.c.yH().aL(l1);
    GMTrace.o(20558934704128L, 153176);
  }
  
  public final void run()
  {
    GMTrace.i(20559068921856L, 153177);
    int j;
    int i;
    long l1;
    if (this.jSQ != null)
    {
      long l5 = bg.Pw();
      j = this.jSQ.size();
      Iterator localIterator2 = this.jSQ.iterator();
      i = 0;
      while (localIterator2.hasNext())
      {
        String str1 = (String)localIterator2.next();
        if (!bg.nm(str1))
        {
          long l6 = bg.Pw();
          PLong localPLong1 = new PLong();
          PLong localPLong2 = new PLong();
          Object localObject4 = com.tencent.mm.plugin.i.b.aiA().aiB();
          l1 = bg.Pw();
          String str2 = "select max(msgtime), min(msgtime) from WxFileIndex2 where username='" + str1 + "' and msgSubType in (1,20,23,30,32,34 ) and size" + " > 0 ";
          Object localObject3 = null;
          Object localObject1 = null;
          try
          {
            localObject4 = ((com.tencent.mm.plugin.i.b.b)localObject4).fTZ.rawQuery(str2, null);
            if (localObject4 != null)
            {
              localObject1 = localObject4;
              localObject3 = localObject4;
              if (((Cursor)localObject4).moveToFirst())
              {
                localObject1 = localObject4;
                localObject3 = localObject4;
                localPLong1.value = ((Cursor)localObject4).getLong(0);
                localObject1 = localObject4;
                localObject3 = localObject4;
                localPLong2.value = ((Cursor)localObject4).getLong(1);
              }
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              long l3;
              localObject3 = localObject1;
              w.printErrStackTrace("MicroMsg.WxFileIndexStorage", localException, " sql [%s]", new Object[] { str2 });
              if (localObject1 != null) {
                ((Cursor)localObject1).close();
              }
            }
          }
          finally
          {
            if (localObject3 == null) {
              break label502;
            }
            ((Cursor)localObject3).close();
          }
          w.i("MicroMsg.WxFileIndexStorage", "getNoThumbMediaMsgTimeByUsername [%s] cost[%d]", new Object[] { str1, Long.valueOf(bg.aI(l1)) });
          localPLong2.value -= 1L;
          l3 = localPLong1.value;
          long l2 = Math.max(l3 - 2592000000L, localPLong2.value);
          l1 = l2;
          if (l2 == l3) {
            l1 = l2 - 1L;
          }
          localObject1 = com.tencent.mm.plugin.i.b.aiA().aiB().u(str1, l3, l1);
          l2 = ((List)localObject1).size();
          ak((List)localObject1);
          l2 = 0L + l2;
          for (l3 = l1; l3 > localPLong2.value; l3 = l1)
          {
            long l4 = Math.max(l3 - 2592000000L, localPLong2.value);
            l1 = l4;
            if (l4 == l3) {
              l1 = l4 - 1L;
            }
            localObject1 = com.tencent.mm.plugin.i.b.aiA().aiB().u(str1, l3, l1);
            l3 = ((List)localObject1).size();
            ak((List)localObject1);
            l2 = l3 + l2;
          }
          label502:
          w.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByName [%s] [%d] [%d %d] cost[%d]", new Object[] { aiH(), str1, Long.valueOf(l2), Long.valueOf(localPLong2.value), Long.valueOf(localPLong1.value), Long.valueOf(bg.aI(l6)) });
        }
        i += 1;
        if (this.jSS != null) {
          this.jSS.bR(i, j);
        }
      }
      if (this.jSS != null) {
        this.jSS.be(this.jSM);
      }
      com.tencent.mm.plugin.i.b.aiA().bMR();
      w.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByUsername cost[%d]", new Object[] { aiH(), Long.valueOf(bg.aI(l5)) });
      GMTrace.o(20559068921856L, 153177);
      return;
    }
    if (this.jSR != null)
    {
      l1 = bg.Pw();
      j = this.jSR.size();
      Iterator localIterator1 = this.jSR.iterator();
      i = 0;
      while (localIterator1.hasNext())
      {
        ak(((i)localIterator1.next()).jTu);
        i += 1;
        if (this.jSS != null) {
          this.jSS.bR(i, j);
        }
      }
      if (this.jSS != null) {
        this.jSS.be(this.jSM);
      }
      com.tencent.mm.plugin.i.b.aiA().bMR();
      w.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByNewAnalyseItem cost[%d]", new Object[] { aiH(), Long.valueOf(bg.aI(l1)) });
      GMTrace.o(20559068921856L, 153177);
      return;
    }
    GMTrace.o(20559068921856L, 153177);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */