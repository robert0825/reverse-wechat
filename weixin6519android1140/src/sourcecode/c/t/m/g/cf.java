package c.t.m.g;

public final class cf
{
  private static a a = null;
  
  public static void a(a parama)
  {
    if (parama == null) {
      a("CC_Log", "set log callback null!");
    }
    a = parama;
  }
  
  public static final void a(String paramString1, String paramString2)
  {
    if (a()) {
      a.onLog(3, paramString1, paramString2);
    }
  }
  
  public static final void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a()) {
      a.onLog(6, paramString1, paramString2, paramThrowable);
    }
  }
  
  private static boolean a()
  {
    return a != null;
  }
  
  public static final void b(String paramString1, String paramString2)
  {
    if (a()) {
      a.onLog(6, paramString1, paramString2);
    }
  }
  
  public static abstract interface a
  {
    public abstract void onLog(int paramInt, String paramString1, String paramString2);
    
    public abstract void onLog(int paramInt, String paramString1, String paramString2, Throwable paramThrowable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */