package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.StringBuilderPrinter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@TargetApi(16)
final class t
  extends SurfaceTexture
{
  public SurfaceTexture mSurfaceTexture;
  
  public t()
  {
    super(0);
    GMTrace.i(3355980070912L, 25004);
    this.mSurfaceTexture = null;
    GMTrace.o(3355980070912L, 25004);
  }
  
  private static String Cx()
  {
    GMTrace.i(3356651159552L, 25009);
    StringBuilder localStringBuilder = new StringBuilder(256);
    StringBuilderPrinter localStringBuilderPrinter = new StringBuilderPrinter(localStringBuilder);
    Object localObject2 = ab.getContext();
    localStringBuilderPrinter.println("#accinfo.revision=" + com.tencent.mm.sdk.platformtools.e.REV);
    localStringBuilderPrinter.println("#accinfo.build=" + com.tencent.mm.sdk.platformtools.e.TIME + ":" + com.tencent.mm.sdk.platformtools.e.HOSTNAME + ":" + f.eqV);
    Object localObject3 = new StringBuilder("#accinfo.env=");
    Object localObject1;
    if (b.foreground) {
      localObject1 = "f";
    }
    for (;;)
    {
      localStringBuilderPrinter.println((String)localObject1 + ":" + Thread.currentThread().getName() + ":" + b.vgQ);
      try
      {
        localObject1 = Environment.getDataDirectory();
        localObject3 = new StatFs(((File)localObject1).getPath());
        StatFs localStatFs = new StatFs(com.tencent.mm.compatible.util.e.ghx);
        localObject1 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)((Context)localObject2).getSystemService("activity")).getMemoryClass()), ((File)localObject1).getAbsolutePath(), Integer.valueOf(((StatFs)localObject3).getBlockSize()), Integer.valueOf(((StatFs)localObject3).getBlockCount()), Integer.valueOf(((StatFs)localObject3).getAvailableBlocks()), com.tencent.mm.compatible.util.e.ghx, Integer.valueOf(localStatFs.getBlockSize()), Integer.valueOf(localStatFs.getBlockCount()), Integer.valueOf(localStatFs.getAvailableBlocks()) });
        localStringBuilderPrinter.println("#accinfo.data=" + (String)localObject1);
        localObject1 = new Date();
        localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
        localStringBuilderPrinter.println("#accinfo.crashTime=" + ((SimpleDateFormat)localObject2).format((Date)localObject1));
        localStringBuilderPrinter.println("#crashContent=");
        localObject1 = localStringBuilder.toString();
        GMTrace.o(3356651159552L, 25009);
        return (String)localObject1;
        localObject1 = "b";
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.MMSurfaceTextureWrap", "check data size failed :%s", new Object[] { localException.getMessage() });
          String str = "";
        }
      }
    }
  }
  
  public final void attachToGLContext(int paramInt)
  {
    GMTrace.i(3356785377280L, 25010);
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, attachToGLContext");
    this.mSurfaceTexture.attachToGLContext(paramInt);
    GMTrace.o(3356785377280L, 25010);
  }
  
  public final void detachFromGLContext()
  {
    GMTrace.i(3356516941824L, 25008);
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, detachFromGLContext");
    try
    {
      this.mSurfaceTexture.detachFromGLContext();
      bool = false;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          Object localObject1 = SurfaceTexture.class.getDeclaredMethod("nativeDetachFromGLContext", new Class[0]);
          ((Method)localObject1).setAccessible(true);
          int i = ((Integer)((Method)localObject1).invoke(this.mSurfaceTexture, new Object[0])).intValue();
          localObject1 = Cx() + " detect texture problem error code = " + i + ", detach = true, and error = " + bool;
          b.r(Base64.encodeToString(((String)localObject1).getBytes(), 2), "DetachFromGLContext");
          w.w("MicroMsg.MMSurfaceTextureWrap", (String)localObject1);
          w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(true), Boolean.valueOf(bool) });
          GMTrace.o(3356516941824L, 25008);
          return;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          w.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", localIllegalArgumentException, "%s", new Object[] { "detect texture problem, IllegalArgumentException" });
          String str1 = Cx() + " detect texture problem error code = 0" + ", detach = false, and error = " + bool;
          b.r(Base64.encodeToString(str1.getBytes(), 2), "DetachFromGLContext");
          w.w("MicroMsg.MMSurfaceTextureWrap", str1);
          w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(false), Boolean.valueOf(bool) });
          GMTrace.o(3356516941824L, 25008);
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          w.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", localIllegalAccessException, "%s", new Object[] { "detect texture problem, IllegalAccessException" });
          String str2 = Cx() + " detect texture problem error code = 0" + ", detach = false, and error = " + bool;
          b.r(Base64.encodeToString(str2.getBytes(), 2), "DetachFromGLContext");
          w.w("MicroMsg.MMSurfaceTextureWrap", str2);
          w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(false), Boolean.valueOf(bool) });
          GMTrace.o(3356516941824L, 25008);
          return;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          w.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", localInvocationTargetException, "%s", new Object[] { "detect texture problem, InvocationTargetException" });
          String str3 = Cx() + " detect texture problem error code = 0" + ", detach = false, and error = " + bool;
          b.r(Base64.encodeToString(str3.getBytes(), 2), "DetachFromGLContext");
          w.w("MicroMsg.MMSurfaceTextureWrap", str3);
          w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(false), Boolean.valueOf(bool) });
          GMTrace.o(3356516941824L, 25008);
          return;
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          w.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", localNoSuchMethodException, "%s", new Object[] { "detect texture problem, NoSuchMethodException" });
          String str4 = Cx() + " detect texture problem error code = 0" + ", detach = false, and error = " + bool;
          b.r(Base64.encodeToString(str4.getBytes(), 2), "DetachFromGLContext");
          w.w("MicroMsg.MMSurfaceTextureWrap", str4);
          w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(false), Boolean.valueOf(bool) });
          GMTrace.o(3356516941824L, 25008);
          return;
        }
        catch (Exception localException2)
        {
          w.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", localException2, "%s", new Object[] { "detect texture problem, Exception" });
          String str5 = Cx() + " detect texture problem error code = 0" + ", detach = false, and error = " + bool;
          b.r(Base64.encodeToString(str5.getBytes(), 2), "DetachFromGLContext");
          w.w("MicroMsg.MMSurfaceTextureWrap", str5);
          w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(false), Boolean.valueOf(bool) });
          GMTrace.o(3356516941824L, 25008);
          return;
        }
        finally
        {
          boolean bool;
          String str6 = Cx() + " detect texture problem error code = 0" + ", detach = false, and error = " + bool;
          b.r(Base64.encodeToString(str6.getBytes(), 2), "DetachFromGLContext");
          w.w("MicroMsg.MMSurfaceTextureWrap", str6);
          w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(false), Boolean.valueOf(bool) });
        }
        localException1 = localException1;
        w.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", localException1, "%s", new Object[] { "detect texture problem, RuntimeException detachFromGLContext" });
        bool = true;
      }
    }
    if (bool) {}
    GMTrace.o(3356516941824L, 25008);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(3357322248192L, 25014);
    boolean bool = this.mSurfaceTexture.equals(paramObject);
    GMTrace.o(3357322248192L, 25014);
    return bool;
  }
  
  public final long getTimestamp()
  {
    GMTrace.i(3357053812736L, 25012);
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, getTimestamp");
    long l = this.mSurfaceTexture.getTimestamp();
    GMTrace.o(3357053812736L, 25012);
    return l;
  }
  
  public final void getTransformMatrix(float[] paramArrayOfFloat)
  {
    GMTrace.i(3356919595008L, 25011);
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, getTransformMatrix");
    this.mSurfaceTexture.getTransformMatrix(paramArrayOfFloat);
    GMTrace.o(3356919595008L, 25011);
  }
  
  public final int hashCode()
  {
    GMTrace.i(3357456465920L, 25015);
    int i = this.mSurfaceTexture.hashCode();
    GMTrace.o(3357456465920L, 25015);
    return i;
  }
  
  public final void release()
  {
    GMTrace.i(3357188030464L, 25013);
    super.release();
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, release");
    this.mSurfaceTexture.release();
    GMTrace.o(3357188030464L, 25013);
  }
  
  @TargetApi(19)
  public final void releaseTexImage()
  {
    GMTrace.i(3357724901376L, 25017);
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, releaseTexImage");
    this.mSurfaceTexture.releaseTexImage();
    GMTrace.o(3357724901376L, 25017);
  }
  
  public final void setDefaultBufferSize(int paramInt1, int paramInt2)
  {
    GMTrace.i(3356248506368L, 25006);
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, setDefaultBufferSize");
    this.mSurfaceTexture.setDefaultBufferSize(paramInt1, paramInt2);
    GMTrace.o(3356248506368L, 25006);
  }
  
  public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener paramOnFrameAvailableListener)
  {
    GMTrace.i(3356114288640L, 25005);
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, setOnFrameAvailableListener");
    this.mSurfaceTexture.setOnFrameAvailableListener(paramOnFrameAvailableListener);
    GMTrace.o(3356114288640L, 25005);
  }
  
  public final String toString()
  {
    GMTrace.i(3357590683648L, 25016);
    String str = this.mSurfaceTexture.toString();
    GMTrace.o(3357590683648L, 25016);
    return str;
  }
  
  public final void updateTexImage()
  {
    GMTrace.i(3356382724096L, 25007);
    w.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, updateTexImage");
    this.mSurfaceTexture.updateTexImage();
    GMTrace.o(3356382724096L, 25007);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */