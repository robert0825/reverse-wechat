package com.tencent.d.b;

import android.util.SparseArray;
import com.tencent.d.b.f.h;
import com.tencent.d.b.f.j;
import com.tencent.d.b.f.k;

public final class a
{
  public static boolean Fl(int paramInt)
  {
    boolean bool = com.tencent.d.b.b.a.cpH().isInit();
    String str = (String)com.tencent.d.b.b.a.cpH().cpJ().get(paramInt);
    if ((bool) && (!com.tencent.d.a.c.f.nm(str))) {
      return com.tencent.d.a.a.bk(str, false).errCode == 0;
    }
    if (!bool)
    {
      com.tencent.d.a.c.c.w("Soter.SoterWrapperApi", "soter: not initialized yet", new Object[0]);
      return false;
    }
    com.tencent.d.a.c.c.w("Soter.SoterWrapperApi", "soter: scene not registered in init. please make sure", new Object[0]);
    return false;
  }
  
  public static void a(com.tencent.d.b.a.b<com.tencent.d.b.a.a> paramb, com.tencent.d.b.f.b paramb1)
  {
    com.tencent.d.a.c.c.i("Soter.SoterWrapperApi", "soter: request authorize provide challenge. scene: %d", new Object[] { Integer.valueOf(paramb1.gRb) });
    paramb1 = new h(paramb1);
    paramb1.yaR = paramb;
    if (!com.tencent.d.b.f.f.cpS().a(paramb1, new com.tencent.d.b.a.a())) {
      com.tencent.d.a.c.c.d("Soter.SoterWrapperApi", "soter: add requestAuthorizeAndSign task failed.", new Object[0]);
    }
  }
  
  public static void a(com.tencent.d.b.a.b<com.tencent.d.b.a.c> paramb, boolean paramBoolean, int paramInt, com.tencent.d.b.e.e parame1, com.tencent.d.b.e.e parame2)
  {
    com.tencent.d.a.c.c.i("Soter.SoterWrapperApi", "soter: starting prepare auth key: %d", new Object[] { Integer.valueOf(paramInt) });
    parame1 = new k(paramInt, parame1, parame2, paramBoolean, true);
    parame1.yaR = paramb;
    if (!com.tencent.d.b.f.f.cpS().a(parame1, new com.tencent.d.b.a.c())) {
      com.tencent.d.a.c.c.d("Soter.SoterWrapperApi", "soter: add prepareAuthKey task failed.", new Object[0]);
    }
  }
  
  public static void a(com.tencent.d.b.a.b<com.tencent.d.b.a.c> paramb, boolean paramBoolean, com.tencent.d.b.e.e parame)
  {
    com.tencent.d.a.c.c.i("Soter.SoterWrapperApi", "soter: starting prepare ask key. ", new Object[0]);
    parame = new j(parame, paramBoolean);
    parame.yaR = paramb;
    if (!com.tencent.d.b.f.f.cpS().a(parame, new com.tencent.d.b.a.c())) {
      com.tencent.d.a.c.c.d("Soter.SoterWrapperApi", "soter: add prepareAppSecureKey task failed.", new Object[0]);
    }
  }
  
  public static boolean cpG()
  {
    return (com.tencent.d.b.b.a.cpH().isInit()) && (com.tencent.d.b.b.a.cpH().cpG());
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\d\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */