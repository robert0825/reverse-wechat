package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;

public class DomainMailListPreference
  extends Preference
{
  private TextView hqi;
  private boolean kEu;
  private String title;
  private String wRT;
  private TextView wRU;
  private TextView wRV;
  private TextView wRW;
  
  public DomainMailListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1756910059520L, 13090);
    init();
    GMTrace.o(1756910059520L, 13090);
  }
  
  public DomainMailListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1757044277248L, 13091);
    init();
    GMTrace.o(1757044277248L, 13091);
  }
  
  private void init()
  {
    GMTrace.i(1757178494976L, 13092);
    this.kEu = false;
    this.title = "";
    this.wRT = "";
    GMTrace.o(1757178494976L, 13092);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(1757446930432L, 13094);
    this.hqi = ((TextView)paramView.findViewById(R.h.title));
    this.wRU = ((TextView)paramView.findViewById(R.h.bAh));
    this.wRV = ((TextView)paramView.findViewById(R.h.caS));
    this.wRW = ((TextView)paramView.findViewById(R.h.cha));
    this.kEu = true;
    if (!this.kEu)
    {
      w.e("MicroMsg.DomainMailPreference", "initView : unbind view");
      super.onBindView(paramView);
      GMTrace.o(1757446930432L, 13094);
      return;
    }
    this.hqi.setText(t.nl(this.title));
    String[] arrayOfString = this.wRT.split(";");
    if (t.nl(this.wRT).length() <= 0)
    {
      this.wRU.setVisibility(8);
      this.wRV.setVisibility(8);
    }
    label192:
    label261:
    label271:
    for (;;)
    {
      this.wRW.setVisibility(8);
      break;
      if (arrayOfString.length > 0)
      {
        this.wRU.setVisibility(0);
        this.wRU.setText(t.nl(arrayOfString[0]));
        if (arrayOfString.length <= 1) {
          break label261;
        }
        this.wRV.setVisibility(0);
        this.wRV.setText(t.nl(arrayOfString[1]));
      }
      for (;;)
      {
        if (arrayOfString.length <= 2) {
          break label271;
        }
        this.wRW.setVisibility(0);
        this.wRW.setText(t.nl(arrayOfString[2]));
        break;
        this.wRU.setVisibility(8);
        break label192;
        this.wRV.setVisibility(8);
      }
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(1757312712704L, 13093);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBF, localViewGroup);
    GMTrace.o(1757312712704L, 13093);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\DomainMailListPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */