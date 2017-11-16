package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.fh;
import com.tencent.mm.protocal.c.fi;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tq;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ac
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static AtomicInteger lcl;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private LinkedList<Integer> lch;
  private int lci;
  private boolean lcj;
  private boolean lck;
  
  static
  {
    GMTrace.i(6310917570560L, 47020);
    lcl = new AtomicInteger(0);
    GMTrace.o(6310917570560L, 47020);
  }
  
  public ac(LinkedList<Integer> paramLinkedList)
  {
    GMTrace.i(6309575393280L, 47010);
    this.fUd = null;
    this.lcj = false;
    this.lck = false;
    this.lci = 0;
    b.a locala = new b.a();
    locala.gtF = new fh();
    locala.gtG = new fi();
    locala.uri = "/cgi-bin/micromsg-bin/batchgetfavitem";
    locala.gtE = 402;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.lch = paramLinkedList;
    lcl.incrementAndGet();
    GMTrace.o(6309575393280L, 47010);
  }
  
  private boolean ayn()
  {
    GMTrace.i(6310246481920L, 47015);
    at.AR();
    boolean bool1;
    if (bg.e((Integer)com.tencent.mm.y.c.xh().get(8217, null)) == 0)
    {
      bool1 = true;
      if ((this.lch == null) || (this.lci >= this.lch.size())) {
        break label104;
      }
    }
    label104:
    for (boolean bool2 = true;; bool2 = false)
    {
      w.i("MicroMsg.NetSceneBatchgetFav", "check needContinue, notInit %B indexOK %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) || (!bool2)) {
        break label109;
      }
      GMTrace.o(6310246481920L, 47015);
      return true;
      bool1 = false;
      break;
    }
    label109:
    GMTrace.o(6310246481920L, 47015);
    return false;
  }
  
  public static void ayo()
  {
    GMTrace.i(6309709611008L, 47011);
    lcl.set(0);
    GMTrace.o(6309709611008L, 47011);
  }
  
  public static void ayp()
  {
    GMTrace.i(6309843828736L, 47012);
    lcl.decrementAndGet();
    GMTrace.o(6309843828736L, 47012);
  }
  
  public static int ayq()
  {
    GMTrace.i(6309978046464L, 47013);
    int i = lcl.get();
    GMTrace.o(6309978046464L, 47013);
    return i;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6310112264192L, 47014);
    w.i("MicroMsg.NetSceneBatchgetFav", "ashutest::doscene count:%d", new Object[] { Integer.valueOf(lcl.get()) });
    if ((this.lch == null) || (this.lch.isEmpty()) || (this.lci >= this.lch.size()))
    {
      w.e("MicroMsg.NetSceneBatchgetFav", "klem doScene, idlist null, begIndex %d", new Object[] { Integer.valueOf(this.lci) });
      GMTrace.o(6310112264192L, 47014);
      return -1;
    }
    w.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene size %d, begIndex %d, total %s", new Object[] { Integer.valueOf(this.lch.size()), Integer.valueOf(this.lci), this.lch });
    at.AR();
    if (bg.e((Integer)com.tencent.mm.y.c.xh().get(8217, null)) == 0)
    {
      w.w("MicroMsg.NetSceneBatchgetFav", "klem doScene, init not done, do not batchget");
      GMTrace.o(6310112264192L, 47014);
      return -1;
    }
    fh localfh = (fh)this.fUa.gtC.gtK;
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.lch.subList(this.lci, Math.min(this.lci + 15, this.lch.size())));
    localfh.tTH = localLinkedList;
    localfh.jhc = localLinkedList.size();
    this.lci += 15;
    w.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene checkd size %d, %s", new Object[] { Integer.valueOf(localLinkedList.size()), localLinkedList });
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6310112264192L, 47014);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6310514917376L, 47017);
    int i = k.b.gum;
    GMTrace.o(6310514917376L, 47017);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6310380699648L, 47016);
    w.i("MicroMsg.NetSceneBatchgetFav", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.lci), Integer.valueOf(this.lch.size()), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (ayn())
      {
        a(this.gtW, this.fUd);
        GMTrace.o(6310380699648L, 47016);
        return;
      }
      lcl.decrementAndGet();
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6310380699648L, 47016);
      return;
    }
    paramq = (fi)((b)paramq).gtD.gtK;
    int i = paramq.jhc;
    int j = paramq.tTQ.size();
    if (i != j)
    {
      if (this.lci > this.lch.size()) {}
      for (paramInt1 = this.lch.size() % 15;; paramInt1 = 15)
      {
        w.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet resp list size:%d, return count %d, request count %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt1) });
        if (!ayn()) {
          break;
        }
        a(this.gtW, this.fUd);
        GMTrace.o(6310380699648L, 47016);
        return;
      }
      lcl.decrementAndGet();
      this.fUd.a(paramInt2, -1, paramString, this);
      GMTrace.o(6310380699648L, 47016);
      return;
    }
    paramInt1 = 0;
    while (paramInt1 < j)
    {
      paramArrayOfByte = (tq)paramq.tTQ.get(paramInt1);
      w.i("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d, status:%d", new Object[] { Integer.valueOf(paramArrayOfByte.tPL), Integer.valueOf(paramArrayOfByte.jhA) });
      j localj;
      if (paramArrayOfByte.jhA == 0)
      {
        localj = h.axB().cg(paramArrayOfByte.tPL);
        if (localj == null)
        {
          w.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d not exist!", new Object[] { Integer.valueOf(paramArrayOfByte.tPL) });
          paramInt1 += 1;
          continue;
        }
        localj.field_xml = paramArrayOfByte.tPS;
        localj.xF(paramArrayOfByte.tPS);
        localj.field_flag = paramArrayOfByte.tPM;
        localj.field_localSeq = paramArrayOfByte.tPO;
        localj.field_updateTime = (paramArrayOfByte.tPN * 1000L + paramInt1);
        w.i("MicroMsg.NetSceneBatchgetFav", "huahuahailang:item field_xml batgch get :\n %s", new Object[] { localj.field_xml });
        i = localj.field_favProto.ulB.size();
        if (i != 0) {
          break label670;
        }
        w.v("MicroMsg.NetSceneBatchgetFav", "this item has no data, favId:%d", new Object[] { Integer.valueOf(localj.field_id) });
        w.i("MicroMsg.NetSceneBatchgetFav", "data dealed needUpload:%b  needDownload:%b", new Object[] { Boolean.valueOf(this.lck), Boolean.valueOf(this.lcj) });
        if (!this.lck) {
          break label1091;
        }
        localj.field_itemStatus = 15;
        h.axB().a(localj, new String[] { "localId" });
        h.axv().run();
      }
      for (;;)
      {
        x.r(localj);
        localj.xG("MicroMsg.NetSceneBatchgetFav");
        if ((paramArrayOfByte.tPM & 0x1) == 0) {
          break;
        }
        w.d("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favId: %d status not exist, delete local item", new Object[] { Integer.valueOf(paramArrayOfByte.tPL) });
        x.a(h.axB().cg(paramArrayOfByte.tPL), null);
        break;
        label670:
        LinkedList localLinkedList = localj.field_favProto.ulB;
        i -= 1;
        label686:
        th localth;
        if (i >= 0)
        {
          localth = (th)localLinkedList.get(i);
          if (!bg.nm(localth.ujK))
          {
            File localFile = new File(x.g(localth));
            w.i("MicroMsg.NetSceneBatchgetFav", "dataFIle: %s", new Object[] { localFile.getName() });
            if (localFile.exists()) {
              break label934;
            }
            if ((!bg.nm(localth.ujv)) && (!bg.nm(localth.ujt))) {
              break label886;
            }
            w.e("MicroMsg.NetSceneBatchgetFav", "data key or url null. favId:%d", new Object[] { Integer.valueOf(localj.field_id) });
          }
          label803:
          if (!bg.nm(localth.ujV))
          {
            if (new File(x.h(localth)).exists()) {
              break label1057;
            }
            if ((!bg.nm(localth.ujp)) && (!bg.nm(localth.giD))) {
              break label1010;
            }
            w.w("MicroMsg.NetSceneBatchgetFav", "thumb key or url null. favId:%d", new Object[] { Integer.valueOf(localj.field_id) });
          }
        }
        for (;;)
        {
          i -= 1;
          break label686;
          break;
          label886:
          w.d("MicroMsg.NetSceneBatchgetFav", "local data not exist, insert cdninfo, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localj.field_id), Integer.valueOf(i) });
          x.a(localth, localj, 1, false);
          this.lcj = true;
          break label803;
          label934:
          if (localth.ukj != 0)
          {
            w.v("MicroMsg.NetSceneBatchgetFav", "server upload data failed, client upload, md5%s", new Object[] { localth.ujK });
            this.lck = true;
            x.a(localth, localj, 0, false);
          }
          w.d("MicroMsg.NetSceneBatchgetFav", "data exist, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localj.field_id), Integer.valueOf(i) });
          break label803;
          label1010:
          w.d("MicroMsg.NetSceneBatchgetFav", "local thumb not exist, insert cdninfo, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localj.field_id), Integer.valueOf(i) });
          x.a(localth, localj, 1);
          this.lcj = true;
          continue;
          label1057:
          w.d("MicroMsg.NetSceneBatchgetFav", "thumb exist, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localj.field_id), Integer.valueOf(i) });
        }
        label1091:
        if (this.lcj)
        {
          localj.field_itemStatus = 10;
          h.axB().a(localj, new String[] { "localId" });
        }
        else
        {
          localj.field_itemStatus = 10;
          h.axB().a(localj, new String[] { "localId" });
        }
      }
    }
    h.axv().run();
    if (ayn())
    {
      a(this.gtW, this.fUd);
      GMTrace.o(6310380699648L, 47016);
      return;
    }
    lcl.decrementAndGet();
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6310380699648L, 47016);
  }
  
  public final int getType()
  {
    GMTrace.i(6310783352832L, 47019);
    GMTrace.o(6310783352832L, 47019);
    return 402;
  }
  
  protected final int vB()
  {
    GMTrace.i(6310649135104L, 47018);
    GMTrace.o(6310649135104L, 47018);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */