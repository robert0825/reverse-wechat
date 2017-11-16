package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class ap
{
  public final TypedArray Yu;
  private final Context mContext;
  
  private ap(Context paramContext, TypedArray paramTypedArray)
  {
    this.mContext = paramContext;
    this.Yu = paramTypedArray;
  }
  
  public static ap a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    return new ap(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt));
  }
  
  public static ap a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt)
  {
    return new ap(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt, 0));
  }
  
  public final Drawable bG(int paramInt)
  {
    if (this.Yu.hasValue(paramInt))
    {
      paramInt = this.Yu.getResourceId(paramInt, 0);
      if (paramInt != 0) {
        return h.ex().a(this.mContext, paramInt, true);
      }
    }
    return null;
  }
  
  public final int bH(int paramInt)
  {
    return this.Yu.getColor(paramInt, -1);
  }
  
  public final boolean getBoolean(int paramInt, boolean paramBoolean)
  {
    return this.Yu.getBoolean(paramInt, paramBoolean);
  }
  
  public final int getDimensionPixelOffset(int paramInt1, int paramInt2)
  {
    return this.Yu.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public final int getDimensionPixelSize(int paramInt1, int paramInt2)
  {
    return this.Yu.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public final Drawable getDrawable(int paramInt)
  {
    if (this.Yu.hasValue(paramInt))
    {
      int i = this.Yu.getResourceId(paramInt, 0);
      if (i != 0) {
        return h.ex().a(this.mContext, i, false);
      }
    }
    return this.Yu.getDrawable(paramInt);
  }
  
  public final int getInt(int paramInt1, int paramInt2)
  {
    return this.Yu.getInt(paramInt1, paramInt2);
  }
  
  public final int getLayoutDimension(int paramInt1, int paramInt2)
  {
    return this.Yu.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public final int getResourceId(int paramInt1, int paramInt2)
  {
    return this.Yu.getResourceId(paramInt1, paramInt2);
  }
  
  public final CharSequence getText(int paramInt)
  {
    return this.Yu.getText(paramInt);
  }
  
  public final boolean hasValue(int paramInt)
  {
    return this.Yu.hasValue(paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */