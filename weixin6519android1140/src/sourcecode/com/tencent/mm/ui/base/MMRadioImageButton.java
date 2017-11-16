package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;

public class MMRadioImageButton
  extends ImageButton
  implements Checkable
{
  private boolean weC;
  private boolean weD;
  private boolean weE;
  private a weF;
  a weG;
  
  public MMRadioImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(3245518880768L, 24181);
    GMTrace.o(3245518880768L, 24181);
  }
  
  public MMRadioImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3245653098496L, 24182);
    this.weD = true;
    GMTrace.o(3245653098496L, 24182);
  }
  
  public boolean isChecked()
  {
    GMTrace.i(3246055751680L, 24185);
    boolean bool = this.weE;
    GMTrace.o(3246055751680L, 24185);
    return bool;
  }
  
  public boolean performClick()
  {
    GMTrace.i(3245921533952L, 24184);
    toggle();
    GMTrace.o(3245921533952L, 24184);
    return false;
  }
  
  public void setChecked(boolean paramBoolean)
  {
    GMTrace.i(3246189969408L, 24186);
    if (this.weE != paramBoolean)
    {
      this.weE = paramBoolean;
      setSelected(this.weE);
      refreshDrawableState();
      if (this.weC)
      {
        GMTrace.o(3246189969408L, 24186);
        return;
      }
      this.weC = true;
      if (this.weF != null) {
        this.weF.a(this);
      }
      if (this.weG != null) {
        this.weG.a(this);
      }
      this.weC = false;
    }
    GMTrace.o(3246189969408L, 24186);
  }
  
  public void toggle()
  {
    GMTrace.i(3245787316224L, 24183);
    if (this.weD)
    {
      if (!isChecked())
      {
        if (!this.weE) {}
        for (boolean bool = true;; bool = false)
        {
          setChecked(bool);
          GMTrace.o(3245787316224L, 24183);
          return;
        }
      }
    }
    else
    {
      if (this.weF != null) {
        this.weF.b(this);
      }
      if (this.weG != null) {
        this.weG.b(this);
      }
    }
    GMTrace.o(3245787316224L, 24183);
  }
  
  public static abstract interface a
  {
    public abstract void a(MMRadioImageButton paramMMRadioImageButton);
    
    public abstract void b(MMRadioImageButton paramMMRadioImageButton);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMRadioImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */