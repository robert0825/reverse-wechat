package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class VoiceHeaderPreference
  extends Preference
{
  private MMActivity ezR;
  private TextView hqi;
  private TextView hvi;
  private ImageView iDp;
  private int kXa;
  private Button kXb;
  private View kXc;
  private View.OnClickListener kXd;
  private String kXe;
  private String kXf;
  private String mTitle;
  
  public VoiceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(12515937353728L, 93251);
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(12515937353728L, 93251);
  }
  
  public VoiceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12516071571456L, 93252);
    this.mTitle = "";
    this.kXa = 255;
    this.kXd = null;
    this.kXe = "";
    this.kXf = "";
    this.ezR = ((MMActivity)paramContext);
    setLayoutResource(R.i.cHy);
    GMTrace.o(12516071571456L, 93252);
  }
  
  public final void a(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(12516340006912L, 93254);
    this.kXd = paramOnClickListener;
    if ((this.kXb == null) || (this.kXc == null))
    {
      GMTrace.o(12516340006912L, 93254);
      return;
    }
    if ((this.kXb != null) && (this.kXd != null))
    {
      this.kXb.setOnClickListener(paramOnClickListener);
      this.kXb.setVisibility(0);
      this.kXc.setVisibility(0);
      GMTrace.o(12516340006912L, 93254);
      return;
    }
    this.kXb.setVisibility(8);
    this.kXc.setVisibility(8);
    GMTrace.o(12516340006912L, 93254);
  }
  
  public final void cf(String paramString1, String paramString2)
  {
    GMTrace.i(12516205789184L, 93253);
    this.kXe = paramString1;
    this.kXf = paramString2;
    if (this.hqi != null)
    {
      if (bg.nm(this.kXe)) {
        break label99;
      }
      this.hqi.setText(this.kXe);
      this.hqi.setVisibility(0);
    }
    while (this.hvi != null) {
      if (!bg.nm(this.kXf))
      {
        this.hvi.setText(this.kXf);
        this.hvi.setVisibility(0);
        GMTrace.o(12516205789184L, 93253);
        return;
        label99:
        this.hqi.setVisibility(8);
      }
      else
      {
        this.hvi.setVisibility(8);
      }
    }
    GMTrace.o(12516205789184L, 93253);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(12516474224640L, 93255);
    super.onBindView(paramView);
    this.iDp = ((ImageView)paramView.findViewById(R.h.clC));
    this.hqi = ((TextView)paramView.findViewById(R.h.clD));
    this.hvi = ((TextView)paramView.findViewById(R.h.clF));
    this.kXb = ((Button)paramView.findViewById(R.h.bYP));
    this.kXc = paramView.findViewById(R.h.biH);
    if (!bg.nm(this.kXe))
    {
      this.hqi.setText(this.kXe);
      this.hqi.setVisibility(0);
      if (bg.nm(this.kXf)) {
        break label200;
      }
      this.hvi.setText(this.kXf);
      this.hvi.setVisibility(0);
    }
    for (;;)
    {
      if ((this.kXb == null) || (this.kXd == null)) {
        break label212;
      }
      this.kXb.setOnClickListener(this.kXd);
      this.kXb.setVisibility(0);
      this.kXc.setVisibility(0);
      GMTrace.o(12516474224640L, 93255);
      return;
      this.hqi.setVisibility(8);
      break;
      label200:
      this.hvi.setVisibility(8);
    }
    label212:
    this.kXb.setVisibility(8);
    this.kXc.setVisibility(8);
    GMTrace.o(12516474224640L, 93255);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoiceHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */