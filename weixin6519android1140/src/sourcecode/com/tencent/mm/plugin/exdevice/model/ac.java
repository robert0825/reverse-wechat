package com.tencent.mm.plugin.exdevice.model;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.af.e;
import com.tencent.mm.af.x;
import com.tencent.mm.ao.a.c.g;
import com.tencent.mm.ao.a.d.b;
import com.tencent.mm.at.c;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.io.File;
import java.io.IOException;
import java.util.List;

public final class ac
{
  private Context context;
  public boolean guN;
  private View kAn;
  private TextView kAo;
  private TextView kAp;
  private TextView kAq;
  private TextView kAr;
  private View kAs;
  public boolean kAt;
  public Dialog kAu;
  private int width;
  
  public ac()
  {
    GMTrace.i(10990955528192L, 81889);
    GMTrace.o(10990955528192L, 81889);
  }
  
  public static boolean b(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(10991492399104L, 81893);
    x.FG();
    Object localObject = e.fR(1);
    String str;
    if (((List)localObject).size() > 0)
    {
      localObject = (String)((List)localObject).get(0);
      WXImageObject localWXImageObject = new WXImageObject();
      localWXImageObject.setImagePath(paramString2);
      str = r.fs((String)localObject);
      WXMediaMessage localWXMediaMessage = new WXMediaMessage();
      localWXMediaMessage.mediaObject = localWXImageObject;
      localWXMediaMessage.title = str;
      localWXMediaMessage.description = paramString4;
      localWXMediaMessage.setThumbImage(d.decodeFile(paramString2, null));
      paramString2 = new oj();
      paramString2.eTm.eLU = localWXMediaMessage;
      paramString2.eTm.appId = "wx7fa037cc7dfabad5";
      paramString2.eTm.appName = paramContext.getString(R.l.dsd);
      paramString2.eTm.toUser = paramString1;
      paramString2.eTm.eTn = 2;
      if (!bg.nm((String)localObject)) {
        break label259;
      }
      paramString2.eTm.eTq = null;
    }
    for (;;)
    {
      boolean bool = com.tencent.mm.sdk.b.a.vgX.m(paramString2);
      if (!bg.nm(paramString3))
      {
        paramContext = new ol();
        paramContext.eTx.eTy = paramString1;
        paramContext.eTx.content = paramString3;
        paramContext.eTx.type = s.go(paramString1);
        paramContext.eTx.flags = 0;
        com.tencent.mm.sdk.b.a.vgX.m(paramContext);
      }
      GMTrace.o(10991492399104L, 81893);
      return bool;
      localObject = null;
      break;
      label259:
      paramString2.eTm.eTo = ((String)localObject);
      paramString2.eTm.eTp = str;
    }
  }
  
  public static final String cj(Context paramContext)
  {
    GMTrace.i(10991089745920L, 81890);
    paramContext = new File(paramContext.getCacheDir(), "sport_share_bitmap.jpg").getAbsolutePath();
    GMTrace.o(10991089745920L, 81890);
    return paramContext;
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, final a parama)
  {
    GMTrace.i(10991223963648L, 81891);
    if (this.kAt)
    {
      GMTrace.o(10991223963648L, 81891);
      return;
    }
    this.kAt = true;
    this.guN = false;
    if ((this.kAu == null) && (!bg.nm(paramString3)))
    {
      paramContext.getString(R.l.cUG);
      this.kAu = h.a(paramContext, paramContext.getString(R.l.drX), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(10978607497216L, 81797);
          ac.this.guN = true;
          GMTrace.o(10978607497216L, 81797);
        }
      });
      this.kAu.show();
    }
    this.context = paramContext;
    this.width = 1280;
    if (this.width > com.tencent.mm.br.a.ef(paramContext)) {
      this.width = com.tencent.mm.br.a.ef(paramContext);
    }
    this.kAn = LayoutInflater.from(paramContext).inflate(R.i.cwh, null);
    this.kAo = ((TextView)this.kAn.findViewById(R.h.bxM));
    this.kAp = ((TextView)this.kAn.findViewById(R.h.bxK));
    this.kAq = ((TextView)this.kAn.findViewById(R.h.bxU));
    this.kAr = ((TextView)this.kAn.findViewById(R.h.bxT));
    this.kAs = this.kAn.findViewById(R.h.bgr);
    this.kAo.setText(paramString1);
    this.kAq.setText(paramString2);
    a.b.a((ImageView)this.kAn.findViewById(R.h.bfl), q.zE(), 0.5F, false);
    paramContext = (ImageView)this.kAn.findViewById(R.h.bgp);
    paramString1 = new RelativeLayout.LayoutParams(-1, -1);
    this.kAn.setLayoutParams(paramString1);
    this.kAn.measure(View.MeasureSpec.makeMeasureSpec(this.width, 1073741824), View.MeasureSpec.makeMeasureSpec(this.width, 1073741824));
    this.kAn.layout(0, 0, this.width, this.width);
    if (!bg.nm(paramString3))
    {
      ad.atU().a(paramString3, paramContext, new g()
      {
        public final void a(String paramAnonymousString, View paramAnonymousView, b paramAnonymousb)
        {
          GMTrace.i(10955522048000L, 81625);
          if (ac.this.guN)
          {
            ac.this.kAt = false;
            GMTrace.o(10955522048000L, 81625);
            return;
          }
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(10987600084992L, 81864);
              if (ac.this.kAu.isShowing()) {
                ac.this.kAu.dismiss();
              }
              GMTrace.o(10987600084992L, 81864);
            }
          });
          paramAnonymousString = ac.this.v(paramAnonymousb.bitmap);
          parama.wH(paramAnonymousString);
          ac.this.kAt = false;
          GMTrace.o(10955522048000L, 81625);
        }
        
        public final void ku(String paramAnonymousString)
        {
          GMTrace.i(10955387830272L, 81624);
          GMTrace.o(10955387830272L, 81624);
        }
      });
      GMTrace.o(10991223963648L, 81891);
      return;
    }
    paramContext.setImageResource(R.e.aNq);
    parama.wH(v(null));
    this.kAt = false;
    GMTrace.o(10991223963648L, 81891);
  }
  
  public final String v(final Bitmap paramBitmap)
  {
    GMTrace.i(10991358181376L, 81892);
    if (paramBitmap != null) {
      paramBitmap = c.o(paramBitmap);
    }
    for (;;)
    {
      Object localObject = new ShapeDrawable.ShaderFactory()
      {
        public final Shader resize(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(10969614909440L, 81730);
          float f = paramAnonymousInt2;
          paramAnonymousInt1 = paramBitmap[0];
          Object localObject = Shader.TileMode.REPEAT;
          localObject = new LinearGradient(0.0F, 0.0F, 0.0F, f, new int[] { 0, paramAnonymousInt1 }, new float[] { 0.0F, 1.0F }, (Shader.TileMode)localObject);
          GMTrace.o(10969614909440L, 81730);
          return (Shader)localObject;
        }
      };
      PaintDrawable localPaintDrawable = new PaintDrawable();
      localPaintDrawable.setShape(new RectShape());
      localPaintDrawable.setShaderFactory((ShapeDrawable.ShaderFactory)localObject);
      this.kAs.setBackgroundDrawable(localPaintDrawable);
      this.kAo.setTextColor(paramBitmap[1]);
      this.kAp.setTextColor(paramBitmap[1]);
      this.kAq.setTextColor(paramBitmap[1]);
      this.kAr.setTextColor(paramBitmap[1]);
      paramBitmap = Bitmap.createBitmap(this.width, this.width, Bitmap.Config.ARGB_8888);
      localObject = new Canvas(paramBitmap);
      this.kAn.draw((Canvas)localObject);
      localObject = new File(cj(this.context));
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      try
      {
        d.a(paramBitmap, 100, Bitmap.CompressFormat.JPEG, ((File)localObject).getAbsolutePath(), true);
        paramBitmap = ((File)localObject).getAbsolutePath();
        GMTrace.o(10991358181376L, 81892);
        return paramBitmap;
        paramBitmap = new int[2];
        Bitmap tmp194_193 = paramBitmap;
        tmp194_193[0] = -1;
        Bitmap tmp198_194 = tmp194_193;
        tmp198_194[1] = -16777216;
        tmp198_194;
      }
      catch (IOException paramBitmap)
      {
        for (;;) {}
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void wH(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */