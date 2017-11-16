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
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class b
  extends Preference
  implements j.a
{
  f htU;
  String kmO;
  private Context mContext;
  private View mView;
  private ImageView ouj;
  
  public b(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6101403697152L, 45459);
    this.mView = null;
    this.ouj = null;
    setLayoutResource(R.i.cDy);
    j.a(this);
    this.mContext = paramContext;
    GMTrace.o(6101403697152L, 45459);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6101537914880L, 45460);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6101537914880L, 45460);
    return paramView;
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(6101806350336L, 45462);
    if ((!bg.nm(paramString)) && (paramString.equals(this.kmO)) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.ouj.setImageBitmap(paramBitmap);
      this.ouj.setBackgroundColor(0);
      if (this.htU != null) {
        this.htU.notifyDataSetChanged();
      }
    }
    GMTrace.o(6101806350336L, 45462);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6101672132608L, 45461);
    super.onBindView(paramView);
    this.ouj = ((ImageView)paramView.findViewById(R.h.bgm));
    if (!bg.nm(this.kmO))
    {
      paramView = j.a(new o(this.kmO));
      if ((paramView != null) && (!paramView.isRecycled()))
      {
        this.ouj.setImageBitmap(paramView);
        this.ouj.setBackgroundColor(0);
        GMTrace.o(6101672132608L, 45461);
        return;
      }
      this.ouj.setBackgroundColor(this.mContext.getResources().getColor(R.e.aNV));
      this.ouj.setImageBitmap(null);
    }
    GMTrace.o(6101672132608L, 45461);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */