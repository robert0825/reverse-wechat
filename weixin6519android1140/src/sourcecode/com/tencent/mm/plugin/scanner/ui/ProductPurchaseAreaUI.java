package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.scanner.a.a.a;
import com.tencent.mm.plugin.scanner.a.h;
import com.tencent.mm.plugin.scanner.a.i;
import com.tencent.mm.plugin.scanner.util.n.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.LinkedList;
import java.util.List;

public class ProductPurchaseAreaUI
  extends MMPreference
{
  protected f iAA;
  private String klt;
  private List<a.a> owm;
  private int own;
  
  public ProductPurchaseAreaUI()
  {
    GMTrace.i(6147977248768L, 45806);
    GMTrace.o(6147977248768L, 45806);
  }
  
  private void bcV()
  {
    GMTrace.i(6148379901952L, 45809);
    if (this.owm == null)
    {
      GMTrace.o(6148379901952L, 45809);
      return;
    }
    int i = 0;
    while (i < this.owm.size())
    {
      Object localObject = (a.a)this.owm.get(i);
      if (localObject != null)
      {
        a locala = new a(this);
        locala.setKey(String.valueOf(i));
        locala.setTitle(((a.a)localObject).name);
        locala.setSummary(((a.a)localObject).desc);
        locala.ouh = ((a.a)localObject).glz;
        this.iAA.a(locala);
        if (i != this.owm.size() - 1)
        {
          localObject = new g(this.vKB.vKW);
          this.iAA.a((Preference)localObject);
        }
      }
      i += 1;
    }
    this.iAA.notifyDataSetChanged();
    GMTrace.o(6148379901952L, 45809);
  }
  
  private static void i(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(6148648337408L, 45811);
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("jsapi_args_appid", i.tt(paramInt));
    localIntent.putExtra("jsapiargs", localBundle);
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("pay_channel", 3);
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(6148648337408L, 45811);
  }
  
  protected final void MP()
  {
    GMTrace.i(6148245684224L, 45808);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6137508265984L, 45728);
        ProductPurchaseAreaUI.this.finish();
        GMTrace.o(6137508265984L, 45728);
        return false;
      }
    });
    this.iAA = this.wky;
    GMTrace.o(6148245684224L, 45808);
  }
  
  public final int QI()
  {
    GMTrace.i(6148782555136L, 45812);
    int i = R.o.epa;
    GMTrace.o(6148782555136L, 45812);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(6148514119680L, 45810);
    if (this.owm == null)
    {
      GMTrace.o(6148514119680L, 45810);
      return false;
    }
    for (;;)
    {
      a.a locala;
      try
      {
        int i = Integer.valueOf(paramPreference.hiu).intValue();
        if (i >= 0)
        {
          int j = this.owm.size();
          if (i < j) {}
        }
        else
        {
          GMTrace.o(6148514119680L, 45810);
          return false;
        }
        locala = (a.a)this.owm.get(i);
        if (locala == null)
        {
          GMTrace.o(6148514119680L, 45810);
          return false;
        }
        paramPreference = null;
        switch (locala.type)
        {
        case 1: 
          w.i("MicroMsg.ProductPurchaseAreaUI", "Default go url:" + locala.gVf);
          paramf = paramPreference;
          if (!bg.nm(locala.gVf))
          {
            i(this.vKB.vKW, locala.gVf, this.own);
            paramf = paramPreference;
          }
          paramf = new h(this.klt, locala.osS, locala.type, paramf, this.owm.size(), locala.showType);
          at.wS().a(paramf, 0);
          GMTrace.o(6148514119680L, 45810);
          return true;
        }
      }
      catch (Exception paramf)
      {
        w.e("MicroMsg.ProductPurchaseAreaUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
        w.printErrStackTrace("MicroMsg.ProductPurchaseAreaUI", paramf, "", new Object[0]);
        GMTrace.o(6148514119680L, 45810);
        return false;
      }
      paramf = locala.gVf;
      if (!bg.nm(locala.gVf))
      {
        i(this.vKB.vKW, locala.gVf, this.own);
      }
      else
      {
        w.w("MicroMsg.ProductPurchaseAreaUI", "action link empty");
        continue;
        paramPreference = locala.osT;
        paramf = paramPreference;
        if (!bg.nm(locala.osT))
        {
          paramf = new Intent();
          paramf.putExtra("key_product_id", locala.osT);
          paramf.putExtra("key_product_scene", 12);
          d.b(this, "product", ".ui.MallProductUI", paramf);
          paramf = paramPreference;
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6148111466496L, 45807);
    super.onCreate(paramBundle);
    MP();
    paramBundle = i.bH(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
    if ((paramBundle != null) && (paramBundle.oBs != null))
    {
      this.klt = paramBundle.field_productid;
      this.own = paramBundle.field_functionType;
      String str = getIntent().getStringExtra("referkey");
      w.i("MicroMsg.ProductPurchaseAreaUI", "referkey:" + str);
      if (!bg.nm(str))
      {
        int i = 0;
        while (i < paramBundle.oBs.size())
        {
          if (str.equals(((com.tencent.mm.plugin.scanner.a.a)paramBundle.oBs.get(i)).osL))
          {
            this.owm = ((com.tencent.mm.plugin.scanner.a.a)paramBundle.oBs.get(i)).gVg;
            sq(((com.tencent.mm.plugin.scanner.a.a)paramBundle.oBs.get(i)).title);
            bcV();
            GMTrace.o(6148111466496L, 45807);
            return;
          }
          i += 1;
        }
      }
      GMTrace.o(6148111466496L, 45807);
      return;
    }
    w.w("MicroMsg.ProductPurchaseAreaUI", "Data product null");
    GMTrace.o(6148111466496L, 45807);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\ProductPurchaseAreaUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */