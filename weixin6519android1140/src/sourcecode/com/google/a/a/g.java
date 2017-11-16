package com.google.a.a;

public final class g
{
  public static final String[] EMPTY_STRING_ARRAY = new String[0];
  public static final int[] aCQ = new int[0];
  public static final long[] aCR = new long[0];
  public static final float[] aCS = new float[0];
  public static final double[] aCT = new double[0];
  public static final boolean[] aCU = new boolean[0];
  public static final byte[][] aCV = new byte[0][];
  public static final byte[] aCW = new byte[0];
  
  public static boolean a(a parama, int paramInt)
  {
    return parama.cC(paramInt);
  }
  
  static int au(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int b(a parama, int paramInt)
  {
    int i = 1;
    int j = parama.getPosition();
    parama.cC(paramInt);
    while (parama.ni() == paramInt)
    {
      parama.cC(paramInt);
      i += 1;
    }
    parama.cF(j);
    return i;
  }
  
  static int cN(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int cO(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */