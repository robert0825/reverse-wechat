package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.a;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.c;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AppBrandCameraView
  extends RelativeLayout
  implements AppBrandPageView.b, AppBrandPageView.c, AppBrandPageView.d
{
  private ImageView eId;
  String hyD;
  String idA;
  boolean idB;
  private boolean idC;
  private int idD;
  private int idE;
  private int idF;
  private int idG;
  c idH;
  b idI;
  MMSightRecordView idJ;
  private String idK;
  private String idL;
  private String idM;
  int idN;
  boolean idO;
  long idP;
  long idQ;
  MMSightRecordView.a idR;
  AppBrandPageView idw;
  int idx;
  private String idy;
  String idz;
  Context mContext;
  
  public AppBrandCameraView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(19839393464320L, 147815);
    this.idy = "back";
    this.idz = "auto";
    this.idA = "high";
    this.idC = false;
    this.idD = 1080;
    this.idE = 1920;
    this.idF = 1080;
    this.idG = 1920;
    this.idN = -1;
    this.idO = false;
    this.idP = -1L;
    this.idQ = -1L;
    this.idR = new MMSightRecordView.a() {};
    init(paramContext);
    GMTrace.o(19839393464320L, 147815);
  }
  
  public AppBrandCameraView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19839527682048L, 147816);
    this.idy = "back";
    this.idz = "auto";
    this.idA = "high";
    this.idC = false;
    this.idD = 1080;
    this.idE = 1920;
    this.idF = 1080;
    this.idG = 1920;
    this.idN = -1;
    this.idO = false;
    this.idP = -1L;
    this.idQ = -1L;
    this.idR = new MMSightRecordView.a() {};
    init(paramContext);
    GMTrace.o(19839527682048L, 147816);
  }
  
  public AppBrandCameraView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(19839661899776L, 147817);
    this.idy = "back";
    this.idz = "auto";
    this.idA = "high";
    this.idC = false;
    this.idD = 1080;
    this.idE = 1920;
    this.idF = 1080;
    this.idG = 1920;
    this.idN = -1;
    this.idO = false;
    this.idP = -1L;
    this.idQ = -1L;
    this.idR = new MMSightRecordView.a() {};
    init(paramContext);
    GMTrace.o(19839661899776L, 147817);
  }
  
  private void WA()
  {
    GMTrace.i(19841138294784L, 147828);
    w.i("MicroMsg.AppBrandCameraView", "initCamera.");
    if (!a.a.idv.Wy())
    {
      Toast.makeText(this.mContext, o.i.hGW, 1).show();
      w.w("MicroMsg.AppBrandCameraView", "no permission");
      GMTrace.o(19841138294784L, 147828);
      return;
    }
    if (this.idJ != null)
    {
      w.i("MicroMsg.AppBrandCameraView", "initCamera recordView not null.");
      GMTrace.o(19841138294784L, 147828);
      return;
    }
    if (this.eId == null)
    {
      this.eId = new ImageView(this.mContext);
      this.eId.setScaleType(ImageView.ScaleType.FIT_XY);
      addView(this.eId, new ViewGroup.LayoutParams(-1, -1));
    }
    for (;;)
    {
      this.idJ = new MMSightRecordView(this.mContext);
      addView(this.idJ);
      this.idJ.hU(720);
      this.idJ.mXc.Rt();
      this.idJ.M(this.idD * 1.0F / this.idE);
      this.idJ.qG(600000);
      this.idJ.nH(this.idK);
      this.idJ.aOQ();
      this.idJ.aOP();
      MMSightRecordView localMMSightRecordView = this.idJ;
      boolean bool = "back".equals(this.idy);
      localMMSightRecordView.mXc.bR(bool);
      this.idJ.mXc.startPreview();
      this.idJ.mXc.Rk();
      localMMSightRecordView = this.idJ;
      MMSightRecordView.c local2 = new MMSightRecordView.c()
      {
        public final void WG()
        {
          GMTrace.i(19838319722496L, 147807);
          w.w("MicroMsg.AppBrandCameraView", "InitErrorCallback");
          Object localObject = new HashMap();
          ((Map)localObject).put("cameraId", Integer.valueOf(AppBrandCameraView.b(AppBrandCameraView.this)));
          localObject = new JSONObject((Map)localObject).toString();
          com.tencent.mm.plugin.appbrand.jsapi.e locale = new d().a(AppBrandCameraView.c(AppBrandCameraView.this));
          locale.mData = ((String)localObject);
          locale.VR();
          GMTrace.o(19838319722496L, 147807);
        }
      };
      localMMSightRecordView.mXc.a(local2);
      this.idN = 1;
      GMTrace.o(19841138294784L, 147828);
      return;
      this.eId.setImageBitmap(null);
    }
  }
  
  private void WC()
  {
    GMTrace.i(19841406730240L, 147830);
    this.idM = (com.tencent.mm.compatible.util.e.fRZ + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" }));
    GMTrace.o(19841406730240L, 147830);
  }
  
  private void WD()
  {
    GMTrace.i(19841540947968L, 147831);
    String str = "MicroMsg_" + System.currentTimeMillis();
    this.idK = (com.tencent.mm.compatible.util.e.fRZ + str + ".mp4");
    this.idL = (com.tencent.mm.compatible.util.e.fRZ + str + ".jpeg");
    if (this.idJ != null) {
      this.idJ.nH(this.idK);
    }
    GMTrace.o(19841540947968L, 147831);
  }
  
  private boolean a(Bitmap paramBitmap, String paramString)
  {
    GMTrace.i(19842212036608L, 147836);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled())) {
      try
      {
        int i = paramBitmap.getWidth();
        int j = paramBitmap.getHeight();
        Bitmap localBitmap = paramBitmap;
        if (i != 0)
        {
          localBitmap = paramBitmap;
          if (j != 0)
          {
            if (!"normal".equals(this.idA)) {
              break label141;
            }
            localBitmap = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, j * 2 / 3, i * 2 / 3, false, true);
          }
        }
        for (;;)
        {
          this.idF = localBitmap.getWidth();
          this.idG = localBitmap.getHeight();
          com.tencent.mm.sdk.platformtools.d.a(localBitmap, 90, Bitmap.CompressFormat.JPEG, paramString, false);
          w.i("MicroMsg.AppBrandCameraView", "bitmap filelen %s", new Object[] { Long.valueOf(FileOp.kX(paramString)) });
          GMTrace.o(19842212036608L, 147836);
          return true;
          label141:
          localBitmap = paramBitmap;
          if ("low".equals(this.idA)) {
            localBitmap = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, j / 2, i / 2, false, true);
          }
        }
        GMTrace.o(19842212036608L, 147836);
      }
      catch (Exception paramBitmap)
      {
        w.e("MicroMsg.AppBrandCameraView", "error for saveBitmapToImage %s", new Object[] { paramBitmap.getMessage() });
      }
    }
    return false;
  }
  
  private void b(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(19842077818880L, 147835);
    if (this.idH != null) {
      this.idH.b(paramInt, paramString1, qs(paramString2), qs(paramString3));
    }
    WE();
    GMTrace.o(19842077818880L, 147835);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(19839796117504L, 147818);
    this.mContext = paramContext;
    LayoutInflater.from(paramContext).inflate(o.g.hCM, this);
    GMTrace.o(19839796117504L, 147818);
  }
  
  private String qs(String paramString)
  {
    GMTrace.i(19841004077056L, 147827);
    if (bg.nm(paramString))
    {
      GMTrace.o(19841004077056L, 147827);
      return paramString;
    }
    paramString = com.tencent.mm.plugin.appbrand.appstorage.c.c(this.hyD, paramString, false);
    if (paramString != null)
    {
      paramString = paramString.eHy;
      GMTrace.o(19841004077056L, 147827);
      return paramString;
    }
    GMTrace.o(19841004077056L, 147827);
    return null;
  }
  
  public final void M(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19840064552960L, 147820);
    if (bg.eW(this.idy, paramString))
    {
      GMTrace.o(19840064552960L, 147820);
      return;
    }
    this.idy = paramString;
    if ((!paramBoolean) && (this.idJ != null)) {
      this.idJ.mXc.switchCamera();
    }
    GMTrace.o(19840064552960L, 147820);
  }
  
  public final void MP()
  {
    GMTrace.i(19839930335232L, 147819);
    w.i("MicroMsg.AppBrandCameraView", "initView");
    if (!a.a.idv.Wy())
    {
      GMTrace.o(19839930335232L, 147819);
      return;
    }
    WD();
    WC();
    WA();
    WB();
    GMTrace.o(19839930335232L, 147819);
  }
  
  public final void WB()
  {
    GMTrace.i(19841272512512L, 147829);
    if (this.idJ == null)
    {
      w.i("MicroMsg.AppBrandCameraView", "recordView is null");
      GMTrace.o(19841272512512L, 147829);
      return;
    }
    if (this.idB) {
      this.idJ.a(this.idR);
    }
    for (;;)
    {
      WE();
      GMTrace.o(19841272512512L, 147829);
      return;
      this.idJ.a(null);
    }
  }
  
  public final void WE()
  {
    GMTrace.i(19841675165696L, 147832);
    if ((this.idJ == null) || (this.idz == null))
    {
      GMTrace.o(19841675165696L, 147832);
      return;
    }
    if (this.idN != 2)
    {
      if (this.idJ.mXc.Rr() == 1) {
        this.idJ.hV(2);
      }
      if (this.idz.equals("auto"))
      {
        this.idJ.hV(3);
        GMTrace.o(19841675165696L, 147832);
      }
    }
    else
    {
      if (this.idz.equals("on"))
      {
        this.idJ.hV(1);
        GMTrace.o(19841675165696L, 147832);
        return;
      }
      this.idJ.hV(2);
    }
    GMTrace.o(19841675165696L, 147832);
  }
  
  public final void Wb()
  {
    GMTrace.i(19840467206144L, 147823);
    w.i("MicroMsg.AppBrandCameraView", "onUIPause");
    if (this.idN == 2)
    {
      w.d("MicroMsg.AppBrandCameraView", "onStopRecord fromOnPause");
      localObject = new HashMap();
      ((Map)localObject).put("cameraId", Integer.valueOf(this.idx));
      ((Map)localObject).put("errMsg", "stop on record");
      localObject = new JSONObject((Map)localObject).toString();
      locale = new g().a(this.idw);
      locale.mData = ((String)localObject);
      locale.VR();
    }
    if (this.idJ != null)
    {
      localObject = this.idJ.mXc.Ru();
      if (localObject != null) {
        this.eId.setImageBitmap((Bitmap)localObject);
      }
    }
    release();
    Object localObject = new HashMap();
    ((Map)localObject).put("cameraId", Integer.valueOf(this.idx));
    localObject = new JSONObject((Map)localObject).toString();
    com.tencent.mm.plugin.appbrand.jsapi.e locale = new e().a(this.idw);
    locale.mData = ((String)localObject);
    locale.VR();
    GMTrace.o(19840467206144L, 147823);
  }
  
  public final void Wz()
  {
    GMTrace.i(19840601423872L, 147824);
    w.i("MicroMsg.AppBrandCameraView", "onUIResume");
    try
    {
      WA();
      GMTrace.o(19840601423872L, 147824);
      return;
    }
    finally {}
  }
  
  public final boolean bq(int paramInt1, int paramInt2)
  {
    GMTrace.i(19840332988416L, 147822);
    if ((this.idD == paramInt1) && (this.idE == paramInt2))
    {
      GMTrace.o(19840332988416L, 147822);
      return false;
    }
    w.i("MicroMsg.AppBrandCameraView", "setViewSize");
    this.idD = paramInt1;
    this.idE = paramInt2;
    GMTrace.o(19840332988416L, 147822);
    return true;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19840735641600L, 147825);
    release();
    GMTrace.o(19840735641600L, 147825);
  }
  
  public final void pL()
  {
    GMTrace.i(19841943601152L, 147834);
    w.i("MicroMsg.AppBrandCameraView", "stopRecord");
    if (this.idJ == null)
    {
      w.i("MicroMsg.AppBrandCameraView", "recordView is null");
      b(-1, "camera is null", null, null);
      GMTrace.o(19841943601152L, 147834);
      return;
    }
    if (this.idN != 2)
    {
      w.w("MicroMsg.AppBrandCameraView", "stopRecord is not recording!!");
      b(-1, "is not recording", null, null);
      GMTrace.o(19841943601152L, 147834);
      return;
    }
    if (this.idC)
    {
      w.i("MicroMsg.AppBrandCameraView", "recordView is IsStopping");
      b(-1, "is stopping", null, null);
      GMTrace.o(19841943601152L, 147834);
      return;
    }
    this.idC = true;
    this.idJ.a(new MMSightRecordView.f()
    {
      public final void ce(boolean paramAnonymousBoolean)
      {
        GMTrace.i(19839259246592L, 147814);
        w.i("MicroMsg.AppBrandCameraView", "onRecordFinish error %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (AppBrandCameraView.d(AppBrandCameraView.this) == null)
        {
          w.i("MicroMsg.AppBrandCameraView", "onRecordFinish recordView is null");
          AppBrandCameraView.a(AppBrandCameraView.this, -1, "camera is null", null, null);
          GMTrace.o(19839259246592L, 147814);
          return;
        }
        AppBrandCameraView.this.idN = 1;
        if (paramAnonymousBoolean) {
          AppBrandCameraView.a(AppBrandCameraView.this, -1, "stop error", null, null);
        }
        for (;;)
        {
          AppBrandCameraView.h(AppBrandCameraView.this);
          AppBrandCameraView.i(AppBrandCameraView.this);
          GMTrace.o(19839259246592L, 147814);
          return;
          Bitmap localBitmap = com.tencent.mm.plugin.sight.base.d.O(AppBrandCameraView.d(AppBrandCameraView.this).mXc.Rj(), AppBrandCameraView.e(AppBrandCameraView.this), AppBrandCameraView.f(AppBrandCameraView.this));
          AppBrandCameraView.a(AppBrandCameraView.this, localBitmap, AppBrandCameraView.g(AppBrandCameraView.this));
          AppBrandCameraView.a(AppBrandCameraView.this, 0, "", AppBrandCameraView.g(AppBrandCameraView.this), AppBrandCameraView.d(AppBrandCameraView.this).mXc.Rj());
        }
      }
    });
    GMTrace.o(19841943601152L, 147834);
  }
  
  public final void qr(String paramString)
  {
    GMTrace.i(19840198770688L, 147821);
    if (bg.eW(this.idz, paramString))
    {
      GMTrace.o(19840198770688L, 147821);
      return;
    }
    this.idz = paramString;
    GMTrace.o(19840198770688L, 147821);
  }
  
  public final void release()
  {
    GMTrace.i(19840869859328L, 147826);
    w.i("MicroMsg.AppBrandCameraView", "release");
    try
    {
      if (this.idJ != null)
      {
        this.idJ.mXc.release();
        removeView(this.idJ);
        this.idN = -1;
        this.idJ = null;
      }
      GMTrace.o(19840869859328L, 147826);
      return;
    }
    finally {}
  }
  
  final void x(int paramInt, String paramString)
  {
    GMTrace.i(19841809383424L, 147833);
    if (this.idH != null) {
      this.idH.x(paramInt, paramString);
    }
    GMTrace.o(19841809383424L, 147833);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\camera\AppBrandCameraView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */