package com.tencent.mm.accessibility;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public class Util
{
  public Util()
  {
    GMTrace.i(15222437838848L, 113416);
    GMTrace.o(15222437838848L, 113416);
  }
  
  public static Activity getActivityOfView(View paramView)
  {
    GMTrace.i(15222572056576L, 113417);
    if (paramView == null)
    {
      GMTrace.o(15222572056576L, 113417);
      return null;
    }
    for (paramView = paramView.getContext(); (paramView instanceof ContextWrapper); paramView = ((ContextWrapper)paramView).getBaseContext()) {
      if ((paramView instanceof Activity))
      {
        paramView = (Activity)paramView;
        GMTrace.o(15222572056576L, 113417);
        return paramView;
      }
    }
    GMTrace.o(15222572056576L, 113417);
    return null;
  }
  
  public static String getViewIdName(View paramView)
  {
    GMTrace.i(15222840492032L, 113419);
    if (paramView == null)
    {
      GMTrace.o(15222840492032L, 113419);
      return "NO_ID";
    }
    int i = paramView.getId();
    StringBuilder localStringBuilder = new StringBuilder(128);
    Object localObject;
    if (i != -1)
    {
      localObject = paramView.getResources();
      if ((resourceHasPackage(i)) && (localObject != null)) {
        switch (0xFF000000 & i)
        {
        }
      }
    }
    for (;;)
    {
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(i);
        String str = ((Resources)localObject).getResourceTypeName(i);
        localObject = ((Resources)localObject).getResourceEntryName(i);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(":");
        localStringBuilder.append(str);
        localStringBuilder.append("/");
        localStringBuilder.append((String)localObject);
      }
      catch (Throwable paramView)
      {
        continue;
      }
      paramView = localStringBuilder.toString();
      GMTrace.o(15222840492032L, 113419);
      return paramView;
      paramView = "app";
      continue;
      paramView = "android";
    }
  }
  
  public static boolean resourceHasPackage(int paramInt)
  {
    GMTrace.i(15222706274304L, 113418);
    if (paramInt >>> 24 != 0)
    {
      GMTrace.o(15222706274304L, 113418);
      return true;
    }
    GMTrace.o(15222706274304L, 113418);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\accessibility\Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */