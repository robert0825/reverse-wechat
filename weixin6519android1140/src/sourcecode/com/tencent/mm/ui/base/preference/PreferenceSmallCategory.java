package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.h;

public class PreferenceSmallCategory
  extends PreferenceCategory
{
  public PreferenceSmallCategory(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(3204179820544L, 23873);
    GMTrace.o(3204179820544L, 23873);
  }
  
  public PreferenceSmallCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3204314038272L, 23874);
    GMTrace.o(3204314038272L, 23874);
  }
  
  public PreferenceSmallCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3204448256000L, 23875);
    setLayoutResource(a.h.gfx);
    GMTrace.o(3204448256000L, 23875);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\PreferenceSmallCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */