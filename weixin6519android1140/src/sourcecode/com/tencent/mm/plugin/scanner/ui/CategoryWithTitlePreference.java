package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class CategoryWithTitlePreference
  extends Preference
  implements j.a
{
  private Context context;
  private TextView hqi;
  public f htU;
  public ImageView iDp;
  private String iconUrl;
  private int jYc;
  private int osJ;
  private String title;
  
  public CategoryWithTitlePreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(6102477438976L, 45467);
    GMTrace.o(6102477438976L, 45467);
  }
  
  public CategoryWithTitlePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6102611656704L, 45468);
    GMTrace.o(6102611656704L, 45468);
  }
  
  public CategoryWithTitlePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6102745874432L, 45469);
    this.title = "";
    this.jYc = 34;
    this.osJ = 34;
    setLayoutResource(R.i.cBB);
    this.context = paramContext;
    j.a(this);
    GMTrace.o(6102745874432L, 45469);
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6103282745344L, 45473);
    w.d("MicroMsg.scanner.CategoryWithTitlePreference", "get pic:" + paramString + ", iconurl:" + this.iconUrl);
    if ((!bg.nm(paramString)) && (paramString.equals(this.iconUrl)) && (paramBitmap != null) && (!paramBitmap.isRecycled()) && (this.iDp != null)) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6131736903680L, 45685);
          CategoryWithTitlePreference.this.iDp.setImageBitmap(paramBitmap);
          CategoryWithTitlePreference.this.iDp.setVisibility(0);
          if (CategoryWithTitlePreference.this.htU != null) {
            CategoryWithTitlePreference.this.htU.notifyDataSetChanged();
          }
          GMTrace.o(6131736903680L, 45685);
        }
      });
    }
    GMTrace.o(6103282745344L, 45473);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6103148527616L, 45472);
    super.onBindView(paramView);
    this.hqi = ((TextView)paramView.findViewById(16908310));
    this.iDp = ((ImageView)paramView.findViewById(R.h.icon));
    paramView = this.iDp.getLayoutParams();
    paramView.width = BackwardSupportUtil.b.a(this.context, this.jYc / 2);
    paramView.height = BackwardSupportUtil.b.a(this.context, this.osJ / 2);
    this.iDp.setLayoutParams(paramView);
    if ((this.title != null) && (this.title.length() > 0) && (this.hqi != null))
    {
      this.hqi.setVisibility(0);
      this.hqi.setText(this.title);
      w.v("MicroMsg.scanner.CategoryWithTitlePreference", "onBindView title : " + this.hqi.getText());
    }
    if (!bg.nm(this.iconUrl))
    {
      paramView = j.a(new o(this.iconUrl));
      if ((paramView != null) && (!paramView.isRecycled()))
      {
        this.iDp.setImageBitmap(paramView);
        this.iDp.setVisibility(0);
      }
    }
    GMTrace.o(6103148527616L, 45472);
  }
  
  public final void setTitle(int paramInt)
  {
    GMTrace.i(6103014309888L, 45471);
    if (this.hqi != null)
    {
      if (this.context != null) {
        this.title = this.context.getString(paramInt);
      }
      if (bg.nm(this.title)) {
        break label77;
      }
      this.hqi.setVisibility(0);
      this.hqi.setText(this.title);
    }
    for (;;)
    {
      super.setTitle(paramInt);
      GMTrace.o(6103014309888L, 45471);
      return;
      label77:
      this.hqi.setVisibility(8);
    }
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(6102880092160L, 45470);
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
    {
      this.title = paramCharSequence.toString();
      if (this.hqi != null)
      {
        this.hqi.setVisibility(0);
        this.hqi.setText(paramCharSequence);
        w.v("MicroMsg.scanner.CategoryWithTitlePreference", "title : " + this.hqi.getText());
      }
    }
    for (;;)
    {
      super.setTitle(paramCharSequence);
      GMTrace.o(6102880092160L, 45470);
      return;
      if (this.hqi != null) {
        this.hqi.setVisibility(8);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\CategoryWithTitlePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */