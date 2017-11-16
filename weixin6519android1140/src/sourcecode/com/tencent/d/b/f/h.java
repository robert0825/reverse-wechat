package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.tencent.d.a.a.a.b;
import com.tencent.d.a.a.a.d;
import com.tencent.d.b.e.c.a;
import com.tencent.d.b.e.c.b;
import com.tencent.d.b.e.f.a;
import com.tencent.d.b.e.f.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.security.SignatureException;
import junit.framework.Assert;

public final class h
  extends d
  implements a
{
  private int gRb = -1;
  public String rzb = null;
  private String yaA = null;
  private com.tencent.d.b.e.c ybi = null;
  com.tencent.d.b.e.f ybj = null;
  private WeakReference<Context> ybk = null;
  public com.tencent.d.b.c.a ybl = null;
  public com.tencent.d.b.c.b ybm = null;
  public com.tencent.d.a.c.h ybn = null;
  private a ybo = null;
  public boolean ybp;
  public boolean ybq;
  public boolean ybr;
  
  public h(b paramb)
  {
    if ((Build.VERSION.SDK_INT < 23) && (Build.MANUFACTURER.equalsIgnoreCase("vivo")))
    {
      bool1 = true;
      this.ybp = bool1;
      if (Build.VERSION.SDK_INT >= 23) {
        break label121;
      }
    }
    label121:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.ybq = bool1;
      this.ybr = false;
      if (paramb != null) {
        break label126;
      }
      throw new IllegalArgumentException("param is null!");
      bool1 = false;
      break;
    }
    label126:
    this.gRb = paramb.gRb;
    this.ybi = paramb.yaN;
    this.ybj = paramb.yaO;
    this.ybk = new WeakReference(paramb.mContext);
    this.ybm = paramb.yaP;
    this.ybl = paramb.llw;
    this.rzb = paramb.rzb;
  }
  
  @SuppressLint({"NewApi"})
  public final void a(Signature paramSignature)
  {
    if (this.yaE)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: already finished. can not authenticate", new Object[0]);
      return;
    }
    Object localObject = (Context)this.ybk.get();
    if (localObject == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: context instance released in startAuthenticate", new Object[0]);
      b(new com.tencent.d.b.a.a(17));
      return;
    }
    for (;;)
    {
      try
      {
        com.tencent.d.a.c.c.v("Soter.TaskAuthentication", "soter: performing start", new Object[0]);
        localObject = com.tencent.d.a.a.a.hG((Context)localObject);
        a.d locald = new a.d(paramSignature);
        if (this.ybl != null)
        {
          paramSignature = this.ybl.yav;
          ((com.tencent.d.a.a.a)localObject).a(locald, paramSignature, this.ybo);
          return;
        }
      }
      catch (Exception paramSignature)
      {
        localObject = paramSignature.getMessage();
        com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: caused exception when authenticating: %s", new Object[] { localObject });
        com.tencent.d.a.c.c.a("Soter.TaskAuthentication", paramSignature, "soter: caused exception when authenticating");
        b(new com.tencent.d.b.a.a(20, String.format("start authentication failed due to %s", new Object[] { localObject })));
        return;
      }
      paramSignature = null;
    }
  }
  
  public final void cpP()
  {
    com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: called from cancellation signal", new Object[0]);
    if (this.ybo != null) {
      this.ybo.aAa();
    }
  }
  
  @SuppressLint({"DefaultLocale", "NewApi"})
  final boolean cpQ()
  {
    if (!com.tencent.d.b.b.a.cpH().isInit())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.d.b.a.a(14));
      return true;
    }
    if (!com.tencent.d.b.b.a.cpH().cpG())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: not support soter", new Object[0]);
      b(new com.tencent.d.b.a.a(2));
      return true;
    }
    if (Build.VERSION.SDK_INT >= 16) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.yaA = ((String)com.tencent.d.b.b.a.cpH().cpJ().get(this.gRb, ""));
      if (!com.tencent.d.a.c.f.nm(this.yaA)) {
        break;
      }
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
      b(new com.tencent.d.b.a.a(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.gRb) })));
      return true;
    }
    if (!com.tencent.d.a.a.cpz())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: app secure key not exists. need re-generate", new Object[0]);
      b(new com.tencent.d.b.a.a(3));
      return true;
    }
    if (!com.tencent.d.a.a.Ys(this.yaA))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: auth key %s not exists. need re-generate", new Object[] { this.yaA });
      b(new com.tencent.d.b.a.a(12, String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", new Object[] { Integer.valueOf(this.gRb) })));
      return true;
    }
    if (!com.tencent.d.a.a.Yt(this.yaA))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: auth key %s has already expired, and we've already deleted them. need re-generate", new Object[] { this.yaA });
      b(new com.tencent.d.b.a.a(11, String.format("the auth key to scene %d has already been expired. in Android versions above 6.0, a key would be expired when user enrolls a new fingerprint. please prepare the key again", new Object[] { Integer.valueOf(this.gRb) })));
      return true;
    }
    if ((this.ybi == null) && (com.tencent.d.a.c.f.nm(this.rzb)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: challenge wrapper is null!", new Object[0]);
      b(new com.tencent.d.b.a.a(16, "neither get challenge wrapper nor challenge str is found in request parameter"));
      return true;
    }
    Context localContext = (Context)this.ybk.get();
    if (localContext == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: context instance released in preExecute", new Object[0]);
      b(new com.tencent.d.b.a.a(17));
      return true;
    }
    if (!com.tencent.d.a.a.a.hG(localContext).hasEnrolledFingerprints())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: user has not enrolled any fingerprint in system.", new Object[0]);
      b(new com.tencent.d.b.a.a(18));
      return true;
    }
    if (com.tencent.d.a.a.hF(localContext))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: fingerprint sensor frozen", new Object[0]);
      b(new com.tencent.d.b.a.a(25, "Too many failed times"));
      return true;
    }
    if (this.ybl == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new Object[0]);
      this.ybl = new com.tencent.d.b.c.a();
      return false;
    }
    if (this.ybj == null) {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new Object[0]);
    }
    return false;
  }
  
  final void cpR()
  {
    if (this.ybl != null) {
      this.ybl.nc(true);
    }
  }
  
  public final void cpV()
  {
    Signature localSignature = com.tencent.d.a.a.Yv(this.yaA);
    if (localSignature == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: error occurred when init sign", new Object[0]);
      b(new com.tencent.d.b.a.a(13));
      return;
    }
    this.ybo = new a(localSignature);
    a(localSignature);
    g.cpU().t(new Runnable()
    {
      public final void run()
      {
        if (h.this.ybm != null) {
          h.this.ybm.azY();
        }
      }
    });
  }
  
  final void execute()
  {
    if (com.tencent.d.a.c.f.nm(this.rzb))
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: not provide the challenge. we will do the job", new Object[0]);
      this.ybi.aX(new c.a());
      this.ybi.a(new com.tencent.d.b.e.b() {});
      this.ybi.execute();
      return;
    }
    com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: already provided the challenge. directly authenticate", new Object[0]);
    cpV();
  }
  
  public final boolean isCancelled()
  {
    return this.ybr;
  }
  
  private final class a
    extends a.b
  {
    public Signature ybt = null;
    
    public a(Signature paramSignature)
    {
      this.ybt = paramSignature;
    }
    
    public static String V(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {
        return "unknown error";
      }
      return paramCharSequence.toString();
    }
    
    @SuppressLint({"NewApi"})
    private void cpW()
    {
      if (h.this.ybq)
      {
        h.this.ybl.nc(false);
        h.this.ybr = true;
      }
    }
    
    public final void aAa()
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: called onAuthenticationCancelled", new Object[0]);
      if (h.this.ybr)
      {
        com.tencent.d.a.c.c.v("Soter.TaskAuthentication", "soter: during ignore cancel period", new Object[0]);
        return;
      }
      super.aAa();
      g.cpU().t(new Runnable()
      {
        public final void run()
        {
          if (h.this.ybm != null) {
            h.this.ybm.aAa();
          }
        }
      });
      h.this.b(new com.tencent.d.b.a.a(24, "user cancelled authentication"));
      cpW();
    }
    
    public final void bqG()
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: authentication succeed. start sign and upload upload signature", new Object[0]);
      g.cpU().v(new Runnable()
      {
        public final void run()
        {
          if (!com.tencent.d.a.c.f.nm(h.this.rzb))
          {
            try
            {
              h.a.this.ybt.update(h.this.rzb.getBytes());
              h localh = h.this;
              Signature localSignature = h.a.this.ybt;
              try
              {
                localh.ybn = com.tencent.d.a.a.bH(localSignature.sign());
                if (localh.ybj != null)
                {
                  if (localh.ybn == null)
                  {
                    localh.b(new com.tencent.d.b.a.a(22, "sign failed even after user authenticated the key."));
                    return;
                  }
                  localh.ybj.aX(new f.a(localh.ybn.signature, localh.ybn.yaq, localh.ybn.yap));
                  localh.ybj.a(new h.3(localh));
                  localh.ybj.execute();
                  return;
                }
              }
              catch (SignatureException localSignatureException2)
              {
                com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: sign failed due to exception: %s", new Object[] { localSignatureException2.getMessage() });
                com.tencent.d.a.c.c.a("Soter.TaskAuthentication", localSignatureException2, "soter: sign failed due to exception");
                localh.b(new com.tencent.d.b.a.a(22, "sign failed even after user authenticated the key."));
                return;
              }
              com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: no upload wrapper, return directly", new Object[0]);
            }
            catch (SignatureException localSignatureException1)
            {
              com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: exception in update", new Object[0]);
              com.tencent.d.a.c.c.a("Soter.TaskAuthentication", localSignatureException1, "soter: exception in update");
              h.a.this.onAuthenticationError(64536, "update signature failed");
              return;
            }
            localSignatureException1.b(new com.tencent.d.b.a.a(localSignatureException1.ybn));
            return;
          }
          com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: challenge is null. should not happen here", new Object[0]);
          h.a.this.onAuthenticationError(64536, "challenge is null");
        }
      });
      g.cpU().t(new Runnable()
      {
        public final void run()
        {
          if (h.this.ybm != null) {
            h.this.ybm.azZ();
          }
        }
      });
      cpW();
    }
    
    public final void onAuthenticationError(final int paramInt, final CharSequence paramCharSequence)
    {
      com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: on authentication fatal error: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
      if (paramInt != 10308)
      {
        g.cpU().t(new Runnable()
        {
          public final void run()
          {
            if (h.this.ybm != null) {
              h.this.ybm.onAuthenticationError(paramInt, paramCharSequence);
            }
          }
        });
        h.this.b(new com.tencent.d.b.a.a(21, V(paramCharSequence)));
      }
      for (;;)
      {
        cpW();
        return;
        h.this.b(new com.tencent.d.b.a.a(25, V(paramCharSequence)));
      }
    }
    
    public final void onAuthenticationFailed()
    {
      super.onAuthenticationFailed();
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: authentication failed once", new Object[0]);
      g.cpU().t(new Runnable()
      {
        public final void run()
        {
          if (h.this.ybm != null) {
            h.this.ybm.onAuthenticationFailed();
          }
        }
      });
      if (h.this.ybp)
      {
        com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: should compat lower android version logic.", new Object[0]);
        h.this.ybl.nc(false);
        g.cpU().v(new Runnable()
        {
          public final void run()
          {
            h.this.ybl.cpM();
          }
        });
        g.cpU().k(new Runnable()
        {
          public final void run()
          {
            h.this.a(h.a.this.ybt);
          }
        }, 1000L);
      }
    }
    
    public final void onAuthenticationHelp(final int paramInt, final CharSequence paramCharSequence)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
      g.cpU().t(new Runnable()
      {
        public final void run()
        {
          if (h.this.ybm != null) {
            h.this.ybm.onAuthenticationHelp(paramInt, h.a.V(paramCharSequence));
          }
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\b\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */