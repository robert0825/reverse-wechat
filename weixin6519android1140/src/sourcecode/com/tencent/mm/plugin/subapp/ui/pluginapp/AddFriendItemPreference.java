package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.ui.base.preference.Preference;

public class AddFriendItemPreference
  extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height;
  private String oGP;
  private int oGQ;
  int oGR;
  
  public AddFriendItemPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(5791494963200L, 43150);
    GMTrace.o(5791494963200L, 43150);
  }
  
  public AddFriendItemPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5791629180928L, 43151);
    GMTrace.o(5791629180928L, 43151);
  }
  
  public AddFriendItemPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5791763398656L, 43152);
    this.oGP = "";
    this.oGQ = -1;
    this.oGR = 8;
    this.height = -1;
    this.context = paramContext;
    setLayoutResource(R.i.cBA);
    GMTrace.o(5791763398656L, 43152);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(5792031834112L, 43154);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(R.h.bGN);
    if (localObject != null)
    {
      ((ImageView)localObject).setVisibility(8);
      if (this.drawable == null) {
        break label144;
      }
      ((ImageView)localObject).setImageDrawable(this.drawable);
      ((ImageView)localObject).setVisibility(0);
    }
    for (;;)
    {
      localObject = (LinearLayout)paramView.findViewById(R.h.bNt);
      if (this.height != -1) {
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      }
      paramView = (TextView)paramView.findViewById(R.h.cgQ);
      if (paramView != null)
      {
        paramView.setVisibility(this.oGR);
        paramView.setText(this.oGP);
        if (this.oGQ != -1) {
          paramView.setBackgroundDrawable(a.b(this.context, this.oGQ));
        }
      }
      GMTrace.o(5792031834112L, 43154);
      return;
      label144:
      if (this.jd != null)
      {
        ((ImageView)localObject).setImageDrawable(this.jd);
        ((ImageView)localObject).setVisibility(0);
      }
      else if (this.Jx != 0)
      {
        ((ImageView)localObject).setImageResource(this.Jx);
        ((ImageView)localObject).setVisibility(0);
      }
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(5791897616384L, 43153);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.cBC, localViewGroup);
    localViewGroup.setPadding(0, localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), localViewGroup.getPaddingBottom());
    GMTrace.o(5791897616384L, 43153);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\pluginapp\AddFriendItemPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */