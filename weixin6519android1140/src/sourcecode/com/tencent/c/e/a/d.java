package com.tencent.c.e.a;

import android.content.Context;
import com.tencent.c.e.a.a.f;

public final class d
{
  int action;
  Context context;
  int requestType;
  long viR;
  int xRK;
  long xRL;
  
  public d(a parama)
  {
    this.requestType = parama.requestType;
    this.xRK = parama.xRK;
    this.action = parama.action;
    this.xRL = parama.xRL;
    this.viR = parama.viR;
    this.context = parama.context;
  }
  
  public static final class a
  {
    public int action = 0;
    public Context context;
    public int requestType = 0;
    public long viR = 0L;
    public int xRK = 0;
    public long xRL = f.xSd * 12L;
    
    public a(Context paramContext, int paramInt1, int paramInt2)
    {
      if (paramInt1 < 0) {
        throw new IllegalArgumentException("scenes invalid: " + paramInt1);
      }
      this.context = paramContext.getApplicationContext();
      this.xRK = paramInt1;
      this.action = paramInt2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */