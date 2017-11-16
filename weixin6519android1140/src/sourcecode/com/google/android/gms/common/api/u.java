package com.google.android.gms.common.api;

import android.app.PendingIntent;
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
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public final class u
  extends Fragment
  implements DialogInterface.OnCancelListener
{
  public boolean aiK;
  public int aiL = -1;
  public ConnectionResult aiM;
  public final Handler aiN = new Handler(Looper.getMainLooper());
  final SparseArray<a> aiO = new SparseArray();
  public boolean mP;
  
  public static u a(FragmentActivity paramFragmentActivity)
  {
    w.ag("Must be called from main thread of process");
    paramFragmentActivity = paramFragmentActivity.aR();
    try
    {
      u localu = (u)paramFragmentActivity.l("GmsSupportLifecycleFragment");
      if (localu != null)
      {
        paramFragmentActivity = localu;
        if (!localu.os) {}
      }
      else
      {
        paramFragmentActivity = null;
      }
      return paramFragmentActivity;
    }
    catch (ClassCastException paramFragmentActivity)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", paramFragmentActivity);
    }
  }
  
  public static u b(FragmentActivity paramFragmentActivity)
  {
    u localu = a(paramFragmentActivity);
    l locall = paramFragmentActivity.aR();
    paramFragmentActivity = localu;
    if (localu == null)
    {
      paramFragmentActivity = new u();
      locall.aV().a(paramFragmentActivity, "GmsSupportLifecycleFragment").commitAllowingStateLoss();
      locall.executePendingTransactions();
    }
    return paramFragmentActivity;
  }
  
  public final void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    Object localObject = (a)this.aiO.get(paramInt);
    if (localObject != null)
    {
      a locala = (a)this.aiO.get(paramInt);
      this.aiO.remove(paramInt);
      if (locala != null)
      {
        locala.aiQ.b(locala);
        locala.aiQ.disconnect();
      }
      localObject = ((a)localObject).aiR;
      if (localObject != null) {
        ((c.c)localObject).a(paramConnectionResult);
      }
    }
    kj();
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    int i = 0;
    while (i < this.aiO.size())
    {
      paramFileDescriptor = (a)this.aiO.valueAt(i);
      paramPrintWriter.append(paramString).append("GoogleApiClient #").print(paramFileDescriptor.aiP);
      paramPrintWriter.println(":");
      paramFileDescriptor.aiQ.a(paramString + "  ", paramPrintWriter);
      i += 1;
    }
  }
  
  public final void kj()
  {
    this.aiK = false;
    this.aiL = -1;
    this.aiM = null;
    int i = 0;
    while (i < this.aiO.size())
    {
      ((a)this.aiO.valueAt(i)).aiQ.connect();
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
    this.mP = true;
    if (!this.aiK)
    {
      int i = 0;
      while (i < this.aiO.size())
      {
        ((a)this.aiO.valueAt(i)).aiQ.connect();
        i += 1;
      }
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    this.mP = false;
    int i = 0;
    while (i < this.aiO.size())
    {
      ((a)this.aiO.valueAt(i)).aiQ.disconnect();
      i += 1;
    }
  }
  
  private final class a
    implements c.c
  {
    public final int aiP;
    public final c aiQ;
    public final c.c aiR;
    
    public a(int paramInt, c paramc, c.c paramc1)
    {
      this.aiP = paramInt;
      this.aiQ = paramc;
      this.aiR = paramc1;
      paramc.a(this);
    }
    
    public final void a(ConnectionResult paramConnectionResult)
    {
      u.this.aiN.post(new u.b(u.this, this.aiP, paramConnectionResult));
    }
  }
  
  private final class b
    implements Runnable
  {
    private final int aiT;
    private final ConnectionResult aiU;
    
    public b(int paramInt, ConnectionResult paramConnectionResult)
    {
      this.aiT = paramInt;
      this.aiU = paramConnectionResult;
    }
    
    public final void run()
    {
      if ((!u.this.mP) || (u.this.aiK)) {
        return;
      }
      u.this.aiK = true;
      u.this.aiL = this.aiT;
      u.this.aiM = this.aiU;
      if (this.aiU.jD()) {
        try
        {
          int i = u.this.aG().aR().aW().indexOf(u.this);
          this.aiU.a(u.this.aG(), (i + 1 << 16) + 1);
          return;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          u.this.kj();
          return;
        }
      }
      if (e.bS(this.aiU.agz))
      {
        e.a(this.aiU.agz, u.this.aG(), u.this, u.this);
        return;
      }
      u.this.a(this.aiT, this.aiU);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */