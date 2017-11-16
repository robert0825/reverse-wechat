package android.support.v4.view.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

final class f
  implements Interpolator
{
  private final float[] zL;
  private final float[] zM;
  
  public f(Path paramPath)
  {
    paramPath = new PathMeasure(paramPath, false);
    float f = paramPath.getLength();
    int j = (int)(f / 0.002F) + 1;
    this.zL = new float[j];
    this.zM = new float[j];
    float[] arrayOfFloat = new float[2];
    int i = 0;
    while (i < j)
    {
      paramPath.getPosTan(i * f / (j - 1), arrayOfFloat, null);
      this.zL[i] = arrayOfFloat[0];
      this.zM[i] = arrayOfFloat[1];
      i += 1;
    }
  }
  
  public final float getInterpolation(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    int j = this.zL.length - 1;
    int i = 0;
    while (j - i > 1)
    {
      int k = (i + j) / 2;
      if (paramFloat < this.zL[k]) {
        j = k;
      } else {
        i = k;
      }
    }
    float f = this.zL[j] - this.zL[i];
    if (f == 0.0F) {
      return this.zM[i];
    }
    paramFloat = (paramFloat - this.zL[i]) / f;
    f = this.zM[i];
    return paramFloat * (this.zM[j] - f) + f;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\android\support\v4\view\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */