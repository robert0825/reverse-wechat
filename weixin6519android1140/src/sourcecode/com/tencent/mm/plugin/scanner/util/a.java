package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.appbrand.k.d;
import com.tencent.mm.plugin.scanner.a.f;
import com.tencent.mm.plugin.scanner.b;
import com.tencent.mm.plugin.scanner.ui.ProductUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.hm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
  implements com.tencent.mm.ad.e
{
  public Bundle eDm;
  public Activity eNu;
  public ProgressDialog htG;
  
  public a()
  {
    GMTrace.i(6170123173888L, 45971);
    GMTrace.o(6170123173888L, 45971);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6170391609344L, 45973);
    w.i("MicroMsg.BarcodeStringHandler", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    bdk();
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -4))
    {
      com.tencent.mm.ui.base.h.a(this.eNu, R.l.dOZ, R.l.cUG, null);
      GMTrace.o(6170391609344L, 45973);
      return;
    }
    int i;
    switch (paramInt1)
    {
    default: 
      i = 0;
    }
    while (i != 0)
    {
      GMTrace.o(6170391609344L, 45973);
      return;
      if (at.wS().DO())
      {
        at.wS().getNetworkServerIp();
        new StringBuilder().append(paramInt2);
      }
      for (;;)
      {
        i = 1;
        break;
        if (ab.bv(this.eNu)) {
          com.tencent.mm.pluginsdk.ui.k.dU(this.eNu);
        } else {
          Toast.makeText(this.eNu, this.eNu.getString(R.l.dwH, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
        }
      }
      Toast.makeText(this.eNu, this.eNu.getString(R.l.dwI), 1).show();
      i = 1;
    }
    if ((paramInt1 == 4) && (paramInt2 == 63532))
    {
      com.tencent.mm.ui.base.h.h(this.eNu, R.l.dOU, R.l.cUG);
      GMTrace.o(6170391609344L, 45973);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this.eNu, this.eNu.getString(R.l.dxd, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(6170391609344L, 45973);
      return;
    }
    if (paramk.getType() == 1061)
    {
      Object localObject = ((f)paramk).bcp();
      if (localObject == null)
      {
        w.e("MicroMsg.BarcodeStringHandler", "onSceneEnd(), getResp() == null");
        GMTrace.o(6170391609344L, 45973);
        return;
      }
      w.d("MicroMsg.BarcodeStringHandler", "onSceneEnd() ScanBarcode Type = %s", new Object[] { Integer.valueOf(((hm)localObject).jib) });
      if (bg.nm(((hm)localObject).tWp))
      {
        GMTrace.o(6170391609344L, 45973);
        return;
      }
      paramInt1 = ((hm)localObject).jib;
      paramString = this.eNu;
      localObject = ((hm)localObject).tWp;
      paramInt2 = ((f)paramk).eDg;
      i = ((f)paramk).eDh;
      e locale = new e();
      paramk = this.eDm;
      int j = n.FW((String)localObject);
      w.d("MicroMsg.Scanner.ScanXmlHelper", "processReturnXml(), xmlType = [%s]", new Object[] { Integer.valueOf(j) });
      n.c localc;
      if (j == 1)
      {
        localc = n.FX((String)localObject);
        if ((localc == null) || (bg.nm(localc.username)))
        {
          w.w("MicroMsg.Scanner.ScanXmlHelper", "xmlUser null");
          paramInt1 = 2;
          switch (paramInt1)
          {
          }
        }
      }
      for (;;)
      {
        GMTrace.o(6170391609344L, 45973);
        return;
        at.AR();
        localObject = c.yK().TE(localc.username);
        if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).fTq > 0))
        {
          paramk = new Intent();
          paramk.putExtra("Contact_User", ((af)localObject).field_username);
          paramk.setFlags(65536);
          b.hnH.d(paramk, paramString);
          paramInt1 = 0;
          break;
        }
        locale.a(paramString, localc.username, 2, paramInt2, i, null, paramk);
        paramInt1 = 1;
        break;
        if (j == 2)
        {
          localObject = n.FY((String)localObject);
          if ((localObject == null) || (bg.nm(((n.b)localObject).gVf)))
          {
            w.w("MicroMsg.Scanner.ScanXmlHelper", "xmlurl null");
            paramInt1 = 2;
            break;
          }
          w.d("MicroMsg.Scanner.ScanXmlHelper", "xmlurl.link: [%s]", new Object[] { ((n.b)localObject).gVf });
          if (paramInt1 == 5)
          {
            ((d)com.tencent.mm.kernel.h.h(d.class)).b(paramString, ((n.b)localObject).gVf, 1031, paramk);
            paramInt1 = 0;
            break;
          }
          paramk = new Intent();
          paramk.putExtra("rawUrl", ((n.b)localObject).gVf);
          paramk.setFlags(65536);
          b.hnH.j(paramk, paramString);
          paramInt1 = 0;
          break;
        }
        if ((j == 3) || (j == 4))
        {
          w.d("MicroMsg.Scanner.ScanXmlHelper", "funcType = [%s], addProductToDB = [%s]", new Object[] { Integer.valueOf(4), Boolean.valueOf(true) });
          paramk = new Intent();
          paramk.setClass(paramString, ProductUI.class);
          paramk.setFlags(65536);
          paramk.putExtra("key_Product_xml", (String)localObject);
          paramk.putExtra("key_Product_funcType", 4);
          paramk.putExtra("key_ProductUI_addToDB", true);
          paramk.putExtra("key_need_add_to_history", true);
          paramk.putExtra("key_is_from_barcode", true);
          paramString.startActivity(paramk);
          paramInt1 = 0;
          break;
        }
        w.w("MicroMsg.Scanner.ScanXmlHelper", "wrong xmlType");
        w.v("MicroMsg.Scanner.ScanXmlHelper", "wrong xml : [%s]", new Object[] { localObject });
        paramInt1 = 2;
        break;
        w.i("MicroMsg.BarcodeStringHandler", "onSceneEnd PROCESS_XML_RETURN_TYPE_OK");
        GMTrace.o(6170391609344L, 45973);
        return;
        w.i("MicroMsg.BarcodeStringHandler", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
        GMTrace.o(6170391609344L, 45973);
        return;
        w.e("MicroMsg.BarcodeStringHandler", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
      }
    }
    GMTrace.o(6170391609344L, 45973);
  }
  
  public final void bdk()
  {
    GMTrace.i(6170257391616L, 45972);
    at.wS().b(1061, this);
    GMTrace.o(6170257391616L, 45972);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */