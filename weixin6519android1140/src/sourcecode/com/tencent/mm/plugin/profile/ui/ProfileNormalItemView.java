package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;
import com.tencent.mm.pluginsdk.ui.ProfileItemView;
import com.tencent.mm.sdk.platformtools.bg;

public class ProfileNormalItemView
  extends ProfileItemView
{
  private TextView izE;
  private String mTitle;
  TextView nJe;
  CharSequence nOP;
  View.OnClickListener nOQ;
  
  public ProfileNormalItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6720550076416L, 50072);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.enW);
    this.mTitle = paramContext.getString(R.n.enX);
    paramContext.recycle();
    GMTrace.o(6720550076416L, 50072);
  }
  
  public ProfileNormalItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6720684294144L, 50073);
    GMTrace.o(6720684294144L, 50073);
  }
  
  public final int aXW()
  {
    GMTrace.i(6720818511872L, 50074);
    int i = R.i.cDN;
    GMTrace.o(6720818511872L, 50074);
    return i;
  }
  
  public final boolean aXX()
  {
    GMTrace.i(6721355382784L, 50078);
    this.izE.setText(this.mTitle);
    if (bg.L(this.nOP))
    {
      setVisibility(8);
      GMTrace.o(6721355382784L, 50078);
      return false;
    }
    setVisibility(0);
    this.nJe.setText(this.nOP);
    setOnClickListener(this.nOQ);
    GMTrace.o(6721355382784L, 50078);
    return true;
  }
  
  public final void init()
  {
    GMTrace.i(6720952729600L, 50075);
    this.izE = ((TextView)findViewById(R.h.brt));
    this.nJe = ((TextView)findViewById(R.h.brs));
    GMTrace.o(6720952729600L, 50075);
  }
  
  public final ProfileNormalItemView sK(int paramInt)
  {
    GMTrace.i(16096329465856L, 119927);
    this.mTitle = getContext().getString(paramInt);
    GMTrace.o(16096329465856L, 119927);
    return this;
  }
  
  public final ProfileNormalItemView sL(int paramInt)
  {
    GMTrace.i(6721086947328L, 50076);
    this.nOP = getContext().getString(paramInt);
    GMTrace.o(6721086947328L, 50076);
    return this;
  }
  
  public final ProfileNormalItemView sM(int paramInt)
  {
    GMTrace.i(6721221165056L, 50077);
    this.nJe.setTextColor(paramInt);
    GMTrace.o(6721221165056L, 50077);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ProfileNormalItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */