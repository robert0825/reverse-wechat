package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;

public final class f
  extends Preference
  implements j.a
{
  public com.tencent.mm.ui.base.preference.f htU;
  String kmO;
  private Context mContext;
  private View mView;
  public ImageView ouj;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6082210562048L, 45316);
    this.mView = null;
    this.ouj = null;
    setLayoutResource(R.i.cDH);
    j.a(this);
    this.mContext = paramContext;
    GMTrace.o(6082210562048L, 45316);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6082344779776L, 45317);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6082344779776L, 45317);
    return paramView;
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6082613215232L, 45319);
    if ((!bg.nm(paramString)) && (paramString.equals(this.kmO)) && (paramBitmap != null) && (!paramBitmap.isRecycled())) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6134152822784L, 45703);
          f.this.ouj.setImageBitmap(paramBitmap);
          f.this.ouj.setBackgroundColor(0);
          if (f.this.htU != null) {
            f.this.htU.notifyDataSetChanged();
          }
          GMTrace.o(6134152822784L, 45703);
        }
      });
    }
    GMTrace.o(6082613215232L, 45319);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6082478997504L, 45318);
    super.onBindView(paramView);
    this.ouj = ((ImageView)paramView.findViewById(R.h.bMJ));
    if (!bg.nm(this.kmO))
    {
      Bitmap localBitmap = j.a(new o(this.kmO));
      if ((localBitmap == null) || (localBitmap.isRecycled())) {
        break label102;
      }
      this.ouj.setImageBitmap(localBitmap);
      this.ouj.setBackgroundColor(0);
    }
    for (;;)
    {
      ((ImageView)paramView.findViewById(R.h.bMH)).setVisibility(0);
      GMTrace.o(6082478997504L, 45318);
      return;
      label102:
      this.ouj.setBackgroundColor(this.mContext.getResources().getColor(R.e.aNV));
      this.ouj.setImageBitmap(null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */