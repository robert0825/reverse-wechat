package com.tencent.mm.plugin.order.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.order.c.b;
import com.tencent.mm.plugin.order.c.c;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import com.tencent.mm.plugin.order.model.ProductSectionItem.Skus;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MallOrderProductListUI
  extends WalletBaseUI
{
  private String gjJ;
  private List<ProductSectionItem> iDn;
  private BaseAdapter jDh;
  private String jVR;
  private ListView nFZ;
  
  public MallOrderProductListUI()
  {
    GMTrace.i(6655991349248L, 49591);
    this.iDn = new ArrayList();
    this.jVR = "";
    this.gjJ = "";
    GMTrace.o(6655991349248L, 49591);
  }
  
  @Deprecated
  protected final void MP()
  {
    GMTrace.i(6656528220160L, 49595);
    oM(a.i.sVG);
    Bundle localBundle = this.ui;
    ArrayList localArrayList = localBundle.getParcelableArrayList("order_product_list");
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      this.iDn.clear();
      this.iDn.addAll(localArrayList);
    }
    this.jVR = localBundle.getString("key_trans_id");
    this.gjJ = localBundle.getString("appname");
    this.nFZ = ((ListView)findViewById(a.f.sDx));
    this.jDh = new a((byte)0);
    this.nFZ.setAdapter(this.jDh);
    this.jDh.notifyDataSetChanged();
    this.nFZ.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6640556310528L, 49476);
        paramAnonymousAdapterView = (ProductSectionItem)MallOrderProductListUI.a(MallOrderProductListUI.this).get(paramAnonymousInt);
        if (paramAnonymousAdapterView != null)
        {
          MallOrderProductListUI.a(MallOrderProductListUI.this, paramAnonymousAdapterView);
          c.a(Boolean.valueOf(false), MallOrderProductListUI.b(MallOrderProductListUI.this), MallOrderProductListUI.c(MallOrderProductListUI.this), paramAnonymousAdapterView.name, paramAnonymousAdapterView.nFG);
        }
        GMTrace.o(6640556310528L, 49476);
      }
    });
    GMTrace.o(6656528220160L, 49595);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6656125566976L, 49592);
    GMTrace.o(6656125566976L, 49592);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6656259784704L, 49593);
    int i = a.g.sNB;
    GMTrace.o(6656259784704L, 49593);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6656394002432L, 49594);
    super.onCreate(paramBundle);
    sv(0);
    MP();
    GMTrace.o(6656394002432L, 49594);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6656662437888L, 49596);
    super.onDestroy();
    GMTrace.o(6656662437888L, 49596);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6656796655616L, 49597);
    if (paramInt == 4)
    {
      if ((com.tencent.mm.wallet_core.a.ad(this) instanceof com.tencent.mm.plugin.order.a.a)) {
        com.tencent.mm.wallet_core.a.aa(this);
      }
      GMTrace.o(6656796655616L, 49597);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6656796655616L, 49597);
    return bool;
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(6660017881088L, 49621);
      GMTrace.o(6660017881088L, 49621);
    }
    
    private ProductSectionItem sq(int paramInt)
    {
      GMTrace.i(6660286316544L, 49623);
      ProductSectionItem localProductSectionItem = (ProductSectionItem)MallOrderProductListUI.a(MallOrderProductListUI.this).get(paramInt);
      GMTrace.o(6660286316544L, 49623);
      return localProductSectionItem;
    }
    
    public final int getCount()
    {
      GMTrace.i(6660152098816L, 49622);
      int i = MallOrderProductListUI.a(MallOrderProductListUI.this).size();
      GMTrace.o(6660152098816L, 49622);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6660420534272L, 49624);
      long l = paramInt;
      GMTrace.o(6660420534272L, 49624);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6660554752000L, 49625);
      ProductSectionItem localProductSectionItem;
      if (paramView == null)
      {
        paramView = View.inflate(MallOrderProductListUI.this, a.g.sNC, null);
        paramViewGroup = new MallOrderProductListUI.b(MallOrderProductListUI.this);
        paramViewGroup.jIy = ((ImageView)paramView.findViewById(a.f.swt));
        paramViewGroup.nGb = ((TextView)paramView.findViewById(a.f.sws));
        paramViewGroup.nGc = ((TextView)paramView.findViewById(a.f.swp));
        paramViewGroup.nGd = ((TextView)paramView.findViewById(a.f.swu));
        paramViewGroup.nGe = ((TextView)paramView.findViewById(a.f.swq));
        paramViewGroup.nGf = ((TextView)paramView.findViewById(a.f.swv));
        paramView.setTag(paramViewGroup);
        localProductSectionItem = sq(paramInt);
        paramViewGroup.jxH = localProductSectionItem.iconUrl;
        if ((TextUtils.isEmpty(paramViewGroup.jxH)) || (!e.Xw(paramViewGroup.jxH))) {
          break label287;
        }
        Bitmap localBitmap = j.a(new b(paramViewGroup.jxH));
        paramViewGroup.jIy.setImageBitmap(localBitmap);
      }
      for (;;)
      {
        paramViewGroup.nGb.setText(localProductSectionItem.name);
        paramViewGroup.nGc.setText(ProductSectionItem.Skus.aZ(localProductSectionItem.nFE));
        paramViewGroup.nGd.setText(localProductSectionItem.nFF);
        paramViewGroup.nGe.setText("+" + localProductSectionItem.count);
        j.a(paramViewGroup);
        paramViewGroup.nGf.setVisibility(8);
        GMTrace.o(6660554752000L, 49625);
        return paramView;
        paramViewGroup = (MallOrderProductListUI.b)paramView.getTag();
        break;
        label287:
        paramViewGroup.jIy.setImageResource(a.h.sQP);
      }
    }
  }
  
  private final class b
    implements j.a
  {
    ImageView jIy;
    String jxH;
    TextView nGb;
    TextView nGc;
    TextView nGd;
    TextView nGe;
    TextView nGf;
    
    public b()
    {
      GMTrace.i(6655320260608L, 49586);
      GMTrace.o(6655320260608L, 49586);
    }
    
    public final void k(String paramString, final Bitmap paramBitmap)
    {
      GMTrace.i(6655454478336L, 49587);
      if ((paramString != null) && (paramString.equals(this.jxH))) {
        this.jIy.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6652635906048L, 49566);
            MallOrderProductListUI.b.this.jIy.setImageBitmap(paramBitmap);
            GMTrace.o(6652635906048L, 49566);
          }
        });
      }
      GMTrace.o(6655454478336L, 49587);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\MallOrderProductListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */