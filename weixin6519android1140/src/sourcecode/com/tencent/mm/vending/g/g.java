package com.tencent.mm.vending.g;

import com.tencent.gmtrace.GMTrace;
import java.util.Stack;

public final class g
{
  private static final a xyG;
  
  static
  {
    GMTrace.i(290178727936L, 2162);
    xyG = new a();
    GMTrace.o(290178727936L, 2162);
  }
  
  public static final <Var1, Var2, Var3> c<com.tencent.mm.vending.j.d<Var1, Var2, Var3>> a(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3)
  {
    GMTrace.i(289104986112L, 2154);
    paramVar1 = new e().u(new Object[] { paramVar1, paramVar2, paramVar3 });
    GMTrace.o(289104986112L, 2154);
    return paramVar1;
  }
  
  public static final <Var1, Var2, Var3, Var4> c<com.tencent.mm.vending.j.e<Var1, Var2, Var3, Var4>> a(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3, Var4 paramVar4)
  {
    GMTrace.i(289239203840L, 2155);
    paramVar1 = new e().u(new Object[] { paramVar1, paramVar2, paramVar3, paramVar4 });
    GMTrace.o(289239203840L, 2155);
    return paramVar1;
  }
  
  public static final <Var1, Var2, Var3, Var4, Var5> c<com.tencent.mm.vending.j.f<Var1, Var2, Var3, Var4, Var5>> a(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3, Var4 paramVar4, Var5 paramVar5)
  {
    GMTrace.i(14907026178048L, 111066);
    paramVar1 = new e().u(new Object[] { paramVar1, paramVar2, paramVar3, paramVar4, paramVar5 });
    GMTrace.o(14907026178048L, 111066);
    return paramVar1;
  }
  
  public static final void a(b paramVarArgs)
  {
    GMTrace.i(289910292480L, 2160);
    if (paramVarArgs == null)
    {
      com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
      GMTrace.o(289910292480L, 2160);
      return;
    }
    paramVarArgs.bU(null);
    GMTrace.o(289910292480L, 2160);
  }
  
  public static final void a(b paramb, Object... paramVarArgs)
  {
    GMTrace.i(289776074752L, 2159);
    if (paramb == null)
    {
      com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
      GMTrace.o(289776074752L, 2159);
      return;
    }
    if (paramVarArgs.length > 0)
    {
      paramb.t(paramVarArgs);
      GMTrace.o(289776074752L, 2159);
      return;
    }
    paramb.resume();
    GMTrace.o(289776074752L, 2159);
  }
  
  public static final <_Var> void a(d<_Var> paramd)
  {
    GMTrace.i(290044510208L, 2161);
    b localb = ckq();
    paramd.a(new d.b()
    {
      public final void av(_Var paramAnonymous_Var)
      {
        GMTrace.i(288568115200L, 2150);
        g.a(this.qTo, new Object[] { paramAnonymous_Var });
        GMTrace.o(288568115200L, 2150);
      }
    }).a(new d.a()
    {
      public final void aH(Object paramAnonymousObject)
      {
        GMTrace.i(288299679744L, 2148);
        this.qTo.bU(paramAnonymousObject);
        GMTrace.o(288299679744L, 2148);
      }
    });
    GMTrace.o(290044510208L, 2161);
  }
  
  public static final <Var1> c<Var1> bY(Var1 paramVar1)
  {
    GMTrace.i(288836550656L, 2152);
    paramVar1 = new e().u(new Object[] { paramVar1 });
    GMTrace.o(288836550656L, 2152);
    return paramVar1;
  }
  
  public static <$1> com.tencent.mm.vending.j.b<$1> bZ($1 param$1)
  {
    GMTrace.i(289373421568L, 2156);
    new com.tencent.mm.vending.j.b();
    param$1 = com.tencent.mm.vending.j.b.ca(param$1);
    GMTrace.o(289373421568L, 2156);
    return param$1;
  }
  
  public static final b ckh()
  {
    GMTrace.i(289507639296L, 2157);
    Object localObject = f.cko();
    Stack localStack = (Stack)((f)localObject).xyF.get();
    if (localStack == null) {
      localObject = null;
    }
    while (localObject != null)
    {
      localObject = ((c)localObject).ckh();
      GMTrace.o(289507639296L, 2157);
      return (b)localObject;
      if (localStack.size() == 0) {
        localObject = null;
      } else {
        localObject = (c)((Stack)((f)localObject).xyF.get()).peek();
      }
    }
    localObject = xyG;
    GMTrace.o(289507639296L, 2157);
    return (b)localObject;
  }
  
  public static final c<Void> ckp()
  {
    GMTrace.i(288702332928L, 2151);
    c localc = new e().u(new Object[0]);
    GMTrace.o(288702332928L, 2151);
    return localc;
  }
  
  public static final b ckq()
  {
    GMTrace.i(289641857024L, 2158);
    b localb = ckh();
    if (localb != null) {
      localb.ckg();
    }
    for (;;)
    {
      GMTrace.o(289641857024L, 2158);
      return localb;
      com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
    }
  }
  
  public static final <Var1, Var2> c<com.tencent.mm.vending.j.c<Var1, Var2>> u(Var1 paramVar1, Var2 paramVar2)
  {
    GMTrace.i(288970768384L, 2153);
    paramVar1 = new e().u(new Object[] { paramVar1, paramVar2 });
    GMTrace.o(288970768384L, 2153);
    return paramVar1;
  }
  
  public static <$1, $2> com.tencent.mm.vending.j.c<$1, $2> v($1 param$1, $2 param$2)
  {
    GMTrace.i(17854581702656L, 133027);
    new com.tencent.mm.vending.j.c();
    param$1 = com.tencent.mm.vending.j.c.w(param$1, param$2);
    GMTrace.o(17854581702656L, 133027);
    return param$1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\g\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */