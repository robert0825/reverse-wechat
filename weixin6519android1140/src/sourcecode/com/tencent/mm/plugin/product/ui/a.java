package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
  extends BaseAdapter
{
  private Context nJa;
  private List<com.tencent.mm.plugin.product.c.a> nJb;
  private List<Boolean> nJc;
  private int nJd;
  
  public a(Context paramContext)
  {
    GMTrace.i(6019665100800L, 44850);
    this.nJd = 1;
    this.nJa = paramContext;
    GMTrace.o(6019665100800L, 44850);
  }
  
  private com.tencent.mm.plugin.product.c.a sw(int paramInt)
  {
    GMTrace.i(6020201971712L, 44854);
    com.tencent.mm.plugin.product.c.a locala = (com.tencent.mm.plugin.product.c.a)this.nJb.get(paramInt);
    GMTrace.o(6020201971712L, 44854);
    return locala;
  }
  
  public final void a(Activity paramActivity, View paramView, int paramInt)
  {
    GMTrace.i(6019933536256L, 44852);
    paramView = (b)paramView.getTag();
    w.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.type" + paramView.type);
    w.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.content" + paramView.nJh);
    switch (paramView.type)
    {
    case 3: 
    default: 
      w.w("MicroMsg.MallCustomActionAdapter", "not support type");
    case 0: 
    case 1: 
    case 2: 
    case 4: 
    case 6: 
      do
      {
        do
        {
          do
          {
            GMTrace.o(6019933536256L, 44852);
            return;
            GMTrace.o(6019933536256L, 44852);
            return;
          } while (!(paramView.nJh instanceof String));
          paramActivity = new Intent();
          paramActivity.putExtra("rawUrl", (String)paramView.nJh);
          paramActivity.putExtra("showShare", false);
          d.b(this.nJa, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramActivity, 10000);
          GMTrace.o(6019933536256L, 44852);
          return;
        } while (!(paramView.nJh instanceof ArrayList));
        paramView = (ArrayList)paramView.nJh;
        localObject = new Intent(paramActivity, MallGalleryUI.class);
        ((Intent)localObject).putExtra("keys_img_urls", paramView);
        paramActivity.startActivity((Intent)localObject);
        GMTrace.o(6019933536256L, 44852);
        return;
      } while (!(paramView.nJh instanceof String));
      Object localObject = (String)paramView.nJh;
      Intent localIntent = new Intent();
      localIntent.putExtra("title", paramView.title);
      localIntent.putExtra("neverGetA8Key", false);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("data", (String)localObject);
      localIntent.putExtra("QRDataFlag", false);
      d.b(paramActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
      GMTrace.o(6019933536256L, 44852);
      return;
    }
    if (((Boolean)this.nJc.get(paramInt)).booleanValue()) {
      this.nJc.set(paramInt, Boolean.valueOf(false));
    }
    for (;;)
    {
      notifyDataSetChanged();
      GMTrace.o(6019933536256L, 44852);
      return;
      this.nJc.set(paramInt, Boolean.valueOf(true));
    }
  }
  
  public final void bc(List<com.tencent.mm.plugin.product.c.a> paramList)
  {
    GMTrace.i(6019799318528L, 44851);
    this.nJb = paramList;
    this.nJd = 0;
    this.nJc = new ArrayList();
    if (this.nJb != null)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.product.c.a locala = (com.tencent.mm.plugin.product.c.a)localIterator.next();
        this.nJc.add(Boolean.valueOf(false));
        localHashSet.add(Integer.valueOf(locala.jib));
      }
      this.nJd = paramList.size();
    }
    if (this.nJd <= 0) {
      this.nJd = 1;
    }
    GMTrace.o(6019799318528L, 44851);
  }
  
  public final int getCount()
  {
    GMTrace.i(6020067753984L, 44853);
    if (this.nJb != null)
    {
      int i = this.nJb.size();
      GMTrace.o(6020067753984L, 44853);
      return i;
    }
    GMTrace.o(6020067753984L, 44853);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6020336189440L, 44855);
    long l = paramInt;
    GMTrace.o(6020336189440L, 44855);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(6020604624896L, 44857);
    paramInt = sw(paramInt).jib;
    GMTrace.o(6020604624896L, 44857);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6020738842624L, 44858);
    com.tencent.mm.plugin.product.c.a locala;
    if (paramView == null)
    {
      paramView = View.inflate(this.nJa, a.g.sNW, null);
      paramViewGroup = new b();
      paramViewGroup.izE = ((TextView)paramView.findViewById(a.f.chT));
      paramViewGroup.nJe = ((TextView)paramView.findViewById(a.f.sHq));
      paramViewGroup.nJf = ((ImageView)paramView.findViewById(a.f.svZ));
      paramViewGroup.nJg = ((HtmlTextView)paramView.findViewById(a.f.suH));
      paramView.setTag(paramViewGroup);
      locala = sw(paramInt);
      if (locala != null)
      {
        paramViewGroup.izE.setText(locala.lPi);
        paramViewGroup.nJe.setText(locala.nIo);
        paramViewGroup.type = locala.jib;
        paramViewGroup.nJh = locala.nIp;
        paramViewGroup.title = locala.lPi;
        switch (locala.jib)
        {
        }
      }
    }
    label307:
    for (;;)
    {
      GMTrace.o(6020738842624L, 44858);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      paramViewGroup.nJf.setVisibility(8);
      continue;
      if (((Boolean)this.nJc.get(paramInt)).booleanValue()) {
        paramViewGroup.nJg.setVisibility(0);
      }
      for (;;)
      {
        if (paramViewGroup.nJg.getText().equals(locala.nIp)) {
          break label307;
        }
        paramViewGroup.nJg.setText(locala.nIp);
        break;
        paramViewGroup.nJg.setVisibility(8);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(6020470407168L, 44856);
    int i = this.nJd;
    GMTrace.o(6020470407168L, 44856);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */