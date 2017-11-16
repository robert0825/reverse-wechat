package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;

public final class j
  implements MMActivity.a
{
  public WeakReference<Context> eDN;
  public c gxh;
  public b mCj;
  int rFK;
  boolean rUV;
  int rUW;
  public e rUX;
  public e rUY;
  String rUZ;
  d rVa;
  public b.a rVb;
  public b.a rVc;
  public com.tencent.mm.modelgeo.a.a rVd;
  final Runnable rVe;
  
  j()
  {
    GMTrace.i(12164286906368L, 90631);
    this.rUV = false;
    this.mCj = null;
    this.rVb = null;
    this.rVc = null;
    this.gxh = null;
    this.rVd = null;
    this.rVe = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12261863194624L, 91358);
        if ((j.this.rVd == null) || (j.this.gxh == null))
        {
          GMTrace.o(12261863194624L, 91358);
          return;
        }
        j.this.mCj.a(j.this.rVb);
        j.this.gxh.c(j.this.rVd);
        j.this.rVd.a(false, 0.0F, 0.0F, 0, 0.0D, 0.0D, 0.0D);
        GMTrace.o(12261863194624L, 91358);
      }
    };
    GMTrace.o(12164286906368L, 90631);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12164152688640L, 90630);
    Context localContext = (Context)this.eDN.get();
    if ((this.rVa == null) || (localContext == null)) {}
    for (;;)
    {
      if ((this.rUV) && (this.rVa != null)) {
        this.rVa.yo(this.rFK);
      }
      this.rUV = false;
      this.rUW = com.tencent.mm.pluginsdk.model.a.a.tmB.code;
      this.rUX = null;
      this.rUY = null;
      this.eDN = null;
      this.rVa = null;
      this.rUZ = null;
      this.rVb = null;
      this.rVc = null;
      if ((this.gxh != null) && (this.rVd != null)) {
        this.gxh.c(this.rVd);
      }
      this.gxh = null;
      this.rVd = null;
      if (this.mCj != null)
      {
        if (this.rVb != null) {
          this.mCj.a(this.rVb);
        }
        if (this.rVc != null) {
          this.mCj.a(this.rVc);
        }
      }
      this.mCj = null;
      this.rVb = null;
      this.rVc = null;
      GMTrace.o(12164152688640L, 90630);
      return;
      if (!this.rUV)
      {
        w.e("MicroMsg.OpenMapNavigator", "onActivityResult called without msgId attached...");
      }
      else if (paramInt1 != 33)
      {
        w.e("MicroMsg.OpenMapNavigator", "onActivityResult, mismatched request_code = %d", new Object[] { Integer.valueOf(paramInt1) });
        this.rVa.nM(this.rFK);
      }
      else if ((paramInt2 == 4097) || (paramInt2 == 0))
      {
        this.rVa.yn(this.rFK);
      }
      else if (paramInt2 == -1)
      {
        paramIntent = paramIntent.getStringExtra("selectpkg");
        if (bg.nm(paramIntent))
        {
          w.e("MicroMsg.OpenMapNavigator", "onActivityResult, get null packageName");
          this.rVa.nM(this.rFK);
        }
        else
        {
          if (com.tencent.mm.pluginsdk.model.a.a.tmC.getPackage().equals(paramIntent)) {
            paramIntent = new c();
          }
          for (;;)
          {
            paramIntent.a(localContext, this.rUX, this.rUY, this.rUZ);
            this.rVa.sT(this.rFK);
            break;
            if (com.tencent.mm.pluginsdk.model.a.a.tmE.getPackage().equals(paramIntent)) {
              paramIntent = new a();
            } else if (com.tencent.mm.pluginsdk.model.a.a.tmD.getPackage().equals(paramIntent)) {
              paramIntent = new g();
            } else if (com.tencent.mm.pluginsdk.model.a.a.tmF.getPackage().equals(paramIntent)) {
              paramIntent = new b();
            } else {
              paramIntent = new h();
            }
          }
        }
      }
      else
      {
        w.e("MicroMsg.OpenMapNavigator", "onActivityResult, not support result_code = %d", new Object[] { Integer.valueOf(paramInt2) });
        this.rVa.nM(this.rFK);
      }
    }
  }
  
  public final void bFP()
  {
    Context localContext = null;
    GMTrace.i(12164421124096L, 90632);
    this.rVd = null;
    this.rVb = null;
    this.rVc = null;
    if (this.eDN == null) {}
    while (localContext == null)
    {
      GMTrace.o(12164421124096L, 90632);
      return;
      localContext = (Context)this.eDN.get();
    }
    Intent localIntent = new Intent(localContext, AppChooserUI.class);
    Object localObject = new ArrayList(5);
    ((ArrayList)localObject).add(com.tencent.mm.pluginsdk.model.a.a.tmB.getPackage());
    ((ArrayList)localObject).add(com.tencent.mm.pluginsdk.model.a.a.tmC.getPackage());
    ((ArrayList)localObject).add(com.tencent.mm.pluginsdk.model.a.a.tmD.getPackage());
    ((ArrayList)localObject).add(com.tencent.mm.pluginsdk.model.a.a.tmE.getPackage());
    ((ArrayList)localObject).add(com.tencent.mm.pluginsdk.model.a.a.tmF.getPackage());
    localIntent.putStringArrayListExtra("targetwhitelist", (ArrayList)localObject);
    localObject = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%f,%f", new Object[] { Double.valueOf(this.rUY.latitude), Double.valueOf(this.rUY.longitude) })));
    localIntent.putExtra("targetintent", (Parcelable)localObject);
    Bundle localBundle = new Bundle(2);
    localBundle.putInt("key_map_app", this.rUW);
    localBundle.putParcelable("key_target_intent", (Parcelable)localObject);
    localIntent.putExtra("key_recommend_params", localBundle);
    localIntent.putExtra("type", 2);
    localIntent.putExtra("title", localContext.getString(R.l.dGE));
    ((MMActivity)localContext).a(this, localIntent, 33);
    GMTrace.o(12164421124096L, 90632);
  }
  
  private static final class a
    extends j.f
  {
    public a()
    {
      GMTrace.i(12175024324608L, 90711);
      GMTrace.o(12175024324608L, 90711);
    }
    
    protected final void a(Context paramContext, j.e parame1, j.e parame2, String paramString)
    {
      GMTrace.i(12175158542336L, 90712);
      if (paramContext == null)
      {
        super.a(paramContext, parame1, parame2, paramString);
        GMTrace.o(12175158542336L, 90712);
        return;
      }
      paramString = String.format("baidumap://map/direction?destination=%f,%f&mode=driving", new Object[] { Double.valueOf(parame2.latitude), Double.valueOf(parame2.longitude) });
      parame2 = paramString;
      if (parame1 != null) {
        parame2 = paramString + String.format("origin=%f,%f", new Object[] { Double.valueOf(parame1.latitude), Double.valueOf(parame1.longitude) });
      }
      w.d("MicroMsg.OpenMapNavigator", "url " + parame2);
      try
      {
        paramContext.startActivity(Intent.parseUri(parame2 + "&src=webapp.car.carroutelistmappg.weixindrivenav", 0));
        GMTrace.o(12175158542336L, 90712);
        return;
      }
      catch (URISyntaxException paramContext)
      {
        w.printErrStackTrace("MicroMsg.OpenMapNavigator", paramContext, "", new Object[0]);
        GMTrace.o(12175158542336L, 90712);
      }
    }
    
    protected final String getPackageName()
    {
      GMTrace.i(12175292760064L, 90713);
      String str = com.tencent.mm.pluginsdk.model.a.a.tmE.getPackage();
      GMTrace.o(12175292760064L, 90713);
      return str;
    }
  }
  
  private static final class b
    extends j.f
  {
    public b()
    {
      GMTrace.i(12254615437312L, 91304);
      GMTrace.o(12254615437312L, 91304);
    }
    
    protected final void a(Context paramContext, j.e parame1, j.e parame2, String paramString)
    {
      GMTrace.i(12254749655040L, 91305);
      if (paramContext == null)
      {
        super.a(paramContext, parame1, parame2, paramString);
        GMTrace.o(12254749655040L, 91305);
        return;
      }
      parame1 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=1&style=2", new Object[] { "MicroMessager", Double.valueOf(parame2.latitude), Double.valueOf(parame2.longitude) })));
      parame1.addCategory("android.intent.category.DEFAULT");
      parame1.setPackage(com.tencent.mm.pluginsdk.model.a.a.tmF.getPackage());
      paramContext.startActivity(parame1);
      GMTrace.o(12254749655040L, 91305);
    }
    
    protected final String getPackageName()
    {
      GMTrace.i(15637975924736L, 116512);
      String str = com.tencent.mm.pluginsdk.model.a.a.tmF.getPackage();
      GMTrace.o(15637975924736L, 116512);
      return str;
    }
  }
  
  private static final class c
    extends j.f
  {
    public c()
    {
      GMTrace.i(12247501897728L, 91251);
      GMTrace.o(12247501897728L, 91251);
    }
    
    protected final void a(Context paramContext, j.e parame1, j.e parame2, String paramString)
    {
      GMTrace.i(12247636115456L, 91252);
      if (paramContext == null)
      {
        super.a(paramContext, parame1, parame2, paramString);
        GMTrace.o(12247636115456L, 91252);
        return;
      }
      paramString = String.format("http://maps.google.com/maps?f=d&daddr=%f,%f", new Object[] { Double.valueOf(parame2.latitude), Double.valueOf(parame2.longitude) });
      parame2 = paramString;
      if (parame1 != null) {
        parame2 = paramString + String.format("&saddr=%f,%f", new Object[] { Double.valueOf(parame1.latitude), Double.valueOf(parame1.longitude) });
      }
      parame1 = new Intent("android.intent.action.VIEW", Uri.parse(parame2));
      parame1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
      paramContext.startActivity(parame1);
      GMTrace.o(12247636115456L, 91252);
    }
    
    protected final String getPackageName()
    {
      GMTrace.i(12247770333184L, 91253);
      String str = com.tencent.mm.pluginsdk.model.a.a.tmC.getPackage();
      GMTrace.o(12247770333184L, 91253);
      return str;
    }
  }
  
  static abstract interface d
  {
    public abstract void nM(int paramInt);
    
    public abstract void sT(int paramInt);
    
    public abstract void yn(int paramInt);
    
    public abstract void yo(int paramInt);
  }
  
  private static final class e
  {
    public double latitude;
    public double longitude;
    public String rVh;
    
    public e(double paramDouble1, double paramDouble2)
    {
      GMTrace.i(12254347001856L, 91302);
      this.latitude = paramDouble1;
      this.longitude = paramDouble2;
      this.rVh = null;
      GMTrace.o(12254347001856L, 91302);
    }
  }
  
  private static abstract class f
  {
    public f()
    {
      GMTrace.i(12175963848704L, 90718);
      GMTrace.o(12175963848704L, 90718);
    }
    
    protected void a(Context paramContext, j.e parame1, j.e parame2, String paramString)
    {
      GMTrace.i(12176098066432L, 90719);
      if (paramContext == null)
      {
        GMTrace.o(12176098066432L, 90719);
        return;
      }
      parame1 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + parame2.latitude + "," + parame2.longitude));
      parame1.setPackage(getPackageName());
      parame1.addFlags(268435456);
      paramContext.startActivity(parame1);
      GMTrace.o(12176098066432L, 90719);
    }
    
    protected abstract String getPackageName();
  }
  
  private static final class g
    extends j.f
  {
    public g()
    {
      GMTrace.i(12136503836672L, 90424);
      GMTrace.o(12136503836672L, 90424);
    }
    
    protected final void a(Context paramContext, j.e parame1, j.e parame2, String paramString)
    {
      GMTrace.i(12136638054400L, 90425);
      if (paramContext == null)
      {
        super.a(paramContext, parame1, parame2, paramString);
        GMTrace.o(12136638054400L, 90425);
        return;
      }
      Object localObject = String.format("wechatnav://type=nav&tocoord=%f,%f", new Object[] { Double.valueOf(parame2.latitude), Double.valueOf(parame2.longitude) });
      if (parame1 != null)
      {
        String str = (String)localObject + String.format("&fromcoord=%f,%f", new Object[] { Double.valueOf(parame1.latitude), Double.valueOf(parame1.longitude) });
        localObject = str;
        if (!bg.nm(parame1.rVh)) {
          localObject = str + String.format("&from=%s", new Object[] { URLEncoder.encode(parame1.rVh) });
        }
        parame1 = paramString;
        if (bg.nm(paramString)) {
          if (bg.nm(parame2.rVh)) {
            break label299;
          }
        }
      }
      label299:
      for (parame1 = parame2.rVh;; parame1 = "目的地")
      {
        parame1 = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject + String.format("&to=%s", new Object[] { parame1 })));
        parame1.setPackage(com.tencent.mm.pluginsdk.model.a.a.tmD.getPackage());
        paramContext.startActivity(parame1);
        GMTrace.o(12136638054400L, 90425);
        return;
        localObject = (String)localObject + String.format("&from=%s", new Object[] { "我的位置" });
        break;
      }
    }
    
    protected final String getPackageName()
    {
      GMTrace.i(15625627893760L, 116420);
      String str = com.tencent.mm.pluginsdk.model.a.a.tmD.getPackage();
      GMTrace.o(15625627893760L, 116420);
      return str;
    }
  }
  
  private static final class h
    extends j.f
  {
    public h()
    {
      GMTrace.i(12158515544064L, 90588);
      GMTrace.o(12158515544064L, 90588);
    }
    
    protected final void a(Context paramContext, j.e parame1, j.e parame2, String paramString)
    {
      GMTrace.i(12158649761792L, 90589);
      if (paramContext == null)
      {
        super.a(paramContext, parame1, parame2, paramString);
        GMTrace.o(12158649761792L, 90589);
        return;
      }
      String str2 = String.format("sosomap://type=nav&tocoord=%f,%f", new Object[] { Double.valueOf(parame2.longitude), Double.valueOf(parame2.latitude) });
      String str1 = str2;
      if (parame1 != null)
      {
        str2 = str2 + String.format("fromcoord=%f,%f", new Object[] { Double.valueOf(parame1.longitude), Double.valueOf(parame1.latitude) });
        str1 = str2;
        if (!bg.nm(parame1.rVh)) {
          str1 = str2 + String.format("&from=%s", new Object[] { URLEncoder.encode(parame1.rVh) });
        }
      }
      parame1 = paramString;
      if (bg.nm(paramString)) {
        if (bg.nm(parame2.rVh)) {
          break label289;
        }
      }
      label289:
      for (parame1 = parame2.rVh;; parame1 = "地图选点")
      {
        parame1 = str1 + String.format("&to=%s", new Object[] { URLEncoder.encode(parame1) });
        parame1 = new Intent("android.intent.action.VIEW", Uri.parse(parame1 + "&referer=wx_client"));
        parame1.setPackage(com.tencent.mm.pluginsdk.model.a.a.tmB.getPackage());
        paramContext.startActivity(parame1);
        GMTrace.o(12158649761792L, 90589);
        return;
      }
    }
    
    protected final String getPackageName()
    {
      GMTrace.i(15626030546944L, 116423);
      String str = com.tencent.mm.pluginsdk.model.a.a.tmB.getPackage();
      GMTrace.o(15626030546944L, 116423);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */