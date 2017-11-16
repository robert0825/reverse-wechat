package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.app.p;
import android.support.v4.app.s;
import android.support.v4.app.s.a;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public final class v
  extends Fragment
  implements DialogInterface.OnCancelListener, s.a<ConnectionResult>
{
  private boolean aiK;
  private int aiL = -1;
  private ConnectionResult aiM;
  private final Handler aiN = new Handler(Looper.getMainLooper());
  public final SparseArray<b> aiO = new SparseArray();
  
  public static v c(FragmentActivity paramFragmentActivity)
  {
    w.ag("Must be called from main thread of process");
    l locall = paramFragmentActivity.aR();
    try
    {
      v localv = (v)locall.l("GmsSupportLoaderLifecycleFragment");
      if (localv != null)
      {
        paramFragmentActivity = localv;
        if (!localv.os) {}
      }
      else
      {
        paramFragmentActivity = new v();
        locall.aV().a(paramFragmentActivity, "GmsSupportLoaderLifecycleFragment").commit();
        locall.executePendingTransactions();
      }
      return paramFragmentActivity;
    }
    catch (ClassCastException paramFragmentActivity)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", paramFragmentActivity);
    }
  }
  
  public final android.support.v4.content.c<ConnectionResult> K(int paramInt)
  {
    return new a(aG(), ((b)this.aiO.get(paramInt)).aiQ);
  }
  
  public final void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    Object localObject = (b)this.aiO.get(paramInt);
    if (localObject != null)
    {
      this.aiO.remove(paramInt);
      aI().destroyLoader(paramInt);
      localObject = ((b)localObject).aiR;
      if (localObject != null) {
        ((c.c)localObject).a(paramConnectionResult);
      }
    }
    kj();
  }
  
  public final a bX(int paramInt)
  {
    try
    {
      a locala = (a)aI().J(paramInt);
      return locala;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", localClassCastException);
    }
  }
  
  public final void kj()
  {
    int i = 0;
    this.aiK = false;
    this.aiL = -1;
    this.aiM = null;
    s locals = aI();
    while (i < this.aiO.size())
    {
      int j = this.aiO.keyAt(i);
      a locala = bX(j);
      if ((locala != null) && (locala.aiV))
      {
        locals.destroyLoader(j);
        locals.a(j, this);
      }
      i += 1;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramInt1 == 0) {
        break label66;
      }
      kj();
      return;
      if (e.x(aG()) != 0) {
        break;
      }
      paramInt1 = i;
      continue;
      if (paramInt2 != -1) {
        break;
      }
      paramInt1 = i;
    }
    label66:
    a(this.aiL, this.aiM);
  }
  
  public final void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    int i = 0;
    if (i < this.aiO.size())
    {
      int j = this.aiO.keyAt(i);
      paramActivity = bX(j);
      if ((paramActivity != null) && (((b)this.aiO.valueAt(i)).aiQ != paramActivity.aiQ)) {
        aI().b(j, this);
      }
      for (;;)
      {
        i += 1;
        break;
        aI().a(j, this);
      }
    }
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    a(this.aiL, new ConnectionResult(13, null));
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.aiK = paramBundle.getBoolean("resolving_error", false);
      this.aiL = paramBundle.getInt("failed_client_id", -1);
      if (this.aiL >= 0) {
        this.aiM = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("resolving_error", this.aiK);
    if (this.aiL >= 0)
    {
      paramBundle.putInt("failed_client_id", this.aiL);
      paramBundle.putInt("failed_status", this.aiM.agz);
      paramBundle.putParcelable("failed_resolution", this.aiM.agA);
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    if (!this.aiK)
    {
      int i = 0;
      while (i < this.aiO.size())
      {
        aI().a(this.aiO.keyAt(i), this);
        i += 1;
      }
    }
  }
  
  public static final class a
    extends android.support.v4.content.c<ConnectionResult>
    implements c.b, c.c
  {
    public final c aiQ;
    boolean aiV;
    private ConnectionResult aiW;
    
    public a(Context paramContext, c paramc)
    {
      super();
      this.aiQ = paramc;
    }
    
    private void g(ConnectionResult paramConnectionResult)
    {
      this.aiW = paramConnectionResult;
      if ((this.mP) && (!this.sJ)) {
        deliverResult(paramConnectionResult);
      }
    }
    
    public final void a(ConnectionResult paramConnectionResult)
    {
      this.aiV = true;
      g(paramConnectionResult);
    }
    
    public final void bU(int paramInt) {}
    
    public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      this.aiQ.a(paramString, paramPrintWriter);
    }
    
    public final void g(Bundle paramBundle)
    {
      this.aiV = false;
      g(ConnectionResult.agy);
    }
    
    protected final void onReset()
    {
      this.aiW = null;
      this.aiV = false;
      this.aiQ.b(this);
      this.aiQ.b(this);
      this.aiQ.disconnect();
    }
    
    protected final void onStartLoading()
    {
      super.onStartLoading();
      this.aiQ.a(this);
      this.aiQ.a(this);
      if (this.aiW != null) {
        deliverResult(this.aiW);
      }
      if ((!this.aiQ.isConnected()) && (!this.aiQ.isConnecting()) && (!this.aiV)) {
        this.aiQ.connect();
      }
    }
    
    protected final void onStopLoading()
    {
      this.aiQ.disconnect();
    }
  }
  
  private static final class b
  {
    public final c aiQ;
    public final c.c aiR;
    
    public b(c paramc, c.c paramc1)
    {
      this.aiQ = paramc;
      this.aiR = paramc1;
    }
  }
  
  private final class c
    implements Runnable
  {
    private final int aiT;
    private final ConnectionResult aiU;
    
    public c(int paramInt, ConnectionResult paramConnectionResult)
    {
      this.aiT = paramInt;
      this.aiU = paramConnectionResult;
    }
    
    public final void run()
    {
      if (this.aiU.jD()) {
        try
        {
          int i = v.this.aG().aR().aW().indexOf(v.this);
          this.aiU.a(v.this.aG(), (i + 1 << 16) + 1);
          return;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          v.this.kj();
          return;
        }
      }
      if (e.bS(this.aiU.agz))
      {
        e.a(this.aiU.agz, v.this.aG(), v.this, v.this);
        return;
      }
      v.this.a(this.aiT, this.aiU);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\api\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */