package com.tencent.mm.ui.chatting.gallery;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ao.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMJpegOptim;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.v;
import com.tencent.mm.ui.chatting.ee;
import com.tencent.mm.ui.chatting.ee.a;
import com.tencent.mm.y.at;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class d
  extends a
  implements c.a, e.a
{
  private HashMap<String, WeakReference<Bitmap>> rJi;
  private com.tencent.mm.sdk.b.c wLJ;
  public HashMap<Long, Integer> wLK;
  public final e wLL;
  private HashMap<au, String> wLM;
  private HashMap<au, String> wLN;
  private long wLO;
  int xl;
  
  public d(b paramb)
  {
    super(paramb);
    GMTrace.i(2441017819136L, 18187);
    this.wLK = new HashMap();
    this.wLL = new e(this);
    this.rJi = new HashMap();
    this.wLM = new HashMap();
    this.wLN = new HashMap();
    this.wLO = 0L;
    this.xl = 0;
    com.tencent.mm.sdk.b.a locala = com.tencent.mm.sdk.b.a.vgX;
    paramb = new ee(ee.a.wGP, paramb.wKs);
    this.wLJ = paramb;
    locala.b(paramb);
    paramb = f.a.wMd.lEb.snapshot();
    this.wLL.am(paramb);
    k.cfV().wOd = this;
    GMTrace.o(2441017819136L, 18187);
  }
  
  private static boolean Dq(int paramInt)
  {
    GMTrace.i(2444104826880L, 18210);
    if (paramInt == 1)
    {
      GMTrace.o(2444104826880L, 18210);
      return true;
    }
    GMTrace.o(2444104826880L, 18210);
    return false;
  }
  
  private static Bitmap Z(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(2443299520512L, 18204);
    Object localObject = null;
    String str = paramString + "_tmp.jpg";
    try
    {
      bool1 = com.tencent.mm.compatible.util.d.eu(16);
      if (bool1)
      {
        GMTrace.o(2443299520512L, 18204);
        return null;
      }
      bool1 = com.tencent.mm.sdk.a.b.bPq();
      if (!bool1) {
        try
        {
          i = bg.getInt(com.tencent.mm.k.g.ut().getValue("UseOptImageRecv"), 0);
          at.AR();
          o localo = new o(com.tencent.mm.y.c.ww());
          w.i("MicroMsg.ImageGalleryHolderImage", "fromPathToImgInfo opt:%d uin:(%d,%d) debug:%b sdk:%d", new Object[] { Integer.valueOf(i), Long.valueOf(localo.longValue()), Long.valueOf(localo.longValue() / 100L), Boolean.valueOf(com.tencent.mm.sdk.a.b.bPq()), Integer.valueOf(Build.VERSION.SDK_INT) });
          j = (int)(localo.longValue() / 100L);
          if (j % 100 + 1 > i)
          {
            GMTrace.o(2443299520512L, 18204);
            return null;
          }
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.ImageGalleryHolderImage", "get useopt :%s", new Object[] { bg.f(localException) });
          GMTrace.o(2443299520512L, 18204);
          return null;
        }
      }
      com.tencent.mm.sdk.platformtools.j.r(paramString, str, false);
      bool2 = MMNativeJpeg.IsJpegFile(str);
      bool3 = MMNativeJpeg.isProgressive(str);
      if (bg.nm(str)) {
        break label469;
      }
      if (new File(str).exists()) {
        break label403;
      }
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        int i;
        int j;
        boolean bool2;
        boolean bool3;
        Bitmap localBitmap = null;
        w.e("MicroMsg.ImageGalleryHolderImage", "dkprog tryUseImageOpt failed. file:%s e:%s", new Object[] { paramString, bg.f(localThrowable1) });
        continue;
        localBitmap = null;
        continue;
        boolean bool1 = false;
      }
    }
    j = com.tencent.mm.a.e.aY(str);
    if ((bool2) && (bool3))
    {
      if (bool1) {
        localBitmap = MMNativeJpeg.decodeAsBitmap(str);
      }
      if (localBitmap != null) {}
      for (i = j;; i = 0 - j)
      {
        try
        {
          a.j(paramString, paramInt2, paramInt1, i);
        }
        catch (Throwable localThrowable2)
        {
          label403:
          for (;;) {}
        }
        try
        {
          w.i("MicroMsg.ImageGalleryHolderImage", "dkprog tryUseImageOpt jpeg:%b isprog:%b inte:%b len:%d [%d,%d] bm:%s path:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1), Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), localBitmap, paramString });
          com.tencent.mm.loader.stub.b.deleteFile(str);
          GMTrace.o(2443299520512L, 18204);
          return localBitmap;
        }
        catch (Throwable localThrowable3)
        {
          break label426;
        }
        bool1 = MMJpegOptim.checkIntegrity(str);
        break;
      }
    }
  }
  
  private int a(long paramLong, Object paramObject)
  {
    GMTrace.i(2443836391424L, 18208);
    int i;
    if ((paramObject instanceof Integer))
    {
      i = ((Integer)paramObject).intValue();
      paramObject = this.wKr.Dd(i);
      if ((paramObject != null) && (((ce)paramObject).field_msgId == paramLong))
      {
        GMTrace.o(2443836391424L, 18208);
        return i;
      }
    }
    paramObject = this.wKr.wgm.values().iterator();
    while (((Iterator)paramObject).hasNext())
    {
      i = ((Integer)((Iterator)paramObject).next()).intValue();
      au localau = this.wKr.Dd(i);
      if ((localau != null) && (localau.field_msgId == paramLong))
      {
        GMTrace.o(2443836391424L, 18208);
        return i;
      }
    }
    GMTrace.o(2443836391424L, 18208);
    return -1;
  }
  
  public static String a(au paramau, com.tencent.mm.ao.d paramd, boolean paramBoolean)
  {
    GMTrace.i(2443433738240L, 18205);
    if (paramau.field_isSend == 1)
    {
      paramau = n.IZ().d(paramd);
      paramau = n.IZ().l(paramau, "", "");
      if (com.tencent.mm.a.e.aZ(paramau))
      {
        GMTrace.o(2443433738240L, 18205);
        return paramau;
      }
      paramau = paramd.gGS;
      paramau = n.IZ().l(paramau, "", "");
      if (com.tencent.mm.a.e.aZ(paramau))
      {
        GMTrace.o(2443433738240L, 18205);
        return paramau;
      }
      GMTrace.o(2443433738240L, 18205);
      return null;
    }
    if ((!paramBoolean) && (!paramd.IH()))
    {
      w.w("MicroMsg.ImageGalleryHolderImage", "getImagePath is null because of isTryToGetProgress %s img.isGetCompleted() %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(paramd.IH()) });
      GMTrace.o(2443433738240L, 18205);
      return null;
    }
    String str = paramd.gGS;
    if (paramd.II())
    {
      paramau = n.IZ().d(paramd);
      if (paramau != null)
      {
        paramau = n.IZ().l(paramau, "", "");
        if (com.tencent.mm.a.e.aZ(paramau)) {
          w.i("MicroMsg.ImageGalleryHolderImage", "hasHdImg");
        }
      }
    }
    for (;;)
    {
      paramd = paramau;
      if (paramau == null) {
        paramd = n.IZ().l(str, "", "");
      }
      w.i("MicroMsg.ImageGalleryHolderImage", "the path : %s", new Object[] { paramd });
      GMTrace.o(2443433738240L, 18205);
      return paramd;
      paramau = null;
    }
  }
  
  private static void a(au paramau, j paramj, int paramInt)
  {
    GMTrace.i(19188840136704L, 142968);
    w.i("MicroMsg.ImageGalleryHolderImage", "edw dealFail", new Object[0]);
    String str = n.IZ().x(paramau.field_imgPath, true);
    j.M(paramj.wNQ, 8);
    j.M(paramj.wNL, 8);
    j.M(paramj.wNU, 8);
    paramj.cfS().wNR.setVisibility(0);
    paramj.cfS().wNT.setImageResource(R.k.cMO);
    if ((str == null) || (!com.tencent.mm.a.e.aZ(str)))
    {
      paramj.cfS().wNS.setText(R.l.dCX);
      GMTrace.o(19188840136704L, 142968);
      return;
    }
    if (paramInt == 6)
    {
      paramj.cfS().wNS.setText(R.l.dCV);
      GMTrace.o(19188840136704L, 142968);
      return;
    }
    if (paramau.bTO())
    {
      paramj.cfS().wNS.setText(R.l.dCT);
      GMTrace.o(19188840136704L, 142968);
      return;
    }
    paramj.cfS().wNS.setText(R.l.dCU);
    GMTrace.o(19188840136704L, 142968);
  }
  
  private static void a(au paramau, String paramString, boolean paramBoolean)
  {
    GMTrace.i(2443970609152L, 18209);
    w.i("MicroMsg.ImageGalleryHolderImage", "[oreh download_and_save] hdImg end, msgLocalId:%d, %s", new Object[] { Long.valueOf(paramau.field_msgId), paramString });
    b.b(ab.getContext(), paramau, paramBoolean);
    GMTrace.o(2443970609152L, 18209);
  }
  
  private void a(j paramj, au paramau, com.tencent.mm.ao.d paramd, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(2442359996416L, 18197);
    a(paramj, paramau, paramd, paramBoolean, true, paramInt);
    GMTrace.o(2442359996416L, 18197);
  }
  
  private void a(j paramj, au paramau, com.tencent.mm.ao.d paramd, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    GMTrace.i(2442494214144L, 18198);
    w.i("MicroMsg.ImageGalleryHolderImage", "edw dealDownloading, isHd = " + paramBoolean1);
    j.M(paramj.wNR, 8);
    String str = null;
    if (!paramBoolean1) {
      paramj.wNU.setVisibility(0);
    }
    com.tencent.mm.ao.d locald = com.tencent.mm.ao.e.a(paramd);
    if ((paramBoolean1) && (paramInt == this.wKr.wKs.cfB()))
    {
      localObject = this.wKr.wKs;
      ((ImageGalleryUI)localObject).eO(true);
      ((ImageGalleryUI)localObject).cfA();
      ((ImageGalleryUI)localObject).cfp().wMt.setVisibility(0);
      ((ImageGalleryUI)localObject).cfp().wMu.setVisibility(8);
      ((ImageGalleryUI)localObject).cfp().wMv.setVisibility(0);
      ((ImageGalleryUI)localObject).cfp().wMw.setVisibility(8);
      ((ImageGalleryUI)localObject).cfE();
      ((ImageGalleryUI)localObject).cfF();
      ((ImageGalleryUI)localObject).cfp().wMv.setText("0%");
    }
    if (paramBoolean1) {
      str = a(paramau, paramd, true);
    }
    Object localObject = str;
    if (bg.nm(str)) {
      localObject = n.IZ().l(locald.gGU, "", "");
    }
    str = n.IZ().x(paramau.field_imgPath, true);
    if (paramBoolean2) {
      a(paramj, str, (String)localObject, paramau);
    }
    long l;
    if (!paramBoolean1)
    {
      paramInt = paramd.gsL;
      int i = paramd.offset;
      if (paramInt == 0) {
        break label357;
      }
      l = i * 100L / paramInt - 1L;
      if (Math.max(1, (int)l) <= 50) {
        break label363;
      }
      paramj.cfR().wNQ.setVisibility(8);
    }
    for (;;)
    {
      paramj.cfR().wNO.setVisibility(8);
      paramj.cfR().wNN.setVisibility(8);
      paramj.cfR().wNM.setVisibility(8);
      GMTrace.o(2442494214144L, 18198);
      return;
      label357:
      l = 0L;
      break;
      label363:
      paramj.cfR().wNQ.setVisibility(0);
    }
  }
  
  private boolean a(j paramj, au paramau, com.tencent.mm.ao.d paramd, int paramInt)
  {
    GMTrace.i(2442225778688L, 18196);
    w.i("MicroMsg.ImageGalleryHolderImage", "edw dealSucc");
    String str2 = c(paramau, paramd);
    j.M(paramj.wNQ, 8);
    String str1 = (String)this.wLN.get(paramau);
    paramd = str1;
    if (str1 == null)
    {
      paramd = n.IZ().x(paramau.field_imgPath, true);
      this.wLN.put(paramau, paramd);
    }
    boolean bool = a(paramj, paramd, str2, paramau);
    if ((paramInt == this.wKr.wKs.cfB()) && (this.wKr.wKw))
    {
      this.wKr.bg(paramau);
      this.wKr.wKw = false;
    }
    GMTrace.o(2442225778688L, 18196);
    return bool;
  }
  
  private boolean a(j paramj, String paramString1, String paramString2, au paramau)
  {
    GMTrace.i(2442762649600L, 18200);
    j.M(paramj.wNU, 0);
    j.M(paramj.wNL, 8);
    j.M(paramj.wNQ, 8);
    j.M(paramj.wNR, 8);
    boolean bool = a(true, paramj.wNU, paramString1, paramString2, false, paramj.jP);
    GMTrace.o(2442762649600L, 18200);
    return bool;
  }
  
  private boolean a(boolean paramBoolean1, MultiTouchImageView paramMultiTouchImageView, String paramString1, String paramString2, boolean paramBoolean2, int paramInt)
  {
    GMTrace.i(2442896867328L, 18201);
    w.i("MicroMsg.ImageGalleryHolderImage", "initImageView image : %s bigImgPath %s position : %s", new Object[] { Integer.valueOf(paramMultiTouchImageView.hashCode()), paramString2, Integer.valueOf(paramInt) });
    String str = null;
    boolean bool = true;
    if ((paramString2 != null) && (com.tencent.mm.a.e.aZ(paramString2)))
    {
      str = paramString2;
      if ((str != null) || (paramString1 == null) || (!com.tencent.mm.a.e.aZ(paramString1))) {
        break label458;
      }
      if (!com.tencent.mm.a.e.aZ(paramString1 + "hd")) {
        break label452;
      }
      str = paramString1 + "hd";
    }
    label452:
    label458:
    for (;;)
    {
      if (str == null)
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "getSuitableBmp fail, file does not exist, filePath %s", new Object[] { paramString2 });
        GMTrace.o(2442896867328L, 18201);
        return false;
        bool = false;
        break;
      }
      Object localObject;
      if ((!paramBoolean2) && (this.wLL.lEb.ba(str)))
      {
        localObject = (Bitmap)this.wLL.lEb.get(str);
        if (!((Bitmap)localObject).isRecycled())
        {
          w.i("MicroMsg.ImageGalleryHolderImage", "use cache, fillBitmap path : %s", new Object[] { str });
          b(paramMultiTouchImageView, (Bitmap)localObject);
          GMTrace.o(2442896867328L, 18201);
          return true;
        }
      }
      if (paramBoolean1) {
        paramMultiTouchImageView.setImageBitmap(null);
      }
      if (!this.wKr.wKC) {
        if (paramInt >= 0) {
          this.wLL.b(paramMultiTouchImageView, paramInt);
        }
      }
      do
      {
        paramString1 = this.wLL;
        if (!paramString1.sp.contains(str))
        {
          paramInt = paramMultiTouchImageView.hashCode();
          paramString1.ou(paramInt);
          paramString1.lDY.put(str, Integer.valueOf(paramInt));
          paramString1.lDZ.put(paramInt, str);
          paramString1.lDX.put(paramInt, new WeakReference(paramMultiTouchImageView));
          paramString1.sp.add(str);
          paramString1.aDB();
        }
        GMTrace.o(2442896867328L, 18201);
        return bool;
        Bitmap localBitmap = Ws(str);
        localObject = localBitmap;
        if (localBitmap == null) {
          localObject = Ws(paramString1);
        }
      } while (localObject == null);
      c(paramMultiTouchImageView, (Bitmap)localObject);
      if (str.equals(paramString2)) {
        this.wLL.t(str, (Bitmap)localObject);
      }
      GMTrace.o(2442896867328L, 18201);
      return bool;
      str = paramString1;
    }
  }
  
  @TargetApi(11)
  private void b(MultiTouchImageView paramMultiTouchImageView, Bitmap paramBitmap)
  {
    GMTrace.i(2444507480064L, 18213);
    if ((this.wKr == null) || (this.wKr.wKs == null))
    {
      GMTrace.o(2444507480064L, 18213);
      return;
    }
    w.i("MicroMsg.ImageGalleryHolderImage", "fillBitmap image : %s bmp %s", new Object[] { Integer.valueOf(paramMultiTouchImageView.hashCode()), Integer.valueOf(paramBitmap.hashCode()) });
    if (Build.VERSION.SDK_INT == 20) {
      paramMultiTouchImageView.setLayerType(1, null);
    }
    for (;;)
    {
      paramMultiTouchImageView.qbc = false;
      paramMultiTouchImageView.eo(paramBitmap.getWidth(), paramBitmap.getHeight());
      paramMultiTouchImageView.setImageBitmap(null);
      paramMultiTouchImageView.setImageBitmap(paramBitmap);
      paramMultiTouchImageView.invalidate();
      GMTrace.o(2444507480064L, 18213);
      return;
      com.tencent.mm.sdk.platformtools.k.i((View)paramMultiTouchImageView.getParent(), paramBitmap.getWidth(), paramBitmap.getHeight());
    }
  }
  
  public static com.tencent.mm.ao.d bm(au paramau)
  {
    GMTrace.i(2441823125504L, 18193);
    if (!b.aX(paramau))
    {
      GMTrace.o(2441823125504L, 18193);
      return null;
    }
    long l;
    com.tencent.mm.ao.d locald1;
    if (paramau.field_isSend == 1)
    {
      l = paramau.field_msgId;
      com.tencent.mm.ao.d locald2 = n.IZ().aq(l);
      locald1 = locald2;
      if (locald2.gGR != 0L) {}
    }
    else
    {
      l = paramau.field_msgSvrId;
      locald1 = n.IZ().ap(l);
    }
    GMTrace.o(2441823125504L, 18193);
    return locald1;
  }
  
  private String c(au paramau, com.tencent.mm.ao.d paramd)
  {
    GMTrace.i(2442091560960L, 18195);
    String str2 = (String)this.wLM.get(paramau);
    String str1 = str2;
    if (str2 == null)
    {
      str1 = a(paramau, paramd, false);
      if ((str1 == null) || (str1.length() == 0))
      {
        GMTrace.o(2442091560960L, 18195);
        return null;
      }
      this.wLM.put(paramau, str1);
    }
    GMTrace.o(2442091560960L, 18195);
    return str1;
  }
  
  private void h(au paramau, int paramInt)
  {
    GMTrace.i(2441420472320L, 18190);
    this.wLK.put(Long.valueOf(paramau.field_msgId), Integer.valueOf(paramInt));
    GMTrace.o(2441420472320L, 18190);
  }
  
  private void x(long paramLong, int paramInt)
  {
    GMTrace.i(2441554690048L, 18191);
    this.wLK.put(Long.valueOf(paramLong), Integer.valueOf(paramInt));
    GMTrace.o(2441554690048L, 18191);
  }
  
  public final Bitmap Dr(int paramInt)
  {
    GMTrace.i(2444641697792L, 18214);
    if (this.wKr == null)
    {
      GMTrace.o(2444641697792L, 18214);
      return null;
    }
    au localau = this.wKr.wKt.Do(paramInt);
    if (localau != null)
    {
      String str = (String)this.wLN.get(localau);
      Object localObject = str;
      if (str == null)
      {
        localObject = n.IZ().x(localau.field_imgPath, true);
        this.wLN.put(localau, localObject);
      }
      str = (String)localObject + "hd";
      if (com.tencent.mm.a.e.aZ(str))
      {
        localObject = Ws(str);
        GMTrace.o(2444641697792L, 18214);
        return (Bitmap)localObject;
      }
      localObject = Ws((String)localObject);
      GMTrace.o(2444641697792L, 18214);
      return (Bitmap)localObject;
    }
    GMTrace.o(2444641697792L, 18214);
    return null;
  }
  
  public final Bitmap Ws(String paramString)
  {
    GMTrace.i(2443165302784L, 18203);
    if (paramString == null)
    {
      GMTrace.o(2443165302784L, 18203);
      return null;
    }
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject);
    if (localBitmap != null)
    {
      w.i("MicroMsg.ImageGalleryHolderImage", "recycle bitmap:%s", new Object[] { localBitmap.toString() });
      localBitmap.recycle();
    }
    int i;
    int j;
    label135:
    boolean bool;
    if ((t.bh(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outWidth > 480))
    {
      i = 1;
      if ((!t.bg(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) || (((BitmapFactory.Options)localObject).outHeight <= 480)) {
        break label288;
      }
      j = 1;
      if ((i != 0) || (j != 0))
      {
        i = ((BitmapFactory.Options)localObject).outHeight;
        i = ((BitmapFactory.Options)localObject).outWidth;
      }
      i = BackwardSupportUtil.ExifHelper.Rz(paramString);
      localBitmap = Z(paramString, ((BitmapFactory.Options)localObject).outHeight, ((BitmapFactory.Options)localObject).outWidth);
      localObject = localBitmap;
      if (localBitmap == null) {
        localObject = com.tencent.mm.sdk.platformtools.d.cF(paramString, 0);
      }
      if ((localObject != null) || (!MMNativeJpeg.IsJpegFile(paramString)) || (!MMNativeJpeg.isProgressive(paramString))) {
        break label362;
      }
      localObject = MMNativeJpeg.decodeAsBitmap(paramString);
      if (localObject != null) {
        break label293;
      }
      bool = true;
      label225:
      w.i("MicroMsg.ImageGalleryHolderImage", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(bool) });
    }
    label288:
    label293:
    label362:
    for (;;)
    {
      if (localObject == null)
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "getSuitableBmp fail, temBmp is null, filePath = " + paramString);
        GMTrace.o(2443165302784L, 18203);
        return null;
        i = 0;
        break;
        j = 0;
        break label135;
        bool = false;
        break label225;
      }
      paramString = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject, i);
      if ((paramString == localObject) && (i % 360 != 0))
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "rotate failed degree:%d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(2443165302784L, 18203);
        return null;
      }
      GMTrace.o(2443165302784L, 18203);
      return paramString;
    }
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(2444239044608L, 18211);
    if (!(paramObject instanceof Integer))
    {
      w.e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
      GMTrace.o(2444239044608L, 18211);
      return;
    }
    paramInt1 = ((Integer)paramObject).intValue();
    w.i("MicroMsg.ImageGalleryHolderImage", "image task canceled at pos " + paramInt1, new Object[0]);
    GMTrace.o(2444239044608L, 18211);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2443567955968L, 18206);
    if ((this.wKr == null) || (this.wKr.wKs == null))
    {
      GMTrace.o(2443567955968L, 18206);
      return;
    }
    if (this.xl != 0)
    {
      GMTrace.o(2443567955968L, 18206);
      return;
    }
    int i;
    if (k.cfV().fk(paramLong2))
    {
      i = a(paramLong2, paramObject);
      if (i == -1)
      {
        GMTrace.o(2443567955968L, 18206);
        return;
      }
      paramObject = new Integer(i);
    }
    for (;;)
    {
      if (!(paramObject instanceof Integer))
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
        GMTrace.o(2443567955968L, 18206);
        return;
      }
      i = ((Integer)paramObject).intValue();
      w.i("MicroMsg.ImageGalleryHolderImage", "onImgTaskProgress, pos[%d], offset[%d], totalLen[%d], resId[%d], compressType[%d], imgLocalId[%d],", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Long.valueOf(paramLong1) });
      if (i == -1)
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "onImgTaskProgress, pos is -1");
        GMTrace.o(2443567955968L, 18206);
        return;
      }
      if (this.wKr.Cd(i) == null)
      {
        GMTrace.o(2443567955968L, 18206);
        return;
      }
      paramObject = (j)this.wKr.Cd(i).getTag();
      if (paramObject == null)
      {
        GMTrace.o(2443567955968L, 18206);
        return;
      }
      if ((i == this.wKr.wKs.cfB()) && (!Dq(paramInt1))) {
        this.wKr.wKs.eO(false);
      }
      if (paramInt3 == 0)
      {
        paramInt2 = 0;
        paramInt2 = Math.max(1, paramInt2);
        if ((i == this.wKr.wKs.cfB()) && (Dq(paramInt1)))
        {
          w.i("MicroMsg.ImageGalleryHolderImage", "jacks loading hd from progress : %d, time: %d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()) });
          this.wKr.wKs.Dx(paramInt2);
        }
        paramk = (com.tencent.mm.ao.j)paramk;
        boolean bool1 = MMNativeJpeg.isProgressive(paramk.gIs);
        boolean bool2 = paramk.gIu;
        paramLong1 = bg.aI(this.wLO);
        a.cZ(paramk.gIs, paramInt4);
        w.i("MicroMsg.ImageGalleryHolderImage", "dkprog onImgTaskProgress getCanShow:%b isProg:%b timeDiff:%d  [%d/%d] %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Long.valueOf(paramLong1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramk.gIs });
        if ((!bool2) || (!bool1) || (paramLong1 <= 1000L)) {
          break label691;
        }
        this.wLO = bg.Pw();
        paramk = this.wKr.Dd(i);
        com.tencent.mm.ao.d locald = f(paramk, true);
        if (!a(false, ((j)paramObject).wNU, n.IZ().x(paramk.field_imgPath, true), a(paramk, locald, true), true, -1)) {
          break label691;
        }
        j.M(((j)paramObject).wNU, 0);
        j.M(((j)paramObject).wNO, 8);
        j.M(((j)paramObject).wNR, 8);
        if ((i != this.wKr.wKs.cfB()) || (Dq(paramInt1))) {
          break label691;
        }
        if (paramInt2 > 50)
        {
          j.M(((j)paramObject).wNQ, 8);
          GMTrace.o(2443567955968L, 18206);
        }
      }
      else
      {
        if (paramInt4 != 0) {}
        for (float f = paramInt3 / paramInt4 * 100.0F - 1.0F;; f = 0.0F)
        {
          paramInt2 = (int)f;
          break;
        }
      }
      j.M(((j)paramObject).wNQ, 0);
      label691:
      GMTrace.o(2443567955968L, 18206);
      return;
    }
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, final int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2443702173696L, 18207);
    if ((this.wKr == null) || (this.wKr.wKs == null))
    {
      GMTrace.o(2443702173696L, 18207);
      return;
    }
    if (k.cfV().fk(paramLong2))
    {
      paramInt2 = a(paramLong2, paramObject);
      if (paramInt2 == -1)
      {
        at.AR();
        a(com.tencent.mm.y.c.yM().cM(paramLong2), "background", false);
        GMTrace.o(2443702173696L, 18207);
        return;
      }
      paramObject = new Integer(paramInt2);
    }
    for (;;)
    {
      if (!(paramObject instanceof Integer))
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
        GMTrace.o(2443702173696L, 18207);
        return;
      }
      paramInt2 = ((Integer)paramObject).intValue();
      w.i("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, pos = " + paramInt2);
      if (paramInt2 == -1)
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, pos is -1");
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 3L, 1L, true);
        GMTrace.o(2443702173696L, 18207);
        return;
      }
      if (this.wKr.Cd(paramInt2) != null) {}
      for (paramObject = (j)this.wKr.Cd(paramInt2).getTag();; paramObject = null)
      {
        boolean bool = k.cfV().fk(paramLong2);
        if ((paramInt3 != 0) || (paramInt4 != 0))
        {
          if (bool)
          {
            paramObject = this.wKr.Dd(paramInt2);
            paramString = "hd_failed:" + paramInt2;
            if (paramInt2 == this.wKr.wKs.cfB())
            {
              bool = true;
              a((au)paramObject, paramString, bool);
            }
          }
          else
          {
            if (paramInt2 == this.wKr.wKs.cfB()) {
              this.wKr.wKs.eO(true);
            }
            if (paramInt4 != -5103059) {
              break label424;
            }
            x(paramLong2, 5);
            com.tencent.mm.plugin.report.service.g.ork.a(111L, 0L, 1L, true);
          }
          for (;;)
          {
            w.e("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, errType = " + paramInt3 + ", errCode = " + paramInt4);
            this.wKr.wKx.Dc(paramInt2);
            GMTrace.o(2443702173696L, 18207);
            return;
            bool = false;
            break;
            label424:
            x(paramLong2, 6);
            com.tencent.mm.plugin.report.service.g.ork.a(111L, 1L, 1L, true);
          }
        }
        if (bool)
        {
          paramString = this.wKr.Dd(paramInt2);
          paramk = "hd_suc:" + paramInt2;
          if (paramInt2 == this.wKr.wKs.cfB())
          {
            bool = true;
            a(paramString, paramk, bool);
          }
        }
        else
        {
          w.i("MicroMsg.ImageGalleryHolderImage", "pos = " + paramInt2 + ", selectedPos = " + this.wKr.wKs.cfB(), new Object[0]);
          x(paramLong2, 4);
          paramString = this.wKr.Dd(paramInt2);
          paramk = f(paramString, true);
          if (paramObject == null) {
            break label902;
          }
          this.wKr.wKs.eO(true);
          if (paramInt2 == this.wKr.wKs.cfB())
          {
            if (!Dq(paramInt1)) {
              break label858;
            }
            ImageGalleryUI localImageGalleryUI = this.wKr.wKs;
            localImageGalleryUI.eO(true);
            localImageGalleryUI.eO(true);
            Animation localAnimation = ImageGalleryUI.Dw(1000);
            localAnimation.setAnimationListener(new ImageGalleryUI.10(localImageGalleryUI));
            localImageGalleryUI.cfA();
            localImageGalleryUI.cfp().wMt.setVisibility(0);
            localImageGalleryUI.cfp().wMu.setVisibility(8);
            localImageGalleryUI.cfp().wMv.setVisibility(8);
            localImageGalleryUI.cfp().wMw.setVisibility(0);
            localImageGalleryUI.cfp().wMw.startAnimation(localAnimation);
          }
        }
        for (;;)
        {
          if (!a(false, ((j)paramObject).wNU, n.IZ().x(paramString.field_imgPath, true), a(paramString, paramk, true), true, -1)) {
            break label880;
          }
          j.M(((j)paramObject).wNU, 0);
          j.M(((j)paramObject).wNL, 8);
          j.M(((j)paramObject).wNQ, 8);
          j.M(((j)paramObject).wNR, 8);
          if ((bl(paramString) != 4) || (!this.wKr.wKw)) {
            break label902;
          }
          this.wKr.bg(paramString);
          this.wKr.wKw = false;
          GMTrace.o(2443702173696L, 18207);
          return;
          bool = false;
          break;
          label858:
          ((j)paramObject).wNU.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2446252310528L, 18226);
              if ((d.this.wKr == null) || (d.this.wKr.wKs == null))
              {
                GMTrace.o(2446252310528L, 18226);
                return;
              }
              d.this.wKr.wKs.Dt(paramInt2);
              GMTrace.o(2446252310528L, 18226);
            }
          });
        }
        label880:
        w.e("MicroMsg.ImageGalleryHolderImage", "failed to show downloaded image!");
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 2L, 1L, true);
        label902:
        GMTrace.o(2443702173696L, 18207);
        return;
      }
    }
  }
  
  public final boolean a(j paramj, au paramau, int paramInt)
  {
    GMTrace.i(2441688907776L, 18192);
    super.a(paramj, paramau, paramInt);
    if ((paramj == null) || (paramau == null) || (paramInt < 0))
    {
      GMTrace.o(2441688907776L, 18192);
      return false;
    }
    int i = bl(paramau);
    w.i("MicroMsg.ImageGalleryHolderImage", "filling image : %s position : %s", new Object[] { Integer.valueOf(paramj.wNU.hashCode()), Integer.valueOf(paramInt) });
    j.M(paramj.wNL, 8);
    com.tencent.mm.ao.d locald = f(paramau, false);
    if (locald == null)
    {
      GMTrace.o(2441688907776L, 18192);
      return false;
    }
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(2441688907776L, 18192);
      return true;
      w.i("MicroMsg.ImageGalleryHolderImage", "edw dealDownloadOrSucc");
      w.i("MicroMsg.ImageGalleryHolderImage", "deal LoadFail");
      boolean bool;
      if (paramau.field_isSend == 1) {
        bool = paramau.bTO();
      }
      Object localObject;
      for (;;)
      {
        if (!bool) {
          break label323;
        }
        h(paramau, 5);
        a(paramau, paramj, 5);
        break;
        if (paramau.bTO())
        {
          bool = true;
        }
        else
        {
          localObject = c(paramau, locald);
          if ((locald.IH()) && ((localObject == null) || (!com.tencent.mm.a.e.aZ((String)localObject))))
          {
            bool = true;
          }
          else
          {
            if ((System.currentTimeMillis() - paramau.field_createTime > 259200000L) && ((bg.nm((String)localObject)) || (!com.tencent.mm.a.e.aZ((String)localObject)))) {}
            for (i = 1;; i = 0)
            {
              if (i == 0) {
                break label317;
              }
              bool = true;
              break;
            }
            label317:
            bool = false;
          }
        }
      }
      label323:
      label358:
      long l1;
      long l2;
      if (a(paramj, paramau, locald, paramInt))
      {
        if (locald.IH())
        {
          h(paramau, 4);
          continue;
        }
        h(paramau, 1);
        localObject = n.Ja();
        l1 = locald.gGR;
        l2 = paramau.field_msgId;
        if (paramau.field_isSend != 1) {
          break label477;
        }
      }
      label477:
      for (i = R.g.aVk;; i = R.g.aVi)
      {
        i = ((com.tencent.mm.ao.c)localObject).a(l1, l2, 0, Integer.valueOf(paramInt), i, this, 0);
        w.i("MicroMsg.ImageGalleryHolderImage", "put image download task downloadCode [%d].", new Object[] { Integer.valueOf(i) });
        if (i != -2) {
          break label584;
        }
        w.w("MicroMsg.ImageGalleryHolderImage", "it is already download image finish, but imgInfo is old, search db and repair.");
        locald = f(paramau, true);
        if (locald != null) {
          break label485;
        }
        w.w("MicroMsg.ImageGalleryHolderImage", "get imgInfo by db but it is null.");
        break;
        h(paramau, 2);
        break label358;
      }
      label485:
      if (a(paramj, paramau, locald, paramInt))
      {
        if ((paramau.field_isSend == 1) || (locald.IH())) {
          h(paramau, 4);
        } else {
          h(paramau, 1);
        }
      }
      else
      {
        for (;;)
        {
          w.w("MicroMsg.ImageGalleryHolderImage", "it repair fail show thumb image.ImgInfo[%d, %b]", new Object[] { Long.valueOf(locald.gGR), Boolean.valueOf(locald.IH()) });
          a(paramj, paramau, locald, false, paramInt);
          break;
          h(paramau, 2);
        }
        label584:
        a(paramj, paramau, locald, false, paramInt);
        continue;
        a(paramj, paramau, locald, paramInt);
        continue;
        a(paramj, paramau, locald, false, paramInt);
        continue;
        a(paramj, paramau, locald, true, paramInt);
        continue;
        a(paramau, paramj, i);
        paramj.lFh.invalidate();
      }
    }
  }
  
  public final void af(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2444373262336L, 18212);
    w.i("MicroMsg.ImageGalleryHolderImage", "viewHdImg, pos = " + paramInt);
    Object localObject1 = this.wKr.Dd(paramInt);
    if ((localObject1 == null) || (((ce)localObject1).field_msgId == 0L))
    {
      w.e("MicroMsg.ImageGalleryHolderImage", "msg is null");
      GMTrace.o(2444373262336L, 18212);
      return;
    }
    if (!b.aX((au)localObject1))
    {
      w.e("MicroMsg.ImageGalleryHolderImage", "not img can't download hd");
      GMTrace.o(2444373262336L, 18212);
      return;
    }
    com.tencent.mm.ao.d locald = f((au)localObject1, true);
    if ((locald == null) || (locald.gGR == 0L))
    {
      localObject2 = new StringBuilder("viewHdImg fail, msgLocalId = ");
      if (localObject1 == null)
      {
        localObject1 = "null";
        localObject2 = ((StringBuilder)localObject2).append(localObject1).append(", imgLocalId = ");
        if (locald != null) {
          break label209;
        }
      }
      label209:
      for (localObject1 = "null";; localObject1 = Long.valueOf(locald.gGR))
      {
        w.e("MicroMsg.ImageGalleryHolderImage", localObject1);
        GMTrace.o(2444373262336L, 18212);
        return;
        localObject1 = Long.valueOf(((ce)localObject1).field_msgId);
        break;
      }
    }
    h((au)localObject1, 3);
    if (Db(paramInt) != null) {
      a(Db(paramInt), (au)localObject1, locald, true, false, paramInt);
    }
    if (paramBoolean)
    {
      localObject2 = k.cfV();
      w.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] startScene, msgLoacalID:%d", new Object[] { Long.valueOf(((ce)localObject1).field_msgId) });
      ((k)localObject2).wOc.add(Long.valueOf(((ce)localObject1).field_msgId));
      com.tencent.mm.ao.c localc = n.Ja();
      l1 = locald.gGR;
      l2 = ((ce)localObject1).field_msgId;
      if (((ce)localObject1).field_isSend == 1) {}
      for (i = R.g.aVk;; i = R.g.aVi)
      {
        localc.a(l1, l2, 1, Integer.valueOf(paramInt), i, (c.a)localObject2, 0);
        GMTrace.o(2444373262336L, 18212);
        return;
      }
    }
    Object localObject2 = n.Ja();
    long l1 = locald.gGR;
    long l2 = ((ce)localObject1).field_msgId;
    if (((ce)localObject1).field_isSend == 1) {}
    for (int i = R.g.aVk;; i = R.g.aVi)
    {
      ((com.tencent.mm.ao.c)localObject2).a(l1, l2, 1, Integer.valueOf(paramInt), i, this, 0);
      GMTrace.o(2444373262336L, 18212);
      return;
    }
  }
  
  public final int bl(au paramau)
  {
    GMTrace.i(2441286254592L, 18189);
    if ((paramau != null) && (this.wLK.containsKey(Long.valueOf(paramau.field_msgId))))
    {
      int i = ((Integer)this.wLK.get(Long.valueOf(paramau.field_msgId))).intValue();
      GMTrace.o(2441286254592L, 18189);
      return i;
    }
    GMTrace.o(2441286254592L, 18189);
    return 0;
  }
  
  public final void c(ImageView paramImageView, Bitmap paramBitmap)
  {
    GMTrace.i(2443031085056L, 18202);
    if (paramBitmap == null)
    {
      GMTrace.o(2443031085056L, 18202);
      return;
    }
    if (paramImageView != null)
    {
      int i = paramImageView.hashCode();
      int j = paramBitmap.hashCode();
      int k = this.wLL.lEc.indexOfValue(i);
      if (k >= 0) {
        this.wLL.lEc.removeAt(k);
      }
      this.wLL.lEc.put(j, i);
      if ((paramImageView instanceof MultiTouchImageView))
      {
        b((MultiTouchImageView)paramImageView, paramBitmap);
        GMTrace.o(2443031085056L, 18202);
        return;
      }
      paramImageView.setImageBitmap(paramBitmap);
    }
    GMTrace.o(2443031085056L, 18202);
  }
  
  public final void detach()
  {
    GMTrace.i(2441152036864L, 18188);
    super.detach();
    com.tencent.mm.sdk.b.a.vgX.c(this.wLJ);
    if (this.rJi != null)
    {
      localObject = this.rJi.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Bitmap localBitmap = (Bitmap)((WeakReference)this.rJi.get(((Iterator)localObject).next())).get();
        if ((localBitmap != null) && (!localBitmap.isRecycled()))
        {
          w.i("MicroMsg.ImageGalleryHolderImage", "recycle bitmap:%s", new Object[] { localBitmap.toString() });
          localBitmap.recycle();
        }
      }
    }
    Object localObject = this.wLL;
    ((e)localObject).wLU = null;
    ((e)localObject).lDX.clear();
    ((e)localObject).lEa.clear();
    ((e)localObject).lDZ.clear();
    ((e)localObject).lDY.clear();
    ((e)localObject).aDz();
    n.Ja().a(this);
    localObject = k.cfV();
    if (equals(((k)localObject).wOd)) {
      ((k)localObject).wOd = null;
    }
    GMTrace.o(2441152036864L, 18188);
  }
  
  public final com.tencent.mm.ao.d f(au paramau, boolean paramBoolean)
  {
    GMTrace.i(2441957343232L, 18194);
    if (!b.aX(paramau))
    {
      GMTrace.o(2441957343232L, 18194);
      return null;
    }
    if ((this.wKr == null) || (this.wKr.wKt == null))
    {
      w.e("MicroMsg.ImageGalleryHolderImage", "adapter is null!!");
      GMTrace.o(2441957343232L, 18194);
      return null;
    }
    Object localObject1 = null;
    Object localObject2 = null;
    if (!paramBoolean)
    {
      if (paramau.field_isSend == 1) {
        localObject2 = (com.tencent.mm.ao.d)this.wKr.wKt.wKR.get(Long.valueOf(paramau.field_msgId));
      }
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (paramau.field_msgSvrId > 0L) {
          localObject1 = (com.tencent.mm.ao.d)this.wKr.wKt.wKQ.get(Long.valueOf(paramau.field_msgSvrId));
        }
      }
    }
    localObject2 = localObject1;
    long l;
    if (localObject1 == null)
    {
      int i = 0;
      if (paramau.field_isSend == 1)
      {
        l = paramau.field_msgId;
        localObject2 = n.IZ().aq(l);
        localObject1 = localObject2;
        if (((com.tencent.mm.ao.d)localObject2).gGR != 0L) {}
      }
      else
      {
        l = paramau.field_msgSvrId;
        localObject1 = n.IZ().ap(l);
        i = 1;
      }
      paramau = this.wKr.wKt;
      if (i == 0) {
        break label263;
      }
      paramau.wKQ.put(Long.valueOf(l), localObject1);
    }
    for (localObject2 = localObject1;; localObject2 = localObject1)
    {
      GMTrace.o(2441957343232L, 18194);
      return (com.tencent.mm.ao.d)localObject2;
      label263:
      paramau.wKR.put(Long.valueOf(l), localObject1);
    }
  }
  
  private static final class a
  {
    private static HashMap<String, a> wLT;
    private int gsL;
    private int height;
    private long viQ;
    private int wLQ;
    private String wLR;
    private int wLS;
    private int width;
    
    static
    {
      GMTrace.i(2461016260608L, 18336);
      wLT = new HashMap();
      GMTrace.o(2461016260608L, 18336);
    }
    
    private a()
    {
      GMTrace.i(2460613607424L, 18333);
      this.viQ = 0L;
      this.wLQ = 0;
      this.wLR = "";
      this.wLS = 0;
      GMTrace.o(2460613607424L, 18333);
    }
    
    public static void cZ(String paramString, int paramInt)
    {
      GMTrace.i(2460747825152L, 18334);
      Object localObject;
      try
      {
        boolean bool = bg.nm(paramString);
        if ((bool) || (paramInt == 0))
        {
          GMTrace.o(2460747825152L, 18334);
          return;
        }
        paramString = (a)wLT.get(paramString);
        if (paramString != null) {
          paramString.gsL = paramInt;
        }
        paramString = new HashSet();
        localObject = wLT.keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          a locala = (a)wLT.get(str);
          if (locala != null)
          {
            long l = bg.aH(locala.viQ);
            w.i("MicroMsg.ImageGalleryHolderImage", "dkprog report: diff:%d [%d,%d,%d] succ:%d change:%d str:%s file:%s", new Object[] { Long.valueOf(l), Integer.valueOf(locala.gsL), Integer.valueOf(locala.width), Integer.valueOf(locala.height), Integer.valueOf(locala.wLQ), Integer.valueOf(locala.wLS), locala.wLR, str });
            if (l >= 60000L)
            {
              if ((locala.gsL > 0) && (!bg.nm(locala.wLR))) {
                com.tencent.mm.plugin.report.service.g.ork.i(11713, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(41), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(locala.gsL), Integer.valueOf(locala.width), Integer.valueOf(locala.height), Integer.valueOf(locala.wLQ), Integer.valueOf(locala.wLS), locala.wLR });
              }
              paramString.add(str);
            }
          }
        }
        paramString = paramString.iterator();
      }
      catch (Throwable paramString)
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "get useopt  setTotalLen :%s", new Object[] { bg.f(paramString) });
        GMTrace.o(2460747825152L, 18334);
        return;
      }
      while (paramString.hasNext())
      {
        localObject = (String)paramString.next();
        wLT.remove(localObject);
      }
      GMTrace.o(2460747825152L, 18334);
    }
    
    public static void j(String paramString, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(2460882042880L, 18335);
      try
      {
        boolean bool = bg.nm(paramString);
        if ((bool) || (paramInt1 == 0) || (paramInt2 == 0))
        {
          GMTrace.o(2460882042880L, 18335);
          return;
        }
        a locala2 = (a)wLT.get(paramString);
        a locala1 = locala2;
        if (locala2 == null)
        {
          locala1 = new a();
          locala1.viQ = bg.Pv();
          wLT.put(paramString, locala1);
        }
        locala1.height = paramInt2;
        locala1.width = paramInt1;
        locala1.wLR = (locala1.wLR + paramInt3 + "|");
        if (paramInt3 > 0) {
          if (locala1.wLQ == 0) {
            locala1.wLQ = paramInt3;
          }
        }
        for (;;)
        {
          w.i("MicroMsg.ImageGalleryHolderImage", "dkprog addBit: [%d,%d,%d] succ:%d change:%d str:%s file:%s", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(locala1.wLQ), Integer.valueOf(locala1.wLS), locala1.wLR, paramString });
          GMTrace.o(2460882042880L, 18335);
          return;
          if (locala1.wLQ != 0)
          {
            locala1.wLS += 1;
            locala1.wLQ = 0;
          }
        }
        return;
      }
      catch (Throwable paramString)
      {
        w.e("MicroMsg.ImageGalleryHolderImage", "get useopt  addBit :%s", new Object[] { bg.f(paramString) });
        GMTrace.o(2460882042880L, 18335);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */