package c.t.m.g;

public final class bu
  implements ba, bs
{
  private static bu a = new bu();
  private bs b;
  private ba c;
  private boolean d = false;
  
  public static bu c()
  {
    return a;
  }
  
  public final void a()
  {
    this.b.a();
  }
  
  public final void a(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public final void a(ba paramba)
  {
    this.c = paramba;
  }
  
  public final void a(String paramString)
  {
    this.b.a(paramString);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.c.a(paramString1, paramString2);
  }
  
  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    this.c.a(paramString1, paramArrayOfByte, paramString2);
  }
  
  public final void a_()
  {
    this.c.a_();
  }
  
  public final void b()
  {
    this.b.b();
  }
  
  /* Error */
  public final void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	c/t/m/g/bu:d	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokestatic 58	c/t/m/g/bm:c	()Lc/t/m/g/bm;
    //   18: putfield 30	c/t/m/g/bu:b	Lc/t/m/g/bs;
    //   21: aload_0
    //   22: getfield 30	c/t/m/g/bu:b	Lc/t/m/g/bs;
    //   25: ifnull +22 -> 47
    //   28: aload_0
    //   29: getfield 30	c/t/m/g/bu:b	Lc/t/m/g/bs;
    //   32: aload_0
    //   33: invokeinterface 60 2 0
    //   38: aload_0
    //   39: getfield 30	c/t/m/g/bu:b	Lc/t/m/g/bs;
    //   42: invokeinterface 62 1 0
    //   47: aload_0
    //   48: iconst_1
    //   49: putfield 27	c/t/m/g/bu:d	Z
    //   52: goto -41 -> 11
    //   55: astore_2
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_2
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	bu
    //   6	2	1	bool	boolean
    //   55	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	55	finally
    //   14	47	55	finally
    //   47	52	55	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */