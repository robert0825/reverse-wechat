package com.tencent.mm.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.celltextview.CellTextView;

public class MMCellTextView
  extends CellTextView
{
  public static boolean yvN;
  public boolean Dg;
  
  static
  {
    GMTrace.i(21068290981888L, 156971);
    yvN = true;
    GMTrace.o(21068290981888L, 156971);
  }
  
  public MMCellTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(21007893004288L, 156521);
    this.Dg = true;
    GMTrace.o(21007893004288L, 156521);
  }
  
  public MMCellTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(21008027222016L, 156522);
    this.Dg = true;
    GMTrace.o(21008027222016L, 156522);
  }
  
  @SuppressLint({"GetContentDescriptionOverride"})
  public CharSequence getContentDescription()
  {
    GMTrace.i(21008161439744L, 156523);
    w.d("MicroMsg.MMCellTextView", "[isOpen] %s", new Object[] { Boolean.valueOf(false) });
    Object localObject = (AccessibilityManager)getContext().getSystemService("accessibility");
    boolean bool1 = ((AccessibilityManager)localObject).isEnabled();
    boolean bool2 = ((AccessibilityManager)localObject).isTouchExplorationEnabled();
    if ((bool1) && (bool2)) {}
    for (int i = 1; (i != 0) || (b.bPq()); i = 0)
    {
      localObject = super.getContentDescription();
      GMTrace.o(21008161439744L, 156523);
      return (CharSequence)localObject;
    }
    GMTrace.o(21008161439744L, 156523);
    return "";
  }
  
  protected final boolean isOpen()
  {
    GMTrace.i(21008295657472L, 156524);
    if ((yvN) && (this.Dg))
    {
      GMTrace.o(21008295657472L, 156524);
      return true;
    }
    GMTrace.o(21008295657472L, 156524);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\MMCellTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */