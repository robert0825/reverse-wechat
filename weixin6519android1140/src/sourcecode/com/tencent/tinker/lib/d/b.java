package com.tencent.tinker.lib.d;

import android.content.Intent;
import com.tencent.tinker.lib.e.a;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public final class b
{
  public static boolean b(ApplicationLike paramApplicationLike)
  {
    if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null)) {
      throw new TinkerRuntimeException("tinkerApplication is null");
    }
    paramApplicationLike = paramApplicationLike.getTinkerResultIntent();
    if (paramApplicationLike == null) {}
    while (ShareIntentUtil.ar(paramApplicationLike) != 0) {
      return false;
    }
    return true;
  }
  
  public static String c(ApplicationLike paramApplicationLike)
  {
    if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null)) {
      throw new TinkerRuntimeException("tinkerApplication is null");
    }
    Object localObject = paramApplicationLike.getTinkerResultIntent();
    if (localObject == null) {}
    String str;
    boolean bool;
    do
    {
      return null;
      str = ShareIntentUtil.i((Intent)localObject, "intent_patch_old_version");
      localObject = ShareIntentUtil.i((Intent)localObject, "intent_patch_new_version");
      bool = ShareTinkerInternals.jdMethod_if(paramApplicationLike.getApplication());
    } while ((str == null) || (localObject == null));
    if (bool) {
      return (String)localObject;
    }
    return str;
  }
  
  public static void d(ApplicationLike paramApplicationLike)
  {
    if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null)) {
      throw new TinkerRuntimeException("tinkerApplication is null");
    }
    if (b(paramApplicationLike)) {
      a.e("Tinker.TinkerApplicationHelper", "it is not safety to clean patch when tinker is loaded, you should kill all your process after clean!", new Object[0]);
    }
    SharePatchFileUtil.f(SharePatchFileUtil.hY(paramApplicationLike.getApplication()));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\lib\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */