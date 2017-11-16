package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class BizBindWxaInfoUI
  extends MMActivity
{
  private TextView nLd;
  private ListView nLe;
  private String nLf;
  private String nLg;
  
  public BizBindWxaInfoUI()
  {
    GMTrace.i(6804704591872L, 50699);
    GMTrace.o(6804704591872L, 50699);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6804973027328L, 50701);
    int i = o.g.hDx;
    GMTrace.o(6804973027328L, 50701);
    return i;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6804838809600L, 50700);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      GMTrace.o(6804838809600L, 50700);
      return;
    }
    this.nLf = getIntent().getStringExtra("extra_username");
    this.nLg = getIntent().getStringExtra("extra_appid");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6773700296704L, 50468);
        BizBindWxaInfoUI.this.finish();
        GMTrace.o(6773700296704L, 50468);
        return false;
      }
    });
    oM(o.i.hGV);
    paramBundle = getIntent().getParcelableArrayListExtra("extra_wxa_entry_info_list");
    View localView = getLayoutInflater().inflate(o.g.hDw, null);
    this.nLd = ((TextView)localView.findViewById(o.f.chI));
    TextView localTextView = this.nLd;
    int j = o.i.hGU;
    if (paramBundle != null) {}
    for (int i = paramBundle.size();; i = 0)
    {
      localTextView.setText(getString(j, new Object[] { Integer.valueOf(i) }));
      this.nLe = ((ListView)findViewById(o.f.hBM));
      this.nLe.addHeaderView(localView);
      this.nLe.setAdapter(new a(getLayoutInflater(), paramBundle));
      this.nLe.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6791819689984L, 50603);
          paramAnonymousAdapterView = (WxaAttributes.WxaEntryInfo)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt);
          if (paramAnonymousAdapterView == null)
          {
            GMTrace.o(6791819689984L, 50603);
            return;
          }
          paramAnonymousView = new AppBrandStatObject();
          paramAnonymousView.scene = 1020;
          paramAnonymousView.eAv = BizBindWxaInfoUI.a(BizBindWxaInfoUI.this);
          ((c)h.h(c.class)).a(BizBindWxaInfoUI.this, paramAnonymousAdapterView.username, null, 0, 0, null, paramAnonymousView, BizBindWxaInfoUI.b(BizBindWxaInfoUI.this));
          GMTrace.o(6791819689984L, 50603);
        }
      });
      this.vKB.hqF.setBackgroundResource(o.c.aOY);
      GMTrace.o(6804838809600L, 50700);
      return;
    }
  }
  
  private static final class a
    extends BaseAdapter
  {
    private LayoutInflater CJ;
    private List<WxaAttributes.WxaEntryInfo> iDn;
    
    public a(LayoutInflater paramLayoutInflater, List<WxaAttributes.WxaEntryInfo> paramList)
    {
      GMTrace.i(6729945317376L, 50142);
      this.CJ = paramLayoutInflater;
      this.iDn = new LinkedList();
      if (paramList != null) {
        this.iDn.addAll(paramList);
      }
      GMTrace.o(6729945317376L, 50142);
    }
    
    private WxaAttributes.WxaEntryInfo jG(int paramInt)
    {
      GMTrace.i(19903549538304L, 148293);
      WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)this.iDn.get(paramInt);
      GMTrace.o(19903549538304L, 148293);
      return localWxaEntryInfo;
    }
    
    public final int getCount()
    {
      GMTrace.i(6730079535104L, 50143);
      int i = this.iDn.size();
      GMTrace.o(6730079535104L, 50143);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6730347970560L, 50145);
      long l = paramInt;
      GMTrace.o(6730347970560L, 50145);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6730482188288L, 50146);
      if (paramView == null)
      {
        paramView = this.CJ.inflate(o.g.hCT, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.iDp = ((ImageView)paramView.findViewById(o.f.icon));
        paramViewGroup.hqi = ((TextView)paramView.findViewById(o.f.hCg));
        paramViewGroup.hrj = paramView.findViewById(o.f.divider);
        paramView.setTag(paramViewGroup);
        WxaAttributes.WxaEntryInfo localWxaEntryInfo = jG(paramInt);
        b.CT().a(paramViewGroup.iDp, localWxaEntryInfo.iconUrl, a.CS(), e.grO);
        paramViewGroup.hqi.setText(bg.nl(localWxaEntryInfo.title));
        if (this.iDn != null)
        {
          paramViewGroup = paramViewGroup.hrj;
          if (this.iDn.size() - 1 != paramInt) {
            break label177;
          }
        }
      }
      label177:
      for (paramInt = 8;; paramInt = 0)
      {
        paramViewGroup.setVisibility(paramInt);
        GMTrace.o(6730482188288L, 50146);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
      }
    }
    
    private static final class a
    {
      TextView hqi;
      View hrj;
      ImageView iDp;
      
      public a()
      {
        GMTrace.i(6751688589312L, 50304);
        GMTrace.o(6751688589312L, 50304);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\BizBindWxaInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */