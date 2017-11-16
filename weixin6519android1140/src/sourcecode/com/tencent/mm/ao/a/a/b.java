package com.tencent.mm.ao.a.a;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.b.d;
import com.tencent.mm.ao.a.c.j;
import com.tencent.mm.ao.a.c.k;
import com.tencent.mm.ao.a.c.m;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class b
{
  public static final int gKl;
  public final Resources gKm;
  public final int gKn;
  public final int gKo;
  public final c gKp;
  public final m gKq;
  public final com.tencent.mm.ao.a.c.a gKr;
  public final com.tencent.mm.ao.a.c.b gKs;
  public final com.tencent.mm.ao.a.c.f gKt;
  public final j gKu;
  public final k gKv;
  public final com.tencent.mm.ao.a.c.e gKw;
  public final com.tencent.mm.ao.a.c.h gKx;
  public final Executor gKy;
  public final String packageName;
  
  static
  {
    GMTrace.i(13726178607104L, 102268);
    gKl = Runtime.getRuntime().availableProcessors();
    GMTrace.o(13726178607104L, 102268);
  }
  
  public b(a parama)
  {
    GMTrace.i(13725910171648L, 102266);
    this.packageName = parama.context.getPackageName();
    this.gKm = parama.context.getResources();
    this.gKn = parama.gKn;
    this.gKo = parama.gKo;
    this.gKp = parama.gKp;
    this.gKq = parama.gKq;
    this.gKr = parama.gKr;
    this.gKs = parama.gKs;
    this.gKt = parama.gKt;
    this.gKu = parama.gKu;
    this.gKx = parama.gKx;
    this.gKy = parama.gKy;
    this.gKv = parama.gKz;
    this.gKw = parama.gKw;
    GMTrace.o(13725910171648L, 102266);
  }
  
  public static b bf(Context paramContext)
  {
    GMTrace.i(13726044389376L, 102267);
    paramContext = new a(paramContext).Jm();
    GMTrace.o(13726044389376L, 102267);
    return paramContext;
  }
  
  public static final class a
  {
    public Context context;
    public int gKn;
    public int gKo;
    public c gKp;
    public m gKq;
    public com.tencent.mm.ao.a.c.a gKr;
    public com.tencent.mm.ao.a.c.b gKs;
    public com.tencent.mm.ao.a.c.f gKt;
    public j gKu;
    public com.tencent.mm.ao.a.c.e gKw;
    public com.tencent.mm.ao.a.c.h gKx;
    public Executor gKy;
    public k gKz;
    
    public a(Context paramContext)
    {
      GMTrace.i(13727655002112L, 102279);
      this.gKn = b.gKl;
      this.gKo = 5;
      this.gKp = null;
      this.gKq = null;
      this.gKr = null;
      this.gKs = null;
      this.gKt = null;
      this.gKu = null;
      this.gKz = null;
      this.gKw = null;
      this.gKx = null;
      this.context = paramContext.getApplicationContext();
      GMTrace.o(13727655002112L, 102279);
    }
    
    public final b Jm()
    {
      GMTrace.i(13727789219840L, 102280);
      if (this.gKp == null) {
        this.gKp = new c.a().Jn();
      }
      if (this.gKq == null) {
        this.gKq = new com.tencent.mm.ao.a.b.f();
      }
      if (this.gKr == null) {
        this.gKr = new com.tencent.mm.ao.a.b.a();
      }
      if (this.gKs == null) {
        this.gKs = new com.tencent.mm.ao.a.b.b();
      }
      if (this.gKt == null) {
        this.gKt = new d();
      }
      if (this.gKu == null) {
        this.gKu = new com.tencent.mm.ao.a.b.h();
      }
      if (this.gKx == null) {
        this.gKx = a.aO(this.gKn, this.gKo);
      }
      if (this.gKy == null) {
        this.gKy = Executors.newSingleThreadExecutor();
      }
      if (this.gKz == null) {
        this.gKz = new com.tencent.mm.ao.a.b.e();
      }
      if (this.gKw == null) {
        this.gKw = new com.tencent.mm.ao.a.b.c();
      }
      b localb = new b(this);
      GMTrace.o(13727789219840L, 102280);
      return localb;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */