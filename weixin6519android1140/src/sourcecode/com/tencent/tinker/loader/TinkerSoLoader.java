package com.tencent.tinker.loader;

import android.content.Intent;
import com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TinkerSoLoader
{
  public static boolean a(String paramString, ShareSecurityCheck paramShareSecurityCheck, Intent paramIntent)
  {
    paramShareSecurityCheck = (String)paramShareSecurityCheck.yiV.get("assets/so_meta.txt");
    if (paramShareSecurityCheck == null) {
      return true;
    }
    Object localObject1 = new ArrayList();
    ShareBsDiffPatchInfo.k(paramShareSecurityCheck, (ArrayList)localObject1);
    if (((ArrayList)localObject1).isEmpty()) {
      return true;
    }
    paramString = paramString + "/lib/";
    paramShareSecurityCheck = new HashMap();
    localObject1 = ((ArrayList)localObject1).iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (ShareBsDiffPatchInfo)((Iterator)localObject1).next();
      if (!ShareBsDiffPatchInfo.a((ShareBsDiffPatchInfo)localObject2))
      {
        paramIntent.putExtra("intent_patch_package_patch_check", -4);
        ShareIntentUtil.a(paramIntent, -8);
        return false;
      }
      paramShareSecurityCheck.put(((ShareBsDiffPatchInfo)localObject2).path + "/" + ((ShareBsDiffPatchInfo)localObject2).name, ((ShareBsDiffPatchInfo)localObject2).eDW);
    }
    localObject1 = new File(paramString);
    if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory()))
    {
      ShareIntentUtil.a(paramIntent, -17);
      return false;
    }
    localObject1 = paramShareSecurityCheck.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localObject2 = new File(paramString + (String)localObject2);
      if (!SharePatchFileUtil.Z((File)localObject2))
      {
        ShareIntentUtil.a(paramIntent, -18);
        paramIntent.putExtra("intent_patch_missing_lib_path", ((File)localObject2).getAbsolutePath());
        return false;
      }
    }
    paramIntent.putExtra("intent_patch_libs_path", paramShareSecurityCheck);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\TinkerSoLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */