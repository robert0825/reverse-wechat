package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.tencent.d.a.c.f;
import com.tencent.d.a.c.g;
import com.tencent.d.b.d.b.a;
import com.tencent.d.b.e.e;
import com.tencent.d.b.e.e.a;
import com.tencent.d.b.e.e.b;

public final class k
  extends c
{
  private int gRb = -1;
  public String yaA = null;
  private boolean ybD = false;
  public e ybG = null;
  private e ybH = null;
  private boolean ybI = false;
  
  public k(int paramInt, e parame1, e parame2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.gRb = paramInt;
    this.ybG = parame1;
    this.ybD = paramBoolean1;
    this.ybI = true;
    this.ybH = parame2;
  }
  
  @SuppressLint({"DefaultLocale"})
  final boolean cpQ()
  {
    if (!com.tencent.d.b.b.a.cpH().isInit())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.d.b.a.c(14));
      return true;
    }
    if (!com.tencent.d.b.b.a.cpH().cpG())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: not support soter", new Object[0]);
      b(new com.tencent.d.b.a.c(2));
      return true;
    }
    this.yaA = ((String)com.tencent.d.b.b.a.cpH().cpJ().get(this.gRb, ""));
    if (f.nm(this.yaA))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
      b(new com.tencent.d.b.a.c(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.gRb) })));
      return true;
    }
    if ((!com.tencent.d.a.a.cpz()) && (com.tencent.d.a.a.Ys(this.yaA)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: no ask but has auth key. delete the auth key as well", new Object[0]);
      com.tencent.d.a.a.bk(this.yaA, false);
    }
    if ((!com.tencent.d.a.a.cpz()) && (!this.ybI))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: has not generate app secure key yet and not require to generate it", new Object[0]);
      b(new com.tencent.d.b.a.c(3));
      return true;
    }
    if ((com.tencent.d.a.a.Ys(this.yaA)) && (!com.tencent.d.a.a.Yt(this.yaA)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: already has auth key but not valid. delete it already and re-generate", new Object[0]);
      return false;
    }
    if ((com.tencent.d.a.a.Ys(this.yaA)) && (!this.ybD))
    {
      com.tencent.d.a.c.c.i("Soter.TaskPrepareAuthKey", "soter: already has key. do not need generate again", new Object[0]);
      b(new com.tencent.d.b.a.c(com.tencent.d.a.a.Yu(this.yaA)));
      return true;
    }
    if (this.ybG == null) {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload AuthKey validation from server! Please make sure you upload it later", new Object[0]);
    }
    return false;
  }
  
  final void cpR()
  {
    com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: cancelled prepare authkey: %s", new Object[] { this.yaA });
    com.tencent.d.a.a.bk(this.yaA, false);
  }
  
  public final void cpX()
  {
    dr(this.yaA, 1);
    b.a locala = new b.a();
    String str = this.yaA;
    boolean bool = this.ybD;
    locala.yaA = str;
    locala.yaC = bool;
    locala.yaz |= 0x2;
    locala.yaD = new com.tencent.d.b.d.a()
    {
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: auth key %s generate failed. errcode: %d, errmsg: %s", new Object[] { k.this.yaA, Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        k.dr(k.this.yaA, 0);
        k.this.b(new com.tencent.d.b.a.c(paramAnonymousInt, paramAnonymousString));
      }
      
      public final void onSuccess()
      {
        com.tencent.d.a.c.c.i("Soter.TaskPrepareAuthKey", "soter: auth key generate successfully. start upload", new Object[0]);
        if (k.this.ybG != null) {
          k.dr(k.this.yaA, 2);
        }
        k localk;
        g localg;
        for (;;)
        {
          localk = k.this;
          localg = com.tencent.d.a.a.Yu(localk.yaA);
          if (localg != null) {
            break;
          }
          com.tencent.d.a.c.c.e("Soter.TaskPrepareAuthKey", "soter: auth key model is null even after generation. fatal error", new Object[0]);
          com.tencent.d.a.a.bk(localk.yaA, false);
          localk.b(new com.tencent.d.b.a.c(12, "auth key model is null even after generation."));
          return;
          k.dr(k.this.yaA, 0);
        }
        if (localk.ybG != null)
        {
          localk.ybG.aX(new e.a(localg.signature, localg.yah));
          localk.ybG.a(new k.3(localk, localg));
          localk.ybG.execute();
          return;
        }
        com.tencent.d.a.c.c.d("Soter.TaskPrepareAuthKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new Object[0]);
        localk.b(new com.tencent.d.b.a.c("treat as normal because you do not provide the net wrapper", localg));
      }
    };
    locala.cpO().cpN();
  }
  
  final void execute()
  {
    if ((!com.tencent.d.a.a.cpz()) && (this.ybI))
    {
      com.tencent.d.a.c.c.d("Soter.TaskPrepareAuthKey", "soter: ask not found, but required to generate it. start generate", new Object[0]);
      com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, false, this.ybH);
      return;
    }
    cpX();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\d\b\f\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */