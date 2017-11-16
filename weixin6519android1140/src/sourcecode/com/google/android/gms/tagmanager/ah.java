package com.google.android.gms.tagmanager;

final class ah
  extends Number
  implements Comparable<ah>
{
  private double azB;
  private long azC = 0L;
  boolean azD = true;
  
  private ah(long paramLong) {}
  
  private int a(ah paramah)
  {
    if ((this.azD) && (paramah.azD)) {
      return new Long(this.azC).compareTo(Long.valueOf(paramah.azC));
    }
    return Double.compare(doubleValue(), paramah.doubleValue());
  }
  
  public static ah mO()
  {
    return new ah(0L);
  }
  
  public final byte byteValue()
  {
    return (byte)(int)longValue();
  }
  
  public final double doubleValue()
  {
    if (this.azD) {
      return this.azC;
    }
    return this.azB;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ah)) && (a((ah)paramObject) == 0);
  }
  
  public final float floatValue()
  {
    return (float)doubleValue();
  }
  
  public final int hashCode()
  {
    return new Long(longValue()).hashCode();
  }
  
  public final int intValue()
  {
    return (int)longValue();
  }
  
  public final long longValue()
  {
    if (this.azD) {
      return this.azC;
    }
    return this.azB;
  }
  
  public final short shortValue()
  {
    return (short)(int)longValue();
  }
  
  public final String toString()
  {
    if (this.azD) {
      return Long.toString(this.azC);
    }
    return Double.toString(this.azB);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */