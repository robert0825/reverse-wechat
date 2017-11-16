package com.tencent.mm.plugin.favorite.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.y.q;

@a(3)
public class FavOpenApiEntry
  extends MMActivity
{
  private String aEe;
  private String appId;
  private Intent eLY;
  private aj euU;
  private Bundle ler;
  private SendMessageToWX.Req les;
  private String let;
  private int leu;
  
  public FavOpenApiEntry()
  {
    GMTrace.i(6334942543872L, 47199);
    this.leu = 0;
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6317091586048L, 47066);
        if ((FavOpenApiEntry.this.getWindow() == null) || (FavOpenApiEntry.this.getWindow().getDecorView() == null) || (FavOpenApiEntry.this.getWindow().getDecorView().getWindowToken() == null))
        {
          if (FavOpenApiEntry.a(FavOpenApiEntry.this) < 10)
          {
            FavOpenApiEntry.b(FavOpenApiEntry.this);
            GMTrace.o(6317091586048L, 47066);
            return true;
          }
          GMTrace.o(6317091586048L, 47066);
          return false;
        }
        FavOpenApiEntry.a(FavOpenApiEntry.this, FavOpenApiEntry.c(FavOpenApiEntry.this).message);
        GMTrace.o(6317091586048L, 47066);
        return false;
      }
    }, true);
    GMTrace.o(6334942543872L, 47199);
  }
  
  private void B(j paramj)
  {
    GMTrace.i(6335613632512L, 47204);
    tw localtw = new tw();
    localtw.Re(this.appId);
    localtw.zZ(4);
    localtw.QY(q.zE());
    localtw.QZ(q.zE());
    paramj.field_fromUser = localtw.eMI;
    paramj.field_toUser = localtw.toUser;
    paramj.field_favProto.a(localtw);
    GMTrace.o(6335613632512L, 47204);
  }
  
  private o.a a(final WXMediaMessage paramWXMediaMessage)
  {
    GMTrace.i(18031883321344L, 134348);
    paramWXMediaMessage = new o.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(6468220747776L, 48192);
        if (paramAnonymousBoolean)
        {
          FavOpenApiEntry.b(FavOpenApiEntry.this, paramWXMediaMessage);
          paramAnonymousString = ReportUtil.b(FavOpenApiEntry.this.getIntent().getExtras(), 0);
          ReportUtil.a(FavOpenApiEntry.this, paramAnonymousString);
          GMTrace.o(6468220747776L, 48192);
          return;
        }
        FavOpenApiEntry.this.finish();
        ReportUtil.a(FavOpenApiEntry.this, ReportUtil.b(FavOpenApiEntry.this.getIntent().getExtras(), -2));
        GMTrace.o(6468220747776L, 48192);
      }
    };
    GMTrace.o(18031883321344L, 134348);
    return paramWXMediaMessage;
  }
  
  private static th a(WXMediaMessage paramWXMediaMessage, String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(6335747850240L, 47205);
    th localth = new th();
    localth.Qg(paramWXMediaMessage.title);
    localth.Qh(paramWXMediaMessage.description);
    localth.zR(paramInt);
    if (paramString != null)
    {
      localth.Qu(paramString);
      localth.Qq(e.bb(paramString));
      a(paramWXMediaMessage, localth, paramInt);
      GMTrace.o(6335747850240L, 47205);
      return localth;
    }
    paramString = g.n(paramArrayOfByte);
    if (paramArrayOfByte.length >= 256) {
      localth.Qs(paramString);
    }
    for (;;)
    {
      localth.Qr(paramString);
      localth.ey(paramArrayOfByte.length);
      localth.Qt(x.aX(localth.toString(), paramInt));
      e.d(x.g(localth), paramArrayOfByte);
      break;
      byte[] arrayOfByte = new byte['Ā'];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, 256);
      localth.Qs(g.n(arrayOfByte));
    }
  }
  
  private static void a(WXMediaMessage paramWXMediaMessage, j paramj)
  {
    GMTrace.i(6335479414784L, 47203);
    paramj.field_sourceType = 4;
    paramj.field_favProto.QW(paramWXMediaMessage.title);
    paramj.field_favProto.QX(paramWXMediaMessage.description);
    GMTrace.o(6335479414784L, 47203);
  }
  
  private static void a(WXMediaMessage paramWXMediaMessage, th paramth, int paramInt)
  {
    GMTrace.i(6335882067968L, 47206);
    if (paramWXMediaMessage.thumbData != null)
    {
      Object localObject = g.n(paramWXMediaMessage.thumbData);
      paramth.Qw((String)localObject);
      if (paramWXMediaMessage.thumbData.length >= 256) {
        paramth.Qx((String)localObject);
      }
      for (;;)
      {
        if (bg.nm(paramth.lhq)) {
          paramth.Qt(x.aX(paramth.toString(), paramInt));
        }
        paramth.ez(paramWXMediaMessage.thumbData.length);
        e.d(x.h(paramth), paramWXMediaMessage.thumbData);
        GMTrace.o(6335882067968L, 47206);
        return;
        localObject = new byte['Ā'];
        System.arraycopy(paramWXMediaMessage.thumbData, 0, localObject, 0, 256);
        paramth.Qx(g.n((byte[])localObject));
      }
    }
    paramth.kx(true);
    GMTrace.o(6335882067968L, 47206);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6336284721152L, 47209);
    GMTrace.o(6336284721152L, 47209);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6335076761600L, 47200);
    super.onCreate(paramBundle);
    if (this.eLY == null) {
      this.eLY = getIntent();
    }
    this.ler = this.eLY.getExtras();
    this.appId = this.ler.getString("SendAppMessageWrapper_AppId");
    if (this.appId == null) {
      this.appId = Uri.parse(this.ler.getString("_mmessage_content")).getQueryParameter("appid");
    }
    this.les = new SendMessageToWX.Req(this.ler);
    if (this.les.scene != 2)
    {
      w.e("MicroMsg.FavOpenApiEntry", "scene not WXSceneFavorite!");
      finish();
      GMTrace.o(6335076761600L, 47200);
      return;
    }
    this.let = getString(R.l.dsQ);
    paramBundle = c.getAppName(this, this.appId);
    this.aEe = getString(R.l.dix, new Object[] { paramBundle });
    this.euU.z(100L, 100L);
    GMTrace.o(6335076761600L, 47200);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(6335210979328L, 47201);
    super.onNewIntent(paramIntent);
    this.eLY = paramIntent;
    GMTrace.o(6335210979328L, 47201);
  }
  
  protected void onPause()
  {
    GMTrace.i(6336150503424L, 47208);
    super.onPause();
    GMTrace.o(6336150503424L, 47208);
  }
  
  protected void onResume()
  {
    GMTrace.i(6335345197056L, 47202);
    super.onResume();
    GMTrace.o(6335345197056L, 47202);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavOpenApiEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */