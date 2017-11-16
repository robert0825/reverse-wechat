package com.google.android.gms.tagmanager;

final class ae
  extends ad
{
  public static final Object azp = new Object();
  private static ae azy;
  public j azq;
  private volatile i azr;
  public int azs = 1800000;
  private boolean azt = true;
  private boolean azu = false;
  private boolean azv = true;
  private k azw = new k() {};
  public boolean azx = false;
  public boolean connected = true;
  
  public static ae mN()
  {
    if (azy == null) {
      azy = new ae();
    }
    return azy;
  }
  
  /* Error */
  public final void mM()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/google/android/gms/tagmanager/ae:azu	Z
    //   6: ifne +14 -> 20
    //   9: invokestatic 66	com/google/android/gms/tagmanager/m:ms	()V
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield 42	com/google/android/gms/tagmanager/ae:azt	Z
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: aload_0
    //   21: getfield 68	com/google/android/gms/tagmanager/ae:azr	Lcom/google/android/gms/tagmanager/i;
    //   24: astore_1
    //   25: new 8	com/google/android/gms/tagmanager/ae$2
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 69	com/google/android/gms/tagmanager/ae$2:<init>	(Lcom/google/android/gms/tagmanager/ae;)V
    //   33: pop
    //   34: goto -17 -> 17
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	ae
    //   24	1	1	locali	i
    //   37	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	37	finally
    //   20	34	37	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */