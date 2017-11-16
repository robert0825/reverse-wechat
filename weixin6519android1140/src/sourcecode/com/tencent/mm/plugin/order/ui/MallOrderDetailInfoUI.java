package com.tencent.mm.plugin.order.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.b;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import com.tencent.mm.plugin.order.model.ProductSectionItem.Skus;
import com.tencent.mm.plugin.order.model.f;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MallOrderDetailInfoUI
  extends WalletBaseUI
  implements j.a
{
  private ListView Ev;
  private View.OnClickListener hwh;
  private String jVR;
  private HashMap<String, View> nBR;
  private List<MallOrderDetailObject.a> nDQ;
  protected MallOrderDetailObject nEY;
  String nFJ;
  private a nFK;
  private View nFL;
  private View nFM;
  private View nFN;
  private View nFO;
  private View nFP;
  private View nFQ;
  private View nFR;
  private boolean nFS;
  private boolean nFT;
  private int nFU;
  private CheckedTextView nFV;
  private CheckedTextView nFW;
  View.OnClickListener nFX;
  
  public MallOrderDetailInfoUI()
  {
    GMTrace.i(6635187601408L, 49436);
    this.nDQ = new ArrayList();
    this.nEY = null;
    this.nBR = new HashMap();
    this.nFS = false;
    this.jVR = "";
    this.nFT = false;
    this.nFU = 0;
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6659883663360L, 49620);
        if (paramAnonymousView.getId() == a.f.sDe)
        {
          if (MallOrderDetailInfoUI.this.nEY.nDO != null)
          {
            com.tencent.mm.plugin.order.c.c.aq(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.nEY.nDO.lPE);
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.nEY.nDO.nDW);
            GMTrace.o(6659883663360L, 49620);
          }
        }
        else if ((paramAnonymousView.getId() == a.f.sDs) || (paramAnonymousView.getId() == a.f.sDr))
        {
          if ((MallOrderDetailInfoUI.this.nEY.nDP == null) || (MallOrderDetailInfoUI.this.nEY.nDP.size() <= 0)) {
            break label631;
          }
          if (TextUtils.isEmpty(((ProductSectionItem)MallOrderDetailInfoUI.this.nEY.nDP.get(0)).jumpUrl)) {
            break label640;
          }
        }
        label631:
        label640:
        for (boolean bool = com.tencent.mm.plugin.order.c.c.aq(MallOrderDetailInfoUI.this, ((ProductSectionItem)MallOrderDetailInfoUI.this.nEY.nDP.get(0)).jumpUrl);; bool = false)
        {
          if (!bool) {
            com.tencent.mm.plugin.order.c.c.ar(MallOrderDetailInfoUI.this, ((ProductSectionItem)MallOrderDetailInfoUI.this.nEY.nDP.get(0)).nFG);
          }
          MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, ((ProductSectionItem)MallOrderDetailInfoUI.this.nEY.nDP.get(0)).name);
          GMTrace.o(6659883663360L, 49620);
          return;
          if (paramAnonymousView.getId() == a.f.sDq)
          {
            paramAnonymousView = MallOrderDetailInfoUI.this.ui;
            paramAnonymousView.putParcelableArrayList("order_product_list", MallOrderDetailInfoUI.this.nEY.nDP);
            paramAnonymousView.putInt("key_enter_id", 0);
            paramAnonymousView.putString("key_trans_id", MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this));
            paramAnonymousView.putString("appname", MallOrderDetailInfoUI.this.nEY.eIH);
            com.tencent.mm.wallet_core.a.i(MallOrderDetailInfoUI.this, new Bundle());
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.getResources().getString(a.i.sVG));
            GMTrace.o(6659883663360L, 49620);
            return;
          }
          if (paramAnonymousView.getId() == a.f.sDz)
          {
            paramAnonymousView = MallOrderDetailInfoUI.this.ui.getString("key_trans_id");
            Bundle localBundle = MallOrderDetailInfoUI.this.ui;
            localBundle.putString("key_trans_id", paramAnonymousView);
            localBundle.putInt("key_enter_id", 1);
            if (MallOrderDetailInfoUI.this.nEY != null) {
              localBundle.putParcelable("transaction_data", MallOrderDetailInfoUI.this.nEY.nDN);
            }
            com.tencent.mm.wallet_core.a.i(MallOrderDetailInfoUI.this, localBundle);
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.getResources().getString(a.i.sVF));
            GMTrace.o(6659883663360L, 49620);
            return;
          }
          if (paramAnonymousView.getId() == a.f.sDc)
          {
            MallOrderDetailInfoUI.b(MallOrderDetailInfoUI.this);
            GMTrace.o(6659883663360L, 49620);
            return;
          }
          if (paramAnonymousView.getId() == a.f.svW)
          {
            if ((MallOrderDetailInfoUI.this.nEY != null) && (MallOrderDetailInfoUI.this.nEY.nDU != null))
            {
              MallOrderDetailInfoUI.this.nFJ = MallOrderDetailInfoUI.this.nEY.nDU;
              MallOrderDetailInfoUI.c(MallOrderDetailInfoUI.this);
              MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.getResources().getString(a.i.sVE));
              GMTrace.o(6659883663360L, 49620);
            }
          }
          else if (paramAnonymousView.getId() == a.f.sLr)
          {
            e.Q(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.nEY.eIH);
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.getResources().getString(a.i.sVK));
          }
          GMTrace.o(6659883663360L, 49620);
          return;
        }
      }
    };
    this.nFX = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6655186042880L, 49585);
        if ((MallOrderDetailInfoUI.f(MallOrderDetailInfoUI.this) != null) && (MallOrderDetailInfoUI.g(MallOrderDetailInfoUI.this) != null))
        {
          if (paramAnonymousView.getId() == a.f.sCY)
          {
            MallOrderDetailInfoUI.f(MallOrderDetailInfoUI.this).setSelected(true);
            MallOrderDetailInfoUI.g(MallOrderDetailInfoUI.this).setSelected(false);
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, 100);
            GMTrace.o(6655186042880L, 49585);
            return;
          }
          MallOrderDetailInfoUI.f(MallOrderDetailInfoUI.this).setSelected(false);
          MallOrderDetailInfoUI.g(MallOrderDetailInfoUI.this).setSelected(true);
          MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, -100);
        }
        GMTrace.o(6655186042880L, 49585);
      }
    };
    GMTrace.o(6635187601408L, 49436);
  }
  
  private static void a(View paramView, MallOrderDetailObject.a parama)
  {
    GMTrace.i(6636395560960L, 49445);
    if (parama == null)
    {
      GMTrace.o(6636395560960L, 49445);
      return;
    }
    Rect localRect = new Rect();
    localRect.left = paramView.getPaddingLeft();
    localRect.right = paramView.getPaddingRight();
    localRect.top = paramView.getPaddingTop();
    localRect.bottom = paramView.getPaddingBottom();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if ((parama != null) && (parama.jxU)) {
      paramView.setBackgroundResource(a.e.aXW);
    }
    for (;;)
    {
      paramView.setLayoutParams(localLayoutParams);
      paramView.setPadding(localRect.left, localRect.top, localRect.right, localRect.bottom);
      GMTrace.o(6636395560960L, 49445);
      return;
      paramView.setBackgroundResource(a.e.aXC);
    }
  }
  
  private void a(View paramView, ProductSectionItem paramProductSectionItem)
  {
    GMTrace.i(6636127125504L, 49443);
    if ((paramView == null) || (paramProductSectionItem == null))
    {
      GMTrace.o(6636127125504L, 49443);
      return;
    }
    paramView.setVisibility(0);
    TextView localTextView = (TextView)paramView.findViewById(a.f.sws);
    if (localTextView != null) {
      localTextView.setText(paramProductSectionItem.name);
    }
    if (!TextUtils.isEmpty(paramProductSectionItem.iconUrl)) {
      l((ImageView)paramView.findViewById(a.f.swt), paramProductSectionItem.iconUrl);
    }
    GMTrace.o(6636127125504L, 49443);
  }
  
  private void aWO()
  {
    GMTrace.i(6635992907776L, 49442);
    if (this.nEY == null)
    {
      GMTrace.o(6635992907776L, 49442);
      return;
    }
    com.tencent.mm.platformtools.j.a(this);
    this.nBR.clear();
    MallOrderDetailObject.b localb = this.nEY.nDO;
    Object localObject;
    if (localb != null)
    {
      localObject = localb.nDW;
      if (TextUtils.isEmpty(localb.nDX)) {
        break label1525;
      }
      localObject = (String)localObject + "：" + localb.nDX;
    }
    label249:
    label350:
    label647:
    label1351:
    label1363:
    label1525:
    for (;;)
    {
      if (!this.nFS)
      {
        this.nFM.setVisibility(8);
        this.nFL.setVisibility(0);
        ((TextView)this.nFL.findViewById(a.f.sDg)).setText((CharSequence)localObject);
        ((TextView)this.nFL.findViewById(a.f.sDf)).setText(e.EO(this.nEY.nDV));
        if ((!TextUtils.isEmpty(localb.thumbUrl)) && (e.Xw(localb.thumbUrl)))
        {
          l((ImageView)this.nFL.findViewById(a.f.sDp), localb.thumbUrl);
          localObject = this.nEY.nDP;
          if ((localObject != null) && (((List)localObject).size() != 0)) {
            break label647;
          }
          this.nFP.setVisibility(8);
          this.nFQ.setVisibility(8);
          this.nFR.setVisibility(8);
          localObject = this.nEY.nDN;
          if (localObject == null) {
            break label1351;
          }
          this.nFN.setVisibility(0);
          ((TextView)findViewById(a.f.sDA)).setText(e.d(((MallTransactionObject)localObject).jWS, ((MallTransactionObject)localObject).nEr));
          if ((this.nEY != null) && (this.nEY.nDQ != null) && (this.nEY.nDQ.size() > 0))
          {
            localObject = (MallOrderDetailObject.a)this.nEY.nDQ.get(0);
            a(this.nFO, (MallOrderDetailObject.a)localObject);
          }
          localObject = this.nEY.nDQ;
          if (localObject != null)
          {
            this.nDQ.addAll((Collection)localObject);
            this.nFK.notifyDataSetChanged();
          }
          findViewById(a.f.sBi).setVisibility(0);
          if ((this.nEY == null) || (!TextUtils.isEmpty(this.nEY.nDU)) || (!TextUtils.isEmpty(this.nEY.eIH))) {
            break label1363;
          }
          findViewById(a.f.sBi).setVisibility(8);
        }
      }
      for (;;)
      {
        if ((this.nEY != null) && (!TextUtils.isEmpty(this.nEY.nDT))) {
          a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(6634516512768L, 49431);
              MallOrderDetailInfoUI.d(MallOrderDetailInfoUI.this);
              GMTrace.o(6634516512768L, 49431);
              return true;
            }
          });
        }
        GMTrace.o(6635992907776L, 49442);
        return;
        d((ImageView)this.nFL.findViewById(a.f.sDp));
        break;
        this.nFL.setVisibility(8);
        this.nFM.setVisibility(0);
        ((TextView)this.nFM.findViewById(a.f.sDg)).setText((CharSequence)localObject);
        ((TextView)this.nFM.findViewById(a.f.sDf)).setText(e.EO(this.nEY.nDV));
        if ((!TextUtils.isEmpty(localb.thumbUrl)) && (e.Xw(localb.thumbUrl)))
        {
          l((ImageView)this.nFM.findViewById(a.f.sDp), localb.thumbUrl);
          break;
        }
        d((ImageView)this.nFM.findViewById(a.f.sDp));
        break;
        this.nFL.setVisibility(8);
        this.nFM.setVisibility(8);
        break;
        if (((List)localObject).size() == 1)
        {
          this.nFR.setVisibility(8);
          localObject = (ProductSectionItem)((List)localObject).get(0);
          if (!TextUtils.isEmpty(((ProductSectionItem)localObject).iconUrl))
          {
            this.nFP.setVisibility(8);
            this.nFQ.setVisibility(0);
            ((TextView)this.nFQ.findViewById(a.f.sws)).setText(((ProductSectionItem)localObject).name);
            ((TextView)this.nFQ.findViewById(a.f.swu)).setText(((ProductSectionItem)localObject).nFF);
            ((TextView)this.nFQ.findViewById(a.f.swq)).setText("+" + ((ProductSectionItem)localObject).count);
            ((TextView)this.nFQ.findViewById(a.f.swp)).setText(ProductSectionItem.Skus.aZ(((ProductSectionItem)localObject).nFE));
            if (TextUtils.isEmpty(((ProductSectionItem)localObject).iconUrl)) {
              break label249;
            }
            l((ImageView)this.nFQ.findViewById(a.f.swt), ((ProductSectionItem)localObject).iconUrl);
            break label249;
          }
          this.nFQ.setVisibility(8);
          this.nFP.setVisibility(0);
          ((TextView)this.nFP.findViewById(a.f.sws)).setText(((ProductSectionItem)localObject).name);
          if (TextUtils.isEmpty(((ProductSectionItem)localObject).jumpUrl))
          {
            localObject = new Rect();
            ((Rect)localObject).set(this.nFP.findViewById(a.f.swr).getPaddingLeft(), this.nFP.findViewById(a.f.swr).getPaddingTop(), this.nFP.findViewById(a.f.swr).getPaddingRight(), this.nFP.findViewById(a.f.swr).getPaddingBottom());
            this.nFP.findViewById(a.f.swr).setBackgroundResource(a.e.aXC);
            this.nFP.findViewById(a.f.swr).setPadding(((Rect)localObject).left, ((Rect)localObject).top, ((Rect)localObject).right, ((Rect)localObject).bottom);
            break label249;
          }
          ((TextView)this.nFP.findViewById(a.f.sws)).setTextColor(getResources().getColor(a.c.smy));
          break label249;
        }
        this.nFP.setVisibility(8);
        this.nFQ.setVisibility(8);
        this.nFR.setVisibility(0);
        if (((List)localObject).size() == 2)
        {
          a(this.nFR.findViewById(a.f.sDt), (ProductSectionItem)((List)localObject).get(0));
          a(this.nFR.findViewById(a.f.sDu), (ProductSectionItem)((List)localObject).get(1));
          this.nFR.findViewById(a.f.sDv).setVisibility(8);
          this.nFR.findViewById(a.f.sDw).setVisibility(8);
          break label249;
        }
        if (((List)localObject).size() == 3)
        {
          a(this.nFR.findViewById(a.f.sDt), (ProductSectionItem)((List)localObject).get(0));
          a(this.nFR.findViewById(a.f.sDu), (ProductSectionItem)((List)localObject).get(1));
          a(this.nFR.findViewById(a.f.sDv), (ProductSectionItem)((List)localObject).get(2));
          this.nFR.findViewById(a.f.sDw).setVisibility(8);
          break label249;
        }
        if (((List)localObject).size() < 4) {
          break label249;
        }
        a(this.nFR.findViewById(a.f.sDt), (ProductSectionItem)((List)localObject).get(0));
        a(this.nFR.findViewById(a.f.sDu), (ProductSectionItem)((List)localObject).get(1));
        a(this.nFR.findViewById(a.f.sDv), (ProductSectionItem)((List)localObject).get(2));
        a(this.nFR.findViewById(a.f.sDw), (ProductSectionItem)((List)localObject).get(3));
        break label249;
        this.nFN.setVisibility(8);
        break label350;
        if ((this.nEY != null) && (!TextUtils.isEmpty(this.nEY.nDU)) && (TextUtils.isEmpty(this.nEY.eIH)))
        {
          findViewById(a.f.sLr).setVisibility(8);
          findViewById(a.f.sLq).setVisibility(8);
          localObject = (TextView)findViewById(a.f.svW);
          ((TextView)localObject).setVisibility(0);
          ((TextView)localObject).setGravity(3);
        }
        else if ((this.nEY != null) && (TextUtils.isEmpty(this.nEY.nDU)) && (!TextUtils.isEmpty(this.nEY.eIH)))
        {
          findViewById(a.f.svW).setVisibility(8);
          findViewById(a.f.sLq).setVisibility(8);
          localObject = (TextView)findViewById(a.f.sLr);
          ((TextView)localObject).setVisibility(0);
          ((TextView)localObject).setGravity(3);
        }
      }
    }
  }
  
  private void aWP()
  {
    GMTrace.i(6636798214144L, 49448);
    if ((!this.nFT) && (this.nFU != 0))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(new f(this.jVR, "", this.nFU), 0);
      this.nFT = true;
    }
    GMTrace.o(6636798214144L, 49448);
  }
  
  private void aWQ()
  {
    GMTrace.i(6637335085056L, 49452);
    com.tencent.mm.ui.base.h.a(this.vKB.vKW, a.i.tdb, 0, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6639214133248L, 49466);
        MallOrderDetailInfoUI.this.finish();
        GMTrace.o(6639214133248L, 49466);
      }
    });
    GMTrace.o(6637335085056L, 49452);
  }
  
  private void d(ImageView paramImageView)
  {
    GMTrace.i(6636663996416L, 49447);
    Bitmap localBitmap = com.tencent.mm.compatible.f.a.decodeResource(getResources(), a.h.sQR);
    if (localBitmap != null) {
      paramImageView.setImageBitmap(d.a(localBitmap, false, 96.0F));
    }
    GMTrace.o(6636663996416L, 49447);
  }
  
  private void l(ImageView paramImageView, String paramString)
  {
    GMTrace.i(6636261343232L, 49444);
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString)) || (!e.Xw(paramString)))
    {
      GMTrace.o(6636261343232L, 49444);
      return;
    }
    paramImageView.setImageBitmap(com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.order.c.b(paramString)));
    this.nBR.put(paramString, paramImageView);
    GMTrace.o(6636261343232L, 49444);
  }
  
  protected final void MP()
  {
    GMTrace.i(6635590254592L, 49439);
    int i;
    if (this.nFS)
    {
      com.tencent.mm.plugin.order.a.b.aWE();
      com.tencent.mm.plugin.order.model.j localj = com.tencent.mm.plugin.order.a.b.aWH().Ey(this.jVR);
      if ((localj != null) && (!TextUtils.isEmpty(localj.nFu)) && (com.tencent.mm.plugin.order.c.c.uE(localj.nFu)))
      {
        i = Integer.valueOf(localj.nFu).intValue();
        if (i != 2) {
          break label331;
        }
        oM(a.i.sVB);
      }
    }
    for (;;)
    {
      this.nFL = findViewById(a.f.sDe);
      this.nFM = findViewById(a.f.sDd);
      this.nFQ = findViewById(a.f.sDs);
      this.nFR = findViewById(a.f.sDq);
      this.nFP = findViewById(a.f.sDr);
      this.nFN = findViewById(a.f.sDz);
      this.nFO = findViewById(a.f.sDy);
      this.nFL.setOnClickListener(this.hwh);
      this.nFR.setOnClickListener(this.hwh);
      this.nFQ.setOnClickListener(this.hwh);
      this.nFP.setOnClickListener(this.hwh);
      this.nFN.setOnClickListener(this.hwh);
      findViewById(a.f.sDc).setOnClickListener(this.hwh);
      findViewById(a.f.svW).setOnClickListener(this.hwh);
      findViewById(a.f.sLr).setOnClickListener(this.hwh);
      this.Ev = ((ListView)findViewById(a.f.sDb));
      this.nFK = new a((byte)0);
      this.Ev.setAdapter(this.nFK);
      this.nFK.notifyDataSetChanged();
      this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6651159511040L, 49555);
          paramAnonymousAdapterView = (MallOrderDetailObject.a)MallOrderDetailInfoUI.e(MallOrderDetailInfoUI.this).get(paramAnonymousInt);
          if (!TextUtils.isEmpty(paramAnonymousAdapterView.jumpUrl)) {
            com.tencent.mm.plugin.order.c.c.aq(MallOrderDetailInfoUI.this, paramAnonymousAdapterView.jumpUrl);
          }
          MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, paramAnonymousAdapterView.name);
          GMTrace.o(6651159511040L, 49555);
        }
      });
      aWO();
      GMTrace.o(6635590254592L, 49439);
      return;
      i = -1;
      break;
      label331:
      if (i == 1)
      {
        oM(a.i.sVC);
        continue;
        oM(a.i.sVD);
      }
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6635858690048L, 49441);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.order.model.h))
      {
        paramString = ((com.tencent.mm.plugin.order.model.h)paramk).nEY;
        w.d("MicroMsg.MallOrderDetailInfoUI", "tempObject:" + paramString);
        if (paramString != null)
        {
          this.nEY = paramString;
          aWO();
        }
      }
      GMTrace.o(6635858690048L, 49441);
      return true;
    }
    GMTrace.o(6635858690048L, 49441);
    return false;
  }
  
  public void finish()
  {
    GMTrace.i(6636932431872L, 49449);
    aWP();
    super.finish();
    GMTrace.o(6636932431872L, 49449);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6635321819136L, 49437);
    int i = a.g.sNv;
    GMTrace.o(6635321819136L, 49437);
    return i;
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(6636529778688L, 49446);
    paramString = (ImageView)this.nBR.get(paramString);
    if (paramString != null) {
      paramString.setImageBitmap(paramBitmap);
    }
    GMTrace.o(6636529778688L, 49446);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6635456036864L, 49438);
    super.onCreate(paramBundle);
    paramBundle = com.tencent.mm.wallet_core.a.ad(this);
    if ((paramBundle != null) && ((paramBundle instanceof com.tencent.mm.plugin.order.a.a)))
    {
      paramBundle = this.ui.getString("key_trans_id");
      this.jVR = paramBundle;
      if (paramBundle == null) {
        break label95;
      }
      com.tencent.mm.plugin.order.a.b.aWE();
      if (com.tencent.mm.plugin.order.a.b.aWH().Ex(paramBundle)) {
        break label95;
      }
      this.nFS = false;
      l(new com.tencent.mm.plugin.order.model.h(paramBundle));
    }
    for (;;)
    {
      MP();
      GMTrace.o(6635456036864L, 49438);
      return;
      label95:
      com.tencent.mm.plugin.order.a.b.aWE();
      if (com.tencent.mm.plugin.order.a.b.aWH().Ex(paramBundle))
      {
        this.nFS = true;
        com.tencent.mm.plugin.order.a.b.aWE();
        com.tencent.mm.plugin.order.model.c localc = com.tencent.mm.plugin.order.a.b.aWH();
        if (TextUtils.isEmpty(paramBundle)) {}
        for (paramBundle = null;; paramBundle = com.tencent.mm.plugin.order.model.c.a(localc.Ey(paramBundle)))
        {
          this.nEY = paramBundle;
          if (this.nEY != null) {
            break;
          }
          aWQ();
          break;
          w.v("MicroMsg.MallPayMsgManager", "getMallOrderDetailObjectByMsgId msgId:" + paramBundle);
        }
      }
      w.w("MicroMsg.MallOrderDetailInfoUI", "mOrders info is Illegal!");
      aWQ();
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6637066649600L, 49450);
    aWP();
    super.onDestroy();
    GMTrace.o(6637066649600L, 49450);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6635724472320L, 49440);
    if (paramInt == 4)
    {
      if ((com.tencent.mm.wallet_core.a.ad(this) instanceof com.tencent.mm.plugin.order.a.a)) {
        com.tencent.mm.wallet_core.a.aa(this);
      }
      GMTrace.o(6635724472320L, 49440);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6635724472320L, 49440);
    return bool;
  }
  
  public final void so(int paramInt)
  {
    GMTrace.i(6637200867328L, 49451);
    finish();
    GMTrace.o(6637200867328L, 49451);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(6653038559232L, 49569);
      GMTrace.o(6653038559232L, 49569);
    }
    
    private MallOrderDetailObject.a sp(int paramInt)
    {
      GMTrace.i(6653306994688L, 49571);
      MallOrderDetailObject.a locala = (MallOrderDetailObject.a)MallOrderDetailInfoUI.e(MallOrderDetailInfoUI.this).get(paramInt);
      GMTrace.o(6653306994688L, 49571);
      return locala;
    }
    
    public final int getCount()
    {
      GMTrace.i(6653172776960L, 49570);
      int i = MallOrderDetailInfoUI.e(MallOrderDetailInfoUI.this).size();
      GMTrace.o(6653172776960L, 49570);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6653441212416L, 49572);
      long l = paramInt;
      GMTrace.o(6653441212416L, 49572);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(6653709647872L, 49574);
      paramInt = sp(paramInt).type;
      GMTrace.o(6653709647872L, 49574);
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6653575430144L, 49573);
      MallOrderDetailObject.a locala = sp(paramInt);
      switch (locala.type)
      {
      default: 
        if (paramView == null)
        {
          paramView = View.inflate(MallOrderDetailInfoUI.this, a.g.sNn, null);
          paramViewGroup = new MallOrderDetailInfoUI.b(MallOrderDetailInfoUI.this);
          paramViewGroup.jIB = ((TextView)paramView.findViewById(a.f.sDa));
          paramViewGroup.jJE = ((TextView)paramView.findViewById(a.f.sCZ));
          paramViewGroup.jJF = ((TextView)paramView.findViewById(a.f.sCX));
          paramViewGroup.jcL = paramView.findViewById(a.f.sCW);
          paramView.setTag(paramViewGroup);
          paramViewGroup.jIB.setText(locala.name);
          if (!TextUtils.isEmpty(locala.value)) {
            break label460;
          }
          paramViewGroup.jJE.setVisibility(4);
          label161:
          if (!locala.jxU) {
            break label483;
          }
          paramViewGroup.jJF.setVisibility(0);
        }
        break;
      }
      for (;;)
      {
        if (paramInt + 1 < getCount())
        {
          locala = sp(paramInt + 1);
          MallOrderDetailInfoUI.b(paramViewGroup.jcL, locala);
        }
        GMTrace.o(6653575430144L, 49573);
        return paramView;
        paramView = View.inflate(MallOrderDetailInfoUI.this, a.g.sNp, null);
        paramViewGroup = paramView.findViewById(a.f.sCW);
        MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, (CheckedTextView)paramView.findViewById(a.f.sCY));
        MallOrderDetailInfoUI.b(MallOrderDetailInfoUI.this, (CheckedTextView)paramView.findViewById(a.f.sCV));
        MallOrderDetailInfoUI.f(MallOrderDetailInfoUI.this).setOnClickListener(MallOrderDetailInfoUI.this.nFX);
        MallOrderDetailInfoUI.g(MallOrderDetailInfoUI.this).setOnClickListener(MallOrderDetailInfoUI.this.nFX);
        if (paramInt + 1 < getCount()) {
          MallOrderDetailInfoUI.b(paramViewGroup, sp(paramInt + 1));
        }
        GMTrace.o(6653575430144L, 49573);
        return paramView;
        paramView = View.inflate(MallOrderDetailInfoUI.this, a.g.sNo, null);
        paramViewGroup = (TextView)paramView.findViewById(a.f.sCV);
        View localView = paramView.findViewById(a.f.sCW);
        if (bg.getInt(locala.value, 0) >= 0)
        {
          paramViewGroup.setText(a.i.sVA);
          paramViewGroup.setCompoundDrawablesWithIntrinsicBounds(0, 0, a.h.sQQ, 0);
        }
        for (;;)
        {
          if (paramInt + 1 < getCount()) {
            MallOrderDetailInfoUI.b(localView, sp(paramInt + 1));
          }
          GMTrace.o(6653575430144L, 49573);
          return paramView;
          paramViewGroup.setText(a.i.sVz);
          paramViewGroup.setCompoundDrawablesWithIntrinsicBounds(0, 0, a.h.sQO, 0);
        }
        paramViewGroup = (MallOrderDetailInfoUI.b)paramView.getTag();
        break;
        label460:
        paramViewGroup.jJE.setVisibility(0);
        paramViewGroup.jJE.setText(locala.value);
        break label161;
        label483:
        paramViewGroup.jJF.setVisibility(8);
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(6653843865600L, 49575);
      GMTrace.o(6653843865600L, 49575);
      return 3;
    }
  }
  
  private final class b
  {
    TextView jIB;
    TextView jJE;
    TextView jJF;
    View jcL;
    
    public b()
    {
      GMTrace.i(6655722913792L, 49589);
      GMTrace.o(6655722913792L, 49589);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\MallOrderDetailInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */