package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.r;

public class HelperHeaderPreference
  extends Preference
{
  private a tCP;
  
  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1053340729344L, 7848);
    this.tCP = new a();
    GMTrace.o(1053340729344L, 7848);
  }
  
  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1053474947072L, 7849);
    this.tCP = new a();
    GMTrace.o(1053474947072L, 7849);
  }
  
  public final void af(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(1053743382528L, 7851);
    this.tCP.eQu = paramString1;
    this.tCP.fMz = paramString2;
    this.tCP.tCQ = paramString3;
    super.callChangeListener(null);
    GMTrace.o(1053743382528L, 7851);
  }
  
  public final void lu(int paramInt)
  {
    GMTrace.i(1053877600256L, 7852);
    this.tCP.status = paramInt;
    super.callChangeListener(null);
    GMTrace.o(1053877600256L, 7852);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(1053609164800L, 7850);
    ImageView localImageView = (ImageView)paramView.findViewById(R.h.bfq);
    TextView localTextView1 = (TextView)paramView.findViewById(R.h.cfT);
    TextView localTextView2 = (TextView)paramView.findViewById(R.h.bQX);
    TextView localTextView3 = (TextView)paramView.findViewById(R.h.bGf);
    if (localImageView != null) {
      a.b.a(localImageView, this.tCP.eQu);
    }
    if (localTextView1 != null) {
      switch (this.tCP.status)
      {
      }
    }
    for (;;)
    {
      if (localTextView2 != null) {
        localTextView2.setText(this.tCP.fMz);
      }
      if (localTextView3 != null) {
        localTextView3.setText(this.tCP.tCQ);
      }
      super.onBindView(paramView);
      GMTrace.o(1053609164800L, 7850);
      return;
      localTextView1.setVisibility(0);
      localTextView1.setTextColor(r.fF(this.mContext));
      localTextView1.setText(R.l.dZX);
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(R.g.baF, 0, 0, 0);
      continue;
      localTextView1.setVisibility(0);
      localTextView1.setTextColor(r.fG(this.mContext));
      localTextView1.setText(R.l.eae);
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(R.g.baE, 0, 0, 0);
      continue;
      localTextView1.setVisibility(8);
    }
  }
  
  public static final class a
  {
    public String eQu;
    public String fMz;
    public int status;
    public String tCQ;
    
    public a()
    {
      GMTrace.i(1054011817984L, 7853);
      GMTrace.o(1054011817984L, 7853);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\HelperHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */