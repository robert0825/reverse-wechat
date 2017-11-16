package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.w;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a<O>
{
  private final a<?, O> agM;
  final e<?, O> agN;
  private final c<?> agO;
  final f<?> agP;
  final String mName;
  
  public <C extends b> a(String paramString, a<C, O> parama, c<C> paramc)
  {
    w.j(parama, "Cannot construct an Api with a null ClientBuilder");
    w.j(paramc, "Cannot construct an Api with a null ClientKey");
    this.mName = paramString;
    this.agM = parama;
    this.agN = null;
    this.agO = paramc;
    this.agP = null;
  }
  
  public final a<?, O> jF()
  {
    if (this.agM != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.b(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.agM;
    }
  }
  
  public final c<?> jG()
  {
    if (this.agO != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.b(bool, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
      return this.agO;
    }
  }
  
  public static abstract class a<T extends a.b, O>
  {
    public abstract T a(Context paramContext, Looper paramLooper, h paramh, O paramO, c.b paramb, c.c paramc);
    
    public List<Scope> jH()
    {
      return Collections.emptyList();
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(c.e parame);
    
    public abstract void a(p paramp);
    
    public abstract void a(p paramp, Set<Scope> paramSet);
    
    public abstract void a(String paramString, PrintWriter paramPrintWriter);
    
    public abstract void disconnect();
    
    public abstract boolean isConnected();
    
    public abstract boolean jI();
    
    public abstract boolean jJ();
  }
  
  public static final class c<C extends a.b> {}
  
  public static abstract interface d<T extends IInterface>
  {
    public abstract String jK();
    
    public abstract String jL();
    
    public abstract T jM();
  }
  
  public static abstract interface e<T extends a.d, O>
  {
    public abstract T jN();
    
    public abstract int jO();
  }
  
  public static final class f<C extends a.d> {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */