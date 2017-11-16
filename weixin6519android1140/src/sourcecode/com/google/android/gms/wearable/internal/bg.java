package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c.a;
import com.google.android.gms.wearable.c.c;
import com.google.android.gms.wearable.c.d;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.h;
import java.io.IOException;
import java.io.InputStream;

public final class bg
  implements com.google.android.gms.wearable.c
{
  public final e<h> a(com.google.android.gms.common.api.c paramc)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public final e<c.d> a(com.google.android.gms.common.api.c paramc, final Asset paramAsset)
  {
    if (paramAsset == null) {
      throw new IllegalArgumentException("asset is null");
    }
    if (paramAsset.aAf == null) {
      throw new IllegalArgumentException("invalid asset");
    }
    if (paramAsset.aAe != null) {
      throw new IllegalArgumentException("invalid asset");
    }
    paramc.a(new aw(paramc) {});
  }
  
  public final e<c.a> a(com.google.android.gms.common.api.c paramc, final PutDataRequest paramPutDataRequest)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public final e<c.c> b(com.google.android.gms.common.api.c paramc, final Uri paramUri)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public static final class a
    implements c.a
  {
    private final f aCv;
    private final Status azP;
    
    public a(Status paramStatus, f paramf)
    {
      this.azP = paramStatus;
      this.aCv = paramf;
    }
    
    public final Status jT()
    {
      return this.azP;
    }
  }
  
  public static final class b
    implements c.c
  {
    private final int aCw;
    private final Status azP;
    
    public b(Status paramStatus, int paramInt)
    {
      this.azP = paramStatus;
      this.aCw = paramInt;
    }
    
    public final Status jT()
    {
      return this.azP;
    }
  }
  
  public static final class c
    implements c.d
  {
    private volatile ParcelFileDescriptor aCx;
    private volatile InputStream aCy;
    private final Status azP;
    private volatile boolean mClosed = false;
    
    public c(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      this.azP = paramStatus;
      this.aCx = paramParcelFileDescriptor;
    }
    
    public final InputStream getInputStream()
    {
      if (this.mClosed) {
        throw new IllegalStateException("Cannot access the input stream after release().");
      }
      if (this.aCx == null) {
        return null;
      }
      if (this.aCy == null) {
        this.aCy = new ParcelFileDescriptor.AutoCloseInputStream(this.aCx);
      }
      return this.aCy;
    }
    
    public final Status jT()
    {
      return this.azP;
    }
    
    public final void release()
    {
      if (this.aCx == null) {
        return;
      }
      if (this.mClosed) {
        throw new IllegalStateException("releasing an already released result.");
      }
      try
      {
        if (this.aCy != null) {
          this.aCy.close();
        }
        for (;;)
        {
          this.mClosed = true;
          this.aCx = null;
          this.aCy = null;
          return;
          this.aCx.close();
        }
        return;
      }
      catch (IOException localIOException) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */