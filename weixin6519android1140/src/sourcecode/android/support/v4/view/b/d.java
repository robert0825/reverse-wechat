package android.support.v4.view.b;

import android.view.animation.Interpolator;

abstract class d
  implements Interpolator
{
  private final float[] zJ;
  private final float zK;
  
  public d(float[] paramArrayOfFloat)
  {
    this.zJ = paramArrayOfFloat;
    this.zK = (1.0F / (this.zJ.length - 1));
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    int i = Math.min((int)((this.zJ.length - 1) * paramFloat), this.zJ.length - 2);
    paramFloat = (paramFloat - i * this.zK) / this.zK;
    float f = this.zJ[i];
    return (this.zJ[(i + 1)] - this.zJ[i]) * paramFloat + f;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */