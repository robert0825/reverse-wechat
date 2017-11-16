package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.wallet_core.model.mall.a;
import com.tencent.mm.plugin.wallet_core.model.mall.b;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import java.util.List;

public class BannerActView
  extends LinearLayout
{
  private List<a> mRs;
  private TextView mRt;
  
  public BannerActView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7991860396032L, 59544);
    this.mRt = ((TextView)LayoutInflater.from(getContext()).inflate(a.g.sLP, this, true).findViewById(a.f.sAL));
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8002195161088L, 59621);
        BannerActView.this.setVisibility(8);
        b.bM(BannerActView.a(BannerActView.this));
        if ((BannerActView.a(BannerActView.this) != null) && (BannerActView.a(BannerActView.this).size() > 0))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", ((a)BannerActView.a(BannerActView.this).get(0)).rjI);
          d.b(BannerActView.this.getContext(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        }
        GMTrace.o(8002195161088L, 59621);
      }
    });
    GMTrace.o(7991860396032L, 59544);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\ui\BannerActView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */