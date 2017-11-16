package com.tencent.mm.plugin.favorite.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.SystemClock;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.br.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.y.at;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class g
{
  private static Map<String, g.a> ldg;
  private static com.tencent.mm.a.f<String, Bitmap> ldh;
  private static y<String, Bitmap> ldi;
  public Context context;
  public e ldd;
  public HashMap<String, String[]> lde;
  private HashMap<String, String[]> ldf;
  
  static
  {
    GMTrace.i(6476676464640L, 48255);
    ldg = new HashMap();
    ldh = new com.tencent.mm.a.f(10);
    ldi = new y(20);
    GMTrace.o(6476676464640L, 48255);
  }
  
  public g(Context paramContext, int paramInt)
  {
    GMTrace.i(6474528980992L, 48239);
    this.lde = new HashMap();
    this.ldf = new HashMap();
    this.context = paramContext;
    int i = paramInt;
    if (paramInt <= 0) {
      i = 24;
    }
    this.ldd = new e(i);
    GMTrace.o(6474528980992L, 48239);
  }
  
  public static Bitmap a(final th paramth, final j paramj)
  {
    GMTrace.i(6475736940544L, 48248);
    if (!com.tencent.mm.compatible.util.f.ty())
    {
      paramth = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
      GMTrace.o(6475736940544L, 48248);
      return paramth;
    }
    if (x.xQ(paramth.lhq) == null)
    {
      GMTrace.o(6475736940544L, 48248);
      return null;
    }
    Bitmap localBitmap = a(paramth, true, false);
    if (localBitmap == null)
    {
      String str = x.h(paramth);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6482850480128L, 48301);
          if (g.xZ(this.hcI)) {
            x.b(paramj, paramth, true);
          }
          GMTrace.o(6482850480128L, 48301);
        }
        
        public final String toString()
        {
          GMTrace.i(6482984697856L, 48302);
          String str = super.toString() + "|getThumb";
          GMTrace.o(6482984697856L, 48302);
          return str;
        }
      });
    }
    GMTrace.o(6475736940544L, 48248);
    return localBitmap;
  }
  
  public static Bitmap a(final th paramth, final j paramj, boolean paramBoolean)
  {
    GMTrace.i(6475602722816L, 48247);
    if (!com.tencent.mm.compatible.util.f.ty())
    {
      paramth = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
      GMTrace.o(6475602722816L, 48247);
      return paramth;
    }
    if (paramth.lhq == null)
    {
      GMTrace.o(6475602722816L, 48247);
      return null;
    }
    Bitmap localBitmap = a(paramth, false, false);
    if (localBitmap == null)
    {
      final String str = x.g(paramth);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6492245721088L, 48371);
          if ((this.ldk) || (g.xZ(str))) {
            x.a(paramj, paramth, this.ldk);
          }
          GMTrace.o(6492245721088L, 48371);
        }
        
        public final String toString()
        {
          GMTrace.i(6492379938816L, 48372);
          String str = super.toString() + "|getBigImg";
          GMTrace.o(6492379938816L, 48372);
          return str;
        }
      });
    }
    GMTrace.o(6475602722816L, 48247);
    return localBitmap;
  }
  
  private static Bitmap a(th paramth, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6475200069632L, 48244);
    if (paramBoolean1) {}
    for (paramth = x.h(paramth); !com.tencent.mm.a.e.aZ(paramth); paramth = x.g(paramth))
    {
      w.w("MicroMsg.FavoriteImageLogic", "getBitmap file not exist");
      GMTrace.o(6475200069632L, 48244);
      return null;
    }
    paramth = c.aO(paramth, paramBoolean2);
    GMTrace.o(6475200069632L, 48244);
    return paramth;
  }
  
  public static void a(final ImageView paramImageView, int paramInt1, final th paramth, final j paramj, final boolean paramBoolean, final int paramInt2, final int paramInt3)
  {
    GMTrace.i(6476005376000L, 48250);
    if (!com.tencent.mm.compatible.util.f.ty()) {
      paramImageView.setImageBitmap(BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv));
    }
    if (paramth.lhq == null) {
      paramImageView.setImageResource(paramInt1);
    }
    Bitmap localBitmap = a(paramth, paramj);
    String str = x.g(paramth);
    if (com.tencent.mm.a.e.aZ(str)) {
      localBitmap = c(str, paramInt2, paramInt3, true);
    }
    if (localBitmap == null)
    {
      paramImageView.setImageResource(paramInt1);
      paramImageView.setTag(str);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6495332728832L, 48394);
          final Bitmap localBitmap = g.c(this.fMt, paramInt2, paramInt3, false);
          if (localBitmap == null)
          {
            g.c(paramj, paramth, paramBoolean);
            GMTrace.o(6495332728832L, 48394);
            return;
          }
          String str = (String)paramImageView.getTag();
          if ((str != null) && (str.equals(this.fMt)))
          {
            at.xB();
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6487950753792L, 48339);
                g.6.this.kBJ.setImageBitmap(localBitmap);
                GMTrace.o(6487950753792L, 48339);
              }
            });
          }
          GMTrace.o(6495332728832L, 48394);
        }
      });
      GMTrace.o(6476005376000L, 48250);
      return;
    }
    paramImageView.setImageBitmap(localBitmap);
    GMTrace.o(6476005376000L, 48250);
  }
  
  public static void a(j paramj, th paramth)
  {
    GMTrace.i(6476273811456L, 48252);
    c(paramj, paramth, true);
    GMTrace.o(6476273811456L, 48252);
  }
  
  public static Bitmap b(final th paramth, final j paramj, int paramInt)
  {
    GMTrace.i(6475334287360L, 48245);
    if (!com.tencent.mm.compatible.util.f.ty())
    {
      paramth = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
      GMTrace.o(6475334287360L, 48245);
      return paramth;
    }
    if (paramth.lhq == null)
    {
      GMTrace.o(6475334287360L, 48245);
      return null;
    }
    final String str = x.g(paramth);
    if (!com.tencent.mm.a.e.aZ(str))
    {
      w.w("MicroMsg.FavoriteImageLogic", "getBitmap file not exist");
      localObject = null;
    }
    for (;;)
    {
      if (localObject == null)
      {
        str = x.g(paramth);
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6487548100608L, 48336);
            if ((this.ldk) || (g.xZ(str))) {
              x.a(paramj, paramth, this.ldk);
            }
            GMTrace.o(6487548100608L, 48336);
          }
          
          public final String toString()
          {
            GMTrace.i(6487682318336L, 48337);
            String str = super.toString() + "|getBigImg";
            GMTrace.o(6487682318336L, 48337);
            return str;
          }
        });
      }
      GMTrace.o(6475334287360L, 48245);
      return (Bitmap)localObject;
      localObject = (Bitmap)ldh.get(str);
      if (localObject == null) {
        break;
      }
      w.d("MicroMsg.FavoriteImageLogic", "get bm from cache %s", new Object[] { str });
    }
    w.d("MicroMsg.FavoriteImageLogic", "get from cache fail, try to decode from file");
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(str, (BitmapFactory.Options)localObject);
    if (localBitmap != null)
    {
      w.i("MicroMsg.FavoriteImageLogic", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int j = ((BitmapFactory.Options)localObject).outWidth;
    int i = ((BitmapFactory.Options)localObject).outHeight;
    w.d("MicroMsg.FavoriteImageLogic", "width: %s, height: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
    if (j > paramInt) {
      i = ((BitmapFactory.Options)localObject).outHeight * paramInt / ((BitmapFactory.Options)localObject).outWidth;
    }
    for (;;)
    {
      paramInt = Math.max(1, paramInt);
      j = Math.max(1, i);
      w.w("MicroMsg.FavoriteImageLogic", "fit long picture, beg %d*%d, after %d*%d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject).outHeight), Integer.valueOf(paramInt), Integer.valueOf(j) });
      int m = BackwardSupportUtil.ExifHelper.Rz(str);
      int k;
      if (m != 90)
      {
        k = j;
        i = paramInt;
        if (m != 270) {}
      }
      else
      {
        i = j;
        k = paramInt;
      }
      localObject = d.e(str, k, i, false);
      if (localObject == null)
      {
        w.e("MicroMsg.FavoriteImageLogic", "getSuitableBmp fail, temBmp is null, filePath = " + str);
        localObject = null;
        break;
      }
      localObject = d.b((Bitmap)localObject, m);
      ldh.put(str, localObject);
      break;
      paramInt = j;
    }
  }
  
  public static Bitmap c(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(6475871158272L, 48249);
    boolean bool = false;
    if (!com.tencent.mm.a.e.aZ(paramString))
    {
      w.w("MicroMsg.FavoriteImageLogic", "file not exist");
      GMTrace.o(6475871158272L, 48249);
      return null;
    }
    Object localObject1 = (Bitmap)ldi.get(paramString);
    if ((localObject1 != null) || (paramBoolean))
    {
      if (localObject1 != null) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        w.d("MicroMsg.FavoriteImageLogic", "return bm path %s, bm %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
        GMTrace.o(6475871158272L, 48249);
        return (Bitmap)localObject1;
      }
    }
    Object localObject2 = localObject1;
    for (;;)
    {
      BitmapFactory.Options localOptions;
      int m;
      int n;
      try
      {
        localOptions = new BitmapFactory.Options();
        localObject2 = localObject1;
        localOptions.inJustDecodeBounds = true;
        localObject2 = localObject1;
        d.decodeFile(paramString, localOptions);
        localObject2 = localObject1;
        j = localOptions.outWidth;
        localObject2 = localObject1;
        m = localOptions.outHeight;
        localObject2 = localObject1;
        n = BackwardSupportUtil.ExifHelper.Rz(paramString);
        if (n == 90) {
          break label631;
        }
        i = m;
        k = j;
        paramBoolean = bool;
        if (n == 270) {
          break label631;
        }
        localObject2 = localObject1;
        localOptions.inSampleSize = 1;
        localObject2 = localObject1;
        if (i / localOptions.inSampleSize > paramInt2)
        {
          localObject2 = localObject1;
          if (k / localOptions.inSampleSize > paramInt1)
          {
            localObject2 = localObject1;
            localOptions.inSampleSize += 1;
            continue;
          }
        }
        label276:
        localObject2 = localObject1;
      }
      catch (IOException paramString)
      {
        w.e("MicroMsg.FavoriteImageLogic", paramString.getMessage());
        localObject1 = localObject2;
        GMTrace.o(6475871158272L, 48249);
        return (Bitmap)localObject1;
      }
      int j = k * paramInt2 / paramInt1;
      localObject2 = localObject1;
      w.d("MicroMsg.FavoriteImageLogic", "decode top region width: %d, height: %d, scaleheight: %d, rotate: %b", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(paramBoolean) });
      Rect localRect;
      label418:
      label454:
      float f;
      if ((j > 0) && (i > j))
      {
        localObject2 = localObject1;
        localRect = new Rect();
        localObject2 = localObject1;
        localRect.top = 0;
        localObject2 = localObject1;
        localRect.left = 0;
        if (paramBoolean)
        {
          localObject2 = localObject1;
          localRect.right = j;
          localObject2 = localObject1;
          localRect.bottom = k;
          localObject2 = localObject1;
          BitmapRegionDecoder localBitmapRegionDecoder = BitmapRegionDecoder.newInstance(paramString, true);
          localObject2 = localObject1;
          localOptions.inJustDecodeBounds = false;
          localObject2 = localObject1;
          localObject1 = localBitmapRegionDecoder.decodeRegion(localRect, localOptions);
          if ((localObject1 == null) || (!paramBoolean)) {
            break label628;
          }
          f = n;
        }
      }
      label628:
      for (;;)
      {
        try
        {
          localObject2 = d.b((Bitmap)localObject1, f);
          localObject1 = localObject2;
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            w.d("MicroMsg.FavoriteImageLogic", "width %d, height %d, tw %d, th %d", new Object[] { Integer.valueOf(((Bitmap)localObject1).getWidth()), Integer.valueOf(((Bitmap)localObject1).getHeight()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
            localObject2 = localObject1;
            ldi.put(paramString, localObject1);
            break label276;
            localObject2 = localObject1;
            localRect.right = k;
            localObject2 = localObject1;
            localRect.bottom = j;
            break label418;
            localObject2 = localObject1;
            localOptions.inJustDecodeBounds = false;
            localObject2 = localObject1;
            localObject1 = d.decodeFile(paramString, localOptions);
            break label454;
          }
          localObject2 = localObject1;
          w.w("MicroMsg.FavoriteImageLogic", "decode bm fail!");
        }
        catch (IOException paramString)
        {
          localObject2 = localObject1;
        }
        break;
      }
      label631:
      paramBoolean = true;
      int k = m;
      int i = j;
    }
  }
  
  public static void c(final j paramj, final th paramth, boolean paramBoolean)
  {
    GMTrace.i(6476139593728L, 48251);
    final String str = x.g(paramth);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6497077559296L, 48407);
        if ((this.ldk) || (g.xZ(str))) {
          x.a(paramj, paramth, this.ldk);
        }
        GMTrace.o(6497077559296L, 48407);
      }
      
      public final String toString()
      {
        GMTrace.i(6497211777024L, 48408);
        String str = super.toString() + "|reDownload";
        GMTrace.o(6497211777024L, 48408);
        return str;
      }
    });
    GMTrace.o(6476139593728L, 48251);
  }
  
  public static Bitmap i(th paramth)
  {
    GMTrace.i(6475468505088L, 48246);
    if (!com.tencent.mm.compatible.util.f.ty())
    {
      paramth = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
      GMTrace.o(6475468505088L, 48246);
      return paramth;
    }
    if (paramth.lhq == null)
    {
      GMTrace.o(6475468505088L, 48246);
      return null;
    }
    paramth = a(paramth, false, true);
    GMTrace.o(6475468505088L, 48246);
    return paramth;
  }
  
  public static boolean xZ(String paramString)
  {
    GMTrace.i(16032173391872L, 119449);
    if (new File(paramString).exists())
    {
      GMTrace.o(16032173391872L, 119449);
      return false;
    }
    g.a locala = (g.a)ldg.get(paramString);
    if (locala == null)
    {
      locala = new g.a();
      ldg.put(paramString, locala);
      GMTrace.o(16032173391872L, 119449);
      return true;
    }
    if (locala.tD() > 30000L)
    {
      w.v("MicroMsg.FavoriteImageLogic", "error diff time");
      locala.fSo = SystemClock.elapsedRealtime();
      GMTrace.o(16032173391872L, 119449);
      return true;
    }
    GMTrace.o(16032173391872L, 119449);
    return false;
  }
  
  public final void a(ImageView paramImageView, th paramth, j paramj, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(6474931634176L, 48242);
    if (paramImageView == null)
    {
      GMTrace.o(6474931634176L, 48242);
      return;
    }
    if (!com.tencent.mm.compatible.util.f.ty())
    {
      paramImageView.setImageResource(R.g.aYv);
      GMTrace.o(6474931634176L, 48242);
      return;
    }
    if (paramj == null)
    {
      GMTrace.o(6474931634176L, 48242);
      return;
    }
    Object localObject;
    switch (paramj.field_type)
    {
    case 6: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    case 14: 
    default: 
      w.w("MicroMsg.FavoriteImageLogic", "attach thumb, pass type is %d", new Object[] { Integer.valueOf(paramj.field_type) });
      GMTrace.o(6474931634176L, 48242);
      return;
    case 7: 
      if (paramth != null)
      {
        a(paramImageView, paramth, paramj, paramth.eDk, paramInt1, paramInt2, paramInt3);
        GMTrace.o(6474931634176L, 48242);
        return;
      }
      break;
    case 4: 
    case 16: 
      if (paramth != null)
      {
        a(paramImageView, paramth, paramj, paramth.eDk, paramInt1, paramInt2, paramInt3);
        GMTrace.o(6474931634176L, 48242);
        return;
      }
      break;
    case 5: 
      localObject = paramj.field_favProto.ukJ;
      if (paramth == null)
      {
        if (localObject != null) {
          this.ldd.a(paramImageView, null, ((uf)localObject).thumbUrl, paramInt1, paramInt2, paramInt3);
        }
        GMTrace.o(6474931634176L, 48242);
        return;
      }
      if (localObject == null)
      {
        localObject = null;
        if (!bg.nm((String)localObject)) {
          break label464;
        }
        localObject = paramth.eDk;
      }
      break;
    }
    label464:
    for (;;)
    {
      a(paramImageView, paramth, paramj, (String)localObject, paramInt1, paramInt2, paramInt3);
      GMTrace.o(6474931634176L, 48242);
      return;
      localObject = ((uf)localObject).thumbUrl;
      break;
      paramth = paramj.field_favProto.ukL;
      if (paramth != null)
      {
        this.ldd.a(paramImageView, null, paramth.thumbUrl, paramInt1, paramInt2, paramInt3);
        GMTrace.o(6474931634176L, 48242);
        return;
        paramth = paramj.field_favProto.ukN;
        if (paramth != null)
        {
          this.ldd.a(paramImageView, null, paramth.thumbUrl, paramInt1, paramInt2, paramInt3);
          GMTrace.o(6474931634176L, 48242);
          return;
          paramth = paramj.field_favProto.ukL;
          if (paramth != null)
          {
            this.ldd.a(paramImageView, null, paramth.thumbUrl, paramInt1, paramInt2, paramInt3);
            GMTrace.o(6474931634176L, 48242);
            return;
          }
        }
      }
      GMTrace.o(6474931634176L, 48242);
      return;
    }
  }
  
  public final void a(final ImageView paramImageView, final th paramth, final j paramj, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(6474797416448L, 48241);
    String str = x.xQ(paramth.lhq);
    String[] arrayOfString = null;
    if (paramth.lhq != null)
    {
      arrayOfString = (String[])this.ldf.get(str);
      if (arrayOfString != null) {
        break label145;
      }
      arrayOfString = new String[1];
      arrayOfString[0] = x.h(paramth);
      this.ldf.put(str, arrayOfString);
    }
    label145:
    for (;;)
    {
      this.ldd.a(paramImageView, arrayOfString, paramString, paramInt1, paramInt2, paramInt3);
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
      {
        GMTrace.o(6474797416448L, 48241);
        return;
      }
      paramImageView = arrayOfString[0];
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6478689730560L, 48270);
          if (g.xZ(paramImageView)) {
            x.b(paramj, paramth, true);
          }
          GMTrace.o(6478689730560L, 48270);
        }
        
        public final String toString()
        {
          GMTrace.i(6478823948288L, 48271);
          String str = super.toString() + "|mAttachThumb";
          GMTrace.o(6478823948288L, 48271);
          return str;
        }
      });
      GMTrace.o(6474797416448L, 48241);
      return;
    }
  }
  
  public final void b(ImageView paramImageView, th paramth, j paramj, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(6475065851904L, 48243);
    if (paramImageView == null)
    {
      GMTrace.o(6475065851904L, 48243);
      return;
    }
    if (!com.tencent.mm.compatible.util.f.ty())
    {
      paramImageView.setImageResource(R.g.aYv);
      GMTrace.o(6475065851904L, 48243);
      return;
    }
    if ((paramj == null) || (paramth == null))
    {
      paramImageView.setImageDrawable(a.b(this.context, paramInt1));
      GMTrace.o(6475065851904L, 48243);
      return;
    }
    Object localObject;
    switch (paramth.aGU)
    {
    case 6: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    default: 
      w.w("MicroMsg.FavoriteImageLogic", "attach thumb, pass type is %d", new Object[] { Integer.valueOf(paramj.field_type) });
      GMTrace.o(6475065851904L, 48243);
      return;
    case 7: 
      a(paramImageView, paramth, paramj, paramth.eDk, paramInt1, paramInt2, paramInt3);
      GMTrace.o(6475065851904L, 48243);
      return;
    case 4: 
    case 15: 
      a(paramImageView, paramth, paramj, paramth.eDk, paramInt1, paramInt2, paramInt3);
      GMTrace.o(6475065851904L, 48243);
      return;
    case 5: 
      localObject = null;
      if (paramth.ukn != null)
      {
        localObject = paramth.ukn.ukJ;
        if (localObject != null) {
          break label338;
        }
        localObject = null;
        label257:
        if (!bg.nm((String)localObject)) {
          break label649;
        }
        localObject = paramth.eDk;
      }
      break;
    }
    label338:
    label649:
    for (;;)
    {
      a(paramImageView, paramth, paramj, (String)localObject, paramInt1, paramInt2, paramInt3);
      GMTrace.o(6475065851904L, 48243);
      return;
      w.w("MicroMsg.FavoriteImageLogic", "webpage: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramth.lhq, Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_id) });
      break;
      localObject = ((uf)localObject).thumbUrl;
      break label257;
      if (paramth.ukn == null)
      {
        w.w("MicroMsg.FavoriteImageLogic", "good: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramth.lhq, Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_id) });
        GMTrace.o(6475065851904L, 48243);
        return;
      }
      paramth = paramth.ukn.ukL;
      if (paramth != null)
      {
        this.ldd.a(paramImageView, null, paramth.thumbUrl, paramInt1, paramInt2, paramInt3);
        GMTrace.o(6475065851904L, 48243);
        return;
        if (paramth.ukn == null)
        {
          w.w("MicroMsg.FavoriteImageLogic", "tv: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramth.lhq, Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_id) });
          GMTrace.o(6475065851904L, 48243);
          return;
        }
        paramth = paramth.ukn.ukN;
        if (paramth != null)
        {
          this.ldd.a(paramImageView, null, paramth.thumbUrl, paramInt1, paramInt2, paramInt3);
          GMTrace.o(6475065851904L, 48243);
          return;
          if (paramth.ukn == null)
          {
            w.w("MicroMsg.FavoriteImageLogic", "product: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramth.lhq, Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_id) });
            GMTrace.o(6475065851904L, 48243);
            return;
          }
          paramth = paramth.ukn.ukL;
          if (paramth != null)
          {
            this.ldd.a(paramImageView, null, paramth.thumbUrl, paramInt1, paramInt2, paramInt3);
            GMTrace.o(6475065851904L, 48243);
            return;
          }
        }
      }
      GMTrace.o(6475065851904L, 48243);
      return;
    }
  }
  
  public final void destory()
  {
    GMTrace.i(6474663198720L, 48240);
    e locale = this.ldd;
    synchronized (locale.gCf)
    {
      w.d("MicroMsg.ImageEngine", "do clear mark");
      locale.tGv.clear();
      locale.tGw.clear();
      locale.tGv = new HashMap();
      locale.tGw = new HashMap();
      this.lde.clear();
      this.ldf.clear();
      this.ldd.destory();
      this.context = null;
      this.lde = null;
      this.ldf = null;
      this.ldd = null;
      GMTrace.o(6474663198720L, 48240);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */