package android.support.v7.widget;

import android.content.Context;
import android.view.View;

final class n
  implements q
{
  private static float c(o paramo)
  {
    return ((ae)paramo.getBackground()).Vl;
  }
  
  public final float a(o paramo)
  {
    return c(paramo) * 2.0F;
  }
  
  public final void a(o paramo, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramo.setBackgroundDrawable(new ae(paramInt, paramFloat1));
    paramContext = (View)paramo;
    paramContext.setClipToOutline(true);
    paramContext.setElevation(paramFloat2);
    paramContext = (ae)paramo.getBackground();
    boolean bool1 = paramo.eC();
    boolean bool2 = paramo.eD();
    if ((paramFloat3 != paramContext.Vo) || (paramContext.Vp != bool1) || (paramContext.Vq != bool2))
    {
      paramContext.Vo = paramFloat3;
      paramContext.Vp = bool1;
      paramContext.Vq = bool2;
      paramContext.f(null);
      paramContext.invalidateSelf();
    }
    if (!paramo.eC())
    {
      paramo.d(0, 0, 0, 0);
      return;
    }
    paramFloat1 = ((ae)paramo.getBackground()).Vo;
    paramFloat2 = c(paramo);
    paramInt = (int)Math.ceil(af.b(paramFloat1, paramFloat2, paramo.eD()));
    int i = (int)Math.ceil(af.a(paramFloat1, paramFloat2, paramo.eD()));
    paramo.d(paramInt, i, paramInt, i);
  }
  
  public final float b(o paramo)
  {
    return c(paramo) * 2.0F;
  }
  
  public final void eE() {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */