package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.plugin.product.b.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class MallProductSelectSkuUI
  extends MallBaseUI
  implements j.a
{
  private TextView izE;
  private com.tencent.mm.plugin.product.b.m nHC;
  private e nHR;
  private com.tencent.mm.plugin.product.b.c nJB;
  private ImageView nKd;
  private TextView nKe;
  private TextView nKf;
  private Button nKg;
  private ListView nKh;
  private MallProductSelectAmountView nKi;
  private i nKj;
  private f nKk;
  
  public MallProductSelectSkuUI()
  {
    GMTrace.i(6032281567232L, 44944);
    this.nKi = null;
    this.nKj = null;
    GMTrace.o(6032281567232L, 44944);
  }
  
  private void ar()
  {
    GMTrace.i(6033086873600L, 44950);
    if (this.nHC != null)
    {
      if ((this.nHR == null) || (this.nHC.nIg == null)) {
        break label226;
      }
      this.nKe.setText(com.tencent.mm.plugin.product.b.b.n(this.nHR.nHV, this.nHR.nHW, this.nHC.nIg.nEr));
      if (this.nHC.nIg != null) {
        this.izE.setText(this.nHC.nIg.name);
      }
    }
    if (!bg.nm(this.nJB.aXa()))
    {
      localObject = com.tencent.mm.platformtools.j.a(new c(this.nJB.aXa()));
      this.nKd.setImageBitmap((Bitmap)localObject);
      com.tencent.mm.platformtools.j.a(this);
    }
    this.nKf.setVisibility(8);
    Object localObject = this.nKi;
    int i = this.nJB.aXi();
    int j = this.nJB.nHC.nIf;
    if (i > j) {
      ((MallProductSelectAmountView)localObject).nJY = 3;
    }
    for (((MallProductSelectAmountView)localObject).nJX = j;; ((MallProductSelectAmountView)localObject).nJX = i)
    {
      ((MallProductSelectAmountView)localObject).aXy();
      if (((MallProductSelectAmountView)localObject).nKb != null) {
        ((MallProductSelectAmountView)localObject).nKb.dd(((MallProductSelectAmountView)localObject).nKa);
      }
      this.nKj.notifyDataSetChanged();
      GMTrace.o(6033086873600L, 44950);
      return;
      label226:
      this.nKe.setText(com.tencent.mm.plugin.product.b.b.n(this.nHC.nIg.nIt, this.nHC.nIg.nIu, this.nHC.nIg.nEr));
      break;
      ((MallProductSelectAmountView)localObject).nJY = 1;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(6032952655872L, 44949);
    oM(a.i.sVR);
    this.nKd = ((ImageView)findViewById(a.f.sBH));
    this.izE = ((TextView)findViewById(a.f.sBL));
    this.nKe = ((TextView)findViewById(a.f.sBJ));
    this.nKf = ((TextView)findViewById(a.f.sBG));
    this.nKg = ((Button)findViewById(a.f.sBI));
    this.nKh = ((ListView)findViewById(a.f.sBO));
    this.nKi = ((MallProductSelectAmountView)findViewById(a.f.sHb));
    MallProductSelectAmountView localMallProductSelectAmountView = this.nKi;
    localMallProductSelectAmountView.nKa = this.nJB.mCount;
    if (localMallProductSelectAmountView.aXy())
    {
      localMallProductSelectAmountView.hqk.setText(localMallProductSelectAmountView.nKa);
      if (localMallProductSelectAmountView.nKb != null) {
        localMallProductSelectAmountView.nKb.dd(localMallProductSelectAmountView.nKa);
      }
    }
    this.nKj = new i(this);
    if ((this.nHC != null) && (this.nHC.nIg != null) && (this.nHC.nIg.nIC != null)) {
      this.nKj.nKm = this.nHC.nIg.nIC;
    }
    for (;;)
    {
      this.nKj.nKn = new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6008122376192L, 44764);
          Object localObject = (Pair)paramAnonymousView.getTag();
          paramAnonymousView = MallProductSelectSkuUI.this;
          com.tencent.mm.plugin.product.b.c localc = MallProductSelectSkuUI.b(MallProductSelectSkuUI.this);
          paramAnonymousAdapterView = (String)((Pair)localObject).first;
          localObject = (String)((Pair)localObject).second;
          w.d("MicroMsg.MallProductManager", "selectSkuInfo (" + paramAnonymousAdapterView + " , " + (String)localObject + ")");
          if ((localc.nHO.containsKey(paramAnonymousAdapterView)) && (((String)localc.nHO.get(paramAnonymousAdapterView)).equals(localObject)))
          {
            localc.nHO.remove(paramAnonymousAdapterView);
            localc.nHG = com.tencent.mm.plugin.product.b.c.F(localc.nHO);
            if (localc.nHN != null)
            {
              paramAnonymousAdapterView = (e)localc.nHN.get(localc.nHG);
              localc.nHR = paramAnonymousAdapterView;
              label180:
              localc.aXo();
            }
          }
          for (paramAnonymousAdapterView = localc.nHR;; paramAnonymousAdapterView = null)
          {
            MallProductSelectSkuUI.a(paramAnonymousView, paramAnonymousAdapterView);
            MallProductSelectSkuUI.a(MallProductSelectSkuUI.this);
            GMTrace.o(6008122376192L, 44764);
            return;
            paramAnonymousAdapterView = null;
            break;
            localc.nHO.put(paramAnonymousAdapterView, localObject);
            localc.nHG = com.tencent.mm.plugin.product.b.c.F(localc.nHO);
            w.d("MicroMsg.MallProductManager", "getSkuInfoId (" + localc.nHG + ")");
            if (localc.nHN != null)
            {
              localc.nHR = ((e)localc.nHN.get(localc.nHG));
              break label180;
            }
          }
        }
      };
      this.nKh.setAdapter(this.nKj);
      this.nKi.nKb = new MallProductSelectAmountView.a()
      {
        public final void cM(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(6029194559488L, 44921);
          switch (paramAnonymousInt2)
          {
          }
          for (;;)
          {
            GMTrace.o(6029194559488L, 44921);
            return;
            MallProductSelectSkuUI.c(MallProductSelectSkuUI.this).setText(a.i.sVP);
            MallProductSelectSkuUI.c(MallProductSelectSkuUI.this).setVisibility(0);
            GMTrace.o(6029194559488L, 44921);
            return;
            MallProductSelectSkuUI.c(MallProductSelectSkuUI.this).setText(MallProductSelectSkuUI.this.getString(a.i.sVQ, new Object[] { Integer.valueOf(paramAnonymousInt1) }));
            MallProductSelectSkuUI.c(MallProductSelectSkuUI.this).setVisibility(0);
          }
        }
        
        public final void dd(int paramAnonymousInt)
        {
          GMTrace.i(6029060341760L, 44920);
          MallProductSelectSkuUI.b(MallProductSelectSkuUI.this).mCount = paramAnonymousInt;
          MallProductSelectSkuUI.c(MallProductSelectSkuUI.this).setVisibility(8);
          GMTrace.o(6029060341760L, 44920);
        }
      };
      this.nKg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6002485231616L, 44722);
          f localf = MallProductSelectSkuUI.d(MallProductSelectSkuUI.this);
          if (localf.nJz)
          {
            u.makeText(localf.nJy, a.i.sVM, 1).show();
            GMTrace.o(6002485231616L, 44722);
            return;
          }
          if (localf.nJB.aXk())
          {
            if (localf.nJB.nHI != null)
            {
              h.xz();
              h.xx().fYr.a(new com.tencent.mm.plugin.product.b.j(localf.nJB.aXm(), f.gRb), 0);
              GMTrace.o(6002485231616L, 44722);
              return;
            }
            d.b(localf.nJy, "address", ".ui.WalletAddAddressUI", 2);
            GMTrace.o(6002485231616L, 44722);
            return;
          }
          paramAnonymousView = localf.nJB;
          com.tencent.mm.plugin.product.c.m localm;
          if ((paramAnonymousView.nHO != null) && (paramAnonymousView.nHO.size() < paramAnonymousView.nHM) && (paramAnonymousView.nHM > 0))
          {
            Iterator localIterator = paramAnonymousView.nHC.nIg.nIC.iterator();
            do
            {
              if (!localIterator.hasNext()) {
                break;
              }
              localm = (com.tencent.mm.plugin.product.c.m)localIterator.next();
            } while (paramAnonymousView.nHO.containsKey(localm.nIO));
          }
          for (paramAnonymousView = localm.nIP;; paramAnonymousView = null)
          {
            if (!bg.nm(paramAnonymousView)) {
              u.makeText(localf.nJy, localf.nJy.getString(a.i.sBG, new Object[] { paramAnonymousView }), 0).show();
            }
            GMTrace.o(6002485231616L, 44722);
            return;
          }
        }
      });
      this.nKd.setFocusable(true);
      this.nKd.setFocusableInTouchMode(true);
      this.nKd.requestFocus();
      GMTrace.o(6032952655872L, 44949);
      return;
      w.e("MicroMsg.MallProductSelectSkuUI", "Illage mProductInfo.base_attr.sku_table");
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6032415784960L, 44945);
    int i = a.g.sOb;
    GMTrace.o(6032415784960L, 44945);
    return i;
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6033355309056L, 44952);
    paramString = new StringBuilder().append(paramString).append(", bitmap = ");
    if (paramBitmap == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MallProductSelectSkuUI", bool);
      if (!bg.nm(this.nJB.aXa())) {
        break;
      }
      GMTrace.o(6033355309056L, 44952);
      return;
    }
    this.nKd.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6025033809920L, 44890);
        MallProductSelectSkuUI.e(MallProductSelectSkuUI.this).setImageBitmap(paramBitmap);
        GMTrace.o(6025033809920L, 44890);
      }
    });
    GMTrace.o(6033355309056L, 44952);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6033221091328L, 44951);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.nKk.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6033221091328L, 44951);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6032550002688L, 44946);
    super.onCreate(paramBundle);
    this.nKk = new f(this.vKB.vKW, new f.a()
    {
      public final void o(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
      {
        GMTrace.i(5998458699776L, 44692);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          MallProductSelectSkuUI.a(MallProductSelectSkuUI.this);
          GMTrace.o(5998458699776L, 44692);
          return;
        }
        MallProductSelectSkuUI.this.EG(paramAnonymousString);
        GMTrace.o(5998458699776L, 44692);
      }
    });
    a.aWW();
    this.nJB = a.aWX();
    this.nHC = this.nJB.nHC;
    MP();
    ar();
    GMTrace.o(6032550002688L, 44946);
  }
  
  public void onStart()
  {
    GMTrace.i(6032684220416L, 44947);
    this.nKk.onStart();
    super.onStart();
    GMTrace.o(6032684220416L, 44947);
  }
  
  protected void onStop()
  {
    GMTrace.i(6032818438144L, 44948);
    this.nKk.onStop();
    super.onStop();
    GMTrace.o(6032818438144L, 44948);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MallProductSelectSkuUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */