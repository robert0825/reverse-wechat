package com.tencent.mm.ui.tools;

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
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.base.preference.Preference;

public class ZonePreference
  extends Preference
{
  RegionCodeDecoder.Region xjX;
  private CharSequence xjY;
  private TextView xjZ;
  
  public ZonePreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(1999575711744L, 14898);
    GMTrace.o(1999575711744L, 14898);
  }
  
  public ZonePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1999709929472L, 14899);
    GMTrace.o(1999709929472L, 14899);
  }
  
  public ZonePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1999844147200L, 14900);
    setLayoutResource(R.i.cBA);
    GMTrace.o(1999844147200L, 14900);
  }
  
  private void ciz()
  {
    GMTrace.i(2000112582656L, 14902);
    if (this.xjZ == null)
    {
      GMTrace.o(2000112582656L, 14902);
      return;
    }
    if ((this.xjY != null) && (!t.nm(this.xjY.toString()))) {
      this.xjZ.setVisibility(0);
    }
    for (;;)
    {
      this.xjZ.setText(this.xjY);
      GMTrace.o(2000112582656L, 14902);
      return;
      this.xjZ.setVisibility(8);
    }
  }
  
  public final void a(RegionCodeDecoder.Region paramRegion)
  {
    GMTrace.i(16860967862272L, 125624);
    if ((paramRegion == null) || (t.nm(paramRegion.getName())) || (t.nm(paramRegion.getCode())))
    {
      w.e("MicroMsg.ZonePreference", "setZoneItem item = null");
      GMTrace.o(16860967862272L, 125624);
      return;
    }
    setKey(paramRegion.getCode() + paramRegion.isCity());
    this.xjX = paramRegion;
    GMTrace.o(16860967862272L, 125624);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(2000381018112L, 14904);
    super.onBindView(paramView);
    if (this.xjX == null)
    {
      GMTrace.o(2000381018112L, 14904);
      return;
    }
    ((TextView)paramView.findViewById(R.h.coO)).setText(this.xjX.getName());
    this.xjZ = ((TextView)paramView.findViewById(R.h.cge));
    ciz();
    GMTrace.o(2000381018112L, 14904);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(2000246800384L, 14903);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBW, localViewGroup);
    GMTrace.o(2000246800384L, 14903);
    return paramViewGroup;
  }
  
  public final void setSummary(CharSequence paramCharSequence)
  {
    GMTrace.i(1999978364928L, 14901);
    this.xjY = paramCharSequence;
    ciz();
    GMTrace.o(1999978364928L, 14901);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\ZonePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */