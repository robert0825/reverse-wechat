package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.e;

public final class a
  extends p.a
{
  private Account afv;
  int akk;
  private Context mContext;
  
  public static Account b(p paramp)
  {
    Account localAccount = null;
    long l;
    if (paramp != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      localAccount = paramp.kq();
      Binder.restoreCallingIdentity(l);
      return localAccount;
    }
    catch (RemoteException paramp)
    {
      paramp = paramp;
      Binder.restoreCallingIdentity(l);
      return null;
    }
    finally
    {
      paramp = finally;
      Binder.restoreCallingIdentity(l);
      throw paramp;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    return this.afv.equals(((a)paramObject).afv);
  }
  
  public final Account kq()
  {
    int i = Binder.getCallingUid();
    if (i == this.akk) {
      return this.afv;
    }
    if (e.m(this.mContext, i))
    {
      this.akk = i;
      return this.afv;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */