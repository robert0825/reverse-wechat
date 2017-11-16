package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.s;

public class AccountInfoPreference
  extends Preference
{
  public SpannableString tCq;
  public String tCr;
  private int tCs;
  public View.OnClickListener tCt;
  public String userName;
  
  public AccountInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1048777326592L, 7814);
    GMTrace.o(1048777326592L, 7814);
  }
  
  public AccountInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1048911544320L, 7815);
    this.tCt = null;
    GMTrace.o(1048911544320L, 7815);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(1049045762048L, 7816);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(R.h.bfq);
    if ((this.userName != null) && (localObject != null)) {
      a.b.a((ImageView)localObject, this.userName);
    }
    NoMeasuredTextView localNoMeasuredTextView = (NoMeasuredTextView)paramView.findViewById(R.h.bQV);
    if ((this.userName != null) && (localNoMeasuredTextView != null))
    {
      localNoMeasuredTextView.whw = true;
      localNoMeasuredTextView.J(a.V(this.mContext, R.f.aQF));
      localNoMeasuredTextView.setTextColor(a.U(this.mContext, R.e.aOE));
      if (this.tCq == null)
      {
        localObject = this.userName;
        localNoMeasuredTextView.setText((CharSequence)localObject);
      }
    }
    else
    {
      localObject = (TextView)paramView.findViewById(R.h.cjI);
      if ((this.tCr == null) || (localObject == null)) {
        break label260;
      }
      ((TextView)localObject).setText(paramView.getResources().getString(R.l.cRJ, new Object[] { this.tCr }));
      label164:
      localObject = (TextView)paramView.findViewById(R.h.bYQ);
      if (localObject != null)
      {
        if (this.tCs <= 99) {
          break label273;
        }
        ((TextView)localObject).setText(this.mContext.getString(R.l.edI));
        ((TextView)localObject).setBackgroundResource(s.fH(this.mContext));
        ((TextView)localObject).setVisibility(0);
      }
    }
    for (;;)
    {
      if (this.tCt != null) {
        ((ImageView)paramView.findViewById(R.h.bcD)).setOnClickListener(this.tCt);
      }
      GMTrace.o(1049045762048L, 7816);
      return;
      localObject = this.tCq;
      break;
      label260:
      if (localObject == null) {
        break label164;
      }
      ((TextView)localObject).setVisibility(8);
      break label164;
      label273:
      if (this.tCs > 0)
      {
        ((TextView)localObject).setText(this.tCs);
        ((TextView)localObject).setVisibility(0);
      }
      else
      {
        ((TextView)localObject).setVisibility(8);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\AccountInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */