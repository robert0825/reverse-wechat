package com.tencent.mm.af;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.notification.b.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class e
  extends i<d>
{
  public static final String[] eZt;
  public static final String[] fTX;
  public static Map<String, String> gwQ;
  private final k<a, e.a.b> gvy;
  
  static
  {
    GMTrace.i(4589575208960L, 34195);
    fTX = new String[] { i.a(d.fTp, "bizinfo") };
    gwQ = new HashMap();
    eZt = new String[] { "CREATE  INDEX IF NOT EXISTS type_username_index ON bizinfo ( type,username ) ", "CREATE  INDEX IF NOT EXISTS  username_acceptType_index ON bizinfo ( username,acceptType ) " };
    GMTrace.o(4589575208960L, 34195);
  }
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.fTp, "bizinfo", eZt);
    GMTrace.i(4585414459392L, 34164);
    this.gvy = new k() {};
    GMTrace.o(4585414459392L, 34164);
  }
  
  public static String Fj()
  {
    GMTrace.i(4586756636672L, 34174);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("rcontact.showHead asc, ");
    ((StringBuffer)localObject).append(" case when length(rcontact.conRemarkPYFull) > 0 then upper(").append("rcontact.conRemarkPYFull) ");
    ((StringBuffer)localObject).append(" else upper(rcontact.quanPin) end asc, ");
    ((StringBuffer)localObject).append(" case when length(rcontact.conRemark) > 0 then upper(").append("rcontact.conRemark) ");
    ((StringBuffer)localObject).append(" else upper(rcontact.quanPin) end asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.quanPin) asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.nickname) asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.username) asc ");
    localObject = ((StringBuffer)localObject).toString();
    GMTrace.o(4586756636672L, 34174);
    return (String)localObject;
  }
  
  public static String Fk()
  {
    GMTrace.i(4586890854400L, 34175);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("rcontact.type & ").append(2048).append(" desc, ");
    ((StringBuffer)localObject).append("rcontact.showHead asc, ");
    ((StringBuffer)localObject).append(" case when length(rcontact.conRemarkPYFull) > 0 then upper(").append("rcontact.conRemarkPYFull) ");
    ((StringBuffer)localObject).append(" else upper(rcontact.quanPin) end asc, ");
    ((StringBuffer)localObject).append(" case when length(rcontact.conRemark) > 0 then upper(").append("rcontact.conRemark) ");
    ((StringBuffer)localObject).append(" else upper(rcontact.quanPin) end asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.quanPin) asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.nickname) asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.username) asc ");
    localObject = ((StringBuffer)localObject).toString();
    GMTrace.o(4586890854400L, 34175);
    return (String)localObject;
  }
  
  public static List<String> Fl()
  {
    GMTrace.i(4588233031680L, 34185);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select rcontact.username");
    ((StringBuilder)localObject).append(", bizinfo.enterpriseFather");
    ((StringBuilder)localObject).append(", bizinfo.bitFlag").append(" & 1");
    c((StringBuilder)localObject);
    d((StringBuilder)localObject);
    ((StringBuilder)localObject).append(" and (");
    ((StringBuilder)localObject).append(" (bizinfo.bitFlag").append(" & 1) != 0");
    ((StringBuilder)localObject).append(" or ");
    ((StringBuilder)localObject).append(" (bizinfo.acceptType").append(" & 128) > 0 ");
    ((StringBuilder)localObject).append(" and (bizinfo.brandFlag").append(" & 1) == 0) ");
    localObject = ((StringBuilder)localObject).toString();
    w.i("MicroMsg.BizInfoStorage", "getEnterpriseConnectorList sql %s", new Object[] { localObject });
    localObject = com.tencent.mm.kernel.h.xy().fYV.a((String)localObject, null, 2);
    ArrayList localArrayList = new ArrayList();
    if (localObject == null)
    {
      GMTrace.o(4588233031680L, 34185);
      return localArrayList;
    }
    if (((Cursor)localObject).moveToNext())
    {
      if (((Cursor)localObject).getInt(2) > 0)
      {
        i = 1;
        label176:
        if (i == 0) {
          break label204;
        }
      }
      label204:
      for (int i = 0;; i = 1)
      {
        localArrayList.add(((Cursor)localObject).getString(i));
        break;
        i = 0;
        break label176;
      }
    }
    ((Cursor)localObject).close();
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().cr(localArrayList);
    GMTrace.o(4588233031680L, 34185);
    return (List<String>)localObject;
  }
  
  public static void a(StringBuilder paramStringBuilder)
  {
    GMTrace.i(4587025072128L, 34176);
    paramStringBuilder.append("select bizinfo.username").append(" ");
    GMTrace.o(4587025072128L, 34176);
  }
  
  public static void a(StringBuilder paramStringBuilder, String paramString)
  {
    GMTrace.i(4587561943040L, 34180);
    paramStringBuilder.append(" and bizinfo.type").append(" = 3");
    paramStringBuilder.append(" and bizinfo.enterpriseFather").append(" = '").append(paramString).append("' ");
    GMTrace.o(4587561943040L, 34180);
  }
  
  public static void a(StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    GMTrace.i(4587696160768L, 34181);
    paramStringBuilder.append(" and (bizinfo.bitFlag").append(" & 1) ");
    if (paramBoolean) {}
    for (String str = "!=";; str = "==")
    {
      paramStringBuilder.append(str).append(" 0 ");
      GMTrace.o(4587696160768L, 34181);
      return;
    }
  }
  
  public static void b(StringBuilder paramStringBuilder)
  {
    GMTrace.i(4587159289856L, 34177);
    paramStringBuilder.append("select bizinfo.brandIconURL");
    paramStringBuilder.append(", bizinfo.type");
    paramStringBuilder.append(", bizinfo.status");
    paramStringBuilder.append(", bizinfo.enterpriseFather");
    paramStringBuilder.append(", bizinfo.brandFlag");
    paramStringBuilder.append(", bizinfo.extInfo");
    paramStringBuilder.append(", rcontact.username");
    paramStringBuilder.append(", rcontact.conRemark");
    paramStringBuilder.append(", rcontact.quanPin");
    paramStringBuilder.append(", rcontact.nickname");
    paramStringBuilder.append(", rcontact.alias");
    paramStringBuilder.append(", rcontact.type").append(" ");
    GMTrace.o(4587159289856L, 34177);
  }
  
  public static void b(StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    GMTrace.i(4587830378496L, 34182);
    paramStringBuilder.append(" and (bizinfo.brandFlag").append(" & 1) ");
    if (paramBoolean) {}
    for (String str = "==";; str = "!=")
    {
      paramStringBuilder.append(str).append(" 0 ");
      GMTrace.o(4587830378496L, 34182);
      return;
    }
  }
  
  public static void c(StringBuilder paramStringBuilder)
  {
    GMTrace.i(4587293507584L, 34178);
    paramStringBuilder.append(" from rcontact, bizinfo");
    paramStringBuilder.append(" where rcontact.username").append(" = bizinfo.username");
    paramStringBuilder.append(" and (rcontact.verifyFlag").append(" & ").append(x.bSC()).append(") != 0 ");
    paramStringBuilder.append(" and (rcontact.type").append(" & 1) != 0 ");
    GMTrace.o(4587293507584L, 34178);
  }
  
  public static void d(StringBuilder paramStringBuilder)
  {
    GMTrace.i(4587427725312L, 34179);
    paramStringBuilder.append(" and bizinfo.type").append(" = 3 ");
    GMTrace.o(4587427725312L, 34179);
  }
  
  public static List<String> fR(int paramInt)
  {
    GMTrace.i(4588769902592L, 34189);
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("select bizinfo.username");
    ((StringBuilder)localObject1).append(" from rcontact, bizinfo");
    ((StringBuilder)localObject1).append(" where bizinfo.specialType").append(" = 1");
    ((StringBuilder)localObject1).append(" and rcontact.username").append(" = bizinfo.username");
    ((StringBuilder)localObject1).append(" and (rcontact.verifyFlag").append(" & ").append(x.bSC()).append(") != 0 ");
    ((StringBuilder)localObject1).append(" and (rcontact.type").append(" & 1) != 0 ");
    Object localObject2 = ((StringBuilder)localObject1).toString();
    w.i("MicroMsg.BizInfoStorage", "getSpecialInternalBizUsernames sql %s", new Object[] { localObject2 });
    localObject1 = new ArrayList();
    localObject2 = com.tencent.mm.kernel.h.xy().fYV.a((String)localObject2, null, 2);
    paramInt = ((Cursor)localObject2).getColumnIndex("username");
    while (((Cursor)localObject2).moveToNext()) {
      ((List)localObject1).add(((Cursor)localObject2).getString(paramInt));
    }
    ((Cursor)localObject2).close();
    GMTrace.o(4588769902592L, 34189);
    return (List<String>)localObject1;
  }
  
  public static List<String> iF(String paramString)
  {
    GMTrace.i(4588501467136L, 34187);
    Object localObject = new StringBuilder();
    a((StringBuilder)localObject);
    c((StringBuilder)localObject);
    a((StringBuilder)localObject, paramString);
    paramString = ((StringBuilder)localObject).toString();
    w.i("MicroMsg.BizInfoStorage", "getEnterpriseChildNameList sql %s", new Object[] { paramString });
    paramString = com.tencent.mm.kernel.h.xy().fYV.a(paramString, null, 2);
    if (paramString == null)
    {
      GMTrace.o(4588501467136L, 34187);
      return null;
    }
    localObject = new ArrayList();
    while (paramString.moveToNext()) {
      ((List)localObject).add(paramString.getString(0));
    }
    paramString.close();
    GMTrace.o(4588501467136L, 34187);
    return (List<String>)localObject;
  }
  
  public static String iG(String paramString)
  {
    GMTrace.i(4588635684864L, 34188);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.BizInfoStorage", "getBizChatBrandUserName userName is null");
      GMTrace.o(4588635684864L, 34188);
      return null;
    }
    if ((gwQ != null) && (gwQ.containsKey(paramString)))
    {
      paramString = (String)gwQ.get(paramString);
      if ((!bg.nm(paramString)) && (s.fC(paramString)))
      {
        GMTrace.o(4588635684864L, 34188);
        return paramString;
      }
      GMTrace.o(4588635684864L, 34188);
      return null;
    }
    Object localObject = new StringBuilder();
    a((StringBuilder)localObject);
    c((StringBuilder)localObject);
    a((StringBuilder)localObject, paramString);
    a((StringBuilder)localObject, true);
    localObject = ((StringBuilder)localObject).toString();
    w.i("MicroMsg.BizInfoStorage", "getEnterpriseBizChatChild sql %s", new Object[] { localObject });
    Cursor localCursor = com.tencent.mm.kernel.h.xy().fYV.a((String)localObject, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(4588635684864L, 34188);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localObject = localCursor.getString(0);
      gwQ.put(paramString, localObject);
    }
    for (paramString = (String)localObject;; paramString = null)
    {
      localCursor.close();
      GMTrace.o(4588635684864L, 34188);
      return paramString;
    }
  }
  
  public static boolean iH(String paramString)
  {
    boolean bool = false;
    GMTrace.i(4588904120320L, 34190);
    if ((bg.nm(paramString)) || (!f.iQ(paramString)))
    {
      GMTrace.o(4588904120320L, 34190);
      return false;
    }
    Object localObject1 = f.iK(paramString);
    Object localObject2;
    if ((((d)localObject1).bq(false) != null) && (((d)localObject1).bq(false).Fh() != null) && (!bg.nm(((d)localObject1).EN())))
    {
      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().Ua(((d)localObject1).EN());
      if ((localObject2 != null) && (((com.tencent.mm.g.b.aj)localObject2).field_username.equals(paramString)) && (((com.tencent.mm.g.b.aj)localObject2).field_unReadCount > 0)) {
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TQ(((d)localObject1).EN());
      }
    }
    localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ck(paramString);
    ((Cursor)localObject1).moveToFirst();
    while (!((Cursor)localObject1).isAfterLast())
    {
      localObject2 = new au();
      ((au)localObject2).b((Cursor)localObject1);
      ((au)localObject2).dB(4);
      w.d("MicroMsg.BizInfoStorage", "writeOpLog: msgSvrId = " + ((ce)localObject2).field_msgSvrId + " status = " + ((ce)localObject2).field_status);
      ((Cursor)localObject1).moveToNext();
      bool = true;
    }
    ((Cursor)localObject1).close();
    if (bool)
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TQ(paramString);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ci(paramString);
    }
    GMTrace.o(4588904120320L, 34190);
    return bool;
  }
  
  public static void iI(String paramString)
  {
    GMTrace.i(4589038338048L, 34191);
    if ((bg.nm(paramString)) || (!f.iQ(paramString)))
    {
      GMTrace.o(4589038338048L, 34191);
      return;
    }
    ((a)com.tencent.mm.kernel.h.j(a.class)).getNotification().dv(paramString);
    ((a)com.tencent.mm.kernel.h.j(a.class)).getNotification().pu();
    GMTrace.o(4589038338048L, 34191);
  }
  
  public static void iJ(String paramString)
  {
    GMTrace.i(4589172555776L, 34192);
    if ((bg.nm(paramString)) || (!f.iQ(paramString)))
    {
      GMTrace.o(4589172555776L, 34192);
      return;
    }
    ((a)com.tencent.mm.kernel.h.j(a.class)).getNotification().dv("");
    GMTrace.o(4589172555776L, 34192);
  }
  
  public static Cursor v(String paramString, boolean paramBoolean)
  {
    GMTrace.i(4588367249408L, 34186);
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder);
    c(localStringBuilder);
    a(localStringBuilder, paramString);
    b(localStringBuilder, true);
    if (paramBoolean) {
      a(localStringBuilder, false);
    }
    localStringBuilder.append(" order by ");
    localStringBuilder.append(Fk());
    paramString = localStringBuilder.toString();
    w.i("MicroMsg.BizInfoStorage", "getEnterpriseEnableChild sql %s", new Object[] { paramString });
    paramString = com.tencent.mm.kernel.h.xy().fYV.a(paramString, null, 0);
    GMTrace.o(4588367249408L, 34186);
    return paramString;
  }
  
  public static Cursor z(String paramString, int paramInt)
  {
    GMTrace.i(4587964596224L, 34183);
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder);
    c(localStringBuilder);
    a(localStringBuilder, paramString);
    a(localStringBuilder, false);
    b(localStringBuilder, true);
    localStringBuilder.append(" and (bizinfo.acceptType").append(" & ").append(paramInt).append(") > 0 ");
    localStringBuilder.append(" order by ");
    localStringBuilder.append(Fj());
    paramString = localStringBuilder.toString();
    w.i("MicroMsg.BizInfoStorage", "getEnterpriseChildOfAcceptType sql %s", new Object[] { paramString });
    paramString = com.tencent.mm.kernel.h.xy().fYV.a(paramString, null, 0);
    GMTrace.o(4587964596224L, 34183);
    return paramString;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(4585682894848L, 34166);
    if (this.gvy != null) {
      this.gvy.remove(parama);
    }
    GMTrace.o(4585682894848L, 34166);
  }
  
  public final void a(a parama, Looper paramLooper)
  {
    GMTrace.i(18486210330624L, 137733);
    this.gvy.a(parama, paramLooper);
    GMTrace.o(18486210330624L, 137733);
  }
  
  public final void c(d paramd)
  {
    GMTrace.i(4586085548032L, 34169);
    w.i("MicroMsg.BizInfoStorage", "delete biz ret = %b, username = %s", new Object[] { Boolean.valueOf(super.a(paramd, new String[] { "username" })), paramd.field_username });
    e.a.b localb = new e.a.b();
    localb.gvB = paramd.field_username;
    localb.gwW = e.a.a.gwT;
    localb.gwX = paramd;
    this.gvy.bI(localb);
    this.gvy.doNotify();
    GMTrace.o(4586085548032L, 34169);
  }
  
  public final boolean d(d paramd)
  {
    GMTrace.i(4586219765760L, 34170);
    paramd.field_updateTime = System.currentTimeMillis();
    paramd.EA();
    w.v("MicroMsg.BizInfoStorage", "username is %s, %s, %d, %s, %s, %s, %d", new Object[] { paramd.field_username, paramd.field_brandList, Integer.valueOf(paramd.field_brandFlag), paramd.field_brandInfo, paramd.field_extInfo, paramd.field_brandIconURL, Long.valueOf(paramd.field_updateTime) });
    Object localObject = paramd.bq(false);
    if (localObject != null)
    {
      localObject = ((d.b)localObject).EZ();
      if (localObject != null) {
        paramd.field_specialType = ((d.b.a)localObject).gwv;
      }
    }
    boolean bool = super.b(paramd);
    if ((bool) && (!s.eb(paramd.field_username)))
    {
      localObject = new e.a.b();
      ((e.a.b)localObject).gvB = paramd.field_username;
      ((e.a.b)localObject).gwb = paramd.EB();
      ((e.a.b)localObject).gwW = e.a.a.gwS;
      ((e.a.b)localObject).gwX = paramd;
      this.gvy.bI(localObject);
      this.gvy.doNotify();
    }
    GMTrace.o(4586219765760L, 34170);
    return bool;
  }
  
  public final boolean e(d paramd)
  {
    GMTrace.i(4586353983488L, 34171);
    paramd.field_updateTime = System.currentTimeMillis();
    paramd.EA();
    Object localObject = paramd.bq(false);
    if (localObject != null)
    {
      localObject = ((d.b)localObject).EZ();
      if (localObject != null) {
        paramd.field_specialType = ((d.b.a)localObject).gwv;
      }
    }
    boolean bool = super.a(paramd);
    if ((bool) && (!s.eb(paramd.field_username)))
    {
      localObject = new e.a.b();
      ((e.a.b)localObject).gvB = paramd.field_username;
      ((e.a.b)localObject).gwb = paramd.EB();
      ((e.a.b)localObject).gwW = e.a.a.gwU;
      ((e.a.b)localObject).gwX = paramd;
      this.gvy.bI(localObject);
      this.gvy.doNotify();
    }
    GMTrace.o(4586353983488L, 34171);
    return bool;
  }
  
  public final List<String> fP(int paramInt)
  {
    GMTrace.i(4586488201216L, 34172);
    Object localObject = String.format(Locale.US, "select %s from %s where %s & %d > 0", new Object[] { "username", "bizinfo", "acceptType", Integer.valueOf(paramInt) });
    w.i("MicroMsg.BizInfoStorage", "getList: sql[%s]", new Object[] { localObject });
    long l = bg.Pw();
    localObject = rawQuery((String)localObject, new String[0]);
    LinkedList localLinkedList = new LinkedList();
    if (localObject != null)
    {
      if (((Cursor)localObject).moveToFirst()) {
        do
        {
          localLinkedList.add(((Cursor)localObject).getString(0));
        } while (((Cursor)localObject).moveToNext());
      }
      ((Cursor)localObject).close();
      w.i("MicroMsg.BizInfoStorage", "getMyAcceptList: type[%d], use time[%d ms]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(bg.aI(l)) });
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().cr(localLinkedList);
      GMTrace.o(4586488201216L, 34172);
      return (List<String>)localObject;
    }
    w.i("MicroMsg.BizInfoStorage", "getMyAcceptList: cursor not null, type[%d], use time[%d ms]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(bg.aI(l)) });
    GMTrace.o(4586488201216L, 34172);
    return localLinkedList;
  }
  
  public final int fQ(int paramInt)
  {
    GMTrace.i(4586622418944L, 34173);
    List localList = fP(paramInt);
    if (bg.cc(localList))
    {
      GMTrace.o(4586622418944L, 34173);
      return 0;
    }
    paramInt = localList.size();
    GMTrace.o(4586622418944L, 34173);
    return paramInt;
  }
  
  public final d iC(String paramString)
  {
    GMTrace.i(4585817112576L, 34167);
    d locald = new d();
    locald.field_username = paramString;
    super.b(locald, new String[0]);
    GMTrace.o(4585817112576L, 34167);
    return locald;
  }
  
  public final void iD(String paramString)
  {
    GMTrace.i(4585951330304L, 34168);
    d locald = new d();
    locald.field_username = paramString;
    w.i("MicroMsg.BizInfoStorage", "delete biz ret = %b, username = %s", new Object[] { Boolean.valueOf(super.a(locald, new String[] { "username" })), paramString });
    e.a.b localb = new e.a.b();
    localb.gvB = paramString;
    localb.gwW = e.a.a.gwT;
    localb.gwX = locald;
    this.gvy.bI(localb);
    this.gvy.doNotify();
    GMTrace.o(4585951330304L, 34168);
  }
  
  public final Cursor iE(String paramString)
  {
    GMTrace.i(4588098813952L, 34184);
    Object localObject = iF(paramString);
    ArrayList localArrayList = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!bg.nm(iC(str).EM())) {
        localArrayList.add(str);
      }
    }
    if (localArrayList.size() <= 0)
    {
      GMTrace.o(4588098813952L, 34184);
      return null;
    }
    localObject = new StringBuilder();
    b((StringBuilder)localObject);
    c((StringBuilder)localObject);
    a((StringBuilder)localObject, paramString);
    b((StringBuilder)localObject, true);
    ((StringBuilder)localObject).append(" and (");
    int i = 0;
    while (i < localArrayList.size())
    {
      paramString = (String)localArrayList.get(i);
      if (i > 0) {
        ((StringBuilder)localObject).append(" or ");
      }
      ((StringBuilder)localObject).append("rcontact.username = '").append(paramString).append("'");
      i += 1;
    }
    ((StringBuilder)localObject).append(") order by ");
    ((StringBuilder)localObject).append(Fk());
    paramString = ((StringBuilder)localObject).toString();
    w.i("MicroMsg.BizInfoStorage", "getEnterpriseChatConnector sql %s", new Object[] { paramString });
    paramString = com.tencent.mm.kernel.h.xy().fYV.a(paramString, null, 0);
    GMTrace.o(4588098813952L, 34184);
    return paramString;
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
    
    public static enum a
    {
      static
      {
        GMTrace.i(4585280241664L, 34163);
        gwS = 1;
        gwT = 2;
        gwU = 3;
        gwV = new int[] { gwS, gwT, gwU };
        GMTrace.o(4585280241664L, 34163);
      }
    }
    
    public static final class b
    {
      public String gvB;
      public int gwW;
      public d gwX;
      public boolean gwb;
      
      public b()
      {
        GMTrace.i(4553202204672L, 33924);
        GMTrace.o(4553202204672L, 33924);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */