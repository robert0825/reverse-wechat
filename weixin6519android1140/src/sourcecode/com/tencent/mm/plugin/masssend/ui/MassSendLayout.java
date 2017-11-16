package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import java.util.ArrayList;
import java.util.List;

public class MassSendLayout
  extends BasePanelKeybordLayout
{
  View iBW;
  
  public MassSendLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11249056219136L, 83812);
    GMTrace.o(11249056219136L, 83812);
  }
  
  public MassSendLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11249190436864L, 83813);
    GMTrace.o(11249190436864L, 83813);
  }
  
  protected final List<View> aMU()
  {
    GMTrace.i(16568373215232L, 123444);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.iBW);
    GMTrace.o(16568373215232L, 123444);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\ui\MassSendLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */