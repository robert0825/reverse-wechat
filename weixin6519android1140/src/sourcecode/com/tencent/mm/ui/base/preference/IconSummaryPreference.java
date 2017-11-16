package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class IconSummaryPreference
  extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height;
  private ImageView mRV;
  private String oGP;
  private int oGQ;
  public int oGR;
  private int wjF;
  private int wjG;
  private ViewGroup wjI;
  private Bitmap wjQ;
  private int wjR;
  private int wjS;
  private View wjU;
  RelativeLayout.LayoutParams wjW;
  public int wke;
  public TextView wkf;
  private int wkg;
  
  public IconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3228607447040L, 24055);
    GMTrace.o(3228607447040L, 24055);
  }
  
  public IconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3228741664768L, 24056);
    this.oGP = "";
    this.oGQ = -1;
    this.oGR = 8;
    this.wjQ = null;
    this.wjR = -1;
    this.wjS = 8;
    this.wjF = 0;
    this.wjG = 8;
    this.wke = 8;
    this.mRV = null;
    this.wjI = null;
    this.wjU = null;
    this.wkf = null;
    this.wkg = -1;
    this.height = -1;
    this.context = paramContext;
    setLayoutResource(a.h.cBA);
    GMTrace.o(3228741664768L, 24056);
  }
  
  public final void cS(String paramString, int paramInt)
  {
    GMTrace.i(3229010100224L, 24058);
    this.oGP = paramString;
    this.oGQ = paramInt;
    GMTrace.o(3229010100224L, 24058);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3229412753408L, 24061);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(a.g.bGN);
    if (localObject != null)
    {
      ((ImageView)localObject).setVisibility(8);
      if (this.drawable != null)
      {
        ((ImageView)localObject).setImageDrawable(this.drawable);
        ((ImageView)localObject).setVisibility(0);
      }
    }
    else
    {
      localObject = (LinearLayout)paramView.findViewById(a.g.bNt);
      if (this.height != -1) {
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      }
      localObject = (TextView)paramView.findViewById(a.g.cgQ);
      if (localObject != null)
      {
        ((TextView)localObject).setVisibility(this.oGR);
        ((TextView)localObject).setText(this.oGP);
        if (this.oGQ != -1) {
          ((TextView)localObject).setBackgroundDrawable(a.b(this.context, this.oGQ));
        }
      }
      if (this.mRV == null) {
        this.mRV = ((ImageView)paramView.findViewById(a.g.gdo));
      }
      if (this.wjI == null) {
        this.wjI = ((ViewGroup)paramView.findViewById(a.g.gdT));
      }
      if (this.wjU == null) {
        this.wjU = paramView.findViewById(a.g.bYQ);
      }
      this.wjU.setVisibility(this.wjG);
      if (this.wjQ == null) {
        break label440;
      }
      this.mRV.setImageBitmap(this.wjQ);
    }
    for (;;)
    {
      this.mRV.setVisibility(this.wjS);
      this.wjI.setVisibility(this.wjF);
      if (this.wjW != null) {
        this.mRV.setLayoutParams(this.wjW);
      }
      this.wkf = ((TextView)paramView.findViewById(a.g.gdU));
      if ((this.wkf != null) && (getSummary() != null) && (getSummary().length() > 0))
      {
        this.wkf.setText(getSummary());
        this.wkf.setVisibility(this.wke);
      }
      if ((this.wkf != null) && (this.wkg != -1))
      {
        this.wkf.setCompoundDrawablesWithIntrinsicBounds(this.wkg, 0, 0, 0);
        int i = BackwardSupportUtil.b.a(this.mContext, 2.0F);
        this.wkf.setCompoundDrawablePadding(i);
        this.wkf.setVisibility(this.wke);
      }
      GMTrace.o(3229412753408L, 24061);
      return;
      if (this.jd != null)
      {
        ((ImageView)localObject).setImageDrawable(this.jd);
        ((ImageView)localObject).setVisibility(0);
        break;
      }
      if (this.Jx == 0) {
        break;
      }
      ((ImageView)localObject).setImageResource(this.Jx);
      ((ImageView)localObject).setVisibility(0);
      break;
      label440:
      if (this.wjR != -1) {
        this.mRV.setImageResource(this.wjR);
      }
    }
  }
  
  protected View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3228875882496L, 24057);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.h.gfs, localViewGroup);
    GMTrace.o(3228875882496L, 24057);
    return paramViewGroup;
  }
  
  public final void setSummary(int paramInt)
  {
    GMTrace.i(3229278535680L, 24060);
    super.setSummary(paramInt);
    if ((this.wkf != null) && (getSummary() != null) && (getSummary().length() > 0)) {
      this.wkf.setText(getSummary());
    }
    GMTrace.o(3229278535680L, 24060);
  }
  
  public final void setSummary(CharSequence paramCharSequence)
  {
    GMTrace.i(3229144317952L, 24059);
    super.setSummary(paramCharSequence);
    if ((this.wkf != null) && (getSummary() != null) && (getSummary().length() > 0)) {
      this.wkf.setText(getSummary());
    }
    GMTrace.o(3229144317952L, 24059);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\IconSummaryPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */