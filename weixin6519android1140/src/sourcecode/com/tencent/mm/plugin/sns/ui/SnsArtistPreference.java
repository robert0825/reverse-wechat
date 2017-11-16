package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class SnsArtistPreference
  extends Preference
{
  private MMActivity ezR;
  private String mTitle;
  private String oGP;
  private int oGQ;
  private int oGR;
  private TextView pXW;
  String pXX;
  
  public SnsArtistPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(8549132402688L, 63696);
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(8549132402688L, 63696);
  }
  
  public SnsArtistPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8549266620416L, 63697);
    this.oGP = "";
    this.mTitle = "";
    this.oGQ = -1;
    this.oGR = 8;
    this.pXW = null;
    this.pXX = "";
    this.ezR = ((MMActivity)paramContext);
    setLayoutResource(i.g.cBA);
    setWidgetLayoutResource(i.g.cCj);
    GMTrace.o(8549266620416L, 63697);
  }
  
  public final void bos()
  {
    GMTrace.i(8549400838144L, 63698);
    if ((this.pXW != null) && (this.pXX != null) && (!this.pXX.equals("")) && (this.ezR != null))
    {
      String str = this.ezR.getString(i.j.pii, new Object[] { this.pXX });
      this.pXW.setText(str);
    }
    GMTrace.o(8549400838144L, 63698);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(8549669273600L, 63700);
    super.onBindView(paramView);
    this.pXW = ((TextView)paramView.findViewById(i.f.oZS));
    ((TextView)paramView.findViewById(i.f.bdK)).setText(this.mTitle);
    paramView = (TextView)paramView.findViewById(i.f.cgQ);
    if (paramView != null)
    {
      paramView.setVisibility(this.oGR);
      paramView.setText(this.oGP);
      if (this.oGQ != -1) {
        paramView.setBackgroundDrawable(a.b(this.ezR, this.oGQ));
      }
    }
    bos();
    GMTrace.o(8549669273600L, 63700);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(8549535055872L, 63699);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(i.f.content);
    localViewGroup.removeAllViews();
    this.mTitle = this.ezR.getString(i.j.pij);
    localLayoutInflater.inflate(i.g.peT, localViewGroup);
    GMTrace.o(8549535055872L, 63699);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsArtistPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */