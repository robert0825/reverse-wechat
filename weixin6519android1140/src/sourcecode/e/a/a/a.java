package e.a.a;

import java.io.OutputStream;

public final class a
{
  public int yrt;
  public byte[] yuq;
  public int yur = 0;
  public int yus;
  public OutputStream yut;
  
  public final byte Gy(int paramInt)
  {
    int i = this.yrt - paramInt - 1;
    paramInt = i;
    if (i < 0) {
      paramInt = i + this.yur;
    }
    return this.yuq[paramInt];
  }
  
  public final void ctJ()
  {
    ctK();
    this.yut = null;
  }
  
  public final void ctK()
  {
    int i = this.yrt - this.yus;
    if (i == 0) {
      return;
    }
    this.yut.write(this.yuq, this.yus, i);
    if (this.yrt >= this.yur) {
      this.yrt = 0;
    }
    this.yus = this.yrt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\e\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */