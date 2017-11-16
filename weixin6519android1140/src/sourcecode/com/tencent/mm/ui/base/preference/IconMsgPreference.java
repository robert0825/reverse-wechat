package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class IconMsgPreference
  extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height;
  private String oGP;
  private int oGQ;
  private int oGR;
  private int wjE;
  private int wjF;
  private int wjG;
  private ImageView wjH;
  private ViewGroup wjI;
  private TextView wjJ;
  private String wjK;
  
  public IconMsgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3209951182848L, 23916);
    GMTrace.o(3209951182848L, 23916);
  }
  
  public IconMsgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3210085400576L, 23917);
    this.oGP = "";
    this.oGQ = -1;
    this.oGR = 8;
    this.wjE = 8;
    this.wjF = 0;
    this.wjG = 8;
    this.wjH = null;
    this.wjI = null;
    this.height = -1;
    this.wjK = "";
    this.context = paramContext;
    setLayoutResource(a.h.cBA);
    GMTrace.o(3210085400576L, 23917);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3210353836032L, 23919);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(a.g.bGN);
    if (localObject != null)
    {
      if (this.drawable == null) {
        break label230;
      }
      ((ImageView)localObject).setImageDrawable(this.drawable);
      ((ImageView)localObject).setVisibility(0);
    }
    for (;;)
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
      this.wjH = ((ImageView)paramView.findViewById(a.g.gej));
      this.wjH.setVisibility(this.wjE);
      this.wjI = ((ViewGroup)paramView.findViewById(a.g.gdT));
      this.wjI.setVisibility(this.wjF);
      this.wjJ = ((TextView)paramView.findViewById(16908310));
      paramView = (TextView)paramView.findViewById(a.g.gek);
      if (!bg.nm(this.wjK)) {
        break;
      }
      paramView.setVisibility(8);
      GMTrace.o(3210353836032L, 23919);
      return;
      label230:
      if (this.Jx != 0)
      {
        ((ImageView)localObject).setImageResource(this.Jx);
        ((ImageView)localObject).setVisibility(0);
      }
      else
      {
        ((ImageView)localObject).setVisibility(8);
      }
    }
    paramView.setVisibility(0);
    paramView.setText(this.wjK);
    GMTrace.o(3210353836032L, 23919);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3210219618304L, 23918);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.h.gfy, localViewGroup);
    paramViewGroup.setMinimumHeight(paramViewGroup.getResources().getDimensionPixelSize(a.e.aQM));
    GMTrace.o(3210219618304L, 23918);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\preference\IconMsgPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */