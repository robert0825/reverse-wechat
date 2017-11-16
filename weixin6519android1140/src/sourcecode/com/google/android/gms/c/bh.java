package com.google.android.gms.c;

public final class bh
{
  public static final int[] axk = new int[0];
  public static final long[] axl = new long[0];
  public static final float[] axm = new float[0];
  public static final double[] axn = new double[0];
  public static final boolean[] axo = new boolean[0];
  public static final String[] axp = new String[0];
  public static final byte[][] axq = new byte[0][];
  public static final byte[] axr = new byte[0];
  
  static int an(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int b(aw paramaw, int paramInt)
  {
    int i = 1;
    int j = paramaw.getPosition();
    paramaw.ci(paramInt);
    while (paramaw.lJ() == paramInt)
    {
      paramaw.ci(paramInt);
      i += 1;
    }
    paramaw.cl(j);
    return i;
  }
  
  static int cw(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int cx(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */