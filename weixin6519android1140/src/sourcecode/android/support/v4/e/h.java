package android.support.v4.e;

public final class h<F, S>
{
  public final F first;
  public final S second;
  
  private h(F paramF, S paramS)
  {
    this.first = paramF;
    this.second = paramS;
  }
  
  private static boolean e(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static <A, B> h<A, B> f(A paramA, B paramB)
  {
    return new h(paramA, paramB);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof h)) {}
    do
    {
      return false;
      paramObject = (h)paramObject;
    } while ((!e(((h)paramObject).first, this.first)) || (!e(((h)paramObject).second, this.second)));
    return true;
  }
  
  public final int hashCode()
  {
    int j = 0;
    int i;
    if (this.first == null)
    {
      i = 0;
      if (this.second != null) {
        break label33;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.first.hashCode();
      break;
      label33:
      j = this.second.hashCode();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\android\support\v4\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */