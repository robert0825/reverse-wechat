package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ad;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d
{
  private static final HashMap<String, WeakReference<Bitmap>> rJi;
  
  static
  {
    GMTrace.i(12275687620608L, 91461);
    rJi = new HashMap();
    GMTrace.o(12275687620608L, 91461);
  }
  
  public static Bitmap LZ(String paramString)
  {
    GMTrace.i(12274748096512L, 91454);
    Object localObject = (WeakReference)rJi.get(paramString);
    if ((localObject != null) && (((WeakReference)localObject).get() != null) && (!((Bitmap)((WeakReference)localObject).get()).isRecycled()))
    {
      paramString = (Bitmap)((WeakReference)localObject).get();
      GMTrace.o(12274748096512L, 91454);
      return paramString;
    }
    if (FileOp.aZ(paramString)) {}
    for (localObject = com.tencent.mm.sdk.platformtools.d.decodeFile(paramString, null);; localObject = null)
    {
      if (localObject != null) {
        rJi.put(paramString, new WeakReference(localObject));
      }
      for (;;)
      {
        GMTrace.o(12274748096512L, 91454);
        return (Bitmap)localObject;
        try
        {
          Bitmap localBitmap = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
          localObject = localBitmap;
          rJi.put(paramString, new WeakReference(localBitmap));
          localObject = localBitmap;
        }
        catch (Exception paramString)
        {
          w.printErrStackTrace("MicroMsg.WebView.RemoteUtil", paramString, "", new Object[0]);
        }
      }
    }
  }
  
  public static Bitmap Ma(String paramString)
  {
    GMTrace.i(12275284967424L, 91458);
    if (bg.nm(paramString))
    {
      GMTrace.o(12275284967424L, 91458);
      return null;
    }
    Object localObject1 = (WeakReference)rJi.get(paramString);
    if ((localObject1 != null) && (((WeakReference)localObject1).get() != null) && (!((Bitmap)((WeakReference)localObject1).get()).isRecycled()))
    {
      paramString = (Bitmap)((WeakReference)localObject1).get();
      GMTrace.o(12275284967424L, 91458);
      return paramString;
    }
    localObject1 = Base64.decode(paramString, 0);
    if (localObject1 == null)
    {
      GMTrace.o(12275284967424L, 91458);
      return null;
    }
    Object localObject2 = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
    BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
    int k = ((BitmapFactory.Options)localObject2).outWidth;
    int j = ((BitmapFactory.Options)localObject2).outHeight;
    int i = Math.min(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight);
    ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
    if (i > 96)
    {
      ((BitmapFactory.Options)localObject2).inSampleSize = Math.max((int)(i * 1.0F / 96.0F), 1);
      localObject1 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
      if (localObject1 == null)
      {
        GMTrace.o(12275284967424L, 91458);
        return null;
      }
      k = ((Bitmap)localObject1).getWidth();
      j = ((Bitmap)localObject1).getHeight();
      i = Math.min(k, j);
    }
    do
    {
      localObject2 = Bitmap.createBitmap((Bitmap)localObject1, Math.max(k / 2 - i / 2, 0), Math.max(j / 2 - i / 2, 0), i, i);
      if (localObject2 != localObject1) {
        ((Bitmap)localObject1).recycle();
      }
      localObject1 = Bitmap.createScaledBitmap((Bitmap)localObject2, 96, 96, false);
      if (localObject2 != localObject1) {
        ((Bitmap)localObject2).recycle();
      }
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled())) {
        rJi.put(paramString, new WeakReference(localObject1));
      }
      GMTrace.o(12275284967424L, 91458);
      return (Bitmap)localObject1;
      localObject2 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
      localObject1 = localObject2;
    } while (localObject2 != null);
    GMTrace.o(12275284967424L, 91458);
    return null;
  }
  
  public static void a(Bundle paramBundle, String paramString1, String paramString2, e parame, Runnable paramRunnable)
  {
    GMTrace.i(12275553402880L, 91460);
    if (parame == null)
    {
      if (paramRunnable != null)
      {
        paramRunnable.run();
        GMTrace.o(12275553402880L, 91460);
      }
    }
    else
    {
      paramRunnable = new Bundle(3);
      paramRunnable.putBundle("open_ui_with_webview_ui_extras", paramBundle);
      paramRunnable.putString("open_ui_with_webview_ui_plugin_name", paramString1);
      paramRunnable.putString("open_ui_with_webview_ui_plugin_entry", paramString2);
      try
      {
        parame.d(101, paramRunnable);
        GMTrace.o(12275553402880L, 91460);
        return;
      }
      catch (RemoteException paramBundle)
      {
        w.printErrStackTrace("MicroMsg.WebView.RemoteUtil", paramBundle, "startUIWithWebViewUI, exp, pluginName %s, pluginEntry %s", new Object[] { paramString1, paramString2 });
      }
    }
    GMTrace.o(12275553402880L, 91460);
  }
  
  public static void a(com.tencent.mm.plugin.webview.stub.d paramd, int paramInt, List<String> paramList)
  {
    GMTrace.i(12274613878784L, 91453);
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(12274613878784L, 91453);
      return;
    }
    try
    {
      paramd.f(paramInt, paramList);
      GMTrace.o(12274613878784L, 91453);
      return;
    }
    catch (Exception paramd)
    {
      w.w("MicroMsg.WebView.RemoteUtil", "kvReport, ex = " + paramd.getMessage());
      GMTrace.o(12274613878784L, 91453);
    }
  }
  
  public static void a(com.tencent.mm.plugin.webview.stub.d paramd, int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12274479661056L, 91452);
    ArrayList localArrayList = new ArrayList();
    if ((paramVarArgs == null) || (paramVarArgs.length == 0))
    {
      GMTrace.o(12274479661056L, 91452);
      return;
    }
    try
    {
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        localArrayList.add(String.valueOf(paramVarArgs[i]));
        i += 1;
      }
      paramd.f(paramInt, localArrayList);
      GMTrace.o(12274479661056L, 91452);
      return;
    }
    catch (Exception paramd)
    {
      w.w("MicroMsg.WebView.RemoteUtil", "kvReport, ex = " + paramd.getMessage());
      GMTrace.o(12274479661056L, 91452);
    }
  }
  
  public static int at(String paramString, int paramInt)
  {
    GMTrace.i(12275016531968L, 91456);
    paramInt = (int)q(paramString, Long.valueOf(paramInt).longValue());
    GMTrace.o(12275016531968L, 91456);
    return paramInt;
  }
  
  public static int k(int paramInt, float paramFloat)
  {
    GMTrace.i(19395132784640L, 144505);
    paramInt = ad.d(paramInt, -16777216, paramFloat);
    GMTrace.o(19395132784640L, 144505);
    return paramInt;
  }
  
  private static long q(String paramString, long paramLong)
  {
    GMTrace.i(12275150749696L, 91457);
    if (bg.nm(paramString))
    {
      GMTrace.o(12275150749696L, 91457);
      return paramLong;
    }
    Object localObject = paramString;
    if (paramString.startsWith("#"))
    {
      localObject = paramString;
      if (paramString.length() == 4)
      {
        localObject = new StringBuilder(paramString);
        ((StringBuilder)localObject).insert(2, paramString.charAt(1));
        ((StringBuilder)localObject).insert(4, paramString.charAt(2));
        ((StringBuilder)localObject).insert(6, paramString.charAt(3));
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    try
    {
      int i = Color.parseColor((String)localObject);
      paramLong = i;
      GMTrace.o(12275150749696L, 91457);
      return 0xFFFFFFFF & paramLong;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.WebView.RemoteUtil", "Failed to parse color: %s", new Object[] { localObject });
      GMTrace.o(12275150749696L, 91457);
    }
    return paramLong;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */