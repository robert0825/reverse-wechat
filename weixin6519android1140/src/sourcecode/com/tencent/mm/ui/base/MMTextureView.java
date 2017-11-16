package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;

@TargetApi(14)
public class MMTextureView
  extends TextureView
{
  private Field wfH;
  
  public MMTextureView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(3366851706880L, 25085);
    GMTrace.o(3366851706880L, 25085);
  }
  
  public MMTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3366717489152L, 25084);
    GMTrace.o(3366717489152L, 25084);
  }
  
  public MMTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3366583271424L, 25083);
    GMTrace.o(3366583271424L, 25083);
  }
  
  public final void cau()
  {
    GMTrace.i(3367120142336L, 25087);
    if (d.eu(16))
    {
      w.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      GMTrace.o(3367120142336L, 25087);
      return;
    }
    if (d.ev(20))
    {
      w.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      GMTrace.o(3367120142336L, 25087);
      return;
    }
    if (p.fQL.fQe == 2)
    {
      w.i("MicroMsg.MMTextureView", "do not do sly textureView, config ERROR");
      GMTrace.o(3367120142336L, 25087);
      return;
    }
    w.i("MicroMsg.MMTextureView", "detect texture problem, sly");
    try
    {
      if (this.wfH == null)
      {
        this.wfH = TextureView.class.getDeclaredField("mSurface");
        this.wfH.setAccessible(true);
      }
      SurfaceTexture localSurfaceTexture = (SurfaceTexture)this.wfH.get(this);
      if (localSurfaceTexture != null) {
        if (!(localSurfaceTexture instanceof t))
        {
          t localt = new t();
          localt.mSurfaceTexture = localSurfaceTexture;
          this.wfH.set(this, localt);
          w.i("MicroMsg.MMTextureView", "detect texture problem, wrap");
          GMTrace.o(3367120142336L, 25087);
          return;
        }
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      w.printErrStackTrace("MicroMsg.MMTextureView", localNoSuchFieldException, "", new Object[0]);
      w.e("MicroMsg.MMTextureView", "detect texture problem, NoSuchFieldException");
      GMTrace.o(3367120142336L, 25087);
      return;
      w.i("MicroMsg.MMTextureView", "detect texture problem, wrapped");
      GMTrace.o(3367120142336L, 25087);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      w.printErrStackTrace("MicroMsg.MMTextureView", localIllegalArgumentException, "", new Object[0]);
      w.e("MicroMsg.MMTextureView", "detect texture problem, IllegalArgumentException");
      GMTrace.o(3367120142336L, 25087);
      return;
      w.i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
      GMTrace.o(3367120142336L, 25087);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      w.printErrStackTrace("MicroMsg.MMTextureView", localIllegalAccessException, "", new Object[0]);
      w.e("MicroMsg.MMTextureView", "detect texture problem, IllegalAccessException");
      GMTrace.o(3367120142336L, 25087);
    }
  }
  
  @TargetApi(14)
  public void onDetachedFromWindow()
  {
    GMTrace.i(3366985924608L, 25086);
    try
    {
      super.onDetachedFromWindow();
      GMTrace.o(3366985924608L, 25086);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.MMTextureView", localException, "unkown error", new Object[0]);
      GMTrace.o(3366985924608L, 25086);
    }
  }
  
  @TargetApi(16)
  public void setSurfaceTexture(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(3367254360064L, 25088);
    super.setSurfaceTexture(paramSurfaceTexture);
    cau();
    GMTrace.o(3367254360064L, 25088);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */