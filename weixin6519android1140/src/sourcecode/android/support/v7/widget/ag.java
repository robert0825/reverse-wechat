package android.support.v7.widget;

final class ag
{
  int Vu = 0;
  int Vv = 0;
  int Vw = Integer.MIN_VALUE;
  int Vx = 0;
  int Vy = 0;
  boolean Vz = false;
  boolean fs = false;
  int vt = Integer.MIN_VALUE;
  
  public final void ac(int paramInt1, int paramInt2)
  {
    this.Vw = paramInt1;
    this.vt = paramInt2;
    this.Vz = true;
    if (this.fs)
    {
      if (paramInt2 != Integer.MIN_VALUE) {
        this.Vu = paramInt2;
      }
      if (paramInt1 != Integer.MIN_VALUE) {
        this.Vv = paramInt1;
      }
    }
    do
    {
      return;
      if (paramInt1 != Integer.MIN_VALUE) {
        this.Vu = paramInt1;
      }
    } while (paramInt2 == Integer.MIN_VALUE);
    this.Vv = paramInt2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */