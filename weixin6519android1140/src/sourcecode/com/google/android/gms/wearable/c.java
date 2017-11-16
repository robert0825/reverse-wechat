package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import java.io.InputStream;

public abstract interface c
{
  public abstract com.google.android.gms.common.api.e<h> a(com.google.android.gms.common.api.c paramc);
  
  public abstract com.google.android.gms.common.api.e<d> a(com.google.android.gms.common.api.c paramc, Asset paramAsset);
  
  public abstract com.google.android.gms.common.api.e<a> a(com.google.android.gms.common.api.c paramc, PutDataRequest paramPutDataRequest);
  
  public abstract com.google.android.gms.common.api.e<c> b(com.google.android.gms.common.api.c paramc, Uri paramUri);
  
  public static abstract interface a
    extends g
  {}
  
  public static abstract interface b
  {
    public abstract void a(e parame);
  }
  
  public static abstract interface c
    extends g
  {}
  
  public static abstract interface d
    extends f, g
  {
    public abstract InputStream getInputStream();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */