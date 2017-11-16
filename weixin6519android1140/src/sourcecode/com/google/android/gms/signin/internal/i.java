package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.api.c.d;
import com.google.android.gms.common.api.c.d.a;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.k.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.d;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class i
  extends k<f>
  implements d
{
  private final h ahU;
  private final com.google.android.gms.signin.e akM;
  private Integer akN;
  private final boolean axK;
  private final ExecutorService axL;
  
  public i(Context paramContext, Looper paramLooper, boolean paramBoolean, h paramh, c.b paramb, c.c paramc, ExecutorService paramExecutorService)
  {
    super(paramContext, paramLooper, 44, paramh, paramb, paramc);
    this.axK = paramBoolean;
    this.ahU = paramh;
    this.akM = paramh.akM;
    this.akN = paramh.akN;
    this.axL = paramExecutorService;
  }
  
  public final void a(p paramp, Set<Scope> paramSet, e parame)
  {
    w.j(parame, "Expecting a valid ISignInCallbacks");
    try
    {
      ((f)kw()).a(new AuthAccountRequest(paramp, paramSet), parame);
      return;
    }
    catch (RemoteException paramp)
    {
      try
      {
        parame.a(new ConnectionResult(8, null), new AuthAccountResult());
        return;
      }
      catch (RemoteException paramp)
      {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
      }
    }
  }
  
  public final void a(p paramp, boolean paramBoolean)
  {
    try
    {
      ((f)kw()).a(paramp, this.akN.intValue(), paramBoolean);
      return;
    }
    catch (RemoteException paramp) {}
  }
  
  public final void a(t paramt)
  {
    w.j(paramt, "Expecting a valid IResolveAccountCallbacks");
    try
    {
      Object localObject = this.ahU;
      if (((h)localObject).afv != null) {}
      for (localObject = ((h)localObject).afv;; localObject = new Account("<<default account>>", "com.google"))
      {
        ((f)kw()).a(new ResolveAccountRequest((Account)localObject, this.akN.intValue()), paramt);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        paramt.a(new ResolveAccountResponse());
        return;
      }
      catch (RemoteException paramt)
      {
        Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
      }
    }
  }
  
  public final void connect()
  {
    a(new k.f(this));
  }
  
  public final boolean jI()
  {
    return this.axK;
  }
  
  protected final String jK()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  protected final String jL()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  protected final Bundle kv()
  {
    Object localObject = this.akM;
    Integer localInteger = this.ahU.akN;
    ExecutorService localExecutorService = this.axL;
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((com.google.android.gms.signin.e)localObject).ayb);
    localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((com.google.android.gms.signin.e)localObject).ayc);
    localBundle.putString("com.google.android.gms.signin.internal.serverClientId", ((com.google.android.gms.signin.e)localObject).agt);
    if (((com.google.android.gms.signin.e)localObject).ayd != null) {
      localBundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper(new a((com.google.android.gms.signin.e)localObject, localExecutorService).asBinder()));
    }
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    localObject = this.ahU.agT;
    if (!this.mContext.getPackageName().equals(localObject)) {
      localBundle.putString("com.google.android.gms.signin.internal.realClientPackageName", this.ahU.agT);
    }
    return localBundle;
  }
  
  public final void mg()
  {
    try
    {
      ((f)kw()).cy(this.akN.intValue());
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  private static final class a
    extends d.a
  {
    private final com.google.android.gms.signin.e akM;
    private final ExecutorService axL;
    
    public a(com.google.android.gms.signin.e parame, ExecutorService paramExecutorService)
    {
      this.akM = parame;
      this.axL = paramExecutorService;
    }
    
    public final void a(final String paramString1, final String paramString2, final f paramf)
    {
      this.axL.submit(new Runnable()
      {
        public final void run()
        {
          try
          {
            boolean bool = i.a.a(i.a.this).jR();
            paramf.ah(bool);
            return;
          }
          catch (RemoteException localRemoteException) {}
        }
      });
    }
    
    public final void a(final String paramString, final List<Scope> paramList, final f paramf)
    {
      this.axL.submit(new Runnable()
      {
        public final void run()
        {
          try
          {
            Object localObject = i.a.a(i.a.this);
            Collections.unmodifiableSet(new HashSet(paramList));
            localObject = ((c.d)localObject).jQ();
            localObject = new CheckServerAuthResult(((c.d.a)localObject).ahj, ((c.d.a)localObject).ahk);
            paramf.a((CheckServerAuthResult)localObject);
            return;
          }
          catch (RemoteException localRemoteException) {}
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\signin\internal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */