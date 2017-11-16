package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class PoiHeaderView
  extends RelativeLayout
{
  private Context context;
  public TextView jPE;
  public String mzu;
  public String mzv;
  public SimpleImageView mzw;
  
  public PoiHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9718168813568L, 72406);
    this.mzu = "";
    this.mzv = "";
    this.context = paramContext;
    paramContext = View.inflate(this.context, R.i.cDr, this);
    this.jPE = ((TextView)paramContext.findViewById(R.h.bGa));
    this.mzw = ((SimpleImageView)paramContext.findViewById(R.h.bFW));
    this.jPE.setVisibility(8);
    this.mzw.setVisibility(8);
    setVisibility(8);
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9661126279168L, 71981);
        Intent localIntent = new Intent();
        if (bg.nm(PoiHeaderView.a(PoiHeaderView.this))) {}
        for (paramAnonymousView = PoiHeaderView.b(PoiHeaderView.this);; paramAnonymousView = PoiHeaderView.a(PoiHeaderView.this))
        {
          w.d("MicroMsg.PoiHeaderView", "click url %s", new Object[] { paramAnonymousView });
          localIntent.putExtra("rawUrl", paramAnonymousView);
          localIntent.putExtra("showShare", false);
          d.a(PoiHeaderView.this.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
          GMTrace.o(9661126279168L, 71981);
          return;
        }
      }
    });
    GMTrace.o(9718168813568L, 72406);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\PoiHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */