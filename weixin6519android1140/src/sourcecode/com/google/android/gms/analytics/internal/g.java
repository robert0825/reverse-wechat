package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.c.ah;
import com.google.android.gms.common.internal.w;

class g
  extends BroadcastReceiver
{
  static final String acj = g.class.getName();
  final q ack;
  boolean acl;
  boolean acm;
  
  g(q paramq)
  {
    w.aa(paramq);
    this.ack = paramq;
  }
  
  void ib()
  {
    this.ack.iE();
    this.ack.iG();
  }
  
  boolean ic()
  {
    Object localObject = (ConnectivityManager)this.ack.mContext.getSystemService("connectivity");
    try
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject != null)
      {
        boolean bool = ((NetworkInfo)localObject).isConnected();
        if (bool) {
          return true;
        }
      }
      return false;
    }
    catch (SecurityException localSecurityException) {}
    return false;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    ib();
    paramContext = paramIntent.getAction();
    this.ack.iE().c("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      boolean bool = ic();
      if (this.acm != bool)
      {
        this.acm = bool;
        paramContext = this.ack.iG();
        paramContext.c("Network connectivity status changed", Boolean.valueOf(bool));
        paramContext.ack.iF().c(new m.1(paramContext, bool));
      }
    }
    do
    {
      return;
      if (!"com.google.analytics.RADIO_POWERED".equals(paramContext)) {
        break;
      }
    } while (paramIntent.hasExtra(acj));
    paramContext = this.ack.iG();
    paramContext.N("Radio powered up");
    paramContext.iv();
    return;
    this.ack.iE().e("NetworkBroadcastReceiver received unknown action", paramContext);
  }
  
  public final void unregister()
  {
    if (!this.acl) {
      return;
    }
    this.ack.iE().N("Unregistering connectivity change receiver");
    this.acl = false;
    this.acm = false;
    Context localContext = this.ack.mContext;
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.ack.iE().f("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */