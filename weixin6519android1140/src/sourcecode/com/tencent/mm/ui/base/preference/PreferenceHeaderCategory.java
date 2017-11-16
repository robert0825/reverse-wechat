package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.h;

public class PreferenceHeaderCategory
  extends Preference
{
  public PreferenceHeaderCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3211561795584L, 23928);
    GMTrace.o(3211561795584L, 23928);
  }
  
  public PreferenceHeaderCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3211696013312L, 23929);
    setLayoutResource(a.h.gfx);
    GMTrace.o(3211696013312L, 23929);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3211830231040L, 23930);
    paramViewGroup = super.onCreateView(paramViewGroup);
    paramViewGroup.findViewById(16908310).setBackgroundResource(a.f.aXD);
    GMTrace.o(3211830231040L, 23930);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\PreferenceHeaderCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */