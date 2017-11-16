package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.gif.a;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.f.b.c;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.f;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import junit.framework.Assert;

public class CropImageNewUI
  extends MMActivity
{
  private String filePath;
  private int jtE;
  private final int xfM;
  private final int xfN;
  private int xfO;
  private int xfP;
  private FilterImageView xfQ;
  private LinearLayout xfR;
  private CropImageView xfS;
  private ImageView xfT;
  private View xfU;
  private int xfV;
  private boolean xfW;
  private boolean xfX;
  private boolean xfY;
  
  public CropImageNewUI()
  {
    GMTrace.i(2017829322752L, 15034);
    this.xfM = 1;
    this.xfN = 0;
    this.xfP = 0;
    this.xfV = 0;
    this.xfW = false;
    this.xfX = false;
    this.xfY = false;
    this.jtE = 0;
    GMTrace.o(2017829322752L, 15034);
  }
  
  private static Bitmap a(float[][] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, CropImageView paramCropImageView)
  {
    GMTrace.i(2019439935488L, 15046);
    if (paramCropImageView == null)
    {
      GMTrace.o(2019439935488L, 15046);
      return null;
    }
    float[] arrayOfFloat = n.a(paramArrayOfFloat, new float[] { paramFloat1, paramFloat2, 1.0F });
    paramArrayOfFloat = n.a(paramArrayOfFloat, new float[] { paramFloat3, paramFloat4, 1.0F });
    int j = (int)Math.min(arrayOfFloat[0], paramArrayOfFloat[0]);
    int k = (int)Math.min(arrayOfFloat[1], paramArrayOfFloat[1]);
    int i = j;
    if (j < 0) {
      i = 0;
    }
    j = k;
    if (k < 0) {
      j = 0;
    }
    int m = (int)Math.abs(arrayOfFloat[0] - paramArrayOfFloat[0]);
    int n = (int)Math.abs(arrayOfFloat[1] - paramArrayOfFloat[1]);
    paramArrayOfFloat = new Matrix();
    switch (paramCropImageView.eLJ % 4)
    {
    }
    for (;;)
    {
      paramCropImageView = paramCropImageView.lEg;
      k = m;
      if (i + m > paramCropImageView.getWidth()) {
        k = paramCropImageView.getWidth() - i;
      }
      m = n;
      if (j + n > paramCropImageView.getHeight()) {
        m = paramCropImageView.getHeight() - j;
      }
      w.i("MicroMsg.CropImageUI", "rawWidth:%d, rawHeigth:%d, originalLX:%d, originalTY:%d, realWidth:%d, realHeight:%d", new Object[] { Integer.valueOf(paramCropImageView.getWidth()), Integer.valueOf(paramCropImageView.getHeight()), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      paramArrayOfFloat = Bitmap.createBitmap(paramCropImageView, i, j, k, m, paramArrayOfFloat, true);
      GMTrace.o(2019439935488L, 15046);
      return paramArrayOfFloat;
      paramArrayOfFloat.setRotate(0.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(90.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(180.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(270.0F, m / 2, n / 2);
    }
  }
  
  private boolean a(Bitmap paramBitmap, String paramString, boolean paramBoolean)
  {
    GMTrace.i(2019574153216L, 15047);
    if ((paramString != null) && (!paramString.equals(""))) {
      try
      {
        if (this.jtE == 1) {
          d.a(paramBitmap, 30, Bitmap.CompressFormat.JPEG, paramString, paramBoolean);
        }
        for (;;)
        {
          GMTrace.o(2019574153216L, 15047);
          return true;
          d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, paramString, paramBoolean);
        }
        GMTrace.o(2019574153216L, 15047);
      }
      catch (Exception paramBitmap)
      {
        w.printErrStackTrace("MicroMsg.CropImageUI", paramBitmap, "", new Object[0]);
        w.e("MicroMsg.CropImageUI", "saveBitmapToImage failed:" + paramBitmap.toString());
      }
    }
    return false;
  }
  
  private void b(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    GMTrace.i(2019037282304L, 15043);
    this.xfQ = ((FilterImageView)findViewById(R.h.bsA));
    com.tencent.mm.platformtools.e.bC(this.xfQ);
    this.xfQ.xgW = paramRunnable1;
    this.xfQ.xgX = paramRunnable2;
    GMTrace.o(2019037282304L, 15043);
  }
  
  private static float[][] b(Matrix paramMatrix)
  {
    GMTrace.i(2019708370944L, 15048);
    float[][] arrayOfFloat = (float[][])Array.newInstance(Float.TYPE, new int[] { 3, 3 });
    float[] arrayOfFloat1 = new float[9];
    paramMatrix.getValues(arrayOfFloat1);
    int i = 0;
    while (i < 3)
    {
      int j = 0;
      while (j < 3)
      {
        arrayOfFloat[i][j] = arrayOfFloat1[(i * 3 + j)];
        j += 1;
      }
      i += 1;
    }
    GMTrace.o(2019708370944L, 15048);
    return arrayOfFloat;
  }
  
  private boolean cic()
  {
    GMTrace.i(2018903064576L, 15042);
    Object localObject1;
    if (1 == this.xfO) {
      if (this.xfQ != null) {
        localObject1 = this.xfQ.xgQ;
      }
    }
    int n;
    int i1;
    for (;;)
    {
      n = ((View)localObject1).getWidth();
      i1 = ((View)localObject1).getHeight();
      w.v("MicroMsg.CropImageUI", "scrWidth:" + n + " scrHeight:" + i1);
      this.filePath = getIntent().getStringExtra("CropImage_ImgPath");
      if (FileOp.aZ(this.filePath)) {
        break;
      }
      finish();
      GMTrace.o(2018903064576L, 15042);
      return false;
      localObject1 = findViewById(R.h.bsC);
      continue;
      localObject1 = findViewById(R.h.bsB);
    }
    int k = 960;
    int m = 960;
    boolean bool;
    int i;
    int j;
    Object localObject2;
    if (this.xfO == 2)
    {
      bool = true;
      i = i1;
      j = n;
      this.xfV = BackwardSupportUtil.ExifHelper.Rz(this.filePath);
      if (this.xfV != 90)
      {
        m = i;
        k = j;
        if (this.xfV != 270) {}
      }
      else
      {
        k = i;
        m = j;
      }
      localObject3 = d.e(this.filePath, m, k, bool);
      localObject2 = FileOp.c(this.filePath, 0, 10);
      if (!o.bi((byte[])localObject2)) {
        break label900;
      }
    }
    float f1;
    label770:
    label894:
    label900:
    for (this.xfP = 1;; this.xfP = 0)
    {
      if (localObject3 != null) {
        break label908;
      }
      finish();
      GMTrace.o(2018903064576L, 15042);
      return false;
      if (this.xfO == 3)
      {
        localObject2 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
        localObject3 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject2);
        if (localObject3 != null) {
          ((Bitmap)localObject3).recycle();
        }
        k = ((BitmapFactory.Options)localObject2).outWidth;
        m = ((BitmapFactory.Options)localObject2).outHeight;
        f1 = 1.0F;
        if ((k > 640) || (m > 640)) {
          if (k > m)
          {
            f1 = m / k;
            j = 640;
            i = (int)(m * f1);
          }
        }
        for (;;)
        {
          w.d("MicroMsg.CropImageUI", "w:%d h:%d width:%d height:%d scale:%f", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i), Float.valueOf(f1) });
          localObject2 = (Button)findViewById(R.h.bsF);
          if (localObject2 != null) {
            ((Button)localObject2).setVisibility(8);
          }
          bool = false;
          break;
          f1 = k / m;
          i = 640;
          j = (int)(960.0F * f1);
          continue;
          i = m;
          j = k;
        }
      }
      if (this.xfO == 1)
      {
        localObject2 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
        localObject3 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject2);
        if (localObject3 != null)
        {
          w.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localObject3.toString() });
          ((Bitmap)localObject3).recycle();
        }
        if (((BitmapFactory.Options)localObject2).outWidth > ((BitmapFactory.Options)localObject2).outHeight)
        {
          k = (int)(((BitmapFactory.Options)localObject2).outWidth * 960 * 1.0D / ((BitmapFactory.Options)localObject2).outHeight);
          i = m;
          j = k;
          if (k > 1920)
          {
            j = 1920;
            i = m;
          }
        }
        for (;;)
        {
          bool = false;
          break;
          m = (int)(((BitmapFactory.Options)localObject2).outHeight * 960 * 1.0D / ((BitmapFactory.Options)localObject2).outWidth);
          i = m;
          j = k;
          if (m > 1920)
          {
            i = 1920;
            j = k;
          }
        }
      }
      localObject2 = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
      d.b((BitmapFactory.Options)localObject2);
      localObject3 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject2);
      if (localObject3 != null)
      {
        w.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localObject3.toString() });
        ((Bitmap)localObject3).recycle();
      }
      if ((t.bh(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight)) && (((BitmapFactory.Options)localObject2).outWidth > 480))
      {
        bool = true;
        this.xfW = bool;
        if ((!t.bg(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight)) || (((BitmapFactory.Options)localObject2).outHeight <= 480)) {
          break label894;
        }
      }
      for (bool = true;; bool = false)
      {
        this.xfX = bool;
        if (!this.xfW)
        {
          i = m;
          j = k;
          if (!this.xfX) {}
        }
        else
        {
          i = ((BitmapFactory.Options)localObject2).outHeight;
          j = ((BitmapFactory.Options)localObject2).outWidth;
        }
        w.e("MicroMsg.CropImageUI", "width is " + j + " height is " + i);
        bool = false;
        break;
        bool = false;
        break label770;
      }
    }
    label908:
    w.d("temBmp crop", "h:" + ((Bitmap)localObject3).getHeight() + "w: " + ((Bitmap)localObject3).getWidth());
    Bitmap localBitmap = d.b((Bitmap)localObject3, this.xfV);
    Object localObject3 = new Matrix();
    ((Matrix)localObject3).reset();
    float f4 = 1.0F;
    float f2;
    label1022:
    float f3;
    if (bool)
    {
      f1 = localBitmap.getWidth() / n;
      f2 = localBitmap.getHeight() / i1;
      if (f1 < f2)
      {
        if (n <= i1) {
          break label1298;
        }
        f2 = i1;
        f3 = f2 / localBitmap.getWidth();
        f4 = f2 / localBitmap.getHeight();
        f2 = f4;
        if (f3 > f4) {
          f2 = f3;
        }
        if (f1 < 1.0D) {
          ((Matrix)localObject3).postScale(f2, f2);
        }
      }
    }
    for (;;)
    {
      if (1 == this.xfO)
      {
        if (this.xfQ != null)
        {
          localObject1 = this.xfQ;
          if (((FilterImageView)localObject1).xgS != null) {
            ((FilterImageView)localObject1).xgS.setImageMatrix((Matrix)localObject3);
          }
          this.xfQ.xgT = localBitmap;
        }
        label1116:
        if (this.xfO != 3) {
          break label2275;
        }
        if (!o.bi((byte[])localObject2)) {
          break label2267;
        }
        this.xfP = 1;
      }
      try
      {
        localObject1 = b.aHd().cx(this.filePath, this.filePath);
        this.xfS.setImageDrawable((Drawable)localObject1);
        ((a)localObject1).start();
        ((Matrix)localObject3).reset();
        i = ((a)localObject1).getIntrinsicWidth();
        j = ((a)localObject1).getIntrinsicHeight();
        f1 = n / i;
        f2 = i1 / j;
        if (f1 >= f2) {
          break label2217;
        }
        label1208:
        f2 = i / n;
        f3 = j / i1;
        if (f2 <= f3) {
          break label2222;
        }
        label1230:
        if (f2 <= 1.0D) {
          break label2227;
        }
        ((Matrix)localObject3).postScale(f1, f1);
        ((Matrix)localObject3).postTranslate((n - i * f1) / 2.0F, (i1 - f1 * j) / 2.0F);
        label1273:
        this.xfS.setImageMatrix((Matrix)localObject3);
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          label1282:
          String str;
          w.e("MicroMsg.CropImageUI", bg.f(localException1));
        }
      }
      GMTrace.o(2018903064576L, 15042);
      return true;
      f1 = f2;
      break;
      label1298:
      f2 = n;
      break label1022;
      f1 = localBitmap.getWidth() / localBitmap.getHeight();
      f2 = localBitmap.getHeight() / localBitmap.getWidth();
      w.v("MicroMsg.CropImageUI", "whDiv is " + f1 + " hwDiv is " + f2);
      if ((f2 >= 2.0F) && (localBitmap.getHeight() >= 480))
      {
        f2 = localBitmap.getWidth() / n;
        f1 = n / localBitmap.getWidth();
        if (1 == this.xfO)
        {
          f2 = i1 / localBitmap.getHeight();
          if (f1 > f2) {}
          for (;;)
          {
            ((Matrix)localObject3).postScale(f1, f1);
            ((Matrix)localObject3).postTranslate((n - f1 * localBitmap.getWidth()) / 2.0F + ((View)localObject1).getLeft(), ((View)localObject1).getTop());
            break;
            f1 = f2;
          }
        }
        if (f2 > 1.0D)
        {
          ((Matrix)localObject3).postScale(f1, f1);
          localBitmap.getHeight();
          ((Matrix)localObject3).postTranslate((n - f1 * localBitmap.getWidth()) / 2.0F, 0.0F);
        }
        else
        {
          ((Matrix)localObject3).postScale(1.0F, 1.0F);
          if (3 == this.xfO) {
            ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth()) / 2, (i1 - localBitmap.getHeight()) / 2);
          } else {
            ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth()) / 2, 0.0F);
          }
        }
      }
      else if ((f1 >= 2.0F) && (localBitmap.getWidth() >= 480))
      {
        f1 = localBitmap.getHeight() / 480.0F;
        f2 = 480.0F / localBitmap.getHeight();
        if (1 == this.xfO)
        {
          f1 = n / localBitmap.getWidth();
          f2 = i1 / localBitmap.getHeight();
          if (f1 > f2) {}
          for (;;)
          {
            ((Matrix)localObject3).postScale(f1, f1);
            ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth() * f1) / 2.0F + ((View)localObject1).getLeft(), (i1 - f1 * localBitmap.getHeight()) / 2.0F + ((View)localObject1).getTop());
            break;
            f1 = f2;
          }
        }
        if (f1 > 1.0D)
        {
          ((Matrix)localObject3).postScale(f1, f2);
          ((Matrix)localObject3).postTranslate(0.0F, (i1 - 480) / 2);
        }
        else
        {
          ((Matrix)localObject3).postScale(1.0F, 1.0F);
          f1 = (i1 - localBitmap.getHeight()) / 2;
          w.d("MicroMsg.CropImageUI", " offsety " + f1);
          ((Matrix)localObject3).postTranslate(0.0F, f1);
        }
      }
      else
      {
        f2 = n / localBitmap.getWidth();
        f3 = i1 / localBitmap.getHeight();
        if (f2 < f3)
        {
          f1 = f2;
          label1847:
          if (f2 <= f3) {
            break label1925;
          }
        }
        for (;;)
        {
          if (1 != this.xfO) {
            break label1930;
          }
          ((Matrix)localObject3).postScale(f2, f2);
          ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth() * f2) / 2.0F + ((View)localObject1).getLeft(), (i1 - f2 * localBitmap.getHeight()) / 2.0F + ((View)localObject1).getTop());
          break;
          f1 = f3;
          break label1847;
          label1925:
          f2 = f3;
        }
        label1930:
        if (this.xfP == 1)
        {
          localObject1 = this.xfS;
          str = this.filePath;
        }
      }
    }
    for (;;)
    {
      try
      {
        ((CropImageView)localObject1).wgT = true;
        ((CropImageView)localObject1).wgU = c.fq(str, str);
        ((CropImageView)localObject1).setImageDrawable(((CropImageView)localObject1).wgU);
        this.xfS.cii();
        this.xfS.cij();
        f1 = this.xfS.cii() / n;
        f2 = this.xfS.cij() / i1;
        if (f1 > f2)
        {
          if (f1 <= 1.0D) {
            break label2338;
          }
          ((Matrix)localObject3).postScale(f1, f1);
          ((Matrix)localObject3).postTranslate((n - this.xfS.cii() * f1) / 2.0F, (i1 - f1 * this.xfS.cij()) / 2.0F);
        }
      }
      catch (Exception localException2)
      {
        ((CropImageView)localObject1).wgT = false;
        continue;
        f1 = f2;
        continue;
      }
      f2 = localBitmap.getWidth() / n;
      f3 = localBitmap.getHeight() / i1;
      if (f2 > f3) {}
      for (;;)
      {
        f3 = f4;
        if (f2 > 1.0D)
        {
          ((Matrix)localObject3).postScale(f1, f1);
          f3 = f1;
        }
        ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth() * f3) / 2.0F, (i1 - localBitmap.getHeight() * f3) / 2.0F);
        break;
        f2 = f3;
      }
      if (this.xfP == 1) {
        break label1116;
      }
      this.xfS.setImageMatrix((Matrix)localObject3);
      this.xfS.setImageBitmap(localBitmap);
      break label1116;
      label2217:
      f1 = f2;
      break label1208;
      label2222:
      f2 = f3;
      break label1230;
      label2227:
      ((Matrix)localObject3).postTranslate((n - i) / 2, (i1 - j) / 2);
      break label1273;
      label2267:
      this.xfP = 0;
      break label1282;
      label2275:
      if ((this.xfW) || (this.xfX)) {
        findViewById(R.h.bsL).setVisibility(8);
      }
      if (getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
        findViewById(R.h.bsE).setVisibility(8);
      }
      GMTrace.o(2018903064576L, 15042);
      return true;
      label2338:
      f1 = 1.0F;
    }
  }
  
  private int[] cid()
  {
    GMTrace.i(2019171500032L, 15044);
    Object localObject1 = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
    int j = ((Rect)localObject1).top;
    w.e("MicroMsg.CropImageUI", "window TitleBar.h:" + j);
    int i = j;
    if (j == 0) {
      i = j;
    }
    label316:
    for (;;)
    {
      try
      {
        localObject1 = Class.forName("com.android.internal.R$dimen");
        i = j;
        Object localObject2 = ((Class)localObject1).newInstance();
        i = j;
        int k = t.getInt(((Class)localObject1).getField("status_bar_height").get(localObject2).toString(), 0);
        i = j;
        j = getResources().getDimensionPixelSize(k);
        i = j;
        w.e("MicroMsg.CropImageUI", "sbar:" + j);
        i = j;
        localObject1 = new DisplayMetrics();
        ((WindowManager)getSystemService("window")).getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        int m = (int)(67.0F * ((DisplayMetrics)localObject1).density / 1.5D);
        j = Math.min(this.xfU.getWidth(), this.xfU.getHeight());
        int n = Math.max(this.xfU.getWidth(), this.xfU.getHeight());
        k = j - m * 2 - i;
        if (this.xfV != 0) {
          break label316;
        }
        j += i + m * 2;
        k += m;
        GMTrace.o(2019171500032L, 15044);
        return new int[] { j, n - m * 2, k, n + i + m };
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.CropImageUI", localException, "", new Object[0]);
      }
    }
  }
  
  private Bitmap eB(int paramInt1, int paramInt2)
  {
    GMTrace.i(2019305717760L, 15045);
    Bitmap localBitmap = d.e(this.filePath, paramInt2, paramInt1, true);
    Object localObject = localBitmap;
    if (this.xfV != 0)
    {
      localObject = new Matrix();
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setRotate(this.xfV, localBitmap.getWidth() / 2, localBitmap.getHeight() / 2);
      localObject = Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), localBitmap.getHeight(), (Matrix)localObject, true);
      if (localBitmap != localObject)
      {
        w.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localBitmap.toString() });
        localBitmap.recycle();
      }
    }
    w.d("MicroMsg.CropImageUI", "getcrop degree:" + this.xfV);
    GMTrace.o(2019305717760L, 15045);
    return (Bitmap)localObject;
  }
  
  protected final void MP()
  {
    GMTrace.i(2018634629120L, 15040);
    sq("");
    this.xfR = ((LinearLayout)findViewById(R.h.bsJ));
    this.xfT = ((ImageView)findViewById(R.h.bsI));
    com.tencent.mm.platformtools.e.bC(this.xfT);
    this.xfU = findViewById(R.h.bsC);
    this.xfO = getIntent().getIntExtra("CropImageMode", 0);
    final boolean bool1;
    final boolean bool2;
    Object localObject;
    Button localButton;
    int i;
    if (this.xfO != 0)
    {
      bool1 = true;
      Assert.assertTrue("the image mode must be set", bool1);
      this.jtE = getIntent().getIntExtra("CropImage_from_scene", 0);
      bool1 = getIntent().getBooleanExtra("CropImage_Filter", false);
      bool2 = getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false);
      if (bool1) {
        b(new Runnable()new Runnable
        {
          public final void run()
          {
            boolean bool = false;
            GMTrace.i(1929782493184L, 14378);
            if (CropImageNewUI.e(CropImageNewUI.this) == null)
            {
              GMTrace.o(1929782493184L, 14378);
              return;
            }
            if (CropImageNewUI.this.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false))
            {
              localObject1 = CropImageNewUI.this.getSharedPreferences(ab.bPU(), 0).edit();
              if (CropImageNewUI.e(CropImageNewUI.this).findViewById(R.h.bsz).getVisibility() == 0) {
                bool = true;
              }
              ((SharedPreferences.Editor)localObject1).putBoolean("CropImage_Filter_Show", bool);
              ((SharedPreferences.Editor)localObject1).commit();
            }
            Object localObject2 = CropImageNewUI.this.getIntent().getStringExtra("CropImage_OutputPath");
            Object localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = com.tencent.mm.compatible.util.e.fRZ + g.n(new StringBuilder().append(CropImageNewUI.o(CropImageNewUI.this)).append(System.currentTimeMillis()).toString().getBytes()) + "_fiter.jpg";
            }
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("CropImage_Compress_Img", true);
            if (CropImageNewUI.e(CropImageNewUI.this) != null) {
              ((Intent)localObject2).putExtra("CropImage_filterId", CropImageNewUI.e(CropImageNewUI.this).ppl);
            }
            if (CropImageNewUI.e(CropImageNewUI.this).ppl == 0)
            {
              ((Intent)localObject2).putExtra("CropImage_OutputPath", CropImageNewUI.o(CropImageNewUI.this));
              CropImageNewUI.this.setResult(-1, (Intent)localObject2);
            }
            for (;;)
            {
              CropImageNewUI.this.finish();
              GMTrace.o(1929782493184L, 14378);
              return;
              if (CropImageNewUI.a(CropImageNewUI.this, CropImageNewUI.e(CropImageNewUI.this).xgT, (String)localObject1))
              {
                ((Intent)localObject2).putExtra("CropImage_OutputPath", (String)localObject1);
                CropImageNewUI.this.setResult(-1, (Intent)localObject2);
              }
              else
              {
                CropImageNewUI.this.setResult(-1);
              }
            }
          }
        }, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1960384135168L, 14606);
            if (CropImageNewUI.this.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false))
            {
              CropImageNewUI.this.finish();
              GMTrace.o(1960384135168L, 14606);
              return;
            }
            CropImageNewUI.e(CropImageNewUI.this).setVisibility(8);
            CropImageNewUI.p(CropImageNewUI.this).setVisibility(0);
            CropImageNewUI.q(CropImageNewUI.this).setVisibility(((Integer)CropImageNewUI.q(CropImageNewUI.this).getTag()).intValue());
            CropImageNewUI.j(CropImageNewUI.this).setVisibility(0);
            GMTrace.o(1960384135168L, 14606);
          }
        });
      }
      this.xfY = false;
      this.xfS = ((CropImageView)findViewById(R.h.bsK));
      com.tencent.mm.platformtools.e.bC(this.xfS);
      this.xfS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2063463350272L, 15374);
          if (!CropImageNewUI.a(CropImageNewUI.this))
          {
            GMTrace.o(2063463350272L, 15374);
            return;
          }
          if ((!CropImageNewUI.b(CropImageNewUI.this)) && (!CropImageNewUI.c(CropImageNewUI.this)) && (CropImageNewUI.this.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)))
          {
            CropImageNewUI.d(CropImageNewUI.this);
            if (!CropImageNewUI.this.getSharedPreferences(ab.bPU(), 0).getBoolean("CropImage_Filter_Show", true)) {
              CropImageNewUI.e(CropImageNewUI.this).findViewById(R.h.bsz).setVisibility(4);
            }
            GMTrace.o(2063463350272L, 15374);
            return;
          }
          if (1 == CropImageNewUI.f(CropImageNewUI.this)) {
            CropImageNewUI.g(CropImageNewUI.this);
          }
          GMTrace.o(2063463350272L, 15374);
        }
      });
      this.xfS.xgB = new CropImageView.a()
      {
        public final void cie()
        {
          GMTrace.i(1941593653248L, 14466);
          CropImageNewUI.h(CropImageNewUI.this);
          GMTrace.o(1941593653248L, 14466);
        }
      };
      ((Button)findViewById(R.h.bsL)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1966558150656L, 14652);
          paramAnonymousView = CropImageNewUI.j(CropImageNewUI.this);
          if (paramAnonymousView.lEg == null)
          {
            w.w("MicroMsg.CropImageView", "rotate not done! cause: btmp is null!");
            GMTrace.o(1966558150656L, 14652);
            return;
          }
          float[] arrayOfFloat = new float[2];
          arrayOfFloat[0] = (paramAnonymousView.lEg.getWidth() / 2);
          arrayOfFloat[1] = (paramAnonymousView.lEg.getHeight() / 2);
          paramAnonymousView.getImageMatrix().mapPoints(arrayOfFloat);
          paramAnonymousView.getImageMatrix().postRotate(90.0F, arrayOfFloat[0], arrayOfFloat[1]);
          paramAnonymousView.setImageBitmap(paramAnonymousView.lEg);
          paramAnonymousView.invalidate();
          paramAnonymousView.eLJ += 1;
          GMTrace.o(1966558150656L, 14652);
        }
      });
      localObject = (Button)findViewById(R.h.bsM);
      ((Button)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1953404813312L, 14554);
          CropImageNewUI.j(CropImageNewUI.this).cig();
          GMTrace.o(1953404813312L, 14554);
        }
      });
      localButton = (Button)findViewById(R.h.bsN);
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1932601065472L, 14399);
          CropImageNewUI.j(CropImageNewUI.this).cih();
          GMTrace.o(1932601065472L, 14399);
        }
      });
      final aj localaj1 = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(1915823849472L, 14274);
          CropImageNewUI.j(CropImageNewUI.this).cig();
          GMTrace.o(1915823849472L, 14274);
          return true;
        }
      }, true);
      final aj localaj2 = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(1955418079232L, 14569);
          CropImageNewUI.j(CropImageNewUI.this).cih();
          GMTrace.o(1955418079232L, 14569);
          return true;
        }
      }, true);
      ((Button)localObject).setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(1993267478528L, 14851);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(1993267478528L, 14851);
            return false;
            localaj1.z(200L, 200L);
            continue;
            localaj1.stopTimer();
          }
        }
      });
      localButton.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(1939983040512L, 14454);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(1939983040512L, 14454);
            return false;
            localaj2.z(200L, 200L);
            continue;
            localaj2.stopTimer();
          }
        }
      });
      i = R.l.dmh;
      switch (this.xfO)
      {
      case 4: 
      default: 
        label392:
        w.d("MicroMsg.CropImageUI", "mode is  " + this.xfO);
        localObject = new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(1998367752192L, 14889);
            if ((bool1) && (bool2))
            {
              CropImageNewUI.a(CropImageNewUI.this, true);
              GMTrace.o(1998367752192L, 14889);
              return true;
            }
            switch (CropImageNewUI.f(CropImageNewUI.this))
            {
            }
            for (;;)
            {
              GMTrace.o(1998367752192L, 14889);
              return true;
              if (CropImageNewUI.e(CropImageNewUI.this) != null)
              {
                CropImageNewUI.a(CropImageNewUI.this, CropImageNewUI.e(CropImageNewUI.this).xgS, CropImageNewUI.i(CropImageNewUI.this));
              }
              else
              {
                CropImageNewUI.a(CropImageNewUI.this, CropImageNewUI.j(CropImageNewUI.this), CropImageNewUI.i(CropImageNewUI.this));
                continue;
                CropImageNewUI.k(CropImageNewUI.this);
                continue;
                CropImageNewUI.l(CropImageNewUI.this);
                continue;
                CropImageNewUI.m(CropImageNewUI.this);
                continue;
                CropImageNewUI.n(CropImageNewUI.this);
              }
            }
          }
        };
        if (this.xfO == 5) {
          a(0, R.g.aXV, (MenuItem.OnMenuItemClickListener)localObject);
        }
        break;
      }
    }
    for (;;)
    {
      if ((bool1) && (bool2)) {
        a(0, getString(R.l.dmd), (MenuItem.OnMenuItemClickListener)localObject, p.b.vLG);
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2010984218624L, 14983);
          CropImageNewUI.this.finish();
          GMTrace.o(2010984218624L, 14983);
          return true;
        }
      });
      if (this.xfO == 6)
      {
        findViewById(R.h.bsE).setVisibility(8);
        a(0, getString(R.l.dmh), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(1994878091264L, 14863);
            paramAnonymousMenuItem = new f(CropImageNewUI.this, f.xpQ, false);
            paramAnonymousMenuItem.qik = new p.c()
            {
              public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
              {
                GMTrace.i(1956089167872L, 14574);
                paramAnonymous2n.em(0, R.l.dmk);
                paramAnonymous2n.em(1, R.l.dmo);
                GMTrace.o(1956089167872L, 14574);
              }
            };
            paramAnonymousMenuItem.qil = new p.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                GMTrace.i(1956760256512L, 14579);
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
                for (;;)
                {
                  GMTrace.o(1956760256512L, 14579);
                  return;
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("CropImage_OutputPath", CropImageNewUI.this.getIntent().getStringExtra("CropImage_OutputPath"));
                  paramAnonymous2MenuItem.putExtra("OP_CODE", 1);
                  CropImageNewUI.this.setResult(-1, paramAnonymous2MenuItem);
                  CropImageNewUI.this.finish();
                  GMTrace.o(1956760256512L, 14579);
                  return;
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("CropImage_OutputPath", CropImageNewUI.this.getIntent().getStringExtra("CropImage_OutputPath"));
                  paramAnonymous2MenuItem.putExtra("OP_CODE", 2);
                  CropImageNewUI.this.setResult(-1, paramAnonymous2MenuItem);
                  CropImageNewUI.this.finish();
                }
              }
            };
            paramAnonymousMenuItem.bFk();
            GMTrace.o(1994878091264L, 14863);
            return true;
          }
        }, p.b.vLG);
      }
      GMTrace.o(2018634629120L, 15040);
      return;
      bool1 = false;
      break;
      b(new Runnable()new Runnable
      {
        public final void run()
        {
          GMTrace.i(2000649453568L, 14906);
          CropImageNewUI.a(CropImageNewUI.this, CropImageNewUI.e(CropImageNewUI.this).xgS, CropImageNewUI.e(CropImageNewUI.this).xgQ);
          CropImageNewUI.this.finish();
          GMTrace.o(2000649453568L, 14906);
        }
      }, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1931661541376L, 14392);
          CropImageNewUI.this.finish();
          GMTrace.o(1931661541376L, 14392);
        }
      });
      localObject = this.xfQ;
      if (((FilterImageView)localObject).xgS != null) {
        ((FilterImageView)localObject).xgS.xgf = false;
      }
      localObject = this.xfQ;
      if (((FilterImageView)localObject).xgS != null)
      {
        ((FilterImageView)localObject).xgS.setScaleType(ImageView.ScaleType.MATRIX);
        ((FilterImageView)localObject).xgS.cif();
      }
      localObject = this.xfQ;
      if (((FilterImageView)localObject).xgR != null) {
        ((FilterImageView)localObject).xgR.setVisibility(0);
      }
      if (this.jtE != 1) {
        break label392;
      }
      localObject = this.xfQ;
      int j = R.g.aYt;
      if (((FilterImageView)localObject).xgR == null) {
        break label392;
      }
      ((FilterImageView)localObject).xgR.setBackgroundResource(j);
      break label392;
      this.xfS.xgC = false;
      findViewById(R.h.bsy).setVisibility(8);
      findViewById(R.h.bsE).setVisibility(8);
      break label392;
      this.xfR.setVisibility(8);
      break label392;
      j = getIntent().getIntExtra("CropImage_CompressType", 1);
      boolean bool3 = getIntent().getBooleanExtra("CropImage_BHasHD", false);
      if ((j != 1) && (bool3))
      {
        findViewById(R.h.bsE).setVisibility(0);
        localObject = (Button)findViewById(R.h.bsF);
        ((Button)localObject).setBackgroundResource(R.g.aUJ);
        ((Button)localObject).setPadding(25, 8, 25, 8);
        ((Button)localObject).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(1930856235008L, 14386);
            CropImageNewUI.r(CropImageNewUI.this);
            GMTrace.o(1930856235008L, 14386);
          }
        });
        break label392;
      }
      findViewById(R.h.bsE).setVisibility(8);
      break label392;
      if (this.xfO == 4)
      {
        a(0, R.g.aXV, (MenuItem.OnMenuItemClickListener)localObject);
        findViewById(R.h.bsE).setVisibility(0);
        localButton = (Button)findViewById(R.h.bsF);
        localButton.setText(R.l.dmd);
        localButton.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(1965081755648L, 14641);
            CropImageNewUI.a(CropImageNewUI.this, true);
            GMTrace.o(1965081755648L, 14641);
          }
        });
      }
      else
      {
        a(0, getString(i), (MenuItem.OnMenuItemClickListener)localObject, p.b.vLG);
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2017963540480L, 15035);
    int i = R.i.cul;
    GMTrace.o(2017963540480L, 15035);
    return i;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(2018768846848L, 15041);
    w.d("MicroMsg.CropImageUI", "onConfigurationChanged, config.orientation = " + paramConfiguration.orientation);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      w.v("MicroMsg.CropImageUI", "onConfigurationChanged");
      this.xfS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1913273712640L, 14255);
          CropImageNewUI.a(CropImageNewUI.this);
          GMTrace.o(1913273712640L, 14255);
        }
      });
    }
    super.onConfigurationChanged(paramConfiguration);
    GMTrace.o(2018768846848L, 15041);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2018097758208L, 15036);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(2018097758208L, 15036);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2018500411392L, 15039);
    Object localObject;
    if (this.xfS != null)
    {
      localObject = this.xfS;
      if ((((CropImageView)localObject).lEg != null) && (!((CropImageView)localObject).lEg.isRecycled()))
      {
        w.i("MicroMsg.CropImageView", "recycle bitmap:%s", new Object[] { ((CropImageView)localObject).lEg.toString() });
        ((CropImageView)localObject).lEg.recycle();
      }
    }
    if (this.xfQ != null)
    {
      localObject = this.xfQ;
      ((FilterImageView)localObject).xgP = null;
      if ((((FilterImageView)localObject).xgT != null) && (!((FilterImageView)localObject).xgT.isRecycled()))
      {
        w.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { ((FilterImageView)localObject).xgT.toString() });
        ((FilterImageView)localObject).xgT.recycle();
      }
      ((FilterImageView)localObject).xgT = null;
    }
    super.onDestroy();
    w.appenderClose();
    Process.killProcess(Process.myPid());
    GMTrace.o(2018500411392L, 15039);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(2018231975936L, 15037);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    MP();
    GMTrace.o(2018231975936L, 15037);
  }
  
  public void onResume()
  {
    GMTrace.i(2018366193664L, 15038);
    super.onResume();
    setRequestedOrientation(1);
    GMTrace.o(2018366193664L, 15038);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\CropImageNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */