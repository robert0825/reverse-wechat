package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.w;

public final class o
{
  h.d imy;
  int jsh;
  int jsi;
  int tHX;
  int tHY;
  boolean tHn;
  int videoHeight;
  int videoWidth;
  
  public o()
  {
    GMTrace.i(17476490362880L, 130210);
    this.imy = h.d.ttx;
    GMTrace.o(17476490362880L, 130210);
  }
  
  public final void a(h.d paramd)
  {
    GMTrace.i(17476758798336L, 130212);
    w.i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", new Object[] { this.imy, paramd });
    this.imy = paramd;
    reset();
    GMTrace.o(17476758798336L, 130212);
  }
  
  final void reset()
  {
    GMTrace.i(17476624580608L, 130211);
    this.jsi = 0;
    this.jsh = 0;
    this.videoHeight = 0;
    this.videoWidth = 0;
    this.tHY = 0;
    this.tHX = 0;
    GMTrace.o(17476624580608L, 130211);
  }
  
  final boolean s(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(17476893016064L, 130213);
    if ((this.jsh == paramInt1) && (this.jsi == paramInt2) && (this.videoWidth == paramInt3) && (this.videoHeight == paramInt4))
    {
      GMTrace.o(17476893016064L, 130213);
      return true;
    }
    this.jsh = paramInt1;
    this.jsi = paramInt2;
    this.videoWidth = paramInt3;
    this.videoHeight = paramInt4;
    float f1 = this.videoWidth * 1.0F / this.videoHeight;
    float f2 = this.jsh * 1.0F / this.jsi;
    if (this.imy != h.d.ttx) {
      if (this.imy == h.d.ttz) {
        if (this.jsh < this.jsi)
        {
          this.tHY = ((int)(this.jsh / f1));
          this.tHX = this.jsh;
          if (this.tHY > this.jsi)
          {
            this.tHX = ((int)(this.jsi * f1));
            this.tHY = this.jsi;
          }
        }
      }
    }
    for (;;)
    {
      w.d("MicroMsg.ViewSizeCache", "screen[%d, %d], video[%d, %d], measure[%d, %d] scale[%f, %f]", new Object[] { Integer.valueOf(this.jsh), Integer.valueOf(this.jsi), Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(this.tHX), Integer.valueOf(this.tHY), Float.valueOf(f2), Float.valueOf(f1) });
      GMTrace.o(17476893016064L, 130213);
      return false;
      this.tHX = ((int)(this.jsi * f1));
      this.tHY = this.jsi;
      if (this.tHX > this.jsh)
      {
        this.tHY = ((int)(this.jsh / f1));
        this.tHX = this.jsh;
        continue;
        if (this.imy == h.d.tty)
        {
          this.tHY = this.jsi;
          this.tHX = this.jsh;
        }
        else if (this.imy == h.d.ttA)
        {
          if (this.jsh > this.jsi)
          {
            this.tHY = ((int)(this.jsh / f1));
            this.tHX = this.jsh;
            if (this.tHY < this.jsi)
            {
              this.tHX = ((int)(this.jsi * f1));
              this.tHY = this.jsi;
            }
          }
          else
          {
            this.tHX = ((int)(this.jsi * f1));
            this.tHY = this.jsi;
            if (this.tHX < this.jsh)
            {
              this.tHY = ((int)(this.jsh / f1));
              this.tHX = this.jsh;
            }
          }
        }
        else if (!this.tHn)
        {
          if (this.jsh < this.jsi)
          {
            this.tHY = ((int)(this.jsh / f1));
            this.tHX = this.jsh;
          }
          else
          {
            this.tHX = ((int)(this.jsi * f1));
            this.tHY = this.jsi;
          }
        }
        else if (Math.abs(f1 - f2) > 0.05D)
        {
          if (this.jsh < this.jsi)
          {
            this.tHY = ((int)(this.jsh / f1));
            this.tHX = this.jsh;
          }
          else
          {
            this.tHX = ((int)(this.jsi * f1));
            this.tHY = this.jsi;
          }
        }
        else if (this.jsh > this.jsi)
        {
          this.tHY = ((int)(this.jsh / f1));
          this.tHX = this.jsh;
        }
        else
        {
          this.tHX = ((int)(this.jsi * f1));
          this.tHY = this.jsi;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */