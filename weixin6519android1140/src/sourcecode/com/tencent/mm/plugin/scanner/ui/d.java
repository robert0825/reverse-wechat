package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.io.IOException;

public final class d
  extends Preference
  implements j.a
{
  private f htU;
  private TextView izE;
  private ImageView jXQ;
  String lNF;
  private View mView;
  String onj;
  private TextView ovy;
  String ovz;
  
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6066507087872L, 45199);
    this.mView = null;
    this.jXQ = null;
    this.izE = null;
    this.ovy = null;
    setLayoutResource(R.i.cDA);
    j.a(this);
    GMTrace.o(6066507087872L, 45199);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6066641305600L, 45200);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6066641305600L, 45200);
    return paramView;
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(6066909741056L, 45202);
    if ((!bg.nm(paramString)) && (paramString.equals(this.ovz)) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.jXQ.setImageBitmap(paramBitmap);
      this.jXQ.setBackgroundColor(0);
      if (this.htU != null) {
        this.htU.notifyDataSetChanged();
      }
    }
    GMTrace.o(6066909741056L, 45202);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6066775523328L, 45201);
    super.onBindView(paramView);
    this.jXQ = ((ImageView)paramView.findViewById(R.h.bpK));
    this.izE = ((TextView)paramView.findViewById(R.h.bpN));
    this.ovy = ((TextView)paramView.findViewById(R.h.bpM));
    Object localObject;
    if (!bg.nm(this.ovz))
    {
      localObject = j.a(new o(this.ovz));
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      {
        this.jXQ.setImageBitmap((Bitmap)localObject);
        this.jXQ.setBackgroundColor(0);
        if (bg.nm(this.onj)) {
          break label300;
        }
        this.izE.setText(h.b(this.mContext, this.onj, this.izE.getTextSize()));
        label142:
        if (bg.nm(this.lNF)) {
          break label312;
        }
        this.ovy.setText(this.lNF);
      }
    }
    for (;;)
    {
      if ((bg.nm(this.onj)) && (bg.nm(this.ovz)))
      {
        paramView = (LinearLayout)paramView.findViewById(R.h.bpL);
        localObject = paramView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = this.mContext.getResources().getDimensionPixelSize(R.f.aSD);
        paramView.setPadding(BackwardSupportUtil.b.a(this.mContext, 9.0F), 0, 0, 0);
        paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      GMTrace.o(6066775523328L, 45201);
      return;
      try
      {
        localObject = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
        this.jXQ.setImageBitmap((Bitmap)localObject);
      }
      catch (IOException localIOException)
      {
        this.jXQ.setImageBitmap(null);
      }
      break;
      this.jXQ.setVisibility(8);
      break;
      label300:
      this.izE.setVisibility(8);
      break label142;
      label312:
      this.ovy.setVisibility(8);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */