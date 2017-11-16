package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class RemarkInfoPreference
  extends Preference
{
  private MMActivity ezR;
  private TextView hqi;
  private ImageView iDp;
  private String lRJ;
  private TextView nNG;
  private boolean nOR;
  private String title;
  
  public RemarkInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6789672206336L, 50587);
    this.nOR = false;
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(6789672206336L, 50587);
  }
  
  public RemarkInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6789806424064L, 50588);
    this.nOR = false;
    setLayoutResource(R.i.cBA);
    setWidgetLayoutResource(R.i.cCj);
    GMTrace.o(6789806424064L, 50588);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6790074859520L, 50590);
    this.hqi = ((TextView)paramView.findViewById(R.h.title));
    this.nNG = ((TextView)paramView.findViewById(R.h.summary));
    this.iDp = ((ImageView)paramView.findViewById(R.h.bGN));
    if (!this.nOR) {
      this.iDp.setVisibility(8);
    }
    for (;;)
    {
      if (this.hqi != null) {
        this.hqi.setText(this.title);
      }
      if (this.nNG != null) {
        this.nNG.setText(this.lRJ);
      }
      super.onBindView(paramView);
      GMTrace.o(6790074859520L, 50590);
      return;
      this.iDp.setVisibility(0);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6789940641792L, 50589);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBS, localViewGroup);
    GMTrace.o(6789940641792L, 50589);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\RemarkInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */