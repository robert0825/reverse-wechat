package android.support.b.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.support.v4.b.a.l;
import android.util.AttributeSet;

@TargetApi(21)
abstract class e
  extends Drawable
  implements l
{
  Drawable lu;
  
  static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      return paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    }
    return paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    if (this.lu != null) {
      a.a(this.lu, paramTheme);
    }
  }
  
  public void clearColorFilter()
  {
    if (this.lu != null)
    {
      this.lu.clearColorFilter();
      return;
    }
    super.clearColorFilter();
  }
  
  public ColorFilter getColorFilter()
  {
    if (this.lu != null) {
      return a.f(this.lu);
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    if (this.lu != null) {
      return this.lu.getCurrent();
    }
    return super.getCurrent();
  }
  
  public int getLayoutDirection()
  {
    if (this.lu != null) {
      a.i(this.lu);
    }
    return 0;
  }
  
  public int getMinimumHeight()
  {
    if (this.lu != null) {
      return this.lu.getMinimumHeight();
    }
    return super.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    if (this.lu != null) {
      return this.lu.getMinimumWidth();
    }
    return super.getMinimumWidth();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    if (this.lu != null) {
      return this.lu.getPadding(paramRect);
    }
    return super.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    if (this.lu != null) {
      return this.lu.getState();
    }
    return super.getState();
  }
  
  public Region getTransparentRegion()
  {
    if (this.lu != null) {
      return this.lu.getTransparentRegion();
    }
    return super.getTransparentRegion();
  }
  
  public boolean isAutoMirrored()
  {
    if (this.lu != null) {
      a.c(this.lu);
    }
    return false;
  }
  
  public void jumpToCurrentState()
  {
    if (this.lu != null) {
      a.b(this.lu);
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.lu != null)
    {
      this.lu.setBounds(paramRect);
      return;
    }
    super.onBoundsChange(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    if (this.lu != null) {
      return this.lu.setLevel(paramInt);
    }
    return super.onLevelChange(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    if (this.lu != null) {
      a.a(this.lu, paramBoolean);
    }
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    if (this.lu != null)
    {
      this.lu.setChangingConfigurations(paramInt);
      return;
    }
    super.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    if (this.lu != null)
    {
      this.lu.setColorFilter(paramInt, paramMode);
      return;
    }
    super.setColorFilter(paramInt, paramMode);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    if (this.lu != null) {
      this.lu.setFilterBitmap(paramBoolean);
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (this.lu != null) {
      a.a(this.lu, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.lu != null) {
      a.a(this.lu, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    if (this.lu != null) {
      return this.lu.setState(paramArrayOfInt);
    }
    return super.setState(paramArrayOfInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */