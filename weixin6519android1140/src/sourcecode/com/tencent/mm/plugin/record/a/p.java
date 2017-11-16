package com.tencent.mm.plugin.record.a;

import android.database.Cursor;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.ao.c.a;
import com.tencent.mm.ao.d;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.model.app.ab;
import com.tencent.mm.pluginsdk.model.app.am.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class p
  implements com.tencent.mm.ad.e, i.a
{
  public boolean ogV;
  public SparseArray<e> ogY;
  LinkedList<k> ogZ;
  
  public p()
  {
    GMTrace.i(7498073374720L, 55865);
    this.ogV = false;
    this.ogY = new SparseArray();
    this.ogZ = new LinkedList();
    at.wS().a(632, this);
    s.baL().a(this);
    GMTrace.o(7498073374720L, 55865);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7498610245632L, 55869);
    w.i("MicroMsg.RecordMsgSendService", "on scene end, errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk == null)
    {
      w.w("MicroMsg.RecordMsgSendService", "on scene end, scene is null");
      GMTrace.o(7498610245632L, 55869);
      return;
    }
    switch (paramk.getType())
    {
    default: 
      this.ogV = false;
      a(null);
      GMTrace.o(7498610245632L, 55869);
      return;
    }
    w.d("MicroMsg.RecordMsgSendService", "batch tran cdn callback, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = (a)paramk;
    int k = paramInt1;
    int i = paramInt2;
    if (paramInt1 == 3)
    {
      paramk = paramString.ogS.field_dataProto.ulB.iterator();
      do
      {
        if (!paramk.hasNext()) {
          break;
        }
      } while (((th)paramk.next()).aGU == 1);
    }
    for (int j = 0;; j = 1)
    {
      k = paramInt1;
      i = paramInt2;
      if (j != 0)
      {
        k = 0;
        i = 0;
      }
      Object localObject1;
      if ((k == 0) && (i == 0))
      {
        at.AR();
        paramk = com.tencent.mm.y.c.yM().cM(paramString.ogS.field_msgId);
        if (paramk.field_msgId == paramString.ogS.field_msgId)
        {
          paramk.setContent(paramString.ogR);
          paramk.dB(1);
          at.AR();
          com.tencent.mm.y.c.yM().a(paramString.ogS.field_msgId, paramk);
        }
        localObject1 = an.bJI().er(paramString.ogS.field_msgId);
        if (localObject1 != null)
        {
          ((com.tencent.mm.x.f)localObject1).field_xml = paramk.field_content;
          an.bJI().c((com.tencent.mm.sdk.e.c)localObject1, new String[] { "msgId" });
        }
        s.baK().th(paramString.ogS.field_localId);
        this.ogY.remove(paramString.ogS.field_localId);
        an.bJK();
        am.a.ev(paramString.ogS.field_msgId);
        w.d("MicroMsg.RecordMsgSendService", "batch tran cdn ok, msgId[%d], recordLocalId[%d], begin send appmsg", new Object[] { Long.valueOf(paramString.ogS.field_msgId), Integer.valueOf(paramString.ogS.field_localId) });
        break;
      }
      w.w("MicroMsg.RecordMsgSendService", "batch tran cdn fail, msgId[%d], recordLocalId[%d]", new Object[] { Long.valueOf(paramString.ogS.field_msgId), Integer.valueOf(paramString.ogS.field_localId) });
      w.w("MicroMsg.RecordMsgSendService", "try upload from local");
      paramk = paramString.ogS.field_dataProto.ulB.iterator();
      while (paramk.hasNext())
      {
        localObject1 = (th)paramk.next();
        String str;
        Object localObject2;
        boolean bool;
        if (((th)localObject1).ujO > 0L)
        {
          str = m.d(((th)localObject1).lhq, paramString.ogS.field_msgId, false);
          if (s.baL().Fv(str) == null)
          {
            localObject2 = new g();
            ((g)localObject2).field_cdnKey = ((th)localObject1).ujv;
            ((g)localObject2).field_cdnUrl = ((th)localObject1).ujt;
            ((g)localObject2).field_dataId = ((th)localObject1).lhq;
            ((g)localObject2).field_mediaId = str;
            ((g)localObject2).field_totalLen = ((int)((th)localObject1).ujO);
            ((g)localObject2).field_localId = ((g)localObject2).field_mediaId.hashCode();
            ((g)localObject2).field_path = m.c((th)localObject1, paramString.ogS.field_msgId);
            ((g)localObject2).field_type = 2;
            ((g)localObject2).field_fileType = m.ti(((th)localObject1).aGU);
            ((g)localObject2).field_recordLocalId = paramString.ogS.field_localId;
            ((g)localObject2).field_toUser = paramString.ogS.field_toUser;
            ((g)localObject2).field_isThumb = false;
            bool = s.baL().a((g)localObject2);
            w.d("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(((g)localObject2).field_localId), Boolean.valueOf(bool) });
          }
        }
        if (((th)localObject1).ujZ > 0L)
        {
          str = m.xQ(((th)localObject1).lhq);
          localObject2 = m.d(str, paramString.ogS.field_msgId, false);
          if (s.baL().Fv((String)localObject2) == null)
          {
            g localg = new g();
            localg.field_cdnKey = ((th)localObject1).ujp;
            localg.field_cdnUrl = ((th)localObject1).giD;
            localg.field_dataId = str;
            localg.field_mediaId = ((String)localObject2);
            localg.field_totalLen = ((int)((th)localObject1).ujZ);
            localg.field_localId = localg.field_mediaId.hashCode();
            localg.field_path = m.f((th)localObject1, paramString.ogS.field_msgId);
            localg.field_type = 2;
            localg.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
            localg.field_recordLocalId = paramString.ogS.field_localId;
            localg.field_toUser = paramString.ogS.field_toUser;
            localg.field_isThumb = true;
            bool = s.baL().a(localg);
            w.d("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(localg.field_localId), Boolean.valueOf(bool) });
          }
        }
      }
      s.baN().run();
      GMTrace.o(7498610245632L, 55869);
      return;
    }
  }
  
  public final void a(int paramInt, g paramg)
  {
    GMTrace.i(7498744463360L, 55870);
    if (1 != paramInt)
    {
      w.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but not care type %d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(7498744463360L, 55870);
      return;
    }
    if (paramg == null)
    {
      w.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but cdninfo is null");
      GMTrace.o(7498744463360L, 55870);
      return;
    }
    if (2 != paramg.field_type)
    {
      w.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but cdninfo type is not upload");
      GMTrace.o(7498744463360L, 55870);
      return;
    }
    if ((paramg.field_status == 0) || (1 == paramg.field_status))
    {
      w.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but not care status");
      GMTrace.o(7498744463360L, 55870);
      return;
    }
    Object localObject1 = s.baL();
    paramInt = paramg.field_recordLocalId;
    LinkedList localLinkedList = new LinkedList();
    Object localObject2 = "SELECT * FROM RecordCDNInfo WHERE recordLocalId = " + paramInt;
    localObject1 = ((i)localObject1).fTZ.a((String)localObject2, null, 2);
    if (localObject1 != null)
    {
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = new g();
        ((g)localObject2).b((Cursor)localObject1);
        localLinkedList.add(localObject2);
      }
      ((Cursor)localObject1).close();
    }
    w.d("MicroMsg.RecordMsgCDNStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    localObject1 = localLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (g)((Iterator)localObject1).next();
      if ((((g)localObject2).field_status == 0) || (1 == ((g)localObject2).field_status)) {
        w.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but %s not finish", new Object[] { ((g)localObject2).field_mediaId });
      }
    }
    for (paramInt = 0;; paramInt = 1)
    {
      if (paramInt == 0)
      {
        GMTrace.o(7498744463360L, 55870);
        return;
      }
      localObject1 = s.baK();
      paramInt = paramg.field_recordLocalId;
      localObject2 = "SELECT * FROM RecordMessageInfo WHERE localId=" + paramInt;
      w.d("MicroMsg.RecordMsgStorage", "get by local id, sql[%s], local[%d]", new Object[] { localObject2, Integer.valueOf(paramInt) });
      localObject2 = ((l)localObject1).fTZ.a((String)localObject2, null, 2);
      if ((localObject2 != null) && (((Cursor)localObject2).moveToFirst()))
      {
        localObject1 = new k();
        ((k)localObject1).b((Cursor)localObject2);
      }
      for (;;)
      {
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        paramInt = paramg.field_recordLocalId;
        boolean bool;
        if (localObject1 != null)
        {
          bool = true;
          w.d("MicroMsg.RecordMsgSendService", "finish get record info, id %d result %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
          if (localObject1 == null) {
            break label1059;
          }
          paramg = ((k)localObject1).field_dataProto.ulB;
          localObject2 = localLinkedList.iterator();
          label512:
          break label728;
        }
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label858;
          }
          g localg = (g)((Iterator)localObject2).next();
          w.v("MicroMsg.RecordMsgSendService", "check dataid[%s] isThumb[%B]", new Object[] { localg.field_dataId, Boolean.valueOf(localg.field_isThumb) });
          th localth;
          if (localg.field_isThumb)
          {
            localIterator = paramg.iterator();
            if (!localIterator.hasNext()) {
              continue;
            }
            localth = (th)localIterator.next();
            if (!localg.field_dataId.equals(m.xQ(localth.lhq))) {
              break label512;
            }
            w.d("MicroMsg.RecordMsgSendService", "match thumb, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]", new Object[] { localth.ujp, localg.field_cdnKey, localth.giD, localg.field_cdnUrl, Long.valueOf(localth.ujZ), Integer.valueOf(localg.field_totalLen) });
            localth.Qj(localg.field_cdnKey);
            localth.Qi(localg.field_cdnUrl);
            continue;
            bool = false;
            break;
          }
          Iterator localIterator = paramg.iterator();
          label728:
          if (localIterator.hasNext())
          {
            localth = (th)localIterator.next();
            if (!localg.field_dataId.equals(localth.lhq)) {
              break label512;
            }
            w.d("MicroMsg.RecordMsgSendService", "match data, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]", new Object[] { localth.ujv, localg.field_cdnKey, localth.ujt, localg.field_cdnUrl, Long.valueOf(localth.ujO), Integer.valueOf(localg.field_totalLen) });
            localth.Ql(localg.field_cdnKey);
            localth.Qk(localg.field_cdnUrl);
          }
        }
        label858:
        at.AR();
        paramg = com.tencent.mm.y.c.yM().cM(((k)localObject1).field_msgId);
        w.i("MicroMsg.RecordMsgSendService", "update msg content, msg null ? %B, msgId %d recordInfoId %d", new Object[] { Boolean.valueOf(false), Long.valueOf(paramg.field_msgId), Long.valueOf(((k)localObject1).field_msgId) });
        if (paramg.field_msgId == ((k)localObject1).field_msgId)
        {
          paramg.setContent(m.a(((k)localObject1).field_title, ((k)localObject1).field_desc, ((k)localObject1).field_dataProto, ((k)localObject1).field_favFrom));
          paramg.dB(1);
          at.AR();
          com.tencent.mm.y.c.yM().a(((k)localObject1).field_msgId, paramg);
        }
        localObject2 = an.bJI().er(((k)localObject1).field_msgId);
        if (localObject2 != null)
        {
          ((com.tencent.mm.x.f)localObject2).field_xml = paramg.field_content;
          an.bJI().c((com.tencent.mm.sdk.e.c)localObject2, new String[] { "msgId" });
        }
        s.baK().th(((k)localObject1).field_localId);
        this.ogY.remove(((k)localObject1).field_localId);
        an.bJK();
        am.a.ev(((k)localObject1).field_msgId);
        label1059:
        paramg = localLinkedList.iterator();
        while (paramg.hasNext())
        {
          localObject1 = (g)paramg.next();
          s.baL().a((g)localObject1, new String[] { "localId" });
        }
        this.ogV = false;
        a(null);
        GMTrace.o(7498744463360L, 55870);
        return;
        localObject1 = null;
      }
    }
  }
  
  public final void a(final k paramk)
  {
    GMTrace.i(7498207592448L, 55866);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7504247390208L, 55911);
        if (paramk != null)
        {
          if ((p.e)p.this.ogY.get(paramk.field_localId) == null)
          {
            w.d("MicroMsg.RecordMsgSendService", "summerrecord do add job, localid %d, msgid %d", new Object[] { Integer.valueOf(paramk.field_localId), Long.valueOf(paramk.field_msgId) });
            localObject1 = new p.e();
            p.this.ogY.put(paramk.field_localId, localObject1);
          }
          p.this.b(paramk);
        }
        p localp = p.this;
        if (localp.ogV)
        {
          w.d("MicroMsg.RecordMsgSendService", "summerrecord is working, return");
          GMTrace.o(7504247390208L, 55911);
          return;
        }
        if (localp.ogZ.isEmpty())
        {
          w.w("MicroMsg.RecordMsgSendService", "summerrecord jobs list size is 0");
          localObject2 = s.baK();
          localObject1 = new LinkedList();
          localObject2 = ((l)localObject2).Mx();
          if (localObject2 != null)
          {
            ((Cursor)localObject2).moveToFirst();
            while (!((Cursor)localObject2).isAfterLast())
            {
              localObject3 = new k();
              ((k)localObject3).b((Cursor)localObject2);
              ((List)localObject1).add(localObject3);
              ((Cursor)localObject2).moveToNext();
            }
            ((Cursor)localObject2).close();
          }
          w.d("MicroMsg.RecordMsgStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(((List)localObject1).size()) });
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (k)((Iterator)localObject1).next();
            at.AR();
            if (com.tencent.mm.y.c.yM().cM(((k)localObject2).field_msgId).field_type != 49)
            {
              w.w("MicroMsg.RecordMsgSendService", "summerrecord record msg not exist, delete record info, localid[%d], msgid[%d]", new Object[] { Integer.valueOf(((k)localObject2).field_localId), Long.valueOf(((k)localObject2).field_msgId) });
              s.baK().th(((k)localObject2).field_localId);
            }
            else
            {
              localObject3 = (p.e)localp.ogY.get(((k)localObject2).field_localId);
              if (localObject3 != null)
              {
                if ((((p.e)localObject3).hji < 0) && (SystemClock.elapsedRealtime() - ((p.e)localObject3).ohc < 300000L)) {
                  continue;
                }
                if (((p.e)localObject3).hji < 0) {
                  ((p.e)localObject3).hji = 3;
                }
              }
              for (;;)
              {
                w.d("MicroMsg.RecordMsgSendService", "summerrecord do add job from db, localid %d, msgid %d", new Object[] { Integer.valueOf(((k)localObject2).field_localId), Long.valueOf(((k)localObject2).field_msgId) });
                localp.b((k)localObject2);
                break;
                localObject3 = new p.e();
                localp.ogY.put(((k)localObject2).field_localId, localObject3);
              }
            }
          }
        }
        if (localp.ogZ.isEmpty())
        {
          w.w("MicroMsg.RecordMsgSendService", "try to do job, but job list size is empty, return");
          localp.finish();
          GMTrace.o(7504247390208L, 55911);
          return;
        }
        Object localObject3 = (k)localp.ogZ.removeFirst();
        Object localObject2 = (p.e)localp.ogY.get(((k)localObject3).field_localId);
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new p.e();
          localp.ogY.put(((k)localObject3).field_localId, localObject1);
        }
        ((p.e)localObject1).hji -= 1;
        int i;
        if (((p.e)localObject1).hji < 0) {
          if (300000L > SystemClock.elapsedRealtime() - ((p.e)localObject1).ohc) {
            i = 0;
          }
        }
        while (i != 0)
        {
          localp.ogV = true;
          switch (((k)localObject3).field_type)
          {
          default: 
            localp.ogV = false;
            GMTrace.o(7504247390208L, 55911);
            return;
            ((p.e)localObject1).hji = 2;
            ((p.e)localObject1).ohc = SystemClock.elapsedRealtime();
            i = 1;
            break;
          case 1: 
            com.tencent.mm.sdk.f.e.post(new p.c(localp, (k)localObject3), "RecordMsgSendService_favDataCopy");
            GMTrace.o(7504247390208L, 55911);
            return;
          case 2: 
            com.tencent.mm.sdk.f.e.post(new p.a(localp, (k)localObject3), "RecordMsgSendService_chatDataCopy");
            GMTrace.o(7504247390208L, 55911);
            return;
          case 0: 
            com.tencent.mm.sdk.f.e.post(new p.d(localp, (k)localObject3), "RecordMsgSendService_normalDataCopy");
            GMTrace.o(7504247390208L, 55911);
            return;
          case 3: 
            com.tencent.mm.sdk.f.e.post(new p.b(localp, (k)localObject3), "RecordMsgSendService_chatDataDownLoad");
            GMTrace.o(7504247390208L, 55911);
            return;
          }
        }
        localp.a(null);
        GMTrace.o(7504247390208L, 55911);
      }
      
      public final String toString()
      {
        GMTrace.i(7504381607936L, 55912);
        String str = super.toString() + "|run";
        GMTrace.o(7504381607936L, 55912);
        return str;
      }
    });
    GMTrace.o(7498207592448L, 55866);
  }
  
  public final void b(k paramk)
  {
    GMTrace.i(7498341810176L, 55867);
    if (!this.ogZ.contains(paramk)) {
      this.ogZ.add(paramk);
    }
    GMTrace.o(7498341810176L, 55867);
  }
  
  final void finish()
  {
    GMTrace.i(7498476027904L, 55868);
    this.ogZ.clear();
    this.ogY.clear();
    this.ogV = false;
    GMTrace.o(7498476027904L, 55868);
  }
  
  private final class a
    implements Runnable
  {
    private k ogS;
    
    public a(k paramk)
    {
      GMTrace.i(7516461203456L, 56002);
      this.ogS = paramk;
      GMTrace.o(7516461203456L, 56002);
    }
    
    public final void run()
    {
      GMTrace.i(7516595421184L, 56003);
      Iterator localIterator = this.ogS.field_dataProto.ulB.iterator();
      int k;
      for (int j = 0; localIterator.hasNext(); j = k)
      {
        th localth = (th)localIterator.next();
        int i;
        String str;
        Object localObject;
        boolean bool;
        if (bg.nm(localth.ujt))
        {
          i = j;
          if (!com.tencent.mm.a.e.aZ(localth.ujR)) {}
        }
        else
        {
          str = localth.ujR;
          localObject = m.c(localth, this.ogS.field_msgId);
          bool = j.r(str, (String)localObject, false);
          w.d("MicroMsg.RecordMsgSendService", "summerrecord CdnDataUrl[%s] copy[%s] to [%s] result[%B]", new Object[] { localth.ujt, str, localObject, Boolean.valueOf(bool) });
          k = j;
          if (bool)
          {
            if (bg.nm(localth.ujK))
            {
              w.i("MicroMsg.RecordMsgSendService", "summerrecord not find full md5, try to calculate");
              localth.Qr(com.tencent.mm.a.g.bg((String)localObject));
              j = 1;
            }
            k = j;
            if (bg.nm(localth.ujM))
            {
              w.i("MicroMsg.RecordMsgSendService", "summerrecord not find head 256 md5, try to calculate");
              localth.Qs(com.tencent.mm.a.g.bh((String)localObject));
              k = 1;
            }
          }
          if (com.tencent.mm.a.e.aY((String)localObject) != 0) {
            localth.ey(com.tencent.mm.a.e.aY((String)localObject));
          }
          str = m.d(localth.lhq, this.ogS.field_msgId, false);
          i = k;
          if (s.baL().Fv(str) == null)
          {
            localObject = new g();
            ((g)localObject).field_cdnKey = localth.ujv;
            ((g)localObject).field_cdnUrl = localth.ujt;
            ((g)localObject).field_dataId = localth.lhq;
            ((g)localObject).field_mediaId = str;
            ((g)localObject).field_totalLen = ((int)localth.ujO);
            ((g)localObject).field_localId = ((g)localObject).field_mediaId.hashCode();
            ((g)localObject).field_path = m.c(localth, this.ogS.field_msgId);
            ((g)localObject).field_type = 2;
            ((g)localObject).field_fileType = m.ti(localth.aGU);
            ((g)localObject).field_recordLocalId = this.ogS.field_localId;
            ((g)localObject).field_toUser = this.ogS.field_toUser;
            ((g)localObject).field_isThumb = false;
            bool = s.baL().a((g)localObject);
            w.d("MicroMsg.RecordMsgSendService", "summerrecord insert localId[%d] result[%B] fileType[%d], mediaId[%s]", new Object[] { Integer.valueOf(((g)localObject).field_localId), Boolean.valueOf(bool), Integer.valueOf(((g)localObject).field_fileType), str });
            i = k;
          }
        }
        if (bg.nm(localth.giD))
        {
          k = i;
          if (!com.tencent.mm.a.e.aZ(localth.ujT)) {}
        }
        else
        {
          str = localth.ujT;
          localObject = m.f(localth, this.ogS.field_msgId);
          bool = j.r(str, (String)localObject, false);
          w.d("MicroMsg.RecordMsgSendService", "copy thumb[%s] to [%s] result[%B]", new Object[] { str, localObject, Boolean.valueOf(bool) });
          localth.ez(com.tencent.mm.a.e.aY((String)localObject));
          j = i;
          if (bool)
          {
            if (bg.nm(localth.ujV))
            {
              w.i("MicroMsg.RecordMsgSendService", "not find ThumbMd5 md5, try to calculate");
              localth.Qw(com.tencent.mm.a.g.bg((String)localObject));
              i = 1;
            }
            j = i;
            if (bg.nm(localth.ujX))
            {
              w.i("MicroMsg.RecordMsgSendService", "not find Thumb Head 256 Md5, try to calculate");
              localth.Qx(com.tencent.mm.a.g.bh((String)localObject));
              j = 1;
            }
          }
          str = m.xQ(localth.lhq);
          localObject = m.d(str, this.ogS.field_msgId, false);
          k = j;
          if (s.baL().Fv((String)localObject) == null)
          {
            g localg = new g();
            localg.field_cdnKey = localth.ujp;
            localg.field_cdnUrl = localth.giD;
            localg.field_dataId = str;
            localg.field_mediaId = ((String)localObject);
            localg.field_totalLen = ((int)localth.ujZ);
            localg.field_localId = localg.field_mediaId.hashCode();
            localg.field_path = m.f(localth, this.ogS.field_msgId);
            localg.field_type = 2;
            localg.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
            localg.field_recordLocalId = this.ogS.field_localId;
            localg.field_toUser = this.ogS.field_toUser;
            localg.field_isThumb = true;
            bool = s.baL().a(localg);
            w.d("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(localg.field_localId), Boolean.valueOf(bool) });
            k = j;
          }
        }
      }
      if (j != 0)
      {
        w.d("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", new Object[] { Integer.valueOf(this.ogS.field_localId), Long.valueOf(this.ogS.field_msgId), Integer.valueOf(this.ogS.field_type) });
        s.baK().c(this.ogS, new String[] { "localId" });
      }
      s.baN().run();
      GMTrace.o(7516595421184L, 56003);
    }
  }
  
  private final class b
    implements com.tencent.mm.ad.e, s.a, Runnable
  {
    public boolean eqi;
    public int i;
    public k ogS;
    HashMap<Long, Boolean> ohn;
    HashMap<Long, String> ohr;
    
    public b(k paramk)
    {
      GMTrace.i(7517937598464L, 56013);
      this.i = 0;
      this.ohn = new HashMap();
      this.ohr = new HashMap();
      this.eqi = false;
      this.ogS = paramk;
      o.Nh().a(this, Looper.getMainLooper());
      at.wS().a(221, this);
      GMTrace.o(7517937598464L, 56013);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(7518340251648L, 56016);
      if ((paramk instanceof ab))
      {
        at.wS().b(221, this);
        if (this.ohr != null)
        {
          paramk = this.ohr.entrySet().iterator();
          while (paramk.hasNext())
          {
            paramString = (Map.Entry)paramk.next();
            long l = ((Long)paramString.getKey()).longValue();
            paramString = (String)paramString.getValue();
            if ((l > 0L) && (!((Boolean)this.ohn.get(Long.valueOf(l))).booleanValue()))
            {
              at.AR();
              com.tencent.mm.y.c.yM().cM(l);
              com.tencent.mm.pluginsdk.model.app.b localb = com.tencent.mm.pluginsdk.model.app.l.ab(paramString, l);
              paramString = null;
              if (localb != null) {
                paramString = localb.field_fileFullPath;
              }
              if ((paramString != null) && (paramString.length() > 0))
              {
                this.ohn.put(Long.valueOf(l), Boolean.valueOf(true));
                paramString = this.ogS.field_dataProto.ulB.iterator();
                while (paramString.hasNext())
                {
                  th localth = (th)paramString.next();
                  if (localth.ukz == l) {
                    localth.Qu(localb.field_fileFullPath);
                  }
                }
              }
            }
          }
        }
        a(this.ohn, this.eqi, this.ogS);
        GMTrace.o(7518340251648L, 56016);
        return;
      }
      a(null, this.eqi, this.ogS);
      GMTrace.o(7518340251648L, 56016);
    }
    
    public final void a(s.a.a parama)
    {
      GMTrace.i(7518206033920L, 56015);
      parama = t.mw(parama.euR);
      if (parama != null)
      {
        at.AR();
        au localau = com.tencent.mm.y.c.yM().cM(parama.hcw);
        if (parama.Nw())
        {
          this.ohn.put(Long.valueOf(localau.field_msgId), Boolean.valueOf(true));
          a(this.ohn, this.eqi, this.ogS);
        }
        GMTrace.o(7518206033920L, 56015);
        return;
      }
      a(null, this.eqi, this.ogS);
      GMTrace.o(7518206033920L, 56015);
    }
    
    public final void a(HashMap<Long, Boolean> paramHashMap, boolean paramBoolean, k paramk)
    {
      GMTrace.i(7518474469376L, 56017);
      if (paramHashMap != null)
      {
        paramHashMap = paramHashMap.entrySet().iterator();
        do
        {
          if (!paramHashMap.hasNext()) {
            break;
          }
        } while (Boolean.valueOf(((Boolean)((Map.Entry)paramHashMap.next()).getValue()).booleanValue()).booleanValue());
      }
      for (int j = 0;; j = 1)
      {
        if ((j != 0) && (paramBoolean))
        {
          o.Nh().a(this);
          paramk.field_type = 2;
          s.baK().c(paramk, new String[] { "localId" });
          s.baM().a(paramk);
        }
        GMTrace.o(7518474469376L, 56017);
        return;
      }
    }
    
    public final void run()
    {
      GMTrace.i(7518071816192L, 56014);
      this.i = 0;
      this.eqi = false;
      Iterator localIterator = this.ogS.field_dataProto.ulB.iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (th)localIterator.next();
        final long l1 = ((th)localObject1).ukz;
        if (l1 > 0L)
        {
          at.AR();
          final au localau = com.tencent.mm.y.c.yM().cM(l1);
          final Object localObject2 = ((th)localObject1).ujR;
          if ((System.currentTimeMillis() - localau.field_createTime > 259200000L) && ((bg.nm((String)localObject2)) || (!com.tencent.mm.a.e.aZ((String)localObject2)))) {}
          for (int j = 1;; j = 0)
          {
            if (j == 0) {
              break label160;
            }
            w.i("MicroMsg.RecordMsgSendService", "dataItem is expired!! msgType:%s", new Object[] { Integer.valueOf(localau.field_type) });
            break;
          }
          label160:
          if (((th)localObject1).aGU == 2)
          {
            if (localau.bTC())
            {
              localObject2 = com.tencent.mm.ao.n.IZ().ap(localau.field_msgSvrId);
              label209:
              Object localObject3;
              long l2;
              long l3;
              if (localau.field_isSend == 1) {
                if (((d)localObject2).II())
                {
                  j = 1;
                  if ((((d)localObject2).offset >= ((d)localObject2).gsL) && (((d)localObject2).gsL != 0)) {
                    break label383;
                  }
                  this.ohn.put(Long.valueOf(l1), Boolean.valueOf(false));
                  this.i = this.ogS.field_dataProto.ulB.indexOf(localObject1);
                  localObject3 = com.tencent.mm.ao.n.Ja();
                  l2 = ((d)localObject2).gGR;
                  l3 = localau.field_msgId;
                  if (localau.field_isSend != 1) {
                    break label385;
                  }
                }
              }
              label383:
              label385:
              for (int k = R.g.aVk;; k = R.g.aVi)
              {
                ((com.tencent.mm.ao.c)localObject3).a(l2, l3, j, localObject1, k, new c.a()
                {
                  public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
                  {
                    GMTrace.i(7511360929792L, 55964);
                    p.b.this.ohn.put(Long.valueOf(l1), Boolean.valueOf(true));
                    p.b.this.a(p.b.this.ohn, p.b.this.eqi, p.b.this.ogS);
                    GMTrace.o(7511360929792L, 55964);
                  }
                  
                  public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject, int paramAnonymousInt3, int paramAnonymousInt4, com.tencent.mm.ad.k paramAnonymousk)
                  {
                    GMTrace.i(7511092494336L, 55962);
                    GMTrace.o(7511092494336L, 55962);
                  }
                  
                  public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject, int paramAnonymousInt3, int paramAnonymousInt4, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
                  {
                    GMTrace.i(7511226712064L, 55963);
                    boolean bool;
                    if ((paramAnonymousInt3 == 0) && (paramAnonymousInt4 == 0))
                    {
                      bool = true;
                      w.i("MicroMsg.RecordMsgSendService", "download image succed: %s, errType: %s, errCode:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramAnonymousInt3), Integer.valueOf(paramAnonymousInt4) });
                      if (!(paramAnonymousObject instanceof th)) {
                        break label308;
                      }
                      paramAnonymousObject = (th)paramAnonymousObject;
                      ((th)paramAnonymousObject).Qu(com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c(localObject2), "", ""));
                      ((th)paramAnonymousObject).Qv(com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true));
                      paramAnonymousString = bh.q(localObject2.gHc, "msg");
                      if (paramAnonymousString == null) {
                        break label284;
                      }
                      ((th)paramAnonymousObject).Qk((String)paramAnonymousString.get(".msg.img.$cdnbigimgurl"));
                      ((th)paramAnonymousObject).ey(bg.getInt((String)paramAnonymousString.get(".msg.img.$length"), 0));
                      ((th)paramAnonymousObject).Ql((String)paramAnonymousString.get(".msg.img.$aeskey"));
                      p.b.this.ogS.field_dataProto.ulB.set(p.b.this.i, paramAnonymousObject);
                      label218:
                      p.b.this.ohn.put(Long.valueOf(((th)paramAnonymousObject).ukz), Boolean.valueOf(true));
                    }
                    for (;;)
                    {
                      p.b.this.a(p.b.this.ohn, p.b.this.eqi, p.b.this.ogS);
                      GMTrace.o(7511226712064L, 55963);
                      return;
                      bool = false;
                      break;
                      label284:
                      w.i("MicroMsg.RecordMsgSendService", "parse cdnInfo failed. [%s]", new Object[] { localObject2.gHc });
                      break label218;
                      label308:
                      p.b.this.ohn.put(Long.valueOf(l1), Boolean.valueOf(true));
                    }
                  }
                });
                break;
                j = 0;
                break label209;
                if (!((d)localObject2).II())
                {
                  j = 0;
                  break label209;
                }
                localObject3 = com.tencent.mm.ao.e.a((d)localObject2);
                if (!com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l(((d)localObject3).gGS, "", "")))
                {
                  j = 0;
                  break label209;
                }
                j = 1;
                break label209;
                break;
              }
            }
            if (localau.bTK())
            {
              localObject1 = f.a.eS(localau.field_content);
              if (localObject1 == null)
              {
                w.e("MicroMsg.RecordMsgSendService", "parse msgContent error, %s", new Object[] { localau.field_content });
              }
              else
              {
                if ((bg.nm(((f.a)localObject1).eAE)) && (!bg.nm(((f.a)localObject1).giC)))
                {
                  w.e("MicroMsg.RecordMsgSendService", "msgContent format error, %s", new Object[] { localau.field_content });
                  ((f.a)localObject1).eAE = ((f.a)localObject1).giC.hashCode();
                }
                localObject1 = ((f.a)localObject1).eAE;
                if (!com.tencent.mm.pluginsdk.model.app.l.a(localau, com.tencent.mm.pluginsdk.model.app.l.ab((String)localObject1, localau.field_msgId)))
                {
                  this.ohn.put(Long.valueOf(localau.field_msgId), Boolean.valueOf(false));
                  this.ohr.put(Long.valueOf(localau.field_msgId), localObject1);
                  com.tencent.mm.pluginsdk.model.app.l.a(localau, null);
                }
              }
            }
          }
          else if ((((th)localObject1).aGU == 4) || (((th)localObject1).aGU == 15))
          {
            localObject1 = t.mw(localau.field_imgPath);
            if ((localObject1 != null) && (((r)localObject1).status != 199))
            {
              this.ohn.put(Long.valueOf(l1), Boolean.valueOf(false));
              if (((r)localObject1).Nv())
              {
                w.i("MicroMsg.RecordMsgSendService", "start complete online video");
                t.mA(localau.field_imgPath);
              }
              else
              {
                w.i("MicroMsg.RecordMsgSendService", "start complete offline video");
                t.ms(localau.field_imgPath);
              }
            }
          }
        }
      }
      this.eqi = true;
      p.this.ogV = false;
      a(this.ohn, this.eqi, this.ogS);
      GMTrace.o(7518071816192L, 56014);
    }
  }
  
  private final class c
    implements Runnable
  {
    private k ogS;
    
    public c(k paramk)
    {
      GMTrace.i(7513911066624L, 55983);
      this.ogS = paramk;
      GMTrace.o(7513911066624L, 55983);
    }
    
    public final void run()
    {
      GMTrace.i(7514045284352L, 55984);
      Iterator localIterator = this.ogS.field_dataProto.ulB.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (th)localIterator.next();
        ft localft = new ft();
        localft.eIo.type = 2;
        localft.eIo.eIq = ((th)localObject);
        com.tencent.mm.sdk.b.a.vgX.m(localft);
        w.d("MicroMsg.RecordMsgSendService", "check dataid[%s] type[%d]", new Object[] { ((th)localObject).lhq, Integer.valueOf(((th)localObject).aGU) });
        if (!bg.nm(localft.eIp.path))
        {
          String str = m.c((th)localObject, this.ogS.field_msgId);
          w.d("MicroMsg.RecordMsgSendService", "check data ok, try copy[%s] to[%s]", new Object[] { localft.eIp.path, str });
          if (!localft.eIp.path.equals(str)) {
            j.r(localft.eIp.path, str, false);
          }
        }
        if (!bg.nm(localft.eIp.eIy))
        {
          localObject = m.f((th)localObject, this.ogS.field_msgId);
          w.d("MicroMsg.RecordMsgSendService", "check thumb ok, try copy[%s] to[%s]", new Object[] { localft.eIp.eIy, localObject });
          if (!localft.eIp.eIy.equals(localObject)) {
            j.r(localft.eIp.eIy, (String)localObject, false);
          }
        }
      }
      at.wS().a(new a(this.ogS), 0);
      GMTrace.o(7514045284352L, 55984);
    }
  }
  
  private final class d
    implements Runnable
  {
    private k ogS;
    
    public d(k paramk)
    {
      GMTrace.i(7512300453888L, 55971);
      this.ogS = paramk;
      GMTrace.o(7512300453888L, 55971);
    }
    
    public final void run()
    {
      GMTrace.i(7512434671616L, 55972);
      Iterator localIterator = this.ogS.field_dataProto.ulB.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        th localth = (th)localIterator.next();
        int k = i;
        String str;
        Object localObject;
        boolean bool;
        if (!bg.nm(localth.ujt))
        {
          str = m.c(localth, this.ogS.field_oriMsgId);
          localObject = m.c(localth, this.ogS.field_msgId);
          bool = j.r(str, (String)localObject, false);
          w.d("MicroMsg.RecordMsgSendService", "copy[%s] to [%s] result[%B]", new Object[] { str, localObject, Boolean.valueOf(bool) });
          int j = i;
          if (bool)
          {
            if (bg.nm(localth.ujK))
            {
              w.i("MicroMsg.RecordMsgSendService", "not find full md5, try to calculate");
              localth.Qr(com.tencent.mm.a.g.bg((String)localObject));
              i = 1;
            }
            j = i;
            if (bg.nm(localth.ujM))
            {
              w.i("MicroMsg.RecordMsgSendService", "not find head 256 md5, try to calculate");
              localth.Qs(com.tencent.mm.a.g.bh((String)localObject));
              j = 1;
            }
          }
          str = m.d(localth.lhq, this.ogS.field_msgId, false);
          k = j;
          if (s.baL().Fv(str) == null)
          {
            localObject = new g();
            ((g)localObject).field_cdnKey = localth.ujv;
            ((g)localObject).field_cdnUrl = localth.ujt;
            ((g)localObject).field_dataId = localth.lhq;
            ((g)localObject).field_mediaId = str;
            ((g)localObject).field_totalLen = ((int)localth.ujO);
            ((g)localObject).field_localId = ((g)localObject).field_mediaId.hashCode();
            ((g)localObject).field_path = m.c(localth, this.ogS.field_msgId);
            ((g)localObject).field_type = 2;
            ((g)localObject).field_fileType = m.ti(localth.aGU);
            ((g)localObject).field_recordLocalId = this.ogS.field_localId;
            ((g)localObject).field_toUser = this.ogS.field_toUser;
            ((g)localObject).field_isThumb = false;
            bool = s.baL().a((g)localObject);
            w.d("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(((g)localObject).field_localId), Boolean.valueOf(bool) });
            k = j;
          }
        }
        i = k;
        if (!bg.nm(localth.giD))
        {
          str = m.f(localth, this.ogS.field_oriMsgId);
          localObject = m.f(localth, this.ogS.field_msgId);
          w.d("MicroMsg.RecordMsgSendService", "copy thumb[%s] to [%s] result[%B]", new Object[] { str, localObject, Boolean.valueOf(j.r(str, (String)localObject, false)) });
          str = m.xQ(localth.lhq);
          localObject = m.d(str, this.ogS.field_msgId, false);
          i = k;
          if (s.baL().Fv((String)localObject) == null)
          {
            g localg = new g();
            localg.field_cdnKey = localth.ujp;
            localg.field_cdnUrl = localth.giD;
            localg.field_dataId = str;
            localg.field_mediaId = ((String)localObject);
            localg.field_totalLen = ((int)localth.ujZ);
            localg.field_localId = localg.field_mediaId.hashCode();
            localg.field_path = m.f(localth, this.ogS.field_msgId);
            localg.field_type = 2;
            localg.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
            localg.field_recordLocalId = this.ogS.field_localId;
            localg.field_toUser = this.ogS.field_toUser;
            localg.field_isThumb = true;
            bool = s.baL().a(localg);
            w.d("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(localg.field_localId), Boolean.valueOf(bool) });
            i = k;
          }
        }
      }
      if (i != 0)
      {
        w.d("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", new Object[] { Integer.valueOf(this.ogS.field_localId), Long.valueOf(this.ogS.field_msgId), Integer.valueOf(this.ogS.field_type) });
        s.baK().c(this.ogS, new String[] { "localId" });
      }
      s.baN().run();
      GMTrace.o(7512434671616L, 55972);
    }
  }
  
  private static final class e
  {
    int hji;
    long ohc;
    
    public e()
    {
      GMTrace.i(7500355076096L, 55882);
      this.ohc = SystemClock.elapsedRealtime();
      this.hji = 3;
      GMTrace.o(7500355076096L, 55882);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */