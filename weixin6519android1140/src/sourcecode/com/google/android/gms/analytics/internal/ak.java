package com.google.android.gms.analytics.internal;

public final class ak
  extends ab<b>
{
  public ak(q paramq)
  {
    super(paramq, new a(paramq));
  }
  
  private static final class a
    implements ab.a<b>
  {
    private final q ack;
    private final b afi;
    
    public a(q paramq)
    {
      this.ack = paramq;
      this.afi = new b();
    }
    
    public final void b(String paramString, boolean paramBoolean)
    {
      if ("ga_dryRun".equals(paramString))
      {
        paramString = this.afi;
        if (paramBoolean) {}
        for (int i = 1;; i = 0)
        {
          paramString.abW = i;
          return;
        }
      }
      this.ack.iE().e("Bool xml configuration name not recognized", paramString);
    }
    
    public final void e(String paramString, int paramInt)
    {
      if ("ga_dispatchPeriod".equals(paramString))
      {
        this.afi.abV = paramInt;
        return;
      }
      this.ack.iE().e("Int xml configuration name not recognized", paramString);
    }
    
    public final void g(String paramString1, String paramString2)
    {
      if ("ga_appName".equals(paramString1))
      {
        this.afi.abS = paramString2;
        return;
      }
      if ("ga_appVersion".equals(paramString1))
      {
        this.afi.abT = paramString2;
        return;
      }
      if ("ga_logLevel".equals(paramString1))
      {
        this.afi.abU = paramString2;
        return;
      }
      this.ack.iE().e("String xml configuration name not recognized", paramString1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */