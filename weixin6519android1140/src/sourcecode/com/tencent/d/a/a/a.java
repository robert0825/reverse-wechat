package com.tencent.d.a.a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class a
{
  static final e xZz = new f();
  private Context mContext;
  
  static
  {
    if (com.tencent.d.a.a.cpw())
    {
      xZz = new a();
      return;
    }
  }
  
  private a(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public static a hG(Context paramContext)
  {
    return new a(paramContext);
  }
  
  public final void a(d paramd, CancellationSignal paramCancellationSignal, b paramb)
  {
    xZz.a(this.mContext, paramd, 0, paramCancellationSignal, paramb, null);
  }
  
  public final boolean hasEnrolledFingerprints()
  {
    return xZz.hH(this.mContext);
  }
  
  public final boolean isHardwareDetected()
  {
    return xZz.hI(this.mContext);
  }
  
  private static final class a
    implements a.e
  {
    public static void a(b.a parama)
    {
      com.tencent.d.a.c.c.w("Soter.FingerprintManagerCompat", "soter: too many fail fingerprint callback. inform it.", new Object[0]);
      parama.onAuthenticationError(10308, "Too many failed times");
    }
    
    public static boolean a(b.a parama, Context paramContext)
    {
      if (c.cpC()) {
        com.tencent.d.a.c.c.v("Soter.FingerprintManagerCompat", "soter: using system anti brute force strategy", new Object[0]);
      }
      do
      {
        return false;
        if (!c.hN(paramContext)) {
          break;
        }
      } while (c.hO(paramContext));
      com.tencent.d.a.c.c.v("Soter.FingerprintManagerCompat", "soter: unfreeze former frozen status", new Object[0]);
      c.hM(paramContext);
      return false;
      if (c.hO(paramContext))
      {
        com.tencent.d.a.c.c.v("Soter.FingerprintManagerCompat", "soter: failure time available", new Object[0]);
        return false;
      }
      a(parama);
      return true;
    }
    
    public final void a(final Context paramContext, a.d paramd, int paramInt, CancellationSignal paramCancellationSignal, a.b paramb, Handler paramHandler)
    {
      if (paramd != null) {
        if (paramd.xZE != null) {
          paramd = new b.c(paramd.xZE);
        }
      }
      for (;;)
      {
        paramb = new b.a()
        {
          private boolean xZA = false;
          
          public final void a(b.b paramAnonymousb)
          {
            com.tencent.d.a.c.c.d("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationSucceeded", new Object[0]);
            if (this.xZA) {}
            while (a.a.a(this, paramContext)) {
              return;
            }
            if (!c.cpC()) {
              c.hM(paramContext);
            }
            this.xZA = true;
            a.b localb = this.xZB;
            paramAnonymousb = paramAnonymousb.xZH;
            if (paramAnonymousb != null) {
              if (paramAnonymousb.xZE != null) {
                paramAnonymousb = new a.d(paramAnonymousb.xZE);
              }
            }
            for (;;)
            {
              new a.c(paramAnonymousb);
              localb.bqG();
              return;
              if (paramAnonymousb.xZD != null) {
                paramAnonymousb = new a.d(paramAnonymousb.xZD);
              } else if (paramAnonymousb.xZF != null) {
                paramAnonymousb = new a.d(paramAnonymousb.xZF);
              } else {
                paramAnonymousb = null;
              }
            }
          }
          
          public final void onAuthenticationError(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
          {
            for (;;)
            {
              com.tencent.d.a.c.c.d("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationError", new Object[0]);
              if (this.xZA) {
                return;
              }
              this.xZA = true;
              if (paramAnonymousInt == 5)
              {
                com.tencent.d.a.c.c.i("Soter.FingerprintManagerCompat", "soter: user cancelled fingerprint authen", new Object[0]);
                this.xZB.aAa();
                return;
              }
              if (paramAnonymousInt != 7) {
                break;
              }
              com.tencent.d.a.c.c.i("Soter.FingerprintManagerCompat", "soter: system call too many trial.", new Object[0]);
              if ((!c.hO(paramContext)) && (!c.hN(paramContext)) && (!c.cpC())) {
                c.hL(paramContext);
              }
              this.xZA = false;
              paramAnonymousInt = 10308;
              paramAnonymousCharSequence = "Too many failed times";
            }
            this.xZB.onAuthenticationError(paramAnonymousInt, paramAnonymousCharSequence);
          }
          
          public final void onAuthenticationFailed()
          {
            com.tencent.d.a.c.c.d("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationFailed", new Object[0]);
            if (this.xZA) {}
            while (a.a.a(this, paramContext)) {
              return;
            }
            if (!c.cpC())
            {
              Context localContext = paramContext;
              c.ao(localContext, Integer.valueOf(Integer.valueOf(c.hK(localContext)).intValue() + 1).intValue());
              if (!c.hO(paramContext))
              {
                com.tencent.d.a.c.c.w("Soter.FingerprintManagerCompat", "soter: too many fail trials", new Object[0]);
                c.hL(paramContext);
                a.a.a(this);
                return;
              }
            }
            this.xZB.onAuthenticationFailed();
          }
          
          public final void onAuthenticationHelp(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
          {
            com.tencent.d.a.c.c.d("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationHelp", new Object[0]);
            if (this.xZA) {}
            while (a.a.a(this, paramContext)) {
              return;
            }
            this.xZB.onAuthenticationHelp(paramAnonymousInt, paramAnonymousCharSequence);
          }
        };
        if (b.d(paramContext, "android.permission.USE_FINGERPRINT") == 0) {
          break;
        }
        com.tencent.d.a.c.c.e("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: authenticate", new Object[0]);
        return;
        if (paramd.xZD != null) {
          paramd = new b.c(paramd.xZD);
        } else if (paramd.xZF != null) {
          paramd = new b.c(paramd.xZF);
        } else {
          paramd = null;
        }
      }
      for (;;)
      {
        try
        {
          paramHandler = b.hJ(paramContext);
          if (paramHandler == null) {
            break label219;
          }
          if (paramd == null) {
            break label231;
          }
          if (paramd.xZE != null)
          {
            paramContext = new FingerprintManager.CryptoObject(paramd.xZE);
            paramHandler.authenticate(paramContext, (CancellationSignal)paramCancellationSignal, 0, new b.1(paramb), null);
            return;
          }
        }
        catch (SecurityException paramContext)
        {
          com.tencent.d.a.c.c.e("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
          return;
        }
        if (paramd.xZD != null)
        {
          paramContext = new FingerprintManager.CryptoObject(paramd.xZD);
        }
        else if (paramd.xZF != null)
        {
          paramContext = new FingerprintManager.CryptoObject(paramd.xZF);
          continue;
          label219:
          com.tencent.d.a.c.c.e("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in authenticate! Should never happen", new Object[0]);
        }
        else
        {
          label231:
          paramContext = null;
        }
      }
    }
    
    public final boolean hH(Context paramContext)
    {
      return b.hH(paramContext);
    }
    
    public final boolean hI(Context paramContext)
    {
      return b.hI(paramContext);
    }
  }
  
  public static abstract class b
  {
    public void aAa() {}
    
    public void bqG() {}
    
    public void onAuthenticationError(int paramInt, CharSequence paramCharSequence) {}
    
    public void onAuthenticationFailed() {}
    
    public void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence) {}
  }
  
  public static final class c
  {
    private a.d xZC;
    
    public c(a.d paramd)
    {
      this.xZC = paramd;
    }
  }
  
  public static final class d
  {
    final Signature xZD;
    final Cipher xZE;
    final Mac xZF;
    
    public d(Signature paramSignature)
    {
      this.xZD = paramSignature;
      this.xZE = null;
      this.xZF = null;
    }
    
    public d(Cipher paramCipher)
    {
      this.xZE = paramCipher;
      this.xZD = null;
      this.xZF = null;
    }
    
    public d(Mac paramMac)
    {
      this.xZF = paramMac;
      this.xZE = null;
      this.xZD = null;
    }
  }
  
  private static abstract interface e
  {
    public abstract void a(Context paramContext, a.d paramd, int paramInt, CancellationSignal paramCancellationSignal, a.b paramb, Handler paramHandler);
    
    public abstract boolean hH(Context paramContext);
    
    public abstract boolean hI(Context paramContext);
  }
  
  private static final class f
    implements a.e
  {
    public final void a(Context paramContext, a.d paramd, int paramInt, CancellationSignal paramCancellationSignal, a.b paramb, Handler paramHandler) {}
    
    public final boolean hH(Context paramContext)
    {
      return false;
    }
    
    public final boolean hI(Context paramContext)
    {
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */