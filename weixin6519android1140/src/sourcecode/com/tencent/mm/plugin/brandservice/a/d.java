package com.tencent.mm.plugin.brandservice.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
  implements e
{
  public LinkedList<a> jsW;
  public boolean jsX;
  public List<b> jsY;
  public List<b> jsZ;
  
  public d()
  {
    GMTrace.i(10841436979200L, 80775);
    this.jsW = new LinkedList();
    this.jsX = false;
    this.jsY = new LinkedList();
    this.jsZ = new LinkedList();
    at.wS().a(387, this);
    at.wS().a(new f(), 0);
    GMTrace.o(10841436979200L, 80775);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 0;
    GMTrace.i(10841705414656L, 80777);
    w.w("MicroMsg.BrandService.BrandServiceMgr", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      GMTrace.o(10841705414656L, 80777);
      return;
    }
    if (paramk.getType() == 387)
    {
      paramString = ((f)paramk).jta;
      if (paramString == null)
      {
        w.e("MicroMsg.BrandService.BrandServiceMgr", "nameList is null.");
        GMTrace.o(10841705414656L, 80777);
        return;
      }
      if ((this.jsY == null) || (this.jsZ == null))
      {
        w.e("MicroMsg.BrandService.BrandServiceMgr", "enterpriseItemList or subscribeAndServiceItemList is null.");
        GMTrace.o(10841705414656L, 80777);
        return;
      }
      if (paramString.size() != this.jsY.size() + this.jsZ.size()) {
        paramInt1 = 1;
      }
    }
    label316:
    for (;;)
    {
      if (paramInt1 != 0)
      {
        init();
        paramString = this.jsW.iterator();
        for (;;)
        {
          if (paramString.hasNext())
          {
            ((a)paramString.next()).aic();
            continue;
            paramk = this.jsY.iterator();
            b localb;
            do
            {
              paramInt1 = i;
              if (!paramk.hasNext()) {
                break;
              }
              localb = (b)paramk.next();
            } while ((localb != null) && (paramString.contains(localb.userName)));
            paramInt1 = 1;
            if (paramInt1 != 0) {
              break label316;
            }
            paramk = this.jsZ.iterator();
            do
            {
              if (!paramk.hasNext()) {
                break;
              }
              localb = (b)paramk.next();
            } while ((localb != null) && (paramString.contains(localb.userName)));
            paramInt1 = 1;
            break;
          }
        }
      }
      GMTrace.o(10841705414656L, 80777);
      return;
    }
  }
  
  public final void init()
  {
    GMTrace.i(10841571196928L, 80776);
    long l1 = System.currentTimeMillis();
    this.jsY.clear();
    this.jsZ.clear();
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("select bizinfo.brandIconURL");
    ((StringBuilder)localObject1).append(", bizinfo.type");
    ((StringBuilder)localObject1).append(", bizinfo.status");
    ((StringBuilder)localObject1).append(", rcontact.username");
    ((StringBuilder)localObject1).append(", rcontact.conRemark");
    ((StringBuilder)localObject1).append(", rcontact.nickname");
    ((StringBuilder)localObject1).append(", rcontact.alias");
    ((StringBuilder)localObject1).append(", rcontact.conRemarkPYFull");
    ((StringBuilder)localObject1).append(", rcontact.conRemarkPYShort");
    ((StringBuilder)localObject1).append(", rcontact.showHead");
    ((StringBuilder)localObject1).append(", rcontact.pyInitial");
    ((StringBuilder)localObject1).append(", rcontact.quanPin");
    ((StringBuilder)localObject1).append(" from rcontact, bizinfo");
    ((StringBuilder)localObject1).append(" where rcontact.username").append(" = bizinfo.username");
    ((StringBuilder)localObject1).append(" and (rcontact.verifyFlag").append(" & ").append(x.bSC()).append(") != 0 ");
    ((StringBuilder)localObject1).append(" and (rcontact.type").append(" & 1) != 0 ");
    ((StringBuilder)localObject1).append(" order by showHead asc, ");
    ((StringBuilder)localObject1).append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
    ((StringBuilder)localObject1).append(" else upper(quanPin) end asc, ");
    ((StringBuilder)localObject1).append(" case when length(conRemark) > 0 then upper(conRemark) ");
    ((StringBuilder)localObject1).append(" else upper(quanPin) end asc, ");
    ((StringBuilder)localObject1).append(" upper(quanPin) asc, ");
    ((StringBuilder)localObject1).append(" upper(nickname) asc");
    localObject1 = ((StringBuilder)localObject1).toString();
    w.d("MicroMsg.BrandService.BrandServiceMgr", "sql %s", new Object[] { localObject1 });
    at.AR();
    Object localObject2 = c.yH().a((String)localObject1, null, 2);
    localObject1 = new HashMap();
    Object localObject3;
    Object localObject4;
    if (localObject2 != null)
    {
      int i = 0;
      while (((Cursor)localObject2).moveToNext())
      {
        int j = i + 1;
        localObject3 = new x();
        ((x)localObject3).b((Cursor)localObject2);
        localObject4 = new com.tencent.mm.af.d();
        ((com.tencent.mm.af.d)localObject4).b((Cursor)localObject2);
        i = j;
        if (!((af)localObject3).field_username.equals("gh_43f2581f6fd6"))
        {
          b localb = new b();
          localb.userName = ((af)localObject3).field_username;
          localb.iBi = ((x)localObject3);
          localb.jsU = ((com.tencent.mm.af.d)localObject4);
          i = j;
          if (!s.fP(localb.userName))
          {
            ((Map)localObject1).put(localb.userName, localb);
            i = j;
            if (localb.jsU.field_type != 3) {
              if (localb.jsU.field_type == 2)
              {
                this.jsY.add(localb);
                i = j;
              }
              else if (localb.jsU.field_type != 1)
              {
                i = j;
                if (localb.jsU.field_type != 0) {}
              }
              else
              {
                this.jsZ.add(localb);
                i = j;
              }
            }
          }
        }
      }
      w.d("MicroMsg.BrandService.BrandServiceMgr", "biz contact count %d", new Object[] { Integer.valueOf(i) });
      ((Cursor)localObject2).close();
    }
    long l2 = System.currentTimeMillis();
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("select username");
    ((StringBuilder)localObject2).append(" from rcontact");
    ((StringBuilder)localObject2).append(" where (verifyFlag & ").append(x.bSC()).append(") != 0 ");
    ((StringBuilder)localObject2).append(" and (type & 1").append(") != 0 ");
    localObject2 = ((StringBuilder)localObject2).toString();
    w.d("MicroMsg.BrandService.BrandServiceMgr", "sql check %s", new Object[] { localObject2 });
    at.AR();
    localObject2 = c.yH().a((String)localObject2, null, 0);
    if (localObject2 != null)
    {
      localObject3 = new ArrayList();
      while (((Cursor)localObject2).moveToNext())
      {
        localObject4 = ((Cursor)localObject2).getString(0);
        if (!((Map)localObject1).containsKey(localObject4)) {
          ((ArrayList)localObject3).add(localObject4);
        }
      }
      ((Cursor)localObject2).close();
      w.i("MicroMsg.BrandService.BrandServiceMgr", "need update list size is %d, {%s}", new Object[] { Integer.valueOf(((ArrayList)localObject3).size()), localObject3 });
      if (!((ArrayList)localObject3).isEmpty())
      {
        at.AR();
        long l3 = c.yH().cE(Thread.currentThread().getId());
        localObject1 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          ak.a.gmX.K((String)localObject2, "");
        }
        at.AR();
        c.yH().aL(l3);
      }
    }
    w.d("MicroMsg.BrandService.BrandServiceMgr", "check use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
    w.d("MicroMsg.BrandService.BrandServiceMgr", "service add subscribe count:%d, enterpriseFather count:%d", new Object[] { Integer.valueOf(this.jsZ.size()), Integer.valueOf(this.jsY.size()) });
    w.d("MicroMsg.BrandService.BrandServiceMgr", "init time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    GMTrace.o(10841571196928L, 80776);
  }
  
  public static abstract interface a
  {
    public abstract void aic();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */