package com.tencent.mm.plugin.order.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.order.b.a;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c
{
  public List<j> jxx;
  private List<a> nEb;
  
  public c()
  {
    GMTrace.i(6631026851840L, 49405);
    this.jxx = new ArrayList();
    this.nEb = new ArrayList();
    loadFromDB();
    aWJ();
    aWI();
    aWK();
    GMTrace.o(6631026851840L, 49405);
  }
  
  public static j Ev(String paramString)
  {
    GMTrace.i(6631563722752L, 49409);
    Map localMap = bh.q(paramString, "sysmsg");
    if (localMap == null)
    {
      GMTrace.o(6631563722752L, 49409);
      return null;
    }
    j localj = new j();
    localj.nFu = ((String)localMap.get(".sysmsg.paymsg.PayMsgType"));
    localj.nFv = ((String)localMap.get(".sysmsg.paymsg.Brief.IconUrl"));
    localj.nFw = ((String)localMap.get(".sysmsg.paymsg.Brief.CreateTime"));
    localj.nFx = ((String)localMap.get(".sysmsg.paymsg.StatusSection.IconUrl"));
    localj.nFy = ((String)localMap.get(".sysmsg.paymsg.StatusSection.StatusDesc"));
    localj.eQH = ((String)localMap.get(".sysmsg.paymsg.StatusSection.Content"));
    localj.nFz = ((String)localMap.get(".sysmsg.paymsg.StatusSection.JumpUrl"));
    localj.nFA = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppUserName"));
    localj.nFk = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppNickName"));
    localj.nFB = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppTelephone"));
    int i = 0;
    if (i == 0) {
      paramString = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button.Name");
    }
    for (String str = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button.JumpUrl");; str = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button" + i + ".JumpUrl"))
    {
      if (TextUtils.isEmpty(paramString)) {
        break label373;
      }
      localObject = new j.a();
      ((j.a)localObject).name = paramString;
      ((j.a)localObject).jumpUrl = str;
      if (localj.nFC == null) {
        localj.nFC = new ArrayList();
      }
      localj.nFC.add(localObject);
      i += 1;
      break;
      paramString = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button" + i + ".Name");
    }
    label373:
    i = 0;
    if (i == 0)
    {
      paramString = (String)localMap.get(".sysmsg.paymsg.NormalSection.Name");
      str = (String)localMap.get(".sysmsg.paymsg.NormalSection.Value");
    }
    for (Object localObject = (String)localMap.get(".sysmsg.paymsg.NormalSection.JumpUrl");; localObject = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".JumpUrl"))
    {
      if (TextUtils.isEmpty(paramString)) {
        break label591;
      }
      j.b localb = new j.b();
      localb.name = paramString;
      localb.value = str;
      localb.jumpUrl = ((String)localObject);
      if (localj.nFD == null) {
        localj.nFD = new ArrayList();
      }
      localj.nFD.add(localb);
      i += 1;
      break;
      paramString = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".Name");
      str = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".Value");
    }
    label591:
    GMTrace.o(6631563722752L, 49409);
    return localj;
  }
  
  public static MallOrderDetailObject a(j paramj)
  {
    GMTrace.i(6632637464576L, 49417);
    if (paramj == null)
    {
      GMTrace.o(6632637464576L, 49417);
      return null;
    }
    MallOrderDetailObject localMallOrderDetailObject = new MallOrderDetailObject();
    Object localObject1 = new MallOrderDetailObject.b();
    ((MallOrderDetailObject.b)localObject1).nDW = paramj.nFy;
    if ((!TextUtils.isEmpty(paramj.nFw)) && (com.tencent.mm.plugin.order.c.c.uE(paramj.nFw))) {}
    int i;
    Object localObject2;
    MallOrderDetailObject.a locala;
    for (((MallOrderDetailObject.b)localObject1).time = Integer.valueOf(paramj.nFw).intValue();; ((MallOrderDetailObject.b)localObject1).time = ((int)(System.currentTimeMillis() / 1000L)))
    {
      ((MallOrderDetailObject.b)localObject1).thumbUrl = paramj.nFx;
      ((MallOrderDetailObject.b)localObject1).lPE = paramj.nFz;
      ((MallOrderDetailObject.b)localObject1).nDX = paramj.eQH;
      localMallOrderDetailObject.nDO = ((MallOrderDetailObject.b)localObject1);
      localObject1 = paramj.nFC;
      if ((localObject1 == null) || (((List)localObject1).size() <= 0)) {
        break;
      }
      localMallOrderDetailObject.nDQ = new ArrayList();
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = (j.a)((List)localObject1).get(i);
        locala = new MallOrderDetailObject.a();
        locala.name = ((j.a)localObject2).name;
        locala.value = "";
        locala.jumpUrl = ((j.a)localObject2).jumpUrl;
        locala.jxU = false;
        localMallOrderDetailObject.nDQ.add(locala);
        i += 1;
      }
    }
    localObject1 = paramj.nFD;
    if ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      if (localMallOrderDetailObject.nDQ == null) {
        localMallOrderDetailObject.nDQ = new ArrayList();
      }
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = (j.b)((List)localObject1).get(i);
        locala = new MallOrderDetailObject.a();
        locala.name = ((j.b)localObject2).name;
        locala.value = ((j.b)localObject2).value;
        locala.jumpUrl = ((j.b)localObject2).jumpUrl;
        locala.jxU = false;
        if (i == 0) {
          locala.jxU = true;
        }
        localMallOrderDetailObject.nDQ.add(locala);
        i += 1;
      }
    }
    localMallOrderDetailObject.nDU = paramj.nFB;
    localMallOrderDetailObject.eIH = paramj.nFA;
    if ((!TextUtils.isEmpty(paramj.nFw)) && (com.tencent.mm.plugin.order.c.c.uE(paramj.nFw))) {}
    for (localMallOrderDetailObject.nDV = Integer.valueOf(paramj.nFw).intValue();; localMallOrderDetailObject.nDV = ((int)(System.currentTimeMillis() / 1000L)))
    {
      GMTrace.o(6632637464576L, 49417);
      return localMallOrderDetailObject;
    }
  }
  
  private void aWI()
  {
    GMTrace.i(6631429505024L, 49408);
    if ((this.jxx == null) || (this.jxx.size() == 0))
    {
      GMTrace.o(6631429505024L, 49408);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.jxx);
    int i = 0;
    while (i < localArrayList.size())
    {
      j localj = (j)localArrayList.get(i);
      if ((localj.nFu != null) && (com.tencent.mm.plugin.order.c.c.uE(localj.nFu)))
      {
        int j = Integer.valueOf(localj.nFu).intValue();
        if ((j != 2) && (j != 1)) {
          Ew(localj.eQB);
        }
      }
      i += 1;
    }
    GMTrace.o(6631429505024L, 49408);
  }
  
  private void aWJ()
  {
    GMTrace.i(6631832158208L, 49411);
    int i = 0;
    while (i < this.nEb.size())
    {
      a locala = (a)this.nEb.get(i);
      String str = locala.field_msgContentXml;
      j localj = Ev(str);
      localj.eQB = locala.field_msgId;
      this.jxx.add(localj);
      w.v("MicroMsg.MallPayMsgManager", "parsePayMsgFromMsgXmlList xml:" + str);
      i += 1;
    }
    GMTrace.o(6631832158208L, 49411);
  }
  
  private void loadFromDB()
  {
    GMTrace.i(6631295287296L, 49407);
    com.tencent.mm.plugin.order.a.b.aWE();
    Cursor localCursor = com.tencent.mm.plugin.order.a.b.aWG().Mx();
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      localCursor.moveToFirst();
      int i = localCursor.getColumnIndex("msgId");
      int j = localCursor.getColumnIndex("msgContentXml");
      int k = localCursor.getColumnIndex("isRead");
      while (!localCursor.isAfterLast())
      {
        a locala = new a();
        locala.field_msgId = localCursor.getString(i);
        locala.field_msgContentXml = localCursor.getString(j);
        locala.field_isRead = localCursor.getString(k);
        localCursor.moveToNext();
        this.nEb.add(locala);
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    GMTrace.o(6631295287296L, 49407);
  }
  
  public final boolean Ew(String paramString)
  {
    GMTrace.i(6631697940480L, 49410);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6631697940480L, 49410);
      return false;
    }
    paramString = Ey(paramString);
    if (paramString != null)
    {
      this.jxx.remove(paramString);
      int i;
      if (paramString != null) {
        i = 0;
      }
      for (;;)
      {
        if (i < this.nEb.size())
        {
          a locala = (a)this.nEb.get(i);
          if (paramString.eQB.equals(locala.field_msgId))
          {
            this.nEb.remove(locala);
            com.tencent.mm.plugin.order.a.b.aWE();
            com.tencent.mm.plugin.order.a.b.aWG().a(locala, new String[0]);
          }
        }
        else
        {
          GMTrace.o(6631697940480L, 49410);
          return true;
        }
        i += 1;
      }
    }
    GMTrace.o(6631697940480L, 49410);
    return false;
  }
  
  public final boolean Ex(String paramString)
  {
    GMTrace.i(6631966375936L, 49412);
    if ((this.jxx == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(6631966375936L, 49412);
      return false;
    }
    int i = 0;
    while (i < this.jxx.size())
    {
      j localj = (j)this.jxx.get(i);
      if ((localj != null) && (localj.eQB.equals(paramString)))
      {
        GMTrace.o(6631966375936L, 49412);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6631966375936L, 49412);
    return false;
  }
  
  public final j Ey(String paramString)
  {
    GMTrace.i(6632100593664L, 49413);
    if ((this.jxx == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(6632100593664L, 49413);
      return null;
    }
    int i = 0;
    while (i < this.jxx.size())
    {
      j localj = (j)this.jxx.get(i);
      if (paramString.equals(localj.eQB))
      {
        GMTrace.o(6632100593664L, 49413);
        return localj;
      }
      i += 1;
    }
    GMTrace.o(6632100593664L, 49413);
    return null;
  }
  
  public final a Ez(String paramString)
  {
    GMTrace.i(6632234811392L, 49414);
    if ((this.nEb == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(6632234811392L, 49414);
      return null;
    }
    int i = 0;
    while (i < this.nEb.size())
    {
      a locala = (a)this.nEb.get(i);
      if (paramString.equals(locala.field_msgId))
      {
        GMTrace.o(6632234811392L, 49414);
        return locala;
      }
      i += 1;
    }
    GMTrace.o(6632234811392L, 49414);
    return null;
  }
  
  public final void a(j paramj, String paramString1, String paramString2)
  {
    GMTrace.i(6631161069568L, 49406);
    if ((paramj == null) || (TextUtils.isEmpty(paramString1)))
    {
      GMTrace.o(6631161069568L, 49406);
      return;
    }
    a locala = new a();
    locala.field_msgId = paramj.eQB;
    locala.field_msgContentXml = paramString1;
    locala.field_isRead = paramString2;
    com.tencent.mm.plugin.order.a.b.aWE();
    if (!com.tencent.mm.plugin.order.a.b.aWG().a(locala)) {
      w.e("MicroMsg.MallPayMsgManager", "insert CommonMsgXml failed! id:" + paramj.eQB);
    }
    this.nEb.add(locala);
    GMTrace.o(6631161069568L, 49406);
  }
  
  public final void aWK()
  {
    GMTrace.i(6632369029120L, 49415);
    int i = aWL();
    h.xz();
    h.xy().xh().set(204820, Integer.valueOf(i));
    w.v("MicroMsg.MallPayMsgManager", "save unread msg is :" + i);
    GMTrace.o(6632369029120L, 49415);
  }
  
  public final int aWL()
  {
    GMTrace.i(6632503246848L, 49416);
    if ((this.nEb == null) || (this.nEb.size() == 0))
    {
      GMTrace.o(6632503246848L, 49416);
      return 0;
    }
    int i = 0;
    int k;
    for (int j = 0; i < this.nEb.size(); j = k)
    {
      a locala = (a)this.nEb.get(i);
      k = j;
      if (locala != null)
      {
        k = j;
        if ("0".equals(locala.field_isRead)) {
          k = j + 1;
        }
      }
      i += 1;
    }
    w.v("MicroMsg.MallPayMsgManager", "msg xml unread msg is %s:" + j);
    GMTrace.o(6632503246848L, 49416);
    return j;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */