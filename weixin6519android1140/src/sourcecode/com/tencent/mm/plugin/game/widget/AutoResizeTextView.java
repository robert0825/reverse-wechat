package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public class AutoResizeTextView
  extends TextView
{
  private a mef;
  
  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12578751250432L, 93719);
    d(paramAttributeSet);
    GMTrace.o(12578751250432L, 93719);
  }
  
  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12578885468160L, 93720);
    d(paramAttributeSet);
    GMTrace.o(12578885468160L, 93720);
  }
  
  private void d(AttributeSet paramAttributeSet)
  {
    GMTrace.i(12579019685888L, 93721);
    a locala = new a(this);
    if (paramAttributeSet != null)
    {
      int i = (int)locala.mel;
      float f1 = locala.men;
      float f2 = i;
      Context localContext = locala.jU.getContext();
      paramAttributeSet = Resources.getSystem();
      if (localContext != null) {
        paramAttributeSet = localContext.getResources();
      }
      f2 = TypedValue.applyDimension(0, f2, paramAttributeSet.getDisplayMetrics());
      if (f2 != locala.mel)
      {
        locala.mel = f2;
        locala.aGS();
      }
      if (locala.men != f1)
      {
        locala.men = f1;
        locala.aGS();
      }
    }
    if (locala.Aa != true)
    {
      locala.Aa = true;
      locala.jU.addTextChangedListener(locala.WD);
      locala.aGS();
    }
    if (locala.mListeners == null) {
      locala.mListeners = new ArrayList();
    }
    locala.mListeners.add(this);
    this.mef = locala;
    GMTrace.o(12579019685888L, 93721);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12579153903616L, 93722);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.mef != null) {
      this.mef.aGS();
    }
    GMTrace.o(12579153903616L, 93722);
  }
  
  public void setLines(int paramInt)
  {
    GMTrace.i(12579422339072L, 93724);
    super.setLines(paramInt);
    if (this.mef != null) {
      this.mef.oW(paramInt);
    }
    GMTrace.o(12579422339072L, 93724);
  }
  
  public void setMaxLines(int paramInt)
  {
    GMTrace.i(12579556556800L, 93725);
    super.setMaxLines(paramInt);
    if (this.mef != null) {
      this.mef.oW(paramInt);
    }
    GMTrace.o(12579556556800L, 93725);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    GMTrace.i(12579288121344L, 93723);
    super.setTextSize(paramInt, paramFloat);
    if (this.mef != null)
    {
      a locala = this.mef;
      if (!locala.meo)
      {
        Context localContext = locala.jU.getContext();
        Resources localResources = Resources.getSystem();
        if (localContext != null) {
          localResources = localContext.getResources();
        }
        locala.ac(TypedValue.applyDimension(paramInt, paramFloat, localResources.getDisplayMetrics()));
      }
    }
    GMTrace.o(12579288121344L, 93723);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\widget\AutoResizeTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */