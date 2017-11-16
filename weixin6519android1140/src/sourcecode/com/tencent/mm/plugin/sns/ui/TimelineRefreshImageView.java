package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;

public class TimelineRefreshImageView
  extends ImageView
{
  public TimelineRefreshImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8467259588608L, 63086);
    GMTrace.o(8467259588608L, 63086);
  }
  
  public TimelineRefreshImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8467393806336L, 63087);
    GMTrace.o(8467393806336L, 63087);
  }
  
  public void buildDrawingCache(boolean paramBoolean)
  {
    GMTrace.i(8467528024064L, 63088);
    Object localObject;
    if (paramBoolean) {
      localObject = "mDrawingCache";
    }
    for (;;)
    {
      try
      {
        localObject = View.class.getDeclaredField((String)localObject);
        ((Field)localObject).setAccessible(true);
        localObject = (Bitmap)((Field)localObject).get(this);
        if (localObject != null) {
          continue;
        }
        localObject = "cache is null";
        w.d("MicroMsg.TimelineRefreshImageView", (String)localObject);
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.TimelineRefreshImageView", localException, "", new Object[0]);
        w.e("MicroMsg.TimelineRefreshImageView", "checkIfCanReuseDrawingCache error: %s", new Object[] { localException.getMessage() });
        continue;
      }
      w.d("MicroMsg.TimelineRefreshImageView", "buildDrawingCache, autoScale: %s, width: %s, height: %s, hash: %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(hashCode()) });
      super.buildDrawingCache(paramBoolean);
      GMTrace.o(8467528024064L, 63088);
      return;
      localObject = "mUnscaledDrawingCache";
      continue;
      localObject = String.format("cache.width: %s, cache.height: %s, width: %s, height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()) });
    }
  }
  
  public void destroyDrawingCache()
  {
    GMTrace.i(8467662241792L, 63089);
    super.destroyDrawingCache();
    w.d("MicroMsg.TimelineRefreshImageView", "destroyDrawingCache, width: %s, height: %s, hash: %s", new Object[] { Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(hashCode()) });
    GMTrace.o(8467662241792L, 63089);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\TimelineRefreshImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */