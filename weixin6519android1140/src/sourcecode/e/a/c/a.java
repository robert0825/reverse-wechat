package e.a.c;

public final class a
{
  public short[] yuX;
  public int yuY;
  
  public a(int paramInt)
  {
    this.yuY = paramInt;
    this.yuX = new short[1 << paramInt];
  }
  
  public final int a(b paramb)
  {
    int i = this.yuY;
    int j = 1;
    while (i != 0)
    {
      j = paramb.d(this.yuX, j) + (j << 1);
      i -= 1;
    }
    return j - (1 << this.yuY);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\e\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */