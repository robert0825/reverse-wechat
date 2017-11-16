package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class a
  extends Preference
  implements j.a
{
  public f iAA;
  public ImageView iKp;
  String kEt;
  private View mView;
  private TextView oug;
  String ouh;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6141400580096L, 45757);
    this.mView = null;
    this.oug = null;
    this.ouh = null;
    setLayoutResource(R.i.cFj);
    j.a(this);
    GMTrace.o(6141400580096L, 45757);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6141534797824L, 45758);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6141534797824L, 45758);
    return paramView;
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6141803233280L, 45760);
    if ((!bg.nm(paramString)) && (paramString.equals(this.kEt)) && (paramBitmap != null) && (!paramBitmap.isRecycled()) && (this.iKp != null)) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6120328396800L, 45600);
          a.this.iKp.setImageBitmap(paramBitmap);
          a.this.iKp.setVisibility(0);
          if (a.this.iAA != null) {
            a.this.iAA.notifyDataSetChanged();
          }
          GMTrace.o(6120328396800L, 45600);
        }
      });
    }
    GMTrace.o(6141803233280L, 45760);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6141669015552L, 45759);
    super.onBindView(paramView);
    this.oug = ((TextView)paramView.findViewById(R.h.buu));
    this.iKp = ((ImageView)paramView.findViewById(R.h.bcN));
    if (!bg.nm(this.ouh))
    {
      this.oug.setText(this.ouh);
      this.oug.setVisibility(0);
    }
    for (;;)
    {
      if (!bg.nm(this.kEt))
      {
        paramView = j.a(new o(this.kEt));
        if ((paramView != null) && (!paramView.isRecycled()))
        {
          this.iKp.setImageBitmap(paramView);
          this.iKp.setVisibility(0);
        }
      }
      GMTrace.o(6141669015552L, 45759);
      return;
      this.oug.setVisibility(8);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */