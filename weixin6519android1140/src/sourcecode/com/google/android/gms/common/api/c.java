package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.c.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.h.a;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.d;
import com.google.android.gms.signin.e;
import com.google.android.gms.signin.e.a;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public abstract interface c
{
  public abstract ConnectionResult a(TimeUnit paramTimeUnit);
  
  public abstract <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT);
  
  public abstract void a(b paramb);
  
  public abstract void a(c paramc);
  
  public abstract void a(String paramString, PrintWriter paramPrintWriter);
  
  public abstract <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT);
  
  public abstract void b(b paramb);
  
  public abstract void b(c paramc);
  
  public abstract void connect();
  
  public abstract void disconnect();
  
  public abstract Looper getLooper();
  
  public abstract boolean isConnected();
  
  public abstract boolean isConnecting();
  
  public static final class a
  {
    private Account afv;
    public final Set<Scope> agQ = new HashSet();
    private int agR;
    private View agS;
    private String agT;
    private String agU;
    private final Map<a<?>, h.a> agV = new m();
    public final Map<a<?>, Object> agW = new m();
    public FragmentActivity agX;
    public int agY = -1;
    public int agZ = -1;
    public c.c aha;
    public Looper ahb;
    public com.google.android.gms.common.b ahc = com.google.android.gms.common.b.jE();
    public a.a<? extends d, e> ahd = com.google.android.gms.signin.b.axT;
    public final ArrayList<c.b> ahe = new ArrayList();
    public final ArrayList<c.c> ahf = new ArrayList();
    private e.a ahg = new e.a();
    public final Context mContext;
    
    public a(Context paramContext)
    {
      this.mContext = paramContext;
      this.ahb = paramContext.getMainLooper();
      this.agT = paramContext.getPackageName();
      this.agU = paramContext.getClass().getName();
    }
    
    public final void a(u paramu, c paramc)
    {
      int i = this.agY;
      Object localObject = this.aha;
      w.j(paramc, "GoogleApiClient instance cannot be null");
      if (paramu.aiO.indexOfKey(i) < 0) {}
      for (boolean bool = true;; bool = false)
      {
        w.b(bool, "Already managing a GoogleApiClient with id " + i);
        localObject = new u.a(paramu, i, paramc, (c.c)localObject);
        paramu.aiO.put(i, localObject);
        if ((paramu.mP) && (!paramu.aiK)) {
          paramc.connect();
        }
        return;
      }
    }
    
    public final h jP()
    {
      return new h(this.afv, this.agQ, this.agV, this.agR, this.agS, this.agT, this.agU, this.ahg.mh());
    }
  }
  
  public static abstract interface b
  {
    public abstract void bU(int paramInt);
    
    public abstract void g(Bundle paramBundle);
  }
  
  public static abstract interface c
  {
    public abstract void a(ConnectionResult paramConnectionResult);
  }
  
  public static abstract interface d
  {
    public abstract a jQ();
    
    public abstract boolean jR();
    
    public static final class a
    {
      public boolean ahj;
      public Set<Scope> ahk;
    }
  }
  
  public static abstract interface e
  {
    public abstract void b(ConnectionResult paramConnectionResult);
    
    public abstract void c(ConnectionResult paramConnectionResult);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */