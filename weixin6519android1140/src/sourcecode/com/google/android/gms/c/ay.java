package com.google.android.gms.c;

import java.util.List;

public abstract class ay<M extends ay<M>>
  extends be
{
  protected ba awX;
  
  private M lT()
  {
    ay localay = (ay)lU();
    bc.a(this, localay);
    return localay;
  }
  
  public void a(ax paramax)
  {
    if (this.awX == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.awX.size())
      {
        this.awX.cu(i).a(paramax);
        i += 1;
      }
    }
  }
  
  protected final boolean a(aw paramaw, int paramInt)
  {
    int i = paramaw.getPosition();
    if (!paramaw.ci(paramInt)) {
      return false;
    }
    int j = bh.cx(paramInt);
    int k = paramaw.getPosition() - i;
    bg localbg;
    label69:
    Object localObject;
    if (k == 0)
    {
      paramaw = bh.axr;
      localbg = new bg(paramInt, paramaw);
      if (this.awX != null) {
        break label162;
      }
      this.awX = new ba();
      paramaw = null;
      localObject = paramaw;
      if (paramaw == null)
      {
        paramaw = new bb();
        localObject = this.awX;
        paramInt = ((ba)localObject).cv(j);
        if (paramInt < 0) {
          break label205;
        }
        ((ba)localObject).axd[paramInt] = paramaw;
        localObject = paramaw;
      }
    }
    for (;;)
    {
      ((bb)localObject).axg.add(localbg);
      return true;
      localObject = new byte[k];
      int m = paramaw.awN;
      System.arraycopy(paramaw.buffer, i + m, localObject, 0, k);
      paramaw = (aw)localObject;
      break;
      label162:
      paramaw = this.awX;
      paramInt = paramaw.cv(j);
      if ((paramInt < 0) || (paramaw.axd[paramInt] == ba.axa))
      {
        paramaw = null;
        break label69;
      }
      paramaw = paramaw.axd[paramInt];
      break label69;
      label205:
      i = paramInt ^ 0xFFFFFFFF;
      if ((i < ((ba)localObject).mSize) && (localObject.axd[i] == ba.axa))
      {
        ((ba)localObject).axc[i] = j;
        ((ba)localObject).axd[i] = paramaw;
        localObject = paramaw;
      }
      else
      {
        paramInt = i;
        if (((ba)localObject).axb)
        {
          paramInt = i;
          if (((ba)localObject).mSize >= ((ba)localObject).axc.length)
          {
            ((ba)localObject).gc();
            paramInt = ((ba)localObject).cv(j) ^ 0xFFFFFFFF;
          }
        }
        if (((ba)localObject).mSize >= ((ba)localObject).axc.length)
        {
          i = ba.P(((ba)localObject).mSize + 1);
          int[] arrayOfInt = new int[i];
          bb[] arrayOfbb = new bb[i];
          System.arraycopy(((ba)localObject).axc, 0, arrayOfInt, 0, ((ba)localObject).axc.length);
          System.arraycopy(((ba)localObject).axd, 0, arrayOfbb, 0, ((ba)localObject).axd.length);
          ((ba)localObject).axc = arrayOfInt;
          ((ba)localObject).axd = arrayOfbb;
        }
        if (((ba)localObject).mSize - paramInt != 0)
        {
          System.arraycopy(((ba)localObject).axc, paramInt, ((ba)localObject).axc, paramInt + 1, ((ba)localObject).mSize - paramInt);
          System.arraycopy(((ba)localObject).axd, paramInt, ((ba)localObject).axd, paramInt + 1, ((ba)localObject).mSize - paramInt);
        }
        ((ba)localObject).axc[paramInt] = j;
        ((ba)localObject).axd[paramInt] = paramaw;
        ((ba)localObject).mSize += 1;
        localObject = paramaw;
      }
    }
  }
  
  protected final boolean a(M paramM)
  {
    if ((this.awX == null) || (this.awX.isEmpty())) {
      return (paramM.awX == null) || (paramM.awX.isEmpty());
    }
    return this.awX.equals(paramM.awX);
  }
  
  protected final int lS()
  {
    if ((this.awX == null) || (this.awX.isEmpty())) {
      return 0;
    }
    return this.awX.hashCode();
  }
  
  protected int li()
  {
    int j = 0;
    if (this.awX != null)
    {
      int i = 0;
      for (;;)
      {
        k = i;
        if (j >= this.awX.size()) {
          break;
        }
        i += this.awX.cu(j).li();
        j += 1;
      }
    }
    int k = 0;
    return k;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */