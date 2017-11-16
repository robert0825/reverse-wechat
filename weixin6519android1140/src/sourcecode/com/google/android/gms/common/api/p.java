package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public abstract interface p
{
  public abstract <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT);
  
  public abstract void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt);
  
  public abstract <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT);
  
  public abstract void bU(int paramInt);
  
  public abstract void begin();
  
  public abstract void connect();
  
  public abstract void disconnect();
  
  public abstract void g(Bundle paramBundle);
  
  public abstract String getName();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */