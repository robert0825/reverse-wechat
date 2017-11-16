package com.tencent.qqpinyin.voicerecoapi;

public final class c
{
  private int hfd;
  private int ita;
  private TRVADNative xOX = new TRVADNative();
  
  public c()
  {
    this.hfd = 500000;
    this.ita = 10000000;
  }
  
  public c(int paramInt)
  {
    this.hfd = paramInt;
    this.ita = 5000000;
  }
  
  public final void a(short[] paramArrayOfShort, int paramInt, a parama)
  {
    double d1 = 26.0D;
    int i = 0;
    if (paramInt <= 0) {
      return;
    }
    for (;;)
    {
      label59:
      label60:
      try
      {
        switch (this.xOX.mfeSendData(paramArrayOfShort, paramInt))
        {
        case 1: 
          parama.xOY = 0;
        }
      }
      finally {}
      parama.xPc = ((int)d1);
      new StringBuilder("volumn��").append(parama.xPc);
      break;
      parama.xOY = 1;
      break label187;
      parama.xOY = 2;
      break label187;
      parama.xOY = 3;
      int j;
      label187:
      do
      {
        double d2 = j;
        double d3 = Math.sqrt(paramArrayOfShort[i] * paramArrayOfShort[i]);
        j = (int)(d2 + d3 / paramInt);
        i += 1;
        continue;
        if (j > 16383) {
          break label60;
        }
        d1 = 26.0D * ((j - 100.0D) / 32667.0D);
        break label60;
        break;
        j = 0;
      } while (i < paramInt);
      if (j >= 100) {
        break label59;
      }
      d1 = 0.0D;
    }
  }
  
  public final int start()
  {
    int j = this.xOX.mfeInit(this.hfd, this.ita);
    int i = j;
    if (j == 0)
    {
      j = this.xOX.mfeOpen();
      i = j;
      if (j == 0)
      {
        j = this.xOX.mfeEnableNoiseDetection(true);
        i = j;
        if (j == 0) {
          i = this.xOX.mfeStart();
        }
      }
    }
    if (i == 0) {
      return 0;
    }
    return -1;
  }
  
  public final int stop()
  {
    int j = this.xOX.mfeStop();
    int i = j;
    if (j == 0)
    {
      j = this.xOX.mfeClose();
      i = j;
      if (j == 0) {
        i = this.xOX.mfeExit();
      }
    }
    if (i == 0) {
      return 0;
    }
    return -1;
  }
  
  public static final class a
  {
    public int xOY = 0;
    public int xOZ = 256;
    public int xPa = 512;
    private int xPb = 0;
    public int xPc = 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\qqpinyin\voicerecoapi\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */