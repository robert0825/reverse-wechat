package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.tencent.smtt.export.external.DexLoader;
import dalvik.system.DexClassLoader;

final class y
{
  protected DexLoader xWV = null;
  
  public y(DexLoader paramDexLoader)
  {
    this.xWV = paramDexLoader;
  }
  
  public final void a(Object paramObject, Activity paramActivity, int paramInt)
  {
    this.xWV.invokeMethod(paramObject, "com.tencent.tbs.player.TbsPlayerProxy", "onActivity", new Class[] { Activity.class, Integer.TYPE }, new Object[] { paramActivity, Integer.valueOf(paramInt) });
  }
  
  public final boolean a(Object paramObject1, Bundle paramBundle, FrameLayout paramFrameLayout, Object paramObject2)
  {
    paramObject1 = this.xWV.invokeMethod(paramObject1, "com.tencent.tbs.player.TbsPlayerProxy", "play", new Class[] { Bundle.class, FrameLayout.class }, new Object[] { paramBundle, paramFrameLayout });
    if ((paramObject1 instanceof Boolean)) {
      return ((Boolean)paramObject1).booleanValue();
    }
    return false;
  }
  
  public final Object ha(Context paramContext)
  {
    DexLoader localDexLoader = this.xWV;
    DexClassLoader localDexClassLoader = this.xWV.getClassLoader();
    return localDexLoader.newInstance("com.tencent.tbs.player.TbsPlayerProxy", new Class[] { Context.class, DexClassLoader.class }, new Object[] { paramContext, localDexClassLoader });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */