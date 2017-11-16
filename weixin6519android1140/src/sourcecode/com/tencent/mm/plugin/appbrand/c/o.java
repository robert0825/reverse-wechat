package com.tencent.mm.plugin.appbrand.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.k.f;
import com.tencent.mm.plugin.appbrand.k.f.a;
import com.tencent.mm.plugin.appbrand.k.f.b;
import com.tencent.mm.plugin.appbrand.k.f.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.protocal.c.adi;
import com.tencent.mm.protocal.c.bdy;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class o
  implements f
{
  public o()
  {
    GMTrace.i(19887040757760L, 148170);
    GMTrace.o(19887040757760L, 148170);
  }
  
  public final f.b TL()
  {
    GMTrace.i(19887174975488L, 148171);
    Object localObject1 = new f.b();
    ((f.b)localObject1).gpU = new ArrayList(0);
    ((f.b)localObject1).izw = -1;
    ((f.b)localObject1).eLQ = "";
    if (!h.xw().fYg)
    {
      GMTrace.o(19887174975488L, 148171);
      return (f.b)localObject1;
    }
    if (!a.Tj())
    {
      GMTrace.o(19887174975488L, 148171);
      return (f.b)localObject1;
    }
    final Object localObject2 = k.TJ();
    f.b localb = new f.b();
    int i;
    if (localObject2 == null)
    {
      localObject1 = null;
      localb.eLQ = ((String)localObject1);
      if (localObject2 != null) {
        break label310;
      }
      i = 0;
      label106:
      localb.izw = i;
      if (localObject2 != null) {
        break label319;
      }
      localObject1 = new Iterator()
      {
        boolean hNo;
        final Object[] hNp;
        
        public final boolean hasNext()
        {
          GMTrace.i(19884893274112L, 148154);
          if (this.hNo)
          {
            bool = this.hNq.moveToNext();
            if (!bool) {
              this.hNq.close();
            }
            GMTrace.o(19884893274112L, 148154);
            return bool;
          }
          this.hNo = true;
          boolean bool = this.hNq.moveToFirst();
          GMTrace.o(19884893274112L, 148154);
          return bool;
        }
        
        public final void remove()
        {
          GMTrace.i(19885027491840L, 148155);
          GMTrace.o(19885027491840L, 148155);
        }
      };
      i = 4;
    }
    for (;;)
    {
      localb.gpU = new ArrayList(i);
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Object[])((Iterator)localObject1).next();
        WxaAttributes localWxaAttributes = com.tencent.mm.plugin.appbrand.app.e.Se().d((String)localObject2[0], new String[] { "nickname", "brandIconURL" });
        if (localWxaAttributes != null)
        {
          f.c localc = new f.c();
          localc.username = ((String)localObject2[0]);
          localc.hZb = ((Integer)localObject2[1]).intValue();
          localc.eVc = ((Integer)localObject2[2]).intValue();
          localc.eCQ = localWxaAttributes.field_nickname;
          localc.izx = localWxaAttributes.field_brandIconURL;
          localb.gpU.add(localc);
        }
      }
      localObject1 = ((adi)localObject2).mmS;
      break;
      label310:
      i = ((adi)localObject2).utv;
      break label106;
      label319:
      localObject1 = new Iterator()
      {
        final Object[] hNp;
        final Iterator<bdy> hNs;
        
        public final boolean hasNext()
        {
          GMTrace.i(19888382935040L, 148180);
          boolean bool = this.hNs.hasNext();
          GMTrace.o(19888382935040L, 148180);
          return bool;
        }
        
        public final void remove()
        {
          GMTrace.i(19888517152768L, 148181);
          GMTrace.o(19888517152768L, 148181);
        }
      };
      i = ((adi)localObject2).utu.size();
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19887846064128L, 148176);
          if (!bg.cc(localObject2.utu))
          {
            LinkedList localLinkedList = new LinkedList();
            Iterator localIterator = localObject2.utu.iterator();
            while (localIterator.hasNext()) {
              localLinkedList.add(((bdy)localIterator.next()).username);
            }
            r.S(localLinkedList);
          }
          GMTrace.o(19887846064128L, 148176);
        }
      }, "BatchSyncWxaAttrBySearchShowOut");
    }
    k.ih(k.a.hNi);
    GMTrace.o(19887174975488L, 148171);
    return localb;
  }
  
  public final void a(Context paramContext, f.c paramc, String paramString)
  {
    GMTrace.i(19887443410944L, 148173);
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1054;
    localAppBrandStatObject.eAv = paramString;
    ((c)h.h(c.class)).a(paramContext, paramc.username, null, paramc.hZb, paramc.eVc, null, localAppBrandStatObject);
    GMTrace.o(19887443410944L, 148173);
  }
  
  public final void a(Context paramContext, String paramString, f.a parama)
  {
    GMTrace.i(19887309193216L, 148172);
    Intent localIntent = new Intent(paramContext, AppBrandLauncherUI.class);
    localIntent.putExtra("extra_enter_scene", 10);
    localIntent.putExtra("extra_enter_scene_note", paramString + ":" + parama.tag);
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    paramContext.startActivity(localIntent);
    GMTrace.o(19887309193216L, 148172);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */